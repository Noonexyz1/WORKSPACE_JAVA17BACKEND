package com.jpa;

import com.jpa.demo.Department;
import com.jpa.demo.DepartmentRepository;
import com.jpa.demo.Employee;
import com.jpa.demo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Ejecutar implements CommandLineRunner {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;

    @Autowired  //Esto me permite hacer pruebas y es demaciado utilizado
    public Ejecutar(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Creacion de varios Departamentos;
        Department department1 = new Department(null, "Desarrollo", null);
        Department department2 = new Department(null, "Pruebas", null);
        Department department3 = new Department(null, "Analisis", null);
        Department department4 = new Department(null, "Finanazas", null);
        Department department5 = new Department(null, "Recursos", null);

        departmentRepository.save(department1);
        departmentRepository.save(department2);
        departmentRepository.save(department3);
        departmentRepository.save(department4);
        departmentRepository.save(department5);

        Employee employee1 = new Employee(null, "Diego", 126.124, "asdf", department1);
        Employee employee2 = new Employee(null, "Jose", 3426.124, "asdf", department1);
        Employee employee3 = new Employee(null, "Maria", 46.124, "asdf", department3);
        Employee employee4 = new Employee(null, "Carlos", 246.124, "asdf", department4);
        Employee employee5 = new Employee(null, "Juana", 726.124, "asdf", department5);
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        employeeRepository.save(employee4);
        employeeRepository.save(employee5);


    }

}
