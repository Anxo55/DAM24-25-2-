package Piscina;

public class Principal {

	public static void main(String[] args) throws PiscinaLlenaException, PiscinaVaciaException {
	
		Piscina piscina=new Piscina(100);
		try {
			
			piscina.llenar(50);
			piscina.llenar(50);
			piscina.llenar(50);
			// piscina.vaciar(200);

		} catch (PiscinaLlenaException e) {
			System.out.println("ERROR AL LLENAR LA PISCINA: "+e.getMessage());
		// } catch (PiscinaVaciaException e) {
		// 	System.out.println("PISCINA VACIA: "+e.getMessage());
		// } 
		// catch (Exception e) {
		// 	System.out.println("ERROR AL LLENAR/VAC LA PISCINA: "+e.getMessage());
		// }
		}
		System.out.println(piscina);

	}

}