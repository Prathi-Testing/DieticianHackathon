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

	public TestContext()
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.getWebDriver());
		gUtil = new GenericClass(base.getWebDriver());
		reader = new ExcelReader();
		pdfReader = new PdfReader();
	}

}
