package stepDefinitions;

import org.testng.Assert;

import com.pages.*;
import com.base.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileNoSignupStepDef {

	SignUpPage signupPage;
	TestContext testContext;
	private String actualHeader;
	private String expectedHeader;
	private String firstName;
	private String lastName;
	private String number;
	private String fieldValue;
	private String emailId;
	private String passValue;
	private String actualErrorMessage;
	private String expectedErrorMessage;

	public MobileNoSignupStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.signupPage = testContext.pageObjectManager.getSignupPage();
	}

	@Then("User should see a heading with details in {string} and {int} to sign up using mobile number")
	public void user_should_see_a_form_with_heading_in_and_to_sign_up_using_mobile_number(String sheetName,
			Integer rowNumber) {

		actualHeader = signupPage.getHeader();
		expectedHeader = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");
		Assert.assertEquals(actualHeader, expectedHeader);
	}

	@Then("User should see signup button under signup using mobile number")
	public void user_should_see_signup_button_under_signup_using_mobile_number() {

		Assert.assertTrue(signupPage.signupButtonVisibility());
	}

	@When("User enters invalid credentials in First name and Valid credentails for other fields from {string} and {int}")
	public void user_enters_invalid_credentials_in_first_name_and_valid_credentails_for_other_fields_from_and(
			String sheetName, Integer rowNumber) {
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);

	}

	@When("User enters invalid credentials in Last name and Valid credentails for other fields from {string} and {int}")
	public void user_enters_invalid_credentials_in_last_name_and_valid_credentails_for_other_fields_from_and(String sheetName, Integer rowNumber) {

		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);
	}

	@When("User enters invalid credentials in Any Other Field and Valid credentails for Names,Email,Password from {string} and {int}")
	public void user_enters_invalid_credentials_in_any_other_field_and_valid_credentails_for_names_email_password_from_and(String sheetName, Integer rowNumber) 
	{

		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);
	}

	@When("User enters invalid credentials in Email and Valid credentails for other fields from {string} and {int}")
	public void user_enters_invalid_credentials_in_email_and_valid_credentails_for_other_fields_from_and(String sheetName, Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);

	}

	@When("User enters invalid credentials in Mobile Number and Valid credentails for other fields from {string} and {int}")
	public void user_enters_invalid_credentials_in_mobile_number_and_valid_credentails_for_other_fields_from_and(String sheetName, Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);

	}

	@When("User enters invalid credentials in Password and Valid credentails for other fields from {string} and {int}")
	public void user_enters_invalid_credentials_in_password_and_valid_credentails_for_other_fields_from_and(String sheetName, Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);

	}
	
	@When("User submit form without entering data {string} and {int}")
	public void user_submit_form_without_entering_field_data(String sheetName, Integer rowNumber)
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);  
	}
	
	@When("User enters  Valid credentails in all fields from {string} and {int}")
	public void user_enters_valid_credentails_in_all_fields_from_and(String sheetName, Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		number = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Mobile Number");
		fieldValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Other Fields");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		passValue = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");

		signupPage.mobileNoSignUp(firstName, lastName, number, fieldValue, passValue, emailId);

	}
	
	
//	@Then("User should receive error message {string} and {int}")
//	public void user_should_receive_error_message_and(String sheetName,Integer rowNumber) 
//	{
//	  actualErrorMessage = signupPage.getError();
//      expectedErrorMessage = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Message");
//      
//      Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//      
//	}

}
