package com.condicionales;

import java.util.Scanner;

public class Condicionales12_JRCT {

	public static void main(String[] args) {
		/*
		 * Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben
ser introducidos por teclado por el usuario.

		 */
		int p, a, imc;

		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el peso en kilogramos: ");
		p = input.nextInt();
		
		System.out.println("Ingrese su altura en metros: ");
		a = input.nextInt();
		
		imc = (p / a);
		
		if(imc < 16) {
			System.out.println("El diagnostico es: Criterio de ingreso en hospital");
		}else if(imc > 16 && p < 17) {
			System.out.println("El diagnostico es: Infrapeso");
		}else if(imc > 17 && p < 18) {
			System.out.println("El diagnostico es: Bajo peso");
		}else if(imc > 18 && p < 25) {
			System.out.println("El diagnostico es: Peso normal(saludable)");
		}else if(imc > 25 && p < 30) {
			System.out.println("El diagnostico es: Sobrepeso(obesidad de grado i)");
		}else if(imc > 30 && p < 35) {
			System.out.println("El diagnostico es: Sobre peso crónico(obesidad grado ii)");
		}else if(imc > 35 && p < 40) {
			System.out.println("El diagnostico es: Obesidad premordial(Obesidad feado iii)");
		}else {
			System.out.println("El diagnostico es: Obesidad mórbida(obesidad gradi iv)");
		}
		

	}

}
