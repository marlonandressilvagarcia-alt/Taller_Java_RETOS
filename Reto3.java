package org.example;

public class Reto3 {
    public static void main(String[] args){
        String tipoEntrada = "ESTUDIANTE";
        double precioBase = 100;
        double precioConDescuento = precioBase * 0.5;
        System.out.println("50% de descuento por ser " + tipoEntrada + ":" + precioConDescuento);

        boolean cookieSesionActiva = true;
        String estadoConexion = (cookieSesionActiva == true) ? "ACTIVA" : "INACTIVA";
        System.out.println(estadoConexion);
    }
}
