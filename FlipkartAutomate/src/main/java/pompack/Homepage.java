package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//img[@alt='Top Offers']")
	private WebElement topoffers;

	@FindBy(xpath="//div[text()='Grocery']")
	private WebElement grocery;

	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//div[text()='Appliances']")
	private WebElement appliences;
	
	@FindBy(xpath="//div[text()='Travel']")
	private WebElement travel;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void topoffer()
	{
		topoffers.click();
	}
	public void grocery()
	{
		grocery.click();
	}
	public void mobiles()
	{
		mobiles.click();
	}
	public void appliance()
	{
		appliences.click();
	}
	public void travel()
	{
		travel.click();
	}
}

