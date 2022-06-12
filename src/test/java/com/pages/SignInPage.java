package com.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Base;

public class SignInPage extends Base  {
	
	@FindBy(name="Sign In")
	WebElement SignIn;
	
	@FindBy(name="star")
	WebElement starsymbol;
	
	@FindBy(xpath="//input(@id='username')")
	WebElement Username;
	
	@FindBy(xpath="//input(@id='password')")
	WebElement Password;
	
	@FindBy(xpath="//button(@id='SIGN IN')")
	WebElement SigInButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement ForgotPassword;
	
	@FindBy(xpath="//a[contains(text(),'Not a member yet?')]")
	WebElement NotMemberLink;
	
	@FindBy(xpath="//a[contains(text(),'Log in with your email')]")
	WebElement LogInHeading;
	
	@FindBy(xpath="//a(@id='Password')")
	WebElement LogInForgotPassword;
	
	@FindBy(xpath="//input(@id='email')")
	WebElement Email;
	
	@FindBy(xpath="//input(@class='pass")
	WebElement LogInPassword;
	
	@FindBy(xpath="//button(@id='login')")
	WebElement EmailLogIn;
	
	@FindBy(xpath="//*[contains(text(),'Or log in with')]")
	WebElement textLogIn;
	
	@FindBy(xpath="//a[contains(text(),'Facebook')]")
	WebElement FacebookLink;
	
	@FindBy(xpath="//a[contains(text(),'Google')]")
	WebElement GoogleLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up here')]")
	WebElement SignUpLink;
	
	
	
	
	
	
	
	//initializing page objects
	
	public SignInPage() {
		
		PageFactory.initElements(driver,this);
	

}
	
	//Actions
	
	public String SigninpageTitle() {
		return driver.getTitle();
	}
	
    public Boolean MandatoryFields() {
    	return starsymbol.isDisplayed();
    }
    
    public Boolean SignInHeaing() {
    	return SignIn.isDisplayed();
    }
    public Boolean SignButton() {
    	return SigInButton.isEnabled();
    }
    public String EmptyFields() {
    	Assert.
    }
	}
