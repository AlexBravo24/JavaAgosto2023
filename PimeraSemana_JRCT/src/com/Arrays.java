package com;

public class Arrays {

	public static void main(String[] args) {
		//los array o arreglos son una estructura que nos permite 
		//almacenar un tipo de datos en comun
		//y estos no puedes crecer en tiempo de ejecucion
	
		//declarando un array con su tamaño
		
		int [] numeros; //tenemos declñarado un array de numeros enteros 
		// sin valores asignados  ni un tamaño
		
		int [] numeros2 = new int[6];//un array
		//DECLARADO CON SU tamaño incial , podra
		//contener en el 5 numeros enteros
		String nombre = "Rafa";
		
		char [] name = new char[4];
		// los elementos de un array se acceden mediante su indice
		//el cual comienza desde 0 para el primer elemento contenido en el
		//de la siguiente manera
		
		numeros2[0]= 11;
		numeros2[1]= 12;
		numeros2[2]= 13;
		numeros2[3]= 14;
		numeros2[4]= 15;
		
		//mostrar en consola un determinado valor mi array
//		System.out.println(numeros2[4]);
		
		int[] numeros3 = {1,2,3,4,5,6,7,8,9,10};
		
		//imprimir en pantalla TODOS LOS VALORES del array 
		//podemos recorrer cada una de las pociciones con un ciclo
		
		for (int i = 0; i< numeros3.length; i++) {
			System.out.println(numeros3[i]+" ");
		}
		///podemos hacer un ciclo for each
		
//		for(int i:numeros3) {
//			System.out.println(i);
//		}
//		//un array es capaz de contoner tipos de datos tanto primitivos,
//		//como objetos
//		
//		String [] nombres = {"cesar","Alanis","Rafael"};
//		
		
	}

}
