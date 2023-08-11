/*Programa en Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
mayor*/

package com.ciclos;

import java.util.Scanner;

public class Ciclos8_CIAV {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se solicitan dos n�meros al usuario
        System.out.print("Ingrese el primer n�mero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo n�mero: ");
        int num2 = entrada.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("N�meros desde el menor hasta el mayor:");

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

        entrada.close();
    }

}
