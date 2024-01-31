package com.relaciones2.demo2;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
    private String cNombre;

    @ManyToMany(mappedBy = "eCursos")  // eCursos es el nombre del Set en la clase Estudiante
    private Set<Estudiante> cEstudiantes;

}
