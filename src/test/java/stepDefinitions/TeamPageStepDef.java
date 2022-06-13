package stepDefinitions;

import org.testng.Assert;

import com.pages.*;
import com.base.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeamPageStepDef {

	TeamPage teamPage;
	TestContext testContext;
	private int actualCount;
	private String count;
	private int expectedCount;

	public TeamPageStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.teamPage = testContext.pageObjectManager.getTeamPage();
	}

	@Then("User Should see only limited number of Doctors list in {string} and {int}")
	public void user_should_see_only_limited_number_of_doctors_list_in_and_row_number(String sheetName,
			Integer rowNumber) {
		actualCount = teamPage.getSize();
		// ********* data from excel ********** //
		count = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("count");
		expectedCount = Integer.parseInt(count);
		Assert.assertEquals(actualCount, expectedCount);

	}

	@Then("User should see a disabled pagination link for the Pervious page")
	public void user_should_see_a_disabled_pagination_link_for_the_pervious_page() {
		Assert.assertFalse(teamPage.getPreviousPageLinkVisibility());
	}

	@Then("User should see a enabled pagination link for the Next page")
	public void user_should_see_a_enabled_pagination_link_for_the_next_page() {

		Assert.assertTrue(teamPage.getNextPageLinkVisibility());
	}

	@When("User clicks pagination link for the Next page")
	public void user_clicks_pagination_link_for_the_next_page() {
		teamPage.getNextPage();
	}

	@Then("User should redirected to the next page and see Enabled pagination link for the pervious page")
	public void user_should_redirected_to_the_next_page_and_see_enabled_pagination_link_for_the_pervious_page() {
		Assert.assertTrue(teamPage.getPreviousPageLinkVisibility());
	}

	@Then("User should see a disabled pagination link for the Next page")
	public void user_should_see_a_disabled_pagination_link_for_the_next_page() {
		Assert.assertFalse(teamPage.getNextPageLinkVisibility());
	}

	@Then("User should see a enabled pagination link for the Previous page")
	public void user_should_see_a_enabled_pagination_link_for_the_previous_page() {
		Assert.assertTrue(teamPage.getPreviousPageLinkVisibility());
	}
}
