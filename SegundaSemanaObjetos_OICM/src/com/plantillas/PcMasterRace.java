package com.plantillas;

public class PcMasterRace {
	private String cpu;
	private String gpu;
	private String panel;
	private int inpanel;
	private int hzpanel;
	private int almacenamiento;
	private int ram;
	
	public PcMasterRace() {
		//Metodo Constructor Vacio
	}
	
	//Metodo constructor con todos los atributos
	public PcMasterRace(String cpu, String gpu, String panel, int inpanel, int hzpanel, int almacenamiento, int ram) {
		super();
		this.cpu = cpu;
		this.gpu = gpu;
		this.panel = panel;
		this.inpanel = inpanel;
		this.hzpanel = hzpanel;
		this.almacenamiento = almacenamiento;
		this.ram = ram;
	}

	
	//Metodos Getters & Setters
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public int getInpanel() {
		return inpanel;
	}

	public void setInpanel(int inpanel) {
		this.inpanel = inpanel;
	}

	public int getHzpanel() {
		return hzpanel;
	}

	public void setHzpanel(int hzpanel) {
		this.hzpanel = hzpanel;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	//Metodo toString para poder visualizar 'n' atributos de nuestro objeto
	@Override
	public String toString() {
		return "PcMasterRace [cpu=" + cpu + ", gpu=" + gpu + ", panel=" + panel + ", inpanel=" + inpanel + ", hzpanel="
				+ hzpanel + ", almacenamiento=" + almacenamiento +"TB" + ", ram=" + ram + "]";
	}
	
	
	
	
}
