package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionSet_APMHZ {

	public static void main(String[] args) {
		
		// Una coleccion representa un grupo de objetos
		// Estos objetos son conocidos como elementos.
		// Se emplea la interfaz "Collection" para este 
		// prop�sito, gracias a esta interfaz podemos 
		// almacenar cualquier tipo de objeto.
		
		
		// La interfaz Set define una colecci�n que no
		// puede contener elementos duplicados.
		
		// Dentro de la interfaz Set existen varios tipos
		// de implementaciones:
		
		// HashSet - Almacena los elementos en una tabla hash
		// Para ello calcula un c�digo "hash" (num entero)
		// para cada elemento que se va a insertar, invocando
		// el m�todo "hashcode()" de cada elemento antes de su
		// inserci�n. Este n�mero le indica la posici�n del 
		// elemento dentro de su estructura interna.
		// Sus elementos no se almacenan necesariamente 
		// siguiendo un orden particular.
		
		// Ejemplo
		Set<Character> ejemploHash = new HashSet<>();
		ejemploHash.add('a');
		ejemploHash.add('l');
		ejemploHash.add('a');
		ejemploHash.add('n');
		ejemploHash.add('i');
		ejemploHash.add('s');
		// solo imprime los valores que NO son iguales
		// sin un orden en especifico
		System.out.println(ejemploHash);
		// de la misma forma solo cuenta los datos distintos (5)
		System.out.println(ejemploHash.size());
		// se puede eliminar y agregar elementos
		ejemploHash.remove('n');
		ejemploHash.add('o');
		System.out.println(ejemploHash);
		// evalua si un elemento existe o no
		System.out.println(ejemploHash.contains('h'));
		//
//		System.out.println(ejemploHash.hashCode());
		// se puede borrar todo su contenido
		ejemploHash.clear();
		// agregar nuevos elementos
		ejemploHash.add('h');
		ejemploHash.add('o');
		ejemploHash.add('l');
		ejemploHash.add('a');
		System.out.println(ejemploHash);
		// ahora tiene un tama�o diferente
		System.out.println(ejemploHash.size());
		// ahora ya es true, ya contiene un caracter h
		System.out.println(ejemploHash.contains('h'));
		
		// TreeSet
		// Se diferencia de HashSet en que mantiene la lista ordenada
		// para lo cual implementa internamente una estructura de arbol.
		// Un �rbol es una estructura en la que los datos se organizan en 
		// nodos........
		// El orden dentro del TreeSet no es el orden el que los elementos
		// son insertados (como en las listas), sino el orden "natural" de 
		// los elementos.
		// Una clase decimos que es "ordenable" cuando implementa el interfaz
		// "Comparable". Esta interfaz define un �nico m�todo "compareTo", que
		// debe devolver un n�mero negativo, cero o positivo en funci�n de si
		// el objeto es menos, igual o mayor respectivamente que el recibido
		// como argumento, segun su "orden natural". 
		// Cada clase determina lo que segun ella es su orden natural.
		// Por ejemplo, para la clase Integer es el orden num�rico, p�ra la
		// clase String es el orden alfab�tico, etc.
		
		// Ejemplo con Integer
		Set<Integer> ejemploTree = new TreeSet<>();
		ejemploTree.add(45);
		ejemploTree.add(3);
		// salida de los elemento en orden numerico
		System.out.println(ejemploTree);
		
		// ejemplo con string
		Set<String> ejemploTree2 = new TreeSet<>();
		ejemploTree2.add("Hola");
		ejemploTree2.add("Alanis");
		ejemploTree2.add("Paulina");
		// salida de los elementos en orden alfabetico
		System.out.println(ejemploTree2);
		
		// ejemplo Character
		Set<Character> ejemploTree3 = new TreeSet<>();
		ejemploTree3.add('a');
		ejemploTree3.add('!');
		System.out.println(ejemploTree3);
		
		// LinkedHashSet
		// Los elementos del conjunto se encuentran en el orde
		// en el que se insertan, similar a una lista
		// pero omitiendo los valores repetidos
		
		Set<String> ejemploLinked = new LinkedHashSet<>();
		 ejemploLinked.add("Me gusta");
		 ejemploLinked.add("dormir");
		 ejemploLinked.add("Me gusta");
		 ejemploLinked.add("nadar");
		 // imprime valores en el orden en el que fueron agregados
		 // omite los valores repetidos
		 System.out.println(ejemploLinked);
		
		
		
		
		
	}

}
