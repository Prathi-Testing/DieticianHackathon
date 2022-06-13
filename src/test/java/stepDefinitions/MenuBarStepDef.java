package stepDefinitions;

import com.base.*;

import org.testng.Assert;
import org.testng.Reporter;

import com.pages.*;
import io.cucumber.java.en.*;

public class MenuBarStepDef {

	HomePage homePage;
	TestContext testContext;
	public String firstTab;
	public String menuBar;
	public String secondTab;
	public String thirdTab;
	public String fourthTab;
	public String fifthTab;
	public String sixthTab;
	public String seventhTab;
	public String eigthTab;

	public MenuBarStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.homePage = testContext.pageObjectManager.getHomePage();
	}

	@When("User check first tab in Home Page")
	public void user_check_first_tab() {
		firstTab = homePage.getProductLink();
	}

	@When("User check second tab in Home Page")
	public void user_check_second_tab() {
		secondTab = homePage.getClientLink();
	}

	@When("User check thrid tab in Home Page")
	public void user_check_thrid_tab() {
		thirdTab = homePage.getTeamLink();
	}

	@When("User check fourth tab in Home Page")
	public void user_check_fourth_tab() {
		fourthTab = homePage.getRegisterLink();
	}

	@When("User check fifth tab in Home Page")
	public void user_check_fifth_tab() {
		fifthTab = homePage.getAboutLink();
	}

	@When("User check sixth tab in Home Page")
	public void user_check_sixth_tab() {
		sixthTab = homePage.getFeaturedLink();
	}

	@When("User check seven tab in Home Page")
	public void user_check_seven_tab() {
		seventhTab = homePage.getBlogLink();
	}

	@When("User check eigth tab in Home Page")
	public void user_check_eigth_tab() {
		eigthTab = homePage.getContactusLink();
	}

	@Then("User should see a tab with text as per the sheetname {string} and rowNumber {int}")
	public void user_should_see_a_tab_with_producttext_in_sheetname_and_row_number(String sheetName,
			Integer rowNumber) {
		// ********* data from excel ********** //

		menuBar = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Menu Bar List");
		if ((firstTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(firstTab, menuBar);
		} else if ((secondTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(secondTab, menuBar);
		} else if ((thirdTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(thirdTab, menuBar);
		} else if ((fourthTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(fourthTab, menuBar);
		} else if ((fifthTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(fifthTab, menuBar);
		} else if ((sixthTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(sixthTab, menuBar);
		} else if ((seventhTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(seventhTab, menuBar);
		} else if ((eigthTab).equalsIgnoreCase(menuBar))
		{
			Assert.assertEquals(eigthTab, menuBar);
		} else {
			Reporter.log("Tab is not Matching with Menu Bar List");
		}
	}

	@Then("User should see search icon")
	public void user_should_see_search_icon() {
		Assert.assertTrue(homePage.getSearchIconVisibility());

	}

	@Then("User should see sigin option")
	public void user_should_see_sigin_option() {
		Assert.assertTrue(homePage.getSigninVisibility());
	}

}
