package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import pageObjects.CheckoutPageObjects;
import utilities.TextContextSetup;

public class CheckOutStepDefinitions {
	
	private TextContextSetup testContextSetup;
	CheckoutPageObjects checkoutPageObjects;

	public CheckOutStepDefinitions(TextContextSetup testContextSetup){
		this.testContextSetup = testContextSetup;
	}

	@And("^User navigates to checkout page and verifies if the Apply button is displayed$")
	public void user_navigates_to_checkout_page_and_verifies_if_the_apply_button_is_displayed() throws Throwable {
        
		checkoutPageObjects=testContextSetup.pageObjectManager.getCheckoutPageObjects();
		checkoutPageObjects.clickOnCheckout();
		Assert.assertTrue(checkoutPageObjects.verifyApplyButton());
	}

	@And("^User verifies the checkout button is displayed$")
	public void user_verifies_the_checkout_button_is_displayed() throws Throwable {
		Assert.assertTrue(checkoutPageObjects.verifyPlaceOrder());

	}

	@And("^User verify the (.+) added to cart is matched$")
	public void user_verify_the_added_to_cart_is_matched(String itemname) throws Throwable {
		Assert.assertEquals(checkoutPageObjects.getProductName(), testContextSetup.landingpageproductName);

	}

}
