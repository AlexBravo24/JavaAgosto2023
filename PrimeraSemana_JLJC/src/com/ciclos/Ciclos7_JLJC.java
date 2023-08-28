package com.ciclos;
import java.util.Scanner;

public class Ciclos7_JLJC {

	public static void main(String[] args) {
		/* Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		dinero? */
		
		Scanner in = new Scanner(System.in);
        double capital_final, capital_inicial;
        System.out.print("Ingresa el valor de capital inicial: ");
        capital_inicial = in.nextDouble();
        in.nextLine();
        capital_final=capital_inicial*1.02;
        System.out.println("Valor de capital final: " + capital_final);

	}

}
