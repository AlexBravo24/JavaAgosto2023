package com.primersemana;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
//		// Estructuras de desición - if - valores booleanos
//		
//		int x = 9;
//		
//		if(x<=9) { // Si la condicion se cumple realiza lo siguiente
//			System.out.println("Sí");
//			//Si no se cumple la condicion esta linea no se ejecuta
//		}
//		else {
//			// si la condicion no se cumple, ejecuta lo siguiente
//			System.out.println("No");
//		}
//		
//		String nombre = "Murcielago";
//		System.out.println(nombre.length());
//		
//		// Condiciones compuestas con operadores logicos 
//		// and, or, not, diferente de, igualdad
//		
//		// AND se identifica con  && 
//		// devuelve true cuando se cumplan todas las condiciones
//		
//		if(nombre.length()<20 && nombre.length()>11) {
//			System.out.println("Sí");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		// OR se identifica con || 
//		// devuelve true cuando se cumpla al menos una de las condiciones
//				
//		if(nombre.length()<20 || nombre.length()>11) {
//			System.out.println("Sí");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		// iguldad o comparacion se identifica por ==
//		// revisa o compara si el valor asignado es el 
//		// mismo contra el que vamos a comparar
//		// CON UN SOLO IGUAL "=" ASIGNAMOS VALOR A UNA VARIABLE
//	
//		if(x == 1000) {
//			System.out.println("Sí");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		// operador diferente de - !=
//		// compara los valores y manda true cuando son diferentes
//		
//		if(x!=9) {
//			System.out.println("Sí");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		// Not - "!" - Niega una condicion
//		// cambia el valor de true a false
//		// y viceversa segun nos sea necesario
//		
//		if(!(x==9)) {
//			System.out.println("Sí");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		// ctrl + 7 para comentar toda una seccion de codigo, 
		//tambien para quitar el comentario de una seccion seleccionada
		
		// ESTRUCTURA IF ELSE CONCATENADO O ANIDADO
		
		int d;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero");
		d=input.nextInt();
//		
//		if(d==1) {
//			System.out.println("Lunes");
//		}
//		else if(d==2) {
//			System.out.println("martes");
//		}
//		else if(d==3) {
//			System.out.println("miercoles");
//		}
//		else if(d==4) {
//			System.out.println("jueves");
//		}
//		else if(d==5) {
//			System.out.println("viernes");
//		}
//		else {
//			System.out.println("desconocido");
//		}

		
		// ESTRUCTURA DE DESICION SWITCH CASE
		
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
		default:
			System.out.println("Desconocido");
			break;
			
		}
		
		
		
		
	} // CIERRE DEL MAIN

} // CIERRE DE LA CLASE
