package com.ciclos;

public class Ciclos7_JABR {

	public static void main(String[] args) {
		/*7- Una persona desea invertir $700.00 en un banco, 
		 * el cual le otorga un 2% de interés mensual. 
		 * En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.
		 * 
		 */

		double capital = 700.00;
		double interes = 0.02;
		int mes=0;
		
		while (capital<1500.00) {
			capital = capital +(capital*interes);
			mes++;
		}
		
//		for (mes = 0; capital < 1500; mes++) {
//			capital = capital +(capital*interes);
//		}
		
		System.out.println("El capital final es de: ");
		System.out.printf("%.2f", capital);
		System.out.println();
		System.out.println("Los meses que se invirtio son: " + mes);
	}

}
