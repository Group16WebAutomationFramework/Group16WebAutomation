package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Employees extends CommonAPI {
    @FindBy(xpath = "//a[text()='Employers']")
    public static WebElement employers;
    @FindBy(xpath = "//span[text()='Get a Quote']")
    public static WebElement clickOnGetAQuote;
    @FindBy(xpath = "//input[@name='CONTACT_1_FIRST_NAME']")
    public static WebElement enterFirstName;
    @FindBy(xpath = "//input[@name='CONTACT_1_LAST_NAME']")
    public static WebElement enterLastName;
    @FindBy(xpath = "//input[@name='COMPANY_NAME']")
    public static WebElement enterCompanyName;
    @FindBy(xpath = "//input[@name='COMPANY_ADDRESS_LINE_1' and @id='form_element_170905']")
    public static WebElement enterCompanyAddress;
    @FindBy(xpath = "//input[@name='COMPANY_CITY']")
    public static WebElement enterCityName;
    // enter state
    @FindBy(xpath = "//input[@name='COMPANY_ZIP_5']")
    public static WebElement enterZipCode;
    @FindBy(xpath = "//input[@name='CONTACT_1_PHONE_NUMBER']")
    public static WebElement enterPhoneNumber;
    @FindBy(xpath = "//input[@name='CONTACT_1_EMAIL']")
    public static WebElement enterEmailAddress;
    @FindBy(xpath = "NUM_EMPLOYEES")
    public static WebElement enterNumberOfEmployees;
    @FindBy(xpath = "//input[@name='NUM_ELIGIBLE_EMPS']")
    public static WebElement numberOfElegableEmployees;
    @FindBy(xpath = "//input[@name='RENEWAL_DATE']")
    public static WebElement enterRenewalDate;
    @FindBy(xpath = "//input[@name='MEDICAL_INSURANCE']")
    public static WebElement checkMedical;
    @FindBy(xpath = "//input[@name='DISPOSITION_CODE']")
    public static WebElement clickOnDiscussCode;
    //
    @FindBy(xpath = "//input[@id='BROKER_UTILIZED650362']")
    public static WebElement doYouWorkWithBroker;
    @FindBy(xpath = "//input[@name='BROKER_NAME']")
    public static WebElement enterBrokerName;
    @FindBy(xpath = "//input[@name='BROKER_AGENCY_NAME']")
    public static WebElement enterBrokerAgencyName;
    @FindBy(xpath = "//textarea[@id='form_element_170901']")
    public static WebElement enterAdditionalInformation;
    @FindBy(xpath = "//input[@class='btn']")
    public static WebElement clickSubmitButton;
    public void clickOnEmployers(){
        TestLogger.log(Search.class.getSimpleName() +":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //clickOnEmployers.sendKeys(searchKeys, Keys.ENTER);
        employers.click();

    }
    public void clickOnGetAQuote(String searchKeys){
        TestLogger.log(Search.class.getSimpleName() +":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //clickOnEmployers.sendKeys(searchKeys, Keys.ENTER);
        clickOnGetAQuote.click();
    }
    public void findInsurancePlanForEmployeers(){
        TestLogger.log(Search.class.getSimpleName() +":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //searchField.sendKeys(searchKeys, Keys.ENTER);
        employers.click();
        clickOnGetAQuote.click();
        enterFirstName.sendKeys("Sheikh");
        enterLastName.sendKeys("Rahman");
        enterCompanyName.sendKeys("ABC company");
        enterCompanyAddress.sendKeys("851124 John Street");
        enterCityName.sendKeys("Jackson Heights");
        enterZipCode.sendKeys("11372");
        enterPhoneNumber.sendKeys("124563254");
        enterEmailAddress.sendKeys("johndow@gmail.com");
        enterNumberOfEmployees.sendKeys("25");
        numberOfElegableEmployees.sendKeys("20");
        enterRenewalDate.sendKeys("12");
        //checkMedical.click();
        //clickOnDiscussCode.click();
       // doYouWorkWithBroker.click();
        enterBrokerName.sendKeys("Gold Smith");
        enterBrokerAgencyName.sendKeys("ABCD");
        enterAdditionalInformation.sendKeys("He does not have antything");
        clickSubmitButton.click();
   }

}
