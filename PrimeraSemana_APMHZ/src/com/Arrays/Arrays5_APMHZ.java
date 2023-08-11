package com.Arrays;

public class Arrays5_APMHZ {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos
		// y otro para mostrar sus respectivos precios
		// Muestra en consola la lista de productos y sus precios. 
		// Por lo menos 5 productos o artículos.
		
		String [] prod = {"Hoja Blanca", "Lápiz", "Goma", "Plumon", "Lapicero"};
		double [] precios = {0.50, 1.00, 2.50, 3.00, 4.50, 1.50};
		
		System.out.println("PAPELERIA");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("El costo de 1 " + prod[i] + " es de $" + precios[i]);
		}
		
		

	}

}
