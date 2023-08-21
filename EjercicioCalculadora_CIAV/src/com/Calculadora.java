package com;

public abstract class Calculadora {
	
	public String marca;
	public double num1;
	public double num2;
	
	public Calculadora () {}
	
	
	public Calculadora(String marca, double num1, double num2) {
		super();
		this.marca = marca;
		this.num1 = num1;
		this.num2 = num2;
	}


	public final String getMarca() {
		return marca;
	}


	public final void setMarca(String marca) {
		this.marca = marca;
	}


	public final double getNum1() {
		return num1;
	}


	public final void setNum1(double num1) {
		this.num1 = num1;
	}


	public final double getNum2() {
		return num2;
	}


	public final void setNum2(double num2) {
		this.num2 = num2;
	}
	
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", num1=" + num1 + ", num2=" + num2 + "]";
	}


	public abstract double Sumar (double a, double b);
	public abstract double Restar (double a, double b);
	public abstract double Multiplicar (double a, double b);
	public abstract double Dividir (double a, double b);
	
}
