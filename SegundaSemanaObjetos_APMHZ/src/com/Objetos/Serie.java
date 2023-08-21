package com.Objetos;

public class Serie {
// Clase o plantilla "Serie"
	
	// Declaro los atributos de mi "objeto" o "instancia"
	// para esta plantilla
	
	private String genero;
	private int capitulos;
	private int temporadas;
	
	// M�todos constructores -> m�todos para construir
	// o definir valores a nuestros objetos
		
	// M�todo constructor vac�o
	
	public Serie() {
		// Nos sirve para crear o instanciar un objeto
		// sin valor asignados inicialmente
	}

	
	// M�todo constructor con argumentos
	// Nos sirve para crear o instanciar un objeto
	// con valor asignados inicialmente
		
	// click izquierdo > source > generate constructor using fields
	
	public Serie(String genero, int capitulos, int temporadas) {
		super();
		this.genero = genero;
		this.capitulos = capitulos;
		this.temporadas = temporadas;
	}

	// Getters & Setters
	
	// m�todos de asignacion y de obtencion de valores
	// para asignar valores a los atributos de un objeto
	// haciendo uso de un constructor vac�o
	
	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getCapitulos() {
		return capitulos;
	}


	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}


	public int getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	// M�todo toString
	// Auxiliar para la salida de datos en consola
	@Override
	public String toString() {
		return "Serie [genero=" + genero + ", capitulos=" + capitulos + ", temporadas=" + temporadas + "]";
	}
	
	
	
	
	
}
