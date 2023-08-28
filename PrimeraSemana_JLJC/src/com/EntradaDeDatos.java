package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Introducir valores por teclado con la clase Scanner
		
		//Se declara la variable donde se guardará el valor que se va a solicitar
		int edad;
		
		//Creamos instancia o variable de la clase Scanner
		Scanner input = new Scanner(System.in);
		
		//Se envia un mensaje en la consola en donde nos indique que hacer
		System.out.println("Ingresa tu edad: ");
		edad = input.nextInt();
		
		input.nextLine();
		System.out.println("Introduce tu nombre: ");
		String nombre = input.nextLine();
		
		//Se imprimen en pantalla los valores que se introdujeron anteriormente
		System.out.println("Hola " + nombre + ", tu edad es de " + edad + " años.");
		
		System.out.println("Intorduce el primer numero: ");
		int x = input.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int y = input.nextInt();
		
		System.out.println("La suma del primer numero y el segundo es: " + (x + y));
		

	}

}
