package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TextContextSetup {
	
	public WebDriver driver;
    public String landingpageproductName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;
    
    public TextContextSetup() throws IOException{
    	testBase = new TestBase();
    	pageObjectManager = new PageObjectManager(testBase.webDriverManager());
    	genericUtils = new GenericUtils(testBase.webDriverManager());
    }
    
}
