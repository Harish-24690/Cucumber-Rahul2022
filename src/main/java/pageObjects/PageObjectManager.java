package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public HomepagePageObjects homepagePageObjects;
	public TopDealsPageObjects topDealsPageObjects;
	public CheckoutPageObjects checkoutPageObjects;
	private WebDriver driver;

	public PageObjectManager(WebDriver driver){
		
		this.driver = driver;
	}
	public HomepagePageObjects getHomePageObjects() {

		homepagePageObjects = new HomepagePageObjects(driver);
		return homepagePageObjects;
	}

	public TopDealsPageObjects getTopDealsObjects() {

		topDealsPageObjects = new TopDealsPageObjects(driver);
		return topDealsPageObjects;
	}

	public CheckoutPageObjects getCheckoutPageObjects(){
		checkoutPageObjects= new CheckoutPageObjects(driver);
		return checkoutPageObjects;
	}
}
