package com.base;

import org.openqa.selenium.WebDriver;

import com.pages.*;
import com.pages.DieticianHomePage;
import com.pages.HomePage;
import com.pages.NewPatientPage;
import com.pages.TeamPage;



public class PageObjectManager {
	
	public WebDriver driver;
	private DieticianHomePage dieticianHP;
	private NewPatientPage newPatientPg;
	private HomePage homePage;
	private TeamPage teamPage;
	private ContactusPage contactusPage;
	private SignUpPage signupPage;

	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public NewPatientPage getNewPatientPg() {
		newPatientPg = new NewPatientPage(driver); 
		return newPatientPg;
	}

	public DieticianHomePage getdieticianHP()
	{
		dieticianHP = new DieticianHomePage(driver);
		return dieticianHP;
	}
	
	public HomePage getHomePage()

	{
		homePage = new HomePage(driver);

		return homePage;
	}

	public ContactusPage getContactusPage()

	{
		contactusPage = new ContactusPage(driver);

		return contactusPage;
	}

	public SignUpPage getSignupPage()

	{
		signupPage = new SignUpPage(driver);

		return signupPage;
	}

	public TeamPage getTeamPage()

	{
		teamPage = new TeamPage(driver);

		return teamPage;
	}

}
