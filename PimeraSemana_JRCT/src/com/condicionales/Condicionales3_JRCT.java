package com.condicionales;
import java.util.Scanner;

public class Condicionales3_JRCT {


		public static void main(String[] args) {
			// .Crea un programa que pida al usuario dos números 
			//y muestre el resultado de su división. Si el
			//segundo número es 0, debe mostrar un mensaje de error.

			int a;
			int b;
			
			Scanner input = new Scanner(System.in);
			System.out.println("introduzca el dividendo: ");
			a = input.nextInt();
			
			System.out.println("introduzca el divisor");
			b = input.nextInt();
			
			if(a==0) {
				System.out.println("ERROR");
			}else if(b==0) {
				System.out.println("ERROR");
			}else {
				System.out.println("Resultado dividido: " + a/b);
			}
			
			
			
			
			
			
			
			
			
		}

	}



