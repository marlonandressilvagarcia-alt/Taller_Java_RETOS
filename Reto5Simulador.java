package org.example;

public class Reto5Simulador {
    public static void main (String[] args){
        double precioUnitario = 250.0;
        System.out.println("Precio unitario: " + precioUnitario);
        int cantidad = 1;
        System.out.println("CANTIDAD: " + cantidad);
        String cupon = "PROMO1 año";
        System.out.println(cupon);
        double subtotal = cantidad * 250.00;
        System.out.println("SUBTOTAL: " + subtotal);
        String cliente = "NUEVO";
        switch (cliente){
            case "VIP":{
                double descuentoVip = subtotal * 0.2;
                double precioFinal = subtotal - descuentoVip;
                System.out.println("Precio con Descuento por ser VIP: " + precioFinal);
                if (cupon == "PROMO1 año" && precioFinal >= 500.0){
                    double descuentoFijo = precioFinal - 50.0;
                    System.out.println("Descuento tras PROMO: " + descuentoFijo);
                    double descuentoIva = descuentoFijo * 0.16;
                    double precioTotal = descuentoFijo + descuentoIva;
                    System.out.println("Precio TOTAL: " + precioTotal);
                }else {
                    System.out.println("Descuento tras PROMO (sin promo): " + precioFinal);
                    double descuentoIva = precioFinal * 0.16;
                    double precioTotalConIva = precioFinal + descuentoIva;
                    System.out.println("Precio TOTAL: " + precioTotalConIva);
                }
                break;
            }
            case "REGULAR":{
                double descuentoRegular = subtotal * 0.1;
                double precioFinal = subtotal - descuentoRegular;
                System.out.println("Precio con Descuento por ser REGULAR: " + precioFinal);
                if (cupon == "PROMO1 año" && precioFinal >= 500.0){
                    double descuentoFijo = precioFinal - 50.0;
                    System.out.println("Descuento tras PROMO: " + descuentoFijo);
                    double descuentoIva = descuentoFijo * 0.16;
                    double precioTotal = descuentoFijo + descuentoIva;
                    System.out.println("Precio TOTAL: " + precioTotal);
                }else {
                    System.out.println("Descuento tras PROMO (sin promo): " + precioFinal);
                    double descuentoIva = precioFinal * 0.16;
                    double precioTotalConIva = precioFinal + descuentoIva;
                    System.out.println("Precio TOTAL: " + precioTotalConIva);
                }
                break;
            }
            case "NUEVO":{
                double descuentoNuevo = subtotal * 0.05;
                double precioFinal = subtotal - descuentoNuevo;
                System.out.println("Precio con Descuento por ser NUEVO: " + precioFinal);
                if (cupon == "PROMO1 año" && precioFinal >= 500.0){
                    double descuentoFijo = precioFinal - 50.0;
                    System.out.println("Descuento tras PROMO: " + descuentoFijo);
                    double descuentoIva = descuentoFijo * 0.16;
                    double precioTotal = descuentoFijo + descuentoIva;
                    System.out.println("Precio TOTAL: " + precioTotal);
                }else {
                    System.out.println("Descuento tras PROMO (sin promo): " + precioFinal);
                    double descuentoIva = precioFinal * 0.16;
                    double precioTotalConIva = precioFinal + descuentoIva;
                    System.out.println("Precio TOTAL: " + precioTotalConIva);
                }
                break;
            }
            default:
                System.out.println("Total sin descuento por NO tener categoria: " + subtotal);
        }
    }

}
