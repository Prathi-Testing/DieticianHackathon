package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamPage {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//span[@class='name']") 
	private List<WebElement> name;
	
	@FindBy(xpath = "//div[@aria-label='Previous']") 
	private WebElement previousPage;
	
	@FindBy(xpath = "//div[@aria-label='Next']")
	private WebElement nextPage;
	
	public TeamPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public Integer getSize()
	{
		name.size();
		
		return getSize();
	}
	public void getNextPage() 
	{
		nextPage.click();
	}
	
	public Boolean getNextPageLinkVisibility()
	{
		return nextPage.isEnabled();
	}

	public Boolean getPreviousPageLinkVisibility()
	{
		return previousPage.isEnabled();
	}
	

}
