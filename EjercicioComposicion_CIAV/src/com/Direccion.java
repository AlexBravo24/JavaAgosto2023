package com;

public class Direccion {
	
	public String calle;
	public int numero;
	public String colonia;
	public String municipio;
	public String estado;
	
	public Direccion () {}

	public Direccion(String calle, int numero, String colonia, String municipio, String estado) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
	}

	public final String getCalle() {
		return calle;
	}

	public final void setCalle(String calle) {
		this.calle = calle;
	}

	public final int getNumero() {
		return numero;
	}

	public final void setNumero(int numero) {
		this.numero = numero;
	}

	public final String getColonia() {
		return colonia;
	}

	public final void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public final String getMunicipio() {
		return municipio;
	}

	public final void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public final String getEstado() {
		return estado;
	}

	public final void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + ", municipio=" + municipio
				+ ", estado=" + estado + "]";
	}
	
	
	
}
