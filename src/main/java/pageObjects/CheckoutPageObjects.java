package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageObjects {
	
	private WebDriver driver;

	public CheckoutPageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
    private WebElement proceedToCheckoutButton;
	
	@FindBy(css="button.promoBtn")
	private WebElement applyButton;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	private WebElement placeOrderButton;
	
	@FindBy(css="p.product-name")
	private WebElement productName;
	
	
	public void clickOnCheckout(){
		
		proceedToCheckoutButton.click();
	}
	public boolean verifyApplyButton(){
		return applyButton.isDisplayed();
	}
	public boolean verifyPlaceOrder(){
		return placeOrderButton.isDisplayed();
	}
	
	public String getProductName(){
		return productName.getText().split("-")[0].trim();
	}
}


