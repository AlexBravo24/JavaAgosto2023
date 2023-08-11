package com.condicionales;

import java.util.Scanner;

public class Condicionales11_SMP {
	public static void main(String[] args) {

		/*
		 * 11. Una compañía de transporte internacional tiene servicio en algunos países
		 * de América del Norte, América Central, América del Sur, Europa y Asia. El
		 * costo por servicio de transporte se basa en el peso del paquete y la zona a
		 * la que va dirigida. Lo anterior se muestra en la siguiente tabla: ZONA
		 * UBICACIÓN COSTO/KILOGRAMO 1 América del Norte 24,00 euros 2 América Central
		 * 20, 00 euros 3 América del Sur 21,00 euros 4 Europa 10,00 euros 5 Asia 18,00
		 * euros Parte de su política implica que los paquetes con un peso superior a
		 * 5kg no son transportados, por cuestiones de logística y seguridad. Realiza un
		 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
		 * caso, el rechazo de la entrega.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el peso del paquete (en kg): ");
		double peso = scanner.nextDouble();

		if (peso <= 5) {
			System.out.print("Ingrese la zona de destino (1-5): ");
			int zona = scanner.nextInt();

			double costoKilogramo = 0;

			switch (zona) {
			case 1:
				costoKilogramo = 24.00;
				break;
			case 2:
				costoKilogramo = 20.00;
				break;
			case 3:
				costoKilogramo = 21.00;
				break;
			case 4:
				costoKilogramo = 10.00;
				break;
			case 5:
				costoKilogramo = 18.00;
				break;
			default:
				System.out.println("Zona no válida.");
				System.exit(0);
			}

			double costoTotal = peso * costoKilogramo;
			System.out.println("El costo de envío es: " + costoTotal + " euros");
		} else {
			System.out.println("El paquete no puede ser transportado debido a su peso.");
		}

		scanner.close();
	}
}
