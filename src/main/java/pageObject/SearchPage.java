package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.jodah.failsafe.internal.util.Assert;

public class SearchPage {
	public WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By search_box = By.xpath("//input[@type='search']");
	By product_name = By.xpath("//h4[@class='product-name']");
	By logo_home = By.xpath("//span[contains(@class,'redLogo')]");

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void searchItem(String name) throws Exception {

		driver.findElement(search_box).sendKeys(name);
		Thread.sleep(2000);
	}

	public String getProductName() {
		return driver.findElement(product_name).getText();
	}

	public void Homepageisvisible() {
		if (driver.findElement(logo_home).isDisplayed()) {
			System.out.println("we are in the home page now");

		}

	}
}
