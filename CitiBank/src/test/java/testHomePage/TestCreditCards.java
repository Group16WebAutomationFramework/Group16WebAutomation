//package testHomePage;
//
//import homePage.CreditCards;
//import homePage.MainPage;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import reporting.TestLogger;
//
//public class TestCreditCards extends CreditCards {
//    CreditCards creditCards;
//    @BeforeMethod
//    public void initialize() {
//        TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName())); //implemented by Nasir
//        creditCards= PageFactory.initElements(driver, CreditCards.class);
//        setURL("https://www.citicards.com/cards/credit/application/flow.action?isInvitation=N&OC=CC-CITI-CITI");
//    }
//    @Test
//    public void testCheckSearchCitiLogo(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        creditCards.searchchkCreditCards();
//    }
//
//
//
//
//
//}