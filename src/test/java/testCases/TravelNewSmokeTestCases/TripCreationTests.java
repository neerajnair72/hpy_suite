package testCases.TravelNewSmokeTestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.TravelNew.LandingScreen;
import pageobjects.TravelNew.LoginPageTravelNew;

public class TripCreationTests extends TestBotBase {
	
	@Test(priority =7)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Trip form without mandatory fields")
	@Story("Travel smoke test")
	public void Test0001_VerifyTripFormWithoutMandatoryFields() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithTripName()
						.ClickOnProceedButtonWithoutMandatoryField()
						.logout();	
	}
	
	
	@Test(priority =8)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Trip form without Policy Holder")
	@Story("Travel smoke test")
	public void Test0002_VerifyTripFormWithoutPolicyHoder() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithTripName()
						.ClickOnProceedButtonWithoutPolicyHolder()
						.logout();	
	}
	
	@Test(priority =9)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Trip form with On-Behalf Policy Holder")
	@Story("Travel smoke test")
	public void Test0003_VerifyTripFormWithOnBehalfPolicyHoder() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithTripName()
						.ClickOnProceedButtonWithOnBehalfPolicyHolder()
						.logout();	
	}
	
	@Test(priority =10)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Trip form with Invalid On-Behalf Policy Holder")
	@Story("Travel smoke test")
	public void Test0004_VerifyTripFormWithInvalidPolicyHoder() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithTripName()
						.ClickOnProceedButtonWithInvalidPolicyHolder()
						.logout();	
	}
	
	@Test(priority =11)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Verify Trip form with mandatory fields")
	@Story("Travel smoke test")
	public void Test0005_VerifyTripFormWithMandatoryFields() throws Exception {
		pageGeneratorNew.GetInstance(LoginPageTravelNew.class)
						.loginTravel(excelUtils.getRowDataWithSheetName(1, "Travel_Login"))
						.ClickOnGetStarted_WithTripName()
						.ClickOnProceedButtonWithMandatoryField()
						.logout();	
	}
	

	
	
}
