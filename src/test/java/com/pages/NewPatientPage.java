package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPatientPage {
	public WebDriver driver;
	
	@FindBy(id="patientdata")
	private WebElement patientData;
	
	@FindBy(id="update Button")
	private WebElement updtBtn;
	
	@FindBy(xpath="//input[id='name']")
	private WebElement fullName;
	
	@FindBy(xpath="//input[id='address line 1']")
	private WebElement addr1;
	
	@FindBy(xpath="//input[id='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[id='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[id='Postal code']")
	private WebElement postCode;
	
	@FindBy(xpath="//input[id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[id='contact number']")
	private WebElement phone;
	
	public NewPatientPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkPatientform()
	{
		return patientData.isDisplayed();
	}
	
	public NewPatientPage submitForm()
	{
		updtBtn.click();
		return this;
	}
	
	

	
}
