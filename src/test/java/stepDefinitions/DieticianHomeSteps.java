package stepDefinitions;

import org.testng.Assert;
import com.base.TestContext;
import com.pages.DieticianHomePage;
import io.cucumber.java.en.*;

public class DieticianHomeSteps {
	
	TestContext testContext;
	DieticianHomePage dieticianHP;
	private String newPatientTitle;
	private String myPatientTitle;
	private String dietPlansTitle;
	private String dieticianName;
	private String newPatientTab = "New Patient";
	private String dietPlansTab="Diet Plans";
	private String myPatientTab = "My Patient";
	
	public DieticianHomeSteps(TestContext testContext)
	{
		this.testContext = testContext;
		this.dieticianHP = testContext.pageObjectManager.getdieticianHP();
	}
	
	 @Then("^User is on the \"([^\"]*)\" page $")
	    public void user_is_on_the_something_page(String strArg1) {
	        Assert.assertEquals(dieticianHP.getTitle(), strArg1);
	    }
	 
	 @Then("^User can see the Home button on header menu$")
	    public void user_can_see_the_home_button_on_header_menu() {
		 	Assert.assertTrue(dieticianHP.checkHome());
	    }
	 
	 @Then("^User can see the \"([^\"]*)\" tab from the header menu$")
	    public void user_can_see_the_something_tab_from_the_header_menu(String strArg1) throws Throwable {
	        if(strArg1.equalsIgnoreCase(newPatientTab))
	        {
	        	Assert.assertTrue(dieticianHP.checkNewPatient());
	        }else if(strArg1.equalsIgnoreCase(myPatientTab))
	        {
	        	Assert.assertTrue(dieticianHP.checkMyPatients());
	        }else if(strArg1.equalsIgnoreCase(dietPlansTab))
	        {
	        	Assert.assertTrue(dieticianHP.checkDietPlans());
	        }
	    }  
	 
	 @When("^User selects New patient button$")
	    public void user_selects_new_patient_button(){
		 	newPatientTitle = dieticianHP.clickNewPatient();
	    }

	 @Then("^User lands on New Patient page as \"([^\"]*)\" and (.+)$")
	    public void user_lands_on_new_patient_page_as_something_and(String sheetname, Integer rownumber){
	    	Assert.assertEquals(newPatientTitle, testContext.gUtil.getxlData(sheetname).get(rownumber).get("value"));
	    }

	    @When("^User selects My Patient button$")
	    public void user_selects_my_patient_button() {
	    	myPatientTitle = dieticianHP.clickMyPatients();
	    }

	    @Then("^User lands on My Patient page as \"([^\"]*)\" and (.+)$")
	    public void user_lands_on_my_patient_page_as_something_and(String sheetname, Integer rownumber){
	       	Assert.assertEquals(myPatientTitle, testContext.gUtil.getxlData(sheetname).get(rownumber).get("value"));
	    }

	    @When("^User selects Diet Plans button$")
	    public void user_selects_diet_plans_button() {
	    	dietPlansTitle = dieticianHP.clickDietPlans();
	    }

	    @Then("^User lands on Diet Plans page as \"([^\"]*)\" and (.+)$")
	    public void user_lands_on_diet_plans_page_as_something_and(String sheetname, Integer rownumber){
	        Assert.assertEquals(dietPlansTitle, testContext.gUtil.getxlData(sheetname).get(rownumber).get("value"));
	    }

	    @Then("^User can see Banner or Announcements section in right side bar$")
	    public void user_can_see_banner_or_announcements_section_in_right_side_bar() {
	        Assert.assertTrue(dieticianHP.checkBanner());
	    }

	    @Then("^User can see Logged in as Dietician name message in top of right side bar$")
	    public void user_can_see_logged_in_as_dietician_name_message_in_top_of_right_side_bar(){
	        dieticianName =  dieticianHP.checkLogInName();
	        Assert.assertNotNull(dieticianName);
	    }
	    
	    @Then("^User can read Dietician Home page image and content$")
	    public void user_can_read_dietician_home_page_image_and_content() {
	        Assert.assertEquals(dieticianHP.verifyContent(), 0);
	    }
	    
	    @When("^User can see SIGN OUT button after successful login$")
	    public void user_can_see_sign_out_button_after_successful_login(){
	        Assert.assertTrue(dieticianHP.checkSignOut());
	    }


	    @Then("^User can click on SIGN OUT button and log off successfully as \"([^\"]*)\" and (.+)$")
	    public void user_can_click_on_sign_out_button_and_log_off_successfully_as_something_and(String sheetname, Integer rownumber){
	        dieticianHP.signOut();
	        Assert.assertEquals(dieticianHP.signOut(), testContext.gUtil.getxlData(sheetname).get(rownumber).get("value"));
	    }


}
