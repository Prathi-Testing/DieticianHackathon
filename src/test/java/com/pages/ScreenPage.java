package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenPage {

	public WebDriver driver;
	
    @FindBy(id = "nav-hamburger-menu")
    private WebElement screen;
    
    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']")
    private WebElement hamburgerMenu;
    
	@FindBy(xpath = "//span[@contains(text(),'public')]")
	private WebElement userPublic;

	@FindBy(id = "User Signin")
	private WebElement signin;

	@FindBy(id = " Register")
	private WebElement register;

	@FindBy(name = "Team")
	private WebElement team;

	@FindBy(name = "Testimonials")
	private WebElement testimonials;

	@FindBy(xpath = "//a[contains(text(),'ForgotPassword')]")
	private WebElement forgotPassword;

	@FindBy(id = "productfeature")
	private WebElement product;

	@FindBy(id = "contact")
	private WebElement contact;

	@FindBy(id = "blogs")
	private WebElement blogs;

	@FindBy(id = "featured content")
	private WebElement content;

	@FindBy(name = "Home")
	private WebElement home;

	@FindBy(name = "Dietician ")
	private WebElement dietican;

	@FindBy(xpath = "//a[contain(text(),'view recent diets')]")
	private WebElement viewdiets;

	@FindBy(name = "View recent Test Report")
	private WebElement testreport;

	@FindBy(name = "add new patient")
	private WebElement addpatient;

	@FindBy(name = "Dietician Home")
	private WebElement dieticianhome;

	@FindBy(id = "my patient")
	private WebElement mypatient;

	@FindBy(id = "condition and create plan")
	private WebElement createplan;

	public ScreenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public Boolean screenvisibility()
	{
		return screen.isDisplayed();
	}
	public void getscreen()
	{
		screen.click();
	}
	
	public Boolean checkHamburgerMenu()
	{
		return hamburgerMenu.isDisplayed();
	}
	public String getPublic() 
	{
		userPublic.getText();
		return getPublic();
	}
	
	public String title()
	{
	   return driver.getTitle();	
	}
	
	public String getUserSignin()
	{
		signin.getText();
		signin.click();
	   return getUserSignin();
	}
	public String getRegisterPage()
	{
		register.getText();
		register.click();
	   return getRegisterPage();
	}
	public String getTeamPage()
	{
		team.getText();
		team.click();
	   return getTeamPage();
	}
	
	public String getTestimonialPage()
	{
		testimonials.getText();
		testimonials.click();
	   return getTestimonialPage();
	}
	
	public String getForgotPasswordPage()
	{
		forgotPassword.getText();
		forgotPassword.click();
	   return getForgotPasswordPage();
	}
	
	public String getProductPage()
	{
		product.getText();
		product.click();
	   return getProductPage();
	}
	
	public String getContactPage()
	{
		contact.getText();
		contact.click();
	   return getContactPage();
	}
	
	public String getBlogPage()
	{
		blogs.getText();
		blogs.click();
	   return getBlogPage();
	}
	
	public String getContentPage()
	{
		content.getText();
		content.click();
	   return getContentPage();
	}
	
	public String getdieticianhomePage()
	{
		dieticianhome.getText();
		dieticianhome.click();
	   return getdieticianhomePage();
	}
	
	public String getviewdietsPage()
	{
		viewdiets.getText();
		viewdiets.click();
	   return getviewdietsPage();
	}
	
	public String getreportPage()
	{
		testreport.getText();
		testreport.click();
	   return getreportPage();
	}
	
	public String getaddpatientPage()
	{
		addpatient.getText();
		addpatient.click();
	   return getaddpatientPage();
	}
	
	public String getdieticianPage()
	{
		dietican.getText();
		dietican.click();
	   return getdieticianPage();
	}
	
	public String getmypatientPage()
	{
		mypatient.getText();
		mypatient.click();
	   return getmypatientPage();
	}
	
	public String getcreateplanPage()
	{
		createplan.getText();
		createplan.click();
	   return getcreateplanPage();
	}

}
