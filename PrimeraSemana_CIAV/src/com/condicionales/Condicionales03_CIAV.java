package com.condicionales;

import java.util.Scanner;

public class Condicionales03_CIAV {
	
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Ingrese el primer número: ");
	        double num1 = entrada.nextDouble();
	        
	        System.out.print("Ingrese el segundo número: ");
	        double num2 = entrada.nextDouble();
	        
	        if (num2 == 0) {
	            System.out.println("Error: No se puede dividir por cero.");
	        } else {
	            double resultado = num1 / num2;
	            System.out.println("El resultado de la división es: " + resultado);
	        }
	        
	        entrada.close();
	    }

}
