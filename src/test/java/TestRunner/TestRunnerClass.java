package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Featurefile"
		,glue= {"StepDefinition","hooks"},
				dryRun = false,
				monochrome = true,
				tags= {},// you can specify the tags according to your choice of execution here
				plugin = { "pretty" , "junit:target/report.xml" , "html:target/cucumber-pretty" , "json:target/jsonreport.json"}
	
		)



public class TestRunnerClass {

}
