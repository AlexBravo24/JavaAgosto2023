package com.plantillas;

public class VideoGame {
	
	private String titulo;
	private char clasificacion;
	private String version;
	private double precio;
	
	public VideoGame() {
		//Metodo constructor Vacio
	}

	//Metodo constructor con todos los atributos
	public VideoGame(String titulo, char claseificacion, String version, double precio) {
		super();
		this.titulo = titulo;
		this.clasificacion = claseificacion;
		this.version = version;
		this.precio = precio;
	}
	
	//Metodos Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public char getClaseificacion() {
		return clasificacion;
	}

	public void setClaseificacion(char claseificacion) {
		this.clasificacion = claseificacion;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	//Metodo toString
	@Override
	public String toString() {
		return "VideoGame [titulo=" + titulo + ", clasificacion=" + clasificacion + ", version=" + version
				+ ", precio=" + precio + "]";
	}

	
	
	

}
