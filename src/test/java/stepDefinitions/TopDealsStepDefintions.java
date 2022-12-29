package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import pageObjects.HomepagePageObjects;
import pageObjects.TopDealsPageObjects;
import utilities.TextContextSetup;

public class TopDealsStepDefintions {
	
	        String topdealsproductName;
	private TextContextSetup testContextSetup;

      public TopDealsStepDefintions(TextContextSetup testContextSetup){
		this.testContextSetup = testContextSetup;
		
	}
	
	@And("^User navigates to topdeals page and enter the item with shortname (.+)$")
    public void user_navigates_to_topdeals_page_and_enter_the_item_with_shortname_something(String shortName) throws Throwable {
		
		HomepagePageObjects homepagePageObjects=testContextSetup.pageObjectManager.homepagePageObjects;
		homepagePageObjects.gotoTopDeals();
		testContextSetup.genericUtils.switchToChildWindow();
        
        TopDealsPageObjects topDealsPageObjects =testContextSetup.pageObjectManager.getTopDealsObjects();
        topDealsPageObjects.serachItem(shortName);
        Thread.sleep(3000);
        topdealsproductName =topDealsPageObjects.getItemsList();
        
        
    }

    

    @And("^verify both item displayed in homepage and topdeals are same$")
    public void verify_both_item_displayed_in_homepage_and_topdeals_are_same() throws Throwable {
       Assert.assertEquals(testContextSetup.landingpageproductName, topdealsproductName);
    }


}
