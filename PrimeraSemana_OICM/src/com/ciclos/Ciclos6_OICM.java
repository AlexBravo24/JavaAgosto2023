package com.ciclos;

public class Ciclos6_OICM {

	public static void main(String[] args) {
		
		// - Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de inter�s 
		//mensual. �Cu�l ser� la cantidad de dinero que esta 
		//persona tendr� al cabo de un a�o si 
		//todo el dinero lo reinvierte? 1,268.241794562545
		
		System.out.println("---- Inversion ----");
		
		double inv = 1000;
		
		for (int mes = 1; mes <= 12; mes++) {
			inv = (inv + (inv * 0.02));
		}
		
		System.out.println("El acumulado de invertir $1000.00 durante 1 A�o es");
		System.out.println("$"+ inv);
	}

}
