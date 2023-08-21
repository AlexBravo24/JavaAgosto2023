package com;

public class Servicio {
	
	public String tipoServicio;
	public boolean conReparto;
	public Direccion direccion;
	
	public Servicio () {}

	public Servicio(String tipoServicio, boolean conReparto, Direccion direccion) {
		super();
		this.tipoServicio = tipoServicio;
		this.conReparto = conReparto;
		this.direccion = direccion;
	}

	public final String getTipoServicio() {
		return tipoServicio;
	}

	public final void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public final boolean isConReparto() {
		return conReparto;
	}

	public final void setConReparto(boolean conReparto) {
		this.conReparto = conReparto;
	}

	public final Direccion getDireccion() {
		return direccion;
	}

	public final void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Servicio [tipoServicio=" + tipoServicio + ", conReparto=" + conReparto + "]";
	}
	
	
	
	
}
