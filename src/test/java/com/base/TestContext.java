package com.base;

public class TestContext {
	
	public Base base;
	public PageObjectManager pageObjectManager;
	public String expectedNewPatientTitle = "New Patient";
	public String expectedDieticianHomePageTitle = "Dietician Home";
	public String expectedMyPatientTitle = "My Patient";
	public String expectedDietPlansTitle = "Diet Plans";
	

	public TestContext()
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.getWebDriver());
	}

}
