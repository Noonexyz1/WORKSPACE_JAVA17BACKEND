package com.myteam.records;

import com.myteam.intefaces.ProductMachine;
//Los RECORDS permiten generar objetos INMUTABLES mas breves
//Un record no te permite heredar, pero si implementar interfaces
public record ProductRecord(int id, String nombre, double precio, boolean status)
                implements ProductMachine {
    //Pero si toca iniciliar solo parte de un atributo y los demas no, pues
    //debemos agregar un constructor con el parametro que queramos solamente y asi para
    //los demas parametros, pero que se inicialize los demas que no queremos en valores por
    //defecto


    //Tambien podemos tener atributos no cuales quiera, sino de la siguiente manera
    //Tienen que ser Atributos finales y staticos
    public static final String DEFAULT_PRODUCT = "COMPUTER";



    //CONSTRUCTORES
    public ProductRecord(String nombre){
        this(0, nombre, 0, false);
    }
    public ProductRecord(String nombre, double precio){
        this(0, nombre, precio, false);
    }

    //Tambien podemos implementar alguna logica
    public String nombreMayuscula(){
        return nombre.toLowerCase();
    }

    //Tambien podemos tener metodos staticos que se invoque directamente por la llamada
    //de la clase sin pasar por la instancia
    public static void printYearCurrent(){
        System.out.println("2024");
    }


    @Override
    public void printCountryMachine() {
        System.out.println("EEUU");
    }
}
