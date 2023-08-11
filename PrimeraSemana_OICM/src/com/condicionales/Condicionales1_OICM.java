package com.condicionales;

import java.util.Scanner;

public class Condicionales1_OICM {

	public static void main(String[] args) {
		
		System.out.println("---- MAYOR O IGUAL ----");
		System.out.println("Ingresa el Primer Numero");
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		System.out.println("Ingresa el Segundo Numero");
		
		int num2 = input.nextInt();
		
		input.close();
		
		if(num1 == num2) {
			System.out.println("Los Numeros Ingresados Son Iguales " + num1 + " = " + num2);
		}else if(num1 > num2) {
			System.out.println(num1 + " Es Mayor Que " + num2);
		}else {
			System.out.println(num2 + " Es Mayor Que " + num1);
		}
		
	}

}
