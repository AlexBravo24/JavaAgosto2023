package com;

public class Persona {
	
	private String nombre;
	private int edad;
	private String sexo;
	private double estatura;
	private double peso;
	
	public Persona () {}

	public Persona(String nombre, int edad, String sexo, double estatura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estatura = estatura;
		this.peso = peso;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final int getEdad() {
		return edad;
	}

	public final void setEdad(int edad) {
		this.edad = edad;
	}

	public final String getSexo() {
		return sexo;
	}

	public final void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public final double getEstatura() {
		return estatura;
	}

	public final void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public final double getPeso() {
		return peso;
	}

	public final void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estatura=" + estatura + ", peso="
				+ peso + "]";
	}
	

}
