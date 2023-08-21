package com;

public class Hotel {

	private String nombre;
	private int numHabitaciones;
	private double precioPorNoche;

	private HotelEconomico unaestrella;
	private HotelEstandar dosestrellas;
	private HotelLujo cuatroestrellas;
	private HotelResort cincoestrellas;

	public Hotel() {

	}

	public Hotel(String nombre, int numHabitaciones, double precioPorNoche, HotelEconomico unaestrella,
			HotelEstandar dosestrellas, HotelLujo cuatroestrellas, HotelResort cincoestrellas) {
		super();
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.precioPorNoche = precioPorNoche;
		this.unaestrella = unaestrella;
		this.dosestrellas = dosestrellas;
		this.cuatroestrellas = cuatroestrellas;
		this.cincoestrellas = cincoestrellas;
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

	public HotelEconomico getUnaestrella() {
		return unaestrella;
	}

	public void setUnaestrella(HotelEconomico unaestrella) {
		this.unaestrella = unaestrella;
	}

	public HotelEstandar getDosestrellas() {
		return dosestrellas;
	}

	public void setDosestrellas(HotelEstandar dosestrellas) {
		this.dosestrellas = dosestrellas;
	}

	public HotelLujo getCuatroestrellas() {
		return cuatroestrellas;
	}

	public void setCuatroestrellas(HotelLujo cuatroestrellas) {
		this.cuatroestrellas = cuatroestrellas;
	}

	public HotelResort getCincoestrellas() {
		return cincoestrellas;
	}

	public void setCincoestrellas(HotelResort cincoestrellas) {
		this.cincoestrellas = cincoestrellas;
	}

	@Override
	public String toString() {
		return "Hotel [\nnombre=" + nombre + ", \nnumHabitaciones=" + numHabitaciones + ", \nprecioPorNoche=" + precioPorNoche
				+ ", \nunaestrella=" + unaestrella + ", \ndosestrellas=" + dosestrellas + ", \ncuatroestrellas="
				+ cuatroestrellas + ", \ncincoestrellas=" + cincoestrellas + "]";
	}

}
