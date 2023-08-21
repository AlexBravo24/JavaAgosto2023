package com;

import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {

	// Esta clase sera la encargada de 
	// implementar las acciones o logica
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	private int folioContador = 1;
	
	public Cajero() {
		 
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		// Instanciamos primeramente un objeto
		// cuenta vacio
		Cuenta cuenta = null;
		// Buscamos dentro de las llaves del HashMap
		// El objeto cuenta y lo asignamos a ese
		// objeto para devolver dicho valor
		cuenta = cuentas.get(numCuenta);
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Nuestro método devuelve el valor de un Ticket,
		// así que instanciamos un vacío de momento
		Ticket ticket = null;
		// Antes de realizar el depósito, el cajero debe
		// buscar que la cuenta exista
		if(buscarCuenta(numCuenta) != null) {
			// Si el método buscar cuenta, encuentra una a la cual
			// realizarle el depósito, realizaremos lo sig:
			// Asignamos el valor de la cuenta que se busca, a un 
			// objeto manipulable aquí para editar sus valores (saldo)
			Cuenta cuenta = buscarCuenta(numCuenta);
			// Realizamos ciertas validaciones
			// Validamos  si el depósito es mayor que el saldoMaximo,
			// no se realizara la operacion
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return ticket; // La operacion no se realiza, se retorna el valor de ticket
				// que hasta el momento es nulo
				// Siguiente validacion
				// Si el saldo que tiene la cuenta, más el monto a depositar
				// exceden el saldo máximo de la cuenta
			} else if (cuenta.getSaldo()+monto > cuenta.getSaldoMax()) {
				System.out.println("Si realiza esta operacion, el saldo de la cuenta excedría el saldo máximo");
				return ticket;
				// Siguiente validacion
				// Si el deposito si puede realizarse
			} else { // se realiza el deposito, es decir actualizamos el saldo de la cuenta
				// al cual le sumamos el monto que se la va a depositar
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				// Como la operacion si se va a realizar, emitimos un ticket
				ticket = new Ticket(folioContador++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, 101);
				return ticket;
			}
			
			
		} else { // Si el método no encuentra una cuenta existente
			System.out.println("No hay una cuenta asociada a ese cliente");
		}
		return null;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket ticket = null;
		
		if(buscarCuenta(numCuenta) != null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			// validamos para actualizar el saldo de la cuenta
			// Ahora es un retiro
			// Primera validacion
			// Existe un limite de retiro especificado por el cajero
			if(monto>9000) {
				System.out.println("Solo puedes retirar hasta 9000 pesos");
				return ticket;
				// Siguiente validacion
				// Si el saldo de la cuenta es menor que el monto a retirar
			} else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
				// Siguiente validacion
				// Si el saldo de la cuenta menos el monto, la dejan por 
				// debajo del saldoMinimo
			} else if(cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("Si realiza un retiro por esa cantidad, su saldo quedaria por debajo del minimo permitido");
				return ticket;
			} else { // Si el retiro puede realizarse, actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folioContador++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, 101);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
		}
		
		return null;
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		// Tendriamos que buscar 2 cuentas para realizar este método
		if(buscarCuenta(cuentaOrigen) != null && buscarCuenta(cuentaDestino) != null) {
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			// Si encontramos las cuentas se realizan las siguientes validaciones
			// Si el saldo de la cuenta de origen es menor al monto a transferir
			if(origen.getSaldo() < monto) {
				System.out.println("No hay fondos suficiente para realizar la transferencia");
				return ticket;
				// Si el saldo de la cuenta origen menos el monto, la deja por debajo del 
				// saldoMinimo
			} else if(origen.getSaldo() - monto < origen.getSaldoMin()) {
				System.out.println("La transferencia dejaría por debajo del mínimo a la cuenta");
				return ticket;
				// si el monto a transferir es mayor que el saldo maximo de la cuenta destino
			} else if(monto > destino.getSaldoMax()) {
				System.out.println("El monto supera el saldo máximo permitido en la cuenta destino");
				return ticket;
				// Si el saldo de la cuenta destino + el monto de transferencia excede 
				// el monto máximo
			} else if(destino.getSaldo() + monto > destino.getSaldoMax()) {
				System.out.println("Si realiza esta operacion el saldo de la cuenta destino excedería el máximo permitido");
				return ticket;
				// si la transferencia puede realizarse
			} else { // Actualizamos el saldo de ambas cuentas
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folioContador++, new Date(), origen.getNombreUsuario(), origen.getSaldo(), sucursal, 101);
				return ticket;
			}
		} else {
			System.out.println("Uno de los clientes no tiene cuenta asociada");
			return ticket;
		}
		
	}
	
	
	
	
	
}
