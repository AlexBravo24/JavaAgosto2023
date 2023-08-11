package com.arrays;

public class Arrays5_CIAV {
	public static void main(String[] args) {
        String[] prod1 = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        double[] price = {10.99, 24.75, 7.50, 15.25, 5.99};

        System.out.println("Lista de productos y precios:");
        System.out.println("-----------------------------");

        for (int i = 0; i < prod1.length; i++) {
            System.out.println(prod1[i] + ": $" + price[i]);
        }
    }
}
