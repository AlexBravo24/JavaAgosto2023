package com;

public class Rectangulo {
	private String nombre;
	public double perimetro;
	public double area;

	public Rectangulo() {

	}

	public Rectangulo(String nombre, double perimetro, double area) {
		super();
		this.nombre = nombre;
		this.perimetro = perimetro;
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + ", perimetro=" + perimetro + ", area=" + area + "]";
	}

}
