package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionSet {

	public static void main(String[] args) {
		
		//Conjunto – los elementos no tienen un orden y no se permiten duplicados.
		//Set es otro de los interfaces fundamentales de Java . 
		//Un Set o conjunto define un conjunto de elementos que no contiene 
		//repetidos.
		//HashSet: Es la implementación de referencia del concepto de conjunto 
		//y permite añadir elementos no repetidos al grupo.
		//TreeSet: Es una implementación más compleja ya que mantiene 
		//los elementos del conjunto ordenados.
		//LinkedHashSet:Los elementos del conjunto se encuentran en el orden que se insertan
		//similar a una lista pero sin dejar ingresar valores repetidos.
		
		System.out.println("----------HashSet----------");
		
		Set<String> conjuntoHash = new HashSet<>(); //HashSet: Conjunto Unico.
		conjuntoHash.add("Cristian");
		conjuntoHash.add("Pablo");
		conjuntoHash.add("Josue");
		conjuntoHash.add("Ruben");
		conjuntoHash.add("Cristian");
		
		for(String valor : conjuntoHash) {
			System.out.println(valor);
		}
		
		System.out.println("----------TreeSet----------");
		
		Set<String> conjuntoTree = new TreeSet<>();
		conjuntoTree.add("Cristian");
		conjuntoTree.add("Pablo");
		conjuntoTree.add("Josue");
		conjuntoTree.add("Ruben");
		conjuntoTree.add("Josue");
		conjuntoTree.add("Alejandro");
		conjuntoTree.add("Beto");
		
		for(String valor : conjuntoTree) {
			System.out.println(valor);
		}
		
		
System.out.println("-----LinkedHashSet------");
		
		Set<Character> conjuntoLinked = new LinkedHashSet<>();
		conjuntoLinked.add('C');
		conjuntoLinked.add('P');
		conjuntoLinked.add('J');
		conjuntoLinked.add('R');
		conjuntoLinked.add('J');
		conjuntoLinked.add('c');
		conjuntoLinked.add('a');
		conjuntoLinked.add('b');
		
		for(Character valor : conjuntoLinked) {
			System.out.println(valor);
		}

	}

}
