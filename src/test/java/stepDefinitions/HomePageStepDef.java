package stepDefinitions;

import org.testng.Assert;
import com.base.TestContext;
import com.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	HomePage homePage;
	TestContext testContext;
	private String actualTitle;
	private String Title;
	private String expectedTitle;
	private String registerTitle;
	private String expectedHomePageTitle = "Dietician software";

	public HomePageStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.homePage = testContext.pageObjectManager.getHomePage();
	}

	@Given("User is on Dietician Website")
	public void user_lands_dietician_website() {
	   Assert.assertEquals(homePage.getTitle(),expectedHomePageTitle);
		
	}

	@When("User is on Home page")
	public void user_is_on_home_page() {

		actualTitle = homePage.getTitle();
	}

	@When("User clicks on PRODUCT Link on  Home Page")
	public void user_clicks_on_product_link_on_home_page() {

		homePage.getProductLink();
	}

	@When("User clicks on client Link on  Home Page")
	public void user_clicks_on_client_link_on_home_page() {
		homePage.getClientLink();

	}

	@When("User clicks on Team Link on  Home Page")
	public void user_clicks_on_team_link_on_home_page() {
		homePage.getTeamLink();
	}

	@When("User clicks on Register Link on  Home Page")
	public void user_clicks_on_register_link_on_home_page() {
		homePage.getRegisterLink();
	}

	@When("User clicks on About Link on  Home Page")
	public void user_clicks_on_about_link_on_home_page() {
		homePage.getAboutLink();
	}

	@When("User clicks on Featured Link on  Home Page")
	public void user_clicks_on_featured_link_on_home_page() {

		homePage.getFeaturedLink();
	}
	
	
	@When("User clicks on Blog Link on  Home Page")
	public void user_clicks_on_blog_link_on_home_page() {
		homePage.getBlogLink();
	}

	@When("User clicks on Contact Link on Home Page")
	public void user_clicks_on_contact_link_on_home_page() {
		homePage.getContactusLink();
	}

	@When("User lands on Register page")
	public void user_lands_on_register_page() {
		registerTitle = homePage.getRegisterLink();
	}

	@When("User Clicks on the Team Page")
	public void user_clicks_on_the_team_page() {
		homePage.getTeamLink();
	}
	@When("User lands on Sign In page")
	public void User_lands_on_Sign_In_page()
	{
		homePage.clickSignin();
	}

	@Then("User should see the title of the page as details in excel {string} and RowNUmber {int}")
	public void user_should_see_the_title_of_the_page_as_details_in_excel_and_row_n_umber(String sheetName,
			Integer rowNumber) {
		// ********* data from excel ********** //

		Title = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("title");
		Assert.assertEquals(actualTitle, Title);
	}

	@Then("User should see a logo with the company name on the Home Page")
	public void user_should_see_a_logo_with_the_company_name_on_the_home_page() {

		Assert.assertTrue(homePage.getLogo());
	}

	@Then("validate Title of the Page {string} and {int}")
	public void validate_title_of_the_page_and(String sheetName, Integer rowNumber) {
		// ********* data from excel ********** //

		expectedTitle = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Title");

		Assert.assertEquals(registerTitle, expectedTitle);
	}

}
