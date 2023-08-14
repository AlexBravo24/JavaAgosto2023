package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o tambi�n llamados Bucles
		//Nos ayudan a ejecutar "n" veces una acci�n
		//de acuerdo a una condici�n
		
		//En el caso de los ciclos nos apoyamos en una
		//variable, muchas veces num�rica, puede ser booleana
		//etc. Porque de acuerdo al cambio de esa variable
		//es como se va a ejecutar la acci�n
		
		//while (Mientras...., se cumpla una condici�n)
		
		int x = 1;
		
//		while(x<5) { //mientras X sea menor a 5, realiza lo sig...
//			System.out.println("Hola mundo"); //Se ejecuta una vez
//			//pero se vuelve a evaluar el valor de X
//			//para evitar que el ciclo tienda al infinito
//			//indicamos un incremento o decremento, seg�n sea
//			//necesario
//			x++; //indicamos un incremento de 1 para X
//		}
		
		//do-while - Similar al ciclo While, pero aseguramos que
		//nuestro codigo se ejecute al menos 1 vez, en caso
		//de caer en una condicion que en un inicio sea falsa
		//porque la condicion se evaluar� al final
		
//		do {//Haz lo siguiente...
//			System.out.println("Hola mundo");
//		}while(x>2);//mientras X sea mayor a 2
		
		
		//FOR - Determinado - Se utiliza cuando conocemos
		//o tenemos una idea de cuantas veces queremos que
		//se realice una acci�n
		
		//Ciclo for (variable iniciada; condicion; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo " + i);
		}
	
		

	}

}
