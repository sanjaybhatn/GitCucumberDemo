package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.CheckoutPage;
import pageObject.offerPage;
import utils.TestContaintSetup;

public class CheckoutPageSteps {
	CheckoutPage checkoutpage;
	TestContaintSetup testcontextsetup;

	public CheckoutPageSteps(TestContaintSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		this.checkoutpage = testcontextsetup.pageObjectManager.getcheckoutPage();

	}

	@Then("^Add \"([^\"]*)\" item to cart$")
	public void add_something_item_to_cart(String count) throws Throwable {

		checkoutpage.additemtocart(Integer.parseInt(count));
	}

	@Then("^go to checkout page and validate (.+) is added to cart$")
	public void go_to_checkout_page_and_validate_is_added_to_cart(String prod) throws Throwable {
		checkoutpage.clickoncartbutton();
		testcontextsetup.Cart_page_product_name = checkoutpage.getProductName().split("-")[0].trim();

		System.out.println(testcontextsetup.Home_Page_ProductName);
	}

	@Then("^Validate user has ability to enter promo code and place the order$")
	public void validate_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {
		Assert.assertTrue(checkoutpage.validatepromoapplubtn());
		Assert.assertTrue(checkoutpage.verifyplaceorder());
	}

	@Then("^Verify item is added to cart$")
	public void verify_item_is_added_to_cart() throws Throwable {
		Assert.assertEquals(testcontextsetup.Home_Page_ProductName, testcontextsetup.Cart_page_product_name);
	}

}
