package exception;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {
		
		String login = "123";
		
		if (login == "admin") {
			System.out.println("Login successful");
		}else {
			throw new LoginException();
		}
	}
}
