package com;

public interface IMetodos {
	public Cuenta buscarCuenta(int numCuenta);

	// Metodo para retirar
	public Ticket retirar(int numCuenta, double monto);

	// Metodo para transferir
	public Ticket transferir(int CuentaOrigen, int CuentaDestino, double monto);
}
