package com;

public class Ram {
	
	private String marca;
	private double capacidad;
	private double frecuencia;
	private String generacion;
	
	public Ram () {}

	public Ram(String marca, double capacidad, double frecuencia, String generacion) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generacion = generacion;
	}

	
	
	public final String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public final double getCapacidad() {
		return capacidad;
	}

	public final void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public final double getFrecuencia() {
		return frecuencia;
	}

	public final void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public final String getGeneracion() {
		return generacion;
	}

	public final void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	
	
	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", generacion="
				+ generacion + "]";
	}
		
}
