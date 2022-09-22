package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompack.Homepage;
import pompack.Login;

public class VerifyHomepage {
	WebDriver driver;
	Login logobj;
	Homepage homeobj;
	String title;
	@BeforeClass
	public void browserlounch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91805\\Desktop\\selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void lounchApp()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		logobj=new Login(driver);
		logobj.loginfk();
		homeobj=new Homepage(driver);
		homeobj.topoffer();
	}
	@Test
	public void verifyTitle()
	{
		title=driver.getTitle();
		System.out.println(title);
	}
	@AfterMethod
	public void logoutApp()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void closingbrowser()
	{
		driver.close();
	}
	

}
