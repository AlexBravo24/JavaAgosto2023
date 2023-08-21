package com;

public class Animal {

	// La clase nos sirve como plantilla de un objeto
	
	// El objeto lo vamos a "modelar" con
	// atributos y comportamientos
	// Aqui empleamos el pílar de la
	// ABSTRACCION
	
	// Definimos o modelamos nuestro objeto con sus
	//respectivos atributos
	
	// Para ENCAPSULAR o proteger la información, contamos
	// con modificadores de acceso tanto para los atributos
	// como los metodos, "private" es un modificador de acceso
	
	// se puede contener varios tipos de datos en una clase "objeto"
	
	private String nombre; //"private" encapsula el acceso a este atributo
	private double peso;
	private int edad;
	private double tamaño;
	private String color;
	
	// contamos con metodos para construir
	// o definir valores en nuestros objetos
	
	// Metodos constructores
	
	// Los 2 mas usados
	// Método constructor vacío
	
	public Animal() {
		// Nos sirve para crear o instanciar un objeto
		// sin valores asignados inicialmente
		// Me sirve como "comodín", para posteriormente 
		// asignar valor a mi objeto
	}
	
	// Método constructor con todos los argumentos
	public Animal(String nombre, double peso, int edad, double tamaño, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.tamaño = tamaño;
		this.color = color;
	}
	
	// Puedo generar más constructores de acuerdo a como a mí me convenga
	// No hay un límite
	public Animal(String nombre, int edad, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	
	
	// Por convención casi siempre solo tenemos el constructor
		// con todos los parametros y el constructor vacío
		// gracias a ellos, o gracias al uso del constructor vacío
		// podemos asignar valores a nuestro objeto 
		// con ayuda de los métodos de asignacion y de obtencion
		// de valores
		
		// Métodos Getters & Setters
		// Click derecho > Source > Generate Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// para poder imprimir todos los atributos contenidos
	// en mi objeto, convertimos todo a "String" ya que
	// tenemos diferentes tipos de dato
	
	// Método "toString()
	// Sirve como una especie de radiografia, para poder visualizar
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", tamaño=" + tamaño + ", color="
				+ color + "]";
	}
	
	
	
	
	
}
