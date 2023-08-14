package com.arrays;

import java.util.Scanner;

public class Arrays3_JABR {

	public static void main(String[] args) {
		
		// Pide al usuario por teclado una frase y 
		//pasa sus caracteres a un array de caracteres.
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        
        char[] caracteres = new char[frase.length()];
        
        for (int i = 0; i < frase.length(); i++) {
            caracteres[i] = frase.charAt(i);
        }
        
        System.out.println("Los caracteres en el array son:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        
        scanner.close();

	}

}
