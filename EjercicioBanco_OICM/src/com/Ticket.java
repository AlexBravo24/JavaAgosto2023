package com;

import java.util.Date;

public class Ticket {
	
	//ESte objeto va a ser el auxiliar en brindar
	//una respuesta si se lleva acabo la operacion
	//del cajero automatico
	
	private int folioOperacion;
	private Date fechaHora;
	private String nombreUsuario;
	private double saldo;
	private String sucursal;
	private int idcajero;
	
	public Ticket(){}

	public Ticket(int folioOperacion, Date fechaHora, String nombreUsuario, double saldo, String sucursal,
			int idcajero) {
		super();
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.nombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", nombreUsuario="
				+ nombreUsuario + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}
	

}
