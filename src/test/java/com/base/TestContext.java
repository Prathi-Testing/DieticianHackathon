package com.base;

public class TestContext {
	
	public Base base;
	public PageObjectManager pageObjectManager;
	
	public TestContext()
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.getWebDriver());
	}

}
