package stepDefinitions;

import com.base.*;

import java.util.Map;

import org.testng.Assert;

import com.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactusPageStefDef {
	
	
	ContactusPage contactusPage;
	TestContext testContext;
	private String name;
	private String lastName;
	private String email;
	private String subject;
	private String message;
	private String expectedError;
	private String actualError;
	
	
	
	public ContactusPageStefDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.contactusPage = testContext.pageObjectManager.getContactusPage();
	}
	
	
	@When("User Submit the form with invalid credentials in first Name and valid credentials in other fields from {string} and {int}")
	public void user_submit_the_form_with_invalid_credentials_in_first_name_and_valid_credentials_in_other_fields_from(String sheetName,Integer rowNumber){
	    
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);
		
	}

	@Then("User should receive error message {string} and {int}")
	public void user_should_receive_error_message(String sheetName,Integer rowNumber) {
	    
		actualError = contactusPage.getError();
		expectedError = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Error Message");
		
		Assert.assertEquals(actualError,expectedError);
		
	}

	@When("User Submit the form with invalid credentials in Last Name and valid credentials in other fields from {string} and {int}")
	public void user_submit_the_form_with_invalid_credentials_in_last_name_and_valid_credentials_in_other_fields_from(String sheetName,Integer rowNumber)
	{
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);
	}

	@When("User Submit the form with invalid credentials in email id and valid credentials in other fields from {string} and {int}")
	public void user_submit_the_form_with_invalid_credentials_in_email_id_and_valid_credentials_in_other_fields_from(String sheetName,Integer rowNumber) 
	{
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);
	}

	@When("User Submit the form without filling the data {string} and {int}")
	public void user_submit_the_form_without_filling_the_data(String sheetName,Integer rowNumber) 
	{
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);
	}

	@Then("User should receive error message as per {string} and {int}")
	public void user_should_receive_error_message_as_per_and(String sheetName,Integer rowNumber) 
	{
		actualError = contactusPage.getError();
		expectedError = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Error Message");
		
		Assert.assertEquals(actualError,expectedError);
	}

	@When("User enter message in subject column  as per {string} and {int}")
	public void user_enter_message_in_subject_column_as_per_and(String sheetName,Integer rowNumber) 
	{
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);
	}

	@Then("validate the length of the message {string} and {int}")
	public void validate_the_length_of_the_message(String sheetName,Integer rowNumber) 
	{
		actualError = contactusPage.getError();
		expectedError = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Error Message");
		
		Assert.assertEquals(actualError,expectedError);
	}

	@When("User enter the message in Write your message column from {string} and {int}")
	public void user_enter_the_message_in_write_your_message_column_from_and(String sheetName,Integer rowNumber)
	{
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);
	}

	@When("User Submit the form with valid data from {string} and {int}")
	public void user_submit_the_form_with_valid_data_from_and(String sheetName,Integer rowNumber)
	{
		  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
			name = xlvalue.get("First Name");
			lastName = xlvalue.get("Last Name");
			email = xlvalue.get("Email Id");
			subject = xlvalue.get("subject");
			message = xlvalue.get("Message");
			
		contactusPage.contactusForm(name, lastName, email, subject, message);    
	}

	@Then("User should receive success {string} and {int}")
	public void user_should_receive_success(String sheetName,Integer rowNumber)
	{
		actualError = contactusPage.getError();
		expectedError = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Error Message");
		
		Assert.assertEquals(actualError,expectedError);
	}


}
