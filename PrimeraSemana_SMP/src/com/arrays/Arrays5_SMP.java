package com.arrays;

public class Arrays5_SMP {
	public static void main(String[] args) {
		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos
		 */
		// Definimos dos arrays: uno para productos y otro para precios
		String[] productos = { "Producto A", "Producto B", "Producto C", "Producto D", "Producto E" };
		double[] precios = { 10.5, 25.0, 8.75, 16.99, 32.25 };

		// Mostramos la lista de productos y sus precios
		System.out.println("Lista de Productos:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		}
	}

}
