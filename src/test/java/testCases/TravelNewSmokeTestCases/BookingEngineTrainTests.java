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

@Epic("Train Booking Engine Page Tests")
@Feature("Travel")
public class BookingEngineTrainTests extends TestBotBase{
	
	
	@Test(priority = 1, description = "Verify domestic train extra field")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify domestic train extra field")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC001_Travel_VerifyDomesticTrainExtraField() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyDomesticTrainExtraField()
		 .logout();
	}
	
	
		
		@Test(priority = 2, description = "Verify train submission without mandatory fields")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify train submission without mandatory fields")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC002_Travel_verifyTrainSubmissionWithoutMandatoryFields() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyTrainSubmissionWithoutMandatoryFields()
			 .logout();
		}
		
	
		
		@Test(priority = 3, description = "Verify preferred To Time Validation")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify preferred To Time Validation")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC003_Travel_verifyPreferredToTimeValidation() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyPreferredToTimeValidation()
			 .logout();
		}
	
		
		@Test(priority = 4, description = "Verify train submission with mandatory fields")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify train submission with mandatory fields")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC004_Travel_verifyTrainSubmissionWithMandatoryFields() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyTrainSubmissionWithMandatoryFields()
			 .logout();
		}
	
		
		@Test(priority = 5, description = "Verify check availability")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify check availability")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC005_Travel_verifyCheckAvailability() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyCheckAvailability()
			 .logout();
		}
	
		
		@Test(priority = 6, description = "Verify from and to city can't be same")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify from and to city can't be same")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC006_Travel_verifyFromAndToCityCanNotBeSame() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyFromAndToCityCanNotBeSame()
			 .logout();
		}
		@Test(priority = 7, description = "Verify from and to station swap")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify from and to station swap")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC007_Travel_verifyFromAndToStationSwap() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyFromAndToStationSwap()
			 .logout();
		}
	
		@Test(priority = 8, description = "Verify train recent search card creation")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify train recent search card creation")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC008_Travel_verifyTrainRecentSearchCardCreation() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyTrainRecentSearchCardCreation()
			 .logout();
		}
		@Test(priority = 9, description = "Verify train using search recent search card ")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description:Verify train using search recent search card")
		@Story("Travel smoke test in Navigatio uat org")
		public void TC009_Travel_verifyTrainSearchUsingRecentSearchCard() throws Exception {
			 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
			 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
			 .AddMoreProducts()
			 .verifyTrainSearchUsingRecentSearch()
			 .logout();
		}
}