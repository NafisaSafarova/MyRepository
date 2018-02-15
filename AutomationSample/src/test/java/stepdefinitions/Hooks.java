package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.Drivers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(Scenario scenario){
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) 
					Drivers.getInstance()).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
		}
		Drivers.closeDriver();
	}
}