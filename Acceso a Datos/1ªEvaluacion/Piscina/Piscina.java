package Piscina;

public class Piscina {
	private int capacidadMaxima;
	private int capacidadActual;
	
	public Piscina(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = 0;
	}
	
	public void llenar(int numLitros) throws PiscinaLlenaException {
		try {
			if (capacidadActual+numLitros>capacidadMaxima) {
				throw new PiscinaLlenaException("SOBRAN "+(capacidadActual+numLitros-capacidadMaxima)+" LITROS");
			}else {
				capacidadActual+=numLitros;
			}
		}catch(PiscinaLlenaException ple) {
			//ple.printStackTrace();
		
		}
	}
	
	public void vaciar(int numLitros) throws PiscinaVaciaException{
		try {
			if(this.capacidadActual-numLitros<0) {
				throw new PiscinaVaciaException("INTENTAS QUITAR "+(numLitros-this.capacidadActual)+" LITROS DE MÁS");
			}else {
				capacidadActual-=numLitros;
				System.out.println("QUEDAN "+capacidadActual+" LITROS");
			}
		}catch(PiscinaVaciaException pve) {
			//pve.printStackTrace();
		}
		
	}
	@Override
	public String toString() {
		return "Piscina [capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + "]";
	}

	
}