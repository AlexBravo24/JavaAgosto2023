package com.condicionales;

import java.util.Scanner;

public class Condicionales9_OICM {

	public static void main(String[] args) {
		
        int d;
		
        System.out.println("---- Dias de la Semana ----");
        
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana con numero");
		d=input.nextInt();
		
		input.close();
		
		switch (d) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("ERROR! Dia Invalido");
		}

	}

}
