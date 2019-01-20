package testHomePage;

import base.CommonAPI;
import homePage.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearch extends Search {
    public String keys = "Medicare";
    Search srch;
    @BeforeMethod
    public void initialize(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        srch = PageFactory.initElements(driver,Search.class);
    }
    @Test
    public void testEnterSearchField(){
        TestLogger.log(getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterSearchField(keys);
    }
    @Test
    public void testSetBtnClick(){
        TestLogger.log((getClass().getSimpleName()+":"+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName())));
        setBtnClick();
    }
//    @Test
//    public void tesSrchClickOnSearchResult(){
//        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        srchClickOnSearchResult();
//    }
}
