package com.ciclos;

public class Ciclos1_VHPL {

	public static void main(String[] args) {
		
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12

		int x =12;				// Variable 12 declarada desde el inicio
		
		for (int i = 0; i <=10; i++) {		// i es la iteración en la que empieza, en este caso empezará desde el 0
			int resultado;					// se declara una variable dentro del for que nos indicará el resultado de una operación
			
			resultado = x *i;				//  la variable será igual a... (ecuación que se desea realizar)
			
			System.out.println("Tabla del 12: " + x + " x " + i + " = " + resultado);	// texto de impresión en la consola
			
		}
		
		
		
	}	//Cierre de main
}	//Cierre de clase
