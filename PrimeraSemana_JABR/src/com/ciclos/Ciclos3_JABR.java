package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JABR {

	public static void main(String[] args) {
		/*Realiza un programa para determinar si un String es palíndromo.
		 * 
		 */
		
		String original;
		String reversa = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa una palabra o frase");
		original=entrada.nextLine();
		entrada.close();
		
		//iterar al revés para armar la reversa
	//Para una variable que sea igual al tamaño de original-1
	//y mientras esta longitud sea mayor o igual a 0
	//indicaremos decremento en i
	//Para que la reversa se arme desde la ultima letra,
	//hacia la primera de acuerdo a como cambie la posicion de i
	for (int i=original.length()-1;i>=0;i--) {
	reversa = reversa + original.charAt(i); //extraemos los caracteres y los guardamos en reversa
													//de acuerdo a la posicion en la que se encuentran
		}
		System.out.println("Reversa: " + reversa.replace(" ",""));
		
		if (original.replace(" ","").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}

}
