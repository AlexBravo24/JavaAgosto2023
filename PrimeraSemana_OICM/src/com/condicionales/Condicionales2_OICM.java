package com.condicionales;

import java.util.Scanner;

public class Condicionales2_OICM {

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("---- PAR O IMPAR ----");
		System.out.println("Ingresa el Numero");
		
		Scanner input = new Scanner(System.in);
		
		numero = input.nextInt();
		
		input.close();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " Es un Numero Par");
		}else {
			System.out.println(numero + " Es un Numero Impar");
		}

	}//Cierre del main

}
