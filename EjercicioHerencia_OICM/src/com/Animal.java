package com;

public class Animal {
	
	private String nombre;
	private double peso;
	private int edad;
	private double tamaño;
	private String color;
	
	public Animal() {}

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

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso +"Kg" + ", edad=" + edad + ", tamaño=" + tamaño +"m" + ", color="
				+ color + "]";
	}
	
	public void comer() {
		System.out.println("Comiendo...");
	}
	
	public void comer(String comida) {
		System.out.println("Comiendo " + comida +"...");
	}
	
	
	

}
