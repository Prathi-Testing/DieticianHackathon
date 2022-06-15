package com.base;

import com.util.ExcelReader;
import com.util.GenericClass;
import com.util.PdfReader;

public class TestContext {
	
	public Base base;
	public PageObjectManager pageObjectManager;
	public GenericClass gUtil;
	public ExcelReader reader;
	public PdfReader pdfReader;
//	public String expectedNewPatientTitle = "New Patient";
	public String expectedDieticianHomePageTitle = "Dietician Home";
	public String expectedMyPatientTitle = "My Patient";
	public String expectedDietPlansTitle = "Diet Plans";
//	public String expectedHomePageTitle = "Dietician software";
	public String url;
	
	public String expectedTestReportPageTitle = "Patient Test Reports";
	public String statMessage = "10 Items found, displaying 1 to 10";

	public TestContext()
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.getWebDriver());
		gUtil = new GenericClass(base.getWebDriver());
		reader = new ExcelReader();
		pdfReader = new PdfReader();
	}

}
