package com.ciclos;

public class Ciclos7_SMP {
	public static void main(String[] args) {
		/*
		 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de
		 * interés mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada
		 * mes todo su dinero?
		 */

		double inversionInicial = 700.00;
		double tasaInteresMensual = 0.02; // 2% de interés mensual
		double objetivo = 1500.00;

		int meses = calcularMesesInteresCompuesto(inversionInicial, tasaInteresMensual, objetivo);

		System.out.println("La persona tendrá más de $1500 después de " + meses + " meses.");
	}

	public static int calcularMesesInteresCompuesto(double inversionInicial, double tasaInteresMensual,
			double objetivo) {
		double saldo = inversionInicial;
		int meses = 0;

		while (saldo < objetivo) {
			saldo += saldo * tasaInteresMensual;
			meses++;
		}

		return meses;

	}

}
