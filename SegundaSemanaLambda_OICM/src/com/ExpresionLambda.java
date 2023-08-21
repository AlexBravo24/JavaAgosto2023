package com;


public class ExpresionLambda {
	
	public static void main (String [] arg) {
		
		/*PROGRAMACION FUNCIONAL (incluirla en java)
		 * Diferente de la programacion imperativa
		 * Lenguaje matematico formal
		 * Mas expresivo(con menos codigo) y elegante
		 * presente en otros lenguajes de programacion desde
		 * hace tiempo
		 */
		
		/*
		 * Basicamente es un metodo abstracto,una
		 * funcion sin nombre
		 * Su estructura es
		 * () -> expresion
		 * (parametros) -> expresion
		 * (parametros) -> {sentencias;}
		 */
		
		//() -> new ArrayList<>();
		//(int a, int b) -> a+b;
		//(a)->{
		//	System.out.println(a);
		//	return true;
		//}
		//Van ligadas al concepto de INTERFAZ Funcional
		/*
		 *Se trata de un interfaz con un solo metodo abstracto
		 *(que no sea static ni defaul)(sin contar equals,..).
		 *En lugar de implementar una clase, o una clase anonima,
		 *podemos utilizar una expresion lambda. 
		 */
		
		/*
		 * API Stream Nos permite trabajar realizar fácilmente 
		 * operaciones de filtrado, transformación, ordenación, 
		 * agrupación y presentación de información.
		 */
		
		ICalculadora calculadora = (n1, n2) ->{
			double resultado = n1 + n2;
			System.out.println("La Suma es: " + resultado);
		};
		
		calculadora.operacion(5, 8);
	
		
		ICalculadora calculadora1 = (n1, n2) ->{
			double resultado = n1 - n2;
			System.out.println("La Resta es: " + resultado);
		};
		
		calculadora1.operacion(15, 9);

		
	}

}
