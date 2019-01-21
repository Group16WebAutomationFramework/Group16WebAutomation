package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class individualAndFamilies extends CommonAPI {
    @FindBy(xpath = "//a[text()='Individuals & Families' and @href=\"/individual-and-family\"]")
    public static WebElement searchIndividualAndFamilies;
    @FindBy(xpath = "//span[@class='button-primary-common button-digital-blue span-focus' and text()='View Plans']")
    public static WebElement searchViewPlan;
    @FindBy(xpath = "//input[@name='zipCode' and @placeholder='ZIP Code']")
    public static WebElement enterZipCode;
    @FindBy(xpath = "//button[@class='btn btn-primary' and text()='OK']")
    public static WebElement clickOnPopUpBtn;
    @FindBy(xpath = "//button[@class='btn btn-warning-zip btn-lg' and text()='Compare Plans']")
    public static WebElement searchComparePlans;
    @FindBy(xpath = "//input[@class='zip ng-pristine ng-invalid ng-touched']")
    public static WebElement enterFiveDigitZipCode;
    @FindBy(xpath = "//div[@class='ef-date']")
    public static WebElement enterDateOfBirth;
    @FindBy(xpath = "//button[@class='btn btn-info' and text()='Add Spouse']")
    public static  WebElement addSpouse;
}
