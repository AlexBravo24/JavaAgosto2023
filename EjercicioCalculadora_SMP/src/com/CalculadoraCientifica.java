package com;

//Clase Cientifica que hereda de Calculadora

class CalculadoraCientifica extends Calculadora {
	public CalculadoraCientifica(double numero1, double numero2) {
		super(numero1, numero2);
	}

	@Override
	public double sumar() {
		return getNumero1() + getNumero2();
	}

	@Override
	public double restar() {
		return getNumero1() - getNumero2();
	}

	@Override
	public double multiplicar() {
		return getNumero1() * getNumero2();
	}

	@Override
	public double dividir() {
		if (getNumero2() != 0) {
			return getNumero1() / getNumero2();
		} else {
			throw new ArithmeticException("No se puede dividir por cero");
		}
	}
}