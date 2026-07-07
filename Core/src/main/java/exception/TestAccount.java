package exception;

public class TestAccount {
	
public static void main(String[] args) throws InsufficentFundException {
		
		Accounts a = new Accounts();
		
		a.setBalance(500.00);
		System.out.println("current balance: " + a.getBalance());
		
		a.withdraw(1000.00);
		
	}

}
