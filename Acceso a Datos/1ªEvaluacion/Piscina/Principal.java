package Piscina;

public class Principal {

	public static void main(String[] args) throws PiscinaLlenaException, PiscinaVaciaException {
	
		Piscina piscina=new Piscina(100);
		piscina.llenar(50);
		piscina.llenar(50);
		piscina.llenar(50);
		try {
			piscina.vaciar(150);
		}catch(PiscinaVaciaException pve) {
			pve.printStackTrace();
		}
		
		System.out.println(piscina);

	}

}