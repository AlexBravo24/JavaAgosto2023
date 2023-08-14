package com.condicionales;

import java.util.Scanner;

public class Condicionales14_JRCT {

	public static void main(String[] args) {
		/*  Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
		primeras 40 horas y $20 por cada hora extra.*/

		int h, ha, ht;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa las horas trabajadas: ");
		h = input.nextInt();
		
		if(h<=40) {
			System.out.println("Su salario es de: " + (16*h));
		}else{
			ha = h-40;
			ht = (ha*20)+(40*16);
			System.out.println("Su salario es de: " + ht);
		}
		
		
		
	}

}
