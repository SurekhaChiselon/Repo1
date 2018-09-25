package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import applicationUtilities.APPUtilities;

import pageObjects.Login;
import pageObjects.Register;

public class TestCases 
{
WebDriver d=new FirefoxDriver();
APPUtilities a=new APPUtilities(d);
Login login=new Login(d);
Register register=new Register(d);

@Test
public void Testcase1() throws Exception 
{
  login.launch();
  register.register();
  login.ccLoginApplication(); 
  login.closeApplication();
}
	
}
