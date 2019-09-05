package model.exceptions;

public class ExceptionBalanceError extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExceptionBalanceError(String msg) {
		super(msg);
	}
}
