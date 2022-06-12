package com.base;

import org.openqa.selenium.WebDriver;

import com.pages.DieticianHomePage;
import com.pages.NewPatientPage;

public class PageObjectManager {
	
	public WebDriver driver;
	private DieticianHomePage dieticianHP;
	private NewPatientPage newPatientPg;
		
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public NewPatientPage getNewPatientPg() {
		newPatientPg = new NewPatientPage(driver); 
		return newPatientPg;
	}

	public DieticianHomePage getdieticianHP()
	{
		dieticianHP = new DieticianHomePage(driver);
		return dieticianHP;
	}
	
	
}
