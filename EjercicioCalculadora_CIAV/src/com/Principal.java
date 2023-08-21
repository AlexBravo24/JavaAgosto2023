package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		CalcCientifica calcu1 = new CalcCientifica();
		calcu1.setMarca("CASIO");
		
		System.out.println("Calculadora Cientifica " + calcu1.getMarca());
		
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        calcu1.num1 = entrada.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        calcu1.num2 = entrada.nextDouble();
        
        System.out.println("Resultado de las operaciones: ");
        System.out.println("Suma de \t" + calcu1.num1 + " + " + calcu1.num2 + " = " + calcu1.Sumar(calcu1.num1, calcu1.num2));
        System.out.println("Resta de \t" + calcu1.num1 + " - " + calcu1.num2 + " = " + calcu1.Restar(calcu1.num1, calcu1.num2));
        System.out.println("Producto de \t" + calcu1.num1 + " * " + calcu1.num2 + " = " + calcu1.Multiplicar(calcu1.num1, calcu1.num2));
        System.out.println("División de \t" + calcu1.num1 + " / " + calcu1.num2 + " = " + calcu1.Dividir(calcu1.num1, calcu1.num2));
        
        calcu1.tomarTemperatura();
        calcu1.hora();
        
        
        //Las clases pueden timar comportamientos de 3 lados:
        /*
         * 1.- Metodos Propios
         * 2.- De otras clases (clase Padre) / Clase Abstracta
         * 3.- Interfaces
         * */
        
        
        
        
		
        entrada.close();

	}

}
