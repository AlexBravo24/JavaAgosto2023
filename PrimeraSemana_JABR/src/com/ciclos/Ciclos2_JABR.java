package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JABR {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido
		// desde teclado hasta la iteracion deseada por el usuario.

		int numero;
		int incremento;
		int i = 1;

		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el número del que deseas la tabla");
		numero = in.nextInt();
		System.out.println("Introduce el numero hasta el que deseas  multiplicar la tabla");
		incremento = in.nextInt();
		in.close();

		while (i <= incremento) {
			System.out.println(numero + " x " + i + " = " + numero * i);
			i++;
		}

//		for (int i = 1; i <= incremento; i++) {
//			System.out.println(numero + " x " + i + " = " + numero * i);
//		}

	}

}
