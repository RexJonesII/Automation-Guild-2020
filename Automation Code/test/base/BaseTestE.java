package test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class BaseTestE
{
	private WebDriver driver;
	protected LoginPage loginPage;
	
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		System.out.println("Pre-Condition: Set Up Test");
		
		driver.get("https://www.saucedemo.com/");		
		loginPage = new LoginPage(driver);		
	}
	
	@AfterMethod
	public void tearDown ()
	{
		System.out.println("Post-Condition: Close Test \n");
		driver.quit();
	}
}