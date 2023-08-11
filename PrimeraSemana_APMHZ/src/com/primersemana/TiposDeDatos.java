package com.primersemana; //La primera linea indica el nombre del paquete

public class TiposDeDatos { //nombre de la clase
	public static void main (String[] args) { //main
		//comentarios de una linea se les pone dos diagonales antes del enunciado
		/*
		 * comentarios de multiples lineas
		 * 
		 * Nombre de los paquetes - inician con minuscula
		 * Nombres de las clases - inician con mayuscula
		 * Respetamos el uso de camelcase
		 * 
		 */
		
		//guardar cambios en el codigo - ctrl+s
		
		//Declaracion de tipos de datos
		
		/* Tipos de datos primitivos
		 * Numericos Enteros
		 */
		
		//Declarando variables de estos tipos de datos
		byte numero1; //variable declarada, sin valor asignado
		short numero2; 
		/*no pueden existir nombres de variables duplicados 
		 * aunque contengan distinto tipo de dato
		 */
		int numero3;
		long numero4;
		
		numero1 = 5; //con las variables declaradas sin valor
		//podemos asignarle un valor posteriormente
		numero1 = 9; //Puedo asignar valores posteriores, pero
		//recordemos que existe la "verticalidad", por lo que 
		//ahora numero1 realmente vale 9 y se omite
		//su valor anterior
		
		//variables declaradas con un valor asignado inicialmente
		byte numero5 = 127; //byte emplea 1 byte de memoria y 
		//contiene desde el valor -128 hasta 127
		short numero6 = 32767; //emplea 2 bytes de memoria
		int numero7 = 2147483647; //emplea 4 bytes de memoria
		long numero8 = 2147483649L; //la variable de tipo long, 
		//unaa vez que excede el rango de los valores "int"
		//necesita utilizar un sufijo "L" 
		//mayuscula o minuscula para poder contener el valor
		
		/* La variable comodin más utilizada de
		 * los numéricos enteros
		 * es la tipo "int"
		 */
		
		/* Tipos de datos primitivos
		 * numéricos en punto o coma flotante 
		 * (decimales)
		 */
		
		float numero9 = 9.8990532F;
		//Float ocupa 4 bytes y necesita emplear el sufijo "F"
		//para poder contener el valor asignado
		double numero10 = 9.89743247676645; //8 bytes
		//La variable comodin a utilizar es la de tipo 
		//"double"
		
		/* Tipos de datos primitivos 
		 * Booleanos
		 * Caracter
		 */
		boolean condicion = false; //facilitan el trabajo
		//al evaluar condiciones o expresiones
		//solo admite valores "true" o "false"
		
		char caracter = ' '; //Puede contener 1 solo caracter 
		// y se le asigna el valor de ese caracter
		// entre comilla simple
		
		/* TIPOS DE DATOS NO PRIMITIVOS
		 * 
		 * TIPOS ED DATOS ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * TIPOS DE DATO REFERENCIALES
		 * TIPOS DE DATO WRAPPER (ENVOLTORIO)
		 */	
		
		//Cadena de texto (String)
		
		String cadena = "Hola mundo hoy es martes 8 de agosto";
		String nombre = "Alanis Paulina Monserrat Higinio Zepeda";
		
		//El tipo de datos String admite secuencias de caracteres
		//Es decir, admite letras, simbolos, espacios, numeros
		//pero, no por el hecho de poder admitir valores numericos
		//podemos hacer operaciones con ellos
		
		//Tipos de datos Wrapper
		
		Byte numero11 = 127;
		Short numero12 = 3000;
		Integer numero13 = 2000000;
		Long numero14 = 20000000000L;
		Double numero15 = 3000.43545;
		Float numero16 = 676764.898f;
		Character letra = 'b';
		
		numero11.toString(); //Las funcionalidades de
		//Los tipos de dato envoltorio se visualizan al
		//escribir un punto "." despues del nombre de la variable
		//para utilizar esta propiedad de acuerdo a lo que necesitemos realizar
		
		//Para poder darle salida a nuestros datos
		//y visualizarlos en la consola
		
		System.out.println("Hola mundo");
		
		//Atajo para escribir el System.out.println
		//syso + ctrl + espacio
		System.out.println(numero12);
		
		System.out.println((numero12+numero11)); 
		//parentesis para que no haya ambiguedad y realice la operacion 
		// y no concatenacion
		
		//Concatenacion
		System.out.println("El resultado es =" + numero12+numero11);
		
		//la suma seria
		System.out.println("El resultado es =" + (numero12+numero11));
		
		
		
	}
}
