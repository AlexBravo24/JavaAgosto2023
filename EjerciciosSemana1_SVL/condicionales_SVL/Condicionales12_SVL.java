package com.condicionales;

import java.util.Scanner;

public class Condicionales12_SVL {

	public static void main(String[] args) {
		// Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] /
		//altura2
	//	 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
	//	Valor de IMC Diagnóstico
	//	< 16 Criterio de ingreso en hospital
	//	de 16 a 17 infrapeso
	//	de 17 a 18 bajo peso
	//	de 18 a 25 peso normal (saludable)
	//	de 25 a 30 sobrepeso (obesidad de grado I)
	//	de 30 a 35 sobrepeso crónico (obesidad de grado II)
	//	de 35 a 40 obesidad premórbida (obesidad de grado III)
	//	>40 obesidad mórbida (obesidad de grado IV)
	//	Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y
	//	altura) deben ser introducidos por teclado por el usuario

		Scanner input = new Scanner (System.in);
		
		 System.out.println("Calculemos tu indice de masa corporal");
		 System.out.print("Introduce el peso (en kg): ");
		 double peso = input.nextDouble();
		 System.out.print("Introduce la altura (en centimetros): ");
		 double altura = input.nextDouble()/100;
		 double imc = peso/(altura*altura);
		 System.out.println("Para un peso de "+ peso +" kilogramos y");
		 System.out.println("una altura de "+ altura + " metros");
		 System.out.println("el indice de masa corporal es de "+ (int)imc);
		 
		 if (imc<16) { System.out.println("Necesita ingresar en un hospital");
		 } else if (imc<17) {
			 System.out.println("Usted tiene infrapeso");
		 } else if (imc<18) { 
			 System.out.println("Usted tiene bajo peso");
		 } else if (imc<26) {
			 System.out.println("Usted tiene un peso saludable");
		 } else if (imc<30) {
			 System.out.println("Tiene sobrepeso de grado I");
		 } else if (imc<35) {
			 System.out.println("Tiene obesidad de grado II");
		 } else if (imc<40) { 
			 System.out.println("Tiene obesidad premorbida (III)");
		 } else {
			 System.out.println("Usted tiene obesidad morbida o de grado IV");
		 }
								
	}

}
