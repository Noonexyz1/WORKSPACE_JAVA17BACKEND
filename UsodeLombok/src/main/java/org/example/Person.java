package org.example;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Setter(value = AccessLevel.PUBLIC) //por defecto son public
@Getter(value = AccessLevel.PUBLIC) //por defecto son public
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(staticName = "nombreMEtodoACrear")
//esto es un constructor de fabrica, un metodo estatico que retorna un objeto Person
//@NoArgsConstructor quitamos esto porque los atribb son final
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true) //todos los atributos son privados
//@ToString(exclude = {"name", "age"})
//@ToString(includeFieldNames = false)    //para mostrar solamente los valores y no los campos
@ToString(of = {"id", "name"})    //para mostrar solamente dos o 3 valores de Person
//@ToString(callSuper = true) //llamara para mostrar tambien los atributos de los padres en herncia
//@EqualsAndHashCode(exclude = {"id", "name"})
//@EqualsAndHashCode(of = {"id", "name"})
@EqualsAndHashCode(doNotUseGetters = true) //no usar los metodos get y set para crear estos metodos
public class Person {
    Long id;
    public String name;
    String lastName;
    public final String email;
    Integer age;
    @Setter //tambien se puede en atributos
    Integer phoneNumber;
    LocalDate dateOfBirth;






}