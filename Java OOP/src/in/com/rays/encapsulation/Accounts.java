package in.com.rays.encapsulation;

public class Accounts {
	
	private String number;
	private String accountType;
	private double balance;
	
	public void setNumber(String number) {
		this.number=number;
	}
	
	public String getNumber() {
		return number;
	}

	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	

	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("total balace after deposit: " + balance );
		
	}
	
	public void withdrawal(double amt) {
		if(amt >balance) {
			System.out.println("insufficent fund transfer");
		}else {
			balance = balance -amt;
			System.out.println("total balance after withdrawal: " + balance);
			
		}
		
	}
	
	
}
