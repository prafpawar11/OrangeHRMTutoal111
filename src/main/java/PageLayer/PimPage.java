package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PimPage  extends BaseClass{

	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimLink;
	
	public PimPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnPim()
	{
		Wait.click(pimLink);
	}
	public String  validatePimUrl()
	{
		return driver.getCurrentUrl();
	}
}
