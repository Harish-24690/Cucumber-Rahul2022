package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopDealsPageObjects {
	
	
	private WebDriver driver;

	public TopDealsPageObjects(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	//By.cssSelector("input[type='search']")
	@FindBy(css="input[type='search']")
	private WebElement searchBox;
	
	
	
	//driver.findElement(By.cssSelector("tr td:nth-child(1)")
	@FindBy(css="tr td:nth-child(1)")
	private WebElement topDealsItems;
	
	public void serachItem(String shortName){
		
		searchBox.sendKeys(shortName);
	}
	
	public String getItemsList(){
		
		return topDealsItems.getText();
	}

}
