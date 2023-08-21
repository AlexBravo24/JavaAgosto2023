package com;

public class Principal {
	
	// En la POO, solo existe uns clase con
	// el método principal
	// (una clase que se encargara de ejecutar 
	// la logica de las demas
	
	public static void main(String[] args) {
		
		// Al momento de crear un objeto, traemos al
		// nombre de la clase y posteriormente su
		// variable, tambien conocida como instancia u objeto
		
		// sintaxis para uso de constructor vacio
		//Animal perro = new Animal(); //"perro" es el objeto o instancia de la clase "Animal"
		// un objeto podria decirse que es la "variable" de esa clase.
		
		// la clase es la plantilla que nos permite crear un objeto
		
		// si usara mi metodo constructor con todos los argumentos
		Animal perro = new Animal("Fido", 4.5, 2, 1.5, "Cafe");
		
		//perro.nombre = "Fido"; -> Manera incorrecta de asignar
		// un valor a mi atributo
		
		// crear otro animal, un objeto gato, con el contructor vacío
		Animal gato = new Animal();
		
		// Asignando valor a un atributo con su método setter
		gato.setNombre("Kitty"); 
		
		// Dandole salida a alguno de los datos de mis objetos
		System.out.println(perro.getNombre()); // imprime en consola atributo nombre
		
		// Darle salida a todos los atributos de mi objeto
		System.out.println(perro);
		System.out.println(gato);
		
		// Crear 5 plantillas
		// con 2 objeto en cada una
		// Uno con el constructor vacio
		// y le asignan un valor a 
		// algun atributo posteriormente
		// y otro con todos sus argumentos
		
		
		
	}

}
