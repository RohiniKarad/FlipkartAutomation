package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Topoffers {
@FindBy(xpath="(//a[text()='VIEW ALL'])[1]")
private WebElement topDealElectronics;


@FindBy(xpath="(//a[text()='VIEW ALL'])[2]")
private WebElement topOffers;


@FindBy(xpath="(//a[text()='VIEW ALL'])[3]")
private WebElement bestSellingFurniture;

public Topoffers(WebDriver driver)
{
	PageFactory.initElements( driver,this);
	
}
public void topdealele()
{
	topDealElectronics.click();
}
public void topoffers()
{
	topOffers.click();
}
public void bestsel()
{
	bestSellingFurniture.click();
}
}
