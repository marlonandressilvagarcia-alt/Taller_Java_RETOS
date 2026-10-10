package org.example;

import jdk.swing.interop.SwingInterOpUtils;

public class Reto4 {
    public static void main (String[] args){
        String dia = "7";
        switch (dia){
            case "1":
                laborable();
                break;
            case "2":
                laborable();
                break;
            case "3":
                laborable();
                break;
            case "4":
                laborable();
                break;
            case "5":
                laborable();
                break;
            case "6":
                laborable();
                break;
            case "7":
                domingo();
                break;
            default:
                trabajoNormal();
        }
        //switch Moderno
        String tipo = switch (dia){
            case "1", "2", "3", "4", "5", "6" -> "DIA LABORABLE";
            case "7" -> "DIA DE DESCANSO";
            default -> "DIA INVALIDO";
        };
        System.out.println("Para la abreviatura " + dia + ", el tipo de dia es: " + tipo);
    }
    public static void laborable(){
        System.out.println("Es dia laboral");
    }
    public static void domingo(){
        System.out.println("Es domingo dia de descanso");
    }
    public static void trabajoNormal(){
        System.out.println("Es dia laboral con normalidad");
    }
}
