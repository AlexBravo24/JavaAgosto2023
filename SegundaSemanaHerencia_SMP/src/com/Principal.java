package com;

public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Sergio", "Masculino", 34);
		System.out.println(persona1);

		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Jose");
		empleado1.setGenero("Masculino");
		empleado1.setEdad(20);
		empleado1.setSalario(18000);
		empleado1.setRfc("MAPSJFHHDFG");
		empleado1.setHorario("8am-4pm");
		System.out.println(empleado1);

	}

}
