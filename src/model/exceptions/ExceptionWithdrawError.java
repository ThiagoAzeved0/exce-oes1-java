package model.exceptions;

public class ExceptionWithdrawError extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExceptionWithdrawError (String msg) {
		super(msg);
	}
}
