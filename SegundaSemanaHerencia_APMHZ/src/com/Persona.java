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
	
	//Ejemplo de acci�n de una persona
	
	public void respirar() { // El modificador void 
		// Permite que mi m�todo no retorne
		// forzozamente un valor
		System.out.println("Respirando...");
	}
	
	// M�todo que requiere un retorno de un tipo de dato
//	public String comer() {
//		return "Comiendo...";
//	} (esta es una opcion, a continuacion otra opcion
	
	// M�todo que requiere un returno de un tipo de dato
	public String comer() {
		String comiendo = "pizza";
		return "comiendo " + comiendo;
	}
	
	public void correr() {
		System.out.println("Corriendo...");
	}
	
	// Creando un m�todo polim�rfico, es decir,
	// tiene el mismo nombre, pero haremos que 
	// se comporte de manera diferente
	// mediante la sobrecarga de argumentos
	public void correr(int kilometros) {
		System.out.println("Corriendo " + kilometros + "Km");
	}
	
	// Un m�todo abstract es aquel que define QU� hacer
	// pero NO C�MO hacerse
	// Es decir es un m�todo que NO TIENE CUERPO
	// el m�todo TENDRA QUE ser definido o IMPLEMENTADO
	// POR UNA CLASE HIJA
	
	public abstract void trabajar();
	// polimorfismo
	public abstract void trabajar(int horas);
	
}
