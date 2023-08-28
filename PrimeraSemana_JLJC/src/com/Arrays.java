package com;

public class Arrays {

	public static void main(String[] args) {
		/*
		 Los arrays o arreglos son una estructura que nos permite almacenar
		 un tipo de datos en comun y estos no pueden crecer en un tiempo de ejecucion
		 
		 */
		
		//DECLARANDO UN ARRAY CON SU TAMAÑO
		
		int [] numeros; //Tenemos declarado un array de numeros enteros sin valores asignados ni tamaño
		
		int [] numeros2 = new int[5]; // es un array declarado con sun tamaño inicial
		// Podra contener en el, 5 numeros enteros.
		
		//DECLARADO UN TAMAÑO
		String nombre = "Alex"; // Alex tiene 4 letras,longitud de 4 
		
		char[] name= new char[4]; // dato a dato
		
		/*  los Elementos de un array se acceden mediante su indice
		 * el cual empieza en 0 para el primer elemento contenido en el 
		 * podemos acceder y modificar los elementos de la siguiente manera */
		
		numeros2 [0]=11;
		numeros2 [1]=12;
		numeros2 [2] =13;
		numeros2 [3]=14;
		numeros2 [4]=15;
		/**
		numeros2 [5]=16;
		numeros2 [6]=17; */
		
		//mostrar en consola un determinado valor de mi array
		/*System.out.println(numeros2[4]); */
		
		//Declarar un array con valores asignados desde un inicio
		int [] numeros3= {1,2,3,4,5,6,7,8,9,10};
		
		//imprimir en pantalla todos los valores del Array
		//podemos recorrer cada una de las posiciones con un ciclo
		
		for(int i = 0; i < numeros3.length;i++) {
		System.out.println(numeros3[i]+""); 
		}
		/*
		//podemos hacer uso de un ciclo FOR each
		for(int i:numeros3) {
			System.out.print(i);
		}
		*/
	
			//Un array es capaz de contener tipos de datos
			//tanto primitivos como objeto

}
}
