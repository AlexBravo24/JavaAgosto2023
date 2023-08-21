package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionListas {

	public static void main(String[] args) {
		
		// Entre las colecciones existentes podemos encontrar:
		//Listas
		//Set
		//Vector
		//HashMap
		
		//Lista - Estructura secuencial en donde cada elemento tiene un indice o posicion
		//Se le conoce tambien como Array unidimensional
		//El primer elemento ocupa la posicion 0
		//Admite objetos (elementos) repetidos
		
		//Declarando una lista con el tipo de dato que vamos a guaradar en ella.
		
		List<String> texto = new ArrayList<String>();
		
		List<Integer> enteros = new ArrayList<Integer>();
		
		//Agregar elementos a nuestra Lista
		texto.add("Elemento1");
		texto.add("Elemento2");
		texto.add("Elemento3");
		texto.add("5");
		
		enteros.add(1);
		enteros.add(2);
		enteros.add(5);
		
		//Mostrando los elementos de la lista
		
		System.out.println(texto);
		
		//Mostrar un elemento específico de la lista
		
		System.out.println(texto.get(1));
		
		//Devolver el valor True si el elemento existe en la lista
		System.out.println(texto.contains("5"));
		
		//Remover objetos de la lista
		//Mediante Posicion
		texto.remove(2);
		System.out.println(texto);
		
		//Mediante Objeto
		texto.remove("Elemento1");
		System.out.println(texto);
		
		//Agregar elemento a la lista
		texto.add("akjd");
		System.out.println(texto);
		
		texto.add(0, "num1");
		System.out.println(texto);
		
		//Sustituir o modificar valor en la lista
		texto.set(1, "num2");
		System.out.println(texto);
		
		
		//Declarar una lista sin parametrizar, es decir, sin indicar el tipo de dato que va a contener
		//De esta manera no estaria ligada a un solo tipo de dato
		
		List coleccion = new ArrayList();
		
		coleccion.add("Shivan");
		coleccion.add(5);
		coleccion.add(123.4324);
		coleccion.add(true);
		coleccion.add('a');
		
		System.out.println(coleccion);
		
		//Mostrar todos los elementos de la lista de manera individual
		
		for (int i = 0; i < coleccion.size() ; i++) {
			System.out.println(coleccion.get(i));
		}
		
	}

}
