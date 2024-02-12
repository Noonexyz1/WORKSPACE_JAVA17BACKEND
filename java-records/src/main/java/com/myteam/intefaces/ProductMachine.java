package com.myteam.intefaces;

public interface ProductMachine {

    void printCountryMachine();

    //Java tambien permite tener metodos por defecto dentro de una interfaz
    default void printYearMachine(){
        System.out.println("EEUU-2024");
    }

}
