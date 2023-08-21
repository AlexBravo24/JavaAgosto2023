package com.Objetos;

public class Ropa {
// Clase o plantilla "ropa"
	
	// Declaro a tributos del objeto perteneciente
	// a esta clase
	private char talla;
	private String color;
	private String marca;
	
	// Método constructor vacío
	public Ropa() {
		
	}
	
	// Método constructor con argumentos
	public Ropa(char talla, String color, String marca) {
		super();
		this.talla = talla;
		this.color = color;
		this.marca = marca;
	}
	
	// Setter & Getters (los uso para asignar valor a un atributo 
	// cuando lo defino mediante los constructores vacios)
	public char getTalla() {
		return talla;
	}

	public void setTalla(char talla) {
		this.talla = talla;
	}

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
	
	// Método toString
	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", color=" + color + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
