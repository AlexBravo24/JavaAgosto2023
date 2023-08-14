package com.condicionales;

import java.util.Scanner;

public class Condicionales13_SVL {

	public static void main(String[] args) {
		//  Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		//  centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//	Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		//	y el resto se invierte en la bolsa.
		//	Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		//	niños y el resto se invierte en la bolsa.
		//	La institución desea saber cuánto de dinero destinará a cada rubro anualmente

		Scanner input = new Scanner(System.in);
		int donacion;
		
		System.out.println("Este programa nos dara la dispersion de la donacion repartida en tres destinos con respecto al monto");
		System.out.println("DONACION");
		donacion = input.nextInt();
		
		if (donacion >=1000) {
			System.out.println("La DONACION se reparte asi:");
			System.out.println("SALUD:  " +(donacion*.3) );
			System.out.println("COMEDOR DE NIÑOS:  " +(donacion*.5) );
			System.out.println("BOLSA: " +(donacion*.2));
		} else if  (donacion <1000){
			System.out.println("La DONACION se reparte asi:");
			System.out.println("SALUD:  " +(donacion*.25) );
			System.out.println("COMEDOR DE NIÑOS:  " +(donacion*.6) );
			System.out.println("BOLSA: " +(donacion*.15));
			
		}
		
		
	}

}
