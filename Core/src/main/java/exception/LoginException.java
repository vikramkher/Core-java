package exception;

public class LoginException extends Exception{
	
	public LoginException() {
		super("Invalid login and password");
	}

}
