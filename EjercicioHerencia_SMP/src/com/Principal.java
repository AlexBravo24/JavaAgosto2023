package com;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo("Italiano", "Ferrari");
		System.out.println(vehiculo);


		Coche coche1 = new Coche();
		coche1.setMarca("Toyota");
		coche1.setModelo("Corolla");
		coche1.setNumPuertas(4);

		System.out.println(coche1);

		Coche coche2 = new Coche("Honda", "Civic", 2);
		System.out.println(coche2);
	}

}
