package com;

public class Procesador {
	
	private String marca;
	private String modelo;
	private int nucleos;
	private int hilos;
	private double frecuencia;
	
	
	public Procesador () {}


	public Procesador(String marca, String modelo, int nucleos, int hilos, double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.frecuencia = frecuencia;
	}


	public final String getMarca() {
		return marca;
	}


	public final void setMarca(String marca) {
		this.marca = marca;
	}


	public final String getModelo() {
		return modelo;
	}


	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public final int getNucleos() {
		return nucleos;
	}


	public final void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}


	public final int getHilos() {
		return hilos;
	}


	public final void setHilos(int hilos) {
		this.hilos = hilos;
	}


	public final double getFrecuencia() {
		return frecuencia;
	}


	public final void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nucleos=" + nucleos + ", hilos=" + hilos
				+ ", frecuencia=" + frecuencia + "]";
	}
	
	
	
	
	
}
