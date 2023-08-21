package com;

public class Monitor {
	
	private String marca;
	private String panel;
	private double pulgadas;
	private int hz;
	
	public Monitor() {}

	public Monitor(String marca, String panel, double pulgadas, int hz) {
		super();
		this.marca = marca;
		this.panel = panel;
		this.pulgadas = pulgadas;
		this.hz = hz;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public int getHz() {
		return hz;
	}

	public void setHz(int hz) {
		this.hz = hz;
	}

	@Override
	public String toString() {
		return "Monitor [marca=" + marca + ", panel=" + panel + ", pulgadas=" + pulgadas + ", hz=" + hz + "]";
	}
	
	

}
