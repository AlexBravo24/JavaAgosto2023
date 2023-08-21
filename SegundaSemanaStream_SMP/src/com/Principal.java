package com;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Ejemplo de cómo usar el API Stream en una lista: tengo una lista de números
		 * enteros y quiero realizar algunas operaciones usando el API Stream:
		 */

		List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25);

		// Uso de Stream para filtrar y mapear
		numeros.stream().filter(n -> n > 10) // Filtrar números mayores a 10
				.map(n -> n * 2) // Multiplicar por 2
				.forEach(System.out::println); // Imprimir cada elemento

		// Uso de Stream para calcular la suma
		int suma = numeros.stream().reduce(0, Integer::sum); // Sumar los elementos

		System.out.println("Suma de los números: " + suma);

		/*
		 * En este ejemplo:
		 * 
		 * 1- Realizo una lista de números enteros. 2- Uso el método stream() para
		 * obtener un Stream de la lista. 3- Uso el método filter() para filtrar los
		 * números mayores a 10. 4- Use el método map() para multiplicar los números
		 * filtrados por 2. 5- Use el método forEach() para imprimir cada elemento
		 * transformado.
		 * 
		 * Luego, use el método reduce() para calcular la suma de todos los elementos en
		 * la lista.
		 * 
		 * El API Stream permite encadenar operaciones de manera fluida y realizar
		 * muchas otras operaciones como map, filter, forEach, reduce, collect, entre
		 * otras. Esto facilita la escritura de código más legible y expresivo al
		 * trabajar con colecciones de datos.
		 */

	}

}
