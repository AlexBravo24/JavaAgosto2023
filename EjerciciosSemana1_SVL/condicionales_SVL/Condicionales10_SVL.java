package com.condicionales;

import java.util.Scanner;

public class Condicionales10_SVL {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		//mes correspondiente

		Scanner input = new Scanner(System.in);
		int mes;
		
		System.out.println("El programa te dice el numero días que tiene el mes:");
	    System.out.println(" 1.- Enero.");
	    System.out.println(" 2.- Febreo.");
	    System.out.println(" 3.- Marzo.");
	    System.out.println(" 4.- Abril.");
	    System.out.println(" 5.- Mayo.");
	    System.out.println(" 6.- Junio.");
	    System.out.println(" 7.- Julio.");
	    System.out.println(" 8.- Agosto.");
	    System.out.println(" 9.- Septiembre.");
	    System.out.println("10.- Octubre.");
	    System.out.println("11.- Noviembre.");
	    System.out.println("12.- Diciembre.");
	    mes = input.nextInt();
	
	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
	      System.out.println("Este mes tiene 31 días");
	    } else if (mes ==2){
	      System.out.println("Febrero tiene 28 días");
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	      System.out.println("Este mes tiene 30 días");
	    } else {
	      System.out.println("Error: DATO INVALIDO.");
	    } 
		
		
		
	}

}
