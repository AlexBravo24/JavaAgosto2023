package com.condicionales;
import java.util.Scanner;//librer�a scanner
public class Condicionales3_JICL {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el
		//segundo n�mero es 0, debe mostrar un mensaje de error.

	    Scanner scanner = new Scanner (System.in);
	    int numerador;
	    int denominador;
	// Solicitud de datos al usuario
	    System.out.println("Este programa muestra la division entre dos n�meros enteros:");
	    System.out.print("Introduce el primer n�mero: ");
	    numerador = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    denominador = scanner.nextInt();
	    
	// Realizamos C�lculos y mostramos en pantalla
	    if (denominador != 0){
	        System.out.println((double)numerador/(double)denominador);
	    }else {
	        System.out.println("El segundo n�mero introducido es 0. "
	            + "introduzca un valor v�lido.");
	    }
	}

}
