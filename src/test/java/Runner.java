import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepsDefinitions"
)
public class Runner extends AbstractTestNGCucumberTests{

}
