package entity;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private int fundTransfer;
	private int deposit;
	private int withdrawl;
	private String location;
	public Account() {
		
	}
	
	
	
	public Account(int accountNumber, String accountHolderName, int balance,int fundTransfer,int deposit,int withdrawl,String location) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.fundTransfer = fundTransfer;
		this.deposit = deposit;
		this.withdrawl = withdrawl;
		this.location =location;
	}



	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getfundTransfer() {
		return fundTransfer;
	}
	public void setfundTransfer(int fundTransfer) {
		this.fundTransfer = fundTransfer;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setdeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getwithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int Withdrawl) {
		this.withdrawl = withdrawl;
}
	public String getlocation() {
		return location;
	}
	public void setlocation(String location) {
		this.location = location;
}
}
