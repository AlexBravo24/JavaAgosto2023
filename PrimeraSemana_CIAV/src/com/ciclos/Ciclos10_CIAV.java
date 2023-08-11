/*Programa que lea 20 números e indique si son positivos o negativos y pares o 
impares y además muestre la sumatoria de los positivos y sumatoria de los impares. */

package com.ciclos;

import java.util.Scanner;

public class Ciclos10_CIAV {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numPosit = 0;
        int sumaPosit = 0;
        int sumaImpar = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int num = entrada.nextInt();

            if (num > 0) {
            	numPosit++;
            	sumaPosit += num;
            }

            if (num % 2 != 0) {
            	sumaImpar += num;
            }

            if (num > 0) {
                System.out.print("Positivo");
            } else if (num < 0) {
                System.out.print("Negativo");
            } else {
                System.out.print("Cero");
            }

            if (num % 2 == 0) {
                System.out.println(" y Par");
            } else {
                System.out.println(" e Impar");
            }
        }

        System.out.println("La suma de los numeros positivos: " + sumaPosit);
        System.out.println("La suma de los numeros impares: " + sumaImpar);

        entrada.close();
    }
}
