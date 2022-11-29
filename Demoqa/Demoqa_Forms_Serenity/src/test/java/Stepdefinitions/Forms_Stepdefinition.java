package Stepdefinitions;

import UI.DemoqaForms;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import Steps.Forms_Step;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Forms_Stepdefinition {

    @Steps
    Forms_Step forms_step;
    @Steps
    DemoqaForms demoqaForms;
    @Managed(driver = "chrome")
    WebDriver browser;

    @Given("^launch demoqa.com$")
    public void launch()
    {
        forms_step.launch();
    }
    @Then("^User navigates to forms page$")
    public void navigate()
    {
        forms_step.forms();
    }
    @Then("^User fills in data eg \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
    public void form(String name1, String name2, String mail, String ph,String gen) throws AWTException {
        forms_step.form(name1,name2,mail,ph,gen);
    }

}
