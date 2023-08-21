package com;

public class AparatoElectronico {
	private String marca;
	private String modelo;
	private boolean encendido;
	
	public AparatoElectronico() {
	
	}

	public AparatoElectronico(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.encendido = false; // Por defecto, el aparato está apagado al crearlo
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

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public String toString() {
		return "AparatoElectronico [marca=" + marca + ", modelo=" + modelo + ", encendido=" + encendido + "]";
	}

}
