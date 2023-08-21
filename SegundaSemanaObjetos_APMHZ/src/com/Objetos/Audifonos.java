package com.Objetos;

public class Audifonos {
// Clase o "plantilla" llamada audifonos
	
	// declaro los atributos de los objetos
	// pertenecientes a la clase audifonos
	private String marca;
	private String color;
	private String tipo;
	private double precio;
	
	// M�todo constructor vac�o
	public Audifonos() {
		
	}

	// M�todo constructor con argumentos
	public Audifonos(String marca, String color, String tipo, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	// Setters & Getters
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// M�todo toString
	@Override
	public String toString() {
		return "Audifonos [marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	
	
	
}
