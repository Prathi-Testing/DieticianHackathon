package stepDefinitions;

import java.util.Map;

import org.testng.Assert;

import com.base.*;
import com.pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DietPlanStepDef {

	TestContext testContext;
	DietPlanPage dietPlanPage;
	private String actualTitle;
	private String NavigatingPageTitle;
	private String currentPageTitle;
	private String 	expectedTitle;
	private String pdfUrl;
	private String pdfText;
	

	int rowCount;

	public DietPlanStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.dietPlanPage = testContext.pageObjectManager.getDietPlanPage();
	}


	@Then("New Diet plan should be generated with the latest confirmed Health conditions")
	public void new_diet_plan_should_be_generated_with_the_latest_confirmed_health_conditions() 
	{
	    Assert.assertNotNull(dietPlanPage.newPlanGenerated());
	}
	@When("User lands on View Recent Diets page")
	public void user_lands_on_view_recent_diets_page() {

		actualTitle = dietPlanPage.getTitle();
	}

	@Then("User should see the heading Generated Diet Plans on the page as in excel {string} and {int}")
	public void user_should_see_the_heading_generated_diet_plans_on_the_page_as_in_excel_and(String sheetName,
			Integer rowNumber)
	{
		Map<String, String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		expectedTitle = xlvalue.get("Title");
		actualTitle = dietPlanPage.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("User should see that Diet Plans tab on the menu bar is selected")
	public void user_should_see_that_diet_plans_tab_on_the_menu_bar_is_selected() 
	{
		Assert.assertTrue(dietPlanPage.checkDietPlansTab());
	}

	
	@Then("User should see five records per page")
	public void user_should_see_five_records_per_page() 
	{
		Assert.assertEquals(dietPlanPage.recordsPerPage(), 5);
	}

	@Given("User is on View Recent Diets Page")
	public void user_is_on_view_recent_diets_page() 
	{
		actualTitle = dietPlanPage.getTitle();
	}

	@When("More than one page of records are displayed and User is on first page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_first_page() 
	{
		actualTitle = dietPlanPage.getTitle();
	}

	@Then("Next Page button \\(>) is enabled")
	public void next_page_button_is_enabled()
	{
		if (dietPlanPage.recordsPerPage() >= 5) {
			Assert.assertEquals(dietPlanPage.arrowButton(), true);
		} else {
			Assert.assertEquals(dietPlanPage.arrowButton(), false);
		}
	}

	@Given("User is on View Recent Diets Page and more than one page of records are displayed, User is on first page")
	public void user_is_on_view_recent_diets_page_and_more_than_one_page_of_records_are_displayed_user_is_on_first_page() 
	{
		actualTitle = dietPlanPage.getTitle();
	}

	@When("User selects the next page button \\(>)")
	public void user_selects_the_next_page_button() 
	{
		dietPlanPage.arrowButton();
	}

	@Then("User should see the second  {string} and {int}")
	public void user_should_see_the_second_page_and(String sheetName, Integer rowNumber) 
	{
		NavigatingPageTitle = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");
		currentPageTitle = dietPlanPage.getTitle();
		Assert.assertEquals(currentPageTitle, NavigatingPageTitle);
	}

	@When("More than one page of records are displayed and User is on last page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_last_page()
	{
        Assert.assertTrue(dietPlanPage.prevArrowButton());
	}

	@Then("Next Page button \\(>) is disabled")
	public void next_page_button_is_disabled() 
	{
		Assert.assertTrue(!dietPlanPage.arrowButton());
	}

	@When("One page of records are displayed")
	public void one_page_of_records_are_displayed() 
	{
		rowCount = dietPlanPage.recordsPerPage();
	}

	@Then("Previous Page button \\(<) is enabled")
	public void previous_page_button_is_enabled() 
	{
		Assert.assertTrue(dietPlanPage.prevArrowButton());
	}

	@Given("User is on View Recent Diets Page and more than one page of records are displayed and User is on second page")
	public void user_is_on_view_recent_diets_page_and_more_than_one_page_of_records_are_displayed_and_user_is_on_second_page() 
	{
		Assert.assertTrue(!dietPlanPage.arrowButton());
	}

	@When("User selects the previous page button \\(<)")
	public void user_selects_the_previous_page_button()
	{
        dietPlanPage.previousClick();
	}

	@Then("User should see the first page")
	public void user_should_see_the_first_page() 
	{
		Assert.assertEquals(dietPlanPage.recordsPerPage(), 5);
	}

	@Then("Previous Page button \\(>) is disabled")
	public void previous_page_button_is_disabled() 
	{
		Assert.assertTrue(!dietPlanPage.prevArrowButton());
	}

	@Then("View PDF option is available for the generated diet plans")
	public void view_pdf_option_is_available_for_the_generated_diet_plans() 
	{
		Assert.assertTrue(dietPlanPage.checkPdf());
	}

	@When("User selects the View PDF button for a generated diet plan")
	public void user_selects_the_view_pdf_button_for_a_generated_diet_plan() 
	{
		pdfUrl = dietPlanPage.clickPdf();
		pdfText = testContext.pdfReader.readPdf(pdfUrl);
	}

	@Then("User should see Patient details, Doctor details, Patient health details, {int}-day menu, warnings, Comments in the pdf information")
	public void user_should_see_patient_details_doctor_details_patient_health_details_day_menu_warnings_comments_in_the_pdf_information(
			Integer int1) {


		Assert.assertTrue(pdfText.contains("Patient details") && pdfText.contains("Doctor details")
				&& pdfText.contains("Patient health details") && pdfText.contains("7-day menu")
				&& pdfText.contains("warnings") && pdfText.contains("Comments"));

	}

	@Then("User should be able to see download option for the PDF")
	public void user_should_be_able_to_see_download_option_for_the_pdf() 
	{
           Assert.assertTrue(dietPlanPage.checkDownload());
		
	}
	@Then("User should see the second page {string} and {int}")
	public void User_should_see_the_second_page_and(String sheetName, Integer rowNumber)
	{
		Assert.assertTrue(dietPlanPage.secondPage());
	}

}
