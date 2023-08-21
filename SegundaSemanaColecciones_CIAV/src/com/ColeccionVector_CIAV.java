package com;

//Es importante importar la Interface Vector de la biblioteca util
import java.util.Vector;

public class ColeccionVector_CIAV {
	
	public static void main(String[] args) {
		
		//Un vector es una estructura de datos dinámica que se utiliza para almacenar elementos en una secuencia ordenada.
		//Los vectores pueden crecer o reducir su tamaño dinámicamente según sea necesario.
		
		//Declaracion de Vector
		
		Vector<String> miVector = new Vector<String>();
		
		//Se agregan los elementos
		
		miVector.add("Elemento 1");
		miVector.add("Elemento 2");
		miVector.add("Elemento 3");
		
		System.out.println(miVector);
		
		//Se Accede a elementos del vector utilizando el método get() y un índice:
		
		String primerElemento = miVector.get(0); // Accede al primer elemento
		
		System.out.println("Primer elemento: " + primerElemento);
		
		//Devolver el valor True si el elemento existe en la lista
				System.out.println(miVector.contains("5"));
				
				//Remover objetos de la lista
				//Mediante Posicion
				miVector.remove(2);
				System.out.println(miVector);
				
				//Mediante Objeto
				miVector.remove("Elemento1");
				System.out.println(miVector);
				
				//Agregar elemento a la lista
				miVector.add("akjd");
				System.out.println(miVector);
				
				miVector.add(0, "num1");
				System.out.println(miVector);
				
				//Sustituir o modificar valor en la lista
				miVector.set(1, "num2");
				System.out.println(miVector);
				
				
				//Declarar una lista sin parametrizar, es decir, sin indicar el tipo de dato que va a contener
				//De esta manera no estaria ligada a un solo tipo de dato
				
				Vector coleccion = new Vector();
				
				coleccion.add("Shivan");
				coleccion.add(5);
				coleccion.add(123.4324);
				coleccion.add(true);
				coleccion.add('a');
				
				System.out.println(coleccion);
				
				//Mostrar todos los elementos de la lista de manera individual
				
				for (int i = 0; i < coleccion.size() ; i++) {
					System.out.println(coleccion.get(i));
				}

	}
	
}
