package com;

public class ProductoGarrafon {
	
	private String marca;
	private int Capacidad;
	private String color;
	private String material;
	private String estado;
	
	public ProductoGarrafon () {}

	public ProductoGarrafon(String marca, int capacidad, String color, String material, String estado) {
		super();
		this.marca = marca;
		Capacidad = capacidad;
		this.color = color;
		this.material = material;
		this.estado = estado;
	}

	public final String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public final int getCapacidad() {
		return Capacidad;
	}

	public final void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final String getMaterial() {
		return material;
	}

	public final void setMaterial(String material) {
		this.material = material;
	}

	public final String getEstado() {
		return estado;
	}

	public final void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ProductoGarrafon [marca=" + marca + ", Capacidad=" + Capacidad + ", color=" + color + ", material="
				+ material + ", estado=" + estado + "]";
	}
	
	
	
	
}
