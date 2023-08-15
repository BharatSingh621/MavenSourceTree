package TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");	
		
	}
	
	
	@Test
	public void LoginTc001() 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	
	@Test
	public void LoginTc002() 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	

}
