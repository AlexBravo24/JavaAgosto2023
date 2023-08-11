package com;

public class Arrays {

	public static void main(String[] args) {
		//Los arrays (arreglos) son una estructura que nos 
		//permite almacenar un tipo de datos en común.
		
		//Estos no pueden crecer en tiempos de ejecución
		
		int [] numeros; //array declarado de enteros pero sin valores ni tama`no
		
		int [] numeros2 = new int [4]; //array declarado con un tamaño inicial
		
		//Los elementos de un array se acceden mediante su indice,
		//el cual comienza en 0 para el primer elemento contenido en el
		
		//Podemos acceder y modificar los elementos de la siguiente manera:
		
		numeros2[0] = 11;
		numeros2[1] = 12;
		numeros2[2] = 13;
		numeros2[3] = 14;
		
		System.out.println(numeros2[3]);
		
		//Podemos declarar un array con valores asignados desde un inicio
		
		int [] numeros3 = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i =0 ; i < numeros3.length; i++) {
			System.out.print(numeros3[i]);
		}
		
		//Podemos hacer uso de un ciclo for each
		for (int i:numeros3) {
			System.out.println(i);
		}
		
		//NOTA: Un arrary es capaz de contener tanto tipos de datos primitivos como objetos
		
		String [] nombres = {"Ivan", "Aguilar", "Keila"};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		
		
	}

}
