package p1;

public class Account {
	private int accountNumber;
	private String deposit ;
	
	
	public void setAccountNumber(int newAccountNumber)
	{
		accountNumber = newAccountNumber;
	}
	public void setDeposit(String newDeposit)
	{
		deposit = newDeposit;
	}
	
	public int getAccountNumber()
	{
		// --- add some secure code
		return accountNumber;
	}
	public String getDeposit()
	{
		return deposit;
	}
	
	
	
}



