package com.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import com.base.TestContext;

public class GenericClass {
	WebDriver driver;
	TestContext testContext;
	String parentWindow;

	public GenericClass(WebDriver driver) {

		this.driver = driver;
	
	}
	public void windowHandle() {
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);

		
	}
	
	public List<Map<String, String>> getxlData(String SheetName) {
	//*********   data from excel  **********  //
	List<Map<String, String>> data = null;
	try {
		data = testContext.reader.getData(System.getProperty("user.dir") + "src\\test\\resources\\testData\\Dietician UI Hackathon.xlsx", SheetName);
	} catch (InvalidFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	 return data;
	}
}
