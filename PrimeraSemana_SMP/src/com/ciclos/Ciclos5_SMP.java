package com.ciclos;

public class Ciclos5_SMP {
	public static void main(String[] args) {
		/*
		 * 5. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		 * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		 * horas
		 */
		for (int hora = 0; hora < 24; hora++) {
			for (int minuto = 0; minuto < 60; minuto++) {
				for (int segundo = 0; segundo < 60; segundo++) {
					System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
					// En palabras simples, %d es un entero que en su caso es "horas" y %02d es un
					// entero que se muestra como "xx" tomado de la variable "minutos"
					// Especificador de formato % seguidos de caracter que representa tipo de dato
					// %n Separador de linea
					esperarUnSegundo();
				}
			}
		}
	}

	public static void esperarUnSegundo() {
		try {
			Thread.sleep(1000); // Pausa de 1000 milisegundos (1 segundo)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
