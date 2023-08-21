package com;

public class Gpu {
	
	private String modelo;
	private int vram;
	private int pciExpress;
	
	public Gpu() {}

	public Gpu(String modelo, int vram, int pciExpress) {
		super();
		this.modelo = modelo;
		this.vram = vram;
		this.pciExpress = pciExpress;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVram() {
		return vram;
	}

	public void setVram(int vram) {
		this.vram = vram;
	}

	public int getPciExpress() {
		return pciExpress;
	}

	public void setPciExpress(int pciExpress) {
		this.pciExpress = pciExpress;
	}

	@Override
	public String toString() {
		return "Gpu [modelo=" + modelo + ", vram=" + vram + ", pciExpress=" + pciExpress + "]";
	}
	
	 

}
