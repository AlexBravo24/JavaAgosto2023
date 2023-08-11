package com.arrays;

public class Arrays4_OICM {

	public static void main(String[] args) {
		
		//Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
		System.out.println("---- Invertir Array ----");
		
		int [] numeros = {1,2,3,4,5};
		int [] numerosflip = new int [5];
		
		for(int i = 4; i >=0; i--) {
			numerosflip [4 - i] = numeros [i];
		}
		
		System.out.print("Array Inicial: ");
		for(int indice:numeros) {
			System.out.print(indice);
		}
		System.out.print("\nArray invertido: ");
		for (int indice : numerosflip) {
			System.out.print(indice);
		}

	}

}
