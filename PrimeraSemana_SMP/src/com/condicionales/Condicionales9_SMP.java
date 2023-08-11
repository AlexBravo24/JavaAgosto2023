package com.condicionales;

import java.util.Scanner;

public class Condicionales9_SMP {
	public static void main(String[] args) {
		/*
		 * 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el número del día de la semana (del 1 al 7): ");
		int numeroDia = scanner.nextInt();

		String diaCorrespondiente = "";

		switch (numeroDia) {
		case 1:
			diaCorrespondiente = "Lunes";
			break;
		case 2:
			diaCorrespondiente = "Martes";
			break;
		case 3:
			diaCorrespondiente = "Miércoles";
			break;
		case 4:
			diaCorrespondiente = "Jueves";
			break;
		case 5:
			diaCorrespondiente = "Viernes";
			break;
		case 6:
			diaCorrespondiente = "Sábado";
			break;
		case 7:
			diaCorrespondiente = "Domingo";
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			System.exit(0);
		}

		System.out.println("El día correspondiente al número " + numeroDia + " es: " + diaCorrespondiente);

		scanner.close();
	}

}
