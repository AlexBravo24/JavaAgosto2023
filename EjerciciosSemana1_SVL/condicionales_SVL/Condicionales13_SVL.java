package com.condicionales;

import java.util.Scanner;

public class Condicionales13_SVL {

	public static void main(String[] args) {
		//  Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		//  centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//	Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		//	y el resto se invierte en la bolsa.
		//	Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		//	ni�os y el resto se invierte en la bolsa.
		//	La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente

		Scanner input = new Scanner(System.in);
		int donacion;
		
		System.out.println("Este programa nos dara la dispersion de la donacion repartida en tres destinos con respecto al monto");
		System.out.println("DONACION");
		donacion = input.nextInt();
		
		if (donacion >=1000) {
			System.out.println("La DONACION se reparte asi:");
			System.out.println("SALUD:  " +(donacion*.3) );
			System.out.println("COMEDOR DE NI�OS:  " +(donacion*.5) );
			System.out.println("BOLSA: " +(donacion*.2));
		} else if  (donacion <1000){
			System.out.println("La DONACION se reparte asi:");
			System.out.println("SALUD:  " +(donacion*.25) );
			System.out.println("COMEDOR DE NI�OS:  " +(donacion*.6) );
			System.out.println("BOLSA: " +(donacion*.15));
			
		}
		
		
	}

}
