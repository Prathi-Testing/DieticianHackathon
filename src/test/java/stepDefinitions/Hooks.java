package stepDefinitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContext testContext;	
	
	public Hooks(TestContext testContext)
	{
		this.testContext = testContext;
	}
	
	
	@After
	public void tearDown()
	{
		testContext.base.getWebDriver().quit();
	}
	
	@AfterStep
	public void failedScreenshot(Scenario scenario)
	{
		byte[] outfile = null;
		if (scenario.isFailed())
		{
		System.out.println("scenario stat:"+scenario.isFailed());
		File SrcFile= ((TakesScreenshot)testContext.base.getWebDriver()).getScreenshotAs(OutputType.FILE);
		
		try {
			outfile = FileUtils.readFileToByteArray(SrcFile);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		scenario.attach(outfile, "image/png", "image");
		
		}


	}
}
