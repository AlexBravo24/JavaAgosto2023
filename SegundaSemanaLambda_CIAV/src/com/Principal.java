package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//EXPRESIONES LAMBDA
		
		//Una expresi�n lambda es una caracter�stica importante introducida
		//en Java 8 que permite definir METODOS AN�NIMOS, los cuales
		//no tiene nombre ni pertenecen a una clase.
		
		//Las expresiones lambda son especialmente �tiles cuando se trabaja
		//con interfaces funcionales, que son interfaces con un �nico m�todo abstracto.
		//Estas expresiones facilitan la implementaci�n de interfaces funcionales
		//sin tener que crear clases completas para ello.
		
		//Caracter�sticas clave de las expresiones lambda:
		/*
		 * Sintaxis concisa: Las expresiones lambda permiten definir funciones en 
		 * una forma compacta.
		 * 
		 * Funciones an�nimas: No es necesario dar un nombre expl�cito a 
		 * la funci�n. En su lugar, puedes proporcionar una implementaci�n directamente.
		 * 
		 * Interferencia de tipo: Java puede inferir autom�ticamente el tipo de
		 * par�metros en la mayor�a de los casos, lo que reduce la necesidad
		 * de escribir tipos expl�citos.
		 * 
		 * Cierre sobre variables locales: Las expresiones lambda pueden acceder
		 * a variables locales y de instancia de la clase que las rodea.
		 * */
		
		//La sintaxis de una expresi�n lambda es muy sencilla: 
		//tendr� siempre 2 partes separadas por una flecha: 
		//() -> expresion
		//(parametros) -> expresion
		//(parametros) -> {sentencias;}
		//B�sicamente es un m�todo abstracto, una funci�n sin nombre. 
		
		Calculadora suma = (a, b) -> a + b;
        Calculadora resta = (a, b) -> a - b;

        int resultadoSuma = suma.calcular(5, 3); // resultadoSuma = 8
        int resultadoResta = resta.calcular(10, 4); // resultadoResta = 6

        System.out.println("Resultado suma: " + resultadoSuma);
        System.out.println("Resultado resta: " + resultadoResta);
        
        
        //Otro ejemplo de expresion lambda con listas
        
     // Definir una expresi�n lambda para verificar si un n�mero es par
        Verificador esPar = numero -> numero % 2 == 0;

        // Crear una lista de n�meros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Aplicar la expresi�n lambda a cada n�mero en la lista
        System.out.println("N�meros pares:");
        for (int numero : numeros) {
            if (esPar.verificar(numero)) {
                System.out.println(numero);
            }
        }
	}

}

