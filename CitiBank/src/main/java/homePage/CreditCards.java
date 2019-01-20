package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCards extends BaseUtil {
    @FindBy (xpath = "//*[@id='creditCards']")
    public static WebElement creditCards;

}
