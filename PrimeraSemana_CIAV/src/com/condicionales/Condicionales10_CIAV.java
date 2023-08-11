package com.condicionales;

import java.util.Scanner;

public class Condicionales10_CIAV {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 12 para representar un mes: ");
        int numMes = entrada.nextInt();

        int numDias;

        switch (numMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28;
                break;
            default:
                numDias = -1; // Valor para indicar mes inválido
                break;
        }

        if (numDias == -1) {
            System.out.println("Mes inválido. Ingrese un número entre 1 y 12.");
        } else {
            System.out.println("El mes " + numMes + " tiene " + numDias + " días.");
        }

        entrada.close();
    }

}
