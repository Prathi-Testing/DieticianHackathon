package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(id="error message")
	private WebElement error;
	
	public NewPatientPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkPatientform()
	{
		return patientData.isDisplayed();
	}
	
	public boolean checkUpdtBtn()
	{
		return updtBtn.isEnabled();
		
	}
	public String submitForm()
	{
		updtBtn.click();
		return pickMessage();
	}
	
	public String fillName(String name)
	{
		fullName.sendKeys(name);
		return pickMessage();
		
	}
	
	public String fillAddr(String addr)
	{
		addr1.sendKeys(addr);
		return pickMessage();
	}
	
	public String fillCntry(String cntry)
	{
		country.sendKeys(cntry);
		return pickMessage();
	}
	
	public String fillState(String st)
	{
		state.sendKeys(st);
		return pickMessage();
	}
	
	public String fillCity(String cityName)
	{
		city.sendKeys(cityName);
		return pickMessage();
	}
	
	public String fillPostCode(String postalCode)
	{
		postCode.sendKeys(postalCode);
		return pickMessage();
	}

	public String fillEmail(String e_mail)
	{
		email.sendKeys(e_mail);
		return pickMessage();
	}
	
	public String fillPhone(String ph)
	{
		phone.sendKeys(ph);
		return pickMessage();
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
