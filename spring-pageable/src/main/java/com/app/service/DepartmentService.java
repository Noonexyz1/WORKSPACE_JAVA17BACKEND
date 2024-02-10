package com.app.service;

import com.app.entities.Department;
import com.app.persistence.DepartmentRepository;
import org.hibernate.type.SortedSetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        List<Department> listaDepartment = departmentRepository.findAll();
        return listaDepartment;
    }


    public List<Department> getAllDepartmentsByCity() {
        Sort criterio = Sort.by(Sort.Direction.ASC, "name");
        Pageable primeraPaginaConDosElementos = PageRequest.of(0, 20, criterio);
        
        // el método findAllByCity() primero aplicará el filtro para obtener todas las filas que tengan "Medellin" como
        // ciudad y luego aplicará el criterio de ordenamiento ascendente por el campo "name". Por lo tanto, obtendrás
        // una lista de todos los departamentos que tienen "Medellin" como ciudad, ordenados alfabéticamente por el
        // nombre del departamento.
        List<Department> listaDepartment = departmentRepository.findAllByCity("Medellin", primeraPaginaConDosElementos);
        return listaDepartment;
    }


    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long id, Department departmentDetails) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + id));
        department.setName(departmentDetails.getName());
        department.setCity(departmentDetails.getCity());
        return departmentRepository.save(department);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
