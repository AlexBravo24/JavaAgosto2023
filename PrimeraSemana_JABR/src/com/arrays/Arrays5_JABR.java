package com.arrays;

public class Arrays5_JABR {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos 
		//y otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.
		
		String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        double[] precios = {10.99, 5.49, 7.25, 12.75, 3.99};
        
        System.out.println("Lista de productos y sus precios:");
        System.out.println("---------------------------------");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
        }

	}

}
