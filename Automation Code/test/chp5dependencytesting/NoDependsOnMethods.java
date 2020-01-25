package test.chp5dependencytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoDependsOnMethods
{
	WebDriver driver;
	
	@Test (priority = 1)
	public void launchWebServer ()
	{
		System.out.println("Launch The Web Server");
	}
	
	@Test (priority = 2)
	public void deployApplication ()
	{
		System.out.println("Deploy Application");
	}
	
	@Test (priority = 3)
	public void setUpApplication ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.WrongURL.com");		
		Assert.assertTrue(false, "There Was A Problem Setting Up The Application");
		
		System.out.println("Set Up Application");
	}
	
	@Test (priority = 4)
	public void test1 ()
	{		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		
		Assert.assertTrue(true);
	}
	
	@Test (priority = 5)
	public void test2 ()
	{		
		driver.findElement(By.cssSelector("div#inventory_container > div > div:nth-child(1) button")).click();
		Assert.assertTrue(true);
	}

	@Test (priority = 6)
	public void test3 ()
	{		
		driver.findElement(By.cssSelector("div#shopping_cart_container path")).click();
		Assert.assertEquals(true, true);		
	}
	
	@Test (priority = 7)
	public void test4 ()
	{		
		driver.findElement(By.cssSelector("div#shopping_cart_container path")).click();
		Assert.assertEquals(true, true);
	}
	
	@Test (priority = 8)
	public void test5 ()
	{		
		driver.findElement(By.cssSelector("div#shopping_cart_container path")).click();
		Assert.assertEquals(true, true);
	}
}