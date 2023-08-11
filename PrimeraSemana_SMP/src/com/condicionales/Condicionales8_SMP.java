package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SMP {
	public static void main(String[] args) {

		/*
		 * 8. Realiza un programa que pida por teclado el resultado (dato entero)
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		 * letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		 * caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		 * mostrará el mensaje: “ERROR: número incorrecto”.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
		int resultadoDado = scanner.nextInt();

		String caraOpuesta = "";

		if (resultadoDado >= 1 && resultadoDado <= 6) {
			int numeroOpuesto = 7 - resultadoDado;
			caraOpuesta = obtenerNumeroEnLetras(numeroOpuesto);

			System.out.println("El número en la cara opuesta es: " + caraOpuesta);
		} else {
			System.out.println("ERROR: número incorrecto");
		}

		scanner.close();
	}

	public static String obtenerNumeroEnLetras(int numero) {
		switch (numero) {
		case 1:
			return "uno";
		case 2:
			return "dos";
		case 3:
			return "tres";
		case 4:
			return "cuatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		default:
			return "";
		}

	}
}
