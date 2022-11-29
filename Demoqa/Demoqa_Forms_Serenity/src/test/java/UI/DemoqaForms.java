package UI;

import Locators.Forms;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DemoqaForms extends PageObject {
    public void setup()
    {
       getDriver().get(Forms.url);
        getDriver().manage().window().maximize();
    }
    public void navigate()
    {
        $(Forms.homepage_forms).click();
        //  $(Forms.forms_leftmenu).click();
        boolean loading=$(Forms.forms_practice).isDisplayed();
        if(loading)
            System.out.println("Successfully navigated to forms page");
        else
            System.out.println("Failed to navigate to forms page");
    }

    public void form(String name1, String name2, String mail, String ph,String gen) throws AWTException {
        $(Forms.forms_practice).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        typeInto($(Forms.fname),name1);
        typeInto($(Forms.lname),name2);
       $(Forms.email).sendKeys(mail);
       $(Forms.ph).sendKeys(ph);
        String gender=Forms.gender+gen+"']";
        $(By.xpath(gender)).click();
        $(Forms.dob).click();
        Select month=new Select($(Forms.dob_month));
        Select year=new Select($(Forms.dob_year));
        month.selectByIndex(4);
        year.selectByValue("2018");
        $(Forms.dob_date).click();
        $(Forms.subjects).click();
        Actions action=new Actions(getDriver());
        action.sendKeys("Maths").build().perform();
        action.click($(Forms.subjectsselect)).build().perform();
        $(Forms.hobbies).click();
        $(Forms.upload).sendKeys(Forms.uploadpath);
        $(Forms.address).sendKeys("_22abccc12");
        $(Forms.forms_submit).click();
    }
}
