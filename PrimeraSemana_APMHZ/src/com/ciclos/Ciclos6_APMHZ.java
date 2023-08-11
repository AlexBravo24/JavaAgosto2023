package com.ciclos;

public class Ciclos6_APMHZ {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, 
		// el cual le otorga un 2% de interés mensual. 
		// ¿Cuál será la cantidad de dinero que esta persona 
		// tendrá al cabo de un año si 
		// todo el dinero lo reinvierte?
		
		double inversion = 1000;
		double interes = 0.02;
		int mes = 1;
		
		while (mes<=12) {
			inversion = ( inversion + (inversion * interes) );
			mes++;
		}
		
		System.out.println("Al cabo de 1 año usted tendra $" +inversion);
		
	
		
		
	}

}
