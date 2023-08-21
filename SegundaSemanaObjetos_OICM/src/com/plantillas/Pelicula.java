package com.plantillas;

public class Pelicula {
	
	private String nombre;
	private char clasificacion;
	private int duracion;
	private int año;
	
	public Pelicula() {
		//Metodo constructor vavio 
	}

	public Pelicula(String nombre, char clasificacion, int duracion, int año) {
		super();
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.duracion = duracion;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", clasificacion=" + clasificacion + ", duracion=" + duracion +"m" + ", año="
				+ año + "]";
	}
	

}
