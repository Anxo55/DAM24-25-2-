package Piscina;

public class PiscinaLlenaException extends Exception {

	public PiscinaLlenaException() {
		super("Piscina llena");
	}

	public PiscinaLlenaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PiscinaLlenaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PiscinaLlenaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PiscinaLlenaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
