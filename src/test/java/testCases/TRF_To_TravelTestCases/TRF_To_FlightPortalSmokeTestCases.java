/*
package testCases.TRF_To_TravelTestCases;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.TravelProductViews.CommonPageElements_TRFtoTravel;

@Listeners(TestListeners.class)
@Epic("Verify TRF to Travel Test Cases")
@Feature("Flight")

public class TRF_To_FlightPortalSmokeTestCases extends TestBotBase {
	SoftAssert sa = new SoftAssert();
	
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.commonViewsLoginPage_TRF()
        			 .get()
        			 .loginTRF(ExcelUtils.getRowDataWithSheetName(2, "Travel_Login"))
        			 .ClickonTravelRequestMenu();
		sa = new SoftAssert();
	}
		
	@AfterMethod
	public void testsetupafter() throws Exception {
		pageGenerator.commonPageElements_Travel()
					 .get()
					 .logout_Travel();
	}
	
	
	
	*/
/**
	* Test to Verify Switching of portals from Expense portal to Travel portal for One Way Trip
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority = 16)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Switching of portals from Expense portal to Travel portal")
	@Story("Trf_To_Travel smoke test")
	public void Test0016_VerifyTrfToTravelSwitching() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
		 			 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"));
		
		    String actual1=pageGenerator.trf_To_Travel().TravelPortal_AddPreferencesValidation_xpath.getText();
	 		sa.assertEquals(actual1,"Please select your flight preferences");
	 		sa.assertAll();
	 		driver.close();
		    pageGenerator.trf_To_Travel().Wait();
	}
	
	
	
	*/
/**
	* Test to Verify the Preference in the drawer which are added in the Travel portal
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority = 17)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify the Preference in the drawer which are added in the Travel portal")
	@Story("Trf_To_Travel smoke test")
	public void Test0017_VerifySelectedPreferences() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
					 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
					 .SelectPreferences();
					 
			driver.close();
			pageGenerator.trf_To_Travel().Wait();
	}
	
	
	
	*/
/**
	* Test to Verify the Preferences in the drawer by removing it
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority = 18)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify the Preferences in the drawer by removing it")
	@Story("Trf_To_Travel smoke test")
	public void Test0018_VerifyPreferencesAfterRemoving() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
					 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
					 .RemoveSelectedPreference();
		
			driver.close();
			pageGenerator.trf_To_Travel().Wait();
	}
	
	
	
	*/
/**
	* Test to Verify the Validation message which is displayed while selecting same flight for the second time
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority = 19)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify the Validation message which is displayed while selecting same flight for the second time")
	@Story("Trf_To_Travel smoke test")
	public void Test0019_ValidationMessageAfterSelectingSameFLight() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
					 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
					 .SelectSameFlight();
		
			driver.close();
			pageGenerator.trf_To_Travel().Wait();
	}
	
	
	
	*/
/**
	* Test to Verify the Validation message which is displayed while selecting 4th flight
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority = 20)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify the Validation message which is displayed while selecting 4th flight")
	@Story("Trf_To_Travel smoke test")
	public void Test0020_ValidationMessageAfterSelectingFourthFLight() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
					 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
					 .SelectFourPreferences();
		
			driver.close();
			pageGenerator.trf_To_Travel().Wait();
	}
	
	
	
	*/
/**
	* Test to Verify Switching of portals from Expense portal to Travel portal
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority =21)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Switching of portals from Expense portal to Travel portal for Round Trip")
	@Story("Trf_To_Travel smoke test")
	public void Test0021_VerifyRoundTripTrfToTravelSwitching() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
		 			 .CreateTRF_RoundTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"));
		
			String actual1=pageGenerator.trf_To_Travel().TravelPortal_AddPreferencesValidation_xpath.getText();
	 		sa.assertEquals(actual1,"Please select your flight preferences");
	 		sa.assertAll();
	 		driver.close();
		    pageGenerator.trf_To_Travel().Wait();
	
	}
	
	
	
	*/
/**
	* Test to Verify the "Proceed" button by selecting only Onward/Return Flight
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority =22)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify the Proceed button by selecting only Onward/Return Flight")
	@Story("Trf_To_Travel smoke test")
	public void Test0022_VerifyProceedButton() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
		 			 .CreateTRF_RoundTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
		 			 .CheckProceedButton();
		
	 		driver.close();
		    pageGenerator.trf_To_Travel().Wait();
	
	}
	
	
	
	
	*/
/**
	* Test to Verify that One Way preferences are added successfully
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority =23)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify that preferences are added successfully")
	@Story("Trf_To_Travel smoke test")
	public void Test0023_VerifyPreferencesAddedSuccessfully() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
		 			 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
		 			 .ProceedToAddFlightPreference()
		 			 .Wait();
		
		String actual = pageGenerator.trf_To_Travel().get().PreferencesAddedSuccessfully_message_xpath.getText();
		sa.assertEquals(actual, "Flight preferences added successfully");
		sa.assertAll();
	}
	
	
	
	*/
/**
	* Test to Verify "View Selected Flights" button by adding flight preferences
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority =24)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify View Selected Flights button by adding flight preferences")
	@Story("Trf_To_Travel smoke test")
	public void Test0024_VerifyViewSelectedFlights() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
		 			 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
		 			 .ProceedToAddFlightPreference()
		 			 .Wait()
		 			 .ViewSelectedFlights();
	}
	
	*/
/**
	* Test to Verify the Flights added by clicking on "Add Trip" button
	* 
	* @throws Exception
	* 
	*//*

	@Test(priority =25)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify the Flights added by clicking on Add Trips button")
	@Story("Trf_To_Travel smoke test")
	public void Test0025_VerifyAddedFlights() throws Exception {
		pageGenerator.trf_To_Travel()
					 .get()
		 			 .CreateTRF_OneWayTrip(ExcelUtils.getRowDataWithSheetName(1, "TRF_To_Travel"))
		 			 .ProceedToAddFlightPreference()
		 			 .Wait()
		 			 .AddTrips();
		String actual =pageGenerator.trf_To_Travel().ViewFlights_Info_xpath.getText();
 		sa.assertEquals(actual,"BOOK FLIGHTS (9507)");
 		sa.assertAll();
		
	}
	
}*/
