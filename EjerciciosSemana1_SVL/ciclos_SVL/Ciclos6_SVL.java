package com.ciclos;

public class Ciclos6_SVL {

	public static void main(String[] args) {
		//  Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		//todo el dinero lo reinvierte?

		System.out.println("------INVERSION------");
		
		double inv = 1000;
		
		for (int mes = 1; mes <= 12; mes++) {
			inv = (inv + (inv * 0.02));
			
		}
		System.out.println("El acumulado de invertir $1000.00 durante un año es");
		System.out.println("$"+ inv);
	}

}
