package com;

public class Futbolista {
	private String nombre;
	private int edad;
	private String posicion;
	private String equipoActual;
	
	public Futbolista(){
		
	}

	public Futbolista(String nombre, int edad, String posicion, String equipoActual) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.equipoActual = equipoActual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getEquipoActual() {
		return equipoActual;
	}

	public void setEquipoActual(String equipoActual) {
		this.equipoActual = equipoActual;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", equipoActual="
				+ equipoActual + "]";
	}

	
}
