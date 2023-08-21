package com.Objetos;

public class Principal { 

	public static void main(String[] args) {
		
		// Crear 5 plantillas
		// con 2 objeto en cada una
		// Uno con el constructor vacio
		// y le asignan un valor a 
		// algun atributo posteriormente
		// y otro con todos sus argumentos
				
		// Plantilla refresco
				
		// objeto o instancia de mi clase/plantilla
		// "refresco" usando un constructor vacío
		Refresco manzanita = new Refresco();
				
		// asigno valor a los atributos de mi objeto
		// "manzanita"
		manzanita.setSabor("Manzana");
		manzanita.setCaducidad(2023);
		manzanita.setColor("cafe");
		manzanita.setMililitros(600);
				
		// salida de los atributos asignados
		System.out.println("Refresco 'Manzanita' ");
		System.out.println(manzanita);
		
		///
				
		// objeto o instancia de mi clase/plantilla llamada
		// "refresco" usando el método constructor con argumentos
				
		// asigno valor a los atributos de mi objeto
		// "fanta"
		Refresco fanta = new Refresco("naranja", "naranja", 350, 2024);
				
		// salida de los atributos asignados
		System.out.println("Refresco 'Fanta' ");
		System.out.println(fanta);
				
		//////////////////////////////////////////////////////////
		System.out.println();		
		
		// Plantilla o clase "Libro"
		
		// Objeto o instancia de mi clase "Libro"
		// usando el método constructor vacío
				
		Libro harrypotter = new Libro();
		
		// asigno valor a los atributos de mi objeto
		// usando el método de asignacion "set"
		
		harrypotter.setAutor("JK Rowling");
		harrypotter.setGenero("Fantasía");
		harrypotter.setPrecio(499.99);
		harrypotter.setHojas(350);
		
		// salida en consola 
		System.out.println("Libro 'Harry Potter'");
		System.out.println(harrypotter);
		
		///
		
		// objeto o instancia de mi clase/plantilla llamada
	    // "libro" usando el método constructor con argumentos
						
		// defino un nuevo objeto de la clase libro
		// y asigno valores
		
		Libro it = new Libro("Terror", 750, 645.49, "Stephen King");
		
		// salida en consola
		
		System.out.println("Libro 'It'");
		System.out.println(it);
	
		//////////////////////////////////////////////////////////
		System.out.println();		

		// Plantilla o clase "Serie"
		
		// Objeto o instancia de mi clase/plantilla
		Serie breakingbad = new Serie();
		
		// asigno valor a los atributo de mi objeto
		// mediante el método de asignción "set"
		
		breakingbad.setCapitulos(100);
		breakingbad.setGenero("Drama");
		breakingbad.setTemporadas(5);
		
		// defino objeto o instancia usando
		//metodo constructor con argumentos
		// y defino los valores de sus atributos
		
		Serie JuegoDeTronos = new Serie("Fantasia", 350, 7);
		
		// Salida en consola
		System.out.println("Serie: Breaking bad");
		System.out.println(breakingbad);
		System.out.println("Serie: Juego de Tronos");
		System.out.println(JuegoDeTronos);
		
		//////////////////////////////////////////////////////////
		System.out.println();
		
		// defino un objeto o instancia de la clase "Ropa"
		// mediante el método constructor vacío
		Ropa blusa = new Ropa();
		
		// asigno valor a los atributos de mi objeto "Blusa"
		// mediante set
		blusa.setColor("Verde");
		blusa.setMarca("Aero");
		blusa.setTalla('M');
		
		// salida a consola
		System.out.println("Ropa: Blusa");
		System.out.println(blusa);
		
		/////
		// defino un objeto de la clase "Ropa"
		// y asigno valor a los atributo de mi objeto "pantalon"
		Ropa pantalon = new Ropa('G', "Azul", "Aero");
		
		// salida a consola
		System.out.println("Ropa: Pantalon");
		System.out.println(pantalon);
		
		///////////////////////////////////////////////////////
		System.out.println();
		
		// Defino un objeto o instancia de la clase
		//Audifonos mediante el metodo constructor vacío
		Audifonos sony = new Audifonos();
		
		// Asigno valores a los atributos de mi
		// objeto "sony" mediante el metodo set
		sony.setColor("Negro");
		sony.setMarca("Sony");
		sony.setPrecio(999.99);
		sony.setTipo("Inalambricos");
		
		//Salida a Consola
		System.out.println(sony);
		
		////
		
		// defino un objeto o instancia de la clase audifonos
		// mediante el metodo de constructores con argumentos
		// y asigno valores al objeto "jbl"
		Audifonos jbl = new Audifonos("JBL", "Azul", "Alambricos", 199.99);
		
		// salida a consola
		System.out.println(jbl);
		
		
		
	}

}
