package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	// Objects
	private WebDriver driver;
	private By textUsername = By.id("user-name");
	private By textPassword = By.id("password");
	private By buttonLogin = By.className("btn_action");
	private By headingUsernames = By.cssSelector("div#login_credentials>h4");
	
	// Constructor
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Methods
	public void sendUsername (String username)
	{
		driver.findElement(textUsername).sendKeys(username);
	}
	
	public void sendPassword (String password)
	{
		driver.findElement(textPassword).sendKeys(password);
	}
	
	public ProductsPage clickLoginButton ()
	{
		driver.findElement(buttonLogin).click();
		return new ProductsPage (driver);
	}
	
	public String getUsernameHeading ()
	{
		return driver.findElement(headingUsernames).getText();
	}
	
	public ProductsPage login (String username, String password)
	{
		driver.findElement(textUsername).sendKeys(username);
		driver.findElement(textPassword).sendKeys(password);
		driver.findElement(buttonLogin).click();
		
		return new ProductsPage (driver);
	}
}