package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.TextContextSetup;

public class Hooks {
	
	private TextContextSetup testContextSetup;

	public Hooks(TextContextSetup testContextSetup){
		this.testContextSetup = testContextSetup;
	}
	
	@After
	public void tearDown() throws IOException{
		
		testContextSetup.testBase.webDriverManager().quit();
		
	}
	@AfterStep
	public void screenShot(Scenario scenario) throws IOException{
		WebDriver driver=testContextSetup.testBase.webDriverManager();
		if(scenario.isFailed()){
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent =FileUtils.readFileToByteArray(src);
			scenario.attach(fileContent, "image/png", "image");
		}
		
	}

}
