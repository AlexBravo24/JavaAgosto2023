package com;

public class Animal {
	
	//La clase nos sirve como plantilla de un objeto
	
	//El objeto lo vamos a "Modelar" con atributos y comportamientos
	//aqui empleamosel el pilarde la ABSTRACI�N
	
	//Definimos o modelamos nuestro objeto con sus
	//respectivos atributos
	
	//Para ENCAPSULAR, o proteger la informaci�n, contamos
	//con modificadores de acceso tanto para los atributos
	//como los metodos.
	
	private String nombre;
	private double peso;
	private int edad;
	private double tama�o;
	private String color;
	
	//Contamos con m�todos para construir
	//o definir valores en nuestros objetos
	
	//M�todos constructores
	//Principalmente 2 m�s usados
	//M�todo constructor vac�o
	public Animal () {
		//Nos sirve para crear o instanciar un objeto 
		//Sin valores asignados inicialmente
		//me sirve como "Comodin", para posteriormente asignar valor 
		//a mi objeto
	}

	//M�todo constructor con todos loa argumentos
	public Animal(String nombre, double peso, int edad, double tama�o, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.tama�o = tama�o;
		this.color = color;
	}

	//Puedo generar m�s constructores como a mi me convenga
	//No hay un l�mite
	public Animal(String nombre, int edad, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	
	//Pr convencion casi siempre solo tenemos el constructor con
	//todos los parametros y el constructor vacio
	//Gracias a ello, o gracias a l uso del constructro vacio
	//podemos asignar valores a nuestro objeto posteriormente
	//con  ayuda de los metodos de asignacion y de obtencion de valores
		
	//Metodos Getters & Setters
	//Click derecho>Source>Generate Getters & Setters

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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//Metodo toString() es servirnos como
	//una especie de "radiografia" para poder visualizar
	//toda la composicio'n o atributos de nuestro objeto
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", tama�o=" + tama�o + ", color="
				+ color + "]";
	}
	
	
	

}
