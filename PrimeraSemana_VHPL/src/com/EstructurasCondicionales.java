package com;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
//		4//Estructuras de decisi�n 
//		// if- valores booleanos
//		
//		int x = 5;
//		if(x<=5) { //Si la condici�n se cumple, realiza lo siguiente
//			System.out.println("Si");
//		}else{ // si la condici�n no se cumple, ejecuta lo siguiente
//				System.out.println("No");
//		}
//		
//		String nombre = "Anticonstitucionalmente";
//		System.out.println(nombre.length());   // .length es utilizado para medir la cantidad de caracteres que tiene la cadena
//	
//		// AND, OR, NOT, Diferente de, IGUALDAD
//		
//		//AND- && - Devuelve true cuando se cumplen todas las condiciones 
//		if(nombre.length()<20 && nombre.length()>11)
//			
//		//OR || Devuelve un true cuando se cumple al menos una condici�n 
//		if(nombre.length()<20 || nombre.length()>11);
//		
//		// IGUALDAD O COMPARACI�N - == - Revisa o compara si el valor asignado es el mismo contra el que lo vamos a comparar con un solo igual"=" asignadmos valor a una variable
//		if(x==5) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//DIFERENTE DE - != - Compara los valores y manda true si son diferentes
//		if(x!=9) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
//		
//		//NOT - ! - Invierte el valor de true a false o viceversa, seg�n sea necesario
//		if(!(x==5)) {
//			System.out.println("sii");
//		} else {
//			System.out.println("no");
//		}
//		
		//Estructura if-else concatenado o anidado
		
		int d ;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		d=input.nextInt();
				
//		if (d=1) {
//			System.out.println("Lunes");
//		}else if(d==2) {
//			System.out.println("Martes");
//		}else if(d==3) {
//			System.out.println("Miercoles");
//		}else if(d==4) {
//			System.out.println("Jueves");
//		}else if(d==5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de decisi�n Switch-Case
		//Puede ser con tipos de datos String, char etc.
		switch (d) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("mi�rcoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;

		default:
			System.out.println("desconocido");
			break;
		}
		
		
	} // Cierre del main
} //Cierre de la clase
