package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/Features",
        glue = "Stepdefinitions",
        tags ="@run"
)
public class run {
}
