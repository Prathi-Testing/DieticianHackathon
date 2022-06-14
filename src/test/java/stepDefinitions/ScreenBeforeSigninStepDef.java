package stepDefinitions;

import com.base.TestContext;
import com.pages.ScreenPage;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class ScreenBeforeSigninStepDef {
	
	ScreenPage screenPage;
	TestContext testContext;
	private String Title;
	private String actualTitle;
	
	public ScreenBeforeSigninStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.screenPage = testContext.pageObjectManager.getScreenPage();
	}
	
	
	@When("User selects view recent diets before sigin in")
	public void user_selects_view_recent_diets_before_sigin_in() 
	{
	    screenPage.getviewdietsPage();
	}


	@When("User selects view recent test reports before sigin in")
	public void user_selects_view_recent_test_reports_before_sigin_in()
	{
	    screenPage.getreportPage();
	}

	@When("User selects Add patient before sigin in")
	public void user_selects_add_patient_before_sigin_in() 
	{
	    screenPage.getaddpatientPage();
	}

	@When("User selects Dietician Home before sigin in")
	public void user_selects_dietician_home_before_sigin_in()
	{
	    screenPage.getdieticianhomePage();
	}

	@When("User selects My patients before sigin in")
	public void user_selects_my_patients_before_sigin_in() 
	{
	   screenPage.getmypatientPage();
	}

	@When("User selects confirm conditions and create plan before sigin in")
	public void user_selects_confirm_conditions_and_create_plan_before_sigin_in() 
	{
	   screenPage.getcreateplanPage(); 
	}

	@Then("User should redirected to sigin page text from excel {string}  and {int}")
	public void user_should_redirected_to_sigin_page_text_from_excel_and(String sheetName, Integer rowNumber ) 
	{
		actualTitle = screenPage.title();
		Title = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("title");
		
		Assert.assertEquals(actualTitle, Title);
	}

}
