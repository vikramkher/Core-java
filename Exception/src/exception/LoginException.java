package exception;

public class LoginException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1954246253432570683L;

	public LoginException() {
		super("Invalid login and password");
	}

}
