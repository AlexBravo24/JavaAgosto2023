package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Vamos a aprender a introducir valores
		// desde un teclado, haciendo uso de la clase
		//Scanner

		//Declarar la valirable para guardar el tipo de dato a solicitar
		
		int edad; 
		
		//creanis una instancia o variable de la clase Scanner
		Scanner input = new Scanner (System.in);
		
		//Enviamos un mensaje en la consola que nos indique que hacer
		
		System.out.println("Por favor introduce tu edad");
		
		edad = input.nextInt();
		input.nextLine();
		
		//Al tener creado un objeto de la clase scanner, no es necesario crear otro para volver a introducir datos
		System.out.println("Introduce tu nombre");
		String nombre = input.nextLine();
		
		//Imprimo en pantalla los valores que se introdujeron mediante:
		
		 System.out.println("Hola " + nombre + " Tienes " + edad + " Años");
		 // input.close(); // Si ya no voy a introducir nunún dato por teclado, procedo a cerrar mediante este comando para ahorrar memoria o recursos
		
		System.out.println("Introduce un número");
		int x = input.nextInt();
		System.out.println("Introduce otro número");
		int y = input.nextInt();
		
		System.out.println("La suma de x y y =" + (x+y));
		
		
		
		
	}

}
