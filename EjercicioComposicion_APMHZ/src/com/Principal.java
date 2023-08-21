package com;

public class Principal {

	public static void main(String[] args) {
		
		// Crear un objeto de composicion,
		// que se componga de otros 3 objetos
		
		// objetos dentro de mi objeto libro
		// y sus atributos
		Fecha pub = new Fecha(1, "Febrero", 2012);
		Hojas pages = new Hojas(1504, 19, 12, "blanco");
		Autor name = new Autor("Stephen", "King");
		
		// creo mi "objeto principal" -> libro y asigno valores
		// a sus atributos + los atributos de los objetos de arriba
		Libro eso = new Libro("Terror", 425.97, "It (Eso)", pages, name, pub);
		
		// salida en consola de mi objeto libro
		System.out.println(eso);
		
		
	}

}
