package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DietPlanPage {

	WebDriver driver;
    
	private String pdfLink;
    boolean flag;
    
	@FindBy(id = "Heading")
	private WebElement heading;

	@FindBy(id = "DietPlansTab")
	private WebElement dietPlansTab;

	@FindBy(id = "NumOfRecords")
	private List<WebElement> numOfRecords;

	@FindBy(id = "ArrowButton")
	private WebElement arrowButton;

	@FindBy(id = "PreviousArrowButton")
	private WebElement prevArrowButton;

	@FindBy(xpath="//table/tbody/tr[1]/td[3]/a")
	private WebElement latestPdf;
	
	@FindBy(xpath="//table/tbody/tr/td[3]")
	private List<WebElement> pdfs;
	
	@FindBy(id = "download")
	private WebElement download;
	
	@FindBy(className = "pagination")
	private WebElement pagination;
	
	@FindBy(id = "Plan-Generated")
	private WebElement planGenerated;

	public DietPlanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getHeading()
	{
		return heading.getText();
	}
	
	public String newPlanGenerated()
	{
		return planGenerated.getText();
	}

	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public Boolean checkDietPlansTab() {
		return dietPlansTab.isDisplayed();
	}

	public int recordsPerPage() {

		int n = numOfRecords.size();
		return n;
	}

	public Boolean arrowButton() {
		return arrowButton.isEnabled();
	}

	public Boolean prevArrowButton() {
		return prevArrowButton.isEnabled();
	}
	
	public void previousClick() {
		prevArrowButton.click();;
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
	
	
	public boolean checkPdf()
	{
		for(WebElement pdf:pdfs)
		{
			if(pdf.getText().contains("View PDF"))
			{
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public Boolean checkDownload()
	{
		return download.isDisplayed();
	}
	
	public Boolean secondPage()
	{
		return pagination.isDisplayed();
	}
}
