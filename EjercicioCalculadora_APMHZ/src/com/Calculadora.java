package com;

public abstract class Calculadora {

	private String color;
	private String marca;
	private String tamaño;
	private int numteclas;
	
	// metodo constructor vacío
	public Calculadora() {
		
	}

	// método constructor con argumentos
	public Calculadora(String color, String marca, String tamaño, int numteclas) {
		super();
		this.color = color;
		this.marca = marca;
		this.tamaño = tamaño;
		this.numteclas = numteclas;
	}

	// Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumteclas() {
		return numteclas;
	}

	public void setNumteclas(int numteclas) {
		this.numteclas = numteclas;
	}

	// método toString
	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", tamaño=" + tamaño + ", numteclas=" + numteclas
				+ "]";
	}
	
	// métodos abstractos
	public abstract void suma();
	public abstract void resta();
	public abstract void mult();
	public abstract void div();
	
	
}
