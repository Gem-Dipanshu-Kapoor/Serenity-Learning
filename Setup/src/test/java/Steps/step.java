package Steps;

import UI.test;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class step extends PageObject {
    test testStep;
    @Step("^Open Browser$")
    public void launch(){
        testStep.openbrowser();
    }
}
