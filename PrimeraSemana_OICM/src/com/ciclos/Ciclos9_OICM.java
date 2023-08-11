package com.ciclos;

import java.util.Scanner;

public class Ciclos9_OICM {

	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre 
		//los números pares entre ellos
		
		System.out.println("---- Numeros Pares entre Dos Numeros ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Primer Numero");
		int num1 = input.nextInt();
		
		System.out.println("Ingresa el Segundo Numero");
		int num2 = input.nextInt();
		
		input.close();
		
		int serie;
		int res;
		boolean par = false;
		
		System.out.println("Los Numeros Pares entre los Numeros Son:");
		
		if(num1 > num2) {
			serie = num2 + 1;
			while(serie < num1){
				res = serie % 2;
				if(res == 0) {
					System.out.println(serie);
					par = true;
				}
				serie++;
			}
			if(!par) {
				System.out.println("No hay numeros Pares");
			}
		}else if(num2 > num1) {
			serie = num1 + 1;
			while(serie < num2) {
				res = serie % 2;
				if(res == 0) {
					System.out.println(serie);
					par = true;
				}
				serie++;
			}
			if(!par) {
				System.out.println("No hay numeros Pares");
			}
		}else {
			System.out.println("ERROR! Lo Numeros Deben ser Diferentes");
		}
		
	}

}
