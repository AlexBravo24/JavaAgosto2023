package com.condicionales;
import java.util.Scanner;//librer�a scanner

public class Condicionales1_JICL {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		Scanner a = new Scanner(System.in);
		int n1,n2;
		System.out.print("Introduce un n�mero: ");
		n1=a.nextInt();
		System.out.print("Introduce otro n�mero: ");
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
