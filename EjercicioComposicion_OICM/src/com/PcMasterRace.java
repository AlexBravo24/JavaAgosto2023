package com;

public class PcMasterRace {

		private Cpu cpu;
		private Gpu gpu;
		private Monitor monitor;
		private Almacenamiento almacenamiento;
		private Ram ram;
		private Fuente fuente;
		private TarjetaMadre tarjetaMadre;
		
		public PcMasterRace() {}

		public PcMasterRace(Cpu cpu, Gpu gpu, Monitor monitor, Almacenamiento almacenamiento, Ram ram, Fuente fuente,
				TarjetaMadre tarjetaMadre) {
			super();
			this.cpu = cpu;
			this.gpu = gpu;
			this.monitor = monitor;
			this.almacenamiento = almacenamiento;
			this.ram = ram;
			this.fuente = fuente;
			this.tarjetaMadre = tarjetaMadre;
		}

		public Cpu getCpu() {
			return cpu;
		}

		public void setCpu(Cpu cpu) {
			this.cpu = cpu;
		}

		public Gpu getGpu() {
			return gpu;
		}

		public void setGpu(Gpu gpu) {
			this.gpu = gpu;
		}

		public Monitor getMonitor() {
			return monitor;
		}

		public void setMonitor(Monitor monitor) {
			this.monitor = monitor;
		}

		public Almacenamiento getAlmacenamiento() {
			return almacenamiento;
		}

		public void setAlmacenamiento(Almacenamiento almacenamiento) {
			this.almacenamiento = almacenamiento;
		}

		public Ram getRam() {
			return ram;
		}

		public void setRam(Ram ram) {
			this.ram = ram;
		}

		public Fuente getFuente() {
			return fuente;
		}

		public void setFuente(Fuente fuente) {
			this.fuente = fuente;
		}

		public TarjetaMadre getTarjetaMadre() {
			return tarjetaMadre;
		}

		public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
			this.tarjetaMadre = tarjetaMadre;
		}

		@Override
		public String toString() {
			return "PcMasterRace \n cpu=" + cpu + "\n gpu=" + gpu + "\n monitor=" + monitor + "\n almacenamiento="
					+ almacenamiento + "\n ram=" + ram + "\n fuente=" + fuente + "\n tarjetaMadre=" + tarjetaMadre;
		}
		
		

}
