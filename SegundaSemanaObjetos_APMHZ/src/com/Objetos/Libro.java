package com.Objetos;

public class Libro {

	// Declaro los atributos de mi "objeto" o "instancia"
	
	private String genero;
	private int hojas;
	private double precio;
	private String autor;
	
	// M�todos constructores -> m�todos para construir
	// o definir valores a nuestros objetos
	
	// M�todo constructor vac�o
	
	public Libro() {
		// Nos sirve para crear o instanciar un objeto
		// sin valor asignados inicialmente
	}
	
	// M�todo constructor con argumentos
	// Nos sirve para crear o instanciar un objeto
	// con valor asignados inicialmente
	
	// click izquierdo > source > generate constructor using fields
	public Libro(String genero, int hojas, double precio, String autor) {
		super();
		this.genero = genero;
		this.hojas = hojas;
		this.precio = precio;
		this.autor = autor;
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

	public int getHojas() {
		return hojas;
	}

	public void setHojas(int hojas) {
		this.hojas = hojas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	// M�todo toString
	// Auxiliar para la salida de datos en consola
	
	@Override
	public String toString() {
		return "Libro [genero=" + genero + ", hojas=" + hojas + ", precio=" + precio + ", autor=" + autor + "]";
	}
	
	
	
}
