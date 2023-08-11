package com.condicionales;

import java.util.Scanner;

public class Condicionales13_APMHZ {

	public static void main(String[] args) {
		// Una institución benéfica recibe anualmente 
				// una donación proveniente de Europa y lo reparte 
				// entre un centro de salud, un comedor de niños 
				// y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
				// Si el monto de la donación es de $10000 o más: 
				// 30% se destina al centro de salud, 50% al comedor de niños
				// y el resto se invierte en la bolsa.
				// Si el monto de la donación es menor que $10000: 
				// 25% se destina al centro de salud, 
				// 60% al comedor de niños y el resto se invierte en la bolsa.
				// La institución desea saber cuánto de dinero destinará a cada rubro anualmente

				Scanner input = new Scanner(System.in);
				
				System.out.println("¿Cuál es el monto de la donacion anual?");
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
