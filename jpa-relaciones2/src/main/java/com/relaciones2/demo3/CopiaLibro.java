package com.relaciones2.demo3;

import jakarta.persistence.*;

@Entity
public class CopiaLibro {

    @Id
    private Long idCopiaLibro;
    private int numCopiaLibro;

    //Este es el lado no propietario
   @ManyToOne
    private Libro libroCopia;


}
