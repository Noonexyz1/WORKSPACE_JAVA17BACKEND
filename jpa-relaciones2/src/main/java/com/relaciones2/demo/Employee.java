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


    public Employee(Long eId, String eName, Double eSalary, String eCargo, Department eDepartment) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eCargo = eCargo;
        this.eDepartment = eDepartment;
    }

    public Employee(){}


    public Long geteId() {
        return eId;
    }

    public void seteId(Long eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Double geteSalary() {
        return eSalary;
    }

    public void seteSalary(Double eSalary) {
        this.eSalary = eSalary;
    }

    public String geteCargo() {
        return eCargo;
    }

    public void seteCargo(String eCargo) {
        this.eCargo = eCargo;
    }

    public Department geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(Department eDepartment) {
        this.eDepartment = eDepartment;
    }



}
