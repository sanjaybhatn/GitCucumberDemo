package stepDefinations;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.SearchPage;
import pageObject.offerPage;
import utils.TestContaintSetup;

public class offerPageStepdefinations {

	TestContaintSetup testcontextsetup;
	offerPage offerpage;

	public offerPageStepdefinations(TestContaintSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		this.offerpage = testcontextsetup.pageObjectManager.getofferPage();

	}
	
	@Then("user clicks top deals link")
	public void user_clicks_top_deals_link() throws Exception {
		
		offerpage.clickontoplinks();

	}

	@Then("^User searched with (.+) in top deals page and extracted actual name of the product$")
	public void user_searched_with_in_top_deals_page_and_extracted_actual_name_of_the_product(String Product)
			throws Exception {
		switchtochildwindow();
		offerpage.SearchProductName(Product);
		
		testcontextsetup.Details_Page_ProductName = offerpage.getProductName();
		System.out.println(testcontextsetup.Details_Page_ProductName);
		System.out.println(testcontextsetup.Details_Page_ProductName);
	}

	public void switchtochildwindow() throws Exception {
		testcontextsetup.genericUtils.SwitchWindowtochild();
	}

	@And("Validate both page searched product is matching")
	public void validate_both_page_searched_product_is_matching() {
		Assert.assertEquals(testcontextsetup.Home_Page_ProductName,  testcontextsetup.Details_Page_ProductName);
		
		
	}
}
