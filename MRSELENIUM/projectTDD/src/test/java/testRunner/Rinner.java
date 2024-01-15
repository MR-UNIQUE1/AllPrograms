package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features=".//Feature/login.feature",
	glue = {"stepDefination","myHooks"},
	dryRun = false,
	monochrome = true,
	plugin = {"pretty", "html:target/customerReport/Reports3.html"}
)


public class Rinner {
	
}
