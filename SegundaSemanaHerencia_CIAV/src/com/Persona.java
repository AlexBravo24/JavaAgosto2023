package com;

public abstract class Persona {
	//Clase que va a funcionar como la clase padre
	
	private String nombre;
	private String sexo;
	private int edad;
	
	public Persona () {}

	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final String getSexo() {
		return sexo;
	}

	public final void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public final int getEdad() {
		return edad;
	}

	public final void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
	//Acciones o comportamientos que puede tener una persona
	
	public void respirar () { //El modificador void permite que mi metodo no retorn ningun valor
		
		System.out.println("Respirando...");
		
	}
	
	//Metodo que requiere retornar un dato
	
	public String comer() {
		String comida = "pizza";
		return "Comiendo..." + comida;
	}
	
	public void correr() {
		System.out.println("Corriendo...");
	}
	
	//Creando un método polimórfico, es decir, que tiene el mismo nombre
	//pero haremos que se comporte de manera diferente mediante la sobrecarca de argumento
	public void correr(int kilometros) {
		System.out.println("corriendo " + kilometros + " kilometros");
	}
	
	
	//Un metodo abstracto es aquel que define que hacerse pero NO COMO hacerse
	//Es un metodo que no tiene cuerpo
	//El metodo tendra que ser definido en una clase hija
	
	public abstract void trabajar();
	
	//Se puede volver un metodo abstracto polimorfico
	public abstract void trabajar(int horas);	
	
}
