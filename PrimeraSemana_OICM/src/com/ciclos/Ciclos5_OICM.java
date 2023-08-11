package com.ciclos;



public class Ciclos5_OICM {

	public static void main(String[] args) {
		
		// Simular el comportamiento de un reloj digital, imprimiendo 
		//la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		
		int min = 0;
		int seg = 0;
		int hora = 0; 
		
		System.out.println("---- RELOJ ----");
		
		for (hora = 0; hora <= 23; hora++) {
			for (min = 0; min <= 59; min++) {
				for (seg = 0; seg <= 59; seg++) {
					
					if(hora < 10) {
						System.out.print("Son las 0"+ hora +":");
					}else {
						System.out.print("Son las "+ hora +":");
					}
					if(min < 10) {
						System.out.print("0"+ min +":");
					}else {
						System.out.print(min +":");
					}
					if(seg < 10) {
						System.out.println("0"+ seg +" horas");
					}else {
						System.out.println(seg + " horas");
					}
				}
			}
		}
	}
}
