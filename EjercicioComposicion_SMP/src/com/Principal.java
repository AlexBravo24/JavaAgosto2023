package com;

public class Principal {

	public static void main(String[] args) {

		HotelEconomico hotelEconomico = new HotelEconomico("Hotel Barato", 50, 50.0, 1, 1, "si");
		HotelEstandar hotelEstandar = new HotelEstandar("Hotel Estándar", 100, true, true);
		HotelLujo hotelLujo = new HotelLujo("Hotel de Lujo", 20, "Spa de Lujo");
		HotelResort hotelResort = new HotelResort("Hotel Resort", 150, "Playa Privada", 1);

		Hotel estrellas = new Hotel("Diferentes estrellas", 50, 1000.00, hotelEconomico, hotelEstandar, hotelLujo,
				hotelResort);
		System.out.println(estrellas);
	}

}
