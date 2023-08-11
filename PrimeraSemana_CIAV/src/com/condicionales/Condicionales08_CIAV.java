package com.condicionales;

import java.util.Scanner;

public class Condicionales08_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        int caraDado = entrada.nextInt();

        String caraOpuesta;

        switch (caraDado) {
            case 1:
                caraOpuesta = "Seis";
                break;
            case 2:
                caraOpuesta = "Cinco";
                break;
            case 3:
                caraOpuesta = "Cuatro";
                break;
            case 4:
                caraOpuesta = "Tres";
                break;
            case 5:
                caraOpuesta = "Dos";
                break;
            case 6:
                caraOpuesta = "Uno";
                break;
            default:
                caraOpuesta = "ERROR: número inválido";
                break;
        }

        System.out.println("La cara opuesta al resultado " + caraDado + " es: " + caraOpuesta);

        entrada.close();
    }
}
