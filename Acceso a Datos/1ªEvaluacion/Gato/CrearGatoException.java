public class CrearGatoException extends Exception{

    public CrearGatoException(String message) {
        super(message);
    }

    public CrearGatoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CrearGatoException(Throwable cause) {
        super(cause);
    }

    public CrearGatoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
