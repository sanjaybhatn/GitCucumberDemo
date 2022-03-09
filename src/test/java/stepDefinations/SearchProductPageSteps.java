package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SearchPage;
import utils.TestContaintSetup;

public class SearchProductPageSteps {

	TestContaintSetup testcontextsetup;
	SearchPage searchpage;

	public SearchProductPageSteps(TestContaintSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		this.searchpage = testcontextsetup.pageObjectManager.getsearchPage();

	}

	@Given("User is on GreenCart landing Page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(searchpage.getPageTitle().contains("GreenKart"));

	}

	@When("^User searched with (.+) in Home page and extracted actual name of the product$")
	public void user_searched_with_in_home_page_and_extracted_actual_name_of_the_product(String Product)
			throws Exception {

		searchpage.searchItem(Product);

		testcontextsetup.Home_Page_ProductName = searchpage.getProductName().split("-")[0].trim();

		System.out.println(testcontextsetup.Home_Page_ProductName);
	}

}
