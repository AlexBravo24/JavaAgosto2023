package com;

public class Perro extends Animal {
	
	private String Raza;
	private String Longevidad;
	
	public Perro () {}

	public Perro(String nombre, double peso, int edad, double tamaño, String color, String raza, String longevidad) {
		super(nombre, peso, edad, tamaño, color);
		Raza = raza;
		Longevidad = longevidad;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public String getLongevidad() {
		return Longevidad;
	}

	public void setLongevidad(String longevidad) {
		Longevidad = longevidad;
	}

	@Override
	public String toString() {
		return "Perro [Raza=" + Raza + ", Longevidad=" + Longevidad + ", toString()=" + super.toString() + "]";
	}
	
	

}
