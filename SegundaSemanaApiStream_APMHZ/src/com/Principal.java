package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Programacion funcional
		// La API Stream procesa datos transportando valores a partir
		// de una fuente mediante una serie de pasos computacionales
		// conocidos como canalizacion de flujo. 
		// Una canalizacion de flujo esta compuesta por lo siguiente:
		// -Una fuente, por ejemplo una coleccion, o un arreglo.
		// -Cero o más operaciones "flojas" intermedias. Las operaciones 
		// intermedias no comienzan a procesar elementos sino hasta que
		// invocas una operacion termina, por esta razon se consideran 
		// flojas. 
		// -Una operacion terminal. Cuando invoques la operacion terminal,
		// todas tus operaciones intermedias se ejecutarán y producirán un 
		// nuevo flujo. 
		
		// Existen varias maneras de obtener un flujo a partir
		// de una fuente de datos, entre ellas:
		
		// Stream.of() Crea un flujo a partir de valores individuales
		Stream<String> flujo = Stream.of("Alanis", "Paulina");
 		
		// IntStream.range() Crea un flujo a partir de un rango de numeros
		IntStream numeros = IntStream.range(0, 10);
		
		// Stream.iterate() Creau un flujo al aplicar repetidamente un 
		// operador a cada elemento.
		// Flujo en el que cada elemento incrementa su valor en uno
		Stream<Integer> s = Stream.iterate(0, n -> n+1);
		
		// Operaciones
		
		// Sorted
		// Esta operacion ordena los elementos de un flujo
		List<Integer> lista = new ArrayList<Integer>();
		//List<Integer> lista = Arrays.asList(10, 1, 6, 9, 50);
		lista.add(10);
		lista.add(1);
		lista.add(6);
		lista.add(9);
		lista.add(50);
		
		lista.stream()
		.sorted()
		.forEach(System.out::println);
		
		

	}

}
