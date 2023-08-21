package com;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lamda son funciones an�nimas, es decir,
		// funciones que no necesitan una "Clase".
		// Implementan un m�todo definido en una Interface funcional
		// Programacion funcional, es m�s expresivo, nos permite
		// usar menos c�digo para hacer las mismas operaciones
		// Sintaxis
		// () -> expresion
		// (parametros) -> expresion
		// (parametros) -> {cuerpo-lamda ; }
		// Cuando se tiene un solo p�rametro no es necesario utilizar 
		// par�ntesis
		// Cuando no se tiene par�metro o se tiene 2 o mas, es necesario
		// utilizar par�ntesis
		// Cuando el cuerpo de la expresi�n tiene una �nica l�nea no es
		// necesario utilizar llaves y no necesitan especificar la clausula
		// return en el caso de que deban devolver valores
		// Cuando el cuerpo de la expresion lamda tiene m�s de una l�nea se hace
		// necesario utilizar las llaves y es necesario incluir la clausula return
		// en el caso de que la funcion deba devolver un valor.
		
		// ejemplos
		// Ejemplo 1
//		IEjemplo ejemplo1 =() -> System.out.println("Ejemplo usando lamda");
//		ejemplo1.mensaje();
		
		// ejemplo2
		// no es necesario declarar tipo de dato
//		IEjemplo ejemplo1 =(nombre) -> System.out.println("Ejemplo usando lamda por"+nombre);
//		ejemplo1.mensaje("Alanis");
		
		//ejemplo3
		IEjemplo ejemplo1 =(n1, n2) -> {
			double resultado = n1+n2;
			System.out.println("Suama de "+n1 +" + " +n2 +" es: "+resultado);
		};
		
		ejemplo1.operacion(15, 4.5);

	}

}
