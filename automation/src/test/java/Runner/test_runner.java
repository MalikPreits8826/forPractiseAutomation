package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue={"StepDefination", "helper"}, tags="@login"
,plugin="html:target/testreport/report.html")
public class test_runner {

}


