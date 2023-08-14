package com.arrays;

public class Arrays5_VHPL {

	public static void main(String[] args) {
		/* Crea dos arrays, uno para mostrar n productos y otro 
		  para mostrar sus respectivos precios. Muestra en consola
		   la lista de productos y sus precios. 
		   Por lo menos 5 productos o artículos.*/
		
		String [] productos = new String[5];
		
		productos [0]= "Arroz";
		productos [1]= "Atún";
		productos [2]= "Carne de res";
		productos [3]= "Monster";
		productos [4]= "Pollo";
				
		
		int [] precios = new int [5];
		
		precios [0] = 12;
		precios [1] = 23;
		precios [2] = 250;
		precios [3] = 42;
		precios [4] = 91;
		System.out.println("Los productos a la venta son: ");
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i]+" "+ "$"+precios[i] );

			
	}
}
}
