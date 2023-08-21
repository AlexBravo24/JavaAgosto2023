package com.plantillas;

public class Tv {
	
	private String modelo;
	private int pulgadas;
	private String panel;
	private String resolucion;
	
	public Tv() {
		//Metodo constructor Vacio
	}
	
	//Metodo constructor con todos los atributos
	public Tv(String modelo, int pulgadas, String panel, String resolucion) {
		super();
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.panel = panel;
		this.resolucion = resolucion;
		
	}
	
	
	//Metodos Getters & Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Tv [modelo=" + modelo + ", pulgadas=" + pulgadas + ", panel=" + panel + ", resolucion=" + resolucion
				+ "]";
	}
	
	
	
	

}
