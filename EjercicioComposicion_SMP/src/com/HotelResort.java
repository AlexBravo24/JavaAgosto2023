package com;

public class HotelResort {
	private String nombre;
	private int numHabitaciones;
	private String tipoPlaya;
	private int gimnacio;

	public HotelResort() {
	}

	public HotelResort(String nombre, int numHabitaciones, String tipoPlaya, int gimnacio) {
		super();
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.tipoPlaya = tipoPlaya;
		this.gimnacio = gimnacio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public String getTipoPlaya() {
		return tipoPlaya;
	}

	public void setTipoPlaya(String tipoPlaya) {
		this.tipoPlaya = tipoPlaya;
	}

	public int getGimnacio() {
		return gimnacio;
	}

	public void setGimnacio(int gimnacio) {
		this.gimnacio = gimnacio;
	}

	@Override
	public String toString() {
		return "HotelResort [nombre=" + nombre + ", numHabitaciones=" + numHabitaciones + ", tipoPlaya=" + tipoPlaya
				+ ", gimnacio=" + gimnacio + "]";
	}

}
