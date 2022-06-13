package stepDefinitions;

import com.base.*;

import org.testng.Assert;

import com.pages.*;
import io.cucumber.java.en.*;

public class AccountsSignUpStepDef {
	
	SignUpPage signupPage;
	TestContext testContext;
	private String expectedHomeTitle;
	private String actualHomeTitle;
	private String expectedLoginPageTitle;
	private String actualLoginPageTitle;
	
	public AccountsSignUpStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.signupPage = testContext.pageObjectManager.getSignupPage();
	}
	
	@When("User clicks Facebook Button in the Sign Up with your Email form")
	public void user_clicks_facebook_button_in_the_sign_up_with_your_email_form() 
	{
        signupPage.facebookSignup();
	}

	@Then("User successfully logged into the account {string} and {int}")
	public void user_successfully_login_with_facebook_account(String sheetName,	Integer rowNumber) 
	{
       actualHomeTitle = signupPage.getTitle();
       expectedHomeTitle  = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");
       
       Assert.assertEquals(actualHomeTitle, expectedHomeTitle);

	}

	@When("User clicks Goolge Button in the Sign Up with your Email form")
	public void user_clicks_goolge_button_in_the_sign_up_with_your_email_form() 
	{ 
         signupPage.googleSignup();
	}

	@When("User already have a account ,User clicks login in here button")
	public void user_already_have_a_account_user_clicks_login_in_here_button() 
	{
	    signupPage.loginHere();

	}

	@Then("User redirected to login Page {string} and {int}")
	public void user_successfully_login(String sheetName,Integer rowNumber) 
	{
		expectedLoginPageTitle = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");
		actualLoginPageTitle = signupPage.getTitle();
		
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle);
	}

}
