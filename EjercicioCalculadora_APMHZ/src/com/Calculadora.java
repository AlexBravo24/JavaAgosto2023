package com;

public abstract class Calculadora {

	private String color;
	private String marca;
	private String tama�o;
	private int numteclas;
	
	// metodo constructor vac�o
	public Calculadora() {
		
	}

	// m�todo constructor con argumentos
	public Calculadora(String color, String marca, String tama�o, int numteclas) {
		super();
		this.color = color;
		this.marca = marca;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public int getNumteclas() {
		return numteclas;
	}

	public void setNumteclas(int numteclas) {
		this.numteclas = numteclas;
	}

	// m�todo toString
	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", tama�o=" + tama�o + ", numteclas=" + numteclas
				+ "]";
	}
	
	// m�todos abstractos
	public abstract void suma();
	public abstract void resta();
	public abstract void mult();
	public abstract void div();
	
	
}
