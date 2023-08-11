package com.condicionales;

import java.util.Scanner;

public class Condicionales14_OICM {

	public static void main(String[] args) {
		
		int horas;
		int salario;
		int hrextra;
		
		System.out.println("---- Salario Semanal ----");
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa las Horas de Trabajo");
		horas = input.nextInt();
		
		input.close();
		
		if (horas <= 40) {
			salario = 16 * horas;
			System.out.println("Su salario es de $" + salario);
		}
		else if (horas > 40) {
			salario = (16 * 40);
			hrextra = (20 * (horas-40));
			System.out.println("Su salario es de $" + (salario + hrextra));
		}

	}

}
