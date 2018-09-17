package selenium_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Openbrowser 
{
	@Test
	public void openbrowser()
	{
	/*	System.setProperty("webdriver.gecko.driver", "E:\\sairam\\selenium_practice\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		*/
		//driver.findElement(By.id("lst-ib")).sendKeys("selenium tutorial");
		//driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
		/*WebElement Web=driver.findElement(By.id("day"));
		Select sel=new Select(Web);
		sel.selectByIndex(2);
		WebElement Web1=driver.findElement(By.id("month"));
		Select se=new Select(Web1);
		se.selectByVisibleText("Aug");
		WebElement Web2=driver.findElement(By.id("year"));
		Select s=new Select(Web2);
		s.selectByValue("2017");
		driver.close();*/
		
		
	
	/*System.setProperty("webdriver.chrome.driver", "E:\\sairam\\selenium_practice\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
    driver.findElement(By.xpath("(//a[contains(@href,'options')])[1]")).click();
	driver.findElement(By.id("gbwa")).click();
    driver.findElement(By.xpath("//a/span[contains(text(),'Gmail')]")).sendKeys(Keys.ENTER);
	
*/	
		System.setProperty("webdriver.chrome.driver", "E:\\sairam\\selenium_practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_j")).sendKeys("munni");
		driver.findElement(By.id("u_0_l")).sendKeys("kalli");
		driver.findElement(By.id("u_0_o")).sendKeys("1234512345");
		driver.findElement(By.id("u_0_v")).sendKeys("abc123");
		 WebElement WE1=driver.findElement(By.name("birthday_day"));
		 Select s1 = new Select(WE1);
		 s1.selectByVisibleText("9");
		 WebElement WE2 =driver.findElement(By.name("birthday_month"));
		 Select s2 = new Select(WE2);
		 s2.selectByIndex(4);
		 WebElement WE3 = driver.findElement(By.name("birthday_year"));
		 Select s3 = new Select(WE3);
		 s3.selectByValue("2011");
		 driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		// driver.findElement(By.linkText("Create a Page")).click();
		 
		 
		
	}
}
