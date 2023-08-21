package com;

public class Vehiculo {
	
	private String nombre;
	private int numRuedas;
	private boolean conMotor;
	
	public Vehiculo() {	}

	public Vehiculo(String nombre, int numRuedas, boolean conMotor) {
		super();
		this.nombre = nombre;
		this.numRuedas = numRuedas;
		this.conMotor = conMotor;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final int getNumRuedas() {
		return numRuedas;
	}

	public final void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public final boolean isConMotor() {
		return conMotor;
	}

	public final void setConMotor(boolean conMotor) {
		this.conMotor = conMotor;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", numRuedas=" + numRuedas + ", conMotor=" + conMotor + "]";
	}
	
	
	
}
