package com.ciclos;

public class Ciclos7_JRCT {

	public static void main(String[] args) {
		/*
		 * Una persona desea invertir $700.00 en un banco,
		 *  el cual le otorga un 2% de interés
mensual. ¿En cuántos meses tendrá más de $1500, 
si reinvierte cada mes todo su
dinero?

		 */


		double ingreso = 700;
		double interes = 0.02;
		int meses = 0;
		
		
		while(ingreso <= 1500) {
			ingreso = (ingreso +(ingreso*interes));
			meses++;
			
		}if(ingreso>=1500) {
			System.out.println( meses +" meses a ahorra para ganar: "
		+ ingreso);
	}
		
		
		

		
		
	}
		
	}

