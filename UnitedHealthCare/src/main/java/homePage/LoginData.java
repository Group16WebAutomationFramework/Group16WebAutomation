package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LoginData extends CommonAPI {
    @FindBy(css = "input[id=hsid-username]")
    public static WebElement enterUserName;
    @FindBy(xpath = "//input[@id='hsid-password']")
    public static WebElement enterPassWord;
    @FindBy(xpath = "//span[text()='Sign in']")
    public static WebElement signInButton;

    public void enterUserNameandPassword() {
        TestLogger.log(Search.class.getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterUserName.sendKeys("sheikhrhmn");
        enterPassWord.sendKeys("owiteitoewiot");
        signInButton.click();
    }
}