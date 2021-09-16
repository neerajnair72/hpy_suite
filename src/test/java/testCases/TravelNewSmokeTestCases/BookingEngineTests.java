package testCases.TravelNewSmokeTestCases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.TravelNew.BookingEngine;
import pageobjects.TravelNew.LoginPageTravelNew;

public class BookingEngineTests extends TestBotBase {
	
	@Test(priority =12)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Search Flight Without Mandatory Fields")
	@Story("Travel smoke test")
	public void Test001_VerifySearchFlightWithoutMandatoryFields() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.ClickOnSearchFlight_WithoutMandatoryFields()
						.logout();	
	}
	
	@Test(priority =13)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify One way Search Flight With Mandatory Fields")
	@Story("Travel smoke test")
	public void Test002_VerifySearchFlights_UsingOneWayDetails() throws Exception {
		SoftAssert sa = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.ClickOnSearchFlight_WithOneWayFlightCriteria(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"));
		
		String Actual1 = pageGeneratorNew.GetInstance(BookingEngine.class).SearchPageInfo_FromCity_xpath.getText();
		String Actual2 = pageGeneratorNew.GetInstance(BookingEngine.class).SearchPageInfo_ToCity_xpath.getText();
		sa.assertEquals(Actual1,"Bangalore (BLR)");
		sa.assertEquals(Actual2,"Mumbai (BOM)");
		sa.assertAll();
		
		pageGeneratorNew.GetInstance(BookingEngine.class).logout();
	}
	
	@Test(priority =14)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify One way Search Flight With Mandatory Fields")
	@Story("Travel smoke test")
	public void Test003_VerifySearchFlights_UsingSameFromAndToCity() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.ClickOnSearchFlight_WithSameFromAndToCity(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
						.logout();	
	}
	
	@Test(priority =15)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Request Type pop up")
	@Story("Travel smoke test")
	public void Test004_VerifyRequestTypePopUp() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.RequestTypePopUp_WithOnlineAndOfflineButtons(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
						.logout();	
	}
	
	@Test(priority =16)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify round trip without return date")
	@Story("Travel smoke test")
	public void Test005_VerifyRoundTripWithoutDepartureDate() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.RoundTrip_WithoutDepartureDate(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
						.logout();	
	}
	
	@Test(priority =17)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Recent search")
	@Story("Travel smoke test")
	public void Test006_VerifyRecentSearch() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.VerifyRecentSearch(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
						.logout();	
	}
	
	@Test(priority =18)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify flight search using recent search")
	@Story("Travel smoke test")
	public void Test007_VerifySearchFlight_UsingRecentSearch() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.RecentSearch()
						.logout();	
	}
	
	@Test(priority =19)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify swap city functionality")
	@Story("Travel smoke test")
	public void Test008_VerifySwapCity() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.SwapCity(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
						.logout();	
	}
	
	@Test(priority =20)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify preferred time without To departure time")
	@Story("Travel smoke test")
	public void Test009_VerifyPreferrredTimeWithoutToTime() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.PreferredTime()
						.logout();	
	}
	
	@Test(priority =21)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify default selected preferred time in filters")
	@Story("Travel smoke test")
	public void Test010_VerifyDefaultSelectedPreferrredTimeInFilters() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.DefaultPreferredTimeFilter()
						.logout();	
	}
	
	@Test(priority =22)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Added flight in Multi City")
	@Story("Travel smoke test")
	public void Test011_VerifyAddedFlightInMultiCity() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.AddFlightInMultiCity()
						.logout();	
	}
	
	@Test(priority =23)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Remove flight in Multi City")
	@Story("Travel smoke test")
	public void Test012_VerifyRemoveFlightInMultiCity() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.RemoveFlightInMultiCity()
						.logout();	
	}
	
	@Test(priority =24)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Multi City search using one way criteria")
	@Story("Travel smoke test")
	public void Test013_VerifyMultiCitySearchUsingOneWayCriteria() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.MultiCitySearch_WithOneWayFlightCriteria()
						.logout();	
	}
	
	@Test(priority =25)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify offline search")
	@Story("Travel smoke test")
	public void Test014_VerifyOfflineSearch() throws Exception {
		SoftAssert sa = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.OfflineSearch();
		
		String Actual = pageGeneratorNew.GetInstance(BookingEngine.class).TripReviewInfo_Info_xpath.getText();
		sa.assertEquals(Actual,"Flight Review");
		sa.assertAll();
		
		pageGeneratorNew.GetInstance(BookingEngine.class).logout();			
	}
	
	@Test(priority = 26)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify and compare extrafields between domestic and International")
	@Story("Travel smoke test")
	public void Test015_VerifyAndCompareExtraFieldsInBookingEngine() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.BookingEngineExtraFields(excelUtils.getRowDataWithSheetName(2, "Flight_Search_Criteria"))
						.logout();	
	}
	
	@Test(priority = 27)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify whether by defuault '0 Stop' filter is selected or not")
	@Story("Travel smoke test")
	public void Test016_VerifyDefaultDirectFlightFilterSelected() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.DirectFlight()
						.logout();	
	}
	
	@Test(priority = 28)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify multi pax and class in Search page")
	@Story("Travel smoke test")
	public void Test017_VerifyMultiPaxAndClass() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.AddTravellersAndCabin()
						.logout();	
	}
	
	@Test(priority =29)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify One way Search Flight With Mandatory Fields")
	@Story("Travel smoke test")
	public void Test018_VerifySearchFlights_UsingRoundTripDetails() throws Exception {
		SoftAssert sa = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.AddMoreProducts()
						.ClickOnSearchFlight_WithRoundTripFlightCriteria(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"));
		
		String Actual1 = pageGeneratorNew.GetInstance(BookingEngine.class).SearchPageInfo_FromCity_xpath.getText();
		String Actual2 = pageGeneratorNew.GetInstance(BookingEngine.class).SearchPageInfo_ToCity_xpath.getText();
		sa.assertEquals(Actual1,"Bangalore (BLR)");
		sa.assertEquals(Actual2,"Mumbai (BOM)");
		sa.assertAll();
		
		pageGeneratorNew.GetInstance(BookingEngine.class).logout();
	}
	
	
}
