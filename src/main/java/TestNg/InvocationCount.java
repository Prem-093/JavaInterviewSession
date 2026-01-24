package TestNg;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test (invocationCount=10)
	public void craeteUser()
	{
		System.out.println("Create uSer");
	}

}
