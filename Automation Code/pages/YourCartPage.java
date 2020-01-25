package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage
{
	private WebDriver driver;
	private By buttonCheckout = By.className("checkout_button");
	
	public YourCartPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public CheckoutPage clickCheckoutButton ()
	{
		driver.findElement(buttonCheckout).click();
		return new CheckoutPage (driver);
	}
}