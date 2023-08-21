package com;

public class TarjetaMadre {
	
	private String Marca;
	private String factorDeForma;
	private String modelo;
	
	public TarjetaMadre () {}

	public TarjetaMadre(String marca, String factorDeForma, String modelo) {
		super();
		Marca = marca;
		this.factorDeForma = factorDeForma;
		this.modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getFactorDeForma() {
		return factorDeForma;
	}

	public void setFactorDeForma(String factorDeForma) {
		this.factorDeForma = factorDeForma;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "TarjetaMadre [Marca=" + Marca + ", factorDeForma=" + factorDeForma + ", modelo=" + modelo + "]";
	}

}
