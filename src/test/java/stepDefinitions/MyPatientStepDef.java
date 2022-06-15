
package stepDefinitions;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.MyPatientPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyPatientStepDef {
	
	TestContext testContext;
	MyPatientPage myPatientPg;
	private String varName;
	private String actualMessage;
	private String varLink;
	private String varPhone;
	private String varEmail;
	
	public MyPatientStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.myPatientPg = testContext.pageObjectManager.getMyPatientPage();
		Integer maxRecord = 10;
	}
	
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
		Assert.assertNotNull(myPatientPg.getTitle());
	}

	@When("User clicks on My Patients tab")
	public void user_clicks_on_my_patients_tab() {   
		myPatientPg.getMyPatientLink();    
	}

	@Then("It shows breadcrubs as Dietician Software MyPatients")
	public void it_shows_breadcrubs_as_dietician_software_my_patients() {
		Assert.assertTrue(myPatientPg.validateBreadCrumbs());
	}

	@Then("Page title is displayed as My Patients")
	public void page_title_is_displayed_as_my_patients() {
		 Assert.assertEquals(myPatientPg.getTitle(), testContext.expectedMyPatientTitle);
	}

	@Then("Name, email and phone number filter options and search button are displayed")
	public void name_email_and_phone_number_filter_options_and_search_button_are_displayed() {
		Assert.assertTrue(myPatientPg.validatePrimaryInfo());
	}

	@Then("Button used for search has text as Search")
	public void button_used_for_search_has_text_as_search() {
		Assert.assertTrue(myPatientPg.validateSearchBtnText());
	}

	@Given("User is on My Patients tab")
	public void user_is_on_my_patients_tab() {
		Assert.assertEquals(myPatientPg.getTitle(), testContext.expectedMyPatientTitle);
		Assert.assertTrue(myPatientPg.verifyPatientTab());
	}

	@When("User starts typing inside field filter box from {string} and {int}")
	public void user_starts_typing_inside_field_filter_box_from_and(String sheetname, Integer rownumber) {
		varName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("Value");
	    actualMessage = myPatientPg.fillnameFilter(varName);
	}

	@Then("Text inside input filter box should disappear")
	public void text_inside_input_filter_box_should_disappear() {
		Assert.assertTrue(myPatientPg.validatePlaceholderText());
	}

	@When("User clicks on search with name phrase into name filter box from {string} and {int}")
	public void user_clicks_on_search_with_name_phrase_into_name_filter_box_from_and(String sheetname, Integer rownumber) {
		varName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("Value");
		myPatientPg.fillnameFilter(varName);
		actualMessage = myPatientPg.searchPatient();
	}

	@Then("Records for name phrase are shown")
	public void records_for_name_phrase_are_shown() {
		Assert.assertTrue(myPatientPg.validateNameData());
	}

	@When("User clicks on search with email phrase into email address filter from {string} and {int}")
	public void user_clicks_on_search_with_email_phrase_into_email_address_filter_from_and(String sheetname, Integer rownumber) {
		varEmail = testContext.gUtil.getxlData(sheetname).get(rownumber).get("email");
		myPatientPg.fillemailFilter(varEmail);
		actualMessage = myPatientPg.searchPatient();
	}

	@Then("Records for email phrase are shown")
	public void records_for_email_phrase_are_shown_from_and(String string, Integer int1) {
		Assert.assertTrue(myPatientPg.validateEmailData());
	}

	@When("User clicks on search with phone number into phone number filter from {string} and {int}")
	public void user_clicks_on_search_with_phone_number_into_phone_number_filter_from_and(String sheetname, Integer rownumber) {
		varName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("name");
		myPatientPg.fillphoneNumberFilter(varName);
		actualMessage = myPatientPg.searchPatient();
		myPatientPg.searchPatient();
	}

	@Then("Records for phone number are shown")
	public void records_for_phone_number_are_shown() {
		Assert.assertTrue(myPatientPg.validatePhoneData());
	}

	@When("User clicks on search button with name phrase into name filter box, phone number into phone number filter from {string} and {int}")
	public void user_clicks_on_search_button_with_name_phrase_into_name_filter_box_phone_number_into_phone_number_filter_from_and(String sheetname, Integer rownumber) {
		varPhone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("phone");
		varName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("name");
		myPatientPg.fillnameFilter(varName);
		myPatientPg.fillphoneNumberFilter(varPhone);
		myPatientPg.searchPatient();
	}

	@Then("Records for name phrase and phone number are shown")
	public void records_for_name_phrase_and_phone_number_are_shown() {
		Assert.assertTrue(myPatientPg.validateNameData());
		Assert.assertTrue(myPatientPg.validatePhoneData());
	}

	@When("User clicks on search button with name phrase into name filter box, email phrase into email address filter box from {string} and {int}")
	public void user_clicks_on_search_button_with_name_phrase_into_name_filter_box_email_phrase_into_email_address_filter_box_from_and(String sheetname, Integer rownumber) {
		varEmail = testContext.gUtil.getxlData(sheetname).get(rownumber).get("email");
		varName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("name");
		myPatientPg.fillnameFilter(varName);
		myPatientPg.fillemailFilter(varEmail);
		myPatientPg.searchPatient();
	}

	@Then("Records for <name phrase> and <email phrase> are shown")
	public void records_for_name_phrase_and_email_phrase_are_shown() {
		Assert.assertTrue(myPatientPg.validateNameData());
		Assert.assertTrue(myPatientPg.validateEmailData());
	}

	@When("User clicks on search button with phone number into phone number filter box, email phrase into email address filter box from {string} and {int}")
	public void user_clicks_on_search_button_with_phone_number_into_phone_number_filter_box_email_phrase_into_email_address_filter_box_from_and(String sheetname, Integer rownumber) {
		varEmail = testContext.gUtil.getxlData(sheetname).get(rownumber).get("email");
		varPhone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("phone");
		myPatientPg.fillemailFilter(varEmail);
		myPatientPg.fillphoneNumberFilter(varPhone);
		myPatientPg.searchPatient();
	}

	@Then("Records for phone number and email phrase are shown")
	public void records_for_phone_number_and_email_phrase_are_shown() {
		Assert.assertTrue(myPatientPg.validateEmailData());
		Assert.assertTrue(myPatientPg.validatePhoneData());
	}

	@When("User clicks on search button with name phrase into name address filter box, phone number into phone number filter box and email phrase into email address filter box from {string} and {int}")
	public void user_clicks_on_search_button_with_name_phrase_into_email_address_filter_box_phone_number_into_phone_number_filter_box_and_email_phrase_into_email_address_filter_box_from_and(String sheetname, Integer rownumber) {
		varName = testContext.gUtil.getxlData(sheetname).get(rownumber).get("name");
		varEmail = testContext.gUtil.getxlData(sheetname).get(rownumber).get("email");
		varPhone = testContext.gUtil.getxlData(sheetname).get(rownumber).get("phone");
		myPatientPg.fillnameFilter(varName);
		myPatientPg.fillemailFilter(varEmail);
		myPatientPg.fillphoneNumberFilter(varPhone);
		myPatientPg.searchPatient();
	}

	@Then("Records for name phrase, phone number and email phrase are shown")
	public void records_for_name_phrase_phone_number_and_email_phrase_are_shown() {
		Assert.assertTrue(myPatientPg.validateNameData());
		Assert.assertTrue(myPatientPg.validateEmailData());
		Assert.assertTrue(myPatientPg.validatePhoneData());
	}

//	@When("User types in anything other than valid value in search filter field from {string} and {int}")
//	public void user_types_in_anything_other_than_valid_value_in_search_filter_field_from_and(String string, Integer int1) {
//
//	}
//
//	@Then("It must throw error message")
//	public void it_must_throw_error_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("User clicks on search button with all fields empty")
	public void user_clicks_on_search_button_with_all_fields_empty() {
		Assert.assertTrue(myPatientPg.validateEmptyField());
		actualMessage = myPatientPg.searchPatient();
	}

	@Then("Displays all patients for that dietician only")
	public void displays_all_patients_for_that_dietician_only() {
		Assert.assertTrue(myPatientPg.validateTable());
	}

	@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
		Assert.assertTrue(myPatientPg.validateHeader());
	}

	@When("User clicks on search button with or without all fields empty")
	public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
		actualMessage = myPatientPg.searchPatient();
	}

	@Then("It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report Plan")
	public void it_shows_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report_plan() {
		Assert.assertTrue(myPatientPg.validateButtonPresence());
	}

	@Given("Patients records are displayed")
	public void patients_records_are_displayed() {
		myPatientPg.validateTable();
	}

	@When("Records are more than {int}")
	public void records_are_more_than(Integer maxRecord) {
		myPatientPg.recordCount(maxRecord);
	}

	@Then("It must show pagination links")
	public void it_must_show_pagination_links() {
		Assert.assertTrue(myPatientPg.verifyPaginationLink());
	}

	@When("User clicks on next pagination link")
	public void user_clicks_on_next_pagination_link() {
		myPatientPg.paginationLinkClick();
	}

	@Then("It goes to next page")
	public void it_goes_to_next_page() {
		Assert.assertNotEquals(myPatientPg.validatePaginationLinkClick(), testContext.statMessage);
	}

	@When("User clicks on previous pagination link")
	public void user_clicks_on_previous_pagination_link() {
		myPatientPg.prevPaginationLinkClick();
	}

	@Then("It goes to previous page")
	public void it_goes_to_previous_page() {
		Assert.assertNotEquals(myPatientPg.validatePaginationLinkClick(), testContext.statMessage);
	}

	@Given("User has searched patients")
	public void user_has_searched_patients() {
		myPatientPg.searchPatient();
	}

//	@Then("Valid data is shown in given column")
//	public void valid_data_is_shown_in_given_column() {
//		
//	}

	@Then("Verify that date is in valid format in details cloumn")
	public void verify_that_date_is_in_valid_format_in_details_cloumn() {
		Assert.assertTrue(myPatientPg.checkDateFormat());
	}
	
	@Then("Verify that email address is in valid format in details cloumn")
	public void verify_that_email_address_is_in_valid_format_in_details_cloumn() {
		Assert.assertTrue(myPatientPg.checkEmailFormat());
	}

	@When("User clicks on button View Previous Diet Plans")
	public void user_clicks_on_button_view_previous_diet_plans() {
		myPatientPg.clickDietPlanButton();
	}

	@Then("It redirects user to Generated Diet Plans page")
	public void it_redirects_user_to_generated_diet_plans_page() {
		 Assert.assertEquals(myPatientPg.getTitle(), testContext.expectedDietPlansTitle);
	}

	@When("User clicks on button Create New Report\\/Plan")
	public void user_clicks_on_button_create_new_report_plan() {
		myPatientPg.clickCreateReportButton();
	}

	@Then("It redirects user to Confirm Health Conditions and Generate a New Diet plan page")
	public void it_redirects_user_to_confirm_health_conditions_and_generate_a_new_diet_plan_page() {
		 Assert.assertEquals(myPatientPg.getTitle(), testContext.expectedDietPlansTitle);
	}

	@When("User clicks on button View Previous Test Reports")
	public void user_clicks_on_button_view_previous_test_reports() {
		myPatientPg.clickReportButton();
	}

	@Then("It redirects user to View Patient Test Reports page")
	public void it_redirects_user_to_view_patient_test_reports_page() {
		Assert.assertEquals(myPatientPg.getTitle(), testContext.expectedTestReportPageTitle);
	}

	@When("Patient is a new patient")
	public void patient_is_a_new_patient() {
		myPatientPg.searchPatient();
	}

	@Then("View Previous Test Reports and View Previous Diet Plan should not be present")
	public void view_previous_test_reports_and_view_previous_diet_plan_should_not_be_present() {
		Assert.assertTrue(myPatientPg.newPatientData());
	}

	
	
}

