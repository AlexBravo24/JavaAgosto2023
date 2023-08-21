package com;


import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {
	
	
	private String sucursal;
	private HashMap<Integer,Cuenta> cuentas;//Le damos acceso
	//al cajero a la informacion de las cuentas
	private int folio=1; //Dejamos el folio iniciado
	//para que se incremente en el Ticket cada que se realice
	//una operacion con exito
	
	public Cajero() {}
	
	public Cajero(String sucursal, HashMap<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
	@Override
	public Cuenta buscarCuenta(int numeroCuenta) {
		//Buscar la cuenta sobre la cual vamos a realizar operaciones
		//Instanciar un objeto cuenta
		Cuenta cuenta = null; //Si la cuenta no existe, retorna ese valor
		
		//Busco dentro del HashMap esa cuenta
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}
	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		//Instanciamos un objeto Ticket vacío, que es el objeto que
		//el método debe devolver como respuesta
		Ticket ticket = null;	
		//Si nuestro método de buscar cuenta localiza la cuenta
		//sobre la cual vamos a actuar
		//Realizamos algunas validaciones
		if(buscarCuenta(numeroCuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Validaciones
		if(monto>cuenta.getSaldoMax()) {
			System.out.println("El monto excede el saldo máximo permitido en la cuenta");
			return ticket;
		}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
			System.out.println("El monto más el saldo actual de la cuenta, excederían el máximo permitido");
			return ticket;
		}else {//Si podemos depositar el monto
cuenta.setSaldo(cuenta.getSaldo()+monto);
ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, monto, 1);
return ticket;			
		}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}
	
	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if(buscarCuenta(numeroCuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Validaciones
		//Condicionando si la operacion excede el limite permitido por
		//el cajero
		if(monto>9000) {//Si el monto a retirar es mayor a 9000
			System.out.println("El monto excede el máximo permitido por el cajero");
			return ticket;
		}else if (cuenta.getSaldo()<monto) {//Si el saldo de la cuenta
			//es menor al monto que quiero retirar
			System.out.println("Saldo insuficiente para realizar el retiro");
			return ticket;
		}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			return ticket;
		}else {//Si el retiro puede realizarse
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, monto, 1);
			return ticket;
		}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}
	@Override
	public Ticket transferir(int numCuentaOrigen, int numCuentaDestino, double monto) {
		Ticket ticket = null;
		
		//Ahora buscamos 2 cuentas de usuario para esta operacion
		if(buscarCuenta(numCuentaOrigen)!=null && buscarCuenta(numCuentaDestino)!=null) {
			Cuenta origen = buscarCuenta(numCuentaOrigen);
			Cuenta destino = buscarCuenta(numCuentaDestino);
		//Validaciones
		//Si la cuenta de origen tiene un saldo menor al monto que quiere transferir
		if(origen.getSaldo()<monto) {
			System.out.println("No hay fondos suficientes para realizar la transferencia");
			return ticket;
		}else if(origen.getSaldo()-monto<origen.getSaldoMin()) {
			System.out.println("La transferencia dejaría por debajo del mímino a la cta origen");
			return ticket;
		}else if(monto>destino.getSaldoMax()) {
			System.out.println("El monto excede el máximo permitido en la cta destino");
			return ticket;
		}else if(destino.getSaldo()+monto>destino.getSaldoMax()) {
			System.out.println("La transferencia excedería el saldo max en la cta destino");
			return ticket;
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			ticket = new Ticket(folio++, new Date(), origen.getUsuario(), origen.getSaldo(), sucursal, monto, 1);
			return ticket;
		}	
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	}
}
