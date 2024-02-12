package com.myteam;


import com.myteam.records.CategoryRecord;
import com.myteam.records.ProductRecord;
import com.myteam.records.SuperProduct;

public class Main {

    public static void main(String[] args) {
        ProductRecord pr1 = new ProductRecord(1, "PS5", 5000, true);
        ProductRecord pr2 = new ProductRecord( "Nintendo");
        ProductRecord pr3 = new ProductRecord("XBOX", 5000);

        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);

        //podemos traer cualquier de los GETTS de Record
        System.out.println(pr1.precio());

        //invocamos la logica de un metodo en record
        System.out.println(pr3.nombreMayuscula());

        //Llamada al metodo statico del record
        ProductRecord.printYearCurrent();

        //Llamada al metodo de la interfaz que implementa el Record
        pr3.printCountryMachine();
        //Llamada al metodo POR DEFECTO QUE TIENE INTERFACE, ojo, el record ya lo tiene
        pr3.printYearMachine();


        //Tambien se puede hacer una Composicion de Record como las clases
        SuperProduct product = new SuperProduct(1, "PC", new CategoryRecord(11, "CategoryRecord-RTX3080Ti"));
        System.out.println(product);

        //Acceso al atributo statico del Record
        System.out.printf(ProductRecord.DEFAULT_PRODUCT);


    }

}
