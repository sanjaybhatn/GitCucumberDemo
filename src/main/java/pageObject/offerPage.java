package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerPage {
	public WebDriver driver;

	public offerPage(WebDriver driver) {
		this.driver = driver;
	}

	By Top_links = By.linkText("Top Deals");
	By Search_field_Top = By.xpath("//*[@id='search-field']");
	By Product_name = By.cssSelector("tr td:nth-child(1)");

	public void clickontoplinks() throws Exception {

		driver.findElement(Top_links).click();
		Thread.sleep(2000);
	}

	public void SearchProductName(String name) throws Exception {
		driver.findElement(Search_field_Top).sendKeys(name);
		Thread.sleep(1000);
	}

	public String getProductName() {
		return driver.findElement(Product_name).getText();

	}

}
