package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionListas {

	public static void main(String[] args) {
		
		// Colecciones -
		//Listas, Set, Vector, HashMap
		
		//Listas - estructura secuencial donde cada elemento
		//tiene un indice o posicion
		//Sele puede conocer como array unidimensional
		//el primer elemento ocupa la posicion "0"
		//Admite objetos repetidos (elementos repetidos)
		
		//Declarando una lista con el tipo de dato
		//que vamos a guardar en ella
		
		List<String> texto = new ArrayList<String>();
		
		List<Integer> enteros = new ArrayList<Integer>();
		
		//Agregar elementos a nuestra lista
		texto.add("Elemento 1");
		texto.add("Elemento 2");
		texto.add("Elemento 3");
		texto.add("5");
		
		enteros.add(1);
		enteros.add(2);
		
		//Mostrar elementos de la lista
		System.out.println(texto);
		
		//Mostrar un elemento especifico de mi lista
		System.out.println(texto.get(1));
		
		//devolver un valor True si el elemnto existe 
		//dentro de la lista
		System.out.println(texto.contains("5"));
		
		//eliminar elementos
		//Mediante la posicion
//		texto.remove(3);
		//Mediante el objeto
		texto.remove("Elemento 3");
		
		System.out.println(texto);
		
		//Agregar una posicion en el indice y desplazar los valores
		
		texto.add(1, "///");
		
		System.out.println(texto);
		
		//Si queremos sustituir un valor de una posicion
		texto.set(1, "Otra Cosa");
		System.out.println(texto);
		
		//Declarar una lista sis paramatrizarla, es decir,
		//sin indicar el tipo de dato que va a contener
		
		List coleccion = new ArrayList();
		
		coleccion.add("Aprendiendo de colecciones");
		coleccion.add(1);
		coleccion.add(222.99);
		coleccion.add(true);
		coleccion.add('ñ');
		
		System.out.println(coleccion);
		
		//Mostar todos los elementos de la lista
		//de manera individual
		
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}
		
	}

}
