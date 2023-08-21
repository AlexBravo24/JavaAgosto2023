package com;

public class Cuenta {
	//Plantilla de un objeto Cuenta
	//Definir atributos que tiene una Cuenta de banco
	
	//Como el HashMap ofrece la facilidad de almacenar
	//los datos en pares, entonces nuestra clave en el
	//HashMap sera el numero de cuenta, y el objeto cuenta
	//tendras los demás
	private String usuario;
	private String banco;
	private double saldo;
	private String tipoCuenta;
	private double saldoMin;
	private double saldoMax;
	
	public Cuenta() {}
	
	public Cuenta(String usuario, String banco, double saldo, String tipoCuenta, double saldoMin, double saldoMax) {
		super();
		this.usuario = usuario;
		this.banco = banco;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
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

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", banco=" + banco + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}
	

}
