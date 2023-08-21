package com;

import java.util.Map;

public class Cajero implements IMetodos{
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	private int folioContador = 1;
	
	public Cajero () {}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(int numeroCuenta) {
		// Instanciamos primeramente un objeto Cuenta
		Cuenta cuenta = null;
		
		//Buscamos dentro de las llaves del HashMap el objeto cuenta
		//Lo asignamos a este objeto para devolver dicho valor
		
		cuenta = cuenta.g
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket transferir(int numCuentaOrigen, int numCuentaDestino, double monto) {
		// TODO Auto-generated method stub
		return null;
	};
	
	
	
	
}
