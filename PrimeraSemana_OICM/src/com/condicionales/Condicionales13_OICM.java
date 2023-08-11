package com.condicionales;

import java.util.Scanner;

public class Condicionales13_OICM {

	public static void main(String[] args) {
		
		double salud;
		double comedor;
		double inv;
		
		System.out.println("---- Donacion Anual ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuál es el monto de la donacion anual?");
		double monto = input.nextDouble();
		
		input.close();
		
		if (monto >= 10000) {
			salud = (monto * 0.3);
			comedor = (monto * 0.5);
			inv = (monto * 0.2);
			System.out.println("Anualmente se destinara: $ " + salud + " al centro de salud");
			System.out.println("Anualmente se destinara: $ " + comedor + " al comedor");
			System.out.println("Anualmente se destinara: $ " + inv + " a inversiones");
		}
		
		else if (monto < 10000) {
			salud = (monto * 0.25);
			comedor = (monto * 0.6);
			inv = (monto * 0.15);
			System.out.println("Anualmente se destinara: $ " + salud + " al centro de salud");
			System.out.println("Anualmente se destinara: $ " + comedor + " al comedor");
			System.out.println("Anualmente se destinara: $ " + inv + " a inversiones");
		}

	}

}
