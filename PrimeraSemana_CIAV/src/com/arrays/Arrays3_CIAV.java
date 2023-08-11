package com.arrays;

import java.util.Scanner;

public class Arrays3_CIAV {
/*Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
caracteres.*/
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = entrada.nextLine();

        char[] caracteres = frase.toCharArray();

        System.out.println("Índice\tValor");

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(i + "\t" + caracteres[i]);
        }

        entrada.close();
    }
}
