package com;

public class Principal {

	public static void main(String[] args) {
		Ram adata = new Ram("Adata", 8, 2166, "DDR4");
		Almacenamiento disco = new Almacenamiento("Kinsgton", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", 8, 12, 4.5);

		Computadora laptop = new Computadora("HP", "440G7", 12000.99, "Plata", adata, disco, intel);
		System.out.println(laptop);
	}

}
