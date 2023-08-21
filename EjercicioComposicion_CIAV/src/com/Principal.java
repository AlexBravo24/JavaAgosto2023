package com;

public class Principal {

	public static void main(String[] args) {
		// 
		
		Direccion direccion1 = new Direccion("Calle 15", 100, "Moctezuma", "Venustiano Carranza", "CDMX");
		
		FechaHora fecha = new FechaHora("Martes", 15, 8, 2023, 11, 00);
		Producto producto1 = new Producto(01, "garrafón", 70);
		Servicio servicio1 = new Servicio("con Reparto", true, direccion1);
		
	
		
	}

}
