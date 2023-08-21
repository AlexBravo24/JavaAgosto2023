package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		
		// Crear el HashMap que nos va a ayudar a simular
		//una pequeña base de datos
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Podemos almacenar objetos en el HashMap de dos formas
		//La primera seria creando cada objeto cuenta individual
		//y asignarlo posteriormente
		Cuenta alanis = new Cuenta("Alanis", 20000, 500, 30000, "Debito");
		
		cuentas.put(1001, alanis);
		
		//Otra forma de almacenar cuentas en nuestro HashMap es
		//Creando las cuentas directamente en el
		cuentas.putIfAbsent(1002, new Cuenta("Cesar", 15000, 10000, 20000, "Debito"));
		cuentas.putIfAbsent(1003, new Cuenta("Oscar", 5000, 500, 50000, "Debito"));
		cuentas.putIfAbsent(1004, new Cuenta("Sergio", 8000, 1000, 60000, "Debito"));
		cuentas.putIfAbsent(1005, new Cuenta("Rafael", 500, 100, 100000, "Debito"));
		cuentas.putIfAbsent(1006, new Cuenta("Guadalupe", 11000, 1000, 20000, "Debito"));
		
//		System.out.println(cuentas.get(1006));
		
		//Las operaciones recaen en nuestro objeto Cajero y 
		//el se encargara de realizarlas de acuerdo a sus propios metodos
		
		//Instanciamos o creamos un Cajero que realizara dichas operaciones
		Cajero cajero1 = new Cajero("Polanco, CDMX", cuentas);
		//Consultar la informacion de una cuenta especifica o Buscarla
		//Quien se encarga de eso ya es el cajero
//		System.out.println(cajero1.buscarCuenta(1001));
		
//		System.out.println(cajero1.depositar(1005, 50000));
		
		//Probar el metodo depositar a una cuenta que no existe
//		System.out.println(cajero1.depositar(1010, 1000));
		
		//Probar el metodo depositar con un deposito mayor al saldoMaximo
//		System.out.println(cajero1.depositar(1006, 10000));
		
		//Probando el metodo depositar con un deposito que sumando al
		//saldo exceda el saldoMaximo
//		System.out.println(cajero1.depositar(1006, 10000));
		
		//Probando el metodo retirar exitoso
//		System.out.println(cajero1.retirar(1001, 5000));
//		System.out.println(cajero1.retirar(1001, 5000));
		
		//Probando el metodo retirar excediendo el limite del cajero
//		System.out.println(cajero1.retirar(1001, 10000));
		
		//Probando el metodo retirar de una cuenta con saldo insuficiente
//		System.out.println(cajero1.retirar(1005, 450));
		
		//Probando los metodos de transferencia exitosos
		System.out.println(cajero1.transferir(1001, 1005, 100000));
		System.out.println("---------------------------------------------");
		System.out.println(cajero1.buscarCuenta(1005));
		
		//Como actividad sugerida
		//Realizar un ejercicio qu esimule una maquina Expendedora.
		
	}

}
