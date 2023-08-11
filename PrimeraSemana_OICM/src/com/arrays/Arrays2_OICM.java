package com.arrays;

import java.text.DecimalFormat;

public class Arrays2_OICM {

	public static void main(String[] args) {
		
		//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.
		double suma = 0;
		double media;
		
		System.out.println("---- Array de 100 posiciones ----");
		
		int [] numeros = new int [100];
		
		for(int i = 0; i < numeros.length; i++ ) {
			numeros [i] = i + 1;
		}
		
		for(int i:numeros) {
			suma = suma + i;
		}
		
		media = suma / numeros.length;
		
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.println("La suma del 1 al 100 es: "+ df.format(suma));
		System.out.println("La media es: "+ media);		
	}

}
