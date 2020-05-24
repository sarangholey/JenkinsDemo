package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testCase_1 
{

	@Test(priority = 1)
	public void rightClickConsecept() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("Title of entered Site is "+driver.getTitle());
		
		driver.quit();
		
	}
	
	@Test(priority = 2)
	public void rightClickConsecept1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		System.out.println("Title of entered Site is "+driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Test");
		
		driver.quit();
	}
	
	@Test(priority = 3)
	public void rightClickConsecept2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		System.out.println("Title of entered Site is "+driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.quit();
		
	}
}
