package com.ciclos;

import java.util.Scanner;

public class Ciclos8_OICM {

	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre 
		//los números desde el menor hasta el mayor
		
		System.out.println("---- Numero de Menor a Mayor ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Primer Numero");
		int num1 = input.nextInt();
		
		System.out.println("Ingresa el Segundo Numero");
		int num2 = input.nextInt();
		
		input.close();
		
		System.out.println("\nOrden de Menor a Mayor");
		
		int serie;
		
		if(num1 > num2) {
			serie = num2;
			while(serie <= num1){
				System.out.println("         "+ serie);
				serie++;
			}
		}else if(num2 > num1) {
			serie = num1;
			while(serie <= num2) {
				System.out.println("         "+ serie);
				serie++;
			}
		}else {
			System.out.println("ERROR! Lo Numeros Deben ser Diferentes");
		}
		
	}//Cierre main 

}
