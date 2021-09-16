/*
 package testCases.TravelTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.TravelProductViews.CommonPageElements_Travel;
import pageobjects.TravelProductViews.CommonViewsLoginPage_Travel;
import pageobjects.TravelProductViews.Flights;



*//**
 * The Class TravelModuleTests.
 *//*

@Listeners(TestListeners.class)
@Epic("Verify Travel Smoke Test Cases")
@Feature("Flight")

public class Travel_SmokeTestCases extends TestBotBase {
	SoftAssert sa = new SoftAssert();

	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGeneratorNew.GetInstance(CommonViewsLoginPage_Travel.class)
        			
        			 .login(excelUtils.getRowDataWithSheetName(2, "Travel_Login"))
        			 .ClickonFlightMenu();
		sa = new SoftAssert();
		
//		pageGeneratorNew.commonViewsLoginPage_Travel()
//		 .get()
//		 .login(ExcelUtils.getRowDataWithSheetName(2, "Travel_Login"))
//		 .ClickonFlightMenu();
//sa = new SoftAssert();
	}
		
	@AfterMethod
	public void testsetupafter() throws Exception {
		pageGeneratorNew.GetInstance(CommonPageElements_Travel.class)
					 
					 .ClickonFlightMenu()
					 .logout_Travel();
	}
	
	
	
*//**
	* Test to verify the Recent Search button
	* 
	* @throws Exception
	* 
	*//*

	
	@Test(priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Click on Search without Mandatory Fields")
	@Story("Travel smoke test")
	public void Test001_Travel_VerifySearchButtonWithoutMandatoryFields() throws Exception {
		pageGeneratorNew.GetInstance(Flights.class)
					 
		 			 .ClickonSearchFlight();
					 
		boolean actual = pageGeneratorNew.GetInstance(Flights.class).RecentSearch_Info_xpath.isDisplayed();
		sa.assertTrue(actual);
		sa.assertAll();
	}
	
	
	
*//**
	* Test to Verify Search Button using One Way criteria
	* 
	* @throws Exception
	*//*

	@Test(priority = 2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test description: Enter all the criteria for one way trip and Click on Search Flight button")
	@Story("Travel smoke test")
	public void Test002_Travel_VerifySearchFlights_UsingOneWayDetails() throws Exception {
		
		pageGeneratorNew.GetInstance(Flights.class)
					
					 .Enter_OneWayTrip_Criteria(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight();
		
		String actual1=pageGeneratorNew.GetInstance(Flights.class).SearchPageFromCity_Info_xpath.getText();
		String actual2=pageGeneratorNew.GetInstance(Flights.class).SearchPageToCity_Info_xpath.getText();
		sa.assertEquals(actual1,"Bangalore (BLR)");
		sa.assertEquals(actual2,"Chennai (MAA)");
		sa.assertAll();
	}
	
*//**
	* Test to Verify Search Button using Round Trip criteria
	* 
	* @throws Exception
	*//*

	@Test(priority = 3)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Enter all the criteria for ROUND trip and Click on Search Flight button")
	@Story("Travel smoke test")
	public void Test003_Travel_VerifySearchFlights_UsingRoundTripDetails() throws Exception {
		
		pageGeneratorNew.GetInstance(Flights.class)
					 
					 .Enter_RoundTrip_Criteria(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight();
		
		String actual1=pageGeneratorNew.GetInstance(Flights.class).SearchPageFromCity_Info_xpath.getText();
		String actual2=pageGeneratorNew.GetInstance(Flights.class).SearchPageToCity_Info_xpath.getText();
		sa.assertEquals(actual1,"Bangalore (BLR)");
		sa.assertEquals(actual2,"Chennai (MAA)");
		sa.assertAll();
		

	}
	
	
*//**
	* Test to Verify Search Button by adding more than one passenger
	* Test to verify default Passenger and Class values while searching flights
	* @throws Exception
	* 
	*//*

	
	
	@Test(priority = 4)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Enter all the criteria and add more than one passenger and click on Search Flight button")
	@Story("Travel smoke test")
	public void Test004_Travel_VerifySearchFlights_ForMoreThanOnePassenger() throws Exception {
		
		pageGeneratorNew.GetInstance(Flights.class)
					
					 .Enter_OneWayTrip_Criteria(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
		 			 .AddMoreThan_OnePassenger()
					 .ClickonSearchFlight();
		
		String actual1=pageGeneratorNew.GetInstance(Flights.class).SearchPageFromCity_Info_xpath.getText();
		String actual2=pageGeneratorNew.GetInstance(Flights.class).SearchPageToCity_Info_xpath.getText();
		sa.assertEquals(actual1,"Bangalore (BLR)");
		sa.assertEquals(actual2,"Chennai (MAA)");
		sa.assertAll();					

	}
	
	
*//**
	* Test to 
	* 
	* @throws Exception
	* 
	*//*

	
	@Test(priority = 5)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Search a Flight using the above Recent search details")
	@Story("Travel Smoke Tests")
	public void Test005_Travel_VerifySearchFlights_UsingRecentSearchButton() throws Exception {
	
		pageGeneratorNew.GetInstance(Flights.class)
					
					 .ClickonRecentSearchButton()
					 .ClickonSearchFlight();
						
		String actual1=pageGeneratorNew.GetInstance(Flights.class).SearchPageFromCity_Info_xpath.getText();
		String actual2=pageGeneratorNew.GetInstance(Flights.class).SearchPageToCity_Info_xpath.getText();
		sa.assertEquals(actual1,"Bangalore (BLR)");
		sa.assertEquals(actual2,"Chennai (MAA)");
		sa.assertAll();	
	}


	
*//**
	* Test to verify the Recent Search button
	* 
	* @throws Exception
	* 
	*//*

	
	@Test(priority = 6)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Search a flight and verify the Recent Search")
	@Story("Travel smoke test")
	public void Test006_Travel_VerifyRecentSearchButton() throws Exception {
		pageGeneratorNew.GetInstance(Flights.class)
					 
		 			 .Enter_OneWayTrip_Criteria(excelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
		 			 .ClickonSearchFlight();
		
		
		getThreadSafeDriver().navigate().back();			 
		String actual=pageGeneratorNew.GetInstance(Flights.class).RecentSearch_Info_xpath.getText();
		sa.assertEquals(actual,"BangaloreChennai");
		sa.assertAll();

	}

}

*/