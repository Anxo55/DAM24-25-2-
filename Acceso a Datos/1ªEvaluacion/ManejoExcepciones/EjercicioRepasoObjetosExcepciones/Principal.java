package EjercicioRepasoObjetosExcepciones;

public class Principal {

    public static void main(String[] args) {
        
        try {
            Cuenta cuenta = new Cuenta("pepe", "123456789", 1, 1000);
            Cuenta cuenta2 = new Cuenta("angel", "987654321", 1.5, 500);

            System.out.println(cuenta.toString());
            System.out.println(cuenta2.toString());

            cuenta.ingreso(200);
            System.out.println(cuenta.toString());

            cuenta2.reintegro(300);
            System.out.println(cuenta2.toString());

            cuenta.transferencia(cuenta2, 400);
            System.out.println(cuenta.toString());
            System.out.println(cuenta2.toString());

            cuenta2.reintegro(1000);

        } catch (ImporteInvalidoException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());   
        }

    }
    
}
