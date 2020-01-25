package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage 
{
	private WebDriver driver;
	private By message = By.className("complete-header");
	
	public ThankYouPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getMessage ()
	{
		return driver.findElement(message).getText();
	}
}