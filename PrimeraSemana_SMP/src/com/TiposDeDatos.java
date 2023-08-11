package com;

public class TiposDeDatos {
	public static void main(String[] args) {

		byte numeroByte = (byte) 129;
		System.out.println("Valor byte:" + numeroByte);
		System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
		System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

		short numeroShort = (short) 32768;
		System.out.println("numeroShort = " + numeroShort);
		System.out.println("Valor minimo short:" + Short.MIN_VALUE);
		System.out.println("Valor maximo short:" + Short.MAX_VALUE);

		int numeroInt = (int) 2147483648L;
		System.out.println("numeroInt = " + numeroInt);
		System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
		System.out.println("Valor maximo int:" + Integer.MAX_VALUE);

		long numeroLong = 9223372036854775807L;
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("Valor minimo long:" + Long.MIN_VALUE);
		System.out.println("Valor maximo long:" + Long.MAX_VALUE);

		/*
		 * tipos primitivos de tipo flotante: float y double
		 */

		float numeroFloat = (float) 3.4028235E38D;
		System.out.println("numeroFloat = " + numeroFloat);
		System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
		System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

		double numeroDouble = 1.7976931348623157E308;
		System.out.println("numeroDouble = " + numeroDouble);
		System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
		System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

		var numeroEntero = 10;
		System.out.println("numeroEntero = " + numeroEntero);

		var numeroDouble1 = 10.0;
		System.out.println("numeroDouble = " + numeroDouble1);

		var numeroFloat1 = 10.0F;
		System.out.println("numeroFloat = " + numeroFloat1);

		char miCaracter = 'a';
		System.out.println("miCaracter = " + miCaracter);

		char varChar = '\u0021';
		System.out.println("varChar = " + varChar);

		char varCharDecimal = 33;
		System.out.println("varCharDecimal = " + varCharDecimal);

		char varCharSimbolo = '!';
		System.out.println("varCharSimbolo = " + varCharSimbolo);

		var varChar1 = '\u0021';
		System.out.println("varChar1 = " + varChar1);

		var varCharDecimal2 = 33;
		System.out.println("varCharDecimal2 = " + varCharDecimal2);

		var varCharSimbolo3 = '!';
		System.out.println("varCharSimbolo3 = " + varCharSimbolo3);

		int variableEnteraSimbolo = '!';
		System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

		int letra = 'A';
		System.out.println("letra = " + letra);

	}
}
