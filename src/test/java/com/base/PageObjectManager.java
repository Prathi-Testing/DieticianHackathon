package com.base;

import org.openqa.selenium.WebDriver;

import com.pages.*;

public class PageObjectManager {
	
	public WebDriver driver;
	private DieticianHomePage dieticianHP;
	private NewPatientPage newPatientPg;
	private HomePage homePage;
	private TeamPage teamPage;
	private ContactusPage contactusPage;
	private SignUpPage signupPage;
	private SignInPage signinPage;
	private ScreenPage screenPage;
	private TestReportPage testReportPage;
	private MyPatientPage myPatientPage;
	private CreatePlanPage createplanPage;
	private DietPlanPage dietPlanPage;


	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public TestReportPage getTestReportPage() {
		testReportPage = new TestReportPage(driver); 
		return testReportPage;
	}
	
	public MyPatientPage getMyPatientPage() {
		myPatientPage = new MyPatientPage(driver); 
		return myPatientPage;
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
	
	public ScreenPage getScreenPage()

	{
		screenPage = new ScreenPage(driver);

		return screenPage;
	}
	public SignInPage getSignInPage()

	{
		signinPage = new SignInPage(driver);

		return signinPage;
	}
	
	public CreatePlanPage getCreatePlanPage()

	{
		createplanPage = new CreatePlanPage(driver);
		
		return createplanPage;
	}
	
	public DietPlanPage getDietPlanPage()
	{
		dietPlanPage = new DietPlanPage(driver);
		
		return dietPlanPage;
	}

}
