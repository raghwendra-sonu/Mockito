package Com.QATechTesting.Mockito;

public class Calculator {
	
	// Consider this as an API connecting to DB, or Cloud service to get data.
	//Also, since this API was developed by someone else, so i consider they have already tested this thoroughly
	//So, i just need to test my application, i need not to test add method.
	CalculatorService service;
	public Calculator(CalculatorService service)
	{
		this.service=service;
	}
	
	
	public int perform(int i, int j)
	{
		return service.add(i,j)*2;
	}

}
