package com.condicionales;

import java.util.Scanner;

public class Condicionales13_APMHZ {

	public static void main(String[] args) {
		// Una instituci�n ben�fica recibe anualmente 
				// una donaci�n proveniente de Europa y lo reparte 
				// entre un centro de salud, un comedor de ni�os 
				// y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
				// Si el monto de la donaci�n es de $10000 o m�s: 
				// 30% se destina al centro de salud, 50% al comedor de ni�os
				// y el resto se invierte en la bolsa.
				// Si el monto de la donaci�n es menor que $10000: 
				// 25% se destina al centro de salud, 
				// 60% al comedor de ni�os y el resto se invierte en la bolsa.
				// La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente

				Scanner input = new Scanner(System.in);
				
				System.out.println("�Cu�l es el monto de la donacion anual?");
				double monto = input.nextDouble();
				
				input.close();
				
				if (monto >= 10000) {
					double salud = (monto * 0.3);
					double comedor = (monto * 0.5);
					double inv = (monto * 0.2);
					System.out.println("Anualmente se destinara: $ " + salud + " al centro de salud");
					System.out.println("Anualmente se destinara: $ " + comedor + " al comedor");
					System.out.println("Anualmente se destinara: $ " + inv + " a inversiones");
				}
				
				else if (monto < 10000) {
					double salud = (monto * 0.25);
					double comedor = (monto * 0.6);
					double inv = (monto * 0.15);
					System.out.println("Anualmente se destinara: $ " + salud + " al centro de salud");
					System.out.println("Anualmente se destinara: $ " + comedor + " al comedor");
					System.out.println("Anualmente se destinara: $ " + inv + " a inversiones");
				}
				
				

	}

}
