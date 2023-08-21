package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro, IReloj {

	private String tipo;
	private int numfunciones;
	private double costo;
	private String modelo;
	
	// metodo constructor vacío
	public Cientifica() {
		
	}
	
	// método constructor con argumentos
	public Cientifica(String color, String marca, String tamaño, int numteclas, String tipo, int numfunciones,
			double costo, String modelo) {
		super(color, marca, tamaño, numteclas);
		this.tipo = tipo;
		this.numfunciones = numfunciones;
		this.costo = costo;
		this.modelo = modelo;
	}

	// Getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumfunciones() {
		return numfunciones;
	}

	public void setNumfunciones(int numfunciones) {
		this.numfunciones = numfunciones;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Método toString
	@Override
	public String toString() {
		return "Cientifica [tipo=" + tipo + ", numfunciones=" + numfunciones + ", costo=" + costo + ", modelo=" + modelo
				+ ", toString()=" + super.toString() + "]";
	}

	// Métodos clase cientifica
	public void pot() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese numero");
		int num = input.nextInt();
		input.close();
		int potencia = num * num;
		System.out.println("El numero elevado al cuadrado es  " + potencia);
	}
	
	//metodos clase abstracta calculadora
	@Override
	public void suma() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		System.out.println("Ingrese otro numero");
		int num2 = input.nextInt();
		input.close();
		int sumar = num1 + num2 ;
		System.out.println("La suma de " + num1 +"+"+num2+" es igual a "+sumar);
	}

	@Override
	public void resta() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		System.out.println("Ingrese otro numero");
		int num2 = input.nextInt();
		input.close();
		int restar = num1 - num2 ;
		System.out.println("La resta de " + num1 +"-"+num2+" es igual a "+restar);
		
	}

	@Override
	public void mult() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		System.out.println("Ingrese otro numero");
		int num2 = input.nextInt();
		input.close();
		int multi = num1 * num2 ;
		System.out.println("La multiplicación de " + num1 +"x"+num2+" es igual a "+multi);
		
	}

	@Override
	public void div() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		System.out.println("Ingrese otro numero");
		int num2 = input.nextInt();
		input.close();
		if (num2 != 0) {
			int divi = num1 / num2 ;
			System.out.println("La división de " + num1 +"/"+num2+" es igual a "+divi);
		}
		else {
			System.out.println("ERROR!");
		}
		
	}

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("Temperatura normal 36.5° C");
	}

	@Override
	public void hora() {
		System.out.println("Son las 12:23");
		
	}

}
