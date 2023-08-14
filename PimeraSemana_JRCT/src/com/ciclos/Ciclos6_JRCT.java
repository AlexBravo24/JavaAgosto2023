package com.ciclos;

public class Ciclos6_JRCT {

	public static void main(String[] args) {
		/* Una persona desea invertir $1000.00 en un banco, 
		 * el cual le otorga un 2% de interés
		mensual. ¿Cuál será la cantidad de dinero
		 que esta persona tendrá al cabo de un año si
		todo el dinero lo reinvierte?*/

		float a = 1000.00f;
		
		
		
		for (float i = 1.0f; i <=12; ) {
			i = 12*20;
			System.out.println("su saldo anual es de: " + (i+a));
		}
	}

}
