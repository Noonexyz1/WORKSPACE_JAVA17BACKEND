package com.relaciones2.demo;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eId;
    private String eName;
    private Double eSalary;
    private String eCargo;

    //Digamos que un empleado tiene solamente un departamento
    @OneToOne
    private Department eDepartment;


}
