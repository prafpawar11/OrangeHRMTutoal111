package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass{
	
	private static HomePage homePage;
	
	@When("user is on home page validate title")
	public void user_is_on_home_page_validate_title() {
	   homePage=new HomePage();
	   Assert.assertEquals(homePage.validateTitle(), "OrangeHRM");
		
	}
	@When("validate home page url")
	public void validate_home_page_url() {
	  Assert.assertEquals(homePage.validateUrl().contains("orange"), true);
		
	}
	
	@When("user is on home page and validate home page logo")
	public void user_is_on_home_page_and_validate_home_page_logo() {
	  Assert.assertTrue(homePage.validateLogo());
	}


}
