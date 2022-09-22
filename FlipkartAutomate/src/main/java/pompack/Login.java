package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement login;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginfk()
	{
		userName.sendKeys("8055386622");
		password.sendKeys("Rohini#123");
		login.click();
	}

}
