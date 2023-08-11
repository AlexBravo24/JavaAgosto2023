
package com;

import java.util.Scanner;
public class EntradaDeDatos {

	public static void main(String[] args) {
		// vamos a aprender a introducir valores por teclado 
		//haciendo el uso de la clase Scanner
		
		//declarar la variable para guardar el tipo de dato a solicitar
		
		int numero;
		int edad;
		//creamos una instancia o variable
		//de la clase scanner
		Scanner input = new Scanner(System.in);
		
		//enviamos un mensaje que nos indique que hacer
		System.out.println("Ingresa tu edad: ");
		edad = input.nextInt();
		input.nextLine();
		//al tener instanciado o creado de la clase Scanner
		//nop es necesario crear otro para volver instriducir 	datos
		
		System.out.println("introduce tu nombre: ");
		String nombre = input.nextLine();
		// imprimo o devuelvo los valores que introduciomos de nuevo en la consola
		System.out.println("hola " + nombre + " tines " + edad +" años ");
		
		input.close();//si ya no voy a introducir mas valores por teclado, procedo a cerrar  mi objeto
		//Scanner para ahorrar memoria o recursos
		
		System.out.println("introduce 1 numero");
		int x = input.nextInt();
		System.out.println("introduce 2 numero");
		int y = input.nextInt();
		System.out.println("la suma de x + y es: " + (x+y));
		
		
		
				
		

	}

}
