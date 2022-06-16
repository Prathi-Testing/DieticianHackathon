package com.pages;

import java.util.List;
import org.apache.commons.validator.GenericValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPatientPage {

	WebDriver driver;
	
	private Boolean flag;
	
	@FindBy(xpath = "//span[contains(text(),'My Patients')]") 
	private WebElement tabMyPatient;
	
	@FindBy(id="breadCrumbs")
	private WebElement breadCrumbs;
	
	@FindBy(id="title")
	private WebElement title;
	
	@FindBy(xpath = "//input[@id='name']") 
	private WebElement nameFilter;
	
	@FindBy(xpath = "//input[@id='email']") 
	private WebElement emailFilter;
	
	@FindBy(xpath = "//input[@id='phoneNumber']") 
	private WebElement phoneNumberFilter;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]") 
	private WebElement searchButton;
	
	@FindBy(xpath="//table")
	private List<WebElement> tableData;
	
	@FindBy(xpath="//table/tbody/tr/td[0]")
	private List<WebElement> recordNum;
	
	@FindBy(xpath = "//div[@id='result-stat']") 
	private WebElement resultStat;
	
	@FindBy(xpath="//table/tbody/tr/td[1]")
	private List<WebElement> custID;
	
	@FindBy(xpath="//table/tbody/tr/td[2]")
	private List<WebElement> nameColummFields;
	
	@FindBy(xpath="//table/tbody/tr/td[3]/li[0]")
	private List<WebElement> detailsEmailColumnField;
	
	@FindBy(xpath="//table/tbody/tr/td[3]/li[1]")
	private List<WebElement> detailsPhoneColumnField;
	
	@FindBy(xpath="//table/tbody/tr/td[3]/li[2]")
	private List<WebElement> detailsCity;
	
	@FindBy(xpath="//table/tbody/tr/td[5]/li[0]")
	private List<WebElement> lastVisitDate;
	
	@FindBy(xpath="//table/tbody/tr/td[5]/li[1]")
	private List<WebElement> duration;
	
	@FindBy(xpath="//table/tbody/tr/td[5]")
	private List<WebElement> Actions;
	
	@FindBy(id="pagination")
	private WebElement paginationLinkNext;
	
	@FindBy(id="paginationPrev")
	private WebElement paginationLinkPrev;

	@FindBy(xpath = "//button[contains(text(),'View Previous Test Reports')]") 
	private WebElement vwPreviousReportButton;
	
	@FindBy(xpath = "//button[contains(text(),'View Previous Diet Plan')]")
	private WebElement vwPreviousDietPlan;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Report/Plan')]") 
	private WebElement createNwReportPlan;
	
	@FindBy(xpath="//table/tbody/tr/th")
	private List<WebElement> headers;
	
	@FindBy(id="error message")
	private WebElement error;
	
	public MyPatientPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyPatientTab()
	{
		return tabMyPatient.isSelected();
	}
	
	public boolean validateTitleLine()
	{
		return title.getText().contains("My Patients");
	}
	
	public boolean validateSearchBtnText()
	{
		return searchButton.getText().contains("Search");
	}
	
	public boolean validatePrimaryInfo()
	{
		if(nameFilter.isDisplayed() &&
				emailFilter.isDisplayed() &&
				phoneNumberFilter.isDisplayed() &&
				searchButton.isDisplayed())
		{
			return true;
		}
		else return false;
	}
	
	public boolean validateEmptyField()
	{
		if(nameFilter.getText() == null &&
				emailFilter.getText() == null &&
				phoneNumberFilter.getText() == null )
		{
			return true;
		}
		else return false;
	}
	
	public String getName() {
		return nameColummFields.get(0).getText();
	}
	
	public String getCustID() {
		return nameColummFields.get(0).getText();
	}
	
	public String getPhone() {
		return detailsPhoneColumnField.get(0).getText();
	}
	
	public String getEmail() {
		return detailsEmailColumnField.get(0).getText();
	}
	
	public String getCity() {
		return detailsCity.get(0).getText();
	}
	
	public String getVisitDate() {
		return lastVisitDate.get(0).getText();
	}
	
	public boolean validatePlaceholderText()
	{
		if((nameFilter.getAttribute("placeholder")==null)
			|| (emailFilter.getAttribute("placeholder")==null) 
			|| (phoneNumberFilter.getAttribute("placeholder")==null))
		{
			return true;
		}
		else return false;
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
	
	// Field level Validation
	
	public Boolean validateTable()
	{	
		flag = true;
			if(!tableData.isEmpty()){
				flag = false;	
			}
		return flag;	
	}
	
	public Boolean validateNameData()
	{	
		flag = true;
		for(WebElement nameField : nameColummFields) {
		
			if(nameFilter.getText() != nameField.getText()){
				flag = false;	
			}
		}
		return flag;	
	}
	
	public Boolean validateEmailData()
	{	
		flag = true;
		for(WebElement emailField : detailsEmailColumnField) {
		
			if(emailFilter.getText() != emailField.getText()){
				flag = false;	
			}
		}
		return flag;	
	}
	
	public Boolean validatePhoneData()
	{	
		flag = true;
		for(WebElement phoneField : detailsPhoneColumnField) {
		
			if(emailFilter.getText() != phoneField.getText()){
				flag = false;	
			}
		}
		return flag;	
	}
	
	public Boolean validateCustIdData()
	{	
		flag = true;
		for(WebElement CustIdField : custID) {
			String CustIdFieldval = CustIdField.getText();
			if(CustIdFieldval.substring(0) != "C") {
				flag = false;	
			}
		}
		return flag;	
	}
	
	
// Buttons in table
	public boolean validateButtonPresence() {
		if(vwPreviousReportButton.isDisplayed() && createNwReportPlan.isDisplayed() && createNwReportPlan.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean validateReportButton()
	{
		
		if(vwPreviousReportButton.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean validateCreateReportButton()
	{
		if(createNwReportPlan.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean validateDietPlanButton()
	{
		if(vwPreviousDietPlan.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
// Click on the Button	
	public String clickReportButton()
	{
		vwPreviousReportButton.click();
		return driver.getCurrentUrl();
	}
	
	public String clickCreateReportButton()
	{
		createNwReportPlan.click();
		return driver.getCurrentUrl();
	}
	
	public String clickDietPlanButton()
	{
		vwPreviousDietPlan.click();
		return driver.getCurrentUrl();
	}
	
// Pagination	
	public boolean verifyPaginationLink()
	{
		if(paginationLinkNext.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean verifyPrevPaginationLink()
	{
		if(paginationLinkPrev.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String paginationLinkClick() {
		paginationLinkNext.click();
		return driver.getCurrentUrl();
	}
	
	public String validatePaginationLinkClick() {
		return resultStat.getText();
	}
	
	public String prevPaginationLinkClick() {
		paginationLinkPrev.click();
		return driver.getCurrentUrl();
	}
	
	public Boolean newPatientData()
	{	
		flag = true;
		for(WebElement visitDate : lastVisitDate) {
		
			if(!(visitDate.getText() == "Never" && vwPreviousReportButton.isDisplayed() == false && vwPreviousDietPlan.isDisplayed() == false)){
				flag = false;
			}
		}
		return flag;	
	}
	
	
	public boolean recordCount(Integer maxRecord)
	{
		if(recordNum.size() > maxRecord)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	
// Data Format validation	
	public boolean checkDateFormat()
	{
		for(WebElement visitDate:lastVisitDate)
		{
			flag = GenericValidator.isDate(visitDate.getText(), "MMM dd, yyyy", true);
			if (flag==false)
			{
				break;
			}
		}
		return flag;
	}
	
	public boolean checkEmailFormat()
	{
		for(WebElement detailsEmail:detailsEmailColumnField)
		{
			flag = true;
			if (!GenericValidator.isEmail(detailsEmail.getText()))
			{
				flag = false;
			}
		}
	return flag;
	}
	
// Tab Link and Bread crumbs	
	public void getMyPatientLink() {
		
		tabMyPatient.click();
		
	}
	
	public boolean validateBreadCrumbs()
	{
		return breadCrumbs.getText().contains("Dietician Software/My Patients");
	}
	
// Validating Column headers 
	public boolean validateHeader()
	{
		if(headers.get(0).getText().contains("Record Number") &&
			headers.get(1).getText().contains("Cust ID") &&
			headers.get(2).getText().contains("Name") &&
			headers.get(3).getText().contains("Details") &&
			headers.get(4).getText().contains("Last Visit") &&
			headers.get(5).getText().contains("Actions"))
				return true;
			else
				return false;
		}
	
// Error Message	
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
