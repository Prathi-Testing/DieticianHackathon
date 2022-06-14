package stepDefinitions;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.ScreenPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScreensMenuStepDef {
	
	ScreenPage screenPage;
	TestContext testContext;
	private Boolean screenButton;
	
	public ScreensMenuStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.screenPage = testContext.pageObjectManager.getScreenPage();
	}
	
	
	@When("User is in home Page")
	public void user_is_in_home_page() 
	{
	   screenButton = screenPage.screenvisibility();
	}

	@Then("User should see screen link")
	public void user_should_see_screen_link() 
	{
	    Assert.assertTrue(screenButton);
	}

	@Then("User should see a menu with list of clickable links is displayed")
	public void user_should_see_a_menu_with_list_of_clickable_links_is_displayed() 
	{
	    Assert.assertTrue(screenPage.checkHamburgerMenu());
	}

	

}
