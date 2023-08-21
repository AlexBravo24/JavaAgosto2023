package com;

import java.util.Date;

public class Ticket {
	
	//Este objeto va a ser el auxiliar en brindar una respuesta si se
	//lleva a cabo la operacion del cajero automatico
	
	private int folioOperacion;
	private Date fechaHora;
	private String nombreUsuario;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket () {}

	public Ticket(int folioOperacion, Date fechaHora, String nombreUsuario, double saldo, String sucursal,
			int idCajero) {
		super();
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.nombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public final int getFolioOperacion() {
		return folioOperacion;
	}

	public final void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public final Date getFechaHora() {
		return fechaHora;
	}

	public final void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public final String getNombreUsuario() {
		return nombreUsuario;
	}

	public final void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public final double getSaldo() {
		return saldo;
	}

	public final void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public final String getSucursal() {
		return sucursal;
	}

	public final void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public final int getIdCajero() {
		return idCajero;
	}

	public final void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}
	
	

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", nombreUsuario="
				+ nombreUsuario + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	

}
