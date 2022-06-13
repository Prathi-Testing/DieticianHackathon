package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public WebDriver driver;

	@FindBy(name = "firstname")
	private WebElement Name;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(name = "lastname")
	private WebElement LastName;
	
	@FindBy(name = "userName")
	private WebElement userName;
	
	@FindBy(className = "otherfield")
	private WebElement otherField;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "password2")
	private WebElement PassConfirmation;
	
	@FindBy(className = "signup-title")
	private WebElement title;
	
	@FindBy(className = "signup-title")
	private WebElement titleEmailSignup;
	
	@FindBy(id = "mobile number")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//button[@type ='submit']")
	private WebElement mobileNoSignUp;
	
	@FindBy(xpath = "//button[@type ='signup']")
	private WebElement signup;
	
	@FindBy(xpath = "//span[contains(text(),Sign up with Google]")
	private WebElement googleSignUp;
	
	@FindBy(xpath = "//span[contains(text(),Sign up with Facebook]")
	private WebElement facebookSignUp;
	
	@FindBy(xpath = "//a[@class = 'Log in here']")
	private WebElement logIn;
	
	@FindBy(xpath = "//div[@class='account_creation']//sup")
	private WebElement asterisk;
	
	@FindBy(name = "error")
	private WebElement error;

	public SignUpPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getHeader() 
	{
		title.getText();
		return getHeader();
	}

	public String getEmailSignUpHeader() 
	{
		titleEmailSignup.getText();
		return getEmailSignUpHeader();
	}

	public Boolean signupButtonVisibility() 
	{
		return signup.isDisplayed();
	}

	public void mobileNoSignUp(String firstName, String lastName, String number, String fieldValue, String emailId,
			String passValue)
	{
		Name.sendKeys(firstName);
		LastName.sendKeys(lastName);
		mobileNumber.sendKeys(number);
		otherField.sendKeys(fieldValue);
		email.sendKeys(emailId);
		password.sendKeys(passValue);
		mobileNoSignUp.click();
	}

	public void emailIdSignUp(String firstName, String lastName, String user, String passValue2, String emailId,
			String passValue) 
	{
		name.sendKeys(firstName);
		LastName.sendKeys(lastName);
		userName.sendKeys(user);
		email.sendKeys(emailId);
		password.sendKeys(passValue);
		PassConfirmation.sendKeys(passValue2);
		signup.click();
	}

	public void googleSignup() 
	{
		googleSignUp.click();
	}

	public void facebookSignup() 
	{
		facebookSignUp.click();
	}

	public void loginHere()
	{
		logIn.click();
	}

	public Boolean visibilityMandatoryfield() 
	{
		return asterisk.isDisplayed();

	}

	public String getTitle() 
	{
		return driver.getTitle();
	}

	public String getError()
	{

		return error.getText();
	}
}
