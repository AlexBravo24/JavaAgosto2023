package com;

public class Carro extends Vehiculo{
	
	private String color;
	private String marca;
	private String modelo;
	private int a�o;
	private int numPuertas;
	private double velocidad;
	
	public Carro() {}

	public Carro(String color, String marca, String modelo, int a�o, int numPuertas, double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.numPuertas = numPuertas;
		this.velocidad = velocidad;
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
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

	public final int getA�o() {
		return a�o;
	}

	public final void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public final int getNumPuertas() {
		return numPuertas;
	}

	public final void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public final double getVelocidad() {
		return velocidad;
	}

	public final void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Carro [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", numPuertas="
				+ numPuertas + ", velocidad=" + velocidad + ", toString()=" + super.toString() + "]";
	}
	
	
	//Metodos de accion
	
	public String Correr(double vel) {
		return "Corriendo a una velocidad de " + vel + " kms/h";
	}
	
	public void Parking() {
		System.out.println("En estacionamiento");
	}
	
	public String Parking(boolean descompuesto) {
		
		if (descompuesto == true) {
		}
		return "Auto Descompuesto";
	}
	
	
	
}
