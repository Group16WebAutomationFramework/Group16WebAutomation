package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CreditCards extends BaseUtil {
    @FindBy (xpath = "//a[@href='https://www.citi.com/credit-cards/citi.action']")
    public static WebElement searchCreditCards;

    public void checkSearchCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       searchCreditCards.click();
    }

}

