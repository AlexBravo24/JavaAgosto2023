package com.ciclos;

public class Ciclos5_APMHZ {

	public static void main(String[] args) {
		//  Simular el comportamiento de un reloj digital, 
		// imprimiendo la hora, minutos y segundos 
		// de un día desde las 00:00:00 horas hasta las 23:59:59 horas

		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {		
				for (segundos = 0; segundos < 60; segundos++) {
					if (horas < 10 && minutos < 10 && segundos < 10) {
						System.out.println("La hora es 0" +horas+ ":0" + minutos + ":0" + segundos);
					}
					else if (horas < 10 && minutos < 10 && segundos >= 10) {
						System.out.println("La hora es 0" +horas+ ":0" + minutos + ":" + segundos);
					}
					else if (horas < 10 && minutos >= 10 && segundos < 10) {
						System.out.println("La hora es 0" +horas+ ":" + minutos + ":0" + segundos);
					}
					else if (horas < 10 && minutos >= 10 && segundos >= 10) {
						System.out.println("La hora es 0" +horas+ ":" + minutos + ":" + segundos);
					}
					else if (horas >= 10 && minutos < 10 && segundos < 10) {
						System.out.println("La hora es " +horas+ ":0" + minutos + ":0" + segundos);
					}
					else if (horas >= 10 && minutos < 10 && segundos >= 10) {
						System.out.println("La hora es " +horas+ ":0" + minutos + ":" + segundos);
					}
					else if (horas >= 10 && minutos >= 10 && segundos < 10) {
						System.out.println("La hora es " +horas+ ":" + minutos + ":0" + segundos);
					}
					else if (horas >= 10 && minutos >= 10 && segundos >= 10) {
						System.out.println("La hora es " +horas+ ":" + minutos + ":" + segundos);
					}
					
				}
		
			}
		}
		
		
		
		
	}

}
