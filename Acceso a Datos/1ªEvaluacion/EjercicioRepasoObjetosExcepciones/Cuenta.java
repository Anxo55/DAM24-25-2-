package EjercicioRepasoObjetosExcepciones;

public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {

    }

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) throws ImporteInvalidoException {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;

        if (saldo < 0) {
            throw new ImporteInvalidoException("No puede ser negativo");
        }
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double importe) throws ImporteInvalidoException, SaldoInsuficienteException {

        if (importe < 0) {
            throw new ImporteInvalidoException("El importe no puede ser negativo");
        }
        saldo += importe;
        return true;

    }

    public boolean reintegro(double importe) throws ImporteInvalidoException, SaldoInsuficienteException {

        if (importe < 0) {
            throw new ImporteInvalidoException("El importe no puede ser negativo.");
        }
        if (saldo < importe) {
            throw new SaldoInsuficienteException("No hay suficiente saldo.");
        }
        saldo -= importe;
        return true;

    }

    public boolean transferencia(Cuenta destino, double improte) throws ImporteInvalidoException, SaldoInsuficienteException {
    
        if(reintegro(improte)) {
            destino.ingreso(improte);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Cuenta [nombreCliente=" + nombreCliente + ", numeroCuenta=" + numeroCuenta + ", tipoInteres="
                + tipoInteres + ", saldo=" + saldo + "]";
    }
    
    

}
