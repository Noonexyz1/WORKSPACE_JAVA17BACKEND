package com.relaciones2.demo2;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eId;
    private String eNombre;
    private Long eEdad;


    @ManyToMany
    @JoinTable(
            name = "estuuuuuuuuuuu_curso",    //Esto sera el nombre de la tabla de la union
            joinColumns = {@JoinColumn(name = "fk_estudiante")},
            inverseJoinColumns = {@JoinColumn(name = "fk_curso")}
    )
    private Set<Curso> eCursos;


}
