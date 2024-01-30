package org.example;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.time.LocalDate;

//@Log //traer un objeto Logger de JAva "log"
@Slf4j  //usaremos otra libreria mejor para los logs, la libreria Logback Classic
public class Main {

    //@SneakyThrows //lombok se encargara de propagar la exception y lo reportara a la clse quesea necesarria
                    //asi ya no tenemos que hacer trychath o lanar throws en la firma del metodo
    @SneakyThrows(value = {IOException.class, FileNotFoundException.class}) //para indicar a cual es la clase a la que lombok estara pendiente
    public static void main(String[] args) {
        //Person person = new Person(1L, "asdf", "sdf", "asdf@gmail.com", 23, 12334, LocalDate.now());
        Person person1 = Person.nombreMEtodoACrear(1L, "asdf", "sdf",
                "asdf@gmail.com", 23, 12334, LocalDate.now());
        System.out.println(person1);// si no tengo el toString modificado, me muestra la referencia al objeto


        Person2 person2 = Person2.builder()
                .id(2l)
                .name("sadf")
                .email("asdfasdf.com")
                .lastName("Diego")
                .dateOfBirth(LocalDate.now())
                .build();
        System.out.println(person2);

        Person4 person4 = new Person4(1L, "asdf", "sdf", "asdf@gmail.com", 23, 12334, LocalDate.now());
        //log.info(person4.toString());
        //log.warning(person4.toString());
        log.info(person4.toString());


        @Cleanup //para cerrar objetos que necesitan ser cerrados despues de abiertos
        InputStream input = new FileInputStream("Archivo.txt");


    }
}