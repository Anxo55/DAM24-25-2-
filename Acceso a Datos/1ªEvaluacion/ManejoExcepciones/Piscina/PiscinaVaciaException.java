package Piscina;

public class PiscinaVaciaException extends Exception {

	public PiscinaVaciaException() {
		super("Piscina ya vacía");
	}

	public PiscinaVaciaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PiscinaVaciaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PiscinaVaciaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PiscinaVaciaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
