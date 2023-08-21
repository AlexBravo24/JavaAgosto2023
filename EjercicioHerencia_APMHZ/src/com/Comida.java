package com;

public class Comida {

	private String nombre;
	private String color;
	private String tipo;
	
	public Comida() {
		
	}

	public Comida(String nombre, String color, String tipo) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", color=" + color + ", tipo=" + tipo + "]";
	}
	
	public void lunch() {
		System.out.println("Estas son las caracteristicas de mi lunch:");
	}
	
	public void comer() {
		System.out.println("Quiero comer algo mas");
	}
	
	public void comer(String algo) {
		System.out.println("Comiendo " + algo);
	}
	
	
}
