package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        leerUnArchivoJSON();
        crearUnArchivoJSON();
        leerListaArchivoJSON();
        crearListaArchivoJSON();
    }

    public static void leerUnArchivoJSON() throws URISyntaxException, IOException {
        LeerArchivo leerArchivo = new LeerArchivo();
        File fichero = leerArchivo.getFileFromResourceFile("persona.json");
        System.out.println(fichero);

        ObjectMapper mapper = new ObjectMapper();
        Persona persona = mapper.readValue(fichero, Persona.class);
        System.out.println(persona.toString());
    }

    public static void crearUnArchivoJSON() throws URISyntaxException, IOException {
        Persona persona2 = new Persona("Juan", "Carlos", 25);
        File fichero = new File("persona2.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(fichero, persona2);
    }

    public static void leerListaArchivoJSON() throws URISyntaxException, IOException {
        LeerArchivo leerArchivo = new LeerArchivo();
        File fichero = leerArchivo.getFileFromResourceFile("persona-lista.json");
        System.out.println(fichero);

        ObjectMapper mapper = new ObjectMapper();
        List<Persona> listaPersonas = mapper.readValue(fichero, new TypeReference<List<Persona>>(){});
        listaPersonas.forEach(System.out::println);
    }

    public static void crearListaArchivoJSON() throws URISyntaxException, IOException {
        List<Persona> personasList = new ArrayList<>();
        personasList.add(new Persona("Juan", "Marino", 25));
        personasList.add(new Persona("Marco", "Solis", 24));
        personasList.add(new Persona("Julieta", "Venegas", 23));
        personasList.add(new Persona("Simon", "Bolivar", 22));

        File fichero = new File("persona-lista2.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(fichero, personasList);
    }

}