package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class PopUp extends BaseUtil {
    @FindBy(xpath = "//select[@id='stateSelectorSelectId' and @class='form-control']")
    public static WebElement dropDown;
    @FindBy(xpath = "//option[text()='NY']")
    public static WebElement selectState;
    @FindBy(xpath = "//button[@class='btn btn-primary select-btn__e-2']")
    public static WebElement selectButton;

    public void checkDropDownss() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dropDown.click();
        selectState.click();
        selectButton.click();
    }
}
