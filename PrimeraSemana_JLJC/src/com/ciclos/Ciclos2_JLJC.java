package com.ciclos;
import java.util.Scanner;
public class Ciclos2_JLJC {

	public static void main(String[] args) {
		/*Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		23 x 95 = ???
      */

		Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número (numero de veces a multiplicar): ");
        int num2 = entrada.nextInt();
        		
		for(int i = 1; i <= num2; i++) {
			System.out.println(num1 * i);
		}
		
		entrada.close();
	}

}
