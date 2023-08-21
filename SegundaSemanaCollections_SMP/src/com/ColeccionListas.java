package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionListas {

	public static void main(String[] args) {
		List<String> texto = new ArrayList<String>();
		List<Integer> enteros = new ArrayList<Integer>();

		texto.add("Elemento 1");
		texto.add("Elemento 2");
		texto.add("Elemento 3");
		texto.add("5");

		enteros.add(1);
		enteros.add(2);

		System.out.println(texto);

		System.out.println(texto.get(1));
		System.out.println(texto.contains("5"));

		// texto.remove(3);
		texto.remove("Elemento 3");

		System.out.println(texto);
		texto.add(1, "///");
		System.out.println(texto);

		texto.set(1, "Otra cosa");
		System.out.println(texto);

		/*
		 * Declarando lista sin parametrizar, sin indicar el tipo de dato que va a
		 * contener
		 */
		List coleccion = new ArrayList();
		coleccion.add("Aprendiendo de colecciones");
		coleccion.add(1);
		coleccion.add(22096);
		coleccion.add('ñ');
		System.out.println(coleccion);
		
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}

	}

}
