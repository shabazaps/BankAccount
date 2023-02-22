package bankaccountApp;

public class checking extends Account {
	//list properties specific to Savings Account
	int debitCardNumber;
	int debitCardPin;
	
	
	//Constructor to initialize settings for the Savings Account
	public checking(String name, String sSN, double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		
	}
	private void setDebitCard()
	{
		debitCardNumber=(int) (Math.random()*Math.pow(10, 12));
		debitCardPin= (int) (Math.random()*Math.pow(10, 4));
	}
	
	@Override
	public void setRate()
	{
		rate=getBaseRate()* .15;
	}
	
	//list any methods  specific to Savings Account
	public  void showInfo()
	{
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println("Debit Card Number: "+debitCardNumber+
				"\nDebit Card Pin: "+ debitCardPin);
	}

}
