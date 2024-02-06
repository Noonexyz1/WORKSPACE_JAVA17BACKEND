package com.app.service;

import com.app.controller.dto.EmployeeDTO;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.persistence.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        /*Para funcionar ModelMapper, del DTO al Entity, solo se mapeara los atributos cuyos nombre sean iguales
        si en el caso de que uno varie en nombre, puedo estableser a mano con los sets() del Entity */
        Employee employeeMapper = modelMapper.map(employeeDTO, Employee.class);
        return this.employeeRepository.save(employeeMapper);
    }

}
