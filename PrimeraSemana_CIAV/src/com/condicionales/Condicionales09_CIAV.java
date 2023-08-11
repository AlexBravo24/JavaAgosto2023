package com.condicionales;

import java.util.Scanner;

public class Condicionales09_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
        int numDia = entrada.nextInt();

        String diaSemana;

        switch (numDia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "ERROR: número inválido";
                break;
        }

        System.out.println("El día número " + numDia + " de la semana es: " + diaSemana);

        entrada.close();
    }


}
