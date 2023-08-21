package com;

public class Cuenta {
	
	// Atributos de una cuenta de banco
	// Los objetos que vayamos a crear de esta plantilla
	// los almacenaremos en un HashMap
	// Permitiendonos que la clave para almacenar
	// dichos objetos, haga el papel de numeroCuenta (key)
	private String nombreUsuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipoCuenta;
	
	// Constructores
	public Cuenta() {
		
	}

	public Cuenta(String nombreUsuario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipoCuenta = tipoCuenta;
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

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [nombreUsuario=" + nombreUsuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax="
				+ saldoMax + ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
	
	
}
