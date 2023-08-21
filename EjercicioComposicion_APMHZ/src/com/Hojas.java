package com;

public class Hojas {

	private int cantidad;
	private int alto;
	private int ancho;
	private String color;
	
	public Hojas() {
		
	}

	public Hojas(int cantidad, int alto, int ancho, String color) {
		super();
		this.cantidad = cantidad;
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Hojas [cantidad=" + cantidad + ", alto=" + alto + ", ancho=" + ancho + ", color=" + color + "]";
	}
	
	
	
}
