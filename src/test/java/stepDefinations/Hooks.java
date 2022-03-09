package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContaintSetup;

public class Hooks {
	TestContaintSetup testcontextsetup;

	public Hooks(TestContaintSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@After
	public void AfterScenario() throws IOException {
		testcontextsetup.testBase.webDriverManager().quit();
	}

	@AfterStep
	public void Addscreenshots(Scenario scenario) throws IOException {
		WebDriver driver = testcontextsetup.testBase.webDriverManager();
		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(filecontent, "image/png", "image");
		}

	}

}
