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

@Epic("Hotel Booking Engine Page Tests")
@Feature("Travel")
public class BookingEngineHotelTests extends TestBotBase{
	
	
	@Test(priority = 1, description = "Verify hotel domestic & international extra fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify hotel domestic & international extra fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC001_Travel_VerifyHotelDomesticAndInternationalExtraField() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyHotelDomesticAndInternationalExtraField()
		 .logout();
	}
	
	
	@Test(priority = 2, description = "Verify hotel location validation")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify hotel location validation")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC002_Travel_VerifyHotelLocationFieldValidationMessage() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyHotelLocationFieldValidationMessage()
		 .logout();
	}
	

	@Test(priority = 3, description = "Verify checkin & checkout dates can't be same")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify checkin & checkout dates can't be same")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC003_Travel_VerifyCheckinCheckOutDatesCanNotBeSame() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyCheckinCheckoutDatesCanNotBeSame()
		 .logout();
	}
	

	@Test(priority = 4, description = "Verify hotel room addition")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify hotel room addition")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC004_Travel_VerifyHotelRoomAddtion() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyHotelRoomAddition()
		 .logout();
	}
	
	
	@Test(priority = 5, description = "Verify hotel room deletion")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify hotel room deletion")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC005_Travel_VerifyHotelRoomDeletion() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyHotelRoomDeletion()
		 .logout();
	}
	
	@Test(priority = 6, description = "Verify hotel recent serch card creation")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify hotel recent serch card creation")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC006_Travel_VerifyHotelRecentSearchCardCreation() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyHotelRecentSearchCardCreation()
		 .logout();
	}
	

	@Test(priority = 7, description = "Verify hotel search using recent search card")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:Verify hotel search using recent search card")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC007_Travel_VerifyHotelSearchUsingRecentSearchCard() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		.AddMoreProducts()
		.verifyHotelSearchUsingRecentSearch()
		.logout();
	}

	
	@Test(priority = 8, description = "Search Hotel Without Mandatory Fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Search Hotel Without Mandatory Fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC008_Travel_SearchHotelWithoutMandatoryFields() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .searchHotelWithoutMandatoryFields("Please enter values for all the mandatory fields")
		 .logout();
		 	                            
	}
	
	@Test(priority = 9, description = "Search Hotel With Mandatory Fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Search Hotel With Mandatory Fields")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC009_Travel_SearchHotelWithMandatoryFields() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .searchHotelWithMandatoryFields()
		 .logout();
		 	                            
	}
	
	@Test(priority = 10, description = "Search Hotel Offline")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Search Hotel Offline")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC010_Travel_SearchHotelOffline() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .searchHoteOffline()
		 .logout();
		 	                            
	}
	
	@Test(priority = 11, description = "Verify Hotel Max Stay Duration")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Hotel Max Stay Duration")
	@Story("Travel smoke test in Navigatio uat org")
	public void TC011_Travel_VerifyMaxStayDuration() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		 .loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		 .AddMoreProducts()
		 .verifyHotelMaxStayDuration()
		 .logout();
		 	                            
	}

}
