package UI;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test extends PageObject {
    public void openbrowser()
    {
        getDriver().get("https://google.com");
        WebElement mail=$(By.xpath("//a[text()=\"Gmail\"]"));
        System.out.println(mail.getText());
    }
}
