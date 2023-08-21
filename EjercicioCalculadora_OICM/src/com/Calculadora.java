package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private String tamaño;
	private int numdigitospantalla;
	private int numeroteclas;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String tamaño, int numdigitospantalla, int numeroteclas) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
		this.numdigitospantalla = numdigitospantalla;
		this.numeroteclas = numeroteclas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumdigitospantalla() {
		return numdigitospantalla;
	}

	public void setNumdigitospantalla(int numdigitospantalla) {
		this.numdigitospantalla = numdigitospantalla;
	}

	public int getNumeroteclas() {
		return numeroteclas;
	}

	public void setNumeroteclas(int numeroteclas) {
		this.numeroteclas = numeroteclas;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + ", numdigitospantalla="
				+ numdigitospantalla + ", numeroteclas=" + numeroteclas + "]";
	}

	public abstract void suma();
	public abstract void resta();
	public abstract void dividir();
	public abstract void multiplicar();
	
}
