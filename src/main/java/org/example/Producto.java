package org.example;

public class Producto {

    //ATRIBUTOS
    String nombre;
    String descripcion;
    int  precioUnitario;

    //CONSTRUCTOR



    public Producto(String nom, String descripcion, int precioUnitario) {
        this.nombre = nom;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }
    //METODOS

    public double calcularIVA(){
        return 0.0;

    }


}
