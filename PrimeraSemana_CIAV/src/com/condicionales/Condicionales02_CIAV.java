package com.condicionales;

import java.util.Scanner;

public class Condicionales02_CIAV {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
      Scanner entrada = new Scanner(System.in);
		        
      System.out.print("Ingrese un n�mero: ");
      int numero = entrada.nextInt();
		        
      if (numero % 2 == 0) {
      System.out.println("El n�mero ingresado es par.");
      } else {
      System.out.println("El n�mero ingresado es impar.");
      }
        
      entrada.close();
		    

	}

}
