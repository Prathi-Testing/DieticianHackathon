package stepDefinitions;

import com.base.*;

import org.testng.Assert;

import com.pages.*;
import io.cucumber.java.en.Then;

public class RegisterPageStepDef {
	

	SignUpPage signupPage;
	TestContext testContext;
	
	
	public RegisterPageStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.signupPage = testContext.pageObjectManager.getSignupPage();
		
	}
	
	@Then("User should see star on the all mandatory fields")
	public void user_should_see_star_on_the_all_mandatory_fields() 
	{
	  Assert.assertTrue( signupPage.visibilityMandatoryfield());
	}

}
