package com;

public class Principal {

	public static void main(String[] args) {
		// Crear clase padre 
		// Con al menos 1 método propio
		// que ejecute la accion que ustedes quieran
		// + crear una clase hija
		// La clase hija hereda los atributos 
		// de la clase padre
		// y tambien los comportamientos
		
		// Instanciando un objeto de mi clase comida
		Comida comida1 = new Comida("Manzana", "Roja", "Saludable");
		comida1.lunch();
		System.out.println(comida1);
		
		// Instanciando un objeto de mi clase ensalada
		Ensalada ensalada1 = new Ensalada();
		ensalada1.setNombre("Ensalada César");
		ensalada1.setColor("Verde");
		ensalada1.setTipo("Saludable");
		ensalada1.setCosto(59.49);
		ensalada1.setNum_ingred(2);
		ensalada1.setIngred1("Lechuga");
		ensalada1.setIngred2("Jitomate");
		System.out.println(ensalada1);
		ensalada1.comer();
		ensalada1.comer("un chocolate");
	}

}
