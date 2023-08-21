package com;

public class HotelEstandar {
	private String nombre;
	private int numHabitaciones;
	private boolean desayunoIncluido;
	private boolean teléfonoPrivado;

	public HotelEstandar() {
	}

	public HotelEstandar(String nombre, int numHabitaciones, boolean desayunoIncluido, boolean teléfonoPrivado) {
		super();
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.desayunoIncluido = desayunoIncluido;
		this.teléfonoPrivado = teléfonoPrivado;
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

	public boolean isDesayunoIncluido() {
		return desayunoIncluido;
	}

	public void setDesayunoIncluido(boolean desayunoIncluido) {
		this.desayunoIncluido = desayunoIncluido;
	}

	public boolean isTeléfonoPrivado() {
		return teléfonoPrivado;
	}

	public void setTeléfonoPrivado(boolean teléfonoPrivado) {
		this.teléfonoPrivado = teléfonoPrivado;
	}

	@Override
	public String toString() {
		return "HotelEstandar [nombre=" + nombre + ", numHabitaciones=" + numHabitaciones + ", desayunoIncluido="
				+ desayunoIncluido + ", teléfonoPrivado=" + teléfonoPrivado + "]";
	}

}
