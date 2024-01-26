package test02;

public class Account {
	private int balance;
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 1000000;
	
	public int getBalance() {
		
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<MIN_VALUE || balance>MAX_VALUE) {
			return;
		}
			this.balance += balance;
	}
	
	

}
