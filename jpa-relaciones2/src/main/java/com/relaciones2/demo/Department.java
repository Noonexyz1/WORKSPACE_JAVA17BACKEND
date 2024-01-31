package com.relaciones2.demo;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dId;
    private String dName;

    @OneToOne(mappedBy = "eDepartment")
    private Employee dEmployee;


}
