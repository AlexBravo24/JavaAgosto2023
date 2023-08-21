package com;

public class Fuente {
	
	private String marca;
	private int potencia;
	private String certificacion;
	private String factordeforma;
	
	public Fuente() {}

	public Fuente(String marca, int potencia, String certificacion, String factordeforma) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.certificacion = certificacion;
		this.factordeforma = factordeforma;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	public String getFactordeforma() {
		return factordeforma;
	}

	public void setFactordeforma(String factordeforma) {
		this.factordeforma = factordeforma;
	}

	@Override
	public String toString() {
		return "Fuente [marca=" + marca + ", potencia=" + potencia+"W" + ", certificacion=" + certificacion + ", factordeforma="
				+ factordeforma + "]";
	}

}
