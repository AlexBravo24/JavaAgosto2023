package com; //la primera linea indica el nombre el paquete

public class TiposDeDatos {//nombre de la clase
	public static void main(String[] args) {// metodo main, se puede escribir con maoin Ctrl + space
		//comentarios de una linea se pone 
		//dos diagonales antes del enunciado
		
		/*comentarios 
		 * de
		 * multiples
		 * lineas
		 * 
		 * 
		 * Nombres de los paquetes - inician con minuscula
		 * Nombre de las clases - inician con Mayuscula
		 * Respetmos el uso de CamelCase
		 * 
		 * 
		 */
		
		//Guardar cambios con el codigo - Ctrl + s

		//Declaracion de tipos de datos
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS ENTEROS
		 */
		
		//Declarando variables de estos tipos de datos
		
		byte numero1; //variable declarada, sin valor asginado
		short numero2; // no pueden existir nombres de variables duplicadas aunque tengan diferentes tipos de datos
		int numero3; //
		long numero4; 
		
		numero1=5; //Con las variables delcaradas sin valor 
		//podemos asignarle un valor posteriormente
		numero1=9;// puedo asignar valores posteriorres, pero 
		//recrdemos que existe la "verticalidad", por lo que
		//ahora numero1 realmente vale 9 y se omite su valor
		//mas atrasado
		
		//variable declaradas con un valor asignado
		//inicialmente
		
		byte numero5 = 127;// Emplea 1 byte de memoria, contiene
		//desde el valor -128 hasta 127
		short numero6 = 32767;//Emplea 2 bytes de memoria
		int numero7 = 2147483647;//emplea 4 bytes de meoria
		long numero8 = 2147483649L; //emplean 8 bytes de memoria
		// Las variables de tipo long, una vez que exceden el rango
		// de los valores "int", necesitan utilizar un sufijo "L"
		//mayuscula o minuscula para poder contener el valor
		
		// la variable comodin mas utilizada de los numericos
		//enteros es ka tipo "int"
		
		/*TIPODS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE (DECIAMELES)
		*/
		
		float numero9 = 9.8990532F;
		//Float ocupa 4 bytes y necesita emplear el sufijo "F"
		//para poder contener el valor asignado
		double numero10 = 9.89743247676645; // 8 bytes 
		// la variable comodin es la de tipo "double"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * caracter
		 * */
		
		boolean evalua = true; //Facilitan el trabajo
		//al evaluar condiciones o expreciones
		//Solo admiten valores "true" o "false"
		 char caracter = ' ';//puede contener un valor caracter
		 //y se le asigna el valor de ese caracter
		 //entre comilla simple
		 
		 /*TIPOS DE DATOS NO PRIMITIVO
		  * TIPOS DE DATOS ESTRUCTURADO
		  * TIPOS DE DATOS OBJETO
		  * TIPOS DE DATOS REFERENCIABLES
		  * TIPOS DE DATOS WRAPPER (ENVOLTORIO)
		  */
		 
		 // Cadena de Texto (String)
		 
		 String cadena = "Hola mundo hoy es martes 8 de agosto";
		 String nombre = "Juan Rafael Carmona Trejo";
		 
		 //El tipo de dato String admite secuencias de caracteres 
		 //Es decir, admite letras, simbolos, espacios, numeros
		 //pero, por el hecho de poder admitir  valores numericos 
		 //podemos hacer operaciones con ellos
		 
		 //Tipos de datos Wrapper
		 
		 Byte numero11 = 127;
		 Short numero12 = 3000;
		 Integer numero13 = 2000000;
		 Long numero14 = 2000000000000L;
		 Double numero15 = 3000.43545;
		 Float numero16 = 676764.898f;
		 Character letra = 'b';
		 
		 numero11.toString(); //Las funcionalidades de 
		 //los tipos de datos envoltorio se visulaizan al
		 //escribir un punto "." despues del nombre de la variable 
		 //para utilizar esa propiedad de acuerdo a lo que 
		 //necesitemos realizar
		 
		 //para poder darles salida a nuestros datos 
		 // y visualizqarlos en consola
		 
		 System.out.print("Hola mundo");
		 // atajo para escribir System.out.print
		 //syso + Ctrl + Space
		 System.out.println(numero12);
		 
		 System.out.println(numero12+numero11);
		 
		 //concatenaicon 
		 System.out.println("El resultado es = " + (numero12+numero11));
		 
	}

}
