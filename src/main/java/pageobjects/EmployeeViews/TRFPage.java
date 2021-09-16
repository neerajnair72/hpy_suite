package pageobjects.EmployeeViews;

import frameworkBase.TestBotElementsWrapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class TRFPage extends TestBotElementsWrapper {
	
	public static TRFPage travelRequestsPage;

	public String timestamp() {
		String timestamp = Long.toString(new Date().getTime());
		return "TRF_name_" + timestamp;
	}

	//@FindBy(how = How.XPATH, using = "//a[text()='TRAVEL REQUESTS']")
	@FindBy(xpath="//a[text()='Travel Requests']")
	private WebElement TRF_dashboardpage_xpath;

	public WebElement getTRF_dashboardpage_xpath() {
		return TRF_dashboardpage_xpath;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Request New Travel']")
	@CacheLookup
	private WebElement RequestnewTravel_Button_Xpath;

	//@FindBy(how = How.ID, using = "trfName")
	@FindBy(xpath="//div/input[@id='trfName']")
	@CacheLookup
	private WebElement TRFName_Field_Xpath;

	//@FindBy(how = How.ID, using = "trfDescription")
	@FindBy(xpath="//div/input[@id='trfDescription']")
	@CacheLookup
	private WebElement PurposeofTravel_Field_Xpath;

	@FindBy(how = How.XPATH, using = "//div [text()='Next']")
	@CacheLookup
	private WebElement Next_Button_Xpath;

	@FindBy(how = How.CLASS_NAME, using = "primaryButton")
	@CacheLookup
	private WebElement creteTRF_Button_Xpath;

	@FindBy(how = How.CLASS_NAME, using = "customToastContent")
	@CacheLookup
	private WebElement TRFSuccess_Message_Xpath;

	
	//@FindBy(how = How.XPATH, using = "//div/button/span[text()='Add Trips']/..")
	@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[2]/span")
	@CacheLookup
	private WebElement AddTrips_Button_Xpath;

	// Add Trips inside TRF
	@FindBy(xpath = "//div//div[text()='ADD TRIPS']")
	@CacheLookup
	private WebElement AddTrip_insideTRF_xpath;

	// Add trip button after filling all the details
	@FindBy(xpath = "//div/button/span[text()='Add Trip']/..")
	@CacheLookup
	private WebElement AddTRIPbutton_xpath;

	// Booking type radio button in trips screen in automation orh prod
	@FindBy(xpath = "//div/label/span[text()='Self']")
	@CacheLookup
	private WebElement BookingType_self_radiobutton_xpath;
	

	// Type of travel in trips screen
	@FindBy(xpath = "(//div/label/span[text()='Domestic'])[1]")
	@CacheLookup
	private WebElement TravelType_Domestic_radiobutton_xpath;
	
	// No in Train booking
	@FindBy(xpath = "(//div/label/span[text()='No'])[2]/..")
	@CacheLookup
	private WebElement NO_radiobutton_xpath;
	
	// Hotel in accomadation OUP
	@FindBy(xpath = "//div/label/span[text()='Hotel']")
	@CacheLookup
	private WebElement Hotel_radiobutton_xpath;
	
	// Hotel in accomadation OUP
	@FindBy(xpath = "//div/label/span[text()='Self Accommodat...']")
	@CacheLookup
	private WebElement SelfAccommodation_radiobutton_xpath;
	
	// Single Room in accomadation OUP
	@FindBy(xpath = "//div/label/span[text()='Single']")
	@CacheLookup
	private WebElement SingleRoom_radiobutton_xpath_OUP;
	
	

	// Recall button in submitted TRF
	@FindBy(xpath = "//div/button/span[text()='Recall']/..")
	@CacheLookup
	private WebElement RecallButton_xpath;

	// Proceed button on Recall popup in submitted TRF
	@FindBy(xpath = "//div/button/span[text()='Proceed']/..")
	@CacheLookup
	private WebElement RecallButtonConfirm_xpath;


	/** Action Menu in TRF  */
	@FindBy(xpath="//td[@class='actionColumnHoverClass']//div//img")
	private WebElement ActionMenu_xpath;
	
	/** Arrow button in TRF  */
	@FindBy(xpath="//div[@class='ReportTableCards']//button")
	private WebElement Arrow_xpath;
	
	/** Pending state TRF filter*/
	//@FindBy(xpath="//label[contains(text(),'Pending')]")
	@FindBy(xpath="//label[contains(text(),'Pending at Manager')]")
	private WebElement PendingTRF_xpath;

	/** Edit in the hamburger menu */
	@FindBy(xpath = "//span/div/div[text()='Edit']")
	@CacheLookup
	private WebElement EditHamburger_TRF_xpath;

	/** Delete in the hamburger menu */
	@FindBy(xpath = "//span/div/div[text()='Delete']")
	@CacheLookup
	private WebElement DeleteHamburger_TRF_xpath;
	
	
	/** Delete button in quick view */
	@FindBy(xpath = "//button/span[text()='Delete']")
	@CacheLookup
	private WebElement DeleteQuickView_TRF_xpath;

	/** Delete confirm in popup*/
	//@FindBy(xpath = "//div/button/span[text()='Delete']/..")
	@FindBy(xpath = "(//div/button/span[text()='Delete']/..)[2]")
	@CacheLookup
	private WebElement DeleteConfirmHamburger_TRF_xpath;

	/** Saved TRF from filter */
	@FindBy(xpath = "//div/label[text()='Saved']")
	@CacheLookup
	private WebElement Saved_TRF_Filter_xpath;

	/** Deatailed View in hamburger */
	@FindBy(xpath = "//span/div/div[text()='Detailed view']")
	@CacheLookup
	private WebElement DetailedView_xpath;

	/** Edit TRF button */
	@FindBy(how = How.XPATH, using = "//div[text()='Edit TRF']")
	@CacheLookup
	private WebElement edit_TRFbutton_Xpath;
	
	/** Edit Trip button */
	@FindBy(xpath="//div[@class='mdl-layout__content']//span//img[1]")
	@CacheLookup
	private WebElement edit_Tripbutton_Xpath;

	/** Update TRF button */
	//@FindBy(how = How.XPATH, using = "//div/button/span[text()='update']/..")
	@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[2]")
	@CacheLookup
	private WebElement Update_TRFbutton_Xpath;
	
	/** Update TRF button */
	@FindBy(xpath="//div/button/span[text()='update Trip']/..")
	@CacheLookup
	private WebElement Update_Tripbutton_Xpath;
	

	/** Delete Trip inside TRF */
	@FindBy(xpath = "//body//img[2]")
	@CacheLookup
	private WebElement DeleteTrip_xpath;

	/** Delete Trip confirm inside TRF */
	@FindBy(xpath = "	//div/button/span[text()='Delete']/..")
	@CacheLookup
	private WebElement DeleteTripConfirm_xpath;

	/** TRF Back button */
	@FindBy(xpath = "//span[text()='Back']/..")
	@CacheLookup
	private WebElement trf_backbutton_Xpath;

	@FindBy(xpath = "//div[@class = 'exportEtl']")
	@CacheLookup
	private WebElement export_link;

	@FindBy(xpath = "//div[text()='Download']")
	@CacheLookup
	private WebElement download;

	@FindBy(xpath = "//input[@type='text'][@class='ReactTags__tagInputField']")
	@CacheLookup
	private WebElement mailid_xpath;

	@FindBy(xpath = "(//span[text()='Download'])[2]/..")
	@CacheLookup
	private WebElement download_report;

	@FindBy(xpath = "//span[text()='Download']/..")
	@CacheLookup
	private WebElement download_button;

	@FindBy(xpath = "//div[text()='Policy Exception Report']")
	@CacheLookup
	private WebElement policyexception;

	@FindBy(xpath = "//div[text()='Workflow Comments']")
	@CacheLookup
	private WebElement workflow_comments;

	@FindBy(xpath = "//label[text()='Violated']/.")
	@CacheLookup
	private WebElement violated_xpath;

	@FindBy(xpath = "//label[text()='Not Violated']/.")
	@CacheLookup
	private WebElement nonviolated_xpath;

	@FindBy(xpath = "//div[text()='Not Violated']")
	@CacheLookup
	private WebElement NonViolated_filter_xpath;

	@FindBy(xpath = "//div[text()='Violated']")
	@CacheLookup
	private WebElement Violated_filter_xpath;

	@FindBy(xpath = "//tr[1]//td[9]//div[1]//div[1]//span[1]//img[1]")
	@CacheLookup
	private WebElement Violated_Present_filter_xpath;

	// Submit TRF button
	@FindBy(how = How.XPATH, using = "//div/button[@class='primaryButton']")
	@CacheLookup
	private WebElement save_Button_Xpath;

	//@FindBy(how = How.XPATH, using = "//div[@class='customToastContent']/..")
	 @FindBy(xpath = "//div[@class='customToast showCustomToast']")
	@CacheLookup
	private WebElement displayedsuccessfulmessage_XPATH;

	// TRF Date Extra field
	@FindBy(xpath = "//div/div[text()='TRF_Date_EF']")
	@CacheLookup
	private WebElement date_extrafield_xpath;
	
	
	// TRF Location city in OUP org
	@FindBy(xpath = "(//input[@type='text'])[1]")
	@CacheLookup
	private WebElement City_xpath_OUP;
	
	// TRF Check in Date Extra field in OUP org
	@FindBy(xpath = "(//input[@type='text'])[2]")
	@CacheLookup
	private WebElement Checkindate_xpath_OUP;
	
	// TRF Check in Date Extra field in OUP org
	@FindBy(xpath = "(//input[@type='text'])[3]")
	@CacheLookup
	private WebElement checoutDate_xpath_OUP;
	
	
	// TRF Country group in pre prod for OUP
	@FindBy(xpath = "//div/input[@name='Country Group']")
	@CacheLookup
	private WebElement country_group_xpath_OUP;
	
	// TRF Country group india in pre prod for OUP
	@FindBy(xpath = "//span/div/span[@title='India']")
	@CacheLookup
	private WebElement countryIndia_group_xpath_OUP;
	
	 /** Saved TRF filter */
	@FindBy(xpath = "(//td/div[text()='Saved'])[1]")
	@CacheLookup
	private WebElement SavedTRF_xpath_OUP;

	
	
	

	/** The todate select xapth */
	@FindBy(how = How.XPATH, using = "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	@CacheLookup
	private WebElement Today_Date_xpath;
	
	/** Element of TRF name in pending list */
	@FindBy(xpath="//tr[1]//td[3]//div[1]")
	@CacheLookup
	private WebElement VerfiyPendingTRF_xpath;
	

	public TRFPage RecallTRF(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		//shortWait();
		moveToElement_Actions(PendingTRF_xpath);
		waitForElementVisible(PendingTRF_xpath);
		waitForElementToClickable(PendingTRF_xpath);

		click_Actions(PendingTRF_xpath);
		//shortWait();
		waitForElementVisible(ActionMenu_xpath);
		waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(DetailedView_xpath);
		waitAndClickWebElement(DetailedView_xpath);
		waitForElementVisible(RecallButton_xpath);
		waitForElementToClickable(RecallButton_xpath);
		waitAndClickWebElement(RecallButton_xpath);
		waitForElementVisible(RecallButtonConfirm_xpath);
		waitForElementToClickable(RecallButtonConfirm_xpath);
		waitAndClickWebElement(RecallButtonConfirm_xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertAll();
	 	return this;
	}

	public TRFPage EditTRF(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(ActionMenu_xpath);
		waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(EditHamburger_TRF_xpath);
		waitAndClickWebElement(EditHamburger_TRF_xpath);
		//shortWait();
		waitForElementVisible(edit_TRFbutton_Xpath);
		waitAndClickWebElement(edit_TRFbutton_Xpath);
		//shortWait();
		waitForElementVisible(TRFName_Field_Xpath);
		String b = Keys.BACK_SPACE.toString();
		TRFName_Field_Xpath.sendKeys(b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b);
		writeText(TRFName_Field_Xpath, "TRF Automation Edited");

		waitAndClickWebElement(Update_TRFbutton_Xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertAll();
		return this;
	}
	
	public TRFPage EditTrip(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(ActionMenu_xpath);
		waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(EditHamburger_TRF_xpath);
		waitAndClickWebElement(EditHamburger_TRF_xpath);
		//shortWait();
		waitForElementVisible(edit_Tripbutton_Xpath);
		waitAndClickWebElement(edit_Tripbutton_Xpath);
		//shortWait();
		
		waitAndClickWebElement(Update_Tripbutton_Xpath);
		//shortWait();
		//waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		return this;
	}

	public TRFPage DeleteTRF(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		// ScrollToElement(hamburgerMenu);
		waitForElementVisible(Saved_TRF_Filter_xpath);
		waitAndClickWebElement(Saved_TRF_Filter_xpath);
		//shortWait();
		waitForElementVisible(ActionMenu_xpath);
		waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(DeleteHamburger_TRF_xpath);
		waitAndClickWebElement(DeleteHamburger_TRF_xpath);
		//shortWait();
		waitForElementVisible(DeleteConfirmHamburger_TRF_xpath);
		waitForElementToClickable(DeleteConfirmHamburger_TRF_xpath);
		waitAndClickWebElement(DeleteConfirmHamburger_TRF_xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(),string);
		softAssert.assertAll();
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		return this;
	}
	
	public TRFPage DeleteTRF_OUP(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(SavedTRF_xpath_OUP);
		waitForElementToClickable(SavedTRF_xpath_OUP);
	    click_Actions(SavedTRF_xpath_OUP);
	    //shortWait();
	   // ScrollToElement(ActionMenu_xpath);
		//waitForElementVisible(ActionMenu_xpath);
		//waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(DeleteQuickView_TRF_xpath);
		waitAndClickWebElement(DeleteQuickView_TRF_xpath);
		//shortWait();
		waitForElementVisible(DeleteConfirmHamburger_TRF_xpath);
		waitForElementToClickable(DeleteConfirmHamburger_TRF_xpath);
		waitAndClickWebElement(DeleteConfirmHamburger_TRF_xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(),string);
		softAssert.assertAll();
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		return this;
	}

	public TRFPage DeleteTrip(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(ActionMenu_xpath);
		waitForElementToClickable(ActionMenu_xpath);
		waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(EditHamburger_TRF_xpath);
		waitAndClickWebElement(EditHamburger_TRF_xpath);
		//shortWait();
		waitForElementVisible(DeleteTrip_xpath);
		waitForElementToClickable(DeleteTrip_xpath);
		waitAndClickWebElement(DeleteTrip_xpath);
		//shortWait();
		waitForElementVisible(DeleteTripConfirm_xpath);
		waitAndClickWebElement(DeleteTripConfirm_xpath);
		//shortWait();
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		//shortWait();
		softAssert.assertAll();
		return this;
	}
	
	public TRFPage VerifyPendingList(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(VerfiyPendingTRF_xpath);
		String Actual= getText(VerfiyPendingTRF_xpath);
		System.out.println(Actual + " Present in pending list");
		softAssert.assertEquals(Actual.equalsIgnoreCase(string), true);
	   	softAssert.assertAll();
		return this;
	}
	

	public TRFPage exportReport(XSSFRow rowData, String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);
		//shortWait();
		waitAndClickWebElement(export_link);
		//shortWait();
		waitAndClickWebElement(download);
		//shortWait();
		waitForElementVisible(mailid_xpath);
		waitAndClickWebElement(mailid_xpath);
		//shortWait();
		writeText(mailid_xpath, rowData.getCell(3).toString());
		writeKeyboardText(mailid_xpath, Keys.ENTER);
		moveToElement_Actions(download_report);
		click_Actions(download_report);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		return this;

	}

	public TRFPage policyExceptionReport(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);
		//shortWait();
		waitAndClickWebElement(export_link);
		//shortWait();
		waitAndClickWebElement(policyexception);
		waitForElementVisible(mailid_xpath);
		// waitAndClickWebElement(mailid_xpath);
		// //shortWait();
		writeText(mailid_xpath, rowData.getCell(1).toString());
		moveToElement_Actions(download_button);
		click_Actions(download_button);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		return this;

	}

	public TRFPage downloadWorkflowComments(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();

		// waitAndClickWebElement(reports_Link_xpath);
		//shortWait();
		waitAndClickWebElement(export_link);
		//shortWait();
		waitAndClickWebElement(workflow_comments);
		waitForElementVisible(mailid_xpath);
		// waitAndClickWebElement(mailid_xpath);
		// //shortWait();
		writeText(mailid_xpath, rowData.getCell(1).toString());
		click_Actions(download_button);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		return this;
	}

	public TRFPage selectNonViolatedFilter(String string)

	{SoftAssert softAssert = new SoftAssert();
		//shortWait();
		ScrollToElement(nonviolated_xpath);
		waitForElementVisible(nonviolated_xpath);
		// moveToElement_Actions(nonviolated_xpath);
		// click_Actions(nonviolated_xpath);
		doubleClick(nonviolated_xpath);
		//shortWait();
		waitForElementVisible(NonViolated_filter_xpath);
		softAssert.assertEquals(NonViolated_filter_xpath.getText(), string);

		return this;

	}

	public TRFPage selectViolatedFilter(String string) throws Exception

	{   SoftAssert softAssert = new SoftAssert();
		//shortWait();
		waitForElementVisible(violated_xpath);
		// ScrollToElement(violated_xpath);
		ScrollDown(violated_xpath);
		moveToElement_Actions(violated_xpath);
		// click_Actions(nonviolated_xpath);
		doubleClick(violated_xpath);
		//shortWait();
		waitForElementVisible(Violated_filter_xpath);
		softAssert.assertEquals(Violated_filter_xpath.getText(), string);
		return this;

	}

	public WebElement displayeduccessfulmessage_XPATH() {

		return displayedsuccessfulmessage_XPATH;
	}

	public WebElement TRFSuccess() {
		System.out.println(wait.until(ExpectedConditions.visibilityOf(TRFSuccess_Message_Xpath)).getText());
		return TRFSuccess_Message_Xpath;
	}

	public TRFPage AddtripButton() throws Exception {
		//shortWait();
		moveToElement_Actions(AddTrips_Button_Xpath);
		waitAndClickWebElement(AddTrips_Button_Xpath);
		 
		return this;
	}

	public TRFPage Goto_TRFCreation_Page() throws Exception {
		waitForElementVisible(TRF_dashboardpage_xpath);
		waitForElementToClickable(TRF_dashboardpage_xpath);
		click_Actions(TRF_dashboardpage_xpath);
		waitForElementVisible(RequestnewTravel_Button_Xpath);
		waitForElementToClickable(RequestnewTravel_Button_Xpath);
		//waitAndClickWebElement(RequestnewTravel_Button_Xpath);
		waitAndClickWebElement(RequestnewTravel_Button_Xpath);
		return this;
	}

	public TRFPage Goto_TRF_Page() throws InterruptedException {
		waitForElementVisible(TRF_dashboardpage_xpath);
		waitForElementToClickable(TRF_dashboardpage_xpath);
		click_Actions(TRF_dashboardpage_xpath);
		return this;
	}

	public TRFPage CityField_OUP(XSSFRow rowData){
		waitForElementVisible(City_xpath_OUP);
		waitForElementToClickable(City_xpath_OUP);
		writeText(City_xpath_OUP, rowData.getCell(4).toString());
		//shortWait();
		writeText(City_xpath_OUP, Keys.ARROW_DOWN+""+ Keys.ENTER);	
		//shortWait();

		return this;
	}
	
	public TRFPage CreateTRFwithNativeField(XSSFRow rowData) throws Exception {
        untilPageLoadComplete();
		waitForElementVisible(TRFName_Field_Xpath);
		writeText(TRFName_Field_Xpath, rowData.getCell(1).toString());
		waitForElementVisible(PurposeofTravel_Field_Xpath);
		//click_Actions(PurposeofTravel_Field_Xpath);
		writeText(PurposeofTravel_Field_Xpath, rowData.getCell(2).toString());
		//shortWait();
		waitForElementVisible(country_group_xpath_OUP);
	 	click_Actions(country_group_xpath_OUP);
		waitForElementVisible(countryIndia_group_xpath_OUP);
		//waitAndClickWebElement(countryIndia_group_xpath_OUP);
		waitAndClickWebElement(countryIndia_group_xpath_OUP);
		return this;
	}

	public TRFPage creteTRF_Button() {
		waitAndClickWebElement(creteTRF_Button_Xpath);
		return this;
	}

	public TRFPage addTripInsideTRF() throws Exception {
		waitForElementToClickable(AddTrip_insideTRF_xpath);
		waitAndClickWebElement(AddTrip_insideTRF_xpath);
		waitForElementToClickable(BookingType_self_radiobutton_xpath);
		doubleClick(BookingType_self_radiobutton_xpath);
		waitForElementToClickable(TravelType_Domestic_radiobutton_xpath);
		doubleClick(TravelType_Domestic_radiobutton_xpath);
		//shortWait();
		moveToElement_Actions(AddTRIPbutton_xpath);
		click_Actions(AddTRIPbutton_xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		//softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		return this;
	}
	
	public TRFPage addTripInsideTRFwithHotel_OUP(XSSFRow rowData) throws Exception {
		waitForElementToClickable(AddTrip_insideTRF_xpath);
	    waitAndClickWebElement(AddTrip_insideTRF_xpath);
		waitForElementToClickable(TravelType_Domestic_radiobutton_xpath);
		doubleClick(TravelType_Domestic_radiobutton_xpath);
		waitForElementToClickable(TravelType_Domestic_radiobutton_xpath);
		doubleClick(TravelType_Domestic_radiobutton_xpath);
		//shortWait();
		moveToElement_Actions(NO_radiobutton_xpath);
		click_Actions(NO_radiobutton_xpath);
		waitForElementToClickable(Hotel_radiobutton_xpath);
		click_Actions(Hotel_radiobutton_xpath);
		
		
		CityField_OUP(rowData);
		//shortWait();

		ScrollToElement(checoutDate_xpath_OUP);
		waitForElementToClickable(checoutDate_xpath_OUP);
		click_Actions(checoutDate_xpath_OUP);
		waitForElementVisible(Today_Date_xpath);
	    waitForElementToClickable(Today_Date_xpath);
		click_Actions(Today_Date_xpath);
		//shortWait();
		
		ScrollToElement(SingleRoom_radiobutton_xpath_OUP);
		waitForElementToClickable(SingleRoom_radiobutton_xpath_OUP);
		click_Actions(SingleRoom_radiobutton_xpath_OUP);
		//shortWait();
		
		waitForElementToClickable(Checkindate_xpath_OUP);
		click_Actions(Checkindate_xpath_OUP);
		//waitForElementToClickable(Today_Date_xpath);
		click_Actions(Today_Date_xpath);
		//shortWait();
	
		moveToElement_Actions(AddTRIPbutton_xpath);
		click_Actions(AddTRIPbutton_xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		//softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		return this;
	}
	
	public TRFPage addTripInsideTRFWithSeldAccomdation_OUP() throws Exception {
		waitForElementToClickable(AddTrip_insideTRF_xpath);
	    waitAndClickWebElement(AddTrip_insideTRF_xpath);
		waitForElementToClickable(TravelType_Domestic_radiobutton_xpath);
		doubleClick(TravelType_Domestic_radiobutton_xpath);
		waitForElementToClickable(TravelType_Domestic_radiobutton_xpath);
		doubleClick(TravelType_Domestic_radiobutton_xpath);
		//shortWait();
		moveToElement_Actions(NO_radiobutton_xpath);
		click_Actions(NO_radiobutton_xpath);
		waitForElementToClickable(SelfAccommodation_radiobutton_xpath);
		click_Actions(SelfAccommodation_radiobutton_xpath);
		moveToElement_Actions(AddTRIPbutton_xpath);
		waitAndClickWebElement(AddTRIPbutton_xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		//softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		return this;
	}
	
	

	public TRFPage SaveTRF_OUP() throws Exception {
		addTripInsideTRFWithSeldAccomdation_OUP();
		moveToElement_Actions(trf_backbutton_Xpath);
		click_Actions(trf_backbutton_Xpath);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);

		return this;
	}

	public TRFPage SaveTRF() throws Exception {
		addTripInsideTRF();
		moveToElement_Actions(trf_backbutton_Xpath);
		click_Actions(trf_backbutton_Xpath);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);

		return this;
	}

	
	public TRFPage SubmitTRF(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		addTripInsideTRF();
		//shortWait();
		moveToElement_Actions(save_Button_Xpath);
		waitAndClickWebElement(save_Button_Xpath);
		//shortWait();		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertAll();
		return this;
	}

	public TRFPage SubmitTRF_OUP(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		addTripInsideTRFWithSeldAccomdation_OUP();
		//shortWait();
		moveToElement_Actions(save_Button_Xpath);
		waitAndClickWebElement(save_Button_Xpath);
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		waitForElementInVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertAll();
		return this;
	}
	
	public TRFPage veirfySuccessMessage(String string) {
		SoftAssert softAssert = new SoftAssert();

		//shortWait();
		waitForElementVisible(displayedsuccessfulmessage_XPATH);
		softAssert.assertEquals(displayedsuccessfulmessage_XPATH.getText(), string);
		softAssert.assertAll();
		return this;
	}

	public TRFPage TestArrow() throws Exception {

		
		waitForElementVisible(ActionMenu_xpath);
		waitAndClickWebElement(ActionMenu_xpath);
		waitForElementToClickable(DetailedView_xpath);
		//waitAndClickWebElement(DetailedView_xpath);
		waitAndClickWebElement(DetailedView_xpath);
		//mediumWait();
		waitForElementToClickable(Arrow_xpath);
		//waitAndClickWebElement(Arrow_xpath);
		waitAndClickWebElement(Arrow_xpath);
		
		//mediumWait();
		
		return this;
	}
}