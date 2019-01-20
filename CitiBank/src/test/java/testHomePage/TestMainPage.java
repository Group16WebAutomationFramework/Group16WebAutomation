package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

//***********The following webelement and methods are for demo **************

public class TestMainPage extends MainPage {
    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())); //implemented by Nasir
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testCheckSearchCitiLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchCitiLogo();
    }
    @Test
    public void testSearchAtmBranch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchAtmBranch();
    }

    @Test
    public void testSearchOpenAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchOpenAccount();
    }
    @Test
    public void testsSearchEspanol(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchEspanol();
    }
    @Test
    public void testSearchBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchBanking();
    }
    @Test
    public void testSearchCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchCreditcards();
    }
    @Test
    public void testSearchLendingt(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchLending();
    }
    @Test
    public void testSearchInvesting(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchInvesting();
    }
    @Test
    public void testSearchCitigold(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchCitigolg();
    }
//    @Test
//    public void testSearchHeroBackground(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        mainPage.checkSearchHeroBackground();
//    }
//    @Test
//    public void testSearchLearnMoreSavingAccount(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        mainPage.checkSearchLearnMoreSavingAccount();
//    }

}