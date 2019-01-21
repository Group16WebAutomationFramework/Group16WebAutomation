package testHomePage;

import homePage.LoginData;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLoginData extends LoginData {
    LoginData logindata;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        logindata = PageFactory.initElements(driver, LoginData.class);
        setURL("https://www.myuhc.com/member/prewelcome.do");
    }
    @Test
    public void testEnterUserNameandPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logindata.enterUserNameandPassword();
    }

}
