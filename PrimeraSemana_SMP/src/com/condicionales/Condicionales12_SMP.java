package com.condicionales;

import java.util.Scanner;

public class Condicionales12_SMP {
	public static void main(String[] args) {
		/*
		 * 12.Construir un programa que calcule el índice de masa corporal de una
		 * persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se
		 * encuentra esa persona en función del valor de IMC. Nota 1: se recomienda el
		 * empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura)
		 * deben ser introducidos por teclado por el usuario.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese su peso en kg: ");
		double peso = scanner.nextDouble();

		System.out.print("Ingrese su altura en metros: ");
		double altura = scanner.nextDouble();

		double imc = peso / (altura * altura);
		String estado = "";

		if (imc < 16) {
			estado = "CRITERIO DE INGRESO AL HOSPITAL";
		} else {
			if (imc >= 16 && imc < 17) {
				estado = "INFRAPESO";
			} else {
				if (imc >= 17 && imc < 18) {
					estado = "BAJO DE PESO";
				} else {
					if (imc >= 18 && imc < 25) {
						estado = "PESO NORMAL (SALUDABLE)";
					} else {
						if (imc >= 25 && imc < 30) {
							estado = "SOBRE PESO (OBESIDAD DE GRADO 1)";
						} else {
							if (imc >= 30 && imc < 35) {
								estado = "SOBRE PESO CRÓNICO (OBESIDAD DE GRADO 2)";
							} else {
								if (imc >= 35 && imc < 40) {
									estado = "OBESIDAD PREMÓRBIDA (OBESIDAD DE GRADO 3)";
								} else {
									estado = "OBESIDAD MÓRBIDA (OBESIDAD DE GRADO 4)";
								}
							}
						}
					}
				}
			}
		}

		System.out.println("Su IMC es: " + imc);
		System.out.println("Estado: " + estado);

		scanner.close();

	}

}
