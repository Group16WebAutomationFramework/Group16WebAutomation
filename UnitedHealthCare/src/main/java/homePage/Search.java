package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Search extends CommonAPI {
    @FindBy(xpath = "//input[@id='q']")
    public static WebElement searchField;
    @FindBy(xpath = "//input[@class='search-button']")
    public static WebElement btnClick;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div[2]/div/div[2]/ul/li[2]/div[2]/h2/a")
    public static WebElement clickOnSearchResult;
    public void enterSearchField(String searchKeys){
        TestLogger.log(Search.class.getSimpleName() +":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchField.sendKeys(searchKeys, Keys.ENTER);
    }
    public void setBtnClick(){
        TestLogger.log(getClass().getSimpleName()+":" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //searchField.sendKeys(searchKeys);
        btnClick.click();
    }
//    public void srchClickOnSearchResult (){
//        TestLogger.log(Search.class.getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        clickOnSearchResult.click();
//    }
}
