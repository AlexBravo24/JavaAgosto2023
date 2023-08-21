package com;

public class Principal {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setNombre("Automovil");
		carro1.setNumRuedas(4);
		carro1.setConMotor(true);
		carro1.setColor("rojo");
		carro1.setNumPuertas(4);
		carro1.setVelocidad(120);
		
		System.out.println(carro1);
		System.out.println(carro1.Correr(carro1.getVelocidad()));
		System.out.println(carro1.Parking(true));
	}

}
