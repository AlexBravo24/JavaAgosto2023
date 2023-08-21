package com;

public class Principal {
	
	//En la POO solo existe una clase con el método principal.
	//Es una unica clase que se encargará de ejecutar la lógica de las demás
	
	public static void main(String[] args) {
		
		
		//Al momento ed crear un objeto, traemos al nombre de la clase y posteriormente su variable
		
		//Creando un objeto perro con todos sus argumentos
		Animal perro = new Animal("Fido", 4.5, 2, 1.5, "Café");
		
		//Creamos otro objeto con el constructor vacio
		Animal gato = new Animal();
		
		Animal pez = new Animal("nemo", 0.02);
		
		//perro.nomrbe = "Fido";	//Manera incorrecta de asignar un valor a mi variable o atributo
		
		gato.setNomrbe("Waffle");  //Asignando valor a un atributo con su metodo setter
		
		
		//Se da salida a alguno de los datos de los objetos
		System.out.println(perro.getNomrbe());
		
		
		//Darle una salida a todos los datos de mi objeto
		System.out.println(perro);
		System.out.println(gato);
		
		
		
		
		//INSTANCIAS DE LA CLASE CARRO
		Carro ferrari = new Carro("Ferrari", "Enzo", "rojo", false, 2);
		Carro toyota = new Carro();
		
		toyota.setElectrico(true);
		
		System.out.println("\nInstancias de las clase Carro");
		System.out.println(ferrari);
		System.out.println(toyota);
		
		
		
		//INSTANCIAS DE LA CLASE CURSO
		Curso programacion = new Curso("Programación Estructurada", 20, "Ivan Aguilar", 100, false);
		Curso fisica = new Curso();
				
		fisica.setInstructor("Richard Fayman");
				
		System.out.println("\nInstancias de las clase Curso");
		System.out.println(programacion);
		System.out.println(fisica);
		
		
		
		//INSTANCIAS DE LA CLASE LIBRO
		Libro harry = new Libro("Harry Potter", "J. K. Rowlling", "Planeta", 1998, 250);
		Libro libro2 = new Libro();
		Libro.setPrecio(15000);
					
		libro2.setNumPaginas(420);
						
		System.out.println("\nInstancias de las clase Libro");
		System.out.println(harry);
		System.out.println(libro2);
		
		
		
		
		
		//INSTANCIAS DE LA CLASE PERSONA
		Persona persona1 = new Persona("Ivan", 31, "masculino", 1.68, 64.5);
		Persona persona2 = new Persona();
				
		persona2.setSexo("femenino");
								
		System.out.println("\nInstancias de las clase Libro");
		System.out.println(persona1);
		System.out.println(persona2);
		
		
		
		//INSTANCIAS DE LA CLASE PRODUCTOGARRAFON
		ProductoGarrafon garrafon1 = new ProductoGarrafon("Epura", 20, "azul", "policarbonato", "En uso");
		ProductoGarrafon garrafon2 = new ProductoGarrafon();
						
		garrafon2.setMarca("Bonafont");
										
		System.out.println("\nInstancias de las clase ProductoGarrafon");
		System.out.println(garrafon1);
		System.out.println(garrafon2);
	}

}
