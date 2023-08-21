package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// API Stream - Funcionalidad a partir de
		//Java 8 que nos va  a permitir hacer un
		//mejor uso de los datos de una coleccion
		//En una coleccion contamos con muchos
		//datos y esos datos vamos a poder
		//solicitarlos de acuerdo a como mejor
		//nos convenga. Stream - Flujo

		//El API Stream nos permite ordenar o filtrar
		//informacion d euna manera mas efectiva
		
		//Podemos tener declarado un flujo de datos
		Stream<String> nombres = Stream.of("Cesar", "Alanis","Luz","Guadalupe")
				.filter(a -> a.contains("a"));
		
		//Una vez filtramos la informacion, la llevamos a una lista
		List<String> names = nombres.collect(Collectors.toList());
		//Muestro los resultados de la lista en consola
//		System.out.println(names);
		
		//creamos una lista para nuestro objetos persona
		List<Persona> lista = new ArrayList<Persona>();
		
		//Creamos una lista para pasar los valores 
		//de elementos filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		
		lista.add(new Persona("Jorge", 37, "MASCULINO"));
		lista.add(new Persona("Alanis", 25, "FEMENINO"));
		lista.add(new Persona("César", 29, "MASCULINO"));
		lista.add(new Persona("Oscar", 25, "MASCULINO"));
		lista.add(new Persona("Guadalupe", 25, "FEMENINO"));
		lista.add(new Persona("Luz", 26, "FEMENINO"));
		lista.add(new Persona("Sergio Martinez", 25, "MASCULINO"));
		lista.add(new Persona("Sergio Villa", 40, "MASCULINO"));
		lista.add(new Persona("Sergio Ivan", 32, "MASCULINO"));
		lista.add(new Persona("Rafael", 22, "MASCULINO"));
		
		//Mostrar mi elemento lista
		System.out.println(lista);
		
		//Si queremos mostrar todos los valores(elementos)
		
		//ciclo for
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
			
		//Ciclo for each
//		for(Persona i : lista) {
//			System.out.println(i);
//		}
		
		//Ciclo for each en una solo linea
//		lista.forEach(System.out::println);
		
		//Filtar alguno genero de nuestro objeto
//		for(Persona i : lista) {
//			if(i.getGenero().contentEquals("MASCULINO")){
//				listaFiltrada.add(i);
//				System.out.println(i);
//			}
//		}

		
		//Filtrar con el API Stream a las personas de genero Femenino
//		listaFiltrada = lista.stream().filter(i -> i.getGenero().equals("Femenino"))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar las personas por edad ascendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar a las personas d=por edad descendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Solicitar un valor booleano si algun elemento o varios
		//cumplen con alguna condicion
		
//		Boolean alguno = lista.stream().allMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno);
		
		//Retornar un valor a la clase Optional
		//La clase Optional nos ayuda a manejar valores que
		//pueden no existir, es decir, valores que pudieran ser nulos
		
		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
	}

}
