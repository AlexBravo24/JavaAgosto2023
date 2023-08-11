package com.condicionales;

import java.util.Scanner;

public class Condicionales14_APMHZ {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, 
		// el cual se obtiene de la siguiente manera: 
		// Si trabaja 40 horas o menos se le paga $16 por hora. 
		// Si trabaja más de 40 horas se le paga $16 
		// por cada una de las primeras 40 horas y $20 por cada hora extra.

		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuantas horas laboró?");
		int horas = input.nextInt();
		
		input.close();
		
		if (horas <= 40) {
			int salario = 16 * horas;
			System.out.println("Su salario es de $" + salario);
		}
		else if (horas > 40) {
			int salario = (16 * 40);
			int hrextra = (20 * (horas-40));
			System.out.println("Su salario es de $" + (salario + hrextra));
		}
		
		
	}

}
