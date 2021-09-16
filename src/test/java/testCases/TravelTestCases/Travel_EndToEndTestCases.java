/*
package testCases.TravelTestCases;
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

*/
/**
 * The Class TravelModuleTests.
 *//*
 
 
@Listeners(TestListeners.class)
@Epic("Verify Travel End To End Test Cases")
@Feature("Flight")

public class Travel_EndToEndTestCases extends TestBotBase {
	SoftAssert sa = new SoftAssert();
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.commonViewsLoginPage_Travel()
        			 .get()
        			 .login(ExcelUtils.getRowDataWithSheetName(2, "Travel_Login"))
        			 .ClickonFlightMenu();
		
		sa = new SoftAssert();
	}
		
	@AfterMethod
	public void testsetupafter() throws Exception {
		pageGenerator.commonPageElements_Travel()
					 .get()
					 .ClickonFlightMenu()
					 .logout_Travel();
	}
	
	*/
/**
	* Test to Verify the Insurance after untick
	* 
	* @throws Exception
	*//*

	@Test(priority = 7)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Insurance after untick")
	@Story("Travel End To End test")
	public void Test007_Travel_VerifyInsuranceCheckBox() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_OneWayTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight()
					 .SelectOneWayFlightAndClickOnBookNowButton()
					 .CheckInsurance();
	}
	
*/
/**
	* Test to Verify the Insurance Benefits
	* 
	* @throws Exception
	*//*

	@Test(priority = 8)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Insurance Benefits")
	@Story("Travel End To End test")
	public void Test008_Travel_VerifyInsuranceBenefits() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_OneWayTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight()
					 .SelectOneWayFlightAndClickOnBookNowButton()
					 .InsuranceBenefits();
	}

	
	*/
/**
	* Test to Verify the Insurance Amount of One Way Trip
	* 
	* @throws Exception
	*//*

	@Test(priority = 9)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Insurance Amount of One Way Trip")
	@Story("Travel End To End test")
	public void Test009_Travel_VerifyInsuranceAmountOfOneWayTrip() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_OneWayTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .AddMoreThan_OnePassenger()
					 .ClickonSearchFlight()
					 .SelectOneWayFlightAndClickOnBookNowButton()
					 .InsuranceAmount();
		
		String actual= pageGenerator.flights().get().InsuranceAmount_Info_xpath.getText();
		sa.assertEquals(actual,"₹ 358.00");
		sa.assertAll();	

	}
	
	
	*/
/**
	* Test to Verify the Insurance Amount of Round Trip
	* 
	* @throws Exception
	*//*

	@Test(priority = 10)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Insurance Amount of Round Trip")
	@Story("Travel End To End test")
	public void Test010_Travel_VerifyInsuranceAmountOfRoundTrip() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_RoundTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .AddMoreThan_OnePassenger()
					 .ClickonSearchFlight()
					 .SelectOnwardReturnFlightAndClickOnBookNowButton()
					 .InsuranceAmount();
		
		String actual= pageGenerator.flights().get().InsuranceAmount_Info_xpath.getText();
		sa.assertEquals(actual,"₹ 358.00");
		sa.assertAll();
	}
	
	
	*/
/**
	* Test to Verify the Convenience Fee of One Way Trip
	* 
	* @throws Exception
	*//*

	@Test(priority = 11)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Convenience Fee of One Way Trip")
	@Story("Travel End To End test")
	public void Test011_Travel_VerifyConvenienceFeeOfOneWayTrip() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_OneWayTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .AddMoreThan_OnePassenger()
					 .ClickonSearchFlight()
					 .SelectOneWayFlightAndClickOnBookNowButton()
					 .TravellerDetails(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickOnProceedToPayment()
					 .ConvenienceAmount();
					 
		String actual= pageGenerator.flights().get().ConvenienceAmount_Info_xpath.getText();
		sa.assertEquals(actual,"₹ 200.00");
		sa.assertAll();
	}
	
	
	*/
/**
	* Test to Verify the Convenience Fee of Round Trip
	* 
	* @throws Exception
	*//*

	@Test(priority = 12)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Convenience Fee of Round Trip")
	@Story("Travel End To End test")
	public void Test012_Travel_VerifyConvenienceFeeOfRoundTrip() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_RoundTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .AddMoreThan_OnePassenger()
					 .ClickonSearchFlight()
					 .SelectOnwardReturnFlightAndClickOnBookNowButton()
					 .TravellerDetails(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickOnProceedToPayment()
					 .ConvenienceAmount();
		 
		String actual= pageGenerator.flights().get().ConvenienceAmount_Info_xpath.getText();
		sa.assertEquals(actual,"₹ 400.00");
		sa.assertAll();
	}
	
	
	*/
/**
	* Test to Verify the Booking Status of One Way Trip
	* 
	* @throws Exception
	*//*

	@Test(priority = 13)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Booking Status of One Way Trip")
	@Story("Travel End To End test")
	public void Test013_Travel_VerifyBookingStatusOfOneWayTrip() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_OneWayTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight()
					 .SelectOneWayFlightAndClickOnBookNowButton()
					 .TravellerDetails(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickOnProceedToPayment()
					 .ClickOnMakePayment();
					 //.BookingStatusInfo();
		
		
		String actual= pageGenerator.flights().get().BookingStatus_Info_xpath.getText();
		
		String ExpectedText= "Flight booking is confirmed and your trip is insured.";
		String ExpectedText1= "Flight booking confirmation pending.";
		String ExpectedText2= "Flight booking is confirmed.";
		if (actual.contains(ExpectedText)){
			String actual1= pageGenerator.flights().get().OneWayBookingStatus_Info_xpath.getText();
			String actual2= pageGenerator.flights().get().ReturnBookingStatus_Info_xpath.getText();
			sa.assertEquals(actual,ExpectedText);
			sa.assertEquals(actual1,"Confirmed");
			sa.assertEquals(actual2,"Confirmed");
		}
		else{
			if (actual.contains(ExpectedText1)){
			sa.assertEquals(actual,ExpectedText1);
			}
			else{
				if (actual.contains(ExpectedText2)){
					String actual1= pageGenerator.flights().get().OneWayBookingStatus_Info_xpath.getText();
					String actual2= pageGenerator.flights().get().ReturnBookingStatus_Info_xpath.getText();
					sa.assertEquals(actual,ExpectedText2);
					sa.assertEquals(actual1,"Confirmed");
					sa.assertEquals(actual2,"Confirmed");
				}
			}
		}	
		sa.assertAll();	
	}
	
	
	*/
/**
	* Test to Verify the Booking Status of Round Trip
	* 
	* @throws Exception
	*//*

	@Test(priority = 14)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Booking Status of Round Trip")
	@Story("Travel End To End test")
	public void Test014_Travel_VerifyBookingStatusOfRoundTrip() throws Exception {
		pageGenerator.flights()
					 .get()
					 .Enter_RoundTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight()
					 .SelectOnwardReturnFlightAndClickOnBookNowButton()
					 .TravellerDetails(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickOnProceedToPayment()
					 .ClickOnMakePayment();
//					 .BookingStatusInfo();
					 
		String actual= pageGenerator.flights().get().BookingStatus_Info_xpath.getText();
		String ExpectedText= "Flight booking is confirmed and your trip is insured.";
		String ExpectedText1= "Flight booking confirmation pending.";
		String ExpectedText2= "Flight booking is confirmed.";
		if (actual.contains(ExpectedText)){
			String actual1= pageGenerator.flights().get().OneWayBookingStatus_Info_xpath.getText();
			String actual2= pageGenerator.flights().get().ReturnBookingStatus_Info_xpath.getText();
			sa.assertEquals(actual,ExpectedText);
			sa.assertEquals(actual1,"Confirmed");
			sa.assertEquals(actual2,"Confirmed");
		}
		else{
			if (actual.contains(ExpectedText1)){
			sa.assertEquals(actual,ExpectedText1);
			}
			else{
				if (actual.contains(ExpectedText2)){
					String actual1= pageGenerator.flights().get().OneWayBookingStatus_Info_xpath.getText();
					String actual2= pageGenerator.flights().get().ReturnBookingStatus_Info_xpath.getText();
					sa.assertEquals(actual,ExpectedText2);
					sa.assertEquals(actual1,"Confirmed");
					sa.assertEquals(actual2,"Confirmed");
				}
			}
		}	
		sa.assertAll();	

	}
	
	*/
/**
	* Test to Verify the Company Balance after Booking
	* 
	* @throws Exception
	*//*

	@Test(priority = 15)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify the Company Balance after Booking")
	@Story("Travel End To End test")
	public void Test0015_Travel_VerifyCompanyBalance() throws Exception {
		String actual = pageGenerator.flights().get().CompanyBalance_Info_xpath.getText();
		pageGenerator.flights()
					 .get()
					 .Enter_OneWayTrip_Criteria(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickonSearchFlight()
					 .SelectOneWayFlightAndClickOnBookNowButton()
					 .TravellerDetails(ExcelUtils.getRowDataWithSheetName(1, "Flight_Search_Criteria"))
					 .ClickOnProceedToPayment()
					 .ClickOnMakePayment()
					 .BookingStatus_Info_xpath();
		
		String actual1 = pageGenerator.flights().get().CompanyBalance_Info_xpath.getText();
		sa.assertNotSame(actual, actual1, "Company Balance Updated");
		sa.assertAll();
	}
	
	
}
*/
