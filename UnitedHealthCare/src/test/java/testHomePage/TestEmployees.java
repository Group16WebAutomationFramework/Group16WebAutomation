package testHomePage;
import homePage.Employees;
import homePage.MainPage;
import homePage.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestEmployees extends Employees {
    Employees employees;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        employees = PageFactory.initElements(driver, Employees.class);
    }
    @Test
    public void testFindInsurancePlanForEmployeers() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        employees.findInsurancePlanForEmployeers();
  }

}