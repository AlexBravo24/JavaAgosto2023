package com;

public class Celular {
	
	private String pantalla;
	private double capacidadAlm;
	private String camara;
	private int peso;
	private double ram;
	
	//Al agregar un modificador static a una variable o metodo
	//estamos declarando que ese miembro pertenece a la clase en si 
	//y no a instancias separadas
	
	//con el modificador final declaramos el uso de 
	//valores inmutables (constantes)
	private static final int precio = 20000;
	
	public Celular() {
		
	}

	


	public Celular(String pantalla, double capacidadAlm, String camara, int peso, double ram) {
		super();
		this.pantalla = pantalla;
		this.capacidadAlm = capacidadAlm;
		this.camara = camara;
		this.peso = peso;
		this.ram = ram;
	}


	public static int getPrecio() {
		return precio;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public double getCapacidadAlm() {
		return capacidadAlm;
	}

	public void setCapacidadAlm(double capacidadAlm) {
		this.capacidadAlm = capacidadAlm;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [pantalla=" + pantalla + ", capacidadAlm=" + capacidadAlm + ", camara=" + camara + ", peso="
				+ peso + ", ram=" + ram + ", precio=" + precio + "]";
	}

	
	
	

}
