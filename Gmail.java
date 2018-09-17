package selenium_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() 
	{
		System.out.println("Launch Application");
		System.setProperty("WebDriver.chrome.driver","E:\\seliniumjarfolder\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//System.out.println("Session ID :"+driver.getWindowHandle());
		driver.get("https://gmail.com");
		//driver.navigate().to("https://gmail.com ");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		
		//System.out.println("Current URL:"+driver.getCurrentUrl());
		//System.out.println("Browser Title :"+driver.getTitle());
	}
	@Test
	public void loginToApplication() 
	{
		System.out.println("Login To Application");
	
		WebElement userNameObj =driver.findElement(By.id("Email"));
		userNameObj.sendKeys("safdg");
		
		userNameObj.clear();
		userNameObj.sendKeys("nag02");
		
		
		
	}
	/*@After
	public void logOutFromApplication()
	{
		
	}
	*/
	
	

}
