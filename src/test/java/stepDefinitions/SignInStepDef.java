package stepDefinitions;

import java.util.Map;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.SignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepDef {
	SignInPage signinPage;
	TestContext testContext;
	private String expectedHeading;
	private String expectedSignInTitle;
	private String expectedSignButtonText ;
	private String expectedResetPasswordTitle;
	private String expectedRegisterPageTitle ;
	private String actualSigninpageTitle;
	private String uName;
	private String pwd;
	private String actualHeading;
	private String actualMessage;
	private String actualSignButtonText;
	private String ActualResetPasswordTitle;
	private String expectedMessage;
    private String actualRegisterPageTitle;
	
	
	
	public SignInStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.signinPage = testContext.pageObjectManager.getSignInPage();
	}

	@When("User clicks Sign In Button in the Sign In form with all fields empty")
	public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty_(String sheetName,
			Integer rowNumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		String uName = xlvalue.get("First Name");
		String pwd = xlvalue.get("Password");

		signinPage.fillCred(uName, pwd);
		signinPage.SignInButton();

	}

	@When("^User clicks Sign In button entering numeric value for Username \"([^\"]*)\" (.+)$")
	public void user_clicks_sign_in_button_entering_numeric_value_for_username_something(String sheetName,
			Integer rowNumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		uName = xlvalue.get("First Name");
		pwd = xlvalue.get("Password");

		signinPage.fillCred(uName, pwd);
		signinPage.SignInButton();

	}

	@When("^User clicks Sign In button entering extra length values for password \"([^\"]*)\" (.+)$")
	public void user_clicks_sign_in_button_entering_extra_length_values_for_password_something(String sheetName,
			Integer rowNumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		uName = xlvalue.get("First Name");
		pwd = xlvalue.get("Password");

		signinPage.fillCred(uName, pwd);
		signinPage.SignInButton();

	}

	@When("^User clicks Sign In button entering invalid values for Username and password \"([^\"]*)\" (.+)$")
	public void user_clicks_sign_in_button_entering_invalid_values_for_username_and_password_something(String sheetName,
			Integer rowNumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		uName = xlvalue.get("First Name");
	    pwd = xlvalue.get("Password");

		signinPage.fillCred(uName, pwd);
		signinPage.SignInButton();

	}

	@When("^User clicks on Forgot Password button$")
	public void user_clicks_on_forgot_password_button() {
		signinPage.ForgotPassword();

	}

	@When("User clicks on not member yet button")
	public void user_clicks_on_not_member_yet_button() {
		signinPage.NotMemberButton();
	}

	@When("^User clicks Sign In with all valid fields \"([^\"]*)\" (.+)$")
	public void user_clicks_sign_in_with_all_valid_fields_something(String sheetName, int rowNumber) {
		
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		uName = xlvalue.get("First Name");
		pwd = xlvalue.get("Password");

		signinPage.fillCred(uName, pwd);
		signinPage.SignInButton();

	}

	@Then("^User should see the title of the page as Sign In$")
	public void user_should_see_the_title_of_the_page_as_sign_in(String sheetName, int rowNumber) {

		actualSigninpageTitle = signinPage.SigninpageTitle();
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
        expectedSignInTitle = xlvalue.get("Heading");
		Assert.assertEquals(actualSigninpageTitle, expectedSignInTitle);

	}

	@Then("^User should see a form with heading \"([^\"]*)\", to sign In using Username$")
	public void user_should_see_a_form_with_heading_(String sheetName, int rowNumber) {
	    actualHeading = signinPage.SignInHeading();
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
        expectedHeading = xlvalue.get("Heading");
		Assert.assertEquals(actualHeading, expectedHeading);

	}

	@Then("User should see a button with text SIGN IN in the Sign In form")
	public void user_should_see_a_button_with_text_something_in_the_sign_in_form(String sheetName, int rowNumber) {
		actualSignButtonText = signinPage.SignButton();
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
        expectedSignButtonText = xlvalue.get("Heading");
		Assert.assertEquals(actualSignButtonText, expectedSignButtonText);

	}

	@Then("^User should get error message \"([^\"]*)\" (.+)$")
	public void user_should_get_error_message_something(String sheetName, int rowNumber) {
		actualMessage = signinPage.getmessage();
		expectedMessage = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Message");

		Assert.assertEquals(actualMessage, expectedMessage);

	}

	@Then("^User should be directed to  Reset password link$")
	public void user_should_be_directed_to_reset_password_link(String sheetName, int rowNumber) {

		ActualResetPasswordTitle = signinPage.ForgotYourPassword();
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		expectedResetPasswordTitle = xlvalue.get("Message");
		
		Assert.assertEquals(ActualResetPasswordTitle, expectedResetPasswordTitle);

	}

	@Then("^User will land on Register Page$")
	public void user_will_land_on_register_page(String sheetName, int rowNumber) {

		actualRegisterPageTitle = signinPage.NotMemberButton();
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		expectedRegisterPageTitle = xlvalue.get("Heading");
	
		Assert.assertEquals(actualRegisterPageTitle, expectedRegisterPageTitle);

	}

	@Then("^User logged in successfully$")
	public void user_logged_in_successfully() {

		Assert.assertTrue(signinPage.checkSignout());

	}
}
