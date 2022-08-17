package bankaccountApp;

public class savings extends Account {
	int safetyDepositBoxId;
	int safetyDepositBoxKey;
	public savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
		
		
		
	}
	
	
	@Override
	public void setRate()
	{
		rate=getBaseRate()-.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxId=(int)(Math.random()*Math.pow(10,3));
		
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));
	}
	//Methods specific to saving Accounts
	
			public  void showInfo()
			{
				System.out.println("Account Type: Savings");
				super.showInfo();
				System.out.println(	"safety Deposit Box ID: "+ safetyDepositBoxId+
						"\nSafety Deposit Box Key: "+safetyDepositBoxKey);
				
			}

}