package com;

public interface IMetodos {
	
	//M�todos que..
	
	public Cuenta buscarCuenta (int numeroCuenta);
	//Creamos un m�todo para realizar un deposito
	//Una
	public Ticket depositar(int numeroCuenta, double monto);
	//Metodo para retirar
	public Ticket retirar(int numeroCuenta, double monto);
	//Metodo para transferir
	public Ticket transferir(int numCuentaOrigen,int numCuentaDestino, double monto);

}
