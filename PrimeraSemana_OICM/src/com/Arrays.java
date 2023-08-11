package com;

public class Arrays {

	public static void main(String[] args) {
		
		//Los arrays o arreglos son una estructura
		//que nos permite almacenar un tipo de datos
		//en común y estos no pueden crecer en tiempo 
		//de ejecucion 
		
	//Declarando un array con su tamaño
		
	int [] numeros; //aqui tenemos declarados un array
	//de numeros enteros sin valores asignados
	//ni un tamaño
	
	int [] numeros2 = new int [5]; //un array 
	//declarado con su tamaño inicial, podra
	//contener en el 5 numeros enteros
	
	String nombre = "Oscar";
	
	char[] name = new char [5];
	
	//Los elementos de un array se acceden mediante
	//su indice, el cual comienza en 0 para el primer
	//elemento contenido en el 
	//Podenis acceder y modificar los elementos 
	//de la siguiente manera:
	
	numeros2 [0] = 11;
	numeros2 [1] = 12;
	numeros2 [2] = 13;
	numeros2 [3] = 14;
	numeros2 [4] = 15;
	
//	numeros2 [5] = 16;
//	numeros2 [6] = 17;
	
	//Mostrar en consola un determinado valor de mi array
//	System.out.println(numeros2[6]);
	
	//Declarar un array con valores asignados de un inicio 
	
	int [] numeros3 = {9,2,3,4,5,6,7,8,9,10};

	//Imprimir en pantalla todos los valores del array
	//podemos recorrer cada una de las posiciones con un ciclo
	
//	for (int i = 0; i < numeros3.length; i++) {
//		System.out.print(numeros3[i]+"");
//	}
	
	//Podemos hacer uso de un ciclo for each
	for(int i:numeros3) {
		System.out.println(i);
	}
	//un array es capaz de contener tipos de datos primitivos
	//como objetos
	
	String [] nombres = {"Cesar","Alanis","Rafael"};
	System.out.println(nombres[0] + nombres[1] + nombres[2]);
	}

}
