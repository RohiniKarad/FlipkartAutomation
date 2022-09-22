package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompack.Login;

public class VerifyLoginPage {

	WebDriver driver;
	Login loginobj;
	String url;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91805\\Desktop\\selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}

	@BeforeMethod
	public void lauchingUrl()
	{
		driver.get("https://www.flipkart.com/");
		loginobj= new Login(driver);
		loginobj.loginfk();
	}
	
	@Test
	public void verification()
	{
		url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("login");
	}
	
	@AfterClass
	public void closingApp()
	{
		driver.close();
	}
}
