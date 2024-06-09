package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/Users/anusr/eclipse-workspace/Telus/src/test/resources/Testing/Login .feature",
    glue = "stepDefinition", // Package containing your step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}, // Reporting plugins
    monochrome = true // Makes console output more readable
)
public class Run {

}
