package com.arrays;

public class Arrays6_JRCT {
	public static void main(String[] args) {
	
		/*
		 * Crea dos arrays, uno para mostrar n productos 
		 * y otro para mostrar sus
respectivos precios. Muestra en consola la lista de productos 
y sus precios.
Por lo menos 5 productos o artículos.
		 */
		String [] nombres = {"Aceite","Sal","Cerillos","Cereal","Leche"};
		
		double[] precios = {50.00,15.5,5,80.26,30.12};
		
		for (int i = 0; i< nombres.length; i++) {
			System.out.println(nombres[i]+" ="+ " $" +precios[i]);
		}
		
		
		
	}
}
