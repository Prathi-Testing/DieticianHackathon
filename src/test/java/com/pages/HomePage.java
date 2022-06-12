package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@alt='logo']") WebElement logo;
	@FindBy(xpath = "//span[contains(text(),'product')]") WebElement product;
	@FindBy(xpath = "//span[contains(text(),'About')]") WebElement about;
	@FindBy(xpath = "//span[contains(text(),'clients')]") WebElement clients;
	@FindBy(xpath = "//span[contains(text(),'team')]") WebElement team;
	@FindBy(xpath = "//span[contains(text(),'register')]") WebElement register;
	@FindBy(xpath = "//span[contains(text(),'featured')]") WebElement featured;
	@FindBy(xpath = "//span[contains(text(),'blog')]") WebElement blog;
	@FindBy(xpath = "//span[contains(text(),'contactus')]") WebElement contactus;
	@FindBy(className = "search") WebElement searchicon;
	@FindBy(className = "signin") WebElement signin;
		

	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}

	public String getURL() {
		return driver.getCurrentUrl();
	}
	public String getTitle() 
	{
		return driver.getTitle();
	}

	public Boolean getLogo() 
	{
		return logo.isDisplayed();
	}

	public String getProductLink() 
	{
		product.getText();
		product.click();
		
		return getProductLink();
	}
	
	public String getAboutLink() 
	{
		about.getText();
		about.click();
		
		return getAboutLink();
	}
	
	public String getClientLink() 
	{
		clients.getText();
		clients.click();
		
	    return getClientLink()	;
	}
	
	public String getTeamLink() 
	{
		team.getText();
		team.click();
		
		return getTeamLink();
		
	}

	public String getRegisterLink() 
	{
		register.getText();
		register.click();
		
		return getRegisterLink();
	}
	
	public String getFeaturedLink() 
	{
		featured.getText();
		featured.click();
		return getFeaturedLink();
	}
	public String getBlogLink() 
	{
		blog.getText();
		blog.click();
		return getBlogLink();
	}
	public String getContactusLink() 
	{
		contactus.getText();
		contactus.click();
		return getContactusLink();
	}
	
	public Boolean getSearchIconVisibility()
	{
		return searchicon.isDisplayed();
	}
	
	public Boolean getSigninVisibility()
	{
	return signin.isDisplayed();
	}
	
	
}
