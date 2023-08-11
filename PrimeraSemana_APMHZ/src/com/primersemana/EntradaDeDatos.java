package com.primersemana;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Vamos a aprender a introducir valor por teclado
		// haciendo uso de la clase Scanner
		
		// Declarar la variable para guardar el tipo
		// de dato a solicitar
		
		int numero;
		//creamos una instancia o variable de la clase
		//scanner
		
		Scanner input = new Scanner(System.in);
		
		//Enviamos un mensaje en la consola que nos indique
		//qué hacer
		
		System.out.println("Ingresa tu edad");
		int edad = input.nextInt();
		input.nextLine(); //Nueva Linea para introducir un texto diferente sin problema
		//Al tener instanciado o creado un objeto de la clase Scanner
		//No es necesario crear otro 
		//para volver a introducir datos
		
		System.out.println("Introduce tu nombre");
		String nombre = input.nextLine(); //NextLine para poder poner nombre completo
		
		//Imprimo o devuelvo los valores que introducimos
		// de nuevo en consola
		
		System.out.println("Hola " + nombre + ". Tienes " + edad + " años");

		//poner " input.close(); " cierra scanner
		//si ya no voy a introducir más valores por teclado
		//cerrar mi objeto scanner 
		//para ahorrar memoria o recursos
		
		System.out.println("Introduce 1 numero");
		int x = input.nextInt();
		System.out.println("Introduce otro numero");
		int y = input.nextInt();
		
		System.out.println("La suma de x + y = " + (x+y));
		
	}

}
