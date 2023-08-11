package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o tambien llamados Bucles
		//Nos ayudan a ejecutar "n" veces una accion
		//de acuerdo a una condicion
		
		//En el caso de los ciclos nos apoyamos en una 
		//variable, muchas veces numerica, puede ser booleana
		//etc. Porque de acuerdo al cambio de esa variable
		//es como se va a ejecutar la accion 
		
		//while (Mientras...., se cumpla una condicion)
		
		int x = 1;
		
//		while(x<5) { //mientras x sea menor a 5, realiza los sig...
//			System.out.println("Hello World");	//se ejecuta una vez
//			//pero se vuelve a evaluar el valor de X
//			//para evitar que el ciclo tienda al infinito
//			//indicamos un incremento o decremento, segun sea 
//			//necesario
//			x++; //indicamos un incremento de 1 para x
//		}
		
		//do-while - Similar al ciclo while, pero aseguramos que 
		//nuestro codigo se ejecute al menos 1 vez, en caso
		//de caer en una condicion que un inicio sea falsa
		//porque la condicion se evaluara al final
		
//		do { //Haz lo siguiente...
//			System.out.println("Hello World");
//		}while(x>2); //mientras X sea mayor a 2
		
		
		//FOR - Determinado - Se utiliza cuando conocemos 
		//o tenemos una idea de cuantas veces queremos que
		//se realice una accion
		
		//Ciclo for(variable iniciada; condicion; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World " + i);
		}

	}//cierre de main 

}
