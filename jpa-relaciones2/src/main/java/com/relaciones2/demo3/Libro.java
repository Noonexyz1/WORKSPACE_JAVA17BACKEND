package com.relaciones2.demo3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Libro {

    @Id
    private Long idLibro;
    private String nombreLibro;


    //MappedBy es porque este lado es el lado propietario.
    //Cuando usas mappedBy, estás diciendo que la clave foránea está en la otra entidad. Esto significa
    // que no se crea ninguna columna adicional en la tabla Libro en la base de datos. En cambio, se crea una
    // columna en la tabla CopiaLibro que hace referencia al idLibro en la tabla Libro.
    @OneToMany(mappedBy = "libroCopia")
    private Set<CopiaLibro> copiasLibro;

}
