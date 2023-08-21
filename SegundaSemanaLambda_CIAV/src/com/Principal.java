package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//EXPRESIONES LAMBDA
		
		//Una expresión lambda es una característica importante introducida
		//en Java 8 que permite definir METODOS ANÓNIMOS, los cuales
		//no tiene nombre ni pertenecen a una clase.
		
		//Las expresiones lambda son especialmente útiles cuando se trabaja
		//con interfaces funcionales, que son interfaces con un único método abstracto.
		//Estas expresiones facilitan la implementación de interfaces funcionales
		//sin tener que crear clases completas para ello.
		
		//Características clave de las expresiones lambda:
		/*
		 * Sintaxis concisa: Las expresiones lambda permiten definir funciones en 
		 * una forma compacta.
		 * 
		 * Funciones anónimas: No es necesario dar un nombre explícito a 
		 * la función. En su lugar, puedes proporcionar una implementación directamente.
		 * 
		 * Interferencia de tipo: Java puede inferir automáticamente el tipo de
		 * parámetros en la mayoría de los casos, lo que reduce la necesidad
		 * de escribir tipos explícitos.
		 * 
		 * Cierre sobre variables locales: Las expresiones lambda pueden acceder
		 * a variables locales y de instancia de la clase que las rodea.
		 * */
		
		//La sintaxis de una expresión lambda es muy sencilla: 
		//tendrá siempre 2 partes separadas por una flecha: 
		//() -> expresion
		//(parametros) -> expresion
		//(parametros) -> {sentencias;}
		//Básicamente es un método abstracto, una función sin nombre. 
		
		Calculadora suma = (a, b) -> a + b;
        Calculadora resta = (a, b) -> a - b;

        int resultadoSuma = suma.calcular(5, 3); // resultadoSuma = 8
        int resultadoResta = resta.calcular(10, 4); // resultadoResta = 6

        System.out.println("Resultado suma: " + resultadoSuma);
        System.out.println("Resultado resta: " + resultadoResta);
        
        
        //Otro ejemplo de expresion lambda con listas
        
     // Definir una expresión lambda para verificar si un número es par
        Verificador esPar = numero -> numero % 2 == 0;

        // Crear una lista de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Aplicar la expresión lambda a cada número en la lista
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (esPar.verificar(numero)) {
                System.out.println(numero);
            }
        }
	}

}

