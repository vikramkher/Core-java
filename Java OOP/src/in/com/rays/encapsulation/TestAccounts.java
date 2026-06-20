package in.com.rays.encapsulation;

public class TestAccounts {
	
	public static void main(String[] args) {
		
		Accounts a1 = new Accounts();
		
		a1.setNumber("98462387355");
		a1.setAccountType("current");
		a1.setBalance(10000.00);
		System.out.println("a1 account no: " + a1.getNumber());
		System.out.println("a1 account type: " + a1.getAccountType());
		System.out.println("a1 current balance: " + a1.getBalance());
		
		a1.deposit(4000);
		a1.withdrawal(1000);
	}

}
