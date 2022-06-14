package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPatient {

	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'My Patients')]") 
	private WebElement tabMyPatient;
	
	@FindBy(xpath = "//span[contains(text(),'Name Filter')]") 
	private WebElement nameFilter;
	
	@FindBy(xpath = "//span[contains(text(),'Email Address Filter')]") 
	private WebElement emailFilter;
	
	@FindBy(xpath = "//span[contains(text(),'Phone Number Filter')]") 
	private WebElement phoneNumberFilter;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]") 
	private WebElement searchButton;
	
	@FindBy(xpath = "//button[contains(text(),'View Previous Test Reports')]") 
	private WebElement vwPreviousReportButton;
	
	@FindBy(xpath = "//button[contains(text(),'View Previous Diet Plan')]") 
	private WebElement vwPreviousDietPlan;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Report/Plan')]") 
	private WebElement createNwReportPlan;
	
	@FindBy(xpath = "//th[contains(text(),'Record Number')]")
	private WebElement recNum;
	
	@FindBy(xpath = "//th[contains(text(),'Cust ID')]")
	private WebElement custID;
	
	@FindBy(xpath = "//th[contains(text(),'Name')]")
	private WebElement name;
	
	@FindBy(xpath = "//th[contains(text(),'Details')]")
	private WebElement details;
	
	@FindBy(xpath = "//th[contains(text(),'Last Visit')]")
	private WebElement lastVisit;
	
	@FindBy(xpath = "//th[contains(text(),'Actions')]")
	private WebElement actions;
	
	@FindBy(id="error message")
	private WebElement error;
	
	public MyPatient(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkSearchButton()
	{
		return searchButton.isDisplayed();
	}
	
	public String searchPatient()
	{
		searchButton.click();
		return pickMessage();
	}
	
	public String fillnameFilter(String name)
	{
		nameFilter.sendKeys(name);
		return pickMessage();
	}
	
	public String fillemailFilter(String email)
	{
		emailFilter.sendKeys(email);
		return pickMessage();
	}
	
	public String fillphoneNumberFilter(String phone)
	{
		phoneNumberFilter.sendKeys(phone);
		return pickMessage();
	}
	
// Column headers 	
	public String  verifyRecNum() {
		return recNum.getText();
	}
	
	public String  verifyCustID() {
		return custID.getText();
	}
	
	public String  verifyName() {
		return name.getText();
	}
	
	public String  verifyDetails() {
		return details.getText();
	}
	
	public String  verifyLastVisit() {
		return lastVisit.getText();
	}
	
	public String  verifyActions() {
		return actions.getText();
	}
	
// Buttons in table
	public boolean verifyReportButton()
	{
		return vwPreviousReportButton.isDisplayed();
	}
	
	public boolean verifyCreateReportButton()
	{
		return createNwReportPlan.isDisplayed();
	}
	
	public boolean verifyDietPlanButton()
	{
		return vwPreviousDietPlan.isDisplayed();
	}
	
	public String getMyPatientLink() {
		tabMyPatient.getText();
		tabMyPatient.click();
		return getMyPatientLink();
	}
	
	private String pickMessage()
	{
		if(error.isDisplayed())
		{
			return error.getText();
		}else
		{
			return " ";
		}
	}
	
	
}
