package com;

public class Computadora {
	
	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	//Estos atributos en la vida real también son objetos
	//y aquí tambien pueden serlo
	private Ram ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	
	public Computadora () {	}


	public Computadora(String marca, String modelo, double precio, String color, Ram ram, Almacenamiento disco,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
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


	public final double getPrecio() {
		return precio;
	}


	public final void setPrecio(double precio) {
		this.precio = precio;
	}


	public final String getColor() {
		return color;
	}


	public final void setColor(String color) {
		this.color = color;
	}


	public final Ram getRam() {
		return ram;
	}


	public final void setRam(Ram ram) {
		this.ram = ram;
	}


	public final Almacenamiento getDisco() {
		return disco;
	}


	public final void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}


	public final Procesador getCpu() {
		return cpu;
	}


	public final void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}


	@Override
	public String toString() {
		return "Computadora: [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", \nram=" + ram + ", \ndisco=" + disco + ", \ncpu=" + cpu + "]";
	}


	
	
}
