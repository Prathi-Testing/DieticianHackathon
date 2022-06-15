package stepDefinitions;

import java.util.Map;
import org.testng.Assert;
import com.base.TestContext;
import com.pages.NewPatientPage;
import io.cucumber.java.en.*;

public class NewPatientSteps {
	TestContext testContext;
	NewPatientPage newPatientPg;
	private String fullName;
	private String address1;
	private String emailAddr;
	private String phone;
	private String cityName;
	private String cntry;
	private String state;
	private String postCode;
	private String actualMessage;
	private String expectedMessage;
	
	public NewPatientSteps(TestContext testContext)
	{
		this.testContext = testContext;
		this.newPatientPg = testContext.pageObjectManager.getNewPatientPg();
		
	}
	
	
	 @Then("^User lands on \"([^\"]*)\"$")
	    public void user_lands_on_something(String strArg1) {
	        Assert.assertEquals(newPatientPg.getTitle(),strArg1 );
	    }

	    @Then("^Patient Data Form is visible$")
	    public void patient_data_form_is_visible(){
	    	Assert.assertTrue(newPatientPg.checkPatientform());
	    }
	    
	    @When("^User attempts to submit the form without filling up mandatory fields$")
	    public void user_attempts_to_submit_the_form_without_filling_up_mandatory_fields() {
	    	actualMessage = newPatientPg.submitForm();
	    }

	    @Then("^Unable to update and show error message as \"([^\"]*)\" and (.+)$")
	    public void unable_to_update_and_show_error_message_as_something_and(String sheetname, Integer rownumber) {
	       expectedMessage = testContext.gUtil.getxlData(sheetname).get(rownumber).get("Error Message");
	       Assert.assertEquals(actualMessage, expectedMessage);
	    }

	    @When("^User attempts to put numeric value in Full Name field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_numeric_value_in_full_name_field_as_in_something_and(String sheetname, Integer rownumber) {
	    	fullName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("Value");
		    actualMessage = newPatientPg.fillName(fullName);
	    }

	    @Then("^Unable to enter and show error message as in \"([^\"]*)\" and (.+)$")
	    public void unable_to_enter_and_show_error_message_as_in_something_and(String sheetname, Integer rownumber) {
	    	expectedMessage = testContext.gUtil.getxlData(sheetname).get(rownumber).get("Error Message");
		    Assert.assertEquals(actualMessage, expectedMessage);
		}

	    @When("^User attempts to submit the form without filling up Full Name field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_submit_the_form_without_filling_up_full_name_field_as_in_something_and(String sheetname, Integer rownumber){
	    	fullName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("Value");
		    actualMessage = newPatientPg.fillName(fullName);
	    
	    }

	    
	    @When("^User does not enter any value in Addess line 1 field as in \"([^\"]*)\" and (.+)$")
	    public void user_does_not_enter_any_value_in_addess_line_1_field_as_in_something_and(String sheetname, Integer rownumber) {
	        address1 = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillAddr(address1);
	    }

	    
	    @When("^User attempts to submit the form without selecting any value for Country field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_submit_the_form_without_selecting_any_value_for_country_field_as_in_something_and(String sheetname, Integer rownumber){
	        cntry = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillCntry(cntry);
	    }

	    
	    @When("^User attempts to put numeric value in City field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_numeric_value_in_city_field_as_in_something_and(String sheetname, Integer rownumber){
	        cityName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillCity(cityName);
	    }
	    
	    @When("^User attempts to submit the form without filling up City field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_submit_the_form_without_filling_up_city_field_as_in_something_and(String sheetname, Integer rownumber){
	    	cityName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillCity(cityName);
	    }

	    
	    @When("^User attempts to put numeric value in State, province or region as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_numeric_value_in_state_province_or_region_as_in_something_and(String sheetname, Integer rownumber){
	    	state = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillState(state); 
	    }
	    
	    @When("^User attempts to submit the form without filling up State, province or region field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_submit_the_form_without_filling_up_state_province_or_region_field_as_in_something_and(String sheetname, Integer rownumber) {
	    	state = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillState(state); 
	    }
	    
	    @When("^User attempts to submit the form without filling up Phone number field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_submit_the_form_without_filling_up_phone_number_field_as_in_something_and(String sheetname, Integer rownumber){
	    	phone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPhone(phone);
	    
	    }
	    
	    @When("^User attempts to submit the form without filling up Postal code field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_submit_the_form_without_filling_up_postal_code_field_as_in_something_and(String sheetname, Integer rownumber){
	        postCode = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPostCode(postCode);
	    }

	    @When("^User entered not supported data format in Postal code field as in \"([^\"]*)\" and (.+)$")
	    public void user_entered_not_supported_data_format_in_postal_code_field_as_in_something_and(String sheetname, Integer rownumber) {
	       	postCode = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPostCode(postCode);
	    
	    }
	    
	    @When("^User does not enter any value in Email field as in \"([^\"]*)\" and (.+)$")
	    public void user_does_not_enter_any_value_in_email_field_as_in_something_and(String sheetname, Integer rownumber) {
	        emailAddr = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillEmail(emailAddr);
		}
	    
	    @When("^User entered not supported data format in Email field as in \"([^\"]*)\" and (.+)$")
	    public void user_entered_not_supported_data_format_in_email_field_as_in_something_and(String sheetname, Integer rownumber) {
	    	emailAddr = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillEmail(emailAddr);
	    }

	    @When("^User attempts to put characters in Phone number field as in \"([^\"]*)\" and (.+)$")
	    public void user_attempts_to_put_characters_in_phone_number_field_as_in_something_and(String sheetname, Integer rownumber){
	     	phone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPhone(phone);
	    }
	    
	    @When("^User fills up the form with valid phone as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_valid_phone_as_in_something_and(String sheetname, Integer rownumber) {
	    	phone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPhone(phone);
	    }

	    
	    @When("^User fills up the form with Data less than 10 as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_data_less_than_10_as_in_something_and(String sheetname, Integer rownumber) {
	    	phone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPhone(phone);
	    }
	    
	    @When("^User fills up the form with Data more than 10 as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_data_more_than_10_as_in_something_and(String sheetname, Integer rownumber){
	    	phone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPhone(phone);
	    }
	    
	    @When("^User fills up the phone number with invalid characters as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_phone_number_with_invalid_characters_as_in_something_and(String sheetname, Integer rownumber){
	    	phone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("value");
	        actualMessage=newPatientPg.fillPhone(phone);
	    }
	   
	    
	    @When("^User fills up the form with Valid Data Inputs as in \"([^\"]*)\" and (.+)$")
	    public void user_fills_up_the_form_with_valid_data_inputs_as_in_something_and(String sheetname, Integer rownumber) {
	    	Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetname).get(rownumber); 
	    	fullName = xlvalue.get("Name");
	    	address1 = xlvalue.get("Address1");
	    	cntry = xlvalue.get("Country");
	    	cityName = xlvalue.get("City");
	    	state = xlvalue.get("State");
	    	postCode = xlvalue.get("PostalCode");
	    	emailAddr = xlvalue.get("Email");
	    	phone = xlvalue.get("Phone");
	    	newPatientPg.fillName(fullName);
	    	newPatientPg.fillAddr(address1);
	    	newPatientPg.fillCntry(cntry);
	    	newPatientPg.fillCity(cityName);
	    	newPatientPg.fillState(state);
	    	newPatientPg.fillPostCode(postCode);
	    	newPatientPg.fillEmail(emailAddr);
	    	newPatientPg.fillPhone(phone);
	    }
	    
	    @Then("^User can see Add New Patient button$")
	    public void user_can_see_add_new_patient_button()  {
	    	Assert.assertTrue(newPatientPg.checkUpdtBtn());
	    }
	    
	    @When("^User clicks on the Add New Patient button after entering valid Patient data as in \"([^\"]*)\" and (.+)$")
	    public void user_clicks_on_the_add_new_patient_button_after_entering_valid_patient_data_as_in_something_and(String sheetname, String rownumber){
	    	newPatientPg.submitForm();
	    }

}
