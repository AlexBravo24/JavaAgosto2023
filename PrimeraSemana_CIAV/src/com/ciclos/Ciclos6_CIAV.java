package com.ciclos;

import java.util.Scanner;

public class Ciclos6_CIAV {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se solicita la cantidad de capital inicial al usuario
        System.out.print("Ingrese la cantidad de capital inicial (mayor a $1000.00): ");
        double capInicial = entrada.nextDouble();

        // Se verifica que el capital inicial sea mayor a $1000.00
        if (capInicial <= 1000.00) {
            System.out.println("El capital inicial debe ser mayor a $1000.00.");
            return;
        }

        double inteMensual = 0.02; // 2% de interés mensual
        double capFinal = capInicial;

        System.out.println("Mes\tCapital Final");

        for (int i = 1; i <= 12; i++) {
        	capFinal *= (1 + inteMensual);
            System.out.printf("%d\t$%.2f%n", i, capFinal);
            //System.out.printf(i + "\t" + "$" + capFinal + "\n");
        }

        entrada.close();
    }

}
