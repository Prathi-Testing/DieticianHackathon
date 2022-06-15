package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePlanPage {
	
	
	public WebDriver driver;
	@FindBy(xpath= "//span[@class = 'action']")
    private  WebElement browse;
	@FindBy(xpath = "//*[@class='soc-ico show-round']/a[4]")
	private WebElement toolTip;
	
	@FindBy (id = "fileUpload")
	private WebElement file;
	
	@FindBy(xpath = "//span[contains(text(),'upload')]")
	private WebElement upload;
	
	@FindBy(xpath = "//span[@class = 'error-message']")
	private WebElement errormessage;
	
	@FindBy(id = "option-1")
	private WebElement option1;
	
	@FindBy(id = "option-2")
	private WebElement option2;
	
	@FindBy(xpath = "//div[@class = 'confirm']/div1")
	private WebElement confirm1;
	
	@FindBy(xpath = "//div[@class = 'confirm']/div1")
	private WebElement confirm2;
	
	@FindBy(xpath = "//div[@class = 'health-confirmation']")
	private List<WebElement> condition;
	
	@FindBy(id = "button-generate-menu")
	private WebElement generateMenu;
		
	public CreatePlanPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}

  public String title()
  {
	  return driver.getTitle();
	 
  }
  public Boolean checkBrowseButton()
  {
	  return browse.isDisplayed();
  }
  public String getToolTipMessage()
  {
	  toolTip.getAttribute("Title");
	  
	  return getToolTipMessage();
  }
  public void fileUpload(String filePath) throws InterruptedException
  
  {
	  Actions actions = new Actions(driver);
	  Thread.sleep(3000);
	  actions.moveToElement(browse).click().perform();
	  try {
		Runtime.getRuntime().exec("filepath");
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
	  public String getfileName()
	  {
		file.getText();
		  
		 return getfileName();
	  }
	  
	  public Boolean upload()
	  {
		  return upload.isDisplayed();
	  }
	  
	  public void clickUpload()
	  {
		  upload.click();
	  }
	  
	  public String checkErrorMessage()
	  {
		  errormessage.getText();
		  return checkErrorMessage();
	  }
	  
	  public Boolean optionDisplayed()
	  {
		  return option1.isDisplayed();
	  }
	  
	  public Boolean option2Displayed()
	  {
		  return option2.isDisplayed();
	  }
	  
	  public Boolean checkConfirm1()
	  {
		  return confirm1.isDisplayed();
	  }
	  public Boolean checkConfirm2()
	  {
		  return confirm2.isDisplayed();
	  }
	  public void clickConfirm1()
	  {
		  confirm1.click();
	  }
	  
	  public Boolean disabledCondition()
	  {
		  for (WebElement conditions : condition){
			    if (conditions.isEnabled())
			    {
			        return disabledCondition();
			    }
			    else
			    {
			    	return true;
			    }
	  }
		return disabledCondition();
	  }
	  
	  public void clickConfirm2()
	  {
		  confirm2.click();
	  }
	  public Boolean checkGenerateMenu()
	  
	  {
		  return generateMenu.isDisplayed();
	  }
	  public void clickGenerateMenu()
	  {
		  generateMenu.click();
		  
	  }

	 
}
   
  
  


