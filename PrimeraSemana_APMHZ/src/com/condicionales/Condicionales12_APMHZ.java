package com.condicionales;

import java.util.Scanner;

public class Condicionales12_APMHZ {

	public static void main(String[] args) {
		// Construir un programa que 
		// calcule el índice de masa corporal de una persona 
		// (IMC = peso [kg] / altura2 [m]) 
		// e indique el estado en el que se encuentra esa persona 
		// en función del valor de IMC:
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca su peso (en kg)");
		double peso = input.nextDouble();
		
		System.out.println("Introduzca su altura (en metros)");
		double altura = input.nextDouble();
		
		input.close();
		
		double IMC = peso / (altura*altura);
		System.out.println("Su indice de masa corporal es: " + IMC);
		
		if (IMC < 16)  {
			System.out.println("Criterio de ingreso en hospital");
		}
		else if (IMC >= 16 && IMC < 17) {
			System.out.println("Infrapeso");
		}
		else if (IMC >= 17 && IMC < 18) {
			System.out.println("Bajo peso");
		}
		else if (IMC >= 18 && IMC < 25) {
			System.out.println("Peso Normal (saludable)");
		}
		else if (IMC >= 25 && IMC < 30) {
			System.out.println("Sobrepeso (Obesidad de grado I)");
		}
		else if (IMC >= 30 && IMC < 35) {
			System.out.println("Sobrepeso crónico (Obesidad de grado II)");
		}
		else if (IMC >= 35 && IMC < 40) {
			System.out.println("Obesidad premórbida (Obesidad de grado III)");
		}
		else if (IMC > 40) {
			System.out.println("Obesidad mórbida (Obesidad de grado IV)");
		}
		
		
	}

}
