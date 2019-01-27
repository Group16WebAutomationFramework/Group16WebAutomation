package homePage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class insurancePlan extends CommonAPI {
    @FindBy(xpath = "//input[@id='zipCode']")
    public static WebElement zipCode;
    @FindBy (xpath = "//label[@for='primary_gender_0']")
    public static WebElement genderMale;
    @FindBy (xpath = "//input[@id='primary_birthday']")
    public static WebElement dateofBirth;
    public void chkZipCode() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        zipCode.sendKeys("11101, Keys.ENTER");
    }
    public void srcgenderMale() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        genderMale.click();
    }
    public void checkdateofDOB() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dateofBirth.click();
    }
}
