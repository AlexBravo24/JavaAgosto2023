package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Crear la pequeña base de datos de las cuentas
		
		HashMap<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		//Creamos primero la cuenta
		Cuenta juan = new Cuenta("Oscar", "BBVA", 10000.90, "Débito", 1000, 20000);
		//Guardamos la cuenta en una llave, y asignamos ese valor de ese objeto cuenta
		cuentas.put(1001, juan);
		
		//Otra manera de guardar cuentas en nuestro HashMap directamente
		cuentas.put(1002, new Cuenta("Juan Pablo", "BBVA", 21000.90, "Débito", 500, 50000));
		cuentas.put(1003, new Cuenta("Esmeralda", "BBVA", 11000.90, "Débito", 500, 50000));
		cuentas.put(1004, new Cuenta("Maricela", "BBVA", 210000.90, "Débito", 500, 350000));
		cuentas.put(1005, new Cuenta("Antonio", "BBVA", 4100.90, "Débito", 500, 10000));
		cuentas.put(1006, new Cuenta("Jonathan", "BBVA", 15000.90, "Débito", 100, 500000));
		
		//Las operaciones las va a realizar el objeto que creamos de Cajero
		Cajero cajero1 = new Cajero("Polanco, CDMX", cuentas);
		Cajero veracruz = new Cajero ("Mocambo, VER", cuentas);
		
		//Las operaciones las va a realizar el cajero a través de sus métodos
		//Consultar una cuenta existente a través del cajero
		System.out.println(cajero1.buscarCuenta(1008));
		
		//Probar el método de depositar a una cuenta
		System.out.println(cajero1.depositar(1005, 1000.50));
		
		System.out.println(cajero1.depositar(1005, 2000));
		
		//Probar el método para retirar a una cuenta
		System.out.println(cajero1.retirar(1005, 6700));
		
		//Probar el método para transferir
		System.out.println(cajero1.transferir(1004, 1004, 20000));
		System.out.println(cajero1.buscarCuenta(1004));
		
		//Puede intentar simular el funcionamiento de una maquina expendedora de dulces
		
		
	}

}
