package org.example;

import Clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //CREO UN OBJETO DE LA CLASE PRODUCTO
        Producto producto = new Producto("banano"," es un banano pecoso",500);
        System.out.println("el nombre del producto es "+producto.nombre);
        System.out.println("el precio del :"+ producto.nombre +" es $ "+producto.precioUnitario);
        System.out.println("este"+producto.descripcion );
    }

    Cliente cliente = new Cliente("kevin","234056",100,"32221",true);
}