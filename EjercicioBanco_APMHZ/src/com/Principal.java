package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		// Crear el HashMap que nos va a ayudar a simular
		// una pequeña base de datos
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		// Podemos almacenar objetos en el HashMap de dos formas
		// La primera sería creando cada objeto cuenta individual
		// y asignarlo posteriormente
		Cuenta alanis = new Cuenta("Alanis", 20000, 500, 30000, "Débito");
		cuentas.put(1001, alanis);
		
		// Otra forma de almacenar cuentas en nuestro HashMap es
		// creando las cuentas directamente en el
		cuentas.put(1002, new Cuenta("Cesar", 15000, 1000, 20000, "Débito"));
		cuentas.put(1003, new Cuenta("Oscar", 5000, 500, 50000, "Débito"));
		cuentas.put(1004, new Cuenta("Sergio", 8000, 1000, 60000, "Débito"));
		cuentas.put(1005, new Cuenta("Rafael", 500, 100, 100000, "Débito"));
		cuentas.put(1006, new Cuenta("Guadalupe", 11000, 1000, 20000, "Débito"));
		
		//System.out.println(cuentas.get(1006));
		// Las operaciones recaen en nuestro objeto cajero y
		// el se encargará de realizarlas de acuerdo a sus
		// propios metodos
		
		// Instanciamos o creamos un Cajero que realizara 
		// dichas operaciones
		Cajero cajero1 = new Cajero("Polanco, CDMX", cuentas);
		// Consultar la informacion de una cuenta especifica
		// o buscarla 
		// Quien se encarga de eso es el cajero
//		System.out.println(cajero1.buscarCuenta(1001));
//		
//		// Probando el metodo depositar
//		System.out.println(cajero1.depositar(1005, 50000));
//		
//		// Probar depositar a una cuenta que no existe
//		System.out.println(cajero1.depositar(1010, 1000));
//		
//		// Probando el método depositar con un deposito mayor 
//		// al saldo máximo
//		System.out.println(cajero1.depositar(1006, 25000));
//		
//		// Probando el método depositar que sumado al saldo
//		// exceda el saldoMaximo
//		System.out.println(cajero1.depositar(1006, 10000));
		
//		// Probando el método retirar exitosamente
//		System.out.println(cajero1.retirar(1001, 5000));
		
//		// Probando el método retirar excediendo el limite del cajero
//		System.out.println(cajero1.retirar(1001, 10000));
		
//		// Probando el metodo retirar excediente el minimo permitido
//		System.out.println(cajero1.retirar(1005, 450));
		
//		// Probando el método retirar de una cuenta con saldo insuficiente
//		System.out.println(cajero1.retirar(1005, 1000));
		
		// Probando los métodos de transferencia exitosa
		System.out.println(cajero1.transferir(1001, 1005, 10000));
		System.out.println(cajero1.buscarCuenta(1005));
		
		// Como actividad sugerida
		// Realizar un ejercicio que simule una maquina expendedora
		

	}

}
