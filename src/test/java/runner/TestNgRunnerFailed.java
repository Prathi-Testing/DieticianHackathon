package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target//failedScenarios.txt",
		glue="stepDefinitions",
		monochrome =true,
		plugin= {"html:target/Cucumber.html",
				"json:target/Cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} )

public class TestNgRunnerFailed extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
    public Object[][] scenarios() {
        
        return super.scenarios();
    }

}
