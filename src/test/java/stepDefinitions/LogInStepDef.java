package stepDefinitions;

import java.util.Map;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.SignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDef {
	SignInPage signinPage;
	TestContext testContext;
	private String expectedFacebookTitle = "facebook";
	private String expectedGoogleTitle = "Google";
	private String expectedEmailLoginHeading = "log in with your email";
	private String expectedLoginButtonText = "Log in";
	private String ExpectedResetPasswordTitle = "Reset Password";

	public LogInStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.signinPage = testContext.pageObjectManager.getSignInPage();
	}

	@When("^User clicks Log In button with all fields empty$")
	public void user_clicks_log_in_button_with_all_fields_empty(String sheetname, Integer rownumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetname).get(rownumber);
		String uName = xlvalue.get("First Name");
		String pwd = xlvalue.get("Password");

		signinPage.LoginWithCred(uName, pwd);
		signinPage.LogInButton();

	}

	@When("^User clicks Log In button with invalid email and valid password values \"([^\"]*)\" (.+)$")
	public void user_clicks_log_in_button_with_invalid_email_and_valid_password_values_something(String sheetname,
			Integer rownumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetname).get(rownumber);
		String uName = xlvalue.get("First Name");
		String pwd = xlvalue.get("Password");

		signinPage.LoginWithCred(uName, pwd);
		signinPage.LogInButton();

	}

	@When("^User clicks Log In button with valid email and empty password values \"([^\"]*)\" (.+)$")
	public void user_clicks_log_in_button_with_valid_email_and_empty_password_values_something(String sheetname,
			Integer rownumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetname).get(rownumber);
		String uName = xlvalue.get("First Name");
		String pwd = xlvalue.get("Password");

		signinPage.LoginWithCred(uName, pwd);
		signinPage.LogInButton();

	}

	@When("^User clicks Log In with both invalid email and password values \"([^\"]*)\" (.+)$")
	public void user_clicks_log_in_with_both_invalid_email_and_password_values_something(String sheetname,
			Integer rownumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetname).get(rownumber);
		String uName = xlvalue.get("First Name");
		String pwd = xlvalue.get("Password");

		signinPage.LoginWithCred(uName, pwd);
		signinPage.LogInButton();

	}

	@When("^User clicks Log In with both valid email and password values \"([^\"]*)\" (.+)$")
	public void user_clicks_log_in_with_both_valid_email_and_password_values_something(String sheetname,
			Integer rownumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetname).get(rownumber);
		String uName = xlvalue.get("First Name");
		String pwd = xlvalue.get("Password");

		signinPage.LoginWithCred(uName, pwd);
		signinPage.LogInButton();

	}

	@When("^User clicks on Forgot Password button$")
	public void user_clicks_on_forgot_password_button() {
		signinPage.ForgotYourPassword();
	}

	@When("^User clicks Google button to log in$")
	public void user_click_Google_button_to_log_in() {
		signinPage.GoogleLogIn();

	}

	@When("^User clicks Facebook link$")
	public void user_clicks_Facebook_link() {
		signinPage.FacebookLogIn();
	}

	@Then("^User should see a form with heading$")
	public void user_should_see_a_form_with_heading_something_form_to_log_in_with_your_email(String strArg1) {
		String ActualEmailLoginHeading = signinPage.SignInHeading();
		
		Assert.assertEquals(ActualEmailLoginHeading, expectedEmailLoginHeading);

	}

	@Then("User should see a button with text {string}")
	public void user_should_see_a_button_with_text_Log_in() {
		String ActualLoginButtonText = signinPage.LogInButton();
		Assert.assertEquals(ActualLoginButtonText, expectedLoginButtonText);

	}

	@Then("User gets error message \"([^\"]*)\" (.+)")
	public void user_gets_error_message_something(String sheetName, int rowNumber) {
		String ActualMessage = signinPage.getmessage();
		String expectedMessage = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");

		Assert.assertEquals(ActualMessage, expectedMessage);

	}

	@Then("^User is redirected to reset password link$")
	public void user_is_redirected_to_reset_password_link() {
		String ActualResetPasswordPageTitle = signinPage.ForgotYourPassword();
		Assert.assertEquals(ActualResetPasswordPageTitle, ExpectedResetPasswordTitle);
	}

	@Then("^User is redirected to Google  login Page$")
	public void user_is_redirected_to_google_login_page() {
		String ActualGoogleTitle = signinPage.GoogleLogIn();
		Assert.assertEquals(ActualGoogleTitle, expectedGoogleTitle);

	}

	@Then("^User is redirected to Facebook  login Page$")
	public void user_is_redirected_to_facebook_login_page() {
		String ActualFBTitle = signinPage.FacebookLogIn();
		Assert.assertEquals(ActualFBTitle, expectedFacebookTitle);

	}
}
