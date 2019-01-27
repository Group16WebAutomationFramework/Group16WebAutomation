package testXlSheetReader;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;
public class TestxlsheetReader extends CommonAPI {
    ExcelReader2 excelReaderPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelReader2();
        reports = ExtentManager.getInstance();
        setURL("https://www.uhc.com/");
    }
    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        //excelReaderPage.searchFromExcel();
        //excelReaderPage.navigateBack();
    }
    private class ExcelReader2 {
    }
}
