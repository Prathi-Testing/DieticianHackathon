package stepDefinitions;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.NewPatientPage;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class NewPatientSteps {
	TestContext testContext;
	NewPatientPage newPatientPg;
	
	public NewPatientSteps(TestContext testContext)
	{
		this.testContext = testContext;
		this.newPatientPg = testContext.pageObjectManager.getNewPatientPg();
		
	}
	
	
	 @Given("^User is on the Add New Patient Page$")
	    public void user_is_on_the_add_new_patient_page(){
	        Assert.assertEquals(newPatientPg.getTitle(), testContext.expectedNewPatientTitle);
	    }

	    @Then("^Patient Data Form is visible$")
	    public void patient_data_form_is_visible(){
	    	Assert.assertTrue(newPatientPg.checkPatientform());
	    }
	    
	    @When("^User attempts to submit the form without filling up mandatory fields$")
	    public void user_attempts_to_submit_the_form_without_filling_up_mandatory_fields() {
	    	newPatientPg.submitForm();
	    }

	    @Then("^Unable to update and show error message as \"([^\"]*)\" and (.+)$")
	    public void unable_to_update_and_show_error_message_as_something_and(String sheetname, String rownumber, String strArg1) {
	       
	    }

	    @When("^User attempts to put numeric value in Full Name field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_numeric_value_in_full_name_field_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Unable to enter and show error message as in \"([^\"]*)\" and (.+)$")
	    public void unable_to_enter_and_show_error_message_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User attempts to submit the form without filling up \"([^\"]*)\" field$")
	    public void user_attempts_to_submit_the_form_without_filling_up_something_field(String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User does not enter any value in Addess line 1 field$")
	    public void user_does_not_enter_any_value_in_addess_line1_field() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User attempts to submit the form without selecting any value for Country field$")
	    public void user_attempts_to_submit_the_form_without_selecting_any_value_for_country_field() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User attempts to put numeric value in City field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_numeric_value_in_city_field_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User attempts to submit the form without filling up City field$")
	    public void user_attempts_to_submit_the_form_without_filling_up_city_field() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User attempts to put numeric value in State, province or region as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_numeric_value_in_state_province_or_region_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User attempts to submit the form without filling up State, province or region field$")
	    public void user_attempts_to_submit_the_form_without_filling_up_state_province_or_region_field() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User attempts to submit the form without filling up Postal code field$")
	    public void user_attempts_to_submit_the_form_without_filling_up_postal_code_field() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User entered not supported data format in Postal code field$")
	    public void user_entered_not_supported_data_format_in_postal_code_field() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User does not enter any value in Email field$")
	    public void user_does_not_enter_any_value_in_email_field() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User entered not supported data format in Email field as in \"([^\"]*)\" and (.+)$")
	    public void user_entered_not_supported_data_format_in_email_field_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User attempts to put characters in \"([^\"]*)\" field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_characters_in_something_field_as_in_something_and(String sheetname, String rownumber, String strArg1, String strArg2) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User attempts to submit the form without filling up Phone number field$")
	    public void user_attempts_to_submit_the_form_without_filling_up_phone_number_field() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User fills up the form with valid data as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_valid_data_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^User can see Add New Patient button$")
	    public void user_can_see_add_new_patient_button() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User fills up the form with Data less than 10 as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_data_less_than_10_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User fills up the form with Data more than 10 as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_data_more_than_10_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @Then("^User should receive error message as in \"([^\"]*)\" and (.+)$")
	    public void user_should_receive_error_message_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User fills up the form with invalid characters as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_invalid_characters_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User fills up the form without country code$")
	    public void user_fills_up_the_form_without_country_code() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User fills up the form with Valid Data Inputs as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_valid_data_inputs_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User clicks on the Add New Patient button after entering valid Patient data as in \"([^\"]*)\" and (.+)$")
	    public void user_clicks_on_the_add_new_patient_button_after_entering_valid_patient_data_as_in_something_and(String sheetname, String rownumber, String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^User lands on My Patients page with the \"([^\"]*)\" details displayed$")
	    public void user_lands_on_my_patients_page_with_the_something_details_displayed(String strArg1) throws Throwable {
	        throw new PendingException();
	    }



}
