package com;

public class Curso {
	
	private String nombreCurso;
	private int numHoras;
	private String instructor;
	private double precio;
	private boolean enLinea;
	
	public Curso () {}

	public Curso(String nombreCurso, int numHoras, String instructor, double precio, boolean enLinea) {
		super();
		this.nombreCurso = nombreCurso;
		this.numHoras = numHoras;
		this.instructor = instructor;
		this.precio = precio;
		this.enLinea = enLinea;
	}

	public final String getNombreCurso() {
		return nombreCurso;
	}

	public final void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public final int getNumHoras() {
		return numHoras;
	}

	public final void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public final String getInstructor() {
		return instructor;
	}

	public final void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public final double getPrecio() {
		return precio;
	}

	public final void setPrecio(double precio) {
		this.precio = precio;
	}

	public final boolean isEnLinea() {
		return enLinea;
	}

	public final void setEnLinea(boolean enLinea) {
		this.enLinea = enLinea;
	}

	
	
	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", numHoras=" + numHoras + ", instructor=" + instructor
				+ ", precio=" + precio + ", enLinea=" + enLinea + "]";
	}
	
	
}
