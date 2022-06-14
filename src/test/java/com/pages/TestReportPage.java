package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestReportPage {
	
	WebDriver driver;
	private String pdfLink;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[3]/a")
	private WebElement latestPdf;
	
	public TestReportPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String clickPdf()
	{
		pdfLink = latestPdf.getAttribute("href");
		if(pdfLink.contains(".pdf"))
		{
			driver.get(pdfLink);
			return driver.getCurrentUrl();
		}else
		{
			return " ";
		}
	}
	
	
}
