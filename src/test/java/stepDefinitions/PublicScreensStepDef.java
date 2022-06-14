package stepDefinitions;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.ScreenPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PublicScreensStepDef {
	
	ScreenPage screenPage;
	TestContext testContext;
	private String actualText ;
	private String expectedText;
	
	
	public PublicScreensStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.screenPage = testContext.pageObjectManager.getScreenPage();
	}
	
	
	@When("User selects menu screen")
	public void user_select_menu_screen() 
	{
      screenPage.getscreen();
      actualText = screenPage.getPublic();
	}

	@Then("User should see the link text from excel {string}  and {int}")
	public void user_should_see_the_link_text_from_excel_and(String sheetName, Integer rowNumber)
	{
	   expectedText= testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Link Text");
	   Assert.assertEquals(actualText, expectedText);
	}

	@When("User select Signin link under public")
	public void user_select_sigin_link_under_public() 
	{
	    screenPage.getUserSignin();
	}
	

	@When("User select Register link under public")
	public void user_select_register_link_under_public()
	{
	    screenPage.getRegisterPage();
	}

	@When("User select Team link under public")
	public void user_select_team_link_under_public() 
	{
	    screenPage.getTeamPage();
	}

	@When("User select Testimonials link under public")
	public void user_select_testimonials_link_under_public() 
	{
	    screenPage.getTestimonialPage();
	}

	@When("User select Forgot password  under public")
	public void user_select_forgot_password_under_public()
	{
	    screenPage.getForgotPasswordPage();
	}
	
	@When("User select Product features  under public")
	public void user_select_product_features_under_public() 
	{
	    screenPage.getProductPage();
	}

	@When("User select Contact  under public")
	public void user_select_contact_under_public()
    {
	   screenPage.getContactPage();
	}

	@When("User select Featured content  under public")
	public void user_select_featured_content_under_public() 
	{
	    screenPage.getContentPage();
	}

	@When("User select  blog  under public")
	public void user_select_blog_under_public() 
	{
	   screenPage.getBlogPage();
	}

	@When("User select  Home  under public")
	public void user_select_home_under_public() 
	{
	  screenPage.getcreateplanPage();
	}




}
