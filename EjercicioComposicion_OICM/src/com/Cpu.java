package com;

public class Cpu {
	
	private String modelo;
	private int nucleos;
	private int subprocesos;
	private double Frecuencia;
	
	public Cpu() {}

	public Cpu(String modelo, int nucleos, int subprocesos, double frecuencia) {
		super();
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.subprocesos = subprocesos;
		Frecuencia = frecuencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public int getSubprocesos() {
		return subprocesos;
	}

	public void setSubprocesos(int subprocesos) {
		this.subprocesos = subprocesos;
	}

	public double getFrecuencia() {
		return Frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		Frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Cpu [modelo=" + modelo + ", nucleos=" + nucleos + ", subprocesos=" + subprocesos + ", Frecuencia="
				+ Frecuencia + "]";
	}
	
	

}
