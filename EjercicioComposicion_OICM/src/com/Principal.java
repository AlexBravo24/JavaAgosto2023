package com;

public class Principal {

	public static void main(String[] args) {
		
		Cpu cpu = new Cpu("i5-13600KF", 14, 20, 5.1);
		Gpu gpu = new Gpu("RTX-4080", 16, 4);
		Monitor monitor = new Monitor("MSI", "IPS", 27, 240);
		Almacenamiento almacenamiento = new Almacenamiento("Western Digital", "SN770", 500, "NVMe-M.2");
		Ram ram = new Ram("ADATA", "AX5U7200C3416G-DCLARWH", 16, 7200, "DDR5");
		Fuente fuente = new Fuente("Corsair", 1000, "80+Gold", "ATX");
		TarjetaMadre tarjetaMadre = new TarjetaMadre("ASUS", "ATX", "ROG MAXIMUS Z790 HERO");
		
		
		PcMasterRace tostadora = new PcMasterRace(cpu, gpu, monitor, almacenamiento, ram, fuente, tarjetaMadre);
		
		System.out.println(tostadora);
		
	}

}
