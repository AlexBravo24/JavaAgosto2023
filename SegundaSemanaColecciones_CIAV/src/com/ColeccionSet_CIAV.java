package com;

//Para declarar una colección Set en Java, primero debes importar la 
//interfaz Set y la clase de implementación que deseas utilizar del paquete java.util.

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ColeccionSet_CIAV {
	public static void main(String[] args) {
		
		//COLECCIONES TIPO SET
		
		//SET - Set es una interfaz que extiende la interfaz Collection 
		//y representa una colección que no permite elementos duplicados.
		
		//Como su nombre lo indica, esta interfaz modela la abstracción 
		//matemática de un conjunto.
		
		//Set también agrega un contrato más fuerte en el comportamiento 
		//de las operaciones equals y hashCode, lo que permite comparar 
		//significativamente las instancias de Set incluso si sus tipos 
		//de implementación difieren.
		
		//En Java, puedes declarar una colección tipo Set utilizando 
		//la interfaz Set y una de sus implementaciones concretas, 
		//como HashSet, LinkedHashSet o TreeSet.
		
		// Declarar un conjunto de strings utilizando HashSet
        Set<String> conjuntoString = new HashSet<String>();

        // Agregar elementos al conjunto
        conjuntoString.add("Elemento 1");
        conjuntoString.add("Elemento 2");
        conjuntoString.add("Elemento 3");

        // Imprimir el conjunto
        System.out.println(conjuntoString);
        
     // Declarar un conjunto de enteros utilizando HashSet
        Set<Integer> conjuntoInt = new HashSet<Integer>();

        // Agregar elementos al conjunto
        conjuntoInt.add(123);
        conjuntoInt.add(23);
        conjuntoInt.add(3);

        // Imprimir el conjunto
        System.out.println(conjuntoInt);
        

        //El metodo get no existe en la coleccion Set
//      //Mostrar un elemento específico de la lista
//		
//      System.out.println(conjuntoString.get("Elemento 1"));
      		
        
      //Devolver el valor True si el elemento existe en la lista
      System.out.println(conjuntoInt.contains(3));
      		
      //Remover objetos de la lista
      //Mediante Posicion
      conjuntoInt.remove(2);
      System.out.println(conjuntoInt);
      		
      //Mediante Objeto
      conjuntoString.remove("Elemento1");
      System.out.println(conjuntoString);
      		
      //Agregar elemento a la lista
      conjuntoString.add("akjd");
      System.out.println(conjuntoString);
 
      //no existe el metodo add con dos parametros para cambiar la posicion puntualmente
//      conjuntoString.add(0, "num1");
//      System.out.println(conjuntoString);
      
//      //No existe el metodo set en la interfaz set		
//      //Sustituir o modificar valor en la lista
//      conjuntoString.set(1, "num2");
//      System.out.println(conjuntoString);
      		

      //No se puede inicializar un set sin parametrizar.
//      //Declarar una lista sin parametrizar, es decir, sin indicar el tipo de dato que va a contener
//      //De esta manera no estaria ligada a un solo tipo de dato
//      	
//      List coleccion = new ArrayList();
//      		
//      coleccion.add("Shivan");
//      coleccion.add(5);
//      coleccion.add(123.4324);
//      coleccion.add(true);
//      coleccion.add('a');
//      		
//      System.out.println(coleccion);
      		
 
      //Mostrar todos los elementos de la lista de manera individual
      		
   // Usar un bucle for-each para mostrar los elementos
      System.out.println("Usando bucle for-each:");
      for (String elemento : conjuntoString) {
          System.out.println(elemento);
      }

        
	}
	
}
