package com.condicionales;

import java.util.Scanner;

public class Candicionales13_JRCT {

	public static void main(String[] args) {
		/* Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
			y el resto se invierte en la bolsa.
			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
			ni�os y el resto se invierte en la bolsa.
			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.*/

		int m;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el valor de la donaci�n: ");
		m = input.nextInt();
		
		if(m>=10000) {
			System.out.println("centro de salud: " + ((30*m)/100) + "  Comedor de ni�os: " + ((50*m)/100) + "  Bolsa de valores: " + ((20*m)/100) );
		}else if(m<10000) {
			System.out.println("centro de salud: " + ((25*m)/100) + "  Comedor de ni�os: " + ((60*m)/100) + "  Bolsa de valores: " + ((15*m)/100) );
		}
		
		
		
		
	}

}
