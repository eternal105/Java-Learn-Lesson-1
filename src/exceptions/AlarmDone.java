package exceptions;

public class AlarmDone extends RuntimeException {

	private static final long serialVersionUID = -6965232553621627073L;

	public AlarmDone() {
		super();
	}

	public AlarmDone(String message, Throwable cause) {
		super(message, cause);
	}

	public AlarmDone(String message) {
		super(message);
	}

	public AlarmDone(Throwable cause) {
		super(cause);
	}
}
