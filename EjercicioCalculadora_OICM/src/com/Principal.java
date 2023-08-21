package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		//Crear una clase llamada calculadora
		//Le declaran atributos
		//(caracterirsticas d euna clculadora)
		//generan sus m[etodos constructores
		//getters y setters
		//toString
		//declarar 4 metodos abstractos
		//sumar,restar,dividir,multiplicar
		//ESto hara que calculadora sea abstracta
		//y entonces crearan otra clase que
		//se llame cientifica
		//cientifica va a heredar de calculadora
		//e implementara los metodos
		//y ustedes definiran como van a hacer las operaciones
		
		Cientifica calculadora1 = new Cientifica();
		
		calculadora1.setModelo("fx-82MS");
		calculadora1.setMarca("CASIO");
		calculadora1.setColor("Azul Marino");
		calculadora1.setNumdigitospantalla(11);
		calculadora1.setNumeroteclas(50);
		calculadora1.setTamaño("Mediano");
		
		System.out.println(calculadora1);
		
		Scanner input = new Scanner(System.in);
		int operacion = 0;
		calculadora1.tomarTemperatura();
		
		do {
		System.out.println("Escoge una operacion:");
		System.out.println("[1] Suma");
		System.out.println("[2] Resta");
		System.out.println("[3] Multiplicación");
		System.out.println("[4] Divición");
		System.out.println("[0] Apagar");
		
		operacion = input.nextInt();
		
		switch (operacion){
		case 1:
			calculadora1.suma();
			System.out.println();
			break;
		case 2:
			calculadora1.resta();
			System.out.println();
			break;
		case 3:
			calculadora1.multiplicar();
			System.out.println();
			break;
		case 4:
			calculadora1.dividir();
			System.out.println();
			break;
		case 0:
			System.out.println("Apagando...");
			break;
		default:
			System.out.println("Operación Invalida!");
			System.out.println();
		}
		}while(operacion != 0);
		input.close();
		
		
		//Las clases pueden tomar comportamientos de 3 lados:
		/*1. Metodos propios
		 * 2. De otras clases (clases Padre)/Clase Abstracta
		 * 3. Interfaces
		 */
		
	}//cierre main

}
