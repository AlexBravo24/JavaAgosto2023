package com.arrays;

import java.text.DecimalFormat;

public class Arrays5_OICM {

	public static void main(String[] args) {
		
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		
		String [] productos = {"Gorra","Guantes","Sabritas","Coca-Cola Lata","Mesa"};
		double [] precios = {399,510.40,17,15.50,1099};
		System.out.println("---- Productos ----\n");
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println(productos[i] + " $" + df.format(precios[i]));
		}
	}
}
