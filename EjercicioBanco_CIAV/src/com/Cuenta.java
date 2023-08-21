package com;

public class Cuenta {
	
	//Atributos de una cuenta de banco
	//Los objetos que vayamos a crear de esta plantilla los almacenamos
	//en un HashMap, permitiendonos que la clave para almacenar dichos
	//objetos, haga el papel de Numero de Cuenta
	
	private String nombreUsuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipoCuenta;
	
	public Cuenta () {}

	public Cuenta(String nombreUsuario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipoCuenta = tipoCuenta;
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

	public final double getSaldoMin() {
		return saldoMin;
	}

	public final void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public final double getSaldoMax() {
		return saldoMax;
	}

	public final void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public final String getTipoCuenta() {
		return tipoCuenta;
	}

	public final void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [nombreUsuario=" + nombreUsuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax="
				+ saldoMax + ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
}
