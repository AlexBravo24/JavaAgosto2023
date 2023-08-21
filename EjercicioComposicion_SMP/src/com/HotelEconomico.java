package com;

public class HotelEconomico {
	private String nombre;
	private int numHabitaciones;
	private double precioPorNoche;
	private int bañoPrivado;
	private int habitacionesIndividuales;
	private String mobiliarioSensillo;

	public HotelEconomico() {
	}

	public HotelEconomico(String nombre, int numHabitaciones, double precioPorNoche, int bañoPrivado,
			int habitacionesIndividuales, String mobiliarioSensillo) {
		super();
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.precioPorNoche = precioPorNoche;
		this.bañoPrivado = bañoPrivado;
		this.habitacionesIndividuales = habitacionesIndividuales;
		this.mobiliarioSensillo = mobiliarioSensillo;
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

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public int getBañoPrivado() {
		return bañoPrivado;
	}

	public void setBañoPrivado(int bañoPrivado) {
		this.bañoPrivado = bañoPrivado;
	}

	public int getHabitacionesIndividuales() {
		return habitacionesIndividuales;
	}

	public void setHabitacionesIndividuales(int habitacionesIndividuales) {
		this.habitacionesIndividuales = habitacionesIndividuales;
	}

	public String getMobiliarioSensillo() {
		return mobiliarioSensillo;
	}

	public void setMobiliarioSensillo(String mobiliarioSensillo) {
		this.mobiliarioSensillo = mobiliarioSensillo;
	}

	@Override
	public String toString() {
		return "HotelEconomico [nombre=" + nombre + ", numHabitaciones=" + numHabitaciones + ", precioPorNoche="
				+ precioPorNoche + ", bañoPrivado=" + bañoPrivado + ", habitacionesIndividuales="
				+ habitacionesIndividuales + ", mobiliarioSensillo=" + mobiliarioSensillo + "]";
	}

}
