package com.primersemana;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays o arreglos son una estructura 
		// que nos permite almacenar un tipo de datos en comun
		// y estos no pueden crecer en tiempo de ejecucion
		
		// Declarando un array con su tamaño
		
		int [] numeros ; //aqui tenemos declarado un array
		// de numero enteros sin valores asignado
		// ni un tamaño
		
		int [] numeros2 = new int[5]; //un array
		// declarado con su tamaño inicial,
		// podrá contener en él 5 numeros enteros
		
		String nombre = "Alanis";
		
		char[] name = new char[6]; // un arreglo de tipo char
		// es equivalente a un string, caracter por caracter
		
		// Los elementos de un array se acceden mediante su indice
		// el cual comienza en 0 para el primer elemento contenido en el
		
		// Podemos acceder y modificar los elementos 
		// de la siguiente maner:
		
		numeros2[0] = 11;
		numeros2[1] = 12;
		numeros2[2] = 13;
		numeros2[3] = 14;
		numeros2[4] = 15;
		
		//numeros2[5] = 16; agregar estos valores no es correcto, porque
		//numeros2[6] = 17; se definio como un arreglo de 5 valores unicamente
		
		// Mostrar en consola de un determinado valor
		// de mi array
		
		// Mostrar en consola un determinado valor de mi array
		//System.out.println(numeros2[4]);
	
		//Declarar un array con valores asignados desde un inicio
		 int [] numeros3 = {1,2,3,4,5,6,7,8,9,10};
		 
		 // Imprimir en pantalla todos los valores del array
		 // podemos recorrer cada una de las posiciones con un ciclo
		 
//		 for (int i = 0; i < numeros3.length; i++) {
//			System.out.print(numeros3[i] + " ");
//		}
		
		 // Podemos hacer uso de un ciclo for each
		 for (int i : numeros3) {
			System.out.print(i + " "); //equivalente a la impresion anterior
		}
		
		 // Un array es capaz de contener tipos de dato
		 // tanto primitivos como objeto

		 String [] nombres = {"César", "Alanis", "Rafael"};
		 
		 
		 
		 
		 
	}

}
