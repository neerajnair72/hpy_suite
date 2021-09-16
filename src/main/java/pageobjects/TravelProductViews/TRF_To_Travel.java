/*
package pageobjects.TravelProductViews;

import java.util.ArrayList;
import java.util.Set;

import frameworkBase.TestBotElementsWrapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;

public class TRF_To_Travel extends TestBotElementsWrapper {
	
	Set<String> handles;
	String currentHandle;
	ArrayList<String> tabs2;

	@FindBy(xpath = "//span[text()='Request New Travel']")
	private WebElement RequestNewTravel_Button_xpath;
	
	@FindBy(xpath = "//div/input[@id='trfName']")
	private WebElement TRFName_TextField_xpath;
	
	@FindBy(xpath = "//div/input[@id='trfDescription']")
	private WebElement TRFDescription_TextField_xpath;
	
	@FindBy(xpath = "//div/button/span[text()='Add Trips']")
	private WebElement AddTrips_Button_xpath;
	
	@FindBy(xpath = "//div/button/span[text()='+ Add New Trip']")
	private WebElement AddNewTrips_Button_xpath;
	
	@FindBy(xpath = "//div/input[@value='Domestic']")
	private WebElement Domestic_RadioButton_xpath;
	
	@FindBy(xpath = "//div/input[@value='Round Trip']")
	private WebElement RoundTrip_RadioButton_xpath;
	
	@FindBy(xpath = "//input[@id='9305-9306-9490-9493-9496']")
	private WebElement OneWayFromCity_AutosuggestField_xpath;
	
	@FindBy(xpath = "//input[@id='9305-9306-9490-9493-9497']")
	private WebElement OneWayToCity_AutosuggestField_xpath;
	
	@FindBy(xpath = "//input[@id='9305-9306-9490-9493-9500']")
	private WebElement RoundTripFromCity_AutosuggestField_xpath;
	
	@FindBy(xpath = "//input[@id='9305-9306-9490-9493-9501']")
	private WebElement RoundTripToCity_AutosuggestField_xpath;
	
	@FindBy(xpath = "//div/label[@for='9305-9306-9490-9493-9498']")
	private WebElement OneWayDepDate_DateField_xpath;
	
	@FindBy(xpath = "//div/label[@for='9305-9306-9490-9493-9502']")
	private WebElement RoundTripDepDate_DateField_xpath;
	
	@FindBy(xpath = "//div/label[@for='9305-9306-9490-9493-9503']")
	private WebElement RoundTripReturnDate_DateField_xpath;
	
	@FindBy(xpath = "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	private WebElement SelectDate_Calendar_xpath;
	
	@FindBy(xpath = "//div/button[@class='neutralButton']")
	private WebElement BookFlights_Button_xpath;
	
	@FindBy(xpath = "//div[text()='Please select your flight preferences']")
	public WebElement TravelPortal_AddPreferencesValidation_xpath;
	
	@FindBy(xpath="//div[@class='non-violated-preference preferences-container fs-11 ']")
	public WebElement SelectedPreferences_Table_xpath;
	
	@FindBy(xpath = "(//div[@class='tick-icon'])[1]")
	private WebElement FirstFlightPreference_Selection_xpath;
	
	@FindBy(xpath = "(//div[@class='tick-icon'])[2]")
	private WebElement SecondFlightPreference_Selection_xpath;
	
	@FindBy(xpath = "(//div[@class='tick-icon'])[3]")
	private WebElement ThirdFlightPreference_Selection_xpath;
	
	@FindBy(xpath = "(//div[@class='tick-icon'])[4]")
	private WebElement FourthFlightPreference_Selection_xpath;
	
	@FindBy(xpath = "(//div[@class='card-lay'])[4]")
	private WebElement CardLay_Selection_xpath;
	
	@FindBy(xpath = "(//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt left']//span[text()='Regular'])[1]")
	private WebElement FirstOnwardPreference_Selection_xpath;
	
	@FindBy(xpath = "(//div[@class='sort-container default']/ancestor::div[@class='new-travel-roundcnt right']//span[text()='Regular'])[1]")
	private WebElement FirstReturnPreference_Selection_xpath;
	
	@FindBy(xpath = "(//div/span[text()='Select'])[1]") //Regular Flight
	private WebElement Select1_Button_xpath;
	
	@FindBy(xpath = "//div/span[text()='PROCEED']") 
	private WebElement OneWayProceed_Button_xpath;
	
	@FindBy(xpath = "//div/button[@class='proceed-button mt-40']") 
	private WebElement RoundTripProceed_Button_xpath;
	
	@FindBy(xpath = "//div[@class='preference-close-button position-preferecen-close-button']") //Regular Flight
	private WebElement RemovePreference_icon_xpath;
	
	@FindBy(xpath = "//div/span[text()='This flight is already selected']")
	private WebElement SameFlightSelected_message_xpath;
	
	@FindBy(xpath = "//div/span[text()='Sorry, more than 3 preferences are not allowed.']")
	private WebElement FourthFlightSelected_message_xpath;
	
	@FindBy(xpath = "//div[text()='Flight preferences added successfully']")
	public WebElement PreferencesAddedSuccessfully_message_xpath;
	
	@FindBy(xpath = "//span[contains(text(),'View Selected Flights')]")
	public WebElement ViewSelectedFlights_Button_xpath;
	
	@FindBy(xpath = "//div/span/img[@src = './assets/images/popup-close-button.svg']")
	public WebElement CloseViewSelectedFlights_POPUP_xpath;
	
	@FindBy(xpath = "//span[contains(text(),'View Selected Flights')]")
	public WebElement AddedPreferences_Info_xpath;
	
	@FindBy(xpath = "//div/button/span[text()='Add Trip']")
	private WebElement AddTrip_Button_xpath;
	
	@FindBy(xpath = "//div/span[contains(text(), 'Book Flights (9507)')]")
	public WebElement ViewFlights_Info_xpath;
	
	public TRF_To_Travel Wait(){
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
		pageWrapper.shortWait();
		return this;
	}
	
	public TRF_To_Travel CreateTRF_OneWayTrip(XSSFRow rowData){
		pageWrapper.shortWait();
		pageWrapper.click_Actions(RequestNewTravel_Button_xpath);
		pageWrapper.writeText(TRFName_TextField_xpath, rowData.getCell(0).toString());
		pageWrapper.writeText(TRFDescription_TextField_xpath, rowData.getCell(1).toString());
		pageWrapper.shortWait();
		pageWrapper.click_Actions(AddTrips_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(AddNewTrips_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Domestic_RadioButton_xpath);
		pageWrapper.shortWait();
		pageWrapper.writeText(OneWayFromCity_AutosuggestField_xpath, rowData.getCell(2).toString());
		pageWrapper.shortWait();
		OneWayFromCity_AutosuggestField_xpath.sendKeys(Keys.DOWN, Keys.RETURN);
		pageWrapper.shortWait();
		pageWrapper.writeText(OneWayToCity_AutosuggestField_xpath, rowData.getCell(3).toString());
		pageWrapper.shortWait();
		OneWayToCity_AutosuggestField_xpath.sendKeys(Keys.DOWN, Keys.RETURN);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(OneWayDepDate_DateField_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(SelectDate_Calendar_xpath);
		pageWrapper.shortWait();
		pageWrapper.ScrollToElement(BookFlights_Button_xpath);
		pageWrapper.click_Actions(BookFlights_Button_xpath);
		pageWrapper.longWait();
		
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	 
		return this;
	}
	
	public TRF_To_Travel SelectPreferences(){	
		pageWrapper.shortWait();
		pageWrapper.waitForElementToClickable(FirstFlightPreference_Selection_xpath);
		pageWrapper.click_Actions(FirstFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		
		boolean actual = pageWrapper.isElementDisplayed(SelectedPreferences_Table_xpath);
	    sa.assertTrue(actual);
 		sa.assertAll();
// 		driver.close();
		return this;
	}
	
	public TRF_To_Travel RemoveSelectedPreference(){
		pageWrapper.shortWait();
		pageWrapper.waitForElementToClickable(FirstFlightPreference_Selection_xpath);
		pageWrapper.click_Actions(FirstFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(RemovePreference_icon_xpath);
		
		boolean actual = pageWrapper.isElementDisplayed(SelectedPreferences_Table_xpath);
	    sa.assertFalse(actual);
 		sa.assertAll();
// 		driver.close();
		return this;
	}
	 
	public TRF_To_Travel SelectSameFlight(){
		pageWrapper.shortWait();
		pageWrapper.waitForElementToClickable(FirstFlightPreference_Selection_xpath);
		pageWrapper.click_Actions(FirstFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(FirstFlightPreference_Selection_xpath);
		
		boolean actual = pageWrapper.isElementDisplayed(SameFlightSelected_message_xpath);
	    sa.assertTrue(actual);
 		sa.assertAll();
// 		driver.close();
		return this;
	}
	
	
	public TRF_To_Travel SelectFourPreferences(){
		pageWrapper.shortWait();
		pageWrapper.waitForElementToClickable(FirstFlightPreference_Selection_xpath);
		pageWrapper.click_Actions(FirstFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(SecondFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(ThirdFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.ScrollToElement(ThirdFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(FourthFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		
		boolean actual = pageWrapper.isElementDisplayed(FourthFlightSelected_message_xpath);
	    sa.assertTrue(actual);
 		sa.assertAll();
// 		driver.close();
		return this;
	}
	
	public TRF_To_Travel CreateTRF_RoundTrip(XSSFRow rowData){
		pageWrapper.shortWait();
		pageWrapper.click_Actions(RequestNewTravel_Button_xpath);
		pageWrapper.writeText(TRFName_TextField_xpath, rowData.getCell(0).toString());
		pageWrapper.writeText(TRFDescription_TextField_xpath, rowData.getCell(1).toString());
		pageWrapper.shortWait();
		pageWrapper.click_Actions(AddTrips_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(AddNewTrips_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Domestic_RadioButton_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(RoundTrip_RadioButton_xpath);
		pageWrapper.shortWait();
		pageWrapper.writeText(RoundTripFromCity_AutosuggestField_xpath, rowData.getCell(2).toString());
		pageWrapper.shortWait();
		RoundTripFromCity_AutosuggestField_xpath.sendKeys(Keys.DOWN, Keys.RETURN);
		pageWrapper.shortWait();
		pageWrapper.writeText(RoundTripToCity_AutosuggestField_xpath, rowData.getCell(3).toString());
		pageWrapper.shortWait();
		RoundTripToCity_AutosuggestField_xpath.sendKeys(Keys.DOWN, Keys.RETURN);
		pageWrapper.shortWait();
//		pageWrapper.ScrollToElement(RoundTripDepDate_DateField_xpath);
		pageWrapper.click_Actions(RoundTripDepDate_DateField_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(SelectDate_Calendar_xpath);
		pageWrapper.shortWait();
//		pageWrapper.ScrollToElement(RoundTripDepDate_DateField_xpath);
		pageWrapper.click_Actions(RoundTripReturnDate_DateField_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(SelectDate_Calendar_xpath);
		pageWrapper.shortWait();
		pageWrapper.ScrollToElement(BookFlights_Button_xpath);
		pageWrapper.click_Actions(BookFlights_Button_xpath);
		pageWrapper.longWait();
		
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		return this;
	}
	
	public TRF_To_Travel CheckProceedButton(){
		pageWrapper.shortWait();
		pageWrapper.click_Actions(FirstOnwardPreference_Selection_xpath);
		pageWrapper.shortWait();
		
		boolean actual = pageWrapper.isElementDisplayed(RoundTripProceed_Button_xpath);
	    sa.assertFalse(actual);
 		sa.assertAll();
		return this;
	}
	
	public TRF_To_Travel ProceedToAddFlightPreference(){
		pageWrapper.shortWait();
		pageWrapper.waitForElementToClickable(FirstFlightPreference_Selection_xpath);
		pageWrapper.click_Actions(FirstFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(SecondFlightPreference_Selection_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(Select1_Button_xpath);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(OneWayProceed_Button_xpath);
		return this;
	}
	
	public TRF_To_Travel ViewSelectedFlights(){
		pageWrapper.shortWait();
		pageWrapper.click_Actions(ViewSelectedFlights_Button_xpath);
		pageWrapper.click_Actions(CloseViewSelectedFlights_POPUP_xpath);
		boolean actual = pageWrapper.isElementDisplayed(AddedPreferences_Info_xpath);
	    sa.assertTrue(actual);
 		sa.assertAll();
 		pageWrapper.click_Actions(CloseViewSelectedFlights_POPUP_xpath);
		return this;
	}
	
	public TRF_To_Travel AddTrips(){
		pageWrapper.shortWait();
		pageWrapper.click_Actions(AddTrip_Button_xpath);
		pageWrapper.click_Actions(ViewFlights_Info_xpath);
		return this;
	}
	
}
*/
