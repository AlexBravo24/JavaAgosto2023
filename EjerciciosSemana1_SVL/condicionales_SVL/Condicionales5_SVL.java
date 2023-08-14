package com.condicionales;

import java.util.Scanner;

public class Condicionales5_SVL {

	public static void main(String[] args) {
		//  Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo
		
		Scanner input = new Scanner (System.in);
		int nota;
		int edad;
		String sexo;
		
		System.out.println("Este programa te dice si estas aceptado o no");
		System.out.println("FAVOR DE INGRESAR TUS DATOS");
		System.out.println("EDAD");
		edad = input.nextInt();
		System.out.println("NOTA");
		nota = input.nextInt(); input.nextLine();
		System.out.println("SEXO  (M o F)");
		sexo = input.nextLine();
		
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		      System.out.println("Error en el campo SEXO");
		} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		      System.out.println("POSIBLE");
		    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
		    }else {
		        System.out.println("NO ACEPTADA");
		}
				

	}

}
