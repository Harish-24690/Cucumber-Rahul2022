package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePageObjects {
	
	private WebDriver driver;

	public HomepagePageObjects(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	//driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortName)
	@FindBy(css="input[type='search']")
	public WebElement searchTextBox;
	
	//driver.findElement(By.cssSelector("h4.product-name")
	@FindBy(css="h4.product-name")
	public WebElement itemDisplayed;
	
	@FindBy(linkText="Top Deals")
	private WebElement TopDealslink;
	
	@FindBy(css=".increment")
	private WebElement incrementValue;
	
	@FindBy(css="img[alt='Cart']")
	private WebElement checkoutButton;
	
	@FindBy(css=".product-action button")
	private WebElement addTOCartButton;
	
	public void searchBox(String shortName){
		searchTextBox.sendKeys(shortName);
	}
	
	public String getItemDisplayed(){
		return itemDisplayed.getText();
	}
	
	public void gotoTopDeals(){
		TopDealslink.click();
	}

	public void increasetheCount(int quantity){
		
		int i=quantity-1;
		while(i>0){
			incrementValue.click();
			i--;
		}
	}
	
	public void gotoCheckout(){
		
		checkoutButton.click();
	}
	public void clickOnAddtoCart(){
		addTOCartButton.click();
	}
}
