package bankaccountApp;

public interface IBaseRate {
	
	//Method to return base Rate
	default double getBaseRate()
	{
		return 2.5;
	}

}
