package com;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
//		// ESTRUCTURAS CONDICIONALES
//		
//		//Estructura if
//		int x = 9; //Se pregunta si se cumple la condicion
//		if(x <= 9) {
//			System.out.println("Si se cumple");
//			//Si se cumple la condicion esta linea se ejecuta
//			//Si no se cumple, no se ejecuta la linea
//		}else {
//			//si no se cumple la condicion, se ejecuta la siguiente linea
//			System.out.println("no se cumple");
//		}
//		
//		String nombre = "Murcielago";
//		System.out.println(nombre.length());
//		
//		//Condiciones compuestas con operdores lógicos
//		//AND, OR, NOT, =!, =
//		
//		//AND - && - Devuelve TRUE cuando se cumplen todas las condiciones
//		if(nombre.length()<20 && nombre.length()>11) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		
//		//OR - || - Devuelve TRUE cuando se cumple al menos una de las condiciones
//		if(nombre.length()<20 || nombre.length()>11) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		
//		/*IGUALDAD o COMPARACIÓN - == 
//		 * verifica si el valor asignado es igual al valos contra el que se va a comparar*/
//		
//		if(x == 100) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		
//		/*DISTINCION - !=
//		 * verifica si el valor asignado es distinto contra el que se va a comparar*/
//		
//		if(x != 100) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		
//		/*NEGACION - !
//		 * verifica si el valor asignado es distinto contra el que se va a comparar*/
//		
//		if(!(x == 100)) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		
//		//ESTRUCTURA IF-ELSE ANIDADA
//		
//		int d;
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Introduce un Número: ");
//		
//		d = input.nextInt();
//		
//		if(d == 1) {
//			System.out.println("Lunes");
//		}else if(d == 2) {
//			System.out.println("Martes");
//		}else if(d == 3) {
//			System.out.println("Miercoles");
//		}else if(d == 4) {
//			System.out.println("Jueves");
//		}else if(d == 5) {
//			System.out.println("Viernes");
//		}else if(d == 6) {
//			System.out.println("Sabado");
//		}else if(d == 7) {
//			System.out.println("Domingo");
//		}else {
//			System.out.println("Desconocido");
//		}
//		
		
		//ESTRUCTURA SWITCH
		
		int d;
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Introduce un Número: ");
				
		d = input.nextInt();
		
		switch (d) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("DESCONOCIDO");
			break;
		}
		
	}

}
