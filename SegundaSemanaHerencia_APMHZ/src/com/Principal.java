package com;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando un objeto de mi clase
		// Persona
		
//		Persona persona1 = new Persona("Pedro", "Masculino", 28);
//		System.out.println(persona1);
//		persona1.respirar();

		// Instancias un objeto de mi clase Empleado
		Empleado empleado1 = new Empleado();
		
		empleado1.setNombre("Peter");
		empleado1.setGenero("Masculino");
		empleado1.setEdad(29);
		empleado1.setSalario(18000);
		empleado1.setRfc("PETE940212HJU");
		empleado1.setHorario("8am-4pm");
		
		System.out.println(empleado1);
		empleado1.respirar();
		System.out.println("Hoy estoy " + empleado1.comer());
		
		// Polimorfismo
		empleado1.correr();
		empleado1.correr(5);
		
		empleado1.trabajar();
		empleado1.trabajar(8);
	}

}
