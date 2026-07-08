package exception;

public class Accounts {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficentFundException {
		if (amount > this.balance) {
			throw new InsufficentFundException();
		} else {
			this.balance = this.balance - amount;
			System.out.println("new balance: " + this.balance);
		}
	}


}
