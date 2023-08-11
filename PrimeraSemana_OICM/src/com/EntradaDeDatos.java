package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Vamos a aprender a introducir valores 
		//por teclado haciendo uso de la clase scanner
		
		//Declarar la variable para guardar el tipo
		//de dato a solicitar
		
		int edad; 
		
		//Creamos una instancia o variable de la clase
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Enviamos un msj en la consola que nos 
		//indique que hacer
		System.out.println("Ingresa tu edad");
		edad = input.nextInt();
		input.nextLine(); //" "
		//Al tener instanciado o creado un objeto
		//de la clase Scanner, no es necesario crear otro
		//para volver a introducir datos
		System.out.println("Introduce tu nombre");
		String nombre = input.nextLine();
		
		//Imprimo o devuelvo los valores que introducimo
		//de nuevo en consola
		System.out.println("Hola " + nombre + ". Tienes " + edad + " años");
		
		input.close(); //si ya no voy a introducir mas valores por
		//teclado procedo a cerrar mi objeto scanner para
		//ahorrar memoria o recursos
		
		System.out.println("Introduce 1 numero");
		//int x = input.nextInt();
		System.out.println("Introduce otro numero");
		//int y = input.nextInt();
		
		//System.out.println("La suma de x + y = " + (x+y));
		
		
		
	}

}