package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        leerListaArchivoJSON();
    }

    public static void leerListaArchivoJSON() throws URISyntaxException, IOException {
        LeerArchivo leerArchivo = new LeerArchivo();
        File fichero = leerArchivo.getFileFromResourceFile("persona-lista.json");

        ObjectMapper mapper = new ObjectMapper();
        Persona personaMapeado = mapper.readValue(fichero, Persona.class);
        System.out.println(personaMapeado);
    }

}