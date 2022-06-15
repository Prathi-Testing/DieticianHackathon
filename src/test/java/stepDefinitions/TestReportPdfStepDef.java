package stepDefinitions;

import org.testng.Assert;
import com.base.TestContext;
import com.pages.TestReportPage;
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
	    
	    @Then("^Every report has Doc Id$")
	    public void every_report_has_doc_id() {
	    	Assert.assertTrue(testReportPg.checkDocId());
	    }
	    
	    @Then("^Every report shows file upload time$")
	    public void every_report_shows_file_upload_time() throws Throwable {
	        Assert.assertTrue(testReportPg.checkTime());
	    }

	    @Then("^File uploaded time is shown in correct date and time format$")
	    public void file_uploaded_time_is_shown_in_correct_date_and_time_format() throws Throwable {
	        Assert.assertTrue(testReportPg.checkTimeFormat());
	    }
	    
	    @Then("^Uploaded time field shows age of file upload in seconds,minutes,hour,days,months,years$")
	    public void uploaded_time_field_shows_age_of_file_upload_in_secondsminuteshourdaysmonthsyears() throws Throwable {
	        Assert.assertTrue(testReportPg.checkLoggedAge());
	    }
	    
	    @Then("^Every report has its name$")
	    public void every_report_has_its_name(){
	    	Assert.assertTrue(testReportPg.checkreportName());
	    }
	    
	    @Then("^Every report shows identified conditions from its test report file$")
	    public void every_report_shows_identified_conditions_from_its_test_report_file(){
	        Assert.assertTrue(testReportPg.checkIdentifiedCondns());
	    }
	    
	    @Then("^all records show view pdf option$")
	    public void all_records_show_view_pdf_option() {
	    	Assert.assertTrue(testReportPg.checkPdf());
	    }
	    
	    @Then("^My Patients tab is selected$")
	    public void my_patients_tab_is_selected() throws Throwable {
	        Assert.assertTrue(testReportPg.checkPatientTab());
	    }
	    
	    @Then("^It shows breadcrubs as Dietician Software, View Recent Test Reports$")
	    public void it_shows_breadcrubs_as_dietician_software_view_recent_test_reports() throws Throwable {
	        Assert.assertTrue(testReportPg.validateBreadCrumbs());
	    }
	    
	    @Then("^It displays primary information like patient Id  number, name, email address, Phone number, Address$")
	    public void it_displays_primary_information_like_patient_id_number_name_email_address_phone_number_address() throws Throwable {
	        Assert.assertTrue(testReportPg.validatePrimaryInfo());
	    }
	    
	    @Then("^Title is displayed as View Patient Test Reports$")
	    public void title_is_displayed_as_view_patient_test_reports() throws Throwable {
	        Assert.assertTrue(testReportPg.validateTitleLine());
	    }
	    
	    @Then("^It displays patient old and latest test reports$")
	    public void it_displays_patient_old_and_latest_test_reports() throws Throwable {
	        Assert.assertTrue(testReportPg.testReportCount()>1);
	    }

	    @Then("^It shows column heading as Record number, Doc-ID, File Uploaded time, Report name, Identified health conditions$")
	    public void it_shows_column_heading_as_record_number_docid_file_uploaded_time_report_name_identified_health_conditions() throws Throwable {
	        Assert.assertTrue(testReportPg.validateHeader());
	    }
	    
	    @Then("^More than 3 records should be displayed on different pages through pagination$")
	    public void more_than_3_records_should_be_displayed_on_different_pages_through_pagination() throws Throwable {
	        Assert.assertTrue(testReportPg.testReportCount()>3);
	    }
	    
	    @Then("^Pagination has Next link$")
	    public void pagination_has_next_link() throws Throwable {
	        Assert.assertTrue(testReportPg.checkNextLink());
	    }
	    
	    @Then("^Pagination has Previous link$")
	    public void pagination_has_previous_link() throws Throwable {
	    	Assert.assertTrue(testReportPg.checkPreviousLink());
	    }






}
