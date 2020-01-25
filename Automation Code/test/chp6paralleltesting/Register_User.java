package test.chp6paralleltesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_User
{
	@Test (dataProvider = "getData")
	public void registerCustomer (String name, int age, boolean customer)
	{
		System.out.println("Thread: " + Thread.currentThread().getId() + "\n" +
										"   Name = " + name + "\n" +
										"   Age = " + age + "\n" +
										"   Do You Want To Be A Customer? " + customer + "\n");
	}
	
	@DataProvider (name = "getData", parallel  = true)
	public Object [] [] getCustomerData ()
	{
		Object [] [] regData = new Object [3] [3];
		
			regData [0] [0] = "John Doe";	regData [0] [1] = 25;			regData [0] [2]= true;
			regData [1] [0] = "Jane Doe";		regData [1] [1] = 52;			regData [1] [2]= false;
			regData [2] [0] = "Joe Doe";		regData [2] [1] = 34;			regData [2] [2]= true;
		
		return regData;
	}
}






























