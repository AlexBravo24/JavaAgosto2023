package com.ciclos;

public class Ciclos6_JABR {

	public static void main(String[] args) {
		/*6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
		 * Cual ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?.
		 * 
		 */

		double inversion=1000;
		
		for (int i=1; i<=12; i++) {
			inversion = inversion + (inversion*0.02);
			System.out.println("La ganancia de inversion el mes " + i + " es de: " + inversion);
//			System.out.printf("%.2f", inversion);
//			System.out.println();
		}
		System.out.println();
		System.out.println("La cantidad a ganar en un a�o es: ");
		System.out.printf("%.2f",inversion);
	}

}
