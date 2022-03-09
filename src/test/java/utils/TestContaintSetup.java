package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContaintSetup {
	public WebDriver driver;
	public String Home_Page_ProductName = null;
	public String Details_Page_ProductName = null;
	public String Cart_page_product_name=null;
	public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;
    
	public TestContaintSetup() throws IOException {
		testBase=new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		genericUtils=new GenericUtils(testBase.webDriverManager());
	}
}
