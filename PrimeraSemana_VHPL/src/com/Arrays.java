package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arreglos son una estructura que nos permite almacenar un tipo de datos en com�n 
		// y estos no pueden crecer en tiempo de ejecuci�n.

		// Declarando un array con su tama�o
		
	int [] numeros;		// <--- aqu� tenemos declarado un array de n�meros enteros sin valores agregados ni tama�o
		
	int [] numeros2 = new int[5]; // es un array declarado con su tama�o inicial, podr� contener 5 n�meros enteros
		
	String nombre = "Alex"; 
	
	char [] name = new char[4];
	
	// Los elementos de un array se acceden mediante un �ndice, el cual comienza en 0 para el primer elemento contenido en �l
	//Podemos acceder y modificar los elementos de la siguiente forma:
	
		numeros2[0]= 11;
		numeros2[1]= 12;
		numeros2[2]= 13;
		numeros2[3]= 14;
		numeros2[4]= 14;
	// Mostrar en consola determinado valor de mi array
		System.out.println(numeros2[5]);
	
	//----------------------------------------------------------
		//Declarar los arrays con valores asignados desde el inicio
		int [] numero3 = {1,2,3,4,5,6,7,8,9,10};
		
		// Para imprimir en pantalla todos los valores del array, podemos recorrer cada uno de las 
		//posiciones con un ciclo
		
		for (int i = 0; i < numero3.length; i++) {
			System.out.println(numero3[]+" ");
		}
		
		// podemos hacer uso de un for each 
		for (int i : numero3) {
			System.out.println(i);
		}
		
		// Un array es capaz de contener tanto datos de tipo primitivo como de tipo objeto
		String = nombres =
		
	
	
		
	}	// cierre de main
}		//cierre de clar
