package com;

public class Carro {
	
	private String marca;
	private String modelo;
	private String color;
	private boolean electrico;
	private int numPuertas;
	
	public Carro () {}

	public Carro(String marca, String modelo, String color, boolean electrico, int numPuertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.electrico = electrico;
		this.numPuertas = numPuertas;
	}

	public final String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public final String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final boolean isElectrico() {
		return electrico;
	}

	public final void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}

	public final int getNumPuertas() {
		return numPuertas;
	}

	public final void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", electrico=" + electrico
				+ ", numPuertas=" + numPuertas + "]";
	}
	
	
	
	
}
