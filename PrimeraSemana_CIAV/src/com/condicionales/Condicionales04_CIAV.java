package com.condicionales;

import java.util.Scanner;

public class Condicionales04_CIAV {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = entrada.nextLine();
        
        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La cadena inicia con una letra mayúscula.");
        } else {
            System.out.println("La cadena no inicia con una letra mayúscula.");
        }
        
        entrada.close();
    }
	
}
