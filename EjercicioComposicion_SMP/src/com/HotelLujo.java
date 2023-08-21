package com;

public class HotelLujo {
	private String nombre;
	private int numHabitaciones;
	private String servicioSpa;

	public HotelLujo() {
	}

	public HotelLujo(String nombre, int numHabitaciones, String servicioSpa) {
		super();
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.servicioSpa = servicioSpa;
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

	public String getServicioSpa() {
		return servicioSpa;
	}

	public void setServicioSpa(String servicioSpa) {
		this.servicioSpa = servicioSpa;
	}

	@Override
	public String toString() {
		return "HotelLujo [nombre=" + nombre + ", numHabitaciones=" + numHabitaciones + ", servicioSpa=" + servicioSpa
				+ "]";
	}

}
