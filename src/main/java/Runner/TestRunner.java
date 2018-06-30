package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\Users\\moses\\eclipse-workspace-july2017\\CucumberPractice\\src\\main\\java\\Feature\\myFeature.feature",
		glue = {"stefDef"}
//		format = {"pretty", "html:test-output"}
)
public class TestRunner {

}
