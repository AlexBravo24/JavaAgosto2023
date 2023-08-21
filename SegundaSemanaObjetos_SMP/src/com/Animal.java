package com;

public class Animal {
	/*
	 * La clase nos sirve como plantilla de un objeto. El objeto lo vamos a modelar
	 * con atributos y comportamientos Aqui empleamos el pilar de la ABSTRACCION
	 * Definimos o modelamos nuestro objeto con sus respewctivos atributos
	 */

	private String nombre;
	private double peso;
	private int edad;
	private double tamaño;
	private String color;

	public Animal() {
		// Nos sirve para instanciar un objeto sin valores
		// asignados inicialmente
	}

	public Animal(String nombre, double peso, int edad, double tamaño, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.tamaño = tamaño;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * Metodo toString es servirnos como una especie de "radiografia" para poder
	 * visualizar toda la composicion o atributos de nuestro objeto
	 */
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", tamaño=" + tamaño + ", color="
				+ color + "]";
	}

}
