package com;

public class Animal {
	
	private String nombre;
	private double peso;
	private int edad;
	private double tama�o;
	private String color;
	
	public Animal() {}

	public Animal(String nombre, double peso, int edad, double tama�o, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.tama�o = tama�o;
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

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso +"Kg" + ", edad=" + edad + ", tama�o=" + tama�o +"m" + ", color="
				+ color + "]";
	}
	
	public void comer() {
		System.out.println("Comiendo...");
	}
	
	public void comer(String comida) {
		System.out.println("Comiendo " + comida +"...");
	}
	
	
	

}
