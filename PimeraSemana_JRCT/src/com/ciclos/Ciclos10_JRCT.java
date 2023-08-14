package com.ciclos;

public class Ciclos10_JRCT {

	public static void main(String[] args) {
		// Programa que lea 20 números e indique si 
		//son positivos o negativos 
		//y pares o impares 
		//y además muestre la sumatoria de los 
		//positivos y sumatoria de los impares.
		

	int numero=0;
	int sp = 0, si =0;
	
	for(numero = -10; numero <=10; numero++) {
		
		if(numero <=-1 && (numero %2 == 0)) {

			System.out.println("el numero: " +numero
					+ "  es negativo y es par");
		}else if((numero >=1 && (numero %2 == 0))){
			sp += numero;
			System.out.println("el numero: " +numero
					+ "  es positivo y es par");
			
		}else if(numero <=-1 && (numero %2 <= -0)) {
			si += numero;
			System.out.println("el numero: " +numero
					+ "  es negativo y es impar");
		}else if((numero >=1 && (numero %2 == 1))){
			sp += numero;
			si += numero;
			System.out.println("el numero: " +numero
					+ "  es positivo y es impar");
	}	
		
	}System.out.println("la suma de positivos es de: "+ sp);
	System.out.println("la suma de impares es de: "+ si);
	
	}

}
