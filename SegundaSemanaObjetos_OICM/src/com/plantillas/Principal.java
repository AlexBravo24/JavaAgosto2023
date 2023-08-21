package com.plantillas;

public class Principal {

	public static void main(String[] args) {
		
		Pelicula terror = new Pelicula("The Ring", 'B', 155, 2002);
		Pelicula fantasia = new Pelicula();
		
		fantasia.setNombre("Harry Potter y la Piedra Filosofal");
		
		System.out.println("Plantilla 1");
		System.out.println(terror);
		System.out.println(fantasia + "\n");
		
		VideoGame nintendo = new VideoGame("Super Mario Party", 'A', "Digital", 1399.00);
		VideoGame playstation = new VideoGame();
		
		playstation.setTitulo("God Of Ware 4");
		
		System.out.println("Plantilla 2");
		System.out.println(nintendo);
		System.out.println(playstation + "\n"); 
		
		Tv samsung = new Tv("sam-23565", 65, "OLED", "UHD");
		Tv lg = new Tv();
		
		lg.setPulgadas(75);
		
		System.out.println("Plantilla 3");
		System.out.println(samsung);
		System.out.println(lg + "\n");
		
		PcMasterRace dell = new PcMasterRace("Core i9-13900KF", "RTX 4090", "ips", 27, 240, 4, 32);
		PcMasterRace hp = new PcMasterRace();
		
		hp.setCpu("Ryzen 9-7950X3D");
		
		System.out.println("Plantilla 4");
		System.out.println(dell);
		System.out.println(hp + "\n");
		
		
		Tenis adidas = new Tenis("Questar", "Negro", 26.5f);
		Tenis nike = new Tenis();
		
		nike.setModelo("Air Force 1");
		
		System.out.println("Plantilla 5");
		System.out.println(adidas);
		System.out.println(nike + "\n");
		
		
	}

}
