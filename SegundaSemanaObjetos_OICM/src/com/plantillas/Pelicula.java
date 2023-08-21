package com.plantillas;

public class Pelicula {
	
	private String nombre;
	private char clasificacion;
	private int duracion;
	private int a�o;
	
	public Pelicula() {
		//Metodo constructor vavio 
	}

	public Pelicula(String nombre, char clasificacion, int duracion, int a�o) {
		super();
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.duracion = duracion;
		this.a�o = a�o;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(char clasificacion) {
		this.clasificacion = clasificacion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", clasificacion=" + clasificacion + ", duracion=" + duracion +"m" + ", a�o="
				+ a�o + "]";
	}
	

}
