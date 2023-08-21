package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Lambda -Son expresiones o funciones
		//"anonimas" que implementan un 
		//metodo de una interface funcional
		//Lo cual nos permite escribir el metodo 
		//para su uso inmediato
		//sin necesidad de que una clase 
		//defina como va a realizarse
		//Sun operador es (->)
		//Su sintaxis es (Parametros) -> {cuerpo de lambda}
		
		//Traemos una instancia de la interface funcional
		//y definimos como realizar ese metodo con los parametros que tiene
		IMetodo suma = (a,b) -> System.out.println("La Suma es:" + (a+b));
		
		//Una vez definido podemos hacer un uso inmediato de ese metodo
		suma.operacion(15, 6);
		
		IMetodo resta = (i,j) -> System.out.println("La resta es: " + (i-j));
		
		resta.operacion(15, 6);
		
	}

}
