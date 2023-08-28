package com.condicionales;
import java.util.Scanner;//librería scanner

public class Condicionales1_JICL {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		Scanner a = new Scanner(System.in);
		int n1,n2;
		System.out.print("Introduce un número: ");
		n1=a.nextInt();
		System.out.print("Introduce otro número: ");
		n2=a.nextInt();
		if(n1==n2)
		 System.out.println("Son iguales");
		else
		 {
			if(n1>n2)
				System.out.println(n1 + " es mayor que " + n2);
			else
				System.out.println(n2 + " es mayor que " + n1);
		 }
	}

}
