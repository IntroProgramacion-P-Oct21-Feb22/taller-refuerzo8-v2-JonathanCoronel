/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Taller08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucioón del taller 08
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String cedula;
        int tipoCliente;
        boolean bandera = true;
        int porcentaje;
        double descuento;
        int tipoComputadora;
        int cantidadcompu;
        int precioCompu = 0;
        double subtotalcompu;
        double totalcompu = 0;
        double valorTotal = 0;
        String cadenaFinal = "";
        int salida;

        while (bandera) {
            System.out.println("Ingrese los nombres del Cliente");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula del Cliente");
            cedula = entrada.nextLine();
            System.out.println("Ingrese el tipo de cliente (1,2,3,4)");
            tipoCliente = entrada.nextInt();
            System.out.println("Ingrese el tipo de computadora a "
                    + "comprar (1,2,3)");
            tipoComputadora = entrada.nextInt();
            System.out.println("Ingrese la cantidad de computadoras a comprar");
            cantidadcompu = entrada.nextInt();
            if (tipoComputadora == 1) {
                precioCompu = 1000;
            } else {
                if (tipoComputadora == 2) {
                    precioCompu = 1100;
                } else {
                    if (tipoComputadora == 3) {
                        precioCompu = 900;
                    }
                }
            }
            subtotalcompu = precioCompu * cantidadcompu;
            if (tipoCliente == 1) {
                porcentaje = 1;
                descuento = (subtotalcompu * porcentaje) / 100;
                totalcompu = subtotalcompu - descuento;
            } else {
                if (tipoCliente == 2) {
                    porcentaje = 5;
                    descuento = (subtotalcompu * porcentaje) / 100;
                    totalcompu = subtotalcompu - descuento;
                } else {
                    if (tipoCliente == 3) {
                        porcentaje = 10;
                        descuento = (subtotalcompu * porcentaje) / 100;
                        totalcompu = subtotalcompu - descuento;
                    } else {
                        if (tipoCliente == 4) {
                            porcentaje = 15;
                            descuento = (subtotalcompu * porcentaje) / 100;
                            totalcompu = subtotalcompu - descuento;
                        }
                    }
                }
            }
            valorTotal = valorTotal + totalcompu;
            cadenaFinal = String.format("%sCliente:%s,con Cedula %s,compra %d "
                    + "computadoras con precio unitario de $%d. Total a pagar "
                    + "aplicado el descuento $%.0f\n",
                    cadenaFinal, nombre, cedula, cantidadcompu,
                    precioCompu, totalcompu);
            System.out.println("Para salir precione (-1)");
            salida = entrada.nextInt();
            entrada.nextLine();
            if (salida == -1) {
                bandera = false;
            }

        }
        System.out.printf("%s\nTotal venta de computadoras: $%.0f\n",
                 cadenaFinal, valorTotal);

    }

}