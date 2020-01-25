package test.chp3assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.ProductsPage;
import pages.YourCartPage;
import test.base.BaseTestC;

public class HardAssertions extends BaseTestC
{
	@Test
	public void verifyCheckoutPage_HA ()
	{
		ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");				
		productsPage.selectBackpack();
		
		YourCartPage yourCartPage = productsPage.clickCartButton();				
		CheckoutPage checkOutPage = yourCartPage.clickCheckoutButton();		
		
		Assert.assertEquals(checkOutPage.getHeaderName(), "Checkout",
										"Header Is Not Correct");
		System.out.println("     1. Verify " + checkOutPage.getHeaderName());
		
		Assert.assertTrue(checkOutPage.getFirstNamePlaceHolder().equals("First Name"), 
									"First Name Is Not Correct");
		System.out.println("     2. Verify " + checkOutPage.getFirstNamePlaceHolder());
		
		Assert.assertEquals(checkOutPage.getLastNamePlaceHolder(), "LastName", 
										"Last Name Is Not Correct");
		System.out.println("     3. Verify " + checkOutPage.getLastNamePlaceHolder());
	}
}