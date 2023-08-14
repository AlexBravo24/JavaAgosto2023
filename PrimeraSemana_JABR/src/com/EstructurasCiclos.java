package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o también llamados Bucles
		//Nos ayudan a ejecutar "n" veces una acción
		//de acuerdo a una condición
		
		//En el caso de los ciclos nos apoyamos en una
		//variable, muchas veces numérica, puede ser booleana
		//etc. Porque de acuerdo al cambio de esa variable
		//es como se va a ejecutar la acción
		
		//while (Mientras...., se cumpla una condición)
		
		int x = 1;
		
//		while(x<5) { //mientras X sea menor a 5, realiza lo sig...
//			System.out.println("Hola mundo"); //Se ejecuta una vez
//			//pero se vuelve a evaluar el valor de X
//			//para evitar que el ciclo tienda al infinito
//			//indicamos un incremento o decremento, según sea
//			//necesario
//			x++; //indicamos un incremento de 1 para X
//		}
		
		//do-while - Similar al ciclo While, pero aseguramos que
		//nuestro codigo se ejecute al menos 1 vez, en caso
		//de caer en una condicion que en un inicio sea falsa
		//porque la condicion se evaluará al final
		
//		do {//Haz lo siguiente...
//			System.out.println("Hola mundo");
//		}while(x>2);//mientras X sea mayor a 2
		
		
		//FOR - Determinado - Se utiliza cuando conocemos
		//o tenemos una idea de cuantas veces queremos que
		//se realice una acción
		
		//Ciclo for (variable iniciada; condicion; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo " + i);
		}
	
		

	}

}
