package com;

import java.util.Vector;

public class ColeccionVector_APMHZ {

	public static void main(String[] args) {
		
		// En una clase Vector se puede guardar objetos 
		// de cualquier tipo y crece dinámicamente.
		// Los elementos de un Vector deben ser Objetos
		// no pueden ser datos de tipo primitivo

		Vector v1 = new Vector();
		v1.add(1989);
		v1.add('!');
		System.out.println(v1);
		
		Vector<Integer> vector1 = new Vector<>();
		vector1.add(2000);
		vector1.add(1990);
		vector1.add(1980);
		
		System.out.println(vector1);
		
		
	}

}
