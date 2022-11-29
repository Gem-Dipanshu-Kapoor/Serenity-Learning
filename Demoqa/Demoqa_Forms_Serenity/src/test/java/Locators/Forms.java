package Locators;

import org.openqa.selenium.By;

public class Forms {
    public static By homepage_forms=By.xpath("//h5[text()='Forms']");
    public static By forms_leftmenu=By.xpath("//div[@class='header-text' and text()='Forms']");
    public static By forms_practice=By.xpath("//ul/li/span[text()='Practice Form']");
    public static By forms_submit=By.xpath("//button[@id='submit']");
    public static By address=By.xpath("//textarea");
    public static By upload=By.xpath("//input[@type='file']");
    public static By hobbies=By.xpath("//label[@for='hobbies-checkbox-1']");
    public static By ph=By.xpath("//input[@id='userNumber']");
    public static String gender="//label[@for='gender-radio-";
    public static By email=By.xpath("//input[@id='userEmail']");
    public static By fname=By.xpath("//input[@id='firstName']");
    public static By lname=By.xpath("//input[@id='lastName']");
    public static By subjects=By.xpath("(//div[contains(@class,'subjects-auto-complete')])[2]");
    public static By subjectsselect=By.xpath("//div[@id='react-select-2-option-0']");
    public static By dob=By.xpath("//input[@id='dateOfBirthInput']");
    public static By dob_month=By.xpath("//select[@class='react-datepicker__month-select']");
    public static By dob_year=By.xpath("//select[@class='react-datepicker__year-select']");
    public static By dob_date=By.xpath("//div[@class='react-datepicker__day react-datepicker__day--008']");
    public static String url="https://demoqa.com/";
    public static String uploadpath="C:/Users/di.kapoor/IdeaProjects/Demoqa_Automation_Forms/src/main/properties/url.properties";
}
