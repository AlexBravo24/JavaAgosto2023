package com.ciclos;

import java.util.Scanner;

public class Ciclos2_OICM {

	public static void main(String[] args) {
		
		int num;
		int multi;
		
		System.out.println("---- Tabla de Multiplicar de un Numero ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Numero de la Tabla");
		num = input.nextInt();
		
		System.out.println("Ingresa hasta que numero Multiplicar");
		multi = input.nextInt();
		
		input.close();
		
		for (int i = 1; i <= multi; i++) {
			int res = num * i;
			System.out.println("\n["+num+"] x ["+ i +"] = "+ res);
		}

	}

}
