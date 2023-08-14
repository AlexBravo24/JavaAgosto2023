package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JABR {

	public static void main(String[] args) {
		
		/*10. Programa que lea 20 números e indique si son positivos
		 *o negativos y pares o impares y ademas muestre la sumatoria
		 * de los positivos y sumatoria de los impares.
		 * 
		 */
	
		 Scanner scanner = new Scanner(System.in);
	        
	        int cantidadNumeros = 20;
	        int sumatoriaPositivos = 0;
	        int sumatoriaImpares = 0;
	        
	        for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.print("Ingresa el número #" + (i + 1) + ": ");
	            int numero = scanner.nextInt();
	            
	            if (numero > 0) {
	                System.out.println(numero + " es positivo.");
	                sumatoriaPositivos += numero;
	            } else if (numero < 0) {
	                System.out.println(numero + " es negativo.");
	            } else {
	                System.out.println(numero + " es cero.");
	            }
	            
	            if (numero % 2 == 0) {
	                System.out.println(numero + " es par.");
	            } else {
	                System.out.println(numero + " es impar.");
	                sumatoriaImpares += numero;
	            }
	        }
	        
	        System.out.println("Sumatoria de números positivos: " + sumatoriaPositivos);
	        System.out.println("Sumatoria de números impares: " + sumatoriaImpares);
	        
	        scanner.close();
	    }

}
