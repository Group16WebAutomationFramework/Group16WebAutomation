package testHomePage;

import homePage.MainPage;
import homePage.PopUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPopUp extends PopUp {

    PopUp popup;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())); //implemented by Nasir
        popup = PageFactory.initElements(driver, PopUp.class);
        setURL("https://online.citi.com/US/banking/citi.action?ID=banking-overview");
    }
    @Test
    public void testpopup(){
        TestLogger.log(getClass().getSimpleName()+": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popup.checkDropDownss();
    }


}
