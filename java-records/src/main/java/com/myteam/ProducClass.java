package com.myteam;

import java.util.Objects;

public class ProducClass {

    private final int id;
    private final String nombre;
    private final double precio;
    private final boolean status;

    //Para tener un objeto inmutable, estos atributos deben ser final
    public ProducClass(int id, String nombre, double precio, boolean status) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.status = status;
        //Por lo tanto, necesita obligado inicializarse con algo para nuna cambiar su valor
    }

    //Ya que los atributos son final, entonces no tendria sentido tener los SETTERS


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isStatus() {
        return status;
    }

    //Escribimos los Equals y Hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProducClass that = (ProducClass) o;
        return id == that.id && Double.compare(precio, that.precio) == 0 && status == that.status && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, status);
    }

    @Override
    public String toString() {
        return "ProducClass{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", status=" + status +
                '}';
    }
}
