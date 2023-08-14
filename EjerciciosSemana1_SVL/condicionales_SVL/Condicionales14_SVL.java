package com.condicionales;

import java.util.Scanner;

public class Condicionales14_SVL {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
	    // horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
		// primeras 40 horas y $20 por cada hora extra

		
		Scanner input = new Scanner(System.in);
		int horastrab, total, horaex;
		
		System.out.println("Numero de horas trabajadas");
	    horastrab =input.nextInt();
	     
	     if(horastrab <= 40){
	     total= horastrab*16;
	         
	         System.out.println("Su sueldo es de $:"+total);
	     }else{
	         horaex = horastrab-40;
	         total=(horaex*20)+(40*16);
	         System.out.println("Su sueldo es de $:"+total);
	     }
	}

}
