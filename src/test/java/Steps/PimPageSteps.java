package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.When;

public class PimPageSteps extends BaseClass {
	
	private static PimPage pimPage;
	private static String empId;
	@When("user click on pim link")
	public void user_click_on_pim_link() {
	   
		pimPage=new PimPage();
		pimPage.clickOnPim();
	}
	@When("user validate pim page by using url")
	public void user_validate_pim_page_by_using_url() {
	   
		Assert.assertEquals(pimPage.validatePimUrl().contains("pim"), true);
	}
	
	@When("user click on add employee and enter {string} and {string} and click on save button")
	public void user_click_on_add_employee_and_enter_and_and_click_on_save_button(String Fname, String Lname) throws InterruptedException {
	   pimPage.addEmp(Fname, Lname);
	   
	}
	@When("user capture employee id")
	public void user_capture_employee_id() {
	 empId =  pimPage.captureEmpId();
	}
	@When("user click on employee list")
	public void user_click_on_employee_list() throws InterruptedException {
	  pimPage.clickOnEmpList();
	}
	
	@When("user search employee using employee id and click on search button")
	public void user_search_employee_using_employee_id_and_click_on_search_button() throws InterruptedException {
	    
		pimPage.clickSearch(empId);
	}
	@When("user  select searched employee and click on checkbox")
	public void user_select_searched_employee_and_click_on_checkbox() throws InterruptedException {
	    
		pimPage.selectEidCheck();
	}
	@When("user click on delete")
	public void user_click_on_delete() throws InterruptedException {
		pimPage.clickOnDelete();
	   
	}


}
