package com.condicionales;

import java.util.Scanner;

public class Condicionales07_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el n�mero de alumnos: ");
        int numAl = entrada.nextInt();

        int costoAl;
        int costoTotalCom = 0;

        if (numAl >= 100) {
            costoAl = 65;
        } else if (numAl >= 50) {
            costoAl = 70;
        } else if (numAl >= 30) {
            costoAl = 95;
        } else {
            costoAl = 0;
            costoTotalCom = 4000;
        }

        if (costoAl > 0) {
            costoTotalCom = costoAl * numAl;
        }

        System.out.println("El costo por alumno es: " + costoAl + " euros");
        System.out.println("El costo total para la compa��a de autobuses es: " + costoTotalCom + " euros");

        entrada.close();
    }

}
