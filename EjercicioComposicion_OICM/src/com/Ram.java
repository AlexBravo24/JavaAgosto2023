package com;

public class Ram {
	
	private String marca;
	private String modelo;
	private int capacidad;
	private int velocidad;
	private String generacion;
	
	public Ram () {}

	public Ram(String marca, String modelo, int capacidad, int velocidad, String generacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.velocidad = velocidad;
		this.generacion = generacion;
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

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad+"GB" + ", velocidad=" + velocidad+"MT/s"
				+ ", generacion=" + generacion + "]";
	}
	
	

}
