package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// API Stream es una funcionalidad a partir de
		// Java 8 que nos va a permitir hacer un mejor 
		// uso de los datos de una coleccion
		// En una colección contamos con muchos datos
		// y esos datos vamos a poder solicitarnos como
		// mejor nos convenga. 
		// Stream - Flujo
		
		// El API Stream nos permite ordenar o filtrar
		// informacion de una manera más efectiva
		
		// Podemos tener declarado un flujo de datos
		Stream<String> nombres = Stream.of("Cesar", "Alanis", "Luz", "Guadalupe")
										.filter(a->a.contains("a"));
		
		// Una vez filtramos la informacion, la llevamos a una lista
		List<String> names = nombres.collect(Collectors.toList());
		
//		// Muestro los resultados de la lista en consola
//		System.out.println(names);
		
		// Creamos una lista para nuestros objetos Persona
		List<Persona> lista = new ArrayList<Persona>();
		
		// Creamos una lista para pasar los valores 
		// de elementos filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		// Añadir elementos a la lista original
		lista.add(new Persona("Jorge", 37, "Masculino"));
		lista.add(new Persona("Alanis", 25, "Femenino"));
		lista.add(new Persona("César", 39, "Masculino"));
		lista.add(new Persona("Oscar", 25, "Masculino"));
		lista.add(new Persona("Guadalupe", 25, "Femenino"));
		lista.add(new Persona("Luz", 26, "Femenino"));
		lista.add(new Persona("Sergio Mtz", 25, "Masculino"));
		lista.add(new Persona("Sergio Villa", 40, "Masculino"));
		lista.add(new Persona("Ivan", 32, "Masculino"));
		lista.add(new Persona("Rafael", 22, "Masculino"));
		
		// Mostrar mi elemento lista
		// Este muestra todo en un solo renglon
//		System.out.println(lista);
//		
//		// Si queremos mostrar todos los valores
//		// (elementos)
//		
//		// Ciclo for
//		// Este muestra una persona por línea
//		for (int i=0; i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
//		
//		// Ciclo for each
//		// Tambien muestra una persona por linea
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
		
		// Ciclo for each en una sola linea
		// Se tiene el mismo resultado, 
		// una persona por linea
//		lista.forEach(System.out::println);
		
		// Filtrar algun genero de nuestros objetos Persona
//		for(Persona i: lista) {
//			if(i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		// Filtrar con el API Stream a las personas de genero
		// Femenino
//		listaFiltrada = lista.stream().filter(i->i.getGenero().equals("Femenino"))
//						.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		// Ordenar a las personas por edad ascendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		// Ordenar a las personas por edad descendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		// Solicitar un valor booleano si algun elemento
		// o varios, cumplen una condicion
		
//		boolean alguno = lista.stream().anyMatch(a->a.getEdad()<30);
//		System.out.println(alguno);
//		
//		boolean todos = lista.stream().allMatch(a->a.getEdad()<40);
//		System.out.println(todos);
		
		// Retornar un valor a la clase Optional
		// La clase Optional nos ayuda a manejar valores
		// que pueden no existir, es decir, valores que
		// puedieran ser nulos
		
		Optional<Persona> menorEdad = lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
	}

}
