/**
 * 
 */
/**
 * @author akshay.shetty
 *
 */
package testCases.TravelNewSmokeTestCases;

import org.testng.annotations.Test;

import frameworkBase.TestBotBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.TravelNew.LoginPageTravelNew;

public class LandingScreenTests extends TestBotBase {
	
	/**
	* Test to Verify Landing screen
	* 
	* @throws Exception
	* 
	*/

	@Test(priority =1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Get Started without Trip Name")
	@Story("Travel smoke test")
	public void Test0001_VerifyGetStartedButton_WithoutTripName() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithoutTripName()
						.logout();	
	}
	
	@Test(priority =2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify validation message on click on Get Started button with only spaces in Trip Name")
	@Story("Travel smoke test")
	public void Test0002_VerifyWithSpacesInTripName() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		.ClickOnGetStarted_WithSpaces()
		.logout();		
	}
	
	@Test(priority =3)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Trip form")
	@Story("Travel smoke test")
	public void Test0003_VerifyGetStartedButton_WithTripName() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithTripName()
						.logout();			
	}
	
	@Test(priority =4)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Re-direction to Booking Engine on click of Get Started button with Personal Trip")
	@Story("Travel smoke test")
	public void Test0004_VerifyGetStartedButtonWithPersonalTrip() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithPersonalTrip()
						.logout();
	}
	
	@Test(priority =5)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Re-direction to Booking Engine on click of Book Now button against the flight")
	@Story("Travel smoke test")
	public void Test0005_VerifyBookNowButton_Flight() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		.ClickOnBookNowButton_Flight_LandingScreen()
		.logout();		
	}
	
	@Test(priority =6)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Re-direction to Booking Engine on click of Book Now button against the hotel")
	@Story("Travel smoke test")
	public void Test0006_VerifyBookNowButton_Hotel() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
		.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
		.ClickOnBookNowButton_Hotel_LandingScreen()
		.logout();		
	}

}
