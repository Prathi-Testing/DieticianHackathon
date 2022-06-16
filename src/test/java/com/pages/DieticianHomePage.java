package com.pages;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DieticianHomePage {
	
	WebDriver driver;
	private int invalidImageCount;
		
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
	
	@FindBy(tagName = "img")
	private List<WebElement> images;
	
	public DieticianHomePage(WebDriver driver)
	{
		this.driver = driver;
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
	
	public int verifyContent()
	{
		for (WebElement image : images) {
			if (image != null) {
				
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(image.getAttribute("src"));
				HttpResponse response = null;
				
				try {
					response = client.execute(request);
				} catch (ClientProtocolException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				if (response.getStatusLine().getStatusCode() != 200)
					invalidImageCount++;
			}
		}
		return invalidImageCount;
	}
	
	
}
