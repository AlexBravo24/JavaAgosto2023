/*Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
cuando el promedio de las edades sea superior a 25*/

package com.ciclos;

import java.util.Scanner;

public class Ciclos12_CIAV {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalEdades = 0;
        int contadorEdades = 0;

        while (true) {
            System.out.print("Ingrese una edad: ");
            int edad = entrada.nextInt();

            totalEdades += edad;
            contadorEdades++;

            double promEdad = (double) totalEdades / contadorEdades;

            System.out.println("Promedio de edades: " + promEdad);

            if (promEdad > 25) {
                System.out.println("El promedio de edades es superior a 25.");
                break;
            }
        }

        entrada.close();
    }
}
