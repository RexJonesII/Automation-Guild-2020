package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage 
{
	 private WebDriver driver;
	 private By labelProducts = By.className("product_label");
	 private By cart = By.cssSelector("div#shopping_cart_container path");
	 private By backpack = By.cssSelector("div#inventory_container > div > div:nth-child(1) button");
	 	
	public ProductsPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getProductLabel ()
	{
		return driver.findElement(labelProducts).getText();		
	}
	public void selectBackpack ()
	{
		driver.findElement(backpack).click();
	}
	
	public YourCartPage clickCartButton ()
	{
		driver.findElement(cart).click();		
		return new YourCartPage (driver);
	}
}