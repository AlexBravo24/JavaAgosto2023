package com;

import java.util.Date;

public class Ticket {
	private int folioOperacion;
	private Date fechaHora;
	private String nombreUsuario;
	private double saldo;
	private String sucursal;
	private int idCajero;

	public Ticket() {
	}

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

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", nombreUsuario="
				+ nombreUsuario + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}

	

}
