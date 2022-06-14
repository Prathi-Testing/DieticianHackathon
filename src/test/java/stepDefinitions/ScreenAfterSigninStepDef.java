package stepDefinitions;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.ScreenPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScreenAfterSigninStepDef {
	
	ScreenPage screenPage;
	TestContext testContext;
	private String Title;
	private String actualTitle;
	
	
	public ScreenAfterSigninStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.screenPage = testContext.pageObjectManager.getScreenPage();
	}
	
	@When("User clicks Sign In with all field entered")
	public void user_clicks_sign_in_with_all_field_entered() 
	{
	   // take from ruplai
	}

	@When("User selects view recent diets after sigin in")
	public void user_selects_view_recent_diets_after_sigin_in() 
	{
	   screenPage.getviewdietsPage();
	}

	@When("User selects view recent test reports after sigin in")
	public void user_selects_view_recent_test_reports_after_sigin_in() 
	{
	    screenPage.getreportPage();
	}

	
	@When("User selects Add patient after sigin in")
	public void user_selects_add_patient_after_sigin_in() 
	{
	   screenPage.getaddpatientPage();
	}

	@When("User selects My patients after sigin in")
	public void user_selects_my_patients_after_sigin_in()
	{
	    screenPage.getmypatientPage();
	}

	@When("User selects confirm conditions and create plan after sigin in")
	public void user_selects_confirm_conditions_and_create_plan_after_sigin_in()
	{

       screenPage.getcreateplanPage();
	}
	@Then("User should redirected to particular page {string} and {int}")
	public void user_should_redirected_to_particular_page(String sheetName, Integer rowNumber) 
	{
	   
		actualTitle = screenPage.title();
		Title = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Title");
		
		Assert.assertEquals(actualTitle, Title);
	}
	


	
}
