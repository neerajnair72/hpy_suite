package testCases.TravelNewSmokeTestCases;

import org.testng.annotations.Test;

import frameworkBase.TestBotBase;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.TravelNew.LoginPageTravelNew;

@Epic("Bus Booking Engine Page Tests")
@Feature("Travel")
public class BookingEngineBusTests extends TestBotBase{
	@Test(priority = 1, description = "Verify Domestic bus extra field")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify Domestic bus extra field")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC001_verifyDomesticBusExtraField() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyDomesticBusExtraField()
		 .logout();
	}
	

	@Test(priority = 2, description = "Verify From & To City Swap")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify From & To City Swap")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC002_verifyFromToCitySwap() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyBusFromAndToCitySwap()
		 .logout();
	}

	@Test(priority = 3, description = "Verify From & To City Can't be same")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify From & To City Can't be same")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC003_verifyBusFromAndToCityCanNotBeSame() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyBusFromAndToCityCanNotBeSame()
		 .logout();
	}
	
	@Test(priority = 4, description = "Verify Bus submission with mandatory fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Bus submission with mandatory fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC004_verifyBusSubmissionWithManadatoryFields() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyBusSubmissionWithManadatoryFields()
		 .logout();
	}
	
	
	@Test(priority = 5, description = "Verify Bus submission with out mandatory fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Bus submission without mandatory fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC005_verifyBusSubmissionWithOUTManadatoryFields() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyBusSubmissionWithoutMandatoryFields()
		 .logout();
	}
	@Test(priority = 6, description = "Verify Bus recent search card creation")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify Bus recent search card creation")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC006_verifyBusRecentSearchCardCreation() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyBusRecentSearchCardCreation()
		 .logout();
	}
	@Test(priority = 7, description = "Verify Bus search using recent search card ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify Bus search using recent search card")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC007_verifyBusSearchUsingRecentSearchCardCreation() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		.verifyBusSearchUsingRecentSearch()
		 .logout();
	}
	
	@Test(priority = 8, description = "Verify Bus From Preferred Time Validation")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify Bus From Preferred Time Validation")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC008_verifyBusFromPreferredTime() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		  .verifyBusPreferredFromTimeValidation()
		 .logout();
	}
	
	@Test(priority = 9, description = "Verify Bus To Preferred Time Validation")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify Bus To Preferred Time Validation")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC009_verifyBusToPreferredTime() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyBusPreferredToTimeValidation()
		 .logout();
	}


}
