package exceptions;

public class SoonScheduledAlarmException extends Exception {

	private static final long serialVersionUID = 6007730096172255526L;

	public SoonScheduledAlarmException() {
		super();
	}

	public SoonScheduledAlarmException(String message, Throwable cause) {
		super(message, cause);
	}

	public SoonScheduledAlarmException(String message) {
		super(message);
	}

	public SoonScheduledAlarmException(Throwable cause) {
		super(cause);
	}
}
