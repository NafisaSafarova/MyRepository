package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)   
@CucumberOptions(
		features = "./src/test/resources/features/", 
        tags = "@PositiveLogin", 
//      tags = "@InvalidPassword", 
//      tags = "@PasswordMismatch", 
//      tags = "@StrongPassword", 
//      tags = "@WeakPassword", 
        glue = "stepdefinitions", 
        plugin = {"html:target/cucumber-reports", "json:target/cucumber.json" }, 
        dryRun = false
        )

public class Runner {

}
