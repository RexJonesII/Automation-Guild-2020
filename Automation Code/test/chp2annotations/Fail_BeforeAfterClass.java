package test.chp2annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fail_BeforeAfterClass 
{
WebDriver driver;
	
	@BeforeClass
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/cart.html");
		System.out.println("BeforeClass: SetUp Properties, Chrome, & AUT");
	}
	
	@Test
	public void verifyCheckoutPage ()
	{
		driver.findElement(By.className("checkout_button")).click();
		String labelCheckout = driver.findElement(By.className("subheader")).getText();
		System.out.println("   1. Verify " + labelCheckout);
	}
	
	@Test
	public void verifyProductsPage ()
	{
		driver.findElement(By.className("btn_secondary")).click();
		String labelProducts = driver.findElement(By.className("product_label")).getText();
		System.out.println("   2. Verify " + labelProducts);
	}
	
	@AfterClass
	public void tearDown ()
	{
		driver.quit();
		System.out.println("AfterClass: Tear Down Properties, Chrome, & AUT" + "\n");
	}
}