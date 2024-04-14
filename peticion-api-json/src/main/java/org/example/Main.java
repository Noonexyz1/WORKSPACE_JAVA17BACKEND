package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        leerAPI();
        leerAPIConParseo();
    }

    public static void leerAPI() throws IOException {
        // Crear un objeto de tipo URL
        URL url = new URL("https://rickandmortyapi.com/api/character/2");

        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        // Búferes para leer
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));

        // Esto es lo que vamos a devolver
        StringBuilder resultado = new StringBuilder();

        // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
        String linea;
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }

        // Cerrar el BufferedReader
        rd.close();

        // Regresar resultado, pero como cadena, no como StringBuilder
        System.out.println(resultado);
    }

    public static void leerAPIConParseo() throws IOException {
        // Crear un objeto de tipo URL
        URL url = new URL("https://rickandmortyapi.com/api/character/2");

        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        // Búferes para leer
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));

        // Esto es lo que vamos a devolver
        StringBuilder resultado = new StringBuilder();

        // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
        String linea;
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }

        // Cerrar el BufferedReader
        rd.close();

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(resultado);
        Personaje persona = mapper.readValue(resultado.toString(), Personaje.class);
        System.out.println(persona);
    }

}