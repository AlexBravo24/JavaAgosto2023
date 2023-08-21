package com;

public abstract class Persona {

	// Esta clase va a funcionar como 
	// una clase padre
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
	}

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
	
	// Acciones o comportamientos que puede tener una persona
	
	//Ejemplo de acción de una persona
	
	public void respirar() { // El modificador void 
		// Permite que mi método no retorne
		// forzozamente un valor
		System.out.println("Respirando...");
	}
	
	// Método que requiere un retorno de un tipo de dato
//	public String comer() {
//		return "Comiendo...";
//	} (esta es una opcion, a continuacion otra opcion
	
	// Método que requiere un returno de un tipo de dato
	public String comer() {
		String comiendo = "pizza";
		return "comiendo " + comiendo;
	}
	
	public void correr() {
		System.out.println("Corriendo...");
	}
	
	// Creando un método polimórfico, es decir,
	// tiene el mismo nombre, pero haremos que 
	// se comporte de manera diferente
	// mediante la sobrecarga de argumentos
	public void correr(int kilometros) {
		System.out.println("Corriendo " + kilometros + "Km");
	}
	
	// Un método abstract es aquel que define QUÉ hacer
	// pero NO CÓMO hacerse
	// Es decir es un método que NO TIENE CUERPO
	// el método TENDRA QUE ser definido o IMPLEMENTADO
	// POR UNA CLASE HIJA
	
	public abstract void trabajar();
	// polimorfismo
	public abstract void trabajar(int horas);
	
}
