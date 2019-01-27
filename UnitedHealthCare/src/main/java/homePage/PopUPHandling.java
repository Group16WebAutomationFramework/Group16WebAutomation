package homePage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class PopUPHandling extends CommonAPI {
    @FindBy(xpath = "//input[@name='zipCode']")
    public static WebElement popUpHandler;
    public void popUpHandler () {
        TestLogger.log(Search.class.getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        popUpHandler.sendKeys("11372");
    }
}
