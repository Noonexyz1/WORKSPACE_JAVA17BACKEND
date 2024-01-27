package org.example;

import jdk.jshell.Snippet;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data   //resume todos los metodos de lombock y unicamente un constructor vacio.
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //todos los atributos son privados
//@Builder //se genera una clase dentro de una clase, patron builder, siempre es public
//@Builder(builderMethodName = "crearEsteObetjojajjaja")
@Builder(builderClassName = "CmabioNombreClaseBuilder")
public class Person2 {
    Long id;
    public String name;
    String lastName;
    public String email;
    Integer age;
    @Setter //tambien se puede en atributos
    Integer phoneNumber;
    LocalDate dateOfBirth;

}