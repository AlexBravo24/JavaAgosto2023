package com.condicionales;

import java.util.Scanner;

public class Condicionales14_JICL {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas: ");
        int hrsTrab = entrada.nextInt();

        double salario;

        if (hrsTrab <= 40) {
            salario = hrsTrab * 16;
        } else {
            int hrsNorm = 40;
            int hrsXtr = hrsTrab - 40;

            double salHrsNorm = hrsNorm * 16;
            double salHrsXtr = hrsXtr * 20;

            salario = salHrsNorm + salHrsXtr;
        }

        System.out.println("El salario semanal del obrero es: $" + salario);

        entrada.close();
    }
}
