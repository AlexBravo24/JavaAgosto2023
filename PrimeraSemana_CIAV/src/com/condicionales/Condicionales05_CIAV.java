package com.condicionales;

import java.util.Scanner;

public class Condicionales05_CIAV {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        
        System.out.print("Ingrese su calificación (valor entre el 0 y el 10): ");
        int calif = entrada.nextInt();
        
        System.out.print("Ingrese su sexo (M/F): ");
        Character sexo = entrada.next().charAt(0);
        
        if (calif >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("Sexo no válido. Ingrese 'M' o 'F'.");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
        
        entrada.close();
    }

}
