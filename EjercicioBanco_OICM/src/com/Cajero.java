package com;

import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {
	
	//Esta clase sera la encargada de 
	//implementar las acciones o logica
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	private int folioContador = 1;
	
	public Cajero() {}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos primeramente un objeto Cuenta
		//vacio
		Cuenta cuenta = null;

		//Buscamos dentro de las llaves del HashMap 
		//El objeto cuenta y lo asignamos a este objeto 
		//para devolver dicho valor
		cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Nuestro metodo devuelve el valor de un Ticket, asi
		//que instanciamos un vacio de momento
		Ticket ticket = null;
		//Antes de realizar el deposito, el cajero debe buscar
		//que la cuenta exista
		if(buscarCuenta(numCuenta) !=null) {
			//Si el metodo buscar cuenta, encuentra una a la cual
			//realizar el deposito, realizaremos todo lo siguiente:
			//Asignamos el valor de la cuenta que se busca, a un objeto
			//manipulable aqui para editar sus valores (saldo)
		Cuenta cuenta = buscarCuenta(numCuenta);
		//Realizamos ciertas validaciones
		//validamos si el deposito excede el saldoMaximo permitido
		//por la cuenta
		//si el monto a depositar es mayor que el saldoMaximo, no se realiza
		//la operacion
		if(monto > cuenta.getSaldoMax()) {
			System.out.println("El monto excede el saldo maximo permitido en la cuenta");
			return ticket; //La operacion no se realiza, se retorna el valor de ticket
			//que hasta el momento es nulo
			//Siguiente validacion
			//si el saldo que tiene l acuenta, mas el monto a depositar
			//exceden el saldo maximo de la cuenta
		}else if(cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
			System.out.println("El saldo de la cuenta excederia el saldo maximo permitido");
			return ticket;
		//siguiente validacion 
			//Si el deposito si puede realizarse
		}else {//Se realiza el deposito, es decir, actualizamos el saldo de la cuenta
			cuenta.setSaldo(cuenta.getSaldo() + monto);
			//como la operacion si se va a realizar, emitimos un tiket
			ticket = new Ticket(folioContador++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, 101);
		}
		
		}else { //si el metodo no encuentra una cuenta existente
			System.out.println("No ha una cuenta asociada a ese cliente");
			return ticket;
		}
		return null;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		
		Ticket ticket = null;
		if(buscarCuenta(numCuenta) !=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Validamos para actualizar el saldo de la cuenta
			//Ahora es un retiro
			//Primera Validacion
			//Existe un limite de retiro especificado por el cajero mismo
			if(monto > 9000) {
				System.out.println("Solo puedes retirar hasta 9000 pesos");
				return ticket;
			//Siguiente validacion
			//si el saldo de la cuenta es menor al monto a retirar
			}else if(cuenta.getSaldo() < monto) {
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
			//Siguiente Validacion
			//si el saldo de la cuenta menos el monto, la dejan por debajo
			//del saldoMinimo
			}else if(cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			}else {// Si el retiro puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				ticket = new Ticket(folioContador++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, 101);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		//Tendriamos que buscar 2 cuentas para realizar este metodo
		if(buscarCuenta(cuentaOrigen) != null && buscarCuenta(cuentaDestino) != null) {
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
		//Si encontramos las cuentas, se realizan las siguientes validaciones
		//Si el saldo de la cuenta de origen es menor al monto transferir
			if(origen.getSaldo() < monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
			//Si el saldo de la cuenta origen menos el monto, la deja por debajo 
			//del saldoMinimo
			}else if(origen.getSaldo() - monto< origen.getSaldoMin()) {
				System.out.println("La transferencia dejaria por debajo del minimo a la cuenta");
				return ticket;
			//si el monto a transferir es mayor que el saldoMaximo de la cuenta destino
			}else if(monto > destino.getSaldoMax()) {
				System.out.println("El monto de la transferencia excede el Saldo "
						+ "Maximode de la cuenta destino");
				return ticket; 
			//Si el saldo de la cuenta destino mas el monto de transferencia 
		   //excede el saldo maximo
			}else if(destino.getSaldo() + monto > destino.getSaldoMax()) {
				System.out.println("El salde de la cuenta destino excederia el maximo "
						+ "permitido");
				return ticket;
			//Si la transferencia puede realizarse
			}else {//Actualizamos el salde de ambas cuentas
				origen.setSaldo(origen.getSaldo() - monto);
				destino.setSaldo(destino.getSaldo() + monto);
				ticket = new Ticket(folioContador++, new Date(), origen.getNombreUsuario(), origen.getSaldo(), sucursal, 101);
				return ticket;
			}
			
		}else {
			System.out.println("Alfuno de los clientes no tiene cuenta asociada");
		}
		
		return ticket;
	}
	
}
