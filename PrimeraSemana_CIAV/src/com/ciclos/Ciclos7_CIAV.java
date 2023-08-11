package com.ciclos;

import java.util.Scanner;

public class Ciclos7_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se solicita la cantidad de capital inicial al usuario
        System.out.print("Ingrese la cantidad de capital inicial: ");
        double capInic = entrada.nextDouble();

        // Se solicita la cantidad de dinero objetivo al usuario
        System.out.print("Ingrese la cantidad de dinero objetivo: ");
        double cantObjetivo = entrada.nextDouble();

        // Verificar que la cantidad objetivo sea mayor al capital inicial
        if (cantObjetivo <= capInic) {
            System.out.println("La cantidad objetivo debe ser mayor al capital inicial.");
            return;
        }

        double intMes = 0.02; // 2% de interés mensual
        double capActual = capInic;
        int meses = 0;

        System.out.println("Mes\tCapital");

        while (capActual < cantObjetivo) {
        	capActual *= (1 + intMes);
            meses++;
            System.out.printf("%d\t$%.2f%n", meses, capActual);
        }

        System.out.println("Se alcanzó la cantidad objetivo en " + meses + " meses.");

        entrada.close();
    }
}
