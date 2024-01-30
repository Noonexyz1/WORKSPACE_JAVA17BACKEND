package com.jpa.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;


    //Este atributo no se esta mapeando =)
    @OneToMany(mappedBy = "eDepartment")    //"eDepartment" es la columna fk que tendra Employee
    private List<Employee> employeelist;

    public Department(Long id, String name, List<Employee> employeelist) {
        this.id = id;
        this.name = name;
        this.employeelist = employeelist;
    }

    public Department(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<Employee> employeelist) {
        this.employeelist = employeelist;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeelist=" + employeelist +
                '}';
    }
}
