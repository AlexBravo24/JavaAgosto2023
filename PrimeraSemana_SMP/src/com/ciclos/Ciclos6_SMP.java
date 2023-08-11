package com.ciclos;

public class Ciclos6_SMP {
	public static void main(String[] args) {

		/*
		 * 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		 * de interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá
		 * al cabo de un año si todo el dinero lo reinvierte?
		 */
		double inversionInicial = 1000.00;
		double tasaInteresMensual = 0.02; // 2% de interés mensual
		int numeroMeses = 12; // un año

		double saldoFinal = calcularInteresCompuesto(inversionInicial, tasaInteresMensual, numeroMeses);

		System.out.println("El saldo final después de un año será: $" + saldoFinal);
	}

	public static double calcularInteresCompuesto(double inversionInicial, double tasaInteresMensual, int numeroMeses) {
		double saldo = inversionInicial;
		for (int i = 0; i < numeroMeses; i++) {
			saldo += saldo * tasaInteresMensual;
		}
		return saldo;

	}

}
