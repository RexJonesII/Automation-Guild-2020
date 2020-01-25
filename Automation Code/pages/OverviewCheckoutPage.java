package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewCheckoutPage 
{
	private WebDriver driver;
	private By buttonFinish = By.className("cart_button");
	
	public OverviewCheckoutPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public ThankYouPage clickFinishButton ()
	{
		driver.findElement(buttonFinish).click();
		return new ThankYouPage(driver);
	}
}