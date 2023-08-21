package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Labda Son expresiones o funciones "anonimas" metodo de una interface
		 * funcional lo cual nos permite escribir el metodo para su uso inmediato sin
		 * necesidad de que una clase defina el COMO va a realizarse su operador es (->)
		 * Su sintaxis es (parametros) -> (cuerpo de lambda)
		 */

		/*
		 * Traemos una instancia de la interface funcional y definimos como realizar ese
		 * metodo con los parametros que tiene
		 */
		ICalculadora calculadora = (n) -> System.out.println(n + "Bienvenido a las expresiones Lambda");
		calculadora.mensaje("Sergio ");

	}

}
