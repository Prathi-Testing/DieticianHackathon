package stepDefinitions;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.TestReportPage;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class TestReportPdfStepDef {
	TestContext testContext;
	TestReportPage testReportPg;
	private String pdfUrl;
	private String pdfContent;
	
	public TestReportPdfStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.testReportPg = testContext.pageObjectManager.getTestReportPage();
	}
	
	 	@Given("^User is on View Patient Test Reports page$")
	    public void user_is_on_view_patient_test_reports_page(){
		 	Assert.assertEquals(testReportPg.getTitle(),testContext.expectedTestReportPageTitle);
	    }

	    @When("^user clicks on view PDF$")
	    public void user_clicks_on_view_pdf() {
	    	pdfUrl = testReportPg.clickPdf();
	    }

	    @Then("^PDF is opened in proper readable format$")
	    public void pdf_is_opened_in_proper_readable_format() {
	        Assert.assertNotNull(pdfUrl);
	    }

	    @Then("^PDF has patients details like patient ID, name, email, address, phone number$")
	    public void pdf_has_patients_details_like_patient_id_name_email_address_phone_number() {
	        pdfContent = testContext.pdfReader.readPdf(pdfUrl);
	        Assert.assertTrue(pdfContent.contains("Patient ID"));
	        Assert.assertTrue(pdfContent.contains("Patient Name"));
	        Assert.assertTrue(pdfContent.contains("Patient email"));
	        Assert.assertTrue(pdfContent.contains("Patient Address"));
	        Assert.assertTrue(pdfContent.contains("Patient Phone"));
	    }

	    @Then("^PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctor's specialization$")
	    public void pdf_has_doctor_details_like_doc_id_doctor_name_email_address_clinicfacility_name_doctors_specialization() {
	    	Assert.assertTrue(pdfContent.contains("Doctor ID"));
	        Assert.assertTrue(pdfContent.contains("Doctor Name"));
	        Assert.assertTrue(pdfContent.contains("Doctor email"));
	        Assert.assertTrue(pdfContent.contains("Clinic Name"));
	        Assert.assertTrue(pdfContent.contains("Dr. Specialization"));
	    }

	    @Then("^PDF shows list of conditions, preferences list, Co-morbidites$")
	    public void pdf_shows_list_of_conditions_preferences_list_comorbidites(){
	    	Assert.assertTrue(pdfContent.contains("Conditions"));
	        Assert.assertTrue(pdfContent.contains("Preferences"));
	        Assert.assertTrue(pdfContent.contains("Co-morbidites"));
	    }

	    @And("^PDF shows diet menu for 7 days, any warning and comments mentioned by doctor$")
	    public void pdf_shows_diet_menu_for_7_days_any_warning_and_comments_mentioned_by_doctor() throws Throwable {
	    	Assert.assertTrue(pdfContent.contains("Menu"));
	        Assert.assertTrue(pdfContent.contains("Warning"));
	        Assert.assertTrue(pdfContent.contains("Comments"));
	    }


}
