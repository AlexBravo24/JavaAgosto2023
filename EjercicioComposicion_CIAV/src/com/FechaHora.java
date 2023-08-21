package com;

public class FechaHora {
	
	private String diaSem;
	public int diaMes;
	public int Mes;
	public int año;
	
	public int hora;
	public int minunto;
	
	public FechaHora () {}

	public FechaHora(String diaSem, int diaMes, int mes, int año, int hora, int minunto) {
		super();
		this.diaSem = diaSem;
		this.diaMes = diaMes;
		Mes = mes;
		this.año = año;
		this.hora = hora;
		this.minunto = minunto;
	}

	public final String getDiaSem() {
		return diaSem;
	}

	public final void setDiaSem(String diaSem) {
		this.diaSem = diaSem;
	}

	public final int getDiaMes() {
		return diaMes;
	}

	public final void setDiaMes(int diaMes) {
		this.diaMes = diaMes;
	}

	public final int getMes() {
		return Mes;
	}

	public final void setMes(int mes) {
		Mes = mes;
	}

	public final int getAño() {
		return año;
	}

	public final void setAño(int año) {
		this.año = año;
	}

	public final int getHora() {
		return hora;
	}

	public final void setHora(int hora) {
		this.hora = hora;
	}

	public final int getMinunto() {
		return minunto;
	}

	public final void setMinunto(int minunto) {
		this.minunto = minunto;
	}

	@Override
	public String toString() {
		return "FechaHora [diaSem=" + diaSem + ", diaMes=" + diaMes + ", Mes=" + Mes + ", año=" + año + ", hora=" + hora
				+ ", minunto=" + minunto + "]";
	}
	

}
