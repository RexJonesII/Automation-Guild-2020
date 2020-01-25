package test.chp2annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pass_BeforeAfterClass 
{
	WebDriver driver;
	
	@Test
	public void logIn ()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		System.out.println("   Test 1 = Log In");
	}
	
	@Test
	public void logOut ()
	{
		driver.findElement(By.cssSelector("div.bm-burger-button > button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		System.out.println("   Test 2 = Log Out");
	}
	
	@BeforeClass
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("BeforeClass: SetUp Properties, Chrome, & AUT");
	}
	
	@AfterClass
	public void tearDown ()
	{
		driver.quit();
		System.out.println("AfterClass: Tear Down Properties, Chrome, & AUT" + "\n");
	}
}