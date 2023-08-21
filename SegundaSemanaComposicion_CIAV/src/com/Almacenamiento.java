package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double capacidad;
	
	
	public Almacenamiento () {}


	public Almacenamiento(String marca, String tipo, double capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}


	public final String getMarca() {
		return marca;
	}


	public final void setMarca(String marca) {
		this.marca = marca;
	}


	public final String getTipo() {
		return tipo;
	}


	public final void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public final double getCapacidad() {
		return capacidad;
	}


	public final void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}
	
	
	
	

}
