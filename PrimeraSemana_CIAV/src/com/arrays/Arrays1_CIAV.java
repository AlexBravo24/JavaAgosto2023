package com.arrays;

import java.util.Scanner;

public class Arrays1_CIAV {
/*Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
Muestra por consola el �ndice y el valor al que corresponde.*/
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Ingresa 10 n�meros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("�ndice\tValor");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }

        entrada.close();
    }

}
