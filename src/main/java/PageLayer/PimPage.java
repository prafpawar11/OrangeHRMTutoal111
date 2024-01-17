package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PimPage  extends BaseClass{

	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimLink;
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addemp;
	
	@FindBy(name = "firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save;
	
	@FindBy(xpath = "//label[text()='Employee Id']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input")
	private WebElement empid;
	
	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement emplist;
	
	
	
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
	
	public void addEmp(String Fname,String Lname) throws InterruptedException
	{
		Thread.sleep(5000);
		Wait.click(addemp);
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Thread.sleep(5000);
		Wait.click(save);
		Thread.sleep(5000);
	}
	
	public String captureEmpId()
	{
		return Wait.getAttribute(empid, "value");
	}
	
	public void clickOnEmpList() throws InterruptedException
	{
		Thread.sleep(5000);
		Wait.click(emplist);
	}
}
