package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage  {
	
	WebDriver driver;
	
	@FindBy(name="Sign In")
	WebElement SignIn;

	@FindBy(xpath = "//span[contains(text(), '*')]")
	List<WebElement> starsymbol;

	@FindBy(xpath = "//input[contains(text(),'error message')]")
	WebElement Message;

	@FindBy(xpath = "//input(@id='username')")
	WebElement SignInUsername;

	@FindBy(xpath = "//input(@id='password')")
	WebElement Password;

	@FindBy(xpath = "//button(@id='SIGN IN')")
	WebElement SigInButton;

	@FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
	WebElement ForgotPassword;

	@FindBy(xpath = "//a[contains(text(),'Not a member yet?')]")
	WebElement NotMemberLink;

	@FindBy(xpath = "//a[contains(text(),'Log in with your email')]")
	WebElement LogInHeading;

	@FindBy(xpath = "//a(@id='Password')")
	WebElement LogInForgotPassword;

	@FindBy(xpath = "//input(@id='email')")
	WebElement Email;

	@FindBy(xpath = "//input(@class='pass')")
	WebElement LogInPassword;

	@FindBy(xpath = "//button(@id='login')")
	WebElement EmailLogIn;

	@FindBy(xpath = "//a(@id='forgotpass')")
	WebElement ForgotYourPassword;

	@FindBy(xpath = "//*[contains(text(),'Or log in with')]")
	WebElement textLogIn;

	@FindBy(xpath = "//a[contains(text(),'Facebook')]")
	WebElement FacebookLink;

	@FindBy(xpath = "//a[contains(text(),'Google')]")
	WebElement GoogleLink;

	@FindBy(xpath = "//a[contains(text(),'Sign up here')]")
	WebElement SignUpLink;

	@FindBy(xpath = "//image(@class='4rfg6')")
	WebElement SignInIcon;

	@FindBy(xpath = "//*[contains(text(),'signOut')]")
	WebElement signout;

	@FindBy(xpath = "//*[contains(text(),'Login')]")
	WebElement loginbutton;

	@FindBy(xpath = "//div[@class='account_creation']//sup")
	private WebElement asterisk;

	// initializing page objects

	public SignInPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// Actions

	public Boolean visibilityMandatoryfield() {
		return asterisk.isDisplayed();

	}

	public String SigninpageTitle() {
		return driver.getTitle();
	}

	public String SignInHeading() {
		return SignIn.getText();
	}

	public String SignButton() {
		return SigInButton.getText();

	}

	public String ForgotPassword() {
		ForgotPassword.click();
		return driver.getTitle();

	}

	public String NotMemberButton() {
		NotMemberLink.click();
		return driver.getTitle();
	}

	public String fillCred(String uName, String pwd) {
		SignInUsername.sendKeys(uName);
		Password.sendKeys();
		SigInButton.click();

		if (Message.isDisplayed()) {
			return Message.getText();
		} else {
			return " ";
		}
	}

	public String loginHeading() {
		return LogInHeading.getText();
	}

	public String LoginWithCred(String uName, String pwd) {
		SignInUsername.sendKeys(uName);
		Password.sendKeys(pwd);
		SigInButton.click();

		if (Message.isDisplayed()) {
			return Message.getText();
		} else {
			return " ";
		}

	}

	public String ForgotYourPassword() {
		ForgotYourPassword.click();
		return driver.getTitle();

	}

	public String FacebookLogIn() {
		FacebookLink.click();
		return driver.getTitle();

	}

	public String GoogleLogIn() {
		GoogleLink.click();
		return driver.getTitle();

	}

	public Boolean SignUpLink() {
		return SignUpLink.isEnabled();

	}

	public String SignInIcon() {
		SignInIcon.click();
		return driver.getTitle();
	}

	public String getmessage() {
		return Message.getText();

	}

	public Boolean checkSignout() {

		return signout.isDisplayed();
	}

	public String SignInButton() {
		SigInButton.click();
		return driver.getTitle();
	}

	public String LogInButton() {
		loginbutton.click();
		return driver.getTitle();

	}
}
