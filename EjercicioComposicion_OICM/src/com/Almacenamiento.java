package com;

public class Almacenamiento {
	
	private String marca;
	private String modelo;
	private int capacidad;
	private String tipo;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, String modelo, int capacidad, String tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + ", tipo=" + tipo
				+ "]";
	}
	
	
}
