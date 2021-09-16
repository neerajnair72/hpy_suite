package pageobjects.TravelNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;

public class LandingScreen extends TestBotElementsWrapper {
	
	/** Get Started button */
	@FindBy (xpath = "//button[text() = 'Get Started']")
	private WebElement GetStarted_Button_xpath;
	
	/** Trip Name is missing validation message */
	@FindBy (xpath = "//div[text() = 'Enter Trip Name']")
	private WebElement TripNameMissing_Message_xpath;
	
	/** Enter Trip Name */
	@FindBy (xpath = "//input[@id = 'create-trip-landing']")
	private WebElement TripName_TextField_xpath;
	
	/** Validate Trip Form */
	@FindBy (xpath = "//div/span[text() = 'Trip Creation']")
	public WebElement TripCreation_Label_xpath;
	
	/** Personal Trip check box */
//	@FindBy (xpath = "//span[@id = 'hw-checkbox-transition-personal-trip-checkbox']")
	@FindBy (xpath = "//span[text() = 'This is a personal trip']")
	private WebElement PersonalTrip_CheckBox_xpath;
	
	/** Validate Booking Engine */
	@FindBy (xpath = "//div/span[text() = 'Booking Engine']")
	private WebElement BookingEngine_Label_xpath;
	
	/** Flight - Book Now in Landing Screen */
	@FindBy (xpath = "(//div/button[text() = 'Book Now'])[1]")
	private WebElement FlightBookNowInLandingScreen_Button_xpath;
	
	/** Hotel - Book Now in Landing Screen */
	@FindBy (xpath = "(//div/button[text() = 'Book Now'])[2]")
	private WebElement HotelBookNowInLandingScreen_Button_xpath;
	
	/** Validate by default flight is selected */
	@FindBy (xpath = "//div[@class='selected-product'][text() = 'flight']")
	private WebElement DefaultFlightIsSelected_Tab_xpath;
	
	/** Validate by default hotel is selected */
	@FindBy (xpath = "//div[@class='selected-product'][text() = 'hotel']")
	private WebElement DefaultHotelIsSelected_Tab_xpath;
	
	/** Trips */
	@FindBy (xpath = "//div[text() = 'Trips']")
	private WebElement SelectTrips_Menu_xpath;
	
	/** Drafts */
	@FindBy (xpath = "//a[text() = 'drafts']")
	//@FindBy (xpath = "//div[text() = 'drafts']")
	private WebElement SelectDrafts_Menu_xpath;
	
	/** Add More Products */
	@FindBy (xpath = "(//div[text() = 'Add More Products'])[1]")
	private WebElement AddMoreProducts_Button_xpath;
	
	
	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElementsTravelNew.class).logout();
	}
	
	@Step("{method}")
	public BookingEngine AddMoreProducts(){
		waitAndClickWebElement(SelectTrips_Menu_xpath);
		waitAndClickWebElement(SelectDrafts_Menu_xpath);
		waitAndClickWebElement(AddMoreProducts_Button_xpath);
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public LandingScreen ClickOnGetStarted_WithoutTripName() throws Exception{
		SoftAssert sa = new SoftAssert();
		isElementDisplayed(GetStarted_Button_xpath);
		waitAndClickWebElement(GetStarted_Button_xpath);
		
		String Actual = TripNameMissing_Message_xpath.getText();
		sa.assertEquals(Actual, "Enter Trip Name");
		sa.assertAll();
		return GetInstance(LandingScreen.class);
	}
	
	@Step("{method}")
	public TripCreation ClickOnGetStarted_WithTripName() throws Exception{
		waitAndClickWebElement(TripName_TextField_xpath);
		TripName_TextField_xpath.sendKeys("Automation Test");
		waitAndClickWebElement(GetStarted_Button_xpath);
		
		return GetInstance(TripCreation.class);
	}
	
	@Step("{method}")
	public LandingScreen ClickOnGetStarted_WithPersonalTrip() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(TripName_TextField_xpath);
		TripName_TextField_xpath.sendKeys("Automation Test");
		waitAndClickWebElement(PersonalTrip_CheckBox_xpath);
		waitAndClickWebElement(GetStarted_Button_xpath);
		
		boolean Actual = isElementDisplayed(BookingEngine_Label_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(LandingScreen.class);
	}
	
	@Step("{method}")
	public LandingScreen ClickOnBookNowButton_Flight_LandingScreen() throws Exception{
		SoftAssert sa = new SoftAssert();
//		ScrollToElement(BookNowInLandingScreen_Button_xpath);
		waitAndClickWebElement(FlightBookNowInLandingScreen_Button_xpath);
		
		boolean Actual = isElementDisplayed(DefaultFlightIsSelected_Tab_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(LandingScreen.class);
	}
	
	@Step("{method}")
	public LandingScreen ClickOnBookNowButton_Hotel_LandingScreen() throws Exception{
		SoftAssert sa = new SoftAssert();
//		ScrollToElement(BookNowInLandingScreen_Button_xpath);
		waitAndClickWebElement(HotelBookNowInLandingScreen_Button_xpath);
		
		boolean Actual = isElementDisplayed(DefaultHotelIsSelected_Tab_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(LandingScreen.class);
	}
	
	@Step("{method}")
	public LandingScreen ClickOnGetStarted_WithSpaces() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(TripName_TextField_xpath);
		TripName_TextField_xpath.sendKeys("  ");
		waitAndClickWebElement(GetStarted_Button_xpath);
		
		String Actual = TripNameMissing_Message_xpath.getText();
		sa.assertEquals(Actual, "Enter Trip Name");
		sa.assertAll();
		return GetInstance(LandingScreen.class);
	}


}
