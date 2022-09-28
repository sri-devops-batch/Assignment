package p1;
import java.util.*;
public class AccountMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter AccountNumber & Deposit (res..)  :-");
     
     Account account1=new Account();
     
     int AccountNumberFromUser=sc.nextInt();
     String DepositFromUser=sc.nextLine();
     account1.setAccountNumber(AccountNumberFromUser);
     account1.setDeposit(DepositFromUser);
     System.out.println(account1.getAccountNumber());
     System.out.println(account1.getDeposit());
     
	}

}
