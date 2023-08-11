package com.condicionales;

import java.util.Scanner;

public class Condicionales12_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC (Indice de Masa Corporal) es: " + imc + " unidades");

        if (imc < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Peso normal (saludable)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso (obesidad grado 1)");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Sobrepeso crónico (obesidad grado 2)");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad premórbida (obesidad grado 3)");
        } else {
            System.out.println("Obesidad mórbida (obesidad grado 4)");
        }

        entrada.close();
    }
}
