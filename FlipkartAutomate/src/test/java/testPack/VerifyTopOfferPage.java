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
import pompack.Topoffers;

public class VerifyTopOfferPage {
	WebDriver driver;
	Login log;
	Homepage home;
	Topoffers top;
	@BeforeClass
	public void lounching_browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91805\\Desktop\\selenium\\chromedriver_win32 (4)\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	@BeforeMethod
	public void login_app()
	{
		driver.get("https://www.flipkart.com/");
		log=new Login(driver);
		log.loginfk();
	home=new Homepage(driver);
	home.topoffer();
	//top=new Topoffers(driver);
		
	}
	@Test
	public void verifyTopoffer()
	{
	  String title=	driver.getTitle();
	  System.out.println(title);
	}
	@AfterMethod
	public void logout_app()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void close_browser()
	{
		driver.close();
	}

}
