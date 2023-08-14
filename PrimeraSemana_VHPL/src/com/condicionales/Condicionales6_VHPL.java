package com.condicionales;

import java.util.Scanner;

public class Condicionales6_VHPL {

	public static void main(String[] args) {
		// 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
		//    de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se 
		//    realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar 
		//    cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo 
		//    siguiente: * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 
		//    1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos 
		//    cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado

		
		Scanner input = new Scanner(System.in);
		
		int numalumnos;								// Se deben de declarar las variables desde el inicio
		int costoalumno;
		int costototal;
		
		System.out.print("Ingrese el n�mero de alumnos: ");
        numalumnos = input.nextInt();
        
        
        if (numalumnos >= 100) {
            costoalumno = 65;
            costototal = numalumnos * costoalumno;
        } else if (numalumnos >= 50) {
            costoalumno = 70;
            costototal = numalumnos * costoalumno;
        } else if (numalumnos >= 30) {
            costoalumno = 95;
            costototal = numalumnos * costoalumno;
        } else {
            costoalumno = 0; 								//No se cobra por alumno, ya que se paga una cantidad fija por el autob�s
            costototal = 4000;
        }
        
        System.out.println("El costo por alumno es: " + costoalumno + " euros");
        System.out.println("El costo total a la compa��a de autobuses es: " + costototal + " euros");
        
        input.close();
		
		
	}
}
