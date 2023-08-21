package com;

public class Principal {

	public static void main(String[] args) {

		// Creamos o instanciamos los objetos
		// m�s peque�os primero, o mejor dicho
		// los objetos que seran tipo de dato
		// de otro objeto
		
		Ram adata = new Ram("Adata", 8, 2166, "DDR4");
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", 8, 12, 4.5);
		
		// Ya podemos crear una nueva computadora 
		// y pasarle el valor de los otros objetos
		
		Computadora laptop = new Computadora("HP", "440G7", 12000.99, "Plata", adata, disco, intel); 
		
		//Mostrando en consola los valores de mi laptop
		System.out.println(laptop);
		
		
		

	}

}
