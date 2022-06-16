package com.pages;

import java.util.List;

import org.apache.commons.validator.GenericValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestReportPage {
	
	WebDriver driver;
	
	private String pdfLink;
	
	private boolean flag;
	
	@FindBy(id="Patient Tab")
	private WebElement patientTab;
	
	@FindBy(id="breadCrumbs")
	private WebElement breadCrumbs;
	
	@FindBy(id="Patient Id")
	private WebElement patientId;
	
	@FindBy(id="Patient Name")
	private WebElement patientName;
	
	@FindBy(id="Patient Email")
	private WebElement patientEmail;
	
	@FindBy(id="Patient Phone")
	private WebElement patientPh;
	
	@FindBy(id="Patient state")
	private WebElement patientState;
	
	@FindBy(id="title")
	private WebElement title;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[3]/a")
	private WebElement latestPdf;
	
	@FindBy(xpath="//table/tbody/tr/td[3]")
	private List<WebElement> pdfs;
	
	@FindBy(xpath="//table/tbody/tr/td[2]")
	private List<WebElement> docIds;
	
	@FindBy(xpath="//table/tbody/tr/td[4]/li[1]")
	private List<WebElement> loggedDurations;
	
	@FindBy(xpath="//table/tbody/tr/td[4]/li[2]")
	private List<WebElement> loggedAge;
	
	@FindBy(xpath="//table/tbody/tr/td[5]")
	private List<WebElement> reportNames;

	@FindBy(xpath="//table/tbody/tr/td[6]")
	private List<WebElement> identifiedCondns;
	
	@FindBy(xpath="//table/tbody/tr/th")
	private List<WebElement> headers;
	
	@FindBy(id="Next Link")
	private WebElement nextLink;
	
	@FindBy(id="Previous Link")
	private WebElement previousLink;
	
	public TestReportPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkPatientTab()
	{
		return patientTab.isSelected();
	}
	
	public boolean validateBreadCrumbs()
	{
		return breadCrumbs.getText().contains("Dietician Software/View Recent Test Reports");
	}
	
	public boolean validatePrimaryInfo()
	{
		if(patientState.isDisplayed() &&
				patientEmail.isDisplayed() &&
				patientId.isDisplayed() &&
				patientName.isDisplayed() &&
				patientPh.isDisplayed())
		{
			return true;
		}
		else return false;
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkNextLink()
	{
		return nextLink.isDisplayed();
	}
	
	public boolean checkPreviousLink()
	{
		return previousLink.isDisplayed();
	}
	
	public boolean validateTitleLine()
	{
		return title.getText().contains("View Patient Test reports");
	}
	
	public int testReportCount()
	{
		int count = reportNames.size();
		while(nextLink.isEnabled())
				{
					nextLink.click();
					count = count + reportNames.size();
				}
		return count;
	}
	
	public boolean validateHeader()
	{
		if(headers.get(0).getText().contains("Record") &&
		headers.get(1).getText().contains("Doc") &&
		headers.get(2).getText().contains("FILE") &&
		headers.get(3).getText().contains("Upload Time") &&
		headers.get(4).getText().contains("Report Name") &&
		headers.get(5).getText().contains("Identified Health"))
			return true;
		else
			return false;
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
	
	public boolean checkDocId()
	{
		for(WebElement docId:docIds)
		{
			if(docId.getText().contains("DOC"))
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
	
	public boolean checkreportName()
	{
		for(WebElement reportName:reportNames)
		{
			if(reportName == null)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public boolean checkIdentifiedCondns()
	{
		for(WebElement identifiedCondn:identifiedCondns)
		{
			if(identifiedCondn == null)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public boolean checkTime()
	{
		for(WebElement loggedDuration:loggedDurations)
		{
			if(loggedDuration == null)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public boolean checkTimeFormat()
	{
		for(WebElement loggedDuration:loggedDurations)
		{
			flag = GenericValidator.isDate(loggedDuration.getText(), "MMM dd, yyyy hh:mm:ss", true);
			if (flag==false)
			{
				break;
			}
		}
		
		return flag;
	}
	
	public boolean checkLoggedAge()
	{
		for (WebElement age : loggedAge)
		{
			if(age.getText().contains("seconds") || 
					age.getText().contains("min") ||
					age.getText().contains("hours") ||
					age.getText().contains("months") ||
					age.getText().contains("years"))
					{
						flag = true;
					}else
					{
						flag = false;
						break;
					}
		}
		return flag;
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
