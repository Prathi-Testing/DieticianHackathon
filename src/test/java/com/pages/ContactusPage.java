package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {

	public WebDriver driver;

	@FindBy(name = "firstname")
	private WebElement Name;

	@FindBy(name = "lastname")
	private WebElement LastName;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "subject")
	private WebElement sub;

	@FindBy(id = "write message")
	private WebElement message;

	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(name = "error")
	private WebElement error;

	@FindBy(name = "success")
	private WebElement success;

	public ContactusPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void contactusForm(String firstName, String lastName, String subject, String details, String emailId) 
	{
		Name.sendKeys(firstName);
		LastName.sendKeys(lastName);
		email.sendKeys(emailId);
		sub.sendKeys(subject);
		message.sendKeys(details);
		submit.click();
	}

	public String getError() 
	{

		return error.getText();
	}

	public String getsuccess()
	{

		return success.getText();
	}
}
