package com.arrays;

import java.util.Scanner;

public class Arrays1_OICM {

	public static void main(String[] args) {
		
		//Crea un array de 10 posiciones de números con valores 
		//pedidos por teclado.Muestra por consola el índice y el 
		//valor al que corresponde.
		
		System.out.println("---- Array de 10 Posiciones ----");
		
		int [] valores = new int [10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa 10 numeros");
		
		for (int indice = 0; indice < valores.length; indice++) {
			valores [indice] = input.nextInt();
		}
		
		input.close();
		
		System.out.println("Los Valores Ingresados Son:");
		
		for(int indice = 0; indice < valores.length; indice++) {
			System.out.println("["+ indice +"] "+ valores [indice]);
		}
	}
}
