package com.app.controller;

import com.app.entities.Department;
import com.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentRepository;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentRepository.getAllDepartments();
    }
    @GetMapping("/rowsbycity")
    public List<Department> getAllDepartmentsByCity() {
        return departmentRepository.getAllDepartmentsByCity();
    }

    @GetMapping("/departments/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id) {
        return departmentRepository.getDepartmentById(id);
    }

    @PostMapping(value = "/departments", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.createDepartment(department);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department departmentDetails) {
        Department department = departmentRepository.getDepartmentById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + id));
        department.setName(departmentDetails.getName());
        department.setCity(departmentDetails.getCity());
        return departmentRepository.createDepartment(department);
    }

    @DeleteMapping("/departments/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentRepository.deleteDepartment(id);
    }
}
