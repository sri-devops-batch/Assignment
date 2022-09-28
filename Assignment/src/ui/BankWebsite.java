package ui;
import entity.Account;

public class BankWebsite {
	Account a;  // similar to int x
	int x; 
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	public void setAccountData()
	{
		/* all scanner code , which all knows it already*/
		
		String accountHolderName = "Ramesh Kumar "; // take it from scanner
		int accountNumber = 101;
		int balance = 2000;
		int fundTransfer = 3000;
		int deposit =4000;
		int withdrawl =5000;
		String location ="Banglore";
		
		a = new Account(); // account which declared already.
		// similar to x = 10
		a.setAccountHolderName(accountHolderName);
		a.setAccountNumber(accountNumber);
		a.setBalance(balance);
		a.setfundTransfer(fundTransfer);
		a.setdeposit(deposit);
		a.setWithdrawl(withdrawl);
		a.setlocation(location);
	}
	
	public void checkBalance()
	{
		int currentBalance = a.getBalance();
		System.out.println(a.getAccountNumber()+" - "+currentBalance);
		
	}
	
	public void fundTransfer()
	{
		// some code 
		int fundTransfer = a.getfundTransfer();
		System.out.println(a.getAccountNumber()+" - "+fundTransfer );
		}
	
	public void deposit()
	{
		int fundTransfer = a.getfundTransfer();
		System.out.println(a.getAccountNumber()+" - "+fundTransfer );
	}
	public void withdrawl()
	{
		int withdrawl = a.getwithdrawl();
		System.out.println(a.getAccountNumber()+" - "+withdrawl );
	}
	
   public void location()
   {
     String location =a.getlocation();
     System.out.println(a.getAccountNumber()+"-"+location);
   }
 

}
