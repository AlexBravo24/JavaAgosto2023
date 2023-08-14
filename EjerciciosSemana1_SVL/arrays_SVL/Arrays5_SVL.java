package com.arrays;

public class Arrays5_SVL {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
	   //Por lo menos 5 productos o artículos.

		String utiles []={"Lapiz", "Goma","Cuaderno","Sacapuntas"};
		 double precios[]={5.5,2,50,10};
		 System.out.println("Lista de Productos y sus precios");
		 for (int u=0;u<utiles.length;u++){
		 System.out.println(utiles[u]+ " "+ precios[u]); 
		} 
	}

}
