package com;

public class Principal {

	public static void main(String[] args) {

		// Lamda - Son expresiones o funciones 
		// "anonimas" que implementan un m�todo
		// de una interface funcional.
		// Lo cual nos permite escribir el m�todo
		// para su uso inmediato
		// Sin necesaidad de que una clase defina
		// el C�MO va a realizarse
		// Su operador es (->)
		// Su sintaxis es (parametros)->(cuerpo de lamda)
		
		// Traemos una instancia de la interface funcional
		// Y definimos c�mo realizar ese m�todo con los par�metros
		// que tiene
		IMetodo suma = (a, b) -> System.out.println("La suma es: " + (a+b));

		// Una vez definido, podemos hacer un uso inmediato de ese m�todo
		suma.operacion(15, 6);
		
		IMetodo resta=(i, j)->System.out.println("La resta es: " + (i-j));
		resta.operacion(15, 6);
		
	}

}
