package com;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando un objeto de mi clase Persona
		
		/*
		 * Al volver la clase Persona abstracta
		 * esta ya no puede instanciarse
		 */
		
//		Persona persona1 = new Persona("Pedro", "Masculino", 28);
//		System.out.println(persona1);
//		persona1.respirar();
		
		//Instanciar un objeto de mi clase Empleado
		
	Empleado empleado1 = new Empleado();
	empleado1.setNombre("Peter");
	empleado1.setGenero("Masculino");
	empleado1.setEdad(29);
	empleado1.setSalario(18000);
	empleado1.setRfc("PET940212HJU");
	empleado1.setHorario("8am-4pm");
	
	System.out.println(empleado1);
	empleado1.respirar();
	System.out.println("Hoy estoy " + empleado1.comer());
	
	empleado1.correr(5);
	
	empleado1.trabajar();
	
	empleado1.trabajar(8);
	
	//Crear un nuevo proyecto 
	//Crear una clase principal
	//crear una clase Padre (Ejemplo Animal)
	//le crear por lo menos un metodo propio
	//Que ejecute la accion que ustedes quieran
	//Crear una clase Hija (Ejemplo Perro)
	//La clase hija hereda los atributos de la clase Padre
	//y tambien los comportamientos
	
	//Investigar concepto de Clase abstracta
	//Que es una clase abstracta, para que me sirve?
	//Interface - que es una interface?
	//Para que nos sirve una interface?
	
	}//cierre de main

}
