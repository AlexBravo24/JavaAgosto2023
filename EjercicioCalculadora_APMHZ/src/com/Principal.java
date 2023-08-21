package com;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Crear una clase llamada calculadora
		// le declaran atributos
		// -> caracteristicas de una calculadora
		// generan sus métodos constructores
		// getters y setters
		// toString
		// Declarar 4 métodos abstractos 
		// (sumar, restar, dividir, multiplicar)
		// esto hara que calculadora sea abstracta
		// Y entonces crearán otra clase que se llame 
		// cientifica, va a heredar de calculadora
		// e implementará los métodos y ustedes
		// definirán como va a hacer las operaciones
		
		Cientifica calcien = new Cientifica();
//		
//		calcien.setColor("Gris oscuro");
//		calcien.setCosto(597.45);
//		calcien.setMarca("Casio");
//		calcien.setTipo("Calculadora cientifica");
//		System.out.println("Mi calculadora es:");
//		System.out.println(calcien);
//		
//		System.out.println("¿Qué operación desea realizar en esta calculadora?");
//		System.out.println("1) Suma");
//		System.out.println("2) Resta");
//		System.out.println("3) Multiplicacion");
//		System.out.println("4) Division");
//		System.out.println("5) Potencia al cuadrado");
//		System.out.println("Introduzca '1', '2', '3', '4', o '5'");
//		Scanner input = new Scanner(System.in);
//		int opcion = input.nextInt();
//		input.close();
//		
//		switch(opcion) {
//		case 1:
//			calcien.suma();
//			break;
//		case 2:
//			calcien.resta();
//			break;
//		case 3:
//			calcien.mult();
//			break;
//		case 4:
//			calcien.div();
//			break;
//		case 5:
//			calcien.pot();
//			break;
//		}

		// probando interface
		calcien.tomarTemperatura();
		// segunda interface
		calcien.hora();
		
		// Las clases pueden tomar comportamientos de 3 lados:
		// 1. Métodos propios
		// 2. De otras clases (Clases Padre) / Clase abstracta
		// 3. Interfaces
		
		
	}

}
