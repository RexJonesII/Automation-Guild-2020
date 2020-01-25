package test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;

public class BaseTestC
{
	private WebDriver driver;
	protected LoginPage loginPage;
	
	@BeforeClass
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		System.out.println("Pre-Condition: Set Up Test");
		
		driver.get("https://www.saucedemo.com/");		
		loginPage = new LoginPage(driver);		
	}
	
	@AfterClass
	public void tearDown ()
	{
		System.out.println("Post-Condition: Close Test \n");
		driver.quit();
	}	
}