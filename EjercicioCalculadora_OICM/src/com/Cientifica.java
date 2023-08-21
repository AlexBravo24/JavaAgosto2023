package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro, IReloj {
	
	private String modelo;
	
	public Cientifica() {}
	
	

	public Cientifica(String marca, String color, String tamaño, int numdigitospantalla, int numeroteclas,
			String modelo) {
		super(marca, color, tamaño, numdigitospantalla, numeroteclas);
		this.modelo = modelo;
	}
	

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	@Override
	public String toString() {
		return "Cientifica [modelo=" + modelo + ", toString()=" + super.toString() + "]";
	}

	Scanner input = new Scanner(System.in);
	
	double numero1 = 0;
	double numero2 = 0;

	@Override
	public void suma() {
		double suma = 0;
		System.out.println("--- Sumar ---");
		System.out.print("Ingresa el primer numero: ");
		numero1 = input.nextDouble();
		System.out.print("Ingresa el segundo numero: ");
		numero2 = input.nextDouble();
		suma = numero1 + numero2;
		System.out.println("El resultado de la Suma es: " + suma);
	}

	@Override
	public void resta() {
		double resta = 0;
		System.out.println("--- Restar ---");
		System.out.print("Ingresa el primer numero: ");
		numero1 = input.nextDouble();
		System.out.print("Ingresa el segundo numero: ");
		numero2 = input.nextDouble();
		resta = numero1 - numero2;
		System.out.println("El resultado de la Resta es: " + resta);
	}

	@Override
	public void dividir() {
		double divicion = 0;
		System.out.println("--- Dividir ---");
		System.out.print("Ingresa el primer numero: ");
		numero1 = input.nextDouble();
		System.out.print("Ingresa el segundo numero: ");
		numero2 = input.nextDouble();
		divicion = numero1 / numero2;
		System.out.println("El resultado de la Divicion es: " + divicion);
	}

	@Override
	public void multiplicar() {
		double multiplicar = 0;
		System.out.println("--- Multiplicar ---");
		System.out.print("Ingresa el primer numero: ");
		numero1 = input.nextDouble();
		System.out.print("Ingresa el segundo numero: ");
		numero2 = input.nextDouble();
		multiplicar = numero1 * numero2;
		System.out.println("El resultado de la Multiplicacion es: " + multiplicar);
	}



	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal 36.5 °C");
	}



	@Override
	public void hora() {
		System.out.println("Hora");
		
	}
	

}
