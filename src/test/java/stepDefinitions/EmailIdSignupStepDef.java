package stepDefinitions;

import com.base.*;

import org.testng.Assert;

import com.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailIdSignupStepDef {
	
	SignUpPage signupPage;
	TestContext testContext;
	private String actualEmailHeader;
	private String expectedEmailHeader;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String emailId;
	private String confirmPassword;
	private String actualErrorMessage;
	private String expectedErrorMessage;

	
	public EmailIdSignupStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.signupPage = testContext.pageObjectManager.getSignupPage();
	}
	
	@Then("User should see a form with heading in {string} and {int} to sign up using Email Id")
	public void user_should_see_a_form_with_heading_in_and_to_sign_up_using_email_id(String sheetName,Integer rowNumber) 
	{
		actualEmailHeader = signupPage.getHeader();
		expectedEmailHeader = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");
		Assert.assertEquals(actualEmailHeader, expectedEmailHeader);
	}

	@Then("User should see signup button under signup using Email Id")
	public void user_should_see_signup_button_under_signup_using_email_id() 
	{
		Assert.assertTrue(signupPage.signupButtonVisibility());
	}

	@When("User enters invalid credentials in First name and Valid credentails for other fields with {string} and {int}")
	public void user_enters_invalid_credentials_in_first_name_and_valid_credentails_for_other_fields_with_and(String sheetName,Integer rowNumber)
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@When("User enters invalid credentials in Last name and Valid credentails for other fields with details {string} and {int}")
	public void user_enters_invalid_credentials_in_last_name_and_valid_credentails_for_other_fields_with_details_email_signup_and(String sheetName,Integer rowNumber) 
	{
	    
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@When("User enters invalid credentials in Email and Valid credentails for other fields with details {string} and {int}")
	public void user_enters_invalid_credentials_in_email_and_valid_credentails_for_other_fields_with_details_email_signup_and(String sheetName,Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@When("User enters invalid credentials in Password and Valid credentails for other fields with details {string} and {int}")
	public void user_enters_invalid_credentials_in_password_and_valid_credentails_for_other_fields_with_deatils_email_signup_and(String sheetName,Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@When("User enters invalid credentials in UserName and Valid credentails for other fields with details {string} and {int}")
	public void user_enters_invalid_credentials_in_user_name_and_valid_credentails_for_other_fields_with_details_email_signup_and(String sheetName,Integer rowNumber)
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@When("User enters invalid credentials in Confirm password field and Valid credentails for other fields with details {string} and {int}")
	public void user_enters_invalid_credentials_in_confirm_password_field_and_valid_credentails_for_other_fields_with_details_email_signup_and(String sheetName,Integer rowNumber) 
	{
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@When("User submit form without entering field data {string} and {int}")
	public void user_submit_form_without_entering_field_data(String sheetName,Integer rowNumber) {
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	@Then("User should receive error message for empty field  {string} and {int}")
	public void user_should_receive_error_message_for_empty_field_and(String sheetName,Integer rowNumber)
	{
		  actualErrorMessage = signupPage.getError();
	      expectedErrorMessage = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Message");
	      
	      Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

	}

	@When("User enters  Valid credentails in fields from {string} and {int}")
	public void user_enters_valid_credentails_in_all_fields_from_and(String sheetName,Integer rowNumber) {
		firstName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("First Name");
		lastName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Last Name");
		userName = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("User Name");
		password = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Password");
		emailId = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Email Id");
		confirmPassword = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("ConfirmPassword");
		
		signupPage.emailIdSignUp(firstName, lastName, userName, emailId, password, confirmPassword);

	}

	

}
