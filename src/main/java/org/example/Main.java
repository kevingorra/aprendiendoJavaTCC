package org.example;

import Clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CREAR UN OBJETO DE LA CLASE PRODUCTO

        Producto producto=new Producto();

        //CREAR UN OBJETO DE LA CLASE SCANNER

        Scanner lea=new Scanner(System.in);

        //PREGUNTAR AL USUARIO EL NOMBRE DEL PRODUCTO

        System.out.println("Digite el nombre del producto");
        producto.nombre=lea.next();
        System.out.println("El producto es : " + producto.nombre);


        //CREAR UN OBJETO DE LA CLASE CLIENTE
        Cliente cliente =  new Cliente();

        System.out.println("Digite su nombre : ");
        cliente.nombre=lea.next();
        System.out.println("Digite su numero de Cedula : ");
        cliente.cedula=lea.next();
        System.out.println("Digite su numero de celular : ");
        cliente.telefono=lea.next();
        System.out.println("Digite su edad : ");
        cliente.edad=lea.nextByte();
        System.out.println("Digite  si aplica descuento : ");
        cliente.aplicaDescuento=lea.nextBoolean();



    }
}