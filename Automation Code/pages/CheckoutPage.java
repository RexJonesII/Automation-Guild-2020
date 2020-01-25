package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage
{
	private WebDriver driver;
	private By holderFirstName = By.id("first-name");
	private By holderLastName = By.id("last-name");
	private By holderZipCode = By.id("postal-code");
	private By buttonContinue = By.className("cart_button");
	
	public CheckoutPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sendFirstName (String textFirstName)
	{
		driver.findElement(holderFirstName).sendKeys(textFirstName);
	}

	public void sendLastName (String textLastName)
	{
		driver.findElement(holderLastName).sendKeys(textLastName);
	}
	
	public void sendZipPostalCode (String ZipPostalCode)
	{
		driver.findElement(holderZipCode).sendKeys(ZipPostalCode);
	}
	
	public String getHeaderName ()
	{
		return driver.findElement(By.className("subheader")).getText();
	}
	
	public String getFirstNamePlaceHolder ()
	{
		return driver.findElement(holderFirstName).getAttribute("placeholder");
	}

	public String getLastNamePlaceHolder ()
	{
		return driver.findElement(holderLastName).getAttribute("placeholder");
	}

	public String getZipPostalCodePlaceHolder ()
	{
		return driver.findElement(holderZipCode).getAttribute("placeholder");
	}
	
	public OverviewCheckoutPage clickContinueButton ()
	{
		driver.findElement(buttonContinue).click();
		return new OverviewCheckoutPage(driver);
	}
}