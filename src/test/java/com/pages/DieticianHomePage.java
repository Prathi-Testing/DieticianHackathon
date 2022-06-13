package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DieticianHomePage {
	
	WebDriver driver;
		
	@FindBy(id = "HomeButton")
	private WebElement home;
	
	@FindBy(id = "NewPatient")
	private WebElement newPatient;
	
	@FindBy(id = "MyPatientsButton")
	private WebElement myPatients;
	
	@FindBy(id = "DietPlanButton")
	private WebElement dietPlans;
	
	@FindBy(xpath="//*[contains(text(),'Banner')]")
	private WebElement banner;
	
	@FindBy(xpath="//*[contains(text(),'Logged')]")
	private WebElement loggedInName;
	
	@FindBy(id="signOut")
	private WebElement signOutBtn;
	
	public DieticianHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public Boolean checkHome()
	{
		return home.isDisplayed();
	}
	
	public Boolean checkNewPatient()
	{
		return newPatient.isDisplayed();	
	}
	
	public Boolean checkMyPatients()
	{
		return myPatients.isDisplayed();
	}
	
	public Boolean checkDietPlans()
	{
		return dietPlans.isDisplayed();
	}
	
	public String clickNewPatient()
	{
		newPatient.click();
		return driver.getTitle();
	}
	
	public String clickMyPatients()
	{
		myPatients.click();
		return driver.getTitle();
	}
	
	public String clickDietPlans()
	{
		dietPlans.click();
		return driver.getTitle();
	}
	
	public boolean checkBanner()
	{
		return banner.isDisplayed();
		
	}
	
	public String checkLogInName()
	{
		String fName = loggedInName.getText().split(" ")[3];
		String lName = loggedInName.getText().split(" ")[4];
		return fName + " " + lName;
	}
	
	public String signOut()
	{
		signOutBtn.click();
		return driver.getTitle();
	}
	
	public boolean checkSignOut()
	{
		return signOutBtn.isDisplayed();
	}
	
	public void verifyContent()
	{
		
	}
	
	
}
