package com.Objetos;

public class Refresco {

	// declaro los atributos de mi "objeto" o "instancia"
		private String color;
		private String sabor;
		private double mililitros;
		private int caducidad;
		
		// "Métodos constructores" -> metodos para construir
		// o definir valores a nuestros objetos
		
		// Método constructor vacío
		public Refresco() {
			// Nos sirve para crear o instanciar un objeto
			// sin valores asignados inicialmente
		}


		// Método constructor con argumentos
		
		// se definirá en la clase principal los valores de los atributos
		// similar a como se hace en un arreglo de tipo "String"
		
		public Refresco(String color, String sabor, double mililitros, int caducidad) {
			super();
			this.color = color;
			this.sabor = sabor;
			this.mililitros = mililitros;
			this.caducidad = caducidad;
		}


		// Getters & Setters
		
		// métodos de asignacion y de obtencion de valores
		// para asignar valores a los atributos de un objeto
		// haciendo uso de un constructor vacío
		
		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public String getSabor() {
			return sabor;
		}



		public void setSabor(String sabor) {
			this.sabor = sabor;
		}



		public double getMililitros() {
			return mililitros;
		}



		public void setMililitros(double mililitros) {
			this.mililitros = mililitros;
		}



		public int getCaducidad() {
			return caducidad;
		}



		public void setCaducidad(int caducidad) {
			this.caducidad = caducidad;
		}

		// Método toString
		@Override
		public String toString() {
			return "Refresco [color=" + color + ", sabor=" + sabor + ", mililitros=" + mililitros + ", caducidad="
					+ caducidad + "]";
		}
		
	
}
