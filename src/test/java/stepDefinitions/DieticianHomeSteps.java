package stepDefinitions;

import org.testng.Assert;
import com.base.TestContext;
import com.pages.DieticianHomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class DieticianHomeSteps {
	
	TestContext testContext;
	DieticianHomePage dieticianHP;
	private String newPatientTitle;
	private String myPatientTitle;
	private String dietPlansTitle;
	private String dieticianName;
	
	public DieticianHomeSteps(TestContext testContext)
	{
		this.testContext = testContext;
		this.dieticianHP = testContext.pageObjectManager.getdieticianHP();
	}
	
	 @When("^User is on the Dietician Home page$")
	    public void user_is_on_the_dietician_home_page(){
		 	Assert.assertEquals(dieticianHP.getTitle(), testContext.expectedDieticianHomePageTitle);
	    }
	 
	 @Then("^User can see the Home button on header menu$")
	    public void user_can_see_the_home_button_on_header_menu() {
		 	Assert.assertTrue(dieticianHP.checkHome());
	    }
	 
	 @Then("^User can see the \"([^\"]*)\" tab from the header menu$")
	    public void user_can_see_the_something_tab_from_the_header_menu(String strArg1) throws Throwable {
	        if(strArg1.equalsIgnoreCase("New Patient"))
	        {
	        	Assert.assertTrue(dieticianHP.checkNewPatient());
	        }else if(strArg1.equalsIgnoreCase("My Patient"))
	        {
	        	Assert.assertTrue(dieticianHP.checkMyPatients());
	        }else if(strArg1.equalsIgnoreCase("Diet Plans"))
	        {
	        	Assert.assertTrue(dieticianHP.checkDietPlans());
	        }
	    }  
	 
	 @When("^User selects New patient button$")
	    public void user_selects_new_patient_button(){
		 	newPatientTitle = dieticianHP.clickNewPatient();
	    }

	    @Then("^User lands on New Patient page$")
	    public void user_lands_on_new_patient_page(){
	    	Assert.assertEquals(newPatientTitle, testContext.expectedNewPatientTitle);
	    }

	    @When("^User selects My Patient button$")
	    public void user_selects_my_patient_button() {
	    	myPatientTitle = dieticianHP.clickMyPatients();
	    }

	    @Then("^User lands on My Patient page$")
	    public void user_lands_on_my_patient_page(){
	        Assert.assertEquals(myPatientTitle, testContext.expectedMyPatientTitle);
	    }

	    @When("^User selects Diet Plans button$")
	    public void user_selects_diet_plans_button() {
	    	dietPlansTitle = dieticianHP.clickDietPlans();
	    }

	    @Then("^User lands on Diet Plans page$")
	    public void user_lands_on_diet_plans_page() {
	        Assert.assertEquals(dietPlansTitle, testContext.expectedDietPlansTitle);
	    }

	    @Then("^User can see Banner or Announcements section in right side bar$")
	    public void user_can_see_banner_or_announcements_section_in_right_side_bar() {
	        Assert.assertTrue(dieticianHP.checkBanner());
	    }

	    @Then("^User can see Logged in as Dietician name message in top of right side bar$")
	    public void user_can_see_logged_in_as_dietician_name_message_in_top_of_right_side_bar(){
	        dieticianName =  dieticianHP.checkLogInName();
	        
	    }
	    
	    @Then("^User can read Dietician Home page image and content$")
	    public void user_can_read_dietician_home_page_image_and_content() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @When("^User can see SIGN OUT button after successful login$")
	    public void user_can_see_sign_out_button_after_successful_login(){
	        Assert.assertTrue(dieticianHP.checkSignOut());
	    }

	    @Then("^User can click on SIGN OUT button for logging off successfully$")
	    public void user_can_click_on_sign_out_button_for_logging_off_successfully() {
	        dieticianHP.signOut();
	    }


}
