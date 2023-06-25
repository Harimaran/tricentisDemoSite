package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/features"},
        glue = {"classpath:stepDefinitions"}
)
public class SmokeTestRunner {

}
