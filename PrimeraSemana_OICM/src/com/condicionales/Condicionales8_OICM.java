package com.condicionales;

import java.util.Scanner;

public class Condicionales8_OICM {

	public static void main(String[] args) {
		
		String letranum;
		
		System.out.println("---- Lanza Dado ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingres el numero del Dado");
		byte numDado = input.nextByte();
		
		input.close();
		
		switch(numDado) {
		case 1:
			letranum = "Seis";
			System.out.println(letranum);
			break;
		case 2:
			letranum = "Cinco";
			System.out.println(letranum);
			break;
		case 3:
			letranum = "Cuatro";
			System.out.println(letranum);
			break;
		case 4:
			letranum = "Tres";
			System.out.println(letranum);
			break;
		case 5:
			letranum = "Dos";
			System.out.println(letranum);
			break;
		case 6:
			letranum = "Uno";
			System.out.println(letranum);
			break;
		default:
			System.out.println("EROR: numero incorrecto");
			
		}

	}

}
