package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public SearchPage searchpage;
	public offerPage offerpage;
	public CheckoutPage checkoutpage;
	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public SearchPage getsearchPage() {
		searchpage = new SearchPage(driver);
		return searchpage;
	}

	public offerPage getofferPage() {
		offerpage = new offerPage(driver);
		return offerpage;
	}

	public CheckoutPage getcheckoutPage() {
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}

}
