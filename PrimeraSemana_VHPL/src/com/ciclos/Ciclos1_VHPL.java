package com.ciclos;

public class Ciclos1_VHPL {

	public static void main(String[] args) {
		
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12

		int x =12;				// Variable 12 declarada desde el inicio
		
		for (int i = 0; i <=10; i++) {		// i es la iteraci�n en la que empieza, en este caso empezar� desde el 0
			int resultado;					// se declara una variable dentro del for que nos indicar� el resultado de una operaci�n
			
			resultado = x *i;				//  la variable ser� igual a... (ecuaci�n que se desea realizar)
			
			System.out.println("Tabla del 12: " + x + " x " + i + " = " + resultado);	// texto de impresi�n en la consola
			
		}
		
		
		
	}	//Cierre de main
}	//Cierre de clase
