package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

//***********The following webelement and methods are for demo **************
public class MainPage extends BaseUtil{
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
    @FindBy(xpath = "//select[@id='stateSelectorSelectId' and @class='form-control']")
    public static WebElement dropDown;
    @FindBy(xpath = "//option[text()='NY']")
    public static WebElement selectState;
    @FindBy(xpath = "//button[@class='btn btn-primary select-btn__e-2']")
    public static WebElement selectButton;


    @FindBy (xpath = "//a[@href='https://www.citi.com/credit-cards/citi.action']")
    public static WebElement searchCreditCards;
    @FindBy(xpath = "//*[@id='creditCards']")
    public static WebElement searchLending;
    @FindBy(xpath ="//a[text()='Investing']")
    public static WebElement searchInvesting;
    @FindBy(xpath ="//*[@id='citiGold']")
    public static WebElement searchCitigold;
    @FindBy(css = "input[id=usernameMasked]")           //user ID field
    public static WebElement searchInputUserId;
    @FindBy(css = "input[id=password]")                  //password field
    public static WebElement searchInputPassword;
    @FindBy(css = "input[id=rememberUid]")
    public static WebElement searchCheckBoxRemember;          //check box click
    @FindBy(css = "input[id=signInBtn]")
    public static WebElement searchSignOnButton;
    @FindBy (xpath = "//a[text()='Forgot User ID?']")
    public static WebElement searchForgetUserId;
    @FindBy(xpath = "//a[text()='Forgot Password?']")
    public static WebElement searchForgotPassword;
    @FindBy(xpath = "//a[text()='Activate a Card']")
    public static WebElement searchActivateCard;
    @FindBy(xpath = "//a[text()='Register for Online Access']")
    public static WebElement searchRegisterForOnlineAccess;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/h2/b")
    public static WebElement searchWhyCiti;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[1]/a")
    public static WebElement searchOurStory;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[2]/a")
    public static WebElement searchCareers;
    @FindBy(xpath ="//*[@id=\"whyCiti\"]/ul/li[3]/a")
    public static WebElement searchBenifitsAndServices;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[4]/a")
    public static WebElement searchrewards;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[5]/a")
    public static WebElement searchCitiEasyDeals;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[6]/a")
    public static WebElement searchCitiPrivatePass;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[7]/a")
    public static WebElement searchSpecialOffer;

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
    public void checkDropDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dropDown.click();
    }
    public void checkSelectState() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectState.click();
    }
    public void checkSelectButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectButton.click();
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
    //User ID
    public void checkSearchInputUserId(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchInputUserId.click();
    }
    //PassWord
    public void checkSearchInputPassword(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchInputPassword.click();
    }
    //Check Box Click
    public void checkSearchCheckBoxRemember(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCheckBoxRemember.click();
    }
    public void checkSearchSignOnButton(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchSignOnButton.click();
    }
    public void checkSearchForgetUserId(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchForgetUserId.click();
    }
    public void checkSearchForgotPassword(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchForgotPassword.click();
    }
    public void checkSearchActivateCard(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchActivateCard.click();
    }
    public void checkSearchRegisterForOnlineAccess(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchRegisterForOnlineAccess.click();
    }
    public void checkSearchWhyCiti(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchWhyCiti.click();
    }
    public void checkSearchOurStory(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchOurStory.click();
    }
    public void checkSearchCareers(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCareers.click();
    }
    public void checkSearchBenifitsAndServices(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBenifitsAndServices.click();
    }
    public void checkSearchrewards(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchrewards.click();
    }
    public void checkSearchCitiEasyDeals(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCitiEasyDeals.click();
    }
    public void checkSearchCitiPrivatePass(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchCitiPrivatePass.click();
    }
    public void checkSearchSpecialOffer(){
        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchSpecialOffer.click();
    }
//    public void checkSearchCitigolg(){
//        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchCitigold.click();
//    }
//    public void checkSearchCitigolg(){
//        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchCitigold.click();
//    }
//    public void checkSearchCitigolg(){
//        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchCitigold.click();
//    }
//    public void checkSearchCitigolg(){
//        TestLogger.log(getClass().getSimpleName() +": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchCitigold.click();
//    }
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