package bankaccountApp;

import java.util.LinkedList;
import java.util.List;

//import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		List<Account> accounts=new LinkedList<Account>();
		
		
		//read CSV!! File
		String file="C:\\Program Files\\BlueJ\\NewBankAccounts.CSV";
		
		List<String[]> newAccounHolders=utilities.CSV.read(file);
		for(String[] accountHolder:newAccounHolders) {
			//System.out.println(accountHolder[0]+"   "+ accountHolder[1]+" "+ accountHolder[2] +" "+accountHolder[3] );
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings"))
			{
				//System.out.println("Open Savings ACcount");
				accounts.add(new savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking"))
			{
				//System.out.println("Open Checking ACcount");
				accounts.add(new checking(name, sSN, initDeposit));
			}
		}
		accounts.get(5).showInfo();
		for(Account acc:accounts)
		{
			System.out.println("\n\n************************************");
			acc.showInfo();
		}
		//accounts.get((int)Math.random()*accounts.size()).deposit(1000);
		//accounts.get((int)Math.random()*accounts.size()).withdraw(500);
		//accounts.get((int)Math.random()*accounts.size()).Transfer(file, 1500);
		
			
		

	}


}
