package com;

import java.util.Arrays;
import java.util.List;

public class ApiStream {

	public static void main(String[] args) {
		
		//el API Stream es una api bastante potente que nos 
		//permite realizar varias operaciones, como por ejemplo:
		
		//Si tenemos una lista de enteros:
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("------------1----------------");
		//Podemos recorrer colecciones e imprimir todos los elementos de la lista:
		lista
			 .stream()
			 .forEach((n)-> System.out.println(n));
		
		System.out.println("------------2----------------");
		//Podemos realizar operaciones de filtrado como imprimir solo 
		//los mayores o iguales que 5:

		lista
			 .stream()
			 .filter((x)-> x>=5)
			 .forEach((n)-> System.out.println(n));
		
		System.out.println("------------3----------------");
		//Podemos imprimir solo los mayores o iguales a 5 ordenados inversamente:
		lista
			 .stream()
			 .filter((x)-> x>=5)
			 .sorted((n1,n2)-> -(n1.compareTo(n2)))
			 .forEach((n)-> System.out.println(n));
		
		System.out.println("------------4----------------");
		//También podemos sumar todos los elementos mayores o iguales a 5:
		int resultado = lista
                             .stream()
                             .mapToInt(v-> v.intValue()) //Pasarlo de array a entero
                             .filter((x)-> x>=5)
                             .sum();
        System.out.println(resultado);

	}

}
