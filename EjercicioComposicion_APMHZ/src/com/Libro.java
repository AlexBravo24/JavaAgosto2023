package com;

public class Libro {
	
	private String genero;
	private double precio;
	private String titulo;
	private Fecha publicacion;
	private Hojas hoja;
	private Autor autor;
	
	public Libro() {
		
	}

	public Libro(String genero, double precio, String titulo, Hojas hoja, Autor autor, Fecha publicacion) {
		super();
		this.genero = genero;
		this.precio = precio;
		this.titulo = titulo;
		this.hoja = hoja;
		this.autor = autor;
		this.publicacion = publicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Hojas getHoja() {
		return hoja;
	}

	public void setHoja(Hojas hoja) {
		this.hoja = hoja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Fecha getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Fecha publicacion) {
		this.publicacion = publicacion;
	}

	@Override
	public String toString() {
		return "Libro [genero=" + genero + ", precio=" + precio + ", titulo=" + titulo + 
				", \nhoja=" + hoja + ", \nautor=" + autor +", \npublicacion=" + publicacion +"]";
	}	
	
	
	
	
	
	
}
