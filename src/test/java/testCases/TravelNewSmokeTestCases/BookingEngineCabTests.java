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

@Epic("Cab Booking Engine Page Tests")
@Feature("Travel")
public class BookingEngineCabTests extends TestBotBase{
	
	
	@Test(priority = 1, description = "Verify duty type selection based on service type")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify duty type selection based on service type")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC001_verifyDutytypeSelectionBasedOnServicetype() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyDutyTypeBasedOnServiceType()
		 .logout();
	}
	

	@Test(priority = 2, description = "Verify Domestic cab extra field")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify Domestic cab extra field")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC002_verifyDomesticCabExtraField() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCabDomesticExtraField()
		 .logout();
	}
	
	@Test(priority = 3, description = "Verify new cab addition")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify new cab addition")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC003_verifyNewCabAddition() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCabAddition()
		 .logout();
	}
	

	@Test(priority = 4, description = "Verify  cab deletion")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify  cab deletion")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC004_verifyCabDeletion() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCabDeletion()
		 .logout();
	}
	

	@Test(priority = 5, description = "Verify maximum number of cab addition")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify maximum number of cab addition")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC005_verifyMaximumNumberOfCabAddition() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyMaxCabAddtion()
		 .logout();
	}
	

	@Test(priority = 6, description = "Verify from and to city switch")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify from and to city switch")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC006_verifyFromToCitySwitch() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyFromAndToCitySwap()
		 .logout();
	}
	

	@Test(priority = 7, description = "Verify cab submission without mandatory fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify cab submission without mandatory fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC007_verifyCabSubmissionWithoutMandatoryFiedls() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
	     .verifyCabSubmissionWithoutMandatoryFields()
		 .logout();
	}
	

	@Test(priority = 8, description = "Verify cab submission with mandatory fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify cab submission with mandatory fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC008_verifyCabSubmissionWithMandatoryFields() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCabSubmissionWithMandatoryFields()
		 .logout();
	}
	
	
	@Test(priority = 9, description = "Verify pick up and to drop location can't same")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify pick up and to drop location can't same")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC009_verifyFromAndToCityCanNotBeSame() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyPickupandDropLocationCanNotBeSame()
		 .logout();
	}
	
	
	@Test(priority = 10, description = "Verify cab recent search card creation")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify cab recent search card creation")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC010_verifyCabRecentSearchCardCreation() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCABRecentSearchCardCreation()
		 .logout();
	}
	@Test(priority = 11, description = "Verify cab search using recent search card ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify cab search using recent search card ")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC011_verifyCabSearchUsingRecentSearchCard() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCabSearchUsingRecentSearch()
		 .logout();
	}

}