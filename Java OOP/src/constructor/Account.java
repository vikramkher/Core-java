package constructor;

public class Account {
	
	private double balance;
	private String accountType;
	private String number;
	
	public Account() {
		System.out.println("this is a default constructor");
	}
	
	public Account(String number, String accountType, double balance) {
		this.number = number;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public double balance() {
		return balance;
	}

}
