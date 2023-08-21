package com;

public class Ensalada extends Comida {

	private int num_ingred;
	private String ingred1;
	private String ingred2;
	private double costo;
	
	public Ensalada() {
		
	}
	
	///
	public Ensalada(String nombre, String color, String tipo, int num_ingred, String ingred1, String ingred2,
			double costo) {
		super(nombre, color, tipo);
		this.num_ingred = num_ingred;
		this.ingred1 = ingred1;
		this.ingred2 = ingred2;
		this.costo = costo;
	}

	///
	public int getNum_ingred() {
		return num_ingred;
	}

	public void setNum_ingred(int num_ingred) {
		this.num_ingred = num_ingred;
	}

	public String getIngred1() {
		return ingred1;
	}

	public void setIngred1(String ingred1) {
		this.ingred1 = ingred1;
	}

	public String getIngred2() {
		return ingred2;
	}

	public void setIngred2(String ingred2) {
		this.ingred2 = ingred2;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Ensalada [num_ingred=" + num_ingred + ", ingred1=" + ingred1 + ", ingred2=" + ingred2 + ", costo="
				+ costo + ", \n" + super.toString() + "]";
	}
	
	
	
	
}
