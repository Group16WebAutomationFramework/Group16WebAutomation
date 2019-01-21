package testHomePage;

import homePage.LoginData;
import homePage.PopUPHandling;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPopUp extends PopUPHandling {
    PopUPHandling pupupHandling;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        pupupHandling = PageFactory.initElements(driver, PopUPHandling.class);
        setURL("https://www.uhone.com/shop/#/census");
    }
    @Test
    public void testpopUpHandler() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pupupHandling.popUpHandler();
        Thread.sleep(3000);
        Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
}
