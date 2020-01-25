package test.chp4datadriventesting;

import org.testng.annotations.DataProvider;

public class LogInDataProvider
{
	@DataProvider (name = "login-provider")
	public static String [] [] logInData ()
	{
		String [] [] data = new String [4] [3];
		
		data [0] [0] = "standard_user";						data [0] [1] = "secret_sauce";		data [0] [2] = "Pass";				
		data [1] [0] = "locked_out_user";					data [1] [1] = "secret_sauce";		data [1] [2] = "Fail";				
		data [2] [0] = "problem_user";						data [2] [1] = "secret_sauce";		data [2] [2] = "Pass";				
		data [3] [0] = "performance_glitch_user";		data [3] [1] = "secret_sauce";		data [3] [2] = "Pass";		
			
		return data;
	}
}