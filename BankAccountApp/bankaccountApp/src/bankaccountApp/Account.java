package bankaccountApp;

public abstract class Account implements IBaseRate{
	String name;
	String sSN;
	double balance;
	
	static int index=10000;
	String accountNumber;
	double rate;
	//constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name=name;
		this.sSN=sSN;
		this.balance=initDeposit;
		
		//set account Number
		index++;
		this.accountNumber=setAccNumber();
		setRate();
		
	}
	public abstract void setRate();
	private String setAccNumber() {
		String lastTwoOfSSN= sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID=index;
		int random= (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN+uniqueID+random;
	}
	
	//list common methods-transactions
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Depositing: "+amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdrawing :"+amount);
		printBalance();
	}
	public void Transfer(String location, double amount)
	{
		balance=balance-amount;
		System.out.println("Transfering "+amount+"to " +location);
		printBalance();
		
	}
	public void printBalance()
	{
		System.out.println("The Updated Balance is: "+ balance);
	}
	
	
	public void compound()
	{
		double interest=balance*(rate/100);
		System.out.println("Interest Accured is "+interest);		
		balance=balance+interest;
		printBalance();
	}
	
	
	//list common methods-
	public void showInfo()
	{
		System.out.println(
				"Name: "+name +
				"\nAccount Number: "+ accountNumber+
				"\nBalance is: "+balance +
				"\nInterest Rate is: "+rate
				
				);
	}

}
