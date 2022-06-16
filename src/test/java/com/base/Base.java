package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	private WebDriver driver;
	private FileInputStream FIS;
	private Properties prop;
	private String browserProp;
	private String url;
	private String browserCmd;
	private String browser;
	private FirefoxOptions ffOptions;
	private ChromeOptions chromeOptions;
	private EdgeOptions edgeOptions;
	
	public WebDriver getWebDriver()
	{
		
		
		if(driver==null)
		{
			chooseBrowserType();
			launchBrowser();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
			
			
		}
		
		return driver;
		
	}
	
	private void chooseBrowserType()
	{
		try {
			FIS = new FileInputStream("./src/test/resources/properties/environment.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		prop = new Properties();
		
		try {
			prop.load(FIS);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		browserProp = prop.getProperty("browser");
		url = prop.getProperty("url");
		browserCmd = System.getProperty("browser");
		browser = (browserCmd != null)? browserCmd : browserProp;
		System.out.println(url);
	}
	
	private void launchBrowser() {
		if(browser.equalsIgnoreCase("chrome"))
		{
			setChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions); 
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			setEdgeOptions();
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(edgeOptions);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			setGeckoOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(ffOptions);
		}
		else
		{
			System.out.println("browser not installed");
		}
	}
	
	private void setGeckoOptions()
	{
		ffOptions = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/doc,application/ms-doc,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("pdfjs.disabled",true);
		profile.setPreference("browser.download.dir","./src/test/resources/downloads");
		profile.setPreference("browser.download.folderList", 2);
		ffOptions.setProfile(profile);
	}
	
	private void setChromeOptions()
	{
		chromeOptions = new ChromeOptions();
		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "./src/test/resources/downloads");
		chromeOptions.setExperimentalOption("prefs", prefs);
	}
	
	private void setEdgeOptions()
	{
		edgeOptions = new EdgeOptions();
		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "./src/test/resources/downloads");
		edgeOptions.setExperimentalOption("prefs", prefs);
	}

}
