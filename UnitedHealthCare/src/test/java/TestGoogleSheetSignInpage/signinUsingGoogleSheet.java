package TestGoogleSheetSignInpage;
import googlesheets.googslesheetSignin;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
public class signinUsingGoogleSheet extends googslesheetSignin {
    googslesheetSignin signInPage;
    MainPage welcome;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInPage= PageFactory.initElements(driver, googslesheetSignin.class);
        welcome = PageFactory.initElements(driver, MainPage.class);
        setURL("https://www.myuhc.com/member/prewelcome.do?currentLanguageFromPreCheck=en");
    }
    @Test
    public void testsignIn() throws IOException, InterruptedException {
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String spreadsheetId = "1h-FtsfIBgUhA8woZUw8DuxY92KQcO_n-vxjPSuugG-s";
        String range = "Sheet1!A3:B3";
        enterUserNameAndPassword(spreadsheetId, range);
    }
}
