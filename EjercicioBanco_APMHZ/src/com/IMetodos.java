package com;

public interface IMetodos {

	// Metodos que la clase encargada de la logica
	// de las operaciones, tendria que implementar
	// estas operaciones seran implementafas en 
	// este caso por la clase Cajero
	
	// Declararemos metodos que devuelvan un valor
	
	// El cajeto antes de realizar operaciones
	// Tiene que identificar sobre que cuenta
	// se van a realizar dichas operaciones.
	// Buscamos la cuenta en el HashMap por 
	// su llave que simularia el numeroCuenta
	public Cuenta buscarCuenta(int numCuenta);
	// Para las siguientes operaciones 
	// (depositar, retirar, transferir)
	// Si se realizan con exito una vez se identifico
	// la cuenta, se devuelve una respuesta con
	// nuestro objeto Ticket
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar(int numCuenta, double monto);
	public Ticket transferir(int cuentaOrigen, int cuentaDestino,  double monto);
	
	
	
}
