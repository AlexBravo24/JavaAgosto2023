package com;

public class Celular {
	
	private String pantalla;
	private double capacidadAlm;
	private String camara;
	private int peso;
	private double ram;
	
	public Celular() {
		
	}

	public Celular(String pantalla, double capacidadAlm, String camara, int peso, double ram) {
		super();
		this.pantalla = pantalla;
		this.capacidadAlm = capacidadAlm;
		this.camara = camara;
		this.peso = peso;
		this.ram = ram;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public double getCapacidadAlm() {
		return capacidadAlm;
	}

	public void setCapacidadAlm(double capacidadAlm) {
		this.capacidadAlm = capacidadAlm;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [pantalla=" + pantalla + ", capacidadAlm=" + capacidadAlm + ", camara=" + camara + ", peso="
				+ peso + ", ram=" + ram + "]";
	}
	
}
