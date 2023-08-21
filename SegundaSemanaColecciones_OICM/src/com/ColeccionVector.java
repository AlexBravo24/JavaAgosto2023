package com;

//import java.util.List;
import java.util.Vector;

public class ColeccionVector {

	public static void main(String[] args) {
		
		/*Vector: Esta clase es legacy y se encarga de gestionar 
		 * el concepto de lista de una forma Thread save . 
		 * La clase existe desde Java 1.0
		 */

		
		Vector<String> texto = new Vector<>();
		
		//Agregar elementos a nuestra lista
		texto.add("Elemento 1");
		texto.add("Elemento 2");
		texto.add("Elemento 3");
		texto.add("5");
		texto.addElement("Elemento 6");
		
		//Mostrar elementos de la lista
		System.out.println(texto);
		
		//Mostrar un elemento especifico de mi lista
		System.out.println(texto.get(1));
		
		//devolver un valor True si el elemnto existe 
		//dentro de la lista
		System.out.println(texto.contains("5"));
		
		//eliminar elementos
		//Mediante la posicion
		texto.remove(3);
		
		System.out.println(texto);
		
		//Agregar una posicion en el indice y desplazar los valores
		
		texto.add(1, "///");
				
		System.out.println(texto);
		
		//Si queremos sustituir un valor de una posicion
		texto.set(1, "Otra Cosa");
		System.out.println(texto);
		
		
		System.out.println("--------------");
		
		// clase vector
		
		Vector v1 = new Vector();
		Vector v2 = new Vector(10);
		Vector v3 = new Vector(v2);
		
		//Crear vectores con un tipo de datos
		Vector <String> vector = new Vector<String>();
		
		vector.addElement("cadena 1");
		
		vector.addElement("cadena 2");
		
		vector.insertElementAt("AJ", 1);
		
		//Acceder
		
		System.out.println(vector.get(2));
		System.out.println(vector.size());
		System.out.println(vector.elementAt(1));
		
		vector.addElement("cadena 4");
		System.out.println(vector);
		System.out.println(vector.size());
		
		//Eliminar
		vector.removeElement(0);
		vector.removeElement("AJ");
		System.out.println(vector);
		
//		vector.removeAll(vector);
		
		vector.insertElementAt("AJ", 1);
		
		//Operaciones
		System.out.println(vector.contains("AJ"));
		System.out.println(vector.indexOf("AJ"));

	}

}
