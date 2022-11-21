package Stepdefinition;

import Steps.step;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class stepdefinition {
    @Steps
    step stepp;
    @Managed(driver = "chrome")
    WebDriver browser;

    @Given("Open browser and navigate to google")
    public void func()
    {
        stepp.launch();
    }
}
