package com;

public class Principal {

	public static void main(String[] args) {
		// Instanciando un objeto de mi clase persona
		
//		Persona persona1 = new Persona("Ivan", "masculino", 32);
//		System.out.println(persona1);
//		persona1.respirar();
		
		
		// Instanciando objeto de la clase empleado
		Empleado empleado1 = new Empleado("Keila", "femenino", 32, 20000, "adkmeoinfowin123", "matutino");
		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Marco");
		empleado2.setSexo("masculino");
		empleado2.setEdad(25);
		empleado2.setSalario(18000);
		empleado2.setRfc("ADK233dorn13AOKM");
		empleado2.setHorario("matutino");
		
		System.out.println(empleado1);
		empleado1.respirar();
		System.out.println(empleado1.comer());
		
		System.out.println(empleado2);
		empleado2.respirar();
		System.out.println(empleado2.comer());
		
		empleado1.correr();
		empleado1.correr(10);
		
		empleado1.trabajar();
		empleado2.trabajar();

	}

}
