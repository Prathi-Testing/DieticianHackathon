package stepDefinitions;

import java.util.Map;

import org.testng.Assert;

import com.base.TestContext;
import com.pages.SignInPage;
import com.pages.SignUpPage;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepDef {
	SignInPage signinPage;
	TestContext testContext;
	private String expectedHeading="Sign In";
	private String expectedSignInTitle="SignIn";
	private String expectedSignButtonText="SIGN IN";
	private String expectedResetPasswordTitle="ResetPassword";
	private String expectedRegisterPageTitle="COMPANY NAME";
	
	public SignInStepDef(TestContext testContext)
	{
		this.testContext = testContext;
		this.signinPage = testContext.pageObjectManager.getSignInPage();
	}
	
	
	    @When("^User clicks Sign In Button in the Sign In form with all fields empty$")
	    public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty_() {
	    	String sheetName = null;
			int rowNumber = 0;
			Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		                 String uName = xlvalue.get("First Name");
	                     String pwd = xlvalue.get("Password");
	                     
	                     signinPage.fillCred(uName,pwd);
	                     signinPage.SignInButton();
		    	
		    
	        
	    }

	    @When("^User clicks Sign In button entering numeric value for Username \"([^\"]*)\" (.+)$")
	    public void user_clicks_sign_in_button_entering_numeric_value_for_username_something(String sheetname, String rownumber){
	    	String sheetName = null;
			int rowNumber = 0;
			Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		                 String uName = xlvalue.get("First Name");
	                     String pwd = xlvalue.get("Password");
	                     
	                     signinPage.fillCred(uName,pwd);
	                     signinPage.SignInButton();
		    	
		    
	    }

	    @When("^User clicks Sign In button entering extra length values for password \"([^\"]*)\" (.+)$")
	    public void user_clicks_sign_in_button_entering_extra_length_values_for_password_something(String sheetname, String rownumber){
	    	String sheetName = null;
			int rowNumber = 0;
			Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		                 String uName = xlvalue.get("First Name");
	                     String pwd = xlvalue.get("Password");
	                     
	                     signinPage.fillCred(uName,pwd);
	                     signinPage.SignInButton();
		    	
		    
	    	
	    }

	    @When("^User clicks Sign In button entering invalid values for Username and password \"([^\"]*)\" (.+)$")
	    public void user_clicks_sign_in_button_entering_invalid_values_for_username_and_password_something(String sheetname, String rownumber) {
	    	String sheetName = null;
			int rowNumber = 0;
			Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		                 String uName = xlvalue.get("First Name");
	                     String pwd = xlvalue.get("Password");
	                     
	                     signinPage.fillCred(uName,pwd);
	                     signinPage.SignInButton();
		    	
		    
	    }

	    @When("^User clicks on Forgot Password button$")
	    public void user_clicks_on_forgot_password_button(){
	    	signinPage.ForgotPassword();
	        
	    }

	    @When("^User clicks not member yet button$")
	    public void user_clicks_on_not_member_yet_button(String strArg1) {
	    	signinPage.NotMemberButton();
	    }

	    @When("^User clicks Sign In with all valid fields \"([^\"]*)\" (.+)$")
	    public void user_clicks_sign_in_with_all_valid_fields_something(String sheetname, int rownumber)  {
	    	 String sheetName = null;
			int rowNumber = 0;
			Map<String,String> xlvalue = testContext.gUtil.getxlData(sheetName).get(rowNumber);
		                 String uName = xlvalue.get("First Name");
	                     String pwd = xlvalue.get("Password");
	                     
	                     signinPage.fillCred(uName,pwd);
	                     signinPage.SignInButton();
		    	
		    
	    
	    }

	    @Then("^User should see the title of the page as Sign In$")
	    public void user_should_see_the_title_of_the_page_as_sign_in() {
	        
	    

	         String actualSigninpageTitle = signinPage.SigninpageTitle();
	        
			
	         
	         Assert.assertEquals(actualSigninpageTitle, expectedSignInTitle);

	    }

	   

	    @Then("^User should see a form with heading \"([^\"]*)\", to sign In using Username$")
	    public void user_should_see_a_form_with_heading_() {
	    	String ActualHeading= signinPage.SignInHeading();
	        
	         Assert.assertEquals(ActualHeading,expectedHeading);

	    	
	    }

	    @Then("^User should see a button with text \"([^\"]*)\" in the Sign In form$")
	    public void user_should_see_a_button_with_text_something_in_the_sign_in_form(String sheetName, int rowNumber){
	    	String ActualSignButtonText= signinPage.SignButton();
	         
	         Assert.assertEquals(ActualSignButtonText,expectedSignButtonText);

	        
	    }

	    @Then("^User should get error message \"([^\"]*)\" (.+)$")
	    public void user_should_get_error_message_something(String sheetName, int rowNumber)  {
	    	String ActualMessage= signinPage.getmessage();
	         String expectedMessage = testContext.gUtil.getxlData(sheetName).get(rowNumber).get("Heading");
	         
	         Assert.assertEquals(ActualMessage,expectedMessage);

	    	
	    }

	    @Then("^User should be directed to  Reset password link$")
	    public void user_should_be_directed_to_reset_password_link(String sheetName, int rowNumber)  {
	        
	    


	    	String ActualResetPasswordTitle= signinPage.ForgotYourPassword();
	         
	         
	         Assert.assertEquals(ActualResetPasswordTitle,expectedResetPasswordTitle);

	    	
	    	
	        
	    }

	    @Then("^User will land on Register Page$")
	    public void user_will_land_on_register_page(String sheetName, int rowNumber) {

	    	String ActualRegisterPageTitle= signinPage.NotMemberButton();
	         
	         
	         Assert.assertEquals(ActualRegisterPageTitle,expectedRegisterPageTitle);

	    	
	    	
	        
	    }

	    @Then("^User logged in successfully$")
	    public void user_logged_in_successfully() {
	    	
	    	 Assert.assertTrue(signinPage.checkSignout());
	    	
	        
	    }
}
