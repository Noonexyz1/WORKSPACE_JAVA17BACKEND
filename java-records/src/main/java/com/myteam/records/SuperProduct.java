package com.myteam.records;

//Es como tener una clase dentro de otra clase, se llama composicion
//Osea esto quiere decir que este SuperRecord tiene una referencia a otro Record
public record SuperProduct(int id, String nombre, CategoryRecord category) {

}
