package com;

public abstract class Persona {
	
	//Esta clase va  afuncionar como 
	//una clase Padre
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Acciones o comportamientos que puede tener una persona
	
	//Ejemplo deacci�n de una persona
	
	public void respirar() {
		//permite que mi metodo no retorne forzozamente un valor
		System.out.println("Respirando...");
	}

	//Metodo que requiere un retorno de un tipo de dato
	public String comer() {
		String comiendo = "Pizza";
		return "comiendo " + comiendo;
	}
	
	public void correr() {
		System.out.println("Corriendo...");
	}
	
	//Creando un metodo polimorfico, es decir tiene el mismo
	//nombre, pero haremos que se comporte de manera diferente
	//mediante la sobrecarga de argumentos
	public void correr(int kilometros) {
		System.out.println("Corriendo... " + kilometros + " Kilometros");
	}
	
	//Un m�todo abstracto es aquel que define qu� hacerse
	//pero no c�mo hacerse
	//Es decir, es un m�todo que no tiene cuerpo
	//Y el m�todo tendr� que ser definido o implementado 
	//por una clase hija 
	
	public abstract void trabajar();
	
	

}
