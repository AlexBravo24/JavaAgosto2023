package com;

public class Principal {
	public static void main(String[] args) {

		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica(10, 5);

		System.out.println(calculadoraCientifica.toString());
		//toString devuelve una cadena que "representa textualmente el objeto calculadora"
		System.out.println("Suma: " + calculadoraCientifica.sumar());
		System.out.println("Resta: " + calculadoraCientifica.restar());
		System.out.println("Multiplicación: " + calculadoraCientifica.multiplicar());

		try {
			System.out.println("División: " + calculadoraCientifica.dividir());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
