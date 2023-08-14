package com.ciclos;

public class Ciclos5_JRCT {

	public static void main(String[] args) throws InterruptedException  {
		/*
		 * Simular el comportamiento de un reloj digital, 
		 * imprimiendo la hora, minutos y segundos
de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		 */

		int horas=0, minutos=0, segundos=0;
		
		while (true) {
			if(horas<24) {
				System.out.print("0");
				
			} System.out.print(horas + ":");
			
		
			 if(minutos<60) {
				System.out.print("0");
				
				
				
			}System.out.print(minutos+ ":");
			
			
			 if(segundos<60) {
				System.out.print("0");
				
				
			}System.out.println(segundos);
			segundos ++;
			Thread.sleep(1000);
			
			
			
			if (segundos==60) {
				segundos = 0;
				minutos ++;
				
				if(minutos == 60) {
					minutos =0;
					horas++;
					
					if(horas == 24) {
						horas = 0;
						
						
						
					}
				}
			}
			
		}
		
		
		
	}

}
