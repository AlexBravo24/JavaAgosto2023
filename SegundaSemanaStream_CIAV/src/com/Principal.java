package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//API Stream - Es una funcionalidad a partir de JAVA 8 que nos va a permitir
		//hacer un mejor uso o gestión de los datos de una colección.
		//En una colección contamos con muchos datos y esos datos vamos a poder solicitarlos
		//solicitarlos de acuerdo a como mejor nos convenga.
		//Stream - Flujo
		
		//El API Stream nos permite ordenar o filtrar información de una
		//manera más efectiva
		
		//Podemos tener declarado un flujo de datos
		Stream<String> nombres = Stream.of("Cesar", "Alanis", "Luz", "Ivan")
				.filter(a -> a.contains("a"));
		
		//Una vez filtrada la información, la llevamos a una lista
		List<String> names = nombres.collect(Collectors.toList());
		//System.out.println(names);
		
		//Creamos una lista para nuestros objetos Persona
		List<Persona> listaPersona = new ArrayList<Persona>();
		
		//Creamos una lista para pasar los valores de los elementos filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadimos elementos a la lista original
		listaPersona.add(new Persona("Jorge", 37, "MASCULINO"));
		listaPersona.add(new Persona("Ivan", 31, "MASCULINO"));
		listaPersona.add(new Persona("Alanis", 25, "FEMENINO"));
		listaPersona.add(new Persona("Luz", 26, "FEMENINO"));
		listaPersona.add(new Persona("Cesar", 39, "MASCULINO"));
		listaPersona.add(new Persona("Guadalupe", 25, "FEMENINO"));
		listaPersona.add(new Persona("Sergio", 40, "MASCULINO"));
		listaPersona.add(new Persona("Rafael", 22, "MASCULINO"));
		listaPersona.add(new Persona("Oscar", 37, "MASCULINO"));
		listaPersona.add(new Persona("Keila", 32, "FEMENINO"));
		
		//System.out.println(listaPersona);
		
//		for (int i = 0; i < listaPersona.size(); i++) {
//			System.out.println(listaPersona.get(i));
//		}
//		
//		for (Persona person : listaPersona) {
//			System.out.println(person);
//		}
		
		//Ciclo foreach en una sola línea
		//listaPersona.forEach(System.out::println);
		
		//Filtrar elementos de nuestra lista
		//Método convenional
		
//		for(Persona i: listaPersona) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		//Vamos a flitrar con el API Stream a las personas del genero FEMENINO
		
//		listaFiltrada = listaPersona.stream().filter(i -> i.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
//		
		
		//Lista ordenada por edad ascendente
//		
//		listaFiltrada = listaPersona.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Lista ordenada por edada descendente
//		
//		listaFiltrada = listaPersona.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//			.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Solicitar un valor booleano si algún elemento o varios cumplen con alguna condicion
		
//		boolean alguno = listaPersona.stream().allMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno);
		
		//Retornar un valor a la clase Optional
		//La clase Optional nos ayuda a manejar valores que pueden
		//no existir, es decir, valores que pudieran ser nulos
		
		Optional<Persona> menorEdad = listaPersona.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}

}
