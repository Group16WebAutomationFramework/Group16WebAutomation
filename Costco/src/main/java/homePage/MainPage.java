package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(id = "warehouse-savings")
    public static WebElement ViewWarehouseSavings;
    @FindBy(id = " warehouse-locations-dropdown")
    public static WebElement FindAWarehouse;
    @FindBy(id = "email-signup-dropdown")
    public static WebElement GetEmailOffers;
    @FindBy(id = "customer-service-link")
    public static WebElement CustomerService;
    @FindBy(id = "navigation-dropdown")
    public static WebElement ShopAllDepartments;
    @FindBy(id = "Home_Ancillary_0")
    public static WebElement Grocery;
    @FindBy(id = "Home_Ancillary_1")
    public static WebElement BusinessDelivery;
    @FindBy(id = "Home_Ancillary_2")
    public static WebElement Optical;
    @FindBy(id = "Home_Ancillary_3")
    public static WebElement Pharmacy;
    @FindBy(id = "Home_Ancillary_4")
    public static WebElement Services;
    @FindBy(id = "Home_Ancillary_5")
    public static WebElement Photo;
    @FindBy(id = "Home_Ancillary_6")
    public static WebElement Travel;
    @FindBy(id = "Home_Ancillary_7")
    public static WebElement Membership;
    @FindBy(id = "Costco US homepage")
    public static WebElement CostcoWholesale;
    @FindBy(id = "header_sign_in")
    public static WebElement Signin;
    @FindBy(id = "cart-d")
    public static WebElement Cart;
    @FindBy(id = "WC_CategoriesSidebarDisplayf_links_3_1")
    public static WebElement Electronics;
    @FindBy(id = "search-field")
    public static WebElement Search;


    public void checkViewWarehouseSavings() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewWarehouseSavings.click();
    }
    public void checkFindAWarehouse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FindAWarehouse.click();
    }
    public void checkGetEmailOffers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        GetEmailOffers.click();
    }
    public void checkCustomerService() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CustomerService.click();
    }
    public void checkShopAllDepartments() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopAllDepartments.click();
    }
    public void checkGrocery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Grocery.click();
    }
    public void checkBusinessDelivery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BusinessDelivery.click();
    }
    public void checkOptical() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Optical.click();
    }
    public void checkPharmacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Pharmacy.click();
    }
    public void checkServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Services.click();
    }
    public void checkPhoto() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Photo.click();
    }
    public void checkTravel() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Travel.click();
    }
    public void checkMembership() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Membership.click();
    }
    public void checkCostcoWholesale() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CostcoWholesale.click();
    }
    public void checkSignin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Signin.click();
    }
    public void checkCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Cart.click();
    }
    public void checkElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Electronics.click();
    }
    public void checkSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.click();
    }
}






