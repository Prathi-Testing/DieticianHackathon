package com.base;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	private WebDriver driver;
	//private Page1 page1; 
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	public Page1 getPage1()
//	{
//		page1 = new Page1(driver);
//		return page1;
//	}

}
