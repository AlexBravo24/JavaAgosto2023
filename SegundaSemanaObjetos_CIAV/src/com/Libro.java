package com;

public class Libro {
	
	private String titulo;
	private String autor;
	private String editorial;
	private int a�oPublicacion;
	private int numPaginas;
	
	//Al agregar un modificador static a una variable o metodo
	//estamos declarando que ese miembro pertenece a la clase en si
	//y no a instancias separadas
	private static int precio = 20000;
	private static final boolean touch = true;
	
	public Libro () {}


	public Libro(String titulo, String autor, String editorial, int a�oPublicacion, int numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.a�oPublicacion = a�oPublicacion;
		this.numPaginas = numPaginas;
	}
	
	
	

	public final String getTitulo() {
		return titulo;
	}


	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public final String getAutor() {
		return autor;
	}


	public final void setAutor(String autor) {
		this.autor = autor;
	}


	public final String getEditorial() {
		return editorial;
	}


	public final void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public final int getA�oPublicacion() {
		return a�oPublicacion;
	}


	public final void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}


	public final int getNumPaginas() {
		return numPaginas;
	}


	public final void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public static final int getPrecio() {
		return precio;
	}


	public static final void setPrecio(int precio) {
		Libro.precio = precio;
	}


	public static final boolean isTouch() {
		return touch;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", a�oPublicacion="
				+ a�oPublicacion + ", numPaginas=" + numPaginas + "]";
	}


	


	
	
	
	
}
