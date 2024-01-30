package com.jpa.demo;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eId;
    private String eName;
    private double eSalary;
    private String eDeg;



    @ManyToOne  //Tiene que ser si o si  @ManyToOne
    @JoinColumn(name = "dep_id_fk") //"dep_id_fk" es la columna de llaves foraneas
    private Department eDepartment; //Esto no se mapea en la BD
    //Estamos diciendo que "dep_id_fk" tomara el lugar de eDepartment en la BD
    //Pero en los objetos, los necesitamos


    public Employee(Long eId, String eName, double eSalary, String eDeg, Department eDepartment) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eDeg = eDeg;
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

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public String geteDeg() {
        return eDeg;
    }

    public void seteDeg(String eDeg) {
        this.eDeg = eDeg;
    }

    public Department geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(Department eDepartment) {
        this.eDepartment = eDepartment;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                ", eDeg='" + eDeg + '\'' +
                ", eDepartment=" + eDepartment +
                '}';
    }

}
