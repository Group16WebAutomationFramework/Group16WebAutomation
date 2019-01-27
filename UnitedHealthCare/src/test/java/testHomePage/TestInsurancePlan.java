package testHomePage;
import homePage.insurancePlan;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestInsurancePlan extends insurancePlan {
    insurancePlan insuranceplan;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        insuranceplan = PageFactory.initElements(driver, insurancePlan.class);
        setURL("https://www.uhone.com/shop/#/census");
    }
    @Test
    public void testzipCode () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        insuranceplan.chkZipCode();
    }
    @Test
    public void testgenderMale () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        insuranceplan.srcgenderMale();
    }
    @Test
    public void testdateofBirth () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        insuranceplan.checkdateofDOB();
    }
}
