package com;

public class FechaHora {
	
	private String diaSem;
	public int diaMes;
	public int Mes;
	public int a�o;
	
	public int hora;
	public int minunto;
	
	public FechaHora () {}

	public FechaHora(String diaSem, int diaMes, int mes, int a�o, int hora, int minunto) {
		super();
		this.diaSem = diaSem;
		this.diaMes = diaMes;
		Mes = mes;
		this.a�o = a�o;
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

	public final int getA�o() {
		return a�o;
	}

	public final void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "FechaHora [diaSem=" + diaSem + ", diaMes=" + diaMes + ", Mes=" + Mes + ", a�o=" + a�o + ", hora=" + hora
				+ ", minunto=" + minunto + "]";
	}
	

}
