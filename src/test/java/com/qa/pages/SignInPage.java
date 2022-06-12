package com.qa.pages;

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
