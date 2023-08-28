package com.ciclos;
import java.util.Scanner;
public class Ciclos9_JLJC {

	public static void main(String[] args) {
		/*Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos 
		*/
		
		Scanner scanner = new Scanner(System.in);
	    int numero1;
	    int numero2;
	    int minimo;
	    int maximo;
	    // Solicitud de datos al usuario
	    System.out.println("El programa imprimir� todos los n�meros pares entre dos n�meros indicados.");
	    System.out.print("Introduce el primer n�mero: ");
	    numero1 = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    numero2 = scanner.nextInt();
	    
	    // Ordenamos los valores en mayor y menor
	    if (numero1 < numero2) {
	      minimo = numero1;
	      maximo = numero2;
	    } else {
	      minimo = numero2;
	      maximo = numero1;
	    }
	    // Realizaci�n del ciclo para hacer c�lculos y mostrar en pantalla
	    for (int i=minimo+1; i < maximo; i++){
	      if (i%2==0){
	        System.out.println(i); 
	      }
	    }

	}

}
