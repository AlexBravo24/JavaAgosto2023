package com;

public class Principal {

	public static void main(String[] args) {
	
		Perro mascota = new Perro("Firulais", 22.4, 3, 0.55, "Blanco", "Husky Siberiano", "11-13");
		
		System.out.println(mascota);
		
		mascota.comer();
		mascota.comer("Croquetas Dog Chow");
		
	}

}
