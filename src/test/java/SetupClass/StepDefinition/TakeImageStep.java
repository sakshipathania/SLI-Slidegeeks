package SetupClass.StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


	public class TakeImageStep extends Set {
		@After
		public void tearDown(Scenario scenario) {
		    if (scenario.isFailed()) {	    	
		      log.info("Scenario failed, now taking screenshot");
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png");
		    }
		}
	}
