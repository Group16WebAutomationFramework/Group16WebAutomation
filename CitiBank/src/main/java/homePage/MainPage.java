package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

//***********The following webelement and methods are for demo **************
public class MainPage extends BaseUtil {
    @FindBy(xpath ="//*[@id='citiBrandingNav']" )
    public static WebElement searchCitiLogo;
    @FindBy(xpath = "//a[text()='ATM / Branch']")
    public static WebElement searchAtmBranch;
    @FindBy (xpath = "//a[text()='Open an Account']")
    public static WebElement searchOpenAccount;
    @FindBy (xpath = "//a[text()='Español']")
    public static WebElement searchEspanol;
    @FindBy(xpath ="//a[text()='Banking']" )
    public static WebElement searchBanking;
    @FindBy (xpath = "//a[@href='https://www.citi.com/credit-cards/citi.action']")
    public static WebElement searchCreditCards;
    @FindBy(xpath = "//*[@id='creditCards']")
    public static WebElement searchLending;
    @FindBy(xpath ="//a[text()='Investing']")
    public static WebElement searchInvesting;
    @FindBy(xpath ="//*[@id='citiGold']")
    public static WebElement searchCitigold;
   // @FindBy(xpath = "//*[@class='hero-xs-background']")
   // public static WebElement searchHeroBackground;
//    @FindBy(xpath ="//a[@href='https://banking.citi.com/cbol/18/Q4/split/nt/default.htm?channel=onsite&intc=1~1~52~6~BANR~2~Q119Save_PROS~XPX']")
//    public static WebElement searchLearnMoreSavingAccount;

    public void checkSearchCitiLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCitiLogo.click();
    }
    public void checkSearchAtmBranch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchAtmBranch.click();
    }
    public void checkSearchOpenAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchOpenAccount.click();
    }
    public void checkSearchEspanol() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchEspanol.click();
    }
    public void checkSearchBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBanking.click();
    }
    public void checkSearchCreditcards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCreditCards.click();
    }
    public void checkSearchLending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchLending.click();
    }
    public void checkSearchInvesting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchInvesting.click();
    }
    public void checkSearchCitigolg(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCitigold.click();
    }
//    public void checkSearchHeroBackground(){
//        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchHeroBackground.click();
//    }
//    public void checkSearchLearnMoreSavingAccount(){
//        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchLearnMoreSavingAccount.click();
//    }
}