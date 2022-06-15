package stepDefinitions;

import com.base.TestContext;

import java.util.Map;

import org.testng.Assert;

import com.pages.*;

import io.cucumber.java.en.*;

public class CreatePlanStepDef {

	

	CreatePlanPage createplanPage;
	TestContext testContext;
	private String filePath ;
	private String expectedTitle;
	private String actualTitle;
	private String expectedTooltip;
	private String actualToolTip;
	private String expectedFileName;
	private String actualFileName;
	private String errorMessage;
	private String expectedMessage;
	
	
	
	public CreatePlanStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.createplanPage = testContext.pageObjectManager.getCreatePlanPage();
	}
	
	@When("User lands on Create Plan page")
	public void user_lands_on_create_plan_page()
	{
		actualTitle = createplanPage.title();
	}
	@Then("User sees the heading of the page as in excel {string} and {int}")
	public void user_sees_the_heading_of_the_page_as_in_excel_and(String sheetName,Integer rowNumber) 
	{
   	  Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
   	  expectedTitle = xlvalue.get("Title");
   	  
   	  Assert.assertEquals(actualTitle, expectedTitle);
  	}

	@Then("User should see a button with name Browse on the page")
	public void user_should_see_a_button_with_name_browse_on_the_page() 
	{
	   Assert.assertTrue(createplanPage.checkBrowseButton());
	}

	@Then("User should see a tool tip message as in excel {string} and {int} for the Browse button")
	public void user_should_see_a_tool_tip_message_as_in_excel_and_for_the_browse_button(String sheetName,Integer rowNumber) 
	{
		Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		expectedTooltip = xlvalue.get("Message");
		actualToolTip = createplanPage.getToolTipMessage();
		
		Assert.assertEquals(actualToolTip, expectedTooltip);
	}

	@When("User clicks the Browse button and selects a document as {string} and {int}")
	public void user_clicks_the_browse_button_and_selects_a_document(String sheetName,Integer rowNumber) 
	{
		Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		String filePath = xlvalue.get("file path");
	    try {
			createplanPage.fileUpload(filePath);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User should see the selected document in the field next to the Browse button on the page as {string} and {int}")
	public void user_should_see_the_selected_document_in_the_field_next_to_the_browse_button_on_the_page(String sheetName,Integer rowNumber) 
	{
	    actualFileName = createplanPage.getfileName() ;
	    Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
         expectedFileName = xlvalue.get("File Name");
                  Assert.assertEquals(actualFileName,expectedFileName);
	}

	@Then("User should see a button with name Upload on the page")
	public void user_should_see_a_button_with_name_upload_on_the_page() 
	{
	    Assert.assertTrue(createplanPage.upload());
	}

	@When("User clicks the Upload button without selecting a document")
	public void user_clicks_the_upload_button_without_selecting_a_document() 
	{
            createplanPage.clickUpload();
	}

	@Then("User should see an error message as {string} and {int}")
	public void user_should_see_an_error_message_as_and(String sheetName, Integer rowNumber)
	{
	    errorMessage = createplanPage.checkErrorMessage();
	    Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
	    expectedMessage = xlvalue.get("Error Message");
	    Assert.assertEquals(errorMessage, expectedMessage);
	}

	@When("User clicks the Upload button by selecting a non-PDF file")
	public void user_clicks_the_upload_button_by_selecting_a_non_pdf_file() 
	{
		createplanPage.clickUpload();
	}

	@When("User clicks the Upload button by selecting a PDF file of size greater than 2MB as {string} and {int}")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_greater_than_2mb(String sheetName,Integer rowNumber) 
	{
		Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		filePath = xlvalue.get("file path");
	    try {
			createplanPage.fileUpload(filePath);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User clicks the Upload button by selecting a non-pdf file of size greater than 2MB as {string} and {int}")
	public void user_clicks_the_upload_button_by_selecting_a_non_pdf_file_of_size_greater_than_2mb(String sheetName,Integer rowNumber) 
	{
		Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		filePath = xlvalue.get("file path");
	    try {
			createplanPage.fileUpload(filePath);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User clicks the Upload button by selecting a pdf file of size less than 2MB as {string} and {int}")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_less_than_2mb(String sheetName,Integer rowNumber)
	{
		Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		filePath = xlvalue.get("file path");
	    try {
			createplanPage.fileUpload(filePath);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User should see a message as {string} and {int}")
	public void user_should_see_a_message_as_and(String sheetName,Integer rowNumber)
	{
		errorMessage = createplanPage.checkErrorMessage();
	    Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
	    expectedMessage = xlvalue.get("Message");
	    Assert.assertEquals(errorMessage, expectedMessage);
	}

	@Then("User should see option {int} menu to update the health conditions")
	public void user_should_see_option_menu_to_update_the_health_conditions(Integer int1)
	{
	  Assert.assertTrue(createplanPage.optionDisplayed());
	}

	@Then("User should see a button with text CONFIRM in option {int} menu")
	public void user_should_see_a_button_with_text_confirm_in_option_menu(Integer int1)
	{
	    Assert.assertTrue(createplanPage.checkConfirm1());
	}

	@When("User clicks the CONFIRM button in option one menu")
	public void user_clicks_the_confirm_button_in_option_one_menu() 
	{
	   createplanPage.clickConfirm1();
	}

	@Then("User cannot update the health conditions in option {int} menu")
	public void user_cannot_update_the_health_conditions_in_option_menu(Integer int1)
	{
	    Assert.assertFalse(createplanPage.disabledCondition());
	}

	@When("User clicks the CONFIRM button in option two")
	public void user_clicks_the_confirm_button_in_option_two() 
	{
	    createplanPage.clickConfirm2();
	}

	@Then("User should see a button with text GENERATE MENU  at the bottom of the page")
	public void user_should_see_a_button_with_text_generate_menu_at_the_bottom_of_the_page() 
	{
	    Assert.assertTrue(createplanPage.checkGenerateMenu());
	}

	@When("User clicks the GENERATE MENU button")
	public void user_clicks_the_generate_menu_button()
	{
	   createplanPage.clickGenerateMenu();
	}


	@Then("User should land on View Recent Diets page")
	public void user_should_land_on_view_recent_diets_page(String sheetName,Integer rowNumber) 
	{
		Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
 	  expectedTitle = xlvalue.get("Title");
 	  actualTitle = createplanPage.title();
 	  Assert.assertEquals(actualTitle, expectedTitle);
	}
}
