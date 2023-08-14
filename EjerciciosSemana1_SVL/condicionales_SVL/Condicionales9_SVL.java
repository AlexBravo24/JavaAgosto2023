package com.condicionales;

import java.util.Scanner;

public class Condicionales9_SVL {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error

		Scanner input = new Scanner (System.in)	;
		int dia;
		
		   System.out.println("El programa indica el dia de la semana seleccionando:");
		    System.out.println("1.- Lunes.");
		    System.out.println("2.- Martes.");
		    System.out.println("3.- Miércoles.");
		    System.out.println("4.- Jueves.");
		    System.out.println("5.- Viernes.");
		    System.out.println("6.- Sábado.");
		    System.out.println("7.- Domingo.");
		    dia = input.nextInt();
		
		    switch (dia) {
		    case 1:
		      System.out.println("Seleccionaste el: LUNES");
		      break;
		    case 2:
		      System.out.println("Seleccionaste el: MARTES");
		      break;
		    case 3:
		      System.out.println("Seleccionaste el: MIÉRCOLES");
		      break;
		    case 4:
		      System.out.println("Seleccionaste el: JUEVES");
		      break;
		    case 5:
		      System.out.println("Seleccionaste el: VIERNES");
		      break;
		    case 6:
		      System.out.println("Seleccionaste el: SÁBADO");
		      break;
		    case 7:
		      System.out.println("Seleccionaste el: DOMINGO");
		      break;
		    default:
		      System.out.println("ERROR: VALOR NO VALIDO");
		    }
		
	
	
	}

}
