package test.chp4datadriventesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductsPage;
import test.base.BaseTestM;

public class SwagLabs extends BaseTestM
{
	@Test  (dataProvider = "login-provider", dataProviderClass = LogInDataProvider.class)
	public void verifyLogIn (String usename, String password, String status) 
	{
		ProductsPage productsPage = loginPage.login(usename, password);
				
		System.out.println(	"    Username = " + usename + "\n" +
										"    Password = " + password + "\n" +
										"    Status = " + status);
		
		Assert.assertTrue(productsPage.getProductLabel().equals("Products"), 
									"Please Enter Valid Login Credentials");
	}	
}