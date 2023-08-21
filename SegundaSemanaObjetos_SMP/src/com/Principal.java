package com;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Al momento de crear un objeto, traemos al nombre de la clase y posteriormente
		 * su variable tambien conocida como instanciar
		 */
		Animal perro = new Animal("Fido", 4.5, 2, 1.5, "Cafe");
		// perro.nombre("Fido");//manera incorrecta de asignar valor a mi atributo.

		Animal gato = new Animal();
		gato.setNombre("Kytty");

		System.out.println(perro.getNombre());
		System.out.println(perro);
		System.out.println(gato);

		// Ejemplo de uso de la clase Futbolista
		Futbolista jugador1 = new Futbolista("Lionel Messi", 34, "Delantero", "Paris Saint-Germain");
		Futbolista jugador2 = new Futbolista();

		jugador2.setNombre("Hugo Sanchez");
		System.out.println(jugador1.getNombre());
		System.out.println(jugador1);
		System.out.println(jugador2);

		// Ejemplo de uso de la clase FiguraGeometrica
		Rectangulo bandera = new Rectangulo("Bandera", 2, 3);
		Rectangulo canchaFutbol = new Rectangulo();

		canchaFutbol.setNombre("Estadio Azteca");
		canchaFutbol.setPerimetro(325);
		canchaFutbol.setArea(63.590);

		System.out.println(bandera.getNombre());
		System.out.println(bandera);
		System.out.println(canchaFutbol);

		// Ejemplo de uso de la clase Celular

		Celular iPhone = new Celular("Retina", 128, "16", 100, 8);
		Celular samsung = new Celular();

		samsung.setRam(14);
		
		System.out.println(iPhone.getCamara());
		System.out.println(iPhone);
		System.out.println(samsung);

		// Ejemplo de uso de la clase Automovil
		Automovil corolla = new Automovil("Toyota", "Corolla", 2022, "Azul", 25000.0);
		Automovil ferrari = new Automovil();

		ferrari.setColor("rojo");
		ferrari.setMarca("ferrari");
		System.out.println(ferrari.getMarca());
		System.out.println(corolla);
		System.out.println(ferrari);

		// Ejemplo de uso de la clase AparatoElectronico
		AparatoElectronico tv = new AparatoElectronico("Sony", "Smart TV");
		AparatoElectronico laptop = new AparatoElectronico();

		laptop.setMarca("Dell");
		laptop.setModelo("Laptop");
		System.out.println(tv.getMarca());
		System.out.println(tv);
		System.out.println(laptop);
	}

}
