package org.example;

public class Reto1 {
    public static void main(String[] args){
        int edadUsuario = 15;
        if (edadUsuario < 12) {
            System.out.println(" carcel si se mete con una menor de 12");
        } else if (edadUsuario > 12 || edadUsuario <= 17) {
            System.out.println("es menor, todavia la cuida la mamá ");
        } else if (edadUsuario > 18 || edadUsuario <= 64) {
            System.out.println(" ya es legal porque cumple la mayoria de edad");
        } else if (edadUsuario > 65) {
            System.out.println("ya tiene pension asegurada");
        } else {
            System.out.println(" ya esta muerta pailas");
        }
    }
}
