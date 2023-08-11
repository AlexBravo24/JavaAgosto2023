package com.ciclos;

public class Ciclos7_APMHZ {

	public static void main(String[] args) {
		// Una persona desea invertir $700.00 en un banco,
		// el cual le otorga un 2% de interés mensual.
		// ¿En cuántos meses tendrá más de $1500,
		// si reinvierte cada mes todo su dinero?
		
		double inversion = 700;
		double interes = 0.02;
		int meses = 0;
		
		do {
			inversion = ( inversion + (inversion * interes) );
			meses++;
		} while (inversion <= 1500);
		
		System.out.println("En " + meses + " meses tendra mas de $1500");
		System.out.println("Usted tendrá $"+inversion);
		
		
		
	}

}
