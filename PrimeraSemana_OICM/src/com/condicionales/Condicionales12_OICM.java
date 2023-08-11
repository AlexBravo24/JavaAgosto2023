package com.condicionales;

import java.util.Scanner;

public class Condicionales12_OICM {

	public static void main(String[] args) {
		
		System.out.println("---- Indice de Masa Corporal ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Peso [Kg]");
		double peso = input.nextDouble();
		
		System.out.println("Ingresa la Altura [m]");
		double altura = input.nextDouble();
		
		input.close();
		
		double imc = (peso / (altura * altura));
		
		if (imc < 16) {
			System.out.println("Diagnostico: Criterio de ingreso en hospital.");
			System.out.println("IMC = " + imc);
		}else if(imc <= 17) {
			System.out.println("Diagnostico: Infrapeso. - IMC = " + imc);
		}else if(imc <= 18) {
			System.out.println("Diagnostico: Bajo peso. - IMC = " + imc);
		}else if(imc <= 25) {
			System.out.println("Diagnostico: Peso Normal (Saludable). - IMC = " + imc);
		}else if(imc <= 30) {
			System.out.println("Diagnostico: Sobrepeso (Obesidad de grado I). - IMC = " + imc);
		}else if(imc <= 35) {
			System.out.println("Diagnostico: Sobrepeso Cronico (Obesidad de grado II).");
			System.out.println("IMC = " + imc);
		}else if(imc <= 40) {
			System.out.println("Diagnostico: Obesidad Premorbida (Obesidad de grado III).");
			System.out.println("IMC = " + imc);
		}else if(imc > 40) {
			System.out.println("Diagnostico: Obesidad Morbida (Obesidad de grado IV).");
			System.out.println("IMC = " + imc);
		}
		
	}

}
