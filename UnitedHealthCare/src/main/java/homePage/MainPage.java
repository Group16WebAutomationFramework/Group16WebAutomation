package homePage;
import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class MainPage extends CommonAPI {
    @FindBy(css = ".uhc-logo-container_link")
    public static WebElement logo;
   @FindBy(xpath = " //label[@class='btn-search lbl'] ")
   public static WebElement searchKey;
   @FindBy(xpath = " //input[@class='search-button']")
   public static WebElement searchButton;
   @FindBy(xpath = " //a[text()='Español']")
   public static WebElement searchTxtEspanol;
   @FindBy(xpath = " //button[@id='loginmenubutton']")
   public static WebElement btnAlreadyMember;
   @FindBy(xpath = " //a[text()='Home']")
   public static WebElement checkHome;//pass
   @FindBy(xpath = " //a[text()='Individuals & Families']")
   public static WebElement searchIndividualFamilies;//pass
   @FindBy(xpath = " //a[text()='Employers']")
   public static WebElement searchEmployers;//pass
   @FindBy(xpath = " //a[text()='Medicare'] ")
   public static WebElement medicareHpmePage;//pass
   @FindBy(xpath = " //a[text()='Find a Doctor ']")
   public static WebElement searchFindDoctor;//pass
   @FindBy(xpath = " //span[text()='Sign in to myuhc.com']")//need help to create better xpath
   public static WebElement searchSignNyuhc;//pass
   @FindBy(xpath = " //span[text()='Find Plans']")//need help to create better xpath
   public static WebElement searchFindPlan;//psss
   @FindBy(xpath = " //span[text()='Learn More']")//need help to create better xpath
   public static WebElement searchLearnMore;//pass
   @FindBy(xpath = " //b[text()='Insurance Plans and Products']")
   public static WebElement searchTxtPlan;//pass
   @FindBy(xpath = " //a[text()='individuals']")
   public static WebElement searchIndividualsLink;//pass
   @FindBy(xpath = " //a[text()='employers']")
   public static WebElement searchLinkEmployeeers;//psss
   @FindBy(xpath = " //h3[text()='Medicare Plans']")
   public static WebElement searchMedicarePlan;//pass
   @FindBy(xpath = " //img[@style='margin-bottom: 2em;']")// need to create bette xpath
   public static WebElement searchPartABCD;//pass
   @FindBy(xpath = " //a[@aria-label='Learn more on our Medicare page']")//need to create better xpath
   public static WebElement searchLearnMoreMedicare;//pass
   @FindBy(xpath = "//img[@src='/content/dam/uhcdotcom/en/Common/Images/Small-Business-90.jpg']")//need to discus about this xpath
   public static WebElement searchSmallBusinessLogo;//pass
   @FindBy(xpath = "//h3[text()='Small Business Plans']")
   public static WebElement txtSmallBusinessPlan;//pass
   @FindBy(xpath = "//a[@aria-label='Health Insurance for Small Business']")// need to discus better xptah
   public static WebElement searchLearnMoreSmallBusiness;//pass
   @FindBy(xpath = "//h3[text()='Individual & Family Plans']")
   public static WebElement individualFamilyPlan;//pass
   @FindBy(xpath = "//a[@aria-label='Learn More on Individual and Families']")// not a good xpath
   public static WebElement learnMoreIndividualFamilyPlan;//pass
   @FindBy(xpath = "//a[@aria-label='View plans on UHOne.com (opens in a new window)']")
   public static WebElement getLearnMoreIndividualFamilyPlan;//pass
   @FindBy(xpath = "//*[@id=\"plans-and-prods\"]/div/div[3]/div/div/div[1]/div/div/div/div/div/div[2]/p[2]/a[2]") //need to work on xpath
   public static WebElement viewIndividualFamilyPlan;//pass
   @FindBy(xpath = "//*[@id=\"plans-and-prods\"]/div/div[3]/div/div/div[2]/div/div/div/div/div/div[1]/img")
   public static WebElement checkDentalImage;//pass
    @FindBy(xpath = "//img[@src='/content/dam/uhcdotcom/en/Common/Images/Dental-Insurance-90.jpg']")
    public static WebElement dentalImage;//pass
   @FindBy(xpath = "//h3[text()='Dental Plans']")
   public static WebElement textDentalPlan;//pass
   @FindBy(xpath = "//a[@aria-label='Learn More about Dental Plans']")// not right xpath
   public static WebElement learnAboutDentalPlan;//pass
   @FindBy(xpath = "//a[@aria-label='View Dental plans on UHOne.com (opens in a new window)']")
   public static WebElement viewDentalPlan;//pass
   @FindBy(xpath = "//a[text()='Short Term Health Insurance']")
   public static WebElement shortTermHealthInsurace;//pass
   @FindBy(xpath = "//a[@aria-label='Learn More on Short-Term Health Insurance']")
   public static WebElement learnShortTermHealthInsurance;//pass
   @FindBy(xpath = "//a[@aria-label='View Short-Term Health Insurance Plans on UHOne.com (opens in a new window)']")
   public static WebElement viewShortTermHelathInsrurce;//pass
   @FindBy(xpath = "//h3[text()='Medicaid Plans']")
   public static WebElement txtMedicaidPlan;//pass
   @FindBy(xpath = "//a[@aria-label='Learn more about Medicaid (opens in a new window)']")
   public static WebElement learnAboutMedicaidPlan;//pass
   @FindBy(xpath = "//h2[text()=' Additional Insurance Plans and Products']")
   public static WebElement additionalInsurancePlan;//pass
   @FindBy(xpath = "//a[text()='Hospital and Doctor Insurance']")
   public static WebElement txtHospitalDoctorInsurance;//Pass
   @FindBy(xpath = "//a[@href='/individual-and-family/insurance-plans/critical-illness']")
   public static WebElement criticalIllnessInsurance;//pass
   @FindBy(xpath = "//a[text()='Supplemental Insurance']")
   public static WebElement supplementalInsurance;//pass
   @FindBy(xpath = "//a[text()='Vision Insurance']")
   public static WebElement visionInsurance;//pass
   @FindBy(xpath = "//a[text()='Accident Insurance']")
   public static WebElement accidentInsurance;//pass
   @FindBy(xpath = "//a[@href='https://www.uhcglobal.com/']")
   public static WebElement globalInsurance;//pass
   @FindBy(xpath = "//a[text()='Term Life Insurance']")
   public static WebElement termLifeInsurance;// pass
   @FindBy(xpath = "//a[text()='Hospitalization Insurance']")
   public static WebElement hospitilazationInsurance;//pass
   @FindBy(xpath = "//a[text()='Global Travel Insurance']")
   public static WebElement globalTravelInurance;//pass
   @FindBy(xpath = "//a[text()='View Broker Resources']")
   public static WebElement viewBrokerResources;//pass
   @FindBy(xpath = "//h2[text()='Flu Vaccine Information']")
   public static WebElement flueVaccineInformation;//pass
   @FindBy(xpath = "//a[@aria-label='Find a nearby clinic for flu shots']")
   public static WebElement findNearByClinid;//pass
   @FindBy(xpath = "//h2[text()=' Popular Links']")
   public static WebElement searchPopularLink;//pass
   @FindBy(xpath = "//h3[text()='Products']")
   public static WebElement searchProducts;//pass
   @FindBy(xpath = "//a[text()='Marketplace Insurance Plans']")
   public static WebElement searchMarketPlaceInsurance;//pass
   @FindBy(xpath = "//a[@href='https://www.aarpmedicareplans.com/?WT.mc_id=880332']")
   public static WebElement medicareUnderPopularLink;//pass
   @FindBy(xpath = "//a[@href='/individual-and-family/health-insurance-plans/medicare-medicaid/what-is-medicaid']")
   public static WebElement medicaidUnderPopularLink;//pass
   @FindBy(xpath = "//a[text()='Employer Group Plans']")
   public static WebElement employerGroupPlan;//pass
   @FindBy(xpath = "//a[text()='Dental Insurance']")
   public static WebElement dentalInsurance;//pass
   @FindBy(xpath = "//div[@class='rte-content ']//a[text()='Vision Insurance']")// practice it more
   public static WebElement visonInsurance;//pass
   @FindBy(xpath = "//a[text()='Short Term Health Insurance']")
   public static WebElement shortTremHealthInurance;//pass
   @FindBy(xpath = "//h3[text()='Healthy Living']")
   public static WebElement healthyLeaving;//pass
   @FindBy(xpath = "//a[text()='Fitness']")
   public static WebElement fitnessUnderHelthyLiving;//pass
   @FindBy(xpath = "//a[text()='Nutrition']")
   public static WebElement searchNutrition;//pass
   @FindBy(xpath = "//a[text()='Health Topics']")
   public static WebElement healthTopics;//pass
   @FindBy(xpath = "//a[text()='Take Control of Your Care']")
   public static WebElement takeControlyYourCare;//pass
   @FindBy(xpath = "//a[text()='Health and Wellness']")
   public static WebElement healthAndWellness;//pass
   @FindBy(xpath = "//a[text()='Programs & Tools']")
   public static WebElement programAndTools;//pass
   @FindBy(xpath = "//h3[text()='Featured Links']")
   public static WebElement txtFeaturedLinks;//pass
   @FindBy(xpath = "//a[text()='Open Enrollment']")
   public static WebElement openEnrollments;//pass
   @FindBy(xpath = "//a[text()='Member Resources']")
   public static WebElement memberResources;//pass
   @FindBy(xpath = "//a[text()='About Us']")
   public static WebElement searchAboutUs;//pass
   @FindBy(xpath = "//a[text()='United For Reform']")
   public static WebElement unitedForReform;//pass
   @FindBy(xpath = "//a[text()='Value-Based Care']")
   public static WebElement valueBasedCare;//pass
   @FindBy(xpath = "//a[text()='View Drug List']")
   public static WebElement viewDrugList;//pass
   @FindBy(xpath = "//a[text()='Download Health4Me App']")
   public static WebElement downloadHealth4MeApp;//pass
   @FindBy(xpath = "//a[text()='Broker Resources']")
   public static WebElement brokerResources;//pass
   @FindBy(xpath = "//h3[text()='Member Services']")
   public static WebElement memberServices;//pass
   @FindBy(xpath = "//a[text()='Language Assistance/ Nondiscrimination Notice']")
   public static WebElement languageAssistantNotice;//pass
   @FindBy(xpath = "//a[text()='Asistencia de Idiomas / Aviso de no Discriminación']")
   public static WebElement txtAsistanceDeIdiomas;//pass
   @FindBy(xpath = "//a[text()='Find a Doctor']")
   public static WebElement findAdoctor;//pass
   @FindBy(xpath = "//a[text()='View Claim/Account']")
   public static WebElement viewClaimAccounts;//pass
   @FindBy(xpath = "//a[text()='Check Benefits']")
   public static WebElement checkBenefits;//pass
  @FindBy(xpath = "//a[@href='https://newsroom.uhc.com']")
  public static WebElement newsRoomUhc;
  @FindBy(xpath = "//a[@title='Contact Us']")
  public static WebElement contactUs;//passed
  @FindBy(xpath = "//a[@title='Careers']")
  public static WebElement careersUhc;
  @FindBy(xpath = "//iframe[@id='artEXPOiFrame' and @name='CustomerFeedbackSurvey']") //we can also add text and id/class/name together
  public static WebElement howWasYourVisit;
    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }

    public void checkMedicarr() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        medicareHpmePage.click();
    }
    public void checkSearchKey() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchKey.click();
    }
       public void checksearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
          searchButton.click();
    }
       public void checksearchTxtEspanol() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
          searchTxtEspanol.click();
    }
       public void checkBtnAlreadyMember() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        btnAlreadyMember.click();
    }
       public void checkHomeBtn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
          checkHome.click();
    }
        public void checkIndividualsFamilies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchIndividualFamilies.click();
    }
        public void checkSearchEmployers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchEmployers.click();
    }
    public void checkSearchFindDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchFindDoctor.click();
    }
        public void checkSearchSignNyuhc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchSignNyuhc.click();
    }
        public void checkSearchFindPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchFindPlan.click();
    }
        public void checkSearchLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchLearnMore.click();
    }
        public void checkSearchTxtPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchTxtPlan.click();
    }
        public void checkSearchIndividualsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchIndividualsLink.click();
    }
        public void checkSearchLinkEmployeeers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchLinkEmployeeers.click();
    }
        public void checkSearchMedicarePlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchMedicarePlan.click();
   }
        public void checkSearchPartABCD() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchPartABCD.click();
    }
        public void checkSearchLearnMoreMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchLearnMoreMedicare.click();
    }
        public void checkSearchSmallBusinessLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchSmallBusinessLogo.click();
    }
        public void checkTxtSmallBusinessPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            txtSmallBusinessPlan.click();
    }
        public void checkSearchLearnMoreSmallBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchLearnMoreSmallBusiness.click();
    }
        public void checkIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            individualFamilyPlan.click();
    }
        public void checkLearnMoreIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            learnMoreIndividualFamilyPlan.click();
    }
        public void checkGetLearnMoreIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            getLearnMoreIndividualFamilyPlan.click();
    }
        public void checkViewIndividualFamilyPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            viewIndividualFamilyPlan.click();
    }
        public void checkCheckDentalImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            checkDentalImage.click();
    }
        public void checkDentalImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            dentalImage.click();
    }
        public void checkTextDentalPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            textDentalPlan.click();
    }
        public void checkLearnAboutDentalPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            learnAboutDentalPlan.click();
    }
        public void checkViewDentalPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            viewDentalPlan.click();
    }
        public void checkShortTermHealthInsurace() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            shortTermHealthInsurace.click();
    }
      public void checkLearnShortTermHealthInsurance() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
       }.getClass().getEnclosingMethod().getName()));
          learnShortTermHealthInsurance.click();
    }
        public void checkViewShortTermHelathInsrurce() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            viewShortTermHelathInsrurce.click();
    }
        public void checkTxtMedicaidPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            txtMedicaidPlan.click();
    }
        public void checkLearnAboutMedicaidPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            learnAboutMedicaidPlan.click();
    }
        public void checkAdditionalInsurancePlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            additionalInsurancePlan.click();
    }
        public void checkTxtHospitalDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            txtHospitalDoctorInsurance.click();
    }
        public void checkCriticalIllnessInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            criticalIllnessInsurance.click();
    }
        public void checkSupplementalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            supplementalInsurance.click();
    }
        public void checkVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            visionInsurance.click();
    }
        public void checkAccidentInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            accidentInsurance.click();
    }
        public void checkGglobalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            globalInsurance.click();
    }
        public void checkTermLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            termLifeInsurance.click();
    }
    public void checkHospitilazationInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hospitilazationInsurance.click();
    }
        public void checkGlobalTravelInurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            globalTravelInurance.click();
    }
        public void checkViewBrokerResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            viewBrokerResources.click();
    }
        public void checkFlueVaccineInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            flueVaccineInformation.click();
    }
        public void checkFindNearByClinid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            findNearByClinid.click();
    }
        public void checkSearchPopularLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchPopularLink.click();
    }
        public void checkSearchProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchProducts.click();
    }
        public void checkSearchMarketPlaceInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchMarketPlaceInsurance.click();
    }
        public void checkMedicareUnderPopularLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            medicareUnderPopularLink.click();
    }

    public void checkMedicaidUnderPopularLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        medicaidUnderPopularLink.click();
    }
        public void checkEmployerGroupPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            employerGroupPlan.click();
    }
        public void checkDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            dentalInsurance.click();
    }
        public void checkVisonInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            visonInsurance.click();
    }
        public void checkShortTremHealthInurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            shortTremHealthInurance.click();
    }
        public void checkHealthyLeaving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            healthyLeaving.click();
    }
       public void checkFitnessUnderHelthyLiving() {
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
      }.getClass().getEnclosingMethod().getName()));
           fitnessUnderHelthyLiving.click();
  }
        public void checkSearchNutrition() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchNutrition.click();
    }
        public void checkHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            healthTopics.click();
    }
        public void checkTakeControlyYourCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            takeControlyYourCare.click();
    }
        public void checkHealthAndWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            healthAndWellness.click();
    }
       public void checkProgramAndTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
       }.getClass().getEnclosingMethod().getName()));
           programAndTools.click();
  }
        public void checTxtFeaturedLinks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            txtFeaturedLinks.click();
    }
        public void checkOpenEnrollments() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            openEnrollments.click();
    }
        public void checkMemberResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            memberResources.click();
    }
        public void checkSearchAboutUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            searchAboutUs.click();
    }
        public void checkUnitedForReform() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            unitedForReform.click();
    }
        public void checkValueBasedCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            valueBasedCare.click();
    }
        public void checkViewDrugList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            viewDrugList.click();
    }
        public void checkDownloadHealth4MeApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            downloadHealth4MeApp.click();
    }
        public void checkBrokerResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            brokerResources.click();
    }
        public void checkMemberServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            memberServices.click();
    }
        public void checkLanguageAssistantNotice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            languageAssistantNotice.click();
    }
        public void checkTxtAsistanceDeIdiomas() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            txtAsistanceDeIdiomas.click();
    }
        public void checkFindAdoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            findAdoctor.click();
    }
        public void checkViewClaimAccounts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            viewClaimAccounts.click();
    }
        public void checkCheckBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            checkBenefits.click();
    }
        public void checkNewsRoomUhc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            newsRoomUhc.click();
    }
        public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            contactUs.click();
    }
        public void checkCareersUhc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            careersUhc.click();
    }
        public void checkHowWasYourVisit() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            howWasYourVisit.click();
    }


}