package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Instanciamos primero los objetos que seran tipo de dato de otro objeto
		
		Ram adata = new Ram("Adata", 8, 2166, "DDR4");
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "Core i7", 8, 8, 4.5);
		
		
		//Ya podemos crear una nueva computadora pasando el valor de los objetos ya creados
		
		Computadora laptop = new Computadora("HP", "GNT-420", 8000.00, "negro", adata, disco, intel);
		
		//Mostrando en consola los valores de mi laptop
		
		System.out.println(laptop);

	}

}
