package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.Super;

@CucumberOptions(
		features = "src/test/java/features",
        glue = "stepDefinations",
        tags = "@CheckoutPage or @Searchtest",
		monochrome = true,
		plugin = { "pretty", "html:target/cucumber.html",
				"json:target/cucumber.json", "junit:target/cukes.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
      public Object[][] scenarios() {
		return super.scenarios();
    	  
      }
}
