package Steps;

import UI.DemoqaForms;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import java.awt.*;

public class Forms_Step extends PageObject {
    DemoqaForms demoqaForms;

    @Step("Launch URL")
    public void launch()
    {
        demoqaForms.setup();
    }
    @Step("Navigate to Forms")
    public void forms()
    {

        demoqaForms.navigate();
    }
    @Step("Fill in data")
    public void form(String name1, String name2, String mail, String ph,String gen) throws AWTException {
        demoqaForms.form(name1,name2,mail,ph,gen);
    }
}
