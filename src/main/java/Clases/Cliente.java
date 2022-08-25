package Clases;

public class Cliente {

    // ATRIBUTOS
    public String nombre;
    public String cedula;
    public int edad;
    public String telefono;
    public boolean aplicaDescuento;

    // CONSTRUCTOR

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, int edad, String telefono, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.aplicaDescuento = aplicaDescuento;
    }
    // METODOS

    public String  saludar(){
        return  "oe";


    }
}

