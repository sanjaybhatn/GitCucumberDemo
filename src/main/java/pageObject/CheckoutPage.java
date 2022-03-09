package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By Add_option = By.xpath("//a[contains(@class,'increment')]");
	By add_to_cart = By.xpath("//button[@type='button'][contains(.,'ADD TO CART')]");
	By cart_icon = By.xpath("//img[@alt='Cart']");
	By proceed_to_checkout = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By Product_item = By.cssSelector("tbody tr td:nth-child(2)");
	By Enter_promo_code = By.xpath("//input[@placeholder='Enter promo code']");
	By Promo_apply_button = By.xpath("//button[@class='promoBtn']");
	By place_order = By.xpath("//button[contains(.,'Place Order')]");

	public void additemtocart(int Count) throws Exception {
		for (int i = 1; i < Count; i++) {
			driver.findElement(Add_option).click();
		}
		driver.findElement(add_to_cart).click();
		Thread.sleep(2000);

	}

	public void clickoncartbutton() throws Exception {
		driver.findElement(cart_icon).click();
		Thread.sleep(1000);
		driver.findElement(proceed_to_checkout).click();
		Thread.sleep(2000);

	}

	public String getProductName() {
		return driver.findElement(Product_item).getText();

	}

	public boolean validatepromoapplubtn() {
		return driver.findElement(Promo_apply_button).isDisplayed();

	}

	public boolean verifyplaceorder() {
		return driver.findElement(place_order).isDisplayed();

	}

}
