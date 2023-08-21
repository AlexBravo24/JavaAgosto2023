package com;

public class CalcCientifica extends Calculadora implements ITermometro, IReloj{

	@Override
	public double Sumar(double a, double b) {
		// Retorna la suma de los números introducidos
		return a + b;
	}

	@Override
	public double Restar(double a, double b) {
		// Retorna la resta de los números introducidos
		return a - b;
	}

	@Override
	public double Multiplicar(double a, double b) {
		// Retorna la multiplicacion de los números introducidos
		return a * b;
	}

	@Override
	public double Dividir(double a, double b) {
		// Retorna la division de los números introducidos
		return a / b;
	}

	
	//METODOS DE LA INTERFAZ
	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura corporal normal");
		
	}

	@Override
	public void hora() {
		System.out.println("La hora exacta es: 10:00");
		
	}
	
	
	
}
