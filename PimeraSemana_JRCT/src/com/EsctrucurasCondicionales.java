package com;

import java.util.Scanner;

public class EsctrucurasCondicionales {

	public static void main(String[] args) {
		
/*		//estructuras de decicion  - if - valores booleanos
		
		int x = 9;
		
		if (x<=9) {// si la condicion cumple, realiza lo siguiente
			
			System.out.println("Sí");//si no cumple la condicion
			//esta linea no se ejecuta
		}else {
			System.out.println("No");
		}
		
		String nombre = "Murcielago";
		System.out.println(nombre.length());
		
		//condiciones compuestas por operadores logicos
		
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Deveulve el true si se cumple todas las condiciones
		
		if(nombre.length()<20 && nombre.length()>11) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//OR - || - Deveulve el true si se cumple almenos una condicion
		
		if(nombre.length()<20 || nombre.length()>11) {
		System.out.println("Sí");
	    }else {
		System.out.println("No");
				}
		
		//igualdad o comparacion - == - revisa si el valor asigndo
		//es el mismo con el que lo vamos a comparar
		//Con u solo igual asignamos valor a una variable
	
		if(x == 9 ) {
			System.out.println("Sí");
		}else {
			System.out.println("NO");
		}
		 ///diefrente de - != - compara valores, y manda true si es diferente
		
		if(x!=9) {
			System.out.println("Sí");
			
		}else {
			System.out.println("No");
		}

		//NOT - ! - niega condicion (cambia valor de true a false)
		//y viceversa , segun nos sea necesario 
		
		if(!(x == 9) ) {
			System.out.println("Sí");
		}else {
			System.out.println("NO");
		}
		*/
		
		//estructura if-else concatenado o anidado
		
		int d;
		Scanner input = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		d = input.nextInt();
				
		/*
		if(d==1) {
			System.out.println("Hoy es lunes");
		}else if(d==2){
			System.out.println("hoy es martes"); 	
		}else if(d==3) {
			System.out.println("hoy es miercoles");
		}else if(d==4) {
			System.out.println("hoy es jueves");
		}else if(d==5) {
			System.out.println("hoy es viernes");
		}else {
			System.out.println("DESCONOCIDO");
		}
		*/
		
		//ESTRUCTURA DE DECICION  SWITCH-CASE 
		
		switch (d){
		case 1:
			System.out.println("Hoy es lunes");
			break;
		case 2:
			System.out.println("Hoy es martes");
			break;
		case 3:
			System.out.println("Hoy es miercoles");
			break;
		case 4:
			System.out.println("Hoy es jueves");
			break;
		case 5:
			System.out.println("Hoy es viernes ");
			break;
		default:
			System.out.println("DESCONOCIDO");
			break;
		}
		
		
		
		
	}

}
