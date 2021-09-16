package pageobjects.TravelNew;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;

public class BookingEngine extends TestBotElementsWrapper {
	
	/** Round trip radio button */
	@FindBy (xpath = "//input[contains(@value,'2')]")
	private WebElement RoundTrip_RadioButton_xpath;
	
	/** Multi-City radio button */
	@FindBy (xpath = "//input[contains(@value,'3')]")
	private WebElement MultiCity_RadioButton_xpath;
	
	/** From City mandatory toast message */
	@FindBy (xpath = "//div[text() = 'Please select from city']")
	private WebElement BookingEngineMandatoryField_ToastMessage_xpath;
	
	/** Return date mandatory toast message */
	@FindBy (xpath = "//div[text() = 'Please select return date']")
	private WebElement ReturnDate_ToastMessage_xpath;
	
	/** Same From and To City toast message */
	@FindBy (xpath = "//div[text() = 'From and To city should not be same']")
	private WebElement SameFromAndToCity_ToastMessage_xpath;
	
	/** From city text field */
	@FindBy (xpath = "//div/input[@placeholder = 'Enter Source city']")
	private WebElement FromCity_Field_xpath;
	
	/** From city suggestion selection */
	@FindBy (xpath = "//div[text()='Bangalore']")
	private WebElement FromCity_Select_xpath;
	
	/** From City info in Search page */
	@FindBy (xpath = "(//div[@class = 'city-hdr'])[1]")
	public WebElement SearchPageInfo_FromCity_xpath;
	
	/** To city text field */
	@FindBy (xpath = "//div/input[@placeholder = 'Enter Destination city']")
	private WebElement ToCity_Field_xpath;
	
	/** To city suggestion selection */
	@FindBy (xpath = "//div[text()='Mumbai']")
	private WebElement ToCity_Select_xpath;
	
	/** Common xpath for city suggestion selection */
	@FindBy (xpath = "(//div[@class ='passenger-div'])[1]")
	private WebElement City_CommonSelect_xpath;
	
	/** To City info in Search page */
	@FindBy (xpath = "(//div[@class = 'city-hdr'])[2]")
	public WebElement SearchPageInfo_ToCity_xpath;
	
	/** To City info in Search page */
	@FindBy (xpath = "//span[text() = 'Flight Review']")
	public WebElement TripReviewInfo_Info_xpath;
	
	/** Recent Search info in Recent search card */
	@FindBy (xpath = "//h4[text() = 'BLR'][text() = 'BOM']")
	private WebElement RecentSearch_Info_xpath;
	
	/** Departure Date field */
	@FindBy (xpath = "//div/input[@placeholder = 'Select Departure date']")
	private WebElement DepartureDate_Calendar_xpath;
	
	/** Departure Date selection */
	@FindBy (xpath = "(//button[text()='20'])[3]")
	private WebElement PickDepartureDate_Select_xpath;
	
	/** Return Date field */
	@FindBy (xpath = "//div/input[@placeholder = 'Select Return date']")
	private WebElement ReturnDate_Calendar_xpath;
	
	/** Return Date selection */
	@FindBy (xpath = "(//button[text()='21'])[3]")
	private WebElement PickReturnDate_Select_xpath;
	
	/** Search button */
	@FindBy (xpath = "//div/span[text() = 'Search Flight']")
	private WebElement SearchFlight_Button_xpath;
	
	/** Back button in flight search screen */
	@FindBy (xpath = "//img[contains(@src,'back.svg')]")
	private WebElement FlightSearch_BackButton_xpath;
	
	/** Sort option */
	@FindBy (xpath = "//li[text() = 'Airlines']")
	private WebElement Sort_Info_xpath;
	
	/** Online button in request type pop up */
	@FindBy (xpath = "//div/button[text() = 'Online']")
	private WebElement PopUpOnline_Button_xpath;
	
	/** Offline button in request type pop up */
	@FindBy (xpath = "//div/button[text() = 'Offline']")
	private WebElement PopUpOffline_Button_xpath;
	
	/** Close icon in request type pop up */
	@FindBy (xpath = "//div[contains(@class,'hw-dialogBox')]//div[contains(@class,'')]//div//i[contains(@class,'icon-cross font-20 rotate-0')]")
	private WebElement RequestType_CloseIcon_xpath;
	
	/** Recent search card */
	@FindBy (xpath = "(//div[@class = 'search-card'])[1]")
	private WebElement RecentSearch_Card_xpath;
	
	/** Swap icon */
	@FindBy (xpath = "//i[@class='hw-icons icon  icon-return font-20 rotate-0']")
	private WebElement Swap_Icon_xpath;
	
	/** Value in From city field */
	@FindBy (xpath = "//input[contains(@value,'Mumbai')]")
	private WebElement ValueInFromCityField;
	
	/** From Preferred time drop-down */
	@FindBy (xpath = "//input[contains(@placeholder,'From')]")
	private WebElement FromPreferredTime_Dropdown_xpath;
	
	/** To Preferred time drop-down */
	@FindBy (xpath = "//input[contains(@placeholder,'To')]")
	private WebElement ToPreferredTime_Dropdown_xpath;
	
	/** Select From Preferred time */
	@FindBy (xpath = "//li/span[text()= '12:00 AM']")
	private WebElement SelectFromPreferredTime_Selection_xpath;
	
	/** Select Preferred time */
	@FindBy (xpath = "//li/span[text()= '04:00 AM']")
	private WebElement SelectToPreferredTime_Selection_xpath;
	
	/** To Preferred time missing toast message */
	@FindBy (xpath = "//div[text() = 'Please select onward to preferred time']")
	private WebElement ToPreferredTimeMissing_ToastMessage_xpath;
	
	/** By default Preferred Time selected in filter */
	@FindBy (xpath = "//div[@class = 'pt-selected d-flex']")
	private WebElement DefaultPreferredTimeSelected_Filter_xpath;
	
	/** By default Preferred Time not selected in filter */
	@FindBy (xpath = "((//span[text() = '06-12'])[1])/ancestor::div[@class = 'd-flex']")
	private WebElement DefaultPreferredTimeNotSelected_Filter_xpath;
	
	/** Add flight in Multi City */
	@FindBy (xpath = "//div[text() = 'Add Flight']")
	private WebElement MultiCityAddFlight_Button_xpath;
	
	/** Flight number in Multi City */
	@FindBy (xpath = "//div[text() = 'Flight '][text() = '2']")
	private WebElement MultiCityFlightNumber_Label_xpath;
	
	/** Remove added flight in Multi City */
	@FindBy (xpath = "//div[@class='fbe-mc-flightheader']//i[1]")
	private WebElement RemoveAddedFlightInMultiCity_CloseIcon_xpath;
	
	/** Domestic Extra field */
	@FindBy (xpath = "//label[text() = 'abc']")
	private WebElement DomescticExtraField_Header_xpath;
	
	/** International Extra field */
	@FindBy (xpath = "//label[text() = 'Additional Remarks']")
	private WebElement InternationalExtraField_Header_xpath;
	
	/** By default Direct flight selected in filter */
	@FindBy (xpath = "//div[@class ='stop-selected stops-box']")
	private WebElement DefaultDirectFlightSelected_Filter_xpath;
	
	/** Direct Flight check-box */
	@FindBy (xpath = "//span[text()='Show Direct flights']")
	private WebElement DirectFlight_CheckBox_xpath;
	
	/** Travelers drop-down */
	@FindBy (xpath = "//input[@value='1 Traveller, Economy Class']")
	private WebElement Travelers_Dropdown_xpath;
	
	/** Add Travelers */
	@FindBy (xpath = "(//span[@class = 'spinner-icon '])[1]")
	private WebElement AddTravelers_IncrementIcon_xpath;
	
	/** Business class */
	@FindBy (xpath = "//input[@value='B']")
	private WebElement BusinessClassCabin_RadioButton_xpath;
	
	/** Added Travelers info in Search Page */
	@FindBy (xpath = "//div[text() ='2'][text() = 'Travellers']")
	private WebElement SearchPageTraveller_Info_xpath;
	
	/** Business Class info in Search Page */
	@FindBy (xpath = "//div[text() ='Business']")
	private WebElement SearchPageBusinessClass_Info_xpath;
	
	/** Click anywhere on the screen */
	@FindBy (xpath = "//input[@value='2 Travellers, Business Class']")
	private WebElement ClickAnywhereOnTheScreen_xpath;
	


	
	
	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElementsTravelNew.class).logout();
	}
	
	@Step("{method}")
	public BookingEngine ClickOnSearchFlight_WithoutMandatoryFields() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		boolean Actual = isElementDisplayed(BookingEngineMandatoryField_ToastMessage_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public FlightSearch ClickOnSearchFlight_WithOneWayFlightCriteria(XSSFRow rowData){
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(ToCity_Select_xpath);
		waitAndClickWebElement(ToCity_Select_xpath);

		waitAndClickWebElement(DepartureDate_Calendar_xpath);
		waitAndClickWebElement(PickDepartureDate_Select_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		isElementDisplayed(SearchPageInfo_FromCity_xpath);
		
		return GetInstance(FlightSearch.class);
	}
	
	@Step("{method}")
	public BookingEngine ClickOnSearchFlight_WithSameFromAndToCity(XSSFRow rowData){
		SoftAssert sa = new SoftAssert();
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(1).toString());
		isElementDisplayed(FromCity_Select_xpath);
		waitAndClickWebElement(FromCity_Select_xpath);

		waitAndClickWebElement(DepartureDate_Calendar_xpath);
		waitAndClickWebElement(PickDepartureDate_Select_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		String Actual = SameFromAndToCity_ToastMessage_xpath.getText();
		sa.assertEquals(Actual, "From and To city should not be same");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine RequestTypePopUp_WithOnlineAndOfflineButtons(XSSFRow rowData){
		SoftAssert sa = new SoftAssert();
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(ToCity_Select_xpath);
		waitAndClickWebElement(ToCity_Select_xpath);

		waitAndClickWebElement(DepartureDate_Calendar_xpath);
		waitAndClickWebElement(PickDepartureDate_Select_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		boolean Actual1 = isElementDisplayed(PopUpOnline_Button_xpath);
		boolean Actual2 = isElementDisplayed(PopUpOffline_Button_xpath);
		waitAndClickWebElement(RequestType_CloseIcon_xpath);
		sa.assertTrue(Actual1);
		sa.assertTrue(Actual2);
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine RoundTrip_WithoutDepartureDate(XSSFRow rowData){
		SoftAssert sa = new SoftAssert();
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(ToCity_Select_xpath);
		waitAndClickWebElement(ToCity_Select_xpath);

		waitAndClickWebElement(DepartureDate_Calendar_xpath);
		waitAndClickWebElement(PickDepartureDate_Select_xpath);
		RoundTrip_RadioButton_xpath.click();
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		String Actual = ReturnDate_ToastMessage_xpath.getText();
		sa.assertEquals(Actual, "Please select return date");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine VerifyRecentSearch(XSSFRow rowData){
		SoftAssert sa = new SoftAssert();
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(ToCity_Select_xpath);
		waitAndClickWebElement(ToCity_Select_xpath);

		waitAndClickWebElement(DepartureDate_Calendar_xpath);
		waitAndClickWebElement(PickDepartureDate_Select_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		
		fluentWaitForElementVisible(Sort_Info_xpath);
//		waitForElementVisible(FlightSearch_BackButton_xpath);
		waitAndClickWebElement(FlightSearch_BackButton_xpath);
		
		waitForElementVisible(RecentSearch_Info_xpath);
		String Actual = RecentSearch_Info_xpath.getText();
		sa.assertEquals(Actual, "BLRBOM");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine RecentSearch(){
		SoftAssert sa = new SoftAssert();
		
		waitAndClickWebElement(RecentSearch_Card_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		
		waitForElementVisible(SearchPageInfo_FromCity_xpath);
		String Actual1 = SearchPageInfo_FromCity_xpath.getText();
		String Actual2 = SearchPageInfo_ToCity_xpath.getText();
		sa.assertEquals(Actual1,"Bangalore (BLR)");
		sa.assertEquals(Actual2,"Mumbai (BOM)");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine SwapCity(XSSFRow rowData){
		SoftAssert sa = new SoftAssert();
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(ToCity_Select_xpath);
		waitAndClickWebElement(ToCity_Select_xpath);
		waitAndClickWebElement(Swap_Icon_xpath);
		boolean Actual = isElementDisplayed(ValueInFromCityField);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine PreferredTime(){
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(RecentSearch_Card_xpath);
		waitAndClickWebElement(FromPreferredTime_Dropdown_xpath);
		waitAndClickWebElement(SelectFromPreferredTime_Selection_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		String Actual = ToPreferredTimeMissing_ToastMessage_xpath.getText();
		sa.assertEquals(Actual, "Please select onward to preferred time");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine DefaultPreferredTimeFilter(){
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(RecentSearch_Card_xpath);
		waitAndClickWebElement(FromPreferredTime_Dropdown_xpath);
		waitAndClickWebElement(SelectFromPreferredTime_Selection_xpath);
		waitAndClickWebElement(ToPreferredTime_Dropdown_xpath);
		waitAndClickWebElement(SelectToPreferredTime_Selection_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		
		boolean Actual1 = isElementDisplayed(DefaultPreferredTimeSelected_Filter_xpath);
		boolean Actual2 = isElementDisplayed(DefaultPreferredTimeNotSelected_Filter_xpath);
		sa.assertTrue(Actual1, "00-06 time should be selected by default");
		sa.assertTrue(Actual2, "06-12 time should not be selected");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine AddFlightInMultiCity(){
		SoftAssert sa = new SoftAssert();
		
		isElementDisplayed(FromCity_Field_xpath);
		MultiCity_RadioButton_xpath.click();
		waitAndClickWebElement(MultiCityAddFlight_Button_xpath);
		
		boolean Actual = isElementDisplayed(MultiCityFlightNumber_Label_xpath);
		sa.assertTrue(Actual,"Added flight in Multi city");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine RemoveFlightInMultiCity(){
		SoftAssert sa = new SoftAssert();
		
		isElementDisplayed(FromCity_Field_xpath);
		MultiCity_RadioButton_xpath.click();
		waitAndClickWebElement(MultiCityAddFlight_Button_xpath);
		waitAndClickWebElement(RemoveAddedFlightInMultiCity_CloseIcon_xpath);
		
		boolean Actual = isElementDisplayed(MultiCityFlightNumber_Label_xpath);
		sa.assertFalse(Actual,"Added flight in Multi city");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine MultiCitySearch_WithOneWayFlightCriteria() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(RecentSearch_Card_xpath);
		moveToElement_Actions(MultiCity_RadioButton_xpath);
		safeJavaScriptClick(MultiCity_RadioButton_xpath);
		
		waitAndClickWebElement(SearchFlight_Button_xpath);
	
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}	
		waitForElementVisible(SearchPageInfo_FromCity_xpath);
		String Actual1 = SearchPageInfo_FromCity_xpath.getText();
		String Actual2 = SearchPageInfo_ToCity_xpath.getText();
		sa.assertEquals(Actual1,"Bangalore (BLR)");
		sa.assertEquals(Actual2,"Mumbai (BOM)");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public FlightSearch OfflineSearch() throws Exception{
		waitAndClickWebElement(RecentSearch_Card_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		waitAndClickWebElement(PopUpOffline_Button_xpath);
		waitForElementVisible(TripReviewInfo_Info_xpath);
		
		return GetInstance(FlightSearch.class);
	}
	
	@Step("{method}")
	public BookingEngine BookingEngineExtraFields(XSSFRow rowData){
		SoftAssert sa = new SoftAssert();
		isElementDisplayed(DomescticExtraField_Header_xpath);
		String Actual1 = DomescticExtraField_Header_xpath.getText();
		
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(City_CommonSelect_xpath);
		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(City_CommonSelect_xpath);
		waitAndClickWebElement(City_CommonSelect_xpath);
		
		isElementDisplayed(InternationalExtraField_Header_xpath);
		String Actual2 = InternationalExtraField_Header_xpath.getText();
		sa.assertFalse(Actual1.equals(Actual2));
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine DirectFlight() throws Exception{
		SoftAssert sa = new SoftAssert();
		
		waitAndClickWebElement(RecentSearch_Card_xpath);
		safeJavaScriptClick(DirectFlight_CheckBox_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		
		waitForElementVisible(DefaultDirectFlightSelected_Filter_xpath);
		boolean Actual = isElementDisplayed(DefaultDirectFlightSelected_Filter_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public BookingEngine AddTravellersAndCabin() throws Exception{
		SoftAssert sa = new SoftAssert();
		
		waitAndClickWebElement(RecentSearch_Card_xpath);
		waitAndClickWebElement(Travelers_Dropdown_xpath);
		waitForElementVisible(AddTravelers_IncrementIcon_xpath);
		waitAndClickWebElement(AddTravelers_IncrementIcon_xpath);
		BusinessClassCabin_RadioButton_xpath.click();
		doubleClick(SearchFlight_Button_xpath);
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		
		waitForElementVisible(SearchPageTraveller_Info_xpath);
		boolean Actual1 = isElementDisplayed(SearchPageTraveller_Info_xpath);
		boolean Actual2 = isElementDisplayed(SearchPageBusinessClass_Info_xpath);
		
		sa.assertFalse(Actual1, "2 Passengers");
		sa.assertTrue(Actual2, "Business class");
		sa.assertAll();
		return GetInstance(BookingEngine.class);
	}
	
	@Step("{method}")
	public FlightSearch ClickOnSearchFlight_WithRoundTripFlightCriteria(XSSFRow rowData){
		writeText(FromCity_Field_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(FromCity_Select_xpath);

		writeText(ToCity_Field_xpath, rowData.getCell(2).toString());
		isElementDisplayed(ToCity_Select_xpath);
		waitAndClickWebElement(ToCity_Select_xpath);

		waitAndClickWebElement(DepartureDate_Calendar_xpath);
		waitAndClickWebElement(PickDepartureDate_Select_xpath);
		RoundTrip_RadioButton_xpath.click();
		
		waitAndClickWebElement(ReturnDate_Calendar_xpath);
		waitAndClickWebElement(PickReturnDate_Select_xpath);
		
		waitAndClickWebElement(SearchFlight_Button_xpath);
		
		if(isElementDisplayed(PopUpOnline_Button_xpath)){
			waitAndClickWebElement(PopUpOnline_Button_xpath);
		}
		isElementDisplayed(SearchPageInfo_FromCity_xpath);
		
		return GetInstance(FlightSearch.class);
	}
	

	
	/***************************************************************************/
	
	
	/* Hotel locators */
	
	/** The Hotel  Flex field */
	@FindBy (xpath = "//div[text()='hotel']")
	private WebElement BookingEngine_Hotel_xpath;
	
	/** The Location  text field */
	@FindBy (xpath = "//input[@placeholder='Enter Locality, Landmark, City or Hotel']")
	private WebElement BookingEngine_HotelLocation_text_xpath;
	
	/** The Domestic Location  suggestion option */
	@FindBy (xpath = "//div[text()='Mumbai, Maharashtra, India']")
	private WebElement BookingEngine_DomesticHotelLocation_suggestion_xpath;
	
	/** The International Location  suggestion option */
	@FindBy (xpath = "//div[text()='Paris, France']")
	private WebElement BookingEngine_InternationalHotelLocation_suggestion_xpath;
	
	/** The checkin date field */
	@FindBy (xpath = "//input[@placeholder='Select Check-in Date']")
	private WebElement BookingEngine_Hotel_CheckInDate_fied_xpath;
	
	/** The checkout date field */
	@FindBy (xpath = "//input[@placeholder='Select Check-out Date']")
	private WebElement BookingEngine_Hotel_CheckOutDate_fied_xpath;
	
	/** The checkin date  */
	@FindBy (xpath = "(//button[text()='20'])[3]")
	private WebElement BookingEngine_Hotel_CheckInDate_xpath;
	
	/** The checkout date  */
	@FindBy (xpath = "(//button[text()='22'])[3]")
	private WebElement BookingEngine_Hotel_CheckOutDate_xpath;
	
	/** The  checkout date with more than 6 days gap than check-in date  */
	@FindBy (xpath = "(//button[text()='30'])[3]" )
	private WebElement BookingEngine_Hotel_CheckOutDate_MorethanSixDays_xpath;
	
	/** The search hotels button */
	@FindBy (xpath = "//button[text()='Search Hotels']")
	private WebElement BookingEngine_Hotel_SearchHotels_button_xpath;
	
	/** The Toast Message  xpath Please fill mandatory fiedls. */
	@FindBy(xpath = "//div[@class='customToast showCustomToast']")
	private WebElement MandatoryWarningMessage_SearchHotel_Toast_xpath;
	
	 /** The  Online Button */
	@FindBy(xpath = "//button[text()='Online']")
	private WebElement SearchHotel_Online_button_xpath;
	 
	 /** The  Showing properties text */
	@FindBy(xpath = "//div[@class='hotel-hd-display']")
	private WebElement Showing_Properties_text_xpath;
	 
	 
	@FindBy(xpath = "//div[@class='hw-customTextInput']//label[text()='Test']")
	private WebElement Test_text_extrafield_xpath;
	 
	 /** The  hotel international extra field */
	@FindBy(xpath = "//div[@class='hw-customTextInput']//label[text()='International Test']")
	private WebElement International_Test_text_extrafield_xpath;
	 
	 
	 /** The  hotel recent search card */
	@FindBy(xpath = "//div[@class='search-card d-flex flex-align--start']")
	private WebElement Hotel_recentsearch_card_xpath;
	 
	 /** Enter address warning message */
	@FindBy(xpath = "//div[text()='Please enter the address!']")
	private WebElement Enter_address_warning_message_xpath;
	 
	 /** Add room button */
	@FindBy(xpath = "//span[text()='Add Room']")
	private WebElement Add_room_button_xpath;
	 
	 /** Room 2 text */
	@FindBy(xpath = "//input[@value='2 Rooms, 2 Travellers']")
	private WebElement room_number_text_xpath;
	 
	/** Room2 Delete icon */
	@FindBy(xpath = " (//div[@class='hotel-room-header']//img)[2]")
	private WebElement room_two_delete_icon_xpath;
				 
	/** Rooms & Travellers Field */
	@FindBy(xpath = "//input[@id='room&Traveller']")
	private WebElement rooms_and_travellers_xpath;
					 
	/**Hotel  Recent Search Card */
	@FindBy(xpath = "//h5[text()='Mumbai, India']")
	private WebElement hotel_recent_search_card_xpath;
		 
	/**Back   button   */
	@FindBy(xpath = "//img[@src='back.svg']")
	private WebElement back_button_xpath;
		 
	/**Filters   Header   */
	@FindBy(xpath = "//span[text()='Filters']")
	private WebElement filters_header_xpath;
		 
	/**Hotel   location  header in hotel search  */
	@FindBy(xpath = "//h3[text()=\"Mumbai, Maharashtra, India\"]")
    private WebElement hotel_location__header_xpath;
		 
	/** The  Offline Button */
	@FindBy(xpath = "//button[text()='Offline']")
    private WebElement SearchHotel_Offline_button_xpath;
		 
	/** The  Offline Hotel Review Header */
	@FindBy(xpath = "//span[text()='Hotel Review']")
	private WebElement Hotel_Review_Header_Offline_xpath;
		 
	/** The  Max Stay duration warning message */
	@FindBy(xpath = "//div[text()='Stay duration must less than 3 days']")
	private WebElement Hotel_Max_Duration_Message_xpath;
		 
	/** The  search online/offline pop-up */
	@FindBy(xpath = "//div[@id='request-type-123']")
	private WebElement Request_Type__popup_xpath;
	
	/** The hamburger menu. */
	@FindBy(xpath = "//div[@id = 'hamburger']")
	private WebElement hamburgerMenu;
	
	/** Trip summary close icon */
	@FindBy(xpath = "//i[@class='hw-icons icon  icon-cross font-20 rotate-0']")
	private WebElement trip_summary_close;
	
	

	
	/**
	 * Verify hotel domestic extra fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify hotel domestic extra field, for method: {method} step...")
	public BookingEngine verifyHotelDomesticAndInternationalExtraField() throws Exception {
		
		 //Click on Hotel
	 waitAndClickWebElement(BookingEngine_Hotel_xpath);
		
	 SoftAssert softAssert = new SoftAssert();
	
	//Domestic extra field
	 waitForElementVisible(Test_text_extrafield_xpath);
	 
	 //domestic extra field
	 String domestic_extrafield = Test_text_extrafield_xpath.getText();
	  
	 writeText(BookingEngine_HotelLocation_text_xpath, "Paris");
	 
	 waitAndClickWebElement(BookingEngine_InternationalHotelLocation_suggestion_xpath);
	 
	 waitForElementVisible(International_Test_text_extrafield_xpath);
	 
	 //International extra field
	 String inter_extrafield = International_Test_text_extrafield_xpath.getText();
	 
	 softAssert.assertFalse(domestic_extrafield.equals(inter_extrafield));
	 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

	}
	
	
	/**
	 * Verify hotel domestic extra fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify hotel location  field validation message, for method: {method} step...")
	public BookingEngine verifyHotelLocationFieldValidationMessage() throws Exception {
		
	//Click on Hotel
	waitAndClickWebElement(BookingEngine_Hotel_xpath);
		
	SoftAssert softAssert = new SoftAssert();
	 
	//Enter hotel location
	 writeText(BookingEngine_HotelLocation_text_xpath, "hfsajhfvshfjsfvjsh");
	 
	//Search Hotels Button
	 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
	 
	 boolean isDisplayed =isElementDisplayed(Enter_address_warning_message_xpath);
	 softAssert.assertTrue(isDisplayed);
	 waitForFewSeconds();
	 return GetInstance(BookingEngine.class);

	}

 
	/**
	 * Verify hotelcheck-in & check-out dates can't be same
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify check-in & check-out dates can't be same, for method: {method} step...")
	public BookingEngine verifyCheckinCheckoutDatesCanNotBeSame() throws Exception {
		
	//Click on Hotel
	 waitAndClickWebElement(BookingEngine_Hotel_xpath);
		
	 SoftAssert softAssert = new SoftAssert();
	 
	 //Selecting check-in date
	 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_fied_xpath);
	 
	 //Selecting same date again
	 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_xpath);
	 
	 String checkInDate=BookingEngine_Hotel_CheckInDate_fied_xpath.getAttribute("value");
	 String checkOutDate=BookingEngine_Hotel_CheckOutDate_fied_xpath.getAttribute("value");
	 
	 softAssert.assertNotEquals(checkInDate, checkOutDate); 	 
	 	
	 return GetInstance(BookingEngine.class);

	}
	
	@Step("Verify hotel room addition, for method: {method} step...")
	public BookingEngine verifyHotelRoomAddition() throws Exception {

	SoftAssert softAssert = new SoftAssert();

	//Click on Hotel
	waitAndClickWebElement(BookingEngine_Hotel_xpath);

	//Click on Rooms & travellers
	waitAndClickWebElement(rooms_and_travellers_xpath);

	//Add Room 
	waitAndClickWebElement(Add_room_button_xpath);

	boolean room_two_text= isElementDisplayed(room_number_text_xpath);

	softAssert.assertTrue(room_two_text); 

	softAssert.assertAll();
	
	hardPageRefresh();
	return GetInstance(BookingEngine.class);

	}
	
	
	/**
	 * Verify hotel room deletion
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify hotel room deletion, for method: {method} step...")
	public BookingEngine verifyHotelRoomDeletion() throws Exception {
		
		 //Click on Hotel
	waitAndClickWebElement(BookingEngine_Hotel_xpath);
	
	 //Click on Rooms & travellers
	waitAndClickWebElement(rooms_and_travellers_xpath);

	//Add Room 
	waitAndClickWebElement(Add_room_button_xpath);
	
	//Delete Room 
	waitAndClickWebElement(room_two_delete_icon_xpath);
	 
	SoftAssert softAssert = new SoftAssert();
	boolean room_two_text=isElementDisplayed(room_number_text_xpath); 
	 
	//Click Search Hotels
	doubleClick(BookingEngine_Hotel_SearchHotels_button_xpath);
	waitAndClickWebElement(BookingEngine_Hotel_xpath);
	 
	softAssert.assertFalse(room_two_text); 
	 	
	return GetInstance(BookingEngine.class);

	}

 
 
	
	/**
	 * Verify hotel recent search card creation
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify hotel recent search card creation, for method: {method} step...")
	public BookingEngine verifyHotelRecentSearchCardCreation() throws Exception {
		
		 //Click on Hotel
	waitAndClickWebElement(BookingEngine_Hotel_xpath);
	
	//Enter hotel location
	writeText(BookingEngine_HotelLocation_text_xpath, "Mumbai");
	 
	//Select Location from suggestion
	 waitAndClickWebElement(BookingEngine_DomesticHotelLocation_suggestion_xpath);
	 
     //Check in date field
	 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_fied_xpath);
	 
     //Select CheckIn date
	 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_xpath);
	 
	//Select CheckOut date
	 waitAndClickWebElement(BookingEngine_Hotel_CheckOutDate_xpath);
	 
     //Click on search hotels
	 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
	 
     //Click on online
	 waitAndClickWebElement(SearchHotel_Online_button_xpath);
	
	 //Check Filters header
	 waitForElementVisible(filters_header_xpath);
	 
	 //Click on back button
	 
	 hardPageRefreshAndClick(back_button_xpath);
	 SoftAssert softAssert = new SoftAssert();
	 waitForElementVisible(hotel_recent_search_card_xpath);
	 
	 //hotel recent search card
	 boolean hotel_search_card_created=isElementDisplayed(hotel_recent_search_card_xpath);
	
	 softAssert.assertTrue(hotel_search_card_created); 
	 	
	 return GetInstance(BookingEngine.class);

	}

	
	/**
	 * Verify hotel search using recent search card
	 * @throws Exception 
	 */
	@Step("Verify hotel search using recent search card, for method: {method} step...")
	public BookingEngine verifyHotelSearchUsingRecentSearch() throws Exception {
		
    //Click on Hotel
	waitAndClickWebElement(BookingEngine_Hotel_xpath);		
	
	//Click on hotel recent search card
	waitAndClickWebElement(hotel_recent_search_card_xpath);
	
	 //Click on search hotels button
	 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
	 
	 if (isElementDisplayed(Request_Type__popup_xpath)){
		 waitAndClickWebElement(SearchHotel_Online_button_xpath);
		 }
	 
	 SoftAssert softAssert = new SoftAssert();
	 
	 //Verify hotel location
	 waitForElementVisible(hotel_location__header_xpath);
	 boolean actual = isElementDisplayed(hotel_location__header_xpath);
	 
	 softAssert.assertTrue(actual);
	 
	 softAssert.assertAll();
	 	
	  return GetInstance(BookingEngine.class);

	}
	
/**
 * Search Hotel without mandatory fields.
 *
 * @param toastMessage the toast message text
 * @return the BookingEngine page elements
 * @throws Exception 
 */
@Step("Search Hotel without mandatory fields, for method: {method} step...")
public BookingEngine searchHotelWithoutMandatoryFields(String toastMessage) throws Exception {
	
 //Click on Hotel
 waitAndClickWebElement(BookingEngine_Hotel_xpath);
 
 //Click on search hotels button
 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
 
 SoftAssert softAssert = new SoftAssert();
 
 // Mandatory  warning message
 waitForText(MandatoryWarningMessage_SearchHotel_Toast_xpath,toastMessage);
 softAssert.assertEquals(MandatoryWarningMessage_SearchHotel_Toast_xpath.getText(), toastMessage);
 softAssert.assertAll();
 	
	return GetInstance(BookingEngine.class);

}


/**
 * Search Hotel with mandatory fields.
 * @return the BookingEngine page elements
 * @throws Exception 
 */
@Step("Search Hotel with mandatory fields, for method: {method} step...")
public BookingEngine searchHotelWithMandatoryFields() throws Exception {
	
 //Click on Hotel
 waitAndClickWebElement(BookingEngine_Hotel_xpath);

 //Enter hotel location
 writeText(BookingEngine_HotelLocation_text_xpath, "Mumbai");

//Select Hotel Location
 waitAndClickWebElement(BookingEngine_DomesticHotelLocation_suggestion_xpath);
 
//Click on  Check-in date field
 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_fied_xpath);
 
//Select Check-in date
 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_xpath);
 
//Select Check-out date
 waitAndClickWebElement(BookingEngine_Hotel_CheckOutDate_xpath);
 
//Click Search Hotels button
 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
 
//Click on online
 waitAndClickWebElement(SearchHotel_Online_button_xpath);
  
 SoftAssert softAssert = new SoftAssert();
 
 //Check hotel header
 boolean actual = isElementDisplayed(hotel_location__header_xpath);
 
  softAssert.assertTrue(actual);
 
  softAssert.assertAll();
 
  isElementDisplayed(filters_header_xpath);
	return GetInstance(BookingEngine.class);

}


/**
 * Search Hotel offline.
 * @return the BookingEngine page elements
 * @throws Exception 
 */
@Step("Search Hotel Offline, for method: {method} step...")
public BookingEngine searchHoteOffline() throws Exception {
	
 //Click on Hotel
 waitAndClickWebElement(BookingEngine_Hotel_xpath);
 
 writeText(BookingEngine_HotelLocation_text_xpath, "Mumbai");
 
 waitAndClickWebElement(BookingEngine_DomesticHotelLocation_suggestion_xpath);
 
 
 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_fied_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_CheckOutDate_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
 
 waitAndClickWebElement(SearchHotel_Offline_button_xpath);
  
 SoftAssert softAssert = new SoftAssert();
 
 boolean actual = isElementDisplayed(Hotel_Review_Header_Offline_xpath);
 
 
 softAssert.assertTrue(actual);
 
 softAssert.assertAll();
 	
	return GetInstance(BookingEngine.class);

}

/**
 * Verify Hotel Max Duration
 * @return the BookingEngine page elements
 * @throws Exception 
 */
@Step("Verify Hotel Max Duration, for method: {method} step...")
public BookingEngine verifyHotelMaxStayDuration() throws Exception {
	
 //Click on Hotel
 waitAndClickWebElement(BookingEngine_Hotel_xpath);

 writeText(BookingEngine_HotelLocation_text_xpath, "Mumbai");
 
 waitAndClickWebElement(BookingEngine_DomesticHotelLocation_suggestion_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_fied_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_CheckInDate_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_CheckOutDate_MorethanSixDays_xpath);
 
 waitAndClickWebElement(BookingEngine_Hotel_SearchHotels_button_xpath);
 
 waitAndClickWebElement(SearchHotel_Online_button_xpath);
  
 
 SoftAssert softAssert = new SoftAssert();
 
 boolean actual = isElementDisplayed(Hotel_Max_Duration_Message_xpath);
 
 softAssert.assertTrue(actual);
 
 softAssert.assertAll();
 	
 return GetInstance(BookingEngine.class);

	}

/******************************************CAB Locators************************/

 
	/** The CAB  Flex field */
	@FindBy (xpath = "//div[text()='cab']")
	private WebElement BookingEngine_Cab_xpath;
	
	
	
	/** Service Type:1 The Outstation Radio button */
	@FindBy (xpath = "(//span[@class='hw-radio-circle height-16 width-16'])[2]")
	private WebElement Outstation_xpath;
	
	
	/**Service Type:2 The Local Radio button */
	@FindBy (xpath = "(//span[@class='hw-radio-circle height-16 width-16'])[1]")
	private WebElement Local_xpath;
	

	/**Duty Type drop down */
	@FindBy (xpath = "//input[@placeholder='Select Duty Type']")
	private WebElement DutyType_xpath;
	

	/**Duty Type Option1: OOC Service Type:Local*/
	@FindBy (xpath = "//span[text()='OOCC']")
	private WebElement OOC_xpath;
	
	
	/**Duty Type Option2: LOCAL VISIT Service Type:Local*/
	@FindBy (xpath = "//span[text()='LOCAL VISITS']")
	private WebElement LOCALVISIT_xpath;
	
	
	
	/**Duty Type Option1: OOC Service Type:Outstation*/
	@FindBy (xpath = "//span[text()='OOC']")
	private WebElement OOC_out_xpath;
	

	/**Duty Type Option2:IN CI Service Type:Outstation*/
	@FindBy (xpath = "//span[text()='IN CI']")
	private WebElement INCI_xpath;
	

	/**Pickup location*/
	@FindBy (xpath = "//input[@placeholder='Enter Pickup Location']")
	private WebElement PickupLocation_xpath;
	
	
	/** Select Pickup location*/
	@FindBy (xpath = "//div[text()='Mumbai, Maharashtra, India']")
	private WebElement Select_PickupLocation_xpath;
	
	
	/** Select Drop location*/
	@FindBy (xpath = "//div[text()='Delhi, India']")
	private WebElement Select_DropLocation_xpath;
	
	
	/** Swap location Icon*/
	@FindBy (xpath = "//i[@class='hw-icons icon  icon-return font-20 rotate-0']")
	private WebElement Swap_Location_Icon_xpath;
	
	/**Drop location*/
	@FindBy (xpath = "//input[@placeholder='Enter Drop Location']")
	private WebElement DropLocation_xpath;
	

	/**Start Date*/
	@FindBy (xpath = "//input[@placeholder='Select Start date']")
	private WebElement StartDate_xpath;
	

	/**End Date*/
	@FindBy (xpath = "//input[@placeholder='Select End date']")
	private WebElement EndDate_xpath;
	
	
	/**Start Time*/
	@FindBy (xpath = "//input[@value='Hrs']")
	private WebElement StartTime_xpath;
	
	
	/**CabType/Number of cabs drop-down*/
	@FindBy (xpath = "//input[@class='displayInline']")
	private WebElement CabType_Number_xpath;
	
	
	
	/**Cab Increment Icon '+'*/
	@FindBy (xpath = "//img[@src='/assets/images/bookingEnginePage/increment.svg']")
	private WebElement Cab_Increment_xpath;
	
	
	
	/**Cab Increment Icon '+' Disabled*/
	@FindBy (xpath = "//img[@src='/assets/images/bookingEnginePage/increment-inactive.svg']")
	private WebElement Cab_Increment_disabled_xpath;
	
	
	
	/**Cab Decrement Icon '-'*/
	@FindBy (xpath = "//img[@src='./assets/images/bookingEnginePage/decrement.svg']")
	private WebElement Cab_Decrement_xpath;
	
	
	/**Cab type Option:1 Sedan '-'*/
	@FindBy (xpath = "//span[text()='Sedan']")
	private WebElement CabType_Sedan_xpath;
	
	
	/**Cab type Option:2 Hatchback '-'*/
	@FindBy (xpath = "//span[text()='HatchBack']")
	private WebElement CabType_Hatchback_xpath;
	
	
	
	/**Cab Extra Field: Additional Remarks*/
	@FindBy (xpath = "//div[@class='hw-customTextInput']//label[text()='Additional Remark']")
	private WebElement CabType_Extrafield_Additional_Remarks_xpath;
	
	
	/**Add Cab button*/
	@FindBy (xpath = "//div[text()='Add Cab']")
	private WebElement AddCab_button_xpath;
	
	/**End date disabled*/
	@FindBy (xpath = "//input[@placeholder='Select End date' and @disabled]")
	private WebElement Enddate_disabled_xpath;

	
	/**Cab 2 label*/
	@FindBy (xpath = "//div[text()='Cab ']")
	private WebElement CabTwolabel_xpath;

	
	/**Cab 2 remove icon*/
	@FindBy (xpath = "(//i[@class='hw-icons icon  icon-cross font-16 rotate-0'])[1]")
	private WebElement RemoveIcon_xpath;
	
	
	/**Submit button*/
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement Submit_Button_xpath;
	
	
	/**From city validation toast message*/
	@FindBy (xpath = "//div[text() = 'Please select from city']")
	private WebElement FromCity_Validation_message_xpath;
	
	
	
	/**Next Month arrow of start date in calendar */
	@FindBy (xpath = "(//i[@class='hw-icons icon  icon-dropright font-20 rotate-0'])[1]")
	private WebElement Next_month_arrow_start_date_xpath;
	
	/**Next Month arrow of end date in calendar */
	@FindBy (xpath = "(//i[@class='hw-icons icon  icon-dropright font-20 rotate-0'])[2]")
	private WebElement Next_month_arrow_end_date_xpath;
	
	/**Cab start date */
	@FindBy (xpath = "(//label[text()='Today'])[1]")
	private WebElement Cab_Start_Date_xpath;
	
	/**Cab end date */
	@FindBy (xpath = "(//label[text()='Today'])[2]")
	private WebElement Cab_End_Date_xpath;
	
	
	/** Start Time */
	@FindBy (xpath = "//span[text()='12:15 AM']")
	private WebElement Cab_Start_Time_xpath;
	
	
	/** Cab Review */
	@FindBy (xpath = "(//span[text()='Cab Review'])[1]")
	private WebElement Cab_Review_header_xpath;
	

	/** From & To city can't be same validation */
	@FindBy (xpath = "//div[text()='From and To city should not be same']")
	private WebElement From_To_City_CanNot_Be_same_Toast_Message_xpath;
	
	

	/** Select Start date toast message */
	@FindBy (xpath = "//div[text()='Please select start date']")
	private WebElement select_start_date_Toast_Message_xpath;
	
	

	/** Select Duty Type Validation message */
	@FindBy (xpath = "//div[text()='Please select duty Type']")
	private WebElement Duty_Type_Toast_Message_xpath;
	
	/** CAB Recent Search info in Recent search card */
	@FindBy (xpath = "//h4[text() = 'Mumbai'][text() = 'Delhi']")
	private WebElement Cab_RecentSearch_Info_xpath;
	
	
	/** Swap icon */
	@FindBy (xpath = "//i[@class='hw-icons icon  icon-return font-20 rotate-0']")
	private WebElement Swap_Icon_Cab_xpath;
	
	/**
	 * Verify Duty Type options based in service type
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify Duty Type options based on service type, for method: {method} step...")
	public BookingEngine verifyDutyTypeBasedOnServiceType() throws Exception {
		
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 waitAndClickWebElement(DutyType_xpath);
	 
	 waitAndClickWebElement(LOCALVISIT_xpath);
	 
	 isElementDisplayed(DutyType_xpath);
	 String selectedDutyType=DutyType_xpath.getAttribute("value");
	 
	 softAssert.assertEquals(selectedDutyType, "LOCAL VISITS");
	 
	 waitAndClickWebElement(Outstation_xpath);
	 
	 waitAndClickWebElement(DutyType_xpath);
	 
	 waitAndClickWebElement(INCI_xpath);
	 
	 isElementDisplayed(DutyType_xpath);
	 selectedDutyType=DutyType_xpath.getAttribute("value");
	 
	 softAssert.assertEquals(selectedDutyType, "IN CI");
	 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}

	/**
	 * Verify Cab Addition
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify cab addition, for method: {method} step...")
	public BookingEngine verifyCabAddition() throws Exception {
		
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
	 waitAndClickWebElement(AddCab_button_xpath);
	 
	 waitForElementVisible(CabTwolabel_xpath);
	 boolean result=isElementDisplayed(CabTwolabel_xpath);
	 softAssert.assertTrue(result);
	 softAssert.assertAll();
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify Cab Deletion
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify cab deletion, for method: {method} step...")
	public BookingEngine verifyCabDeletion() throws Exception {
		
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
		//Click on Add Cab
	 waitAndClickWebElement(AddCab_button_xpath);
	 
	
	 waitAndClickWebElement(RemoveIcon_xpath);
	 
	 boolean result=isElementDisplayed(CabTwolabel_xpath);
	 softAssert.assertFalse(result);
	 softAssert.assertAll();
	 
	 return GetInstance(BookingEngine.class);

		}
	
	/**
	 * Verify Cab Domestic extra field
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify cab domestic extra field, for method: {method} step...")
	public BookingEngine verifyCabDomesticExtraField() throws Exception {
		
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
	 waitForElementVisible(CabType_Extrafield_Additional_Remarks_xpath);
	 boolean result=isElementDisplayed(CabType_Extrafield_Additional_Remarks_xpath);
	 softAssert.assertTrue(result);
	 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	/**
	 * Verify Maximum number of cab addition
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify maximum number of cab addtion, for method: {method} step...")
	public BookingEngine verifyMaxCabAddtion() throws Exception {
			
	 int MAX_CAB_COUNT=5;	
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);

	 waitAndClickWebElement(CabType_Number_xpath);
	 
	 waitForElementToClickable(Cab_Increment_xpath);
	 
	 for(int i=1;i<=MAX_CAB_COUNT;i++)
	 waitAndClickWebElement(Cab_Increment_xpath);
	 
	 boolean result=isElementDisplayed(Cab_Increment_disabled_xpath);
	 softAssert.assertTrue(result);
	 hardPageRefresh();
	 softAssert.assertAll();
	 
	 return GetInstance(BookingEngine.class);

		}
	
	/**
	 * Verify From & To City Swap
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify From & To City Swap, for method: {method} step...")
	public BookingEngine verifyFromAndToCitySwap() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
	 writeText(PickupLocation_xpath, "Mum");
	 waitAndClickWebElement(Select_PickupLocation_xpath);
	 
	 String fromCityBeforeSwap=PickupLocation_xpath.getText();
	 String toCityBeforeSwap=DropLocation_xpath.getText();
	 
	 writeText(DropLocation_xpath,"Del");
	 waitAndClickWebElement(Select_DropLocation_xpath);
	 
	 waitAndClickWebElement(Swap_Icon_xpath);
	 
	 String fromCityAfterSwap=PickupLocation_xpath.getText();
	 String toCityAfterSwap=DropLocation_xpath.getText();
	 
	 softAssert.assertEquals(toCityAfterSwap, fromCityBeforeSwap);
	 
	 softAssert.assertEquals(fromCityAfterSwap, toCityBeforeSwap);
	 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	/**
	 * Verify From city validation message
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify cab submit without mandatory fields, for method: {method} step...")
	public BookingEngine verifyCabSubmissionWithoutMandatoryFields() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
		//Click on Submit
	 waitAndClickWebElement(Submit_Button_xpath);

	 boolean isDisplayed=isElementDisplayed(Duty_Type_Toast_Message_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify redirection to cab review on submit with mandatory fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify redirection to cab review on submit with mandatory fields, for method: {method} step...")
	public BookingEngine verifyCabSubmissionWithMandatoryFields() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
	 waitAndClickWebElement(Outstation_xpath);
	 
	 waitAndClickWebElement(DutyType_xpath);
	 
	 waitAndClickWebElement(INCI_xpath);

	 waitAndClickWebElement(PickupLocation_xpath);
	 
	 writeText(PickupLocation_xpath, "Mum");
	 waitAndClickWebElement(Select_PickupLocation_xpath);
	 
	 waitAndClickWebElement(DropLocation_xpath);
	 
	 writeText(DropLocation_xpath, "Del");
	 waitAndClickWebElement(Select_DropLocation_xpath);
	 
	 ScrollToElement(PickupLocation_xpath);
	 
	 waitAndClickWebElement(StartDate_xpath);
	 
	 waitForElementToClickable(Cab_Start_Date_xpath);
	 waitAndClickWebElement(Cab_Start_Date_xpath);
	 
	 waitAndClickWebElement(StartTime_xpath);

	 waitAndClickWebElement(Cab_Start_Time_xpath);

		//Click on Submit
	 waitForElementToClickable(Submit_Button_xpath);
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 boolean isDisplayed=isElementDisplayed(Cab_Review_header_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	
	/**
	 * Verify cab recent search card creation
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify CAB recent search card creation, for method: {method} step...")
	public BookingEngine verifyCABRecentSearchCardCreation() throws Exception {
		
		 waitAndClickWebElement(BookingEngine_Cab_xpath);
		 
		 waitAndClickWebElement(Outstation_xpath);
		 
		 waitAndClickWebElement(DutyType_xpath);
		 
		 waitAndClickWebElement(INCI_xpath);

		 waitAndClickWebElement(PickupLocation_xpath);
		 
		 writeText(PickupLocation_xpath, "Mum");
		 waitAndClickWebElement(Select_PickupLocation_xpath);
		 
		 waitAndClickWebElement(DropLocation_xpath);
		 
		 writeText(DropLocation_xpath, "Del");
		 waitAndClickWebElement(Select_DropLocation_xpath);
		 
		 ScrollToElement(PickupLocation_xpath);
		 
		 waitAndClickWebElement(StartDate_xpath);
		 
		 waitAndClickWebElement(Cab_Start_Date_xpath);
		
		 waitAndClickWebElement(EndDate_xpath);
		 
		 waitAndClickWebElement(Cab_End_Date_xpath);
		 
		 waitAndClickWebElement(Cab_Start_Time_xpath);

			//Click on Submit
		 waitAndClickWebElement(Submit_Button_xpath);
	 
		 //Click on back button
		 waitAndClickWebElement(back_button_xpath);
	  
		 SoftAssert softAssert = new SoftAssert();
		 waitForElementVisible(Cab_RecentSearch_Info_xpath);
	 
		 //CAB recent search card
		 boolean cab_search_card_created=isElementDisplayed(Cab_RecentSearch_Info_xpath);
	
		 softAssert.assertTrue(cab_search_card_created); 
	 	
		 return GetInstance(BookingEngine.class);

	}

	/**
	 * Verify Pickup & Drop location can't be same
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify Pickup & Drop location can't be same, for method: {method} step...")
	public BookingEngine verifyPickupandDropLocationCanNotBeSame() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Cab
	 waitAndClickWebElement(BookingEngine_Cab_xpath);
	 
	 waitAndClickWebElement(PickupLocation_xpath);
	 
	 writeText(PickupLocation_xpath, "Mum");
	 waitAndClickWebElement(Select_PickupLocation_xpath);
	 
	 waitAndClickWebElement(DropLocation_xpath);
	 
	 writeText(DropLocation_xpath, "Mum");
	 waitAndClickWebElement(Select_PickupLocation_xpath);
	 
	 waitAndClickWebElement(DutyType_xpath);

	 waitAndClickWebElement(LOCALVISIT_xpath);
	 
	//Click on Submit
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 waitForElementVisible(From_To_City_CanNot_Be_same_Toast_Message_xpath);
	 
	 boolean isDisplayed=isElementDisplayed(From_To_City_CanNot_Be_same_Toast_Message_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify cab search using recent search card
	 * @throws Exception 
	 */
	@Step("Verify CAB search using recent search card, for method: {method} step...")
	public BookingEngine verifyCabSearchUsingRecentSearch() throws Exception {
		
    //Click on CAB
	waitAndClickWebElement(BookingEngine_Cab_xpath);		
	
	//Click on hotel recent search card
	waitAndClickWebElement(Cab_RecentSearch_Info_xpath);
	
	 //Click on submit button
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 SoftAssert softAssert = new SoftAssert();
	 
	 //Verify hotel location
	 waitForElementVisible(Cab_Review_header_xpath);
	 boolean actual = isElementDisplayed(Cab_Review_header_xpath);
	 
	 softAssert.assertTrue(actual);
	 
	 softAssert.assertAll();
	 	
	  return GetInstance(BookingEngine.class);

	}
	
	
	
	/*----------------------------------Train-----------------------------------------------------------*/
	

	
	
	/**Train product selection*/
	@FindBy (xpath = "//div[text()='train']")
	private WebElement Train_xpath;
	
	
	
	
	@FindBy (xpath = "//input[@placeholder='Enter Source city']")
	private WebElement FromStation_xpath;
	
	/**
	 * Select From station*/
	@FindBy (xpath = "//div[text()='Mysore Junction']")
	private WebElement Select_FromStation_xpath;
	
	
	/**
	 * Select From  city toast message*/
	@FindBy (xpath = "//div[text()='Please select from city']")
	private WebElement From_Station_Validation_xpath;
	
	
	
	/**To station*/
	@FindBy (xpath = "//input[@placeholder='Enter Destination city']")
	private WebElement ToStation_xpath;
	
	
	/**
	 * Select To station*/
	@FindBy (xpath = "//div[text()='Bangalore Cy Junction']")
	private WebElement Select_ToStation_xpath;
	
	
	
	/**Departure date*/
	@FindBy (xpath = "//input[@placeholder='Select Departure date']")
	private WebElement DepartureDate_xpath;
	
	
	/**Next Month arrow of departure date in calendar */
	@FindBy (xpath = "(//i[@class='hw-icons icon  icon-dropright font-20 rotate-0'])[1]")
	private WebElement Next_month_arrow_departure_date_xpath;
	
	/**Train departure date in calendar */
	@FindBy (xpath = "(//span[text()='10'])[1]")
	private WebElement Train_departure_date_xpath;
	
	
	/**From preferred time field*/
	@FindBy (xpath = "//input[@placeholder='From']")
	private WebElement From_Preferred_Time_xpath;
	
	
	/**From preferred time value*/
	@FindBy (xpath = "//span[text()='12:00 AM']")
	private WebElement From_Preferred_Time_value_xpath;
	
	
	/**To preferred time field*/
	@FindBy (xpath = "//input[@placeholder='To']")
	private WebElement To_Preferred_Time_xpath;
	
	
	/**To preferred time value*/
	@FindBy (xpath = "//span[text()='01:00 AM']")
	private WebElement To_Preferred_Time_value_xpath;
	
	
	
	/**Preferred Class field*/
	@FindBy (xpath = "//input[@placeholder='Select Preferred Class']")
	private WebElement Preferred_Class_xpath;
	
	
	/**Preferred Class value*/
	@FindBy (xpath = "//span[text()='AC First']")
	private WebElement Preferred_Class_Value_xpath;
	

	/**Quota field*/
	@FindBy (xpath = "//input[@placeholder='Select Quota']")
	private WebElement Quota_Field_xpath;
	
	
	/**Preferred Class value*/
	@FindBy (xpath = "//span[text()='Normal']")
	private WebElement Quota_Field_Value_xpath;
	
	
	/**Check  availability link*/
	@FindBy (xpath = "//div[text()='Check Availability']")
	private WebElement Check_Availability_Link_xpath;
	
	/**IRCTC Header*/
	@FindBy (xpath = "//h3[text()='INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY']")
	private WebElement IRCTC_Header_xpath;
	
	
	/**Train Review Header*/
	@FindBy (xpath = "(//span[text()='Train Review'])[1]")
	private WebElement TrainReview_Header_xpath;
	
	
	/**Domestic Train Extra field*/
	@FindBy (xpath = "//div[@class='hw-customTextInput']//label[text()='Test']")
	private WebElement Train_extraField_Test__xpath;
			
	
	/** Recent Search info train in Recent search card */
	@FindBy (xpath = "//h4[text() = 'MYS'][text() = 'SBC']")
	private WebElement RecentSearchTrain_Info_xpath;
	
	
	
	/** Preferred To Time validation message */
	@FindBy (xpath = "//div[text()='Please select to preferred time']")
	private WebElement Preferred_To_Time_Validation_xpath;
	

	
	
	/** From & To station can't be same validation message */
	@FindBy (xpath = "//div[text()='From and To city should not be same']")
	private WebElement From_station_To_station_CantNotBeSameValidation_xpath;
	
	
	/**Submit button*/
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement Submit_Button_Train_xpath;
	
	
	/** Body element */
	
	@FindBy (xpath = "//body")
	private WebElement body;
	
	/** IRCTC Page title element */
	
	@FindBy (xpath = "//h3[text()='INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY']")
	private WebElement irctc_page_title;
	
	
	
	/** Train Recent Search info in Recent search card */
	@FindBy (xpath = "//h4[text() = 'MYS'][text() = 'SBC']")
	private WebElement Train_RecentSearch_Info_xpath;
	
	/** Swap icon */
	@FindBy (xpath = "//i[@class='hw-icons icon  icon-return font-20 rotate-0']")
	private WebElement Swap_Icon_Train_xpath;
	
	

	
	
	/**
	 * Verify Domestic train extra field
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify domestic train extra field, for method: {method} step...")
	public BookingEngine verifyDomesticTrainExtraField() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
	 waitForElementVisible(Train_extraField_Test__xpath);
	 
	 boolean isDisplayed=isElementDisplayed(Train_extraField_Test__xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify  train submission without mandatory fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify train submission without mandatory fields, for method: {method} step...")
	public BookingEngine verifyTrainSubmissionWithoutMandatoryFields() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
	 
		//Click on Submit
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 waitForElementVisible(From_Station_Validation_xpath);
	 boolean isDisplayed=isElementDisplayed(From_Station_Validation_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	

	/**
	 * Verify  preferred 'To' Time validation message
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify preferred 'To' Time validation message, for method: {method} step...")
	public BookingEngine verifyPreferredToTimeValidation() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
	 
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
		//Click on From City
	 waitAndClickWebElement(FromStation_xpath);
	
	 writeText(FromStation_xpath, "MYS");
	 waitAndClickWebElement(Select_FromStation_xpath);
	 
		//Click on To City
	 waitAndClickWebElement(FromStation_xpath);
	
	 writeText(ToStation_xpath, "SBC");
	 waitAndClickWebElement(Select_ToStation_xpath);
	 
     ScrollToElement(FromStation_xpath);
	//	Select departure date
     
	// waitForElementToClickable(DepartureDate_xpath);
	 waitAndClickWebElement(DepartureDate_xpath);
	 waitAndClickWebElement(Next_month_arrow_departure_date_xpath);
	 
	 waitForElementToClickable(Train_departure_date_xpath);
	 waitAndClickWebElement(Train_departure_date_xpath);
	 
	 waitAndClickWebElement(From_Preferred_Time_xpath);
	 
	 waitAndClickWebElement(From_Preferred_Time_value_xpath);
	 
		//Click on Submit
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 waitForElementVisible(Preferred_To_Time_Validation_xpath);
	 boolean isDisplayed=isElementDisplayed(Preferred_To_Time_Validation_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify train submission with mandatory fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify train submission with mandatory fields, for method: {method} step...")
	public BookingEngine verifyTrainSubmissionWithMandatoryFields() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
		//Click on From City
	 waitAndClickWebElement(FromStation_xpath);
	
	 writeText(FromStation_xpath, "MYS");
	 waitAndClickWebElement(Select_FromStation_xpath);
	 
	 
		//Click on To City
	 waitAndClickWebElement(ToStation_xpath);
	
	 writeText(ToStation_xpath, "SBC");
	 waitAndClickWebElement(Select_ToStation_xpath);
	 

	   ScrollToElement(FromStation_xpath);
		//Select departure date
	 waitAndClickWebElement(DepartureDate_xpath);
	
	 waitAndClickWebElement(Next_month_arrow_departure_date_xpath);
	 
	 waitAndClickWebElement(Train_departure_date_xpath);
	 
	 
	 waitAndClickWebElement(From_Preferred_Time_xpath);
	 
	 waitAndClickWebElement(From_Preferred_Time_value_xpath);
	 
	 
	 waitAndClickWebElement(To_Preferred_Time_xpath);
	 
	 
	 waitAndClickWebElement(To_Preferred_Time_value_xpath);
	 
	 waitAndClickWebElement(Quota_Field_xpath);
	 
	 waitAndClickWebElement(Quota_Field_Value_xpath);
	 
	 waitAndClickWebElement(Preferred_Class_xpath);
	 waitAndClickWebElement(Preferred_Class_Value_xpath);
	 
		//Click on Submit
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 
	 waitForElementVisible(TrainReview_Header_xpath);
	 boolean isDisplayed=isElementDisplayed(TrainReview_Header_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify cab recent search card creation
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify Train recent search card creation, for method: {method} step...")
	public BookingEngine verifyTrainRecentSearchCardCreation() throws Exception {
		
		
		SoftAssert softAssert = new SoftAssert();
			
			//Click on Train
		 waitAndClickWebElement(Train_xpath);
		 
			//Click on From City
		 waitAndClickWebElement(FromStation_xpath);
		
		 writeText(FromStation_xpath, "MYS");
		 waitAndClickWebElement(Select_FromStation_xpath);
		 
			//Click on To City
		 waitAndClickWebElement(ToStation_xpath);
		
		 writeText(ToStation_xpath, "SBC");
		 waitAndClickWebElement(Select_ToStation_xpath);
		 
		
		 ScrollToElement(FromStation_xpath);
			//Select departure date
		 waitAndClickWebElement(DepartureDate_xpath);
		
		 waitAndClickWebElement(Next_month_arrow_departure_date_xpath);
		 
		 waitAndClickWebElement(Train_departure_date_xpath);
		 
		 
		 waitAndClickWebElement(From_Preferred_Time_xpath);
		 
		 waitAndClickWebElement(From_Preferred_Time_value_xpath);
		 
		 
		 waitAndClickWebElement(To_Preferred_Time_xpath);
		 
		 
		 waitAndClickWebElement(To_Preferred_Time_value_xpath);
		 
		 waitAndClickWebElement(Quota_Field_xpath);
		 
		 waitAndClickWebElement(Quota_Field_Value_xpath);
		 
		 waitAndClickWebElement(Preferred_Class_xpath);
		 waitForElementToClickable(Preferred_Class_Value_xpath);
		 waitAndClickWebElement(Preferred_Class_Value_xpath);
		 
			//Click on Submit
		 waitAndClickWebElement(Submit_Button_xpath);
			 
		 //Click on back button
		 waitAndClickWebElement(back_button_xpath);
	 
		 //Train recent search card
		 boolean train_search_card_created=isElementDisplayed(Train_RecentSearch_Info_xpath);
	
		 softAssert.assertTrue(train_search_card_created); 
	 	
		 return GetInstance(BookingEngine.class);

	}
	/** check availability link 
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify availability link , for method: {method} step...")
	public BookingEngine verifyCheckAvailability() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
		//Click on Check availability
	 waitAndClickWebElement(Check_Availability_Link_xpath);
	 
	 switchToNewTab(body,1);
	 
     waitForElementVisible(irctc_page_title);	 
	 
	 softAssert.assertTrue(isElementDisplayed(irctc_page_title));
	// softAssert.assertEquals(getTit, expected);
	 softAssert.assertAll();
	 
	 closeTab();
	 switchToNewTab(body,0);
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	/** Verify from & to city can't be same
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify from & to city can't be same , for method: {method} step...")
	public BookingEngine verifyFromAndToCityCanNotBeSame() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
		//Click on From City
	 waitAndClickWebElement(FromStation_xpath);
	
	 writeText(FromStation_xpath, "MYS");
	 waitAndClickWebElement(Select_FromStation_xpath);
	 
		//Click on To City
	 waitAndClickWebElement(ToStation_xpath);
	
	 writeText(ToStation_xpath, "Mys");
	 waitAndClickWebElement(Select_FromStation_xpath);
	 
		//Click on To City
	 waitAndClickWebElement(Submit_Button_Train_xpath);
	
	 boolean isDisplayed=isElementDisplayed(From_station_To_station_CantNotBeSameValidation_xpath);
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	/** Verify from & to station swap
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify from & to station swap , for method: {method} step...")
	public BookingEngine verifyFromAndToStationSwap() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Train
	 waitAndClickWebElement(Train_xpath);
	 
	 writeText(FromStation_xpath, "Mum");
	 waitAndClickWebElement(FromStation_xpath);
	 
	 String fromCityBeforeSwap=FromStation_xpath.getText();
	 String toCityBeforeSwap=ToStation_xpath.getText();
	 
	 writeText(ToStation_xpath,"Del");
	 waitAndClickWebElement(ToStation_xpath);
	 
	 waitAndClickWebElement(Swap_Icon_Train_xpath);
	 
	 String fromCityAfterSwap=FromStation_xpath.getText();
	 String toCityAfterSwap=ToStation_xpath.getText();
	 
	 
	 softAssert.assertEquals(toCityAfterSwap, fromCityBeforeSwap);
	 softAssert.assertEquals(fromCityAfterSwap, toCityBeforeSwap);
	 
	 softAssert.assertAll();
	 
	 return GetInstance(BookingEngine.class);

		}
	
	
	/**
	 * Verify train search using recent search card
	 * @throws Exception 
	 */
	@Step("Verify Train search using recent search card, for method: {method} step...")
	public BookingEngine verifyTrainSearchUsingRecentSearch() throws Exception {
		
    //Click on Hotel
	waitAndClickWebElement(Train_xpath);		
	
	//Click on hotel recent search card
	waitAndClickWebElement(Train_RecentSearch_Info_xpath);
	
	 //Click on search hotels button
	 waitAndClickWebElement(Submit_Button_Train_xpath);
	 
	 SoftAssert softAssert = new SoftAssert();
	 
	 //Verify hotel location
	 waitForElementVisible(TrainReview_Header_xpath);
	 boolean actual = isElementDisplayed(TrainReview_Header_xpath);
	 
	 softAssert.assertTrue(actual);
	 
	 softAssert.assertAll();
	 	
	  return GetInstance(BookingEngine.class);

	}
	
	/*************************Bus**********************************/
	
	
	/** Bus Product */
	@FindBy (xpath = "//div[text()='bus']")
	private WebElement bus_xpath;
	
	
	/** Bus Source City */
	@FindBy (xpath = "//input[@placeholder='Enter Source City']")
	private WebElement bus_source_city_xpath;
	

	/** Bus Source City  Value*/
	@FindBy (xpath = "//span[text()='Mysore (KA), India']")
	private WebElement bus_source_city_value_xpath;
	

	/** Bus Destination City */
	@FindBy (xpath = "//input[@placeholder='Enter Destination City']")
	private WebElement bus_destination_city_xpath;
	

	/** Bus Destination City  Value*/
	@FindBy (xpath = "//span[text()='Kolkata (WB), India']")
	private WebElement bus_destination_city_value_xpath;
	

	/** Bus Departure Date */
	@FindBy (xpath = "//input[@placeholder='Select Departure date']")
	private WebElement bus_departure_date_xpath;
	
	
	/** Bus From Preferred Time */
	@FindBy (xpath = "//input[@placeholder='From']")
	private WebElement bus_from_preferred_time_xpath;
	
	/** Bus To Preferred Time */
	@FindBy (xpath = "//input[@placeholder='To']")
	private WebElement bus_to_preferred_time_xpath;
	
	
	/** Bus Preferred From Time validation message */
	@FindBy (xpath = "//div[text()='Please select from preferred time']")
	private WebElement Bus_Preferred_From_Time_Validation_xpath;
	
	/** Bus Preferred To Time validation message */
	@FindBy (xpath = "//div[text()='Please select to preferred time']")
	private WebElement Bus_Preferred_To_Time_Validation_xpath;
	

	/** Bus Preferred Class */
	@FindBy (xpath = "//input[@placeholder='Select Preferred Class']")
	private WebElement bus_preferred_class_xpath;
	
	/** Bus Preferred Class Value */
	@FindBy (xpath = "//span[text()='Seater']")
	private WebElement bus_preferred_class_value_xpath;
	

	/** Bus Travellers */
	@FindBy (xpath = "//input[@value='1 Traveller']")
	private WebElement bus_travellers_xpath;
	
	
	/** Bus Boarding Location */
	@FindBy (xpath = "//input[@placeholder='Enter Boarding location']")
	private WebElement bus_boarding_location_xpath;
	

	
	/** Bus Boarding Location value */
	@FindBy (xpath = "//span[text()='Pune, Maharashtra, India']")
	private WebElement bus_boarding_location_value_xpath;
	
	
	/** Bus Drop Location */
	@FindBy (xpath = "//input[@placeholder='Enter Drop location']")
	private WebElement bus_drop_location_xpath;
	
	
	
	/** Bus Drop Location value */
	@FindBy (xpath = "//span[text()='Bangalore, Karnataka, India']")
	private WebElement bus_drop_location_value_xpath;
	
	
	/** Bus Extra field */
	@FindBy (xpath = "//div[@class='hw-customTextInput']//label[text()='Preferred Travellers']")
	private WebElement bus_prefferedTraveller_extrafield_xpath;
	
	
	/** Bus Review  */
	@FindBy (xpath = "//span[text()='Bus Review']")
	private WebElement bus_review_xpath;
	
	
	/**Bus departure date in calendar */
	@FindBy (xpath = "(//span[text()='10'])[1]")
	private WebElement Bus_departure_date_xpath;
	
	
	/**Next Month arrow of departure date in calendar */
	@FindBy (xpath = "//i[@class='hw-icons icon  icon-dropright font-20 rotate-0']")
	private WebElement Bus_Next_month_arrow_departure_date_xpath;
	
	
	/** From Preferred time drop-down */
	@FindBy (xpath = "//input[contains(@placeholder,'From')]")
	private WebElement Bus_FromPreferredTime_Dropdown_xpath;
	
	/** To Preferred time drop-down */
	@FindBy (xpath = "//input[contains(@placeholder,'To')]")
	private WebElement Bus_ToPreferredTime_Dropdown_xpath;
	
	/** Select From Preferred time */
	@FindBy (xpath = "//li/span[text()= '12:00 AM']")
	private WebElement Bus_SelectFromPreferredTime_Selection_xpath;
	
	/** Select Preferred time */
	@FindBy (xpath = "//li/span[text()= '04:00 AM']")
	private WebElement Bus_SelectToPreferredTime_Selection_xpath;
	
	
	/** Bus Recent Search info in Recent search card */
	@FindBy (xpath = "//h4[text() = 'Mysore'][text() = 'Kolkata']")
	private WebElement Bus_RecentSearch_Info_xpath;
	
	
	/**
	 * Verify Domestic bus extra field
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify domestic bus extra field, for method: {method} step...")
	public BookingEngine verifyDomesticBusExtraField() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		//Click on Bus
	 waitAndClickWebElement(bus_xpath);
	 waitForElementVisible(bus_prefferedTraveller_extrafield_xpath);
	 
	 boolean isDisplayed=isElementDisplayed(bus_prefferedTraveller_extrafield_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	/** Verify from & to station swap
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify from & to station swap , for method: {method} step...")
	public BookingEngine verifyBusFromAndToCitySwap() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		//Click on Bus
	 waitAndClickWebElement(bus_xpath);
	 
	 writeText(bus_source_city_xpath, "Mys");
	 waitAndClickWebElement(bus_source_city_xpath);
	 
	 //waitForElementToClickable(bus_source_city_value_xpath);
	 waitAndClickWebElement(bus_source_city_value_xpath);
	 
	 String fromCityBeforeSwap=bus_source_city_xpath.getText();
	 String toCityBeforeSwap=bus_destination_city_xpath.getText();
	 
	 writeText(bus_destination_city_xpath,"kol");
	 waitAndClickWebElement(bus_destination_city_xpath);
	 
	 //waitForElementToClickable(bus_destination_city_value_xpath);
	 waitAndClickWebElement(bus_destination_city_value_xpath);
	 
	 waitAndClickWebElement(Swap_Icon_xpath);
	 
	 String fromCityAfterSwap=bus_source_city_xpath.getText();
	 String toCityAfterSwap=bus_destination_city_xpath.getText();
	 
	 softAssert.assertEquals(toCityAfterSwap, fromCityBeforeSwap);
	 
	 softAssert.assertEquals(fromCityAfterSwap, toCityBeforeSwap);
	 
	 softAssert.assertAll();
	 hardPageRefresh();
	 return GetInstance(BookingEngine.class);

		}
	
	/** Verify from & to city can't be same
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify from & to city can't be same , for method: {method} step...")
	public BookingEngine verifyBusFromAndToCityCanNotBeSame() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Bus
	 waitAndClickWebElement(bus_xpath);
	 
		//Click on From City
	 waitAndClickWebElement(bus_source_city_xpath);
	
	 writeText(bus_source_city_xpath, "MYS");
	 waitAndClickWebElement(bus_source_city_value_xpath);
	
	 waitAndClickWebElement(bus_destination_city_xpath);
	
	 writeText(bus_destination_city_xpath, "Mys");
	 waitAndClickWebElement(bus_source_city_value_xpath);

	 waitAndClickWebElement(Submit_Button_Train_xpath);
	
	 
	 boolean isDisplayed=isElementDisplayed(From_To_City_CanNot_Be_same_Toast_Message_xpath);
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 
	 hardPageRefresh();
	 return GetInstance(BookingEngine.class);

		}
	
	
	/** Verify bus submission with mandatory fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify bus submission with mandatory fields , for method: {method} step...")
	public BookingEngine verifyBusSubmissionWithManadatoryFields() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		//Click on Bus
	 waitAndClickWebElement(bus_xpath);
		//Click on From City
	 waitAndClickWebElement(bus_source_city_xpath);
	
	 writeText(bus_source_city_xpath, "MYS");
	 waitAndClickWebElement(bus_source_city_value_xpath);
	 
		//Click on To City
	 waitAndClickWebElement(bus_destination_city_xpath);
	
	 writeText(bus_destination_city_xpath, "Kol");
	 waitAndClickWebElement(bus_destination_city_value_xpath);
	 
	 waitAndClickWebElement(bus_departure_date_xpath);
	 
	 waitAndClickWebElement(Bus_Next_month_arrow_departure_date_xpath);
	 
	 waitAndClickWebElement(Bus_departure_date_xpath);
	 
	 waitAndClickWebElement(Bus_FromPreferredTime_Dropdown_xpath);
	 	
	 waitAndClickWebElement(Bus_SelectFromPreferredTime_Selection_xpath);
	 	
	 waitAndClickWebElement(Bus_ToPreferredTime_Dropdown_xpath);
	 	
	 waitAndClickWebElement(Bus_SelectToPreferredTime_Selection_xpath);
	 	
	 waitAndClickWebElement(bus_preferred_class_xpath);
	 
	 waitAndClickWebElement(bus_preferred_class_value_xpath);
	 	
	 writeText(bus_boarding_location_xpath,"PUNE");
	 
	 waitAndClickWebElement(bus_boarding_location_value_xpath);
	 
	writeText(bus_drop_location_xpath,"BANG");
	 
    waitAndClickWebElement(bus_drop_location_value_xpath);
 
	waitAndClickWebElement(Submit_Button_Train_xpath);
	
	 boolean isDisplayed=isElementDisplayed(bus_review_xpath);
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 	
	 return GetInstance(BookingEngine.class);

		}
	
	
	/** Verify bus recent search card
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify  bus recent search card , for method: {method} step...")
	public BookingEngine verifyBusRecentSearchCardCreation() throws Exception {
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Bus
	 waitAndClickWebElement(bus_xpath);
	 
		//Click on From City
	 waitAndClickWebElement(bus_source_city_xpath);
	
	 writeText(bus_source_city_xpath, "MYS");
	 waitAndClickWebElement(bus_source_city_value_xpath);
	 
		//Click on To City
	 waitAndClickWebElement(bus_destination_city_xpath);
	
	 writeText(bus_destination_city_xpath, "Kol");
	 waitAndClickWebElement(bus_destination_city_value_xpath);
	 
	 waitAndClickWebElement(bus_departure_date_xpath);

	 waitAndClickWebElement(Bus_Next_month_arrow_departure_date_xpath);

	 waitAndClickWebElement(Bus_departure_date_xpath);

	 waitAndClickWebElement(Bus_FromPreferredTime_Dropdown_xpath);

	 waitAndClickWebElement(Bus_SelectFromPreferredTime_Selection_xpath);
	 	
	 waitAndClickWebElement(Bus_ToPreferredTime_Dropdown_xpath);
	 	
	 waitAndClickWebElement(bus_preferred_class_xpath);

	 waitAndClickWebElement(bus_preferred_class_value_xpath);

	 writeText(bus_boarding_location_xpath,"PUNE");
	 
	 waitAndClickWebElement(bus_boarding_location_value_xpath);
	 
	 writeText(bus_drop_location_xpath,"BANG");
	 
    waitAndClickWebElement(bus_drop_location_value_xpath);
		//Click on To City
	 waitAndClickWebElement(Submit_Button_Train_xpath);
	
	 //Click on back button
	 waitAndClickWebElement(back_button_xpath);
  
	 //Bus recent search card
	 boolean bus_search_card_created=isElementDisplayed(Bus_RecentSearch_Info_xpath);

	 softAssert.assertTrue(bus_search_card_created); 
 	
	 return GetInstance(BookingEngine.class);

		}

	/**
	 * Verify Bus search using recent search card
	 * @throws Exception 
	 */
	@Step("Verify Bus search using recent search card, for method: {method} step...")
	public BookingEngine verifyBusSearchUsingRecentSearch() throws Exception {
		
    //Click on Bus
	waitAndClickWebElement(bus_xpath);		
	
	//Click on bus recent search card
	waitAndClickWebElement(Bus_RecentSearch_Info_xpath);
	
	 //Click on submit button
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 SoftAssert softAssert = new SoftAssert();
	 
	 waitForElementVisible(bus_review_xpath);
	 boolean actual = isElementDisplayed(bus_review_xpath);
	 
	 softAssert.assertTrue(actual);
	 
	 softAssert.assertAll();
	 	
	  return GetInstance(BookingEngine.class);

	}	
	
	/**
	 * Verify  bus submission without mandatory fields
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify bus submission without mandatory fields, for method: {method} step...")
	public BookingEngine verifyBusSubmissionWithoutMandatoryFields() throws Exception {
			
	 SoftAssert softAssert = new SoftAssert();
		
		//Click on Bus
	 waitAndClickWebElement(bus_xpath);
	 
		//Click on Submit
	 waitAndClickWebElement(Submit_Button_xpath);
	 
	 waitForElementVisible(FromCity_Validation_message_xpath);
	 boolean isDisplayed=isElementDisplayed(FromCity_Validation_message_xpath);
	 
	 softAssert.assertTrue(isDisplayed); 
	 softAssert.assertAll();
	 hardPageRefresh();
	 return GetInstance(BookingEngine.class);

		}
	/**
	 * Verify Bus preferred 'From' Time validation message
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify preferred 'From' Time validation message, for method: {method} step...")
	public BookingEngine verifyBusPreferredFromTimeValidation() throws Exception {
			
		 SoftAssert softAssert = new SoftAssert();
			
			//Click on Bus
		 waitAndClickWebElement(bus_xpath);
		 
			//Click on From City
		 waitAndClickWebElement(bus_source_city_xpath);
		
		 writeText(bus_source_city_xpath, "MYS");
		 waitAndClickWebElement(bus_source_city_value_xpath);
		 
			//Click on To City
		 waitAndClickWebElement(bus_destination_city_xpath);
		
		 writeText(bus_destination_city_xpath, "Kol");
		 waitAndClickWebElement(bus_destination_city_value_xpath);
		 waitAndClickWebElement(bus_departure_date_xpath);
		 
		 waitAndClickWebElement(Bus_Next_month_arrow_departure_date_xpath);
		 
		 waitAndClickWebElement(Bus_departure_date_xpath);
		//Click on Submit
		 waitAndClickWebElement(Submit_Button_xpath);
	 
		 waitForElementVisible(Bus_Preferred_From_Time_Validation_xpath);
		 boolean isDisplayed=isElementDisplayed(Bus_Preferred_From_Time_Validation_xpath);
	 
		 softAssert.assertTrue(isDisplayed); 
		 softAssert.assertAll();
		 
		 hardPageRefresh();
	 	
		 return GetInstance(BookingEngine.class);

		}
	/**
	 * Verify Bus preferred 'To' Time validation message
	 * @return the BookingEngine page elements
	 * @throws Exception 
	 */
	@Step("Verify preferred 'To' Time validation message, for method: {method} step...")
	public BookingEngine verifyBusPreferredToTimeValidation() throws Exception {
			
		 SoftAssert softAssert = new SoftAssert();
			
			//Click on Bus
		 waitAndClickWebElement(bus_xpath);
		 
			//Click on From City
		 waitAndClickWebElement(bus_source_city_xpath);
		
		 writeText(bus_source_city_xpath, "MYS");
		 waitAndClickWebElement(bus_source_city_value_xpath);
		 
			//Click on To City
		 waitAndClickWebElement(bus_destination_city_xpath);
		
		 writeText(bus_destination_city_xpath, "Kol");
		 waitAndClickWebElement(bus_destination_city_value_xpath);
		 
		 waitAndClickWebElement(bus_departure_date_xpath);
		 
		 waitAndClickWebElement(Bus_Next_month_arrow_departure_date_xpath);

		 waitAndClickWebElement(Bus_departure_date_xpath);

		 waitAndClickWebElement(Bus_FromPreferredTime_Dropdown_xpath);

		 waitAndClickWebElement(Bus_SelectFromPreferredTime_Selection_xpath);
	 
		//Click on Submit
		 waitAndClickWebElement(Submit_Button_xpath);
	 
		 waitForElementVisible(Bus_Preferred_To_Time_Validation_xpath);
		 boolean isDisplayed=isElementDisplayed(Bus_Preferred_To_Time_Validation_xpath);
	 
		 softAssert.assertTrue(isDisplayed); 
		 softAssert.assertAll();
	 	
		 hardPageRefresh();
		 return GetInstance(BookingEngine.class);

		}
	
	
}
