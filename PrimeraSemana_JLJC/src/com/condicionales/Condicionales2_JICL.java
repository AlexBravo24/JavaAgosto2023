package com.condicionales;
import java.util.Scanner;//librería scanner

public class Condicionales2_JICL {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.


        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
	}

}
