package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import pageObjects.HomepagePageObjects;
import pageObjects.PageObjectManager;
import utilities.TextContextSetup;

public class HomepageStepDefintions {
	
	String landingpageproductName;
	PageObjectManager pageObjectManager;
	public  TextContextSetup testContextSetup;
	public HomepagePageObjects homepagePageObjects;
	
	public HomepageStepDefintions(TextContextSetup testContextSetup){
		this.testContextSetup = testContextSetup;
		this.homepagePageObjects=testContextSetup.pageObjectManager.getHomePageObjects();
		
	}
	
	@Given("^User is on the Homepage$")
    public void user_is_on_the_homepage() throws Throwable {
		
		
		}
	
	@When("^User search for item with shortname (.+) and verify the item displayed.$")
    public void user_search_for_item_with_shortname_something_and_verify_the_item_displayed(String shortName) throws Throwable {
		
	    
	    
		homepagePageObjects.searchBox(shortName);
		Thread.sleep(3000);
		testContextSetup.landingpageproductName =homepagePageObjects.getItemDisplayed().split("-")[0].trim();
		
		
		
    }
	
	@And("^User increase the count of the item to \"([^\"]*)\"$")
    public void user_increase_the_count_of_the_item_to_something(String quantity) throws Throwable {
		
		homepagePageObjects.increasetheCount(Integer.parseInt(quantity));
		Thread.sleep(4000);
		homepagePageObjects.clickOnAddtoCart();
		homepagePageObjects.gotoCheckout();
    }

    
}
