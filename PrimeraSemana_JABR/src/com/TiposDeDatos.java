package com; //la primera linea indica el nombre del paquete

public class TiposDeDatos {//nombre de la clase
	
	public static void main(String[] args) {//main
	
	//Comentarios de una linea se les pone
	//dos diagonales antes del enunciado
		
	/*Comentarios
	 * de
	 * multiples
	 * lineas
	 * 
	 * Nombres de los paquetes - inician con minuscula
	 * Nombres de las clases - inician con Mayúscula
	 * Respetamos el uso de CamelCase
	 * 
	 */
		
		//Guardar cambios en el código - Ctrl + s
		
	//Declaración de tipos de datos
	
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
	
	//Declarando variables de estos tipos de datos
	byte numero1; //Variable declarada, sin valor asignado
	short numero2; //No pueden existir nombres de variables
	//duplicados aunque contengan distinto tipo de dato
	int numero3;
	long numero4;
	
	numero1=5; //Con las variables declaradas sin valor
	//podemos asiganerle un valor posteriormente
	numero1=9; //Puedo asignar valores posteriores, pero
	//recordemos que existe la "verticalidad", por lo que
	//ahora numero1 realmente vale 9 y se omite
	//su valor más atrasado
	
	//Variables declaradas con un valor asignado
	//inicialmente
	byte numero5 = 127; //Emplea 1 byte de memoria, contiene
	//desde el valor -128 hasta 127
	short numero6 = 32767; //Emplea 2 bytes de memoria
	int numero7 = 2147483647; //Emplea 4 bytes de memoria
	long numero8 = 2147483649L; //Emplean 8 bytes de memoria
	//Las variables de tipo de long, una vez exceden el rango
	//de los valores "int", necesitan utilizar un sufijo "L"
	//mayuscula o minuscula para poder contener el valor
	
	//La variable comodin más utilizada de los numéricos
	//enteros es la tipo "int"
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMÉRICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
	 */
	
	float numero9 = 9.8990532F;
	//Float ocupa 4 bytes y necesita emplear el sufijo "F"
	//para poder contener el valor asignado
	double numero10 = 9.89743247676645; //8 bytes
	//La variable comodin a utilizar es la de tipo
	//"double"
	
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * Booleanos
	 * Caracter
	 */
	
	boolean evalua = true; //Facilitan el trabajo
	//al evaluar condiciones o expresiones
	//Solo admiten valores "true" o "false"
	
	char caracter = ' '; //Puede contener un solo caracter
	//y se le asigna el valor de ese caracter
	//entre comilla simple
	
	/*TIPOS DE DATOS NO PRIMITIVOS
	 * 
	 *TIPOS DE DATOS ESTRUCTURADOS
	 *TIPOS DE DATO OBJETO
	 *TIPOS DE DATO REFERENCIALES
	 *TIPOS DE DATO WRAPPER (ENVOLTORIO)
	 */
	
	//Cadena de Texto (String)
	
	String cadena = "Hola mundo hoy es martes 8 de agosto";
	
	String nombre = "Jorge Alejandro";
	
	//El tipo de dato String admite secuencias de caracteres
	//Es decir, admite letras, simbolos, espacios, numeros
	//Pero, no por el hecho de poder admitir valores numericos
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
	//los tipos de dato envoltorio se visualizan al
	//escribir un punto "." después del nombre de la variable
	//para utilizar esa propiedad de acuerdo a lo que
	//necesitemos realizar
	
	//Para poder darle salida a nuestros datos
	//y visualizarlos en consola
	System.out.println("Hola mundo");
	
	//Atajo para escribir el System.out.println
	//syso + Ctrl + espacio
	System.out.println(numero12);
	
	System.out.println(numero12+numero11);
	
	//Concatenacion
	System.out.println("El resultado es = " + (numero12+numero11));
	
	
	
	
	
	
	
	
	
		
	}

}
