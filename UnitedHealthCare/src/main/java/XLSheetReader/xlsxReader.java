package XLSheetReader;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class xlsxReader extends  readFromExcel {
    public xlsxReader(String s){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='q']")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        xlsxReader excelReader = new xlsxReader("C:\\Users\\sheik\\OneDrive\\Desktop\\ReadersXlx.xlsx");
        int rowcount = excelReader.getRowCount(0);
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            searchBox.clear();
        }
    }
}
