package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.When;

public class PimPageSteps extends BaseClass {
	
	private static PimPage pimPage;
	@When("user click on pim link")
	public void user_click_on_pim_link() {
	   
		pimPage=new PimPage();
		pimPage.clickOnPim();
	}
	@When("user validate pim page by using url")
	public void user_validate_pim_page_by_using_url() {
	   
		Assert.assertEquals(pimPage.validatePimUrl().contains("pim"), true);
	}

}
