package stepDefinitions;

import com.base.TestContext;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class TestReportPdfStepDef {
	TestContext testContext;
	
	public TestReportPdfStepDef(TestContext testContext)
	{
		this.testContext = testContext;
	}
	
	 @Given("^User is on View Patient Test Reports page$")
	    public void user_is_on_view_patient_test_reports_page() throws Throwable {
	        throw new PendingException();
	    }

	    @Given("^User has clicked view PDF button$")
	    public void user_has_clicked_view_pdf_button() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^user clicks on view PDF$")
	    public void user_clicks_on_view_pdf() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User is on PDF$")
	    public void user_is_on_pdf() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^PDF is opened in proper readable format$")
	    public void pdf_is_opened_in_proper_readable_format() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^PDF has patients details like patient ID, name, email, address, phone number$")
	    public void pdf_has_patients_details_like_patient_id_name_email_address_phone_number() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctor's specialization$")
	    public void pdf_has_doctor_details_like_doc_id_doctor_name_email_address_clinicfacility_name_doctors_specialization() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^PDF shows list of conditions, preferences list, Co-morbidites$")
	    public void pdf_shows_list_of_conditions_preferences_list_comorbidites() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^PDF shows diet menu for 7 days, any warning and comments mentioned by doctor$")
	    public void pdf_shows_diet_menu_for_7_days_any_warning_and_comments_mentioned_by_doctor() throws Throwable {
	        throw new PendingException();
	    }


}
