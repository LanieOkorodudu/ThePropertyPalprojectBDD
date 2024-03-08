package stepDefiition;

import org.junit.runner.RunWith;
//surefire

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/PropertyPal.feature", monochrome = true,
plugin = {"pretty", "html:target/cucumber.html"})

public class TestRunner {

}
