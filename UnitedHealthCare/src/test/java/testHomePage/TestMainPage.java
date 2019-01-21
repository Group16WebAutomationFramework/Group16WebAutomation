package testHomePage;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestMainPage extends MainPage {
    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLogo();
    }
    @Test
    public void testMedicare(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkMedicarr();
    }
    @Test
    public void testSearchKey(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchKey();
    }
        @Test
    public void testSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchKey();
    }
        @Test
    public void testSearchTextEspanol() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checksearchTxtEspanol();
    }
        @Test
    public void testBtnAlreadyMember() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkBtnAlreadyMember();
    }
        @Test
    public void testcheckHomeBtn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkHomeBtn();
    }
        @Test
    public void testSearchIndividualsFamilies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkIndividualsFamilies();
    }
        @Test
    public void testCheckSearchEmployers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchEmployers();
    }
       @Test
        public void testCheckSearchFindDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            mainPage.checkSearchFindDoctor();
    }
        @Test
    public void testCheckSearchSignNyuhc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchSignNyuhc();
    }
        @Test
    public void testCheckSearchFindPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchFindPlan();
    }
        @Test
    public void testCheckSearchLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchLearnMore();
    }
        @Test
    public void testCheckSearchTxtPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchTxtPlan();
    }
        @Test
    public void testCheckSearchIndividualsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchIndividualsLink();
    }
        @Test
    public void testCheckSearchLinkEmployeeers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchLinkEmployeeers();
    }
        @Test
    public void testCheckSearchMedicarePlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchMedicarePlan();
    }
        @Test
    public void testCheckSearchPartABCD() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchPartABCD();
    }
        @Test
    public void testCheckSearchLearnMoreMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchLearnMoreMedicare();
    }
        @Test
    public void testCheckSearchSmallBusinessLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchSmallBusinessLogo();
    }
        @Test
    public void testCheckTxtSmallBusinessPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTxtSmallBusinessPlan();
    }
        @Test
    public void testCheckSearchLearnMoreSmallBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchLearnMoreSmallBusiness();
    }
        @Test
    public void testCheckIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkIndividualFamilyPlan();
    }
        @Test
    public void testCheckLearnMoreIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLearnMoreIndividualFamilyPlan();
    }
        @Test
    public void testCheckGetLearnMoreIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkGetLearnMoreIndividualFamilyPlan();
    }
        @Test
    public void testCheckViewIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkViewIndividualFamilyPlan();
    }
        @Test
    public void testCheckCheckDentalImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCheckDentalImage();
    }
        @Test
    public void testCheckDentalImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkDentalImage();
    }
        @Test
    public void testCheckTextDentalPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTextDentalPlan();
    }
        @Test
    public void testCheckLearnAboutDentalPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLearnAboutDentalPlan();
    }
        @Test
    public void testCheckViewDentalPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkViewDentalPlan();
    }
        @Test
    public void testCheckShortTermHealthInsurace() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkShortTermHealthInsurace();
    }
        @Test
    public void testCheckLearnShortTermHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLearnShortTermHealthInsurance();
    }
        @Test
    public void testCheckViewShortTermHelathInsrurce() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkViewShortTermHelathInsrurce();
    }
        @Test
    public void testCheckTxtMedicaidPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTxtMedicaidPlan();
    }
        @Test
    public void testCheckLearnAboutMedicaidPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLearnAboutMedicaidPlan();
    }
        @Test
    public void testCheckAdditionalInsurancePlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkAdditionalInsurancePlan();
    }
        @Test
    public void testCheckTxtHospitalDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTxtHospitalDoctorInsurance();
    }
        @Test
    public void testCheckCriticalIllnessInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCriticalIllnessInsurance();
    }
        @Test
    public void testCheckSupplementalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSupplementalInsurance();
    }
        @Test
    public void testCheckVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkVisionInsurance();
    }
        @Test
    public void testCheckAccidentInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkAccidentInsurance();
    }
        @Test
    public void testCheckGlobalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkGglobalInsurance();
    }
        @Test
    public void testCheckTermLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTermLifeInsurance();
    }
        @Test
    public void testCheckHospitilazationInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkHospitilazationInsurance();
    }
        @Test
    public void testCheckGlobalTravelInurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkGlobalTravelInurance();
    }
        @Test
    public void testCheckViewBrokerResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkViewBrokerResources();
    }
        @Test
    public void testCheckFlueVaccineInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkFlueVaccineInformation();
    }
        @Test
    public void testCheckFindNearByClinid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkFindNearByClinid();
    }
        @Test
    public void testCheckSearchPopularLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchPopularLink();
    }
        @Test
    public void testCheckSearchProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchProducts();
    }
        @Test
    public void testCheckSearchMarketPlaceInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchMarketPlaceInsurance();
    }
        @Test
    public void testCheckMedicareUnderPopularLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkMedicareUnderPopularLink();
    }
        @Test
    public void testCheckMedicaidUnderPopularLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkMedicaidUnderPopularLink();
    }
        @Test
    public void testCheckEmployerGroupPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkEmployerGroupPlan();
    }
        @Test
    public void testCheckDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkDentalInsurance();
    }
        @Test
    public void testCheckVisonInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkVisonInsurance();
    }
        @Test
    public void testCheckShortTremHealthInurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkShortTremHealthInurance();
    }
        @Test
    public void testCheckHealthyLeaving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkHealthyLeaving();
    }
        @Test
    public void testCheckFitnessUnderHelthyLiving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkFitnessUnderHelthyLiving();
    }
        @Test
    public void testCheckSearchNutrition() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchNutrition();
    }

    @Test
    public void testCheckHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkHealthTopics();
    }

    @Test
    public void testCheckTakeControlyYourCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTakeControlyYourCare();
    }

    @Test
    public void testHheckHealthAndWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkHealthAndWellness();
    }

    @Test
    public void testCheckProgramAndTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkProgramAndTools();
    }

    @Test
    public void testChecTxtFeaturedLinks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checTxtFeaturedLinks();
    }

    @Test
    public void testCheckOpenEnrollments() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkOpenEnrollments();
    }
        @Test
    public void testCheckMemberResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkMemberResources();
    }
        @Test
    public void testCheckSearchAboutUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchAboutUs();
    }
        @Test
    public void testCheckUnitedForReform() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkUnitedForReform();
    }
    @Test
    public void testCheckValueBasedCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkValueBasedCare();
    }
        @Test
    public void testCheckViewDrugList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkViewDrugList();
    }
        @Test
    public void testCheckDownloadHealth4MeApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkDownloadHealth4MeApp();
    }
        @Test
    public void testCheckBrokerResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkBrokerResources();
    }
        @Test
    public void testCheckMemberServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkMemberServices();
    }
        @Test
    public void testCheckLanguageAssistantNotice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkLanguageAssistantNotice();
    }
        @Test
    public void testCheckTxtAsistanceDeIdiomas() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkTxtAsistanceDeIdiomas();
    }
        @Test
    public void testCheckFindAdoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkFindAdoctor();
    }
        @Test
    public void testCheckViewClaimAccounts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkViewClaimAccounts();
    }
        @Test
    public void testCheckCheckBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCheckBenefits();
    }
        @Test
    public void testCheckNewsRoomUhc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkNewsRoomUhc();
    }
        @Test
    public void testCheckContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkContactUs();
    }
        @Test
    public void testCheckCareersUhc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCareersUhc();
    }
        @Test
    public void testCheckHowWasYourVisit() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage.checkHowWasYourVisit();
    }
}
