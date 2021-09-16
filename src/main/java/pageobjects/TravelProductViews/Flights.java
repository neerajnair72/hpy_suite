/*
package pageobjects.TravelProductViews;

import frameworkBase.TestBotElementsWrapper;

import java.util.List;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Flights extends TestBotElementsWrapper {
	
	public boolean isMoreThanOnePass = false;
	public boolean isDOB = false;
	public boolean isInsurancePresent = false;
	
//@FindBy(xpath = "//div/nav/ul/li[text()='ROUND TRIP']")
	@FindBy(xpath = "//div/nav/ul/li[@class='tab-list--item active']")
	private WebElement ClickOnRoundTrip_Tab_xpath;

	
	@FindBy(xpath = "(//div/input[@placeholder='Enter city'])[1]")
	private WebElement EnterFromCity_textfield_xpath;
	
	@FindBy(xpath = "(//div/input[@placeholder='Enter city'])[2]")
	private WebElement EnterToCity_textfield_xpath;
	
	@FindBy(xpath = "//div/ul/li[@id='react-autowhatever-1--item-0']")
	private WebElement ClickOnEnteredCity_Select_xpath;
	
	@FindBy(xpath = "(//div[@class = 'placeholder-text'])[1]")
	private WebElement OpenDepartureDate_Calendar_xpath;
	
	@FindBy(xpath = "(//div[text()='12'])[3]")
	private WebElement PickDepartureDate_Select_xpath;
	
	@FindBy(xpath = "(//div[@class = 'placeholder-text'])[2]")
	private WebElement OpenArrivalDate_Calendar_xpath;
	
	@FindBy(xpath = "(//div[text()='16'])[2]")
	private WebElement PickArrivalDate_Select_xpath;
	
	@FindBy(xpath = "//*[text()='Traveller']")
	private WebElement ClickToAddPassenger_xpath;
	
	@FindBy(xpath = "(//span[@class='spinner-icon'])[2]")
	private WebElement AddPassenger_xpath;
	
	@FindBy(xpath = "(//div[@class='search-flight-icon'])")
	private WebElement ClickOnSearch_Button_xpath;
	
	@FindBy(xpath = "(//div[@class='search-flight-icon'])")
	private WebElement ClickOnWithoutMandatoryFields_Validation_xpath;
	
	@FindBy(xpath = "(//div[@class='booking-landing-screen'])")
	private WebElement ClickAnyWhereOnTheScreen_xpath;
	
	@FindBy(xpath = "(//div[@class= 'search-card'])[1]")
	private WebElement RecentSearch_Button_xpath;
	
	@FindBy(xpath="//div/label[text()='SpiceJet (SG)']")
	public WebElement SpiceJetFlight_Filter_xpath;
	
//	@FindBy(xpath = "(//div[@class='tick-icon'])[3]")
	@FindBy(xpath = "(//div/span[contains(text(),'BOOK NOW')]/ancestor::div//span[text()='Regular'])[4]")//Regular Flight
	private WebElement SelectFlight_Selection_xpath;
	
    @FindBy(xpath = "(//div/span[text()='BOOK NOW'])[4]") //Regular Flight
	@CacheLookup
	private WebElement BookNow_Button_xpath1;
    
    @FindBy(xpath= "(//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt left']//span[text()='Regular'])[4")//Regular Flight
	private WebElement SelectOnwardFlight_Selection_xpath1;

	@FindBy(xpath = "(//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt right']//span[text()='Regular'])[4]")
	// @FindBy(xpath= "//div[@class='new-travel-roundcnt right']//div[3]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//div[2]//div[2]")
	private WebElement SelectReturnFlight_Selection_xpath1;
	
	
    @FindBy(xpath="//div/span[contains(text(),'BOOK NOW')]/ancestor::div//span[text()='Corporate']")
	public List<WebElement> Select_CorporateFlight_xpath;  //Corporate Flight
	
	@FindBy(xpath="//div/span[contains(text(),'Corporate')]/ancestor::div/div[@class='airfare-btn ']")
	public List<WebElement> BookNow_Button_xpath; //Corporate Flight
	
	@FindBy(xpath="//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt left']//span[text()='Corporate']")
	public List<WebElement> SelectOnwardFlight_Selection_xpath; //Corporate Flight
	
	@FindBy(xpath="//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt right']//span[text()='Corporate']")
	public List<WebElement> SelectReturnFlight_Selection_xpath;  //Corporate Flight


//	@FindBy(xpath = "//div/span[text()='BOOK NOW']")
	@FindBy(xpath = "//div/span[text()='BOOK NOW']")
	private WebElement BookNowRoundTrip_Button_xpath;
	
	@FindBy(xpath = "//div/button[text()='Add Traveller Details']")
	private WebElement AddTravellerInformation_Button_xpath;
	
	@FindBy(xpath = "(//div/input[@type='radio'])[3]")
	private WebElement ClickOnUserName_RadioButton_xpath;
	
	@FindBy(xpath = "//div/header/h3[text()='Co-Traveller Information']")
	private WebElement Co_Traveller_TextFound;
	
	@FindBy(xpath = "(//div/input[@placeholder='Ajay'])[2]")
	private WebElement FirstName_TextField_xpath;
	
	@FindBy(xpath = "//div/ul/li[@id='react-autowhatever-itinerary_traveler--item-0']")
	private WebElement ClickOnEnteredPassengerName_Select_xpath;
	
	@FindBy(xpath = "(//div/label[text()='Select Date of Birth'])[1]")
	private WebElement DOB_TextFound_xpath1;
	
	@FindBy(xpath = "(//div/input[@placeholder='DD MMM, YYYY'])[1]")
	private WebElement ClickOnDOB_DateField_xpath1;
	
	@FindBy(xpath = "(//span[text()='2000'])[1]")
	private WebElement SelectDOB_Year_xpath1;
	
	@FindBy(xpath = "//span[@data-value='2']")
	private WebElement SelectDOB_Month_xpath;
	
	@FindBy(xpath = "//span[text()='20']")
	private WebElement SelectDOB_Day_xpath;
	
	@FindBy(xpath = "(//div/label[text()='Select Date of Birth'])[2]")
	//@FindBy(xpath = "(//div/label[@class='form-label'])[2]")
	private WebElement DOB_TextFound_xpath2;
	
	@FindBy(xpath = "(//div/input[@placeholder='DD MMM, YYYY'])[2]")
	private WebElement ClickOnDOB_DateField_xpath2;
	
	@FindBy(xpath = "(//span[text()='2000'])[2]")
	private WebElement SelectDOB_Year_xpath2;
	
	@FindBy(xpath = "//div/span[text()='PROCEED TO PAYMENT']")
	private WebElement ClickOnProceedToPayment_Button_xpath;
	
	@FindBy(xpath = "//div/span[text()='MAKE PAYMENT']")
	private WebElement ClickOnMakePayment_Button_xpath;
	
	@FindBy(xpath="(//div[@class='city-hdr'])[1]")
	public WebElement SearchPageFromCity_Info_xpath;
	
	@FindBy(xpath="(//div[@class='city-hdr'])[2]")
	public WebElement SearchPageToCity_Info_xpath;
	
	@FindBy(xpath="(//div/h5[@class='search-card--header'])[1]")
	public WebElement RecentSearch_Info_xpath;
	
	@FindBy(xpath="//div/h4[@class='status-title color-pri']")
	public WebElement BookingStatus_Info_xpath;
	
	@FindBy(xpath="(//div/table/tbody/tr/td/span[text()='Confirmed'])[1]")
	//@FindBy(xpath="//div/h4[text()='Flight booking is confirmed and your trip is insured.']")
	public WebElement OneWayBookingStatus_Info_xpath;
	
	@FindBy(xpath="(//div/table/tbody/tr/td/span[text()='Confirmed'])[2]")
	public WebElement ReturnBookingStatus_Info_xpath;
	
	@FindBy(xpath="(//div/span[@class='fare-summary-value'])[6]")
	public WebElement InsuranceAmount_Info_xpath;
	
	@FindBy(xpath="//span[@class='loader-text']")
	public WebElement Loader_xpath;
	
	@FindBy(xpath="(//div/span[@class='fare-summary-value'])[7]")
	public WebElement ConvenienceAmount_Info_xpath;
	
	@FindBy(xpath="//div/label[@class='balance']")
	public WebElement CompanyBalance_Info_xpath;
	
	@FindBy(xpath="//div[@class='fare-summary-section insurance-fare selected']")
	public WebElement InsuranceText_xpath;
	
	@FindBy(xpath="//div/input[@type='checkbox']")
	public WebElement Insurance_CheckBox_xpath;
	
	@FindBy(xpath="(//div[@class='insurance-img pos-relative'])[4]")
	public WebElement InsuranceBenefits_Button_xpath;
	
	@FindBy(xpath="//div[text()='TRAVEL INSURANCE BY ACKO INSURANCE PROVIDER']")
	public WebElement ListAllInsuranceBenefits_Info_xpath;
	
	@FindBy(xpath="//div/img[@class='insurance-info-close cursor-pointer']")
	public WebElement CloseInsuranceBenefits_Button_xpath;
	
	public Flights InsuranceBenefits(){
		SoftAssert sa= new SoftAssert();
        ScrollToElement(InsuranceBenefits_Button_xpath);
		click_Actions(InsuranceBenefits_Button_xpath);
		boolean actual = isElementDisplayed(ListAllInsuranceBenefits_Info_xpath);
		
		click_Actions(CloseInsuranceBenefits_Button_xpath);
		sa.assertTrue(actual);
		sa.assertAll();
		return this;
	}
	
	public Flights CheckInsurance(){
		SoftAssert sa= new SoftAssert();
		click_Actions(Insurance_CheckBox_xpath);
		boolean actual = isElementDisplayed(InsuranceText_xpath);
		sa.assertFalse(actual);
		sa.assertAll();
		return this;
	}
	
	public Flights InsuranceAmount(){
		waitForElementVisible(InsuranceAmount_Info_xpath);
		
		return this;
	}
	
	public Flights ConvenienceAmount(){
		waitForElementVisible(Loader_xpath);
		waitForElementInVisible(Loader_xpath);
		
		waitForElementVisible(ConvenienceAmount_Info_xpath);
		return this;
	}
	
	public Flights BookingStatus_Info_xpath(){
		waitForElementVisible(Loader_xpath);
		waitForElementInVisible(Loader_xpath);
		
		waitForElementVisible(BookingStatus_Info_xpath);
		return this;
	}

	public Flights Enter_OneWayTrip_Criteria(XSSFRow rowData) {
		
		writeText(EnterFromCity_textfield_xpath, rowData.getCell(1).toString());
		
		waitAndClickWebElement(ClickOnEnteredCity_Select_xpath);
		writeText(EnterToCity_textfield_xpath, rowData.getCell(2).toString());
		
		click_Actions(ClickOnEnteredCity_Select_xpath);
		click_Actions(OpenDepartureDate_Calendar_xpath);
		click_Actions(PickDepartureDate_Select_xpath);
		return this;
	}
	

	public Flights Enter_RoundTrip_Criteria(XSSFRow rowData) {	
		Enter_OneWayTrip_Criteria(rowData);
		click_Actions(OpenArrivalDate_Calendar_xpath);
		click_Actions(PickArrivalDate_Select_xpath);
		
		return this;
	}
	
	public Flights AddMoreThan_OnePassenger(){
		waitAndClickWebElement(ClickToAddPassenger_xpath);
		
		waitAndClickWebElement(AddPassenger_xpath);
		click_Actions(ClickAnyWhereOnTheScreen_xpath);
		isMoreThanOnePass = true;
		return this;
	}
	
	public FlightList_Travel ClickonSearchFlightd(){
		
		click_Actions(ClickOnSearch_Button_xpath);
		
		return new FlightList_Travel(this.getThreadSafeDriver());		
	}
	
	public Flights ClickonSearchFlight(){
		
		click_Actions(ClickOnSearch_Button_xpath);
		
		return this;		
	}
	
	
public Flights selectRandomOneWayFlight(){
	    // Find and click on a random flight
	    List<WebElement> allOneWayFlights = getThreadSafeDriver().findElements(By.xpath("//div/span[contains(text(),'BOOK NOW')]/ancestor::div//span[text()='Regular']"));
	    List<WebElement> allBookNowButtons = getThreadSafeDriver().findElements(By.xpath("//div/span[text()='BOOK NOW']"));
	    Random rand = new Random();
	    int randomFlight = rand.nextInt(allOneWayFlights.size());
	    
	    allOneWayFlights.get(randomFlight).click();
	   
//
	    
//	    allBookNowButtons.get(randomFlight).click();
	    return this;
	}

	
	
public Flights selectRandomRoundTripFlight(){
	    // Find and click on a random flight
	    List<WebElement> allOnwardTripFlights = getThreadSafeDriver().findElements(By.xpath("//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt left']//span[text()='Regular']"));
	    List<WebElement> allReturnTripFlights = getThreadSafeDriver().findElements(By.xpath("//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt right']//span[text()='Regular']"));
	    Random rand = new Random();
	    int randomFlight = rand.nextInt(allOnwardTripFlights.size());
	    
	    allOnwardTripFlights.get(randomFlight).click();
	    
	    allReturnTripFlights.get(randomFlight).click();
	    return this;
	}


	public Flights ClickonRecentSearchButton(){
		click_Actions(RecentSearch_Button_xpath);
		return this;
	}
	
//	public Flights SelectOneWayFlightAndClickOnBookNowButton(){
//		
////		selectRandomOneWayFlight();
//		 waitForElementVisible(SelectFlight_Selection_xpath);
//		 click_Actions(SelectFlight_Selection_xpath);
//		 waitForElementToClickable(BookNow_Button_xpath);
//		 click_Actions(BookNow_Button_xpath);
//		return this;
//		}
	
//	public Flights SelectOnwardReturnFlightAndClickOnBookNowButton() throws Exception{
//		waitForElementVisible(SelectOnwardFlight_Selection_xpath);
//		
//		click_Actions(SelectOnwardFlight_Selection_xpath);
//		
//		click_Actions(SelectReturnFlight_Selection_xpath);
////		moveToElement_Actions(BookNowRoundTrip_Button_xpath);
//		
//		waitAndClickWebElement(BookNowRoundTrip_Button_xpath);
//		return this;
//	}
	
	
public Flights SelectOneWayFlightAndClickOnBookNowButton(){

		waitForElementVisible(SpiceJetFlight_Filter_xpath);
		ScrollToElement(SpiceJetFlight_Filter_xpath);
		waitForElementToClickable(SpiceJetFlight_Filter_xpath);
		
		click_Actions(SpiceJetFlight_Filter_xpath);
		waitForElementToClickable(Select_CorporateFlight_xpath.get(1));
		
		click_Actions(Select_CorporateFlight_xpath.get(1));
		waitForElementToClickable(BookNow_Button_xpath.get(1));
		click_Actions(BookNow_Button_xpath.get(1));
		return this;
	}
	
	public Flights SelectOnwardReturnFlightAndClickOnBookNowButton(){
		waitForElementVisible(SpiceJetFlight_Filter_xpath);
		ScrollToElement(SpiceJetFlight_Filter_xpath);
		waitForElementToClickable(SpiceJetFlight_Filter_xpath);
		
		click_Actions(SpiceJetFlight_Filter_xpath);
		waitForElementToClickable(SelectOnwardFlight_Selection_xpath.get(1));
		
		click_Actions(SelectOnwardFlight_Selection_xpath.get(1));
		click_Actions(SelectReturnFlight_Selection_xpath.get(1));
		waitAndClickWebElement(BookNowRoundTrip_Button_xpath);
		return this;
	}

	
	public Flights TravellerDetails(XSSFRow rowData){
		ScrollToElement(AddTravellerInformation_Button_xpath);
		
		waitAndClickWebElement(AddTravellerInformation_Button_xpath);
		
		click_Actions(ClickOnUserName_RadioButton_xpath);
		
//		if(isElementDisplayed(ClickOnDOB_DateField_xpath1)){
//				Select_DOB1();
//		}
//		
		if(isMoreThanOnePass) {
			AddSecondPassengerDetails(rowData);
//			if(isElementDisplayed(ClickOnDOB_DateField_xpath1)){
//				Select_DOB2();
//		}
		}
		return this;
	}
	
	
	
public Flights Select_DOB1(){
		//if(isElementDisplayed(DOB_TextFound_xpath1)){
		
			click_Actions(ClickOnDOB_DateField_xpath1);
			
			waitAndClickWebElement(SelectDOB_Year_xpath1);
			waitAndClickWebElement(SelectDOB_Month_xpath);
			waitAndClickWebElement(SelectDOB_Day_xpath);	
		return this;
	}
	
	
	public Flights Select_DOB2(){
			click_Actions(ClickOnDOB_DateField_xpath2);
			
			waitAndClickWebElement(SelectDOB_Year_xpath2);
			waitAndClickWebElement(SelectDOB_Month_xpath);
			waitAndClickWebElement(SelectDOB_Day_xpath);
		return this;
	}
	

	public Flights AddSecondPassengerDetails(XSSFRow rowData){
			waitForElementVisible(FirstName_TextField_xpath);
			waitForElementToClickable(FirstName_TextField_xpath);
			writeText(FirstName_TextField_xpath, rowData.getCell(0).toString());
			waitForElementVisible(ClickOnEnteredPassengerName_Select_xpath);
			waitForElementToClickable(ClickOnEnteredPassengerName_Select_xpath);
			
			click_Actions(ClickOnEnteredPassengerName_Select_xpath);	
		return this;
	}
	
	public Flights ClickOnProceedToPayment(){
		waitForElementVisible(ClickOnProceedToPayment_Button_xpath);
		click_Actions(ClickOnProceedToPayment_Button_xpath);
		return this;
	}
	
	public Flights ClickOnMakePayment(){
		waitForElementVisible(ClickOnMakePayment_Button_xpath);
//		waitForElementToClickable(ClickOnMakePayment_Button_xpath);
		click_Actions(ClickOnMakePayment_Button_xpath);
		return this;
	}
	
}

*/