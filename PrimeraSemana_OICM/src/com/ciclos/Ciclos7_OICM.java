package com.ciclos;

public class Ciclos7_OICM {

	public static void main(String[] args) {
		
		// Una persona desea invertir $700.00 en un banco, 
		//el cual le otorga un 2% de interés 
		//mensual. ¿En cuántos meses tendrá más de $1500, 
		//si reinvierte cada mes todo su dinero?
		System.out.println("---- Invertir $700.00 ----");
		
		double inv = 700;
		int mes = 0;
		
		while (inv < 1500) {
			inv = (inv + (inv * 0.02));
			mes++;
		}
		System.out.println("En '"+ mes +"' meses se obtiene mas de $1500.00");
		
		inv = Math.round(inv * 100) / 100d;
		
		System.out.println("El total es: "+ inv);
	}
}
