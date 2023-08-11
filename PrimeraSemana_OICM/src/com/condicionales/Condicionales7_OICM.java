package com.condicionales;

import java.util.Scanner;

public class Condicionales7_OICM {

	public static void main(String[] args) {
		
		Integer alumnos;
		int pago;
		double pagoalumno;
		
		System.out.println("---- Viaje de Estudios ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Numero de Alumnos");
		alumnos = input.nextInt();
		
		input.close();
		
		if(alumnos >= 100) {
			System.out.println("El pago por alumno es de: 65 euros");
			pago = alumnos * 65;
			System.out.println("El pago a la compañia de autobuses es de: " + pago);
		}
		
		if(alumnos >= 50 && alumnos <= 99) {
			System.out.println("El pago por alumno es de: 70 euros");
			pago = alumnos * 70;
			System.out.println("El pago a la compañia de autobuses es de: " + pago);
		}
		
		if(alumnos >= 30 && alumnos <= 49) {
			System.out.println("El pago por alumno es de: 95 euros");
			pago = alumnos * 95;
			System.out.println("El pago a la compañia de autobuses es de: " + pago);
		}
		
		if (alumnos < 30) {
			pagoalumno = 4000 / alumnos.doubleValue(); 
			System.out.println("El pago por alumno es de: " + pagoalumno);
			System.out.println("El pago a la compañia de autobuses es de: 4000");
		}

	}

}
