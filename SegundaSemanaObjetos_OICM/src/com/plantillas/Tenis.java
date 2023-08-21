package com.plantillas;

public class Tenis {
	
	private String modelo;
	private String color;
	private float talla;
	
	public Tenis() {
		//Metodo constructor vacio
	}
	
	//Metodo constructor con todos los atributos
	public Tenis(String modelo, String color, float talla) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.talla = talla;
		
	}

	//Metodos Getters & Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getTalla() {
		return talla;
	}

	public void setTalla(float talla) {
		this.talla = talla;
	}

	//Metodo toString para poder visualizar n atributos de un objeto
	@Override
	public String toString() {
		return "Tenis [modelo=" + modelo + ", color=" + color + ", talla=" + talla + "]";
	}
	
	
	
}
