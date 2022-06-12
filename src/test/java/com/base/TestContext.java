package com.base;

import com.util.ExcelReader;
import com.util.GenericClass;

public class TestContext {
	
	public Base base;
	public PageObjectManager pageObjectManager;
	public GenericClass gUtil;
	public ExcelReader reader;
	public String expectedNewPatientTitle = "New Patient";
	public String expectedDieticianHomePageTitle = "Dietician Home";
	public String expectedMyPatientTitle = "My Patient";
	public String expectedDietPlansTitle = "Diet Plans";
	public String url;
	public String registerTitle;
	

	public TestContext()
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.getWebDriver());
		gUtil = new GenericClass(base.getWebDriver());
		reader = new ExcelReader();
	}

}
