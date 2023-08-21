package com;

//Clase abstracta Calculadora

abstract class Calculadora {
	private double numero1;
	private double numero2;

	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public abstract double sumar();

	public abstract double restar();

	public abstract double multiplicar();

	public abstract double dividir();

	@Override
	public String toString() {
		return "Calculadora: [Número 1=" + numero1 + ", Número 2=" + numero2 + "]";
	}
}
