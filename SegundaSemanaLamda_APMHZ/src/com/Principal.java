package com;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lamda son funciones anónimas, es decir,
		// funciones que no necesitan una "Clase".
		// Implementan un método definido en una Interface funcional
		// Programacion funcional, es más expresivo, nos permite
		// usar menos código para hacer las mismas operaciones
		// Sintaxis
		// () -> expresion
		// (parametros) -> expresion
		// (parametros) -> {cuerpo-lamda ; }
		// Cuando se tiene un solo párametro no es necesario utilizar 
		// paréntesis
		// Cuando no se tiene parámetro o se tiene 2 o mas, es necesario
		// utilizar paréntesis
		// Cuando el cuerpo de la expresión tiene una única línea no es
		// necesario utilizar llaves y no necesitan especificar la clausula
		// return en el caso de que deban devolver valores
		// Cuando el cuerpo de la expresion lamda tiene más de una línea se hace
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
