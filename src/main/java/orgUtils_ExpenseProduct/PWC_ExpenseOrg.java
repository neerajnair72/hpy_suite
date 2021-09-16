package orgUtils_ExpenseProduct;

import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.Log;
import io.qameta.allure.Step;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import pageobjects.EmployeeViews.CreateExpensePage;

import java.io.File;
import java.util.List;

public class PWC_ExpenseOrg extends TestBotElementsWrapper {
	public static String timestamp = "";
	/** The category Train and Bus Fare */
	@FindBy(xpath = "//div/span[text()='Train and Bus Fare']")
	@CacheLookup
	private WebElement categoryTrainBusFare_xpath_PWC;

	/** The category Airfare Expense */
	@FindBy(xpath = "//div/span[text()='Airfare Expense']")
	@CacheLookup
	private WebElement categoryAirfareExpense_xpath_PWC;

	@FindBy(xpath="//input[@placeholder='Select Category']")
	private WebElement VerifyCategory_PWC;

	/** The category Books and Periodicals */
	@FindBy(xpath = "//div/span[text()='Books & Periodicals']")
	@CacheLookup
	private WebElement categoryBooksPeriodicals_xpath_PWC;

	/** The category Communication */
	@FindBy(xpath = "//div/span[text()='Communication']")
	@CacheLookup
	private WebElement categoryCommunication_xpath_PWC;

	/** The category Continuing Education */
	@FindBy(xpath = "//div/span[text()='Continuing Education']")
	@CacheLookup
	private WebElement categoryContinuingEducation_xpath_PWC;

	/** The category Conveyance */
	@FindBy(xpath = "//div/span[text()='Conveyance']")
	@CacheLookup
	private WebElement categoryConveyance_xpath_PWC;

	/** The category Courier-Postage */
	@FindBy(xpath = "//div/span[text()='Courier-Postage']")
	@CacheLookup
	private WebElement categoryCourierPostage_xpath_PWC;

	/** The category Employee Initiatives */
	@FindBy(xpath = "//div/span[text()='Employee Initiatives']")
	@CacheLookup
	private WebElement categoryEmployeeInitiatives_xpath_PWC;

	/** The category Equipment Hire Charges */
	@FindBy(xpath = "//div/span[text()='Equipment Hire Charges']")
	@CacheLookup
	private WebElement categoryEquipmentHireCharges_xpath_PWC;

	/** The category Event Expenses */
	@FindBy(xpath = "//div/span[text()='Event Expenses']")
	@CacheLookup
	private WebElement categoryEventExpenses_xpath_PWC;

	/** The category Executive Health Check-up */
	@FindBy(xpath = "//div/span[text()='Executive Health Check-up']")
	@CacheLookup
	private WebElement categoryExecutiveHealthCheckup_xpath_PWC;

	/** The category Fees/ Rates and Taxes */
	@FindBy(xpath = "//div/span[text()='Fees/ Rates and Taxes']")
	@CacheLookup
	private WebElement categoryFeeRatesandTaxes_xpath_PWC;

	/** The category Gifts & Presents */
	@FindBy(xpath = "//div/span[text()='Gifts & Presents']")
	@CacheLookup
	private WebElement categoryGiftsPresents_xpath_PWC;

	/** The category Guest House Expenses */
	@FindBy(xpath = "//div/span[text()='Guest House Expenses']")
	@CacheLookup
	private WebElement categoryGuestHouseExpenses_xpath_PWC;

	/** The category Hotel Booking Expense */
	@FindBy(xpath = "//div/span[text()='Hotel Booking Expense']")
	@CacheLookup
	private WebElement categoryHotelBookingExpense_xpath_PWC;

	/** The category Incidental Expenses (Per-diem) */
	@FindBy(xpath = "//div/span[text()='Incidental Expenses (Per-diem)']")
	@CacheLookup
	private WebElement categoryIncidentalExpenses_xpath_PWC;

	/** The category Meals and Refreshments */
	@FindBy(xpath = "//div/span[text()='Meals and Refreshments']")
	@CacheLookup
	private WebElement categoryMealsandRefreshments_xpath_PWC;

	/** The category Membership and Subscription */
	@FindBy(xpath = "//div/span[text()='Membership and Subscription']")
	@CacheLookup
	private WebElement categoryMembershipSubscription_xpath_PWC;

	/** The category Participation Fees */
	@FindBy(xpath = "//div/span[text()='Participation Fees']")
	@CacheLookup
	private WebElement categoryParticipationFees_xpath_PWC;

	/** The category Printing and Stationery */
	@FindBy(xpath = "//div/span[text()='Printing and Stationery']")
	@CacheLookup
	private WebElement categoryPrintingandStationery;

	/** The category Proposal Expenses */
	@FindBy(xpath = "//div/span[text()='Proposal Expenses']")
	@CacheLookup
	private WebElement categoryProposalExpenses_xpath_PWC;

	/** The category Relocation Charges */
	@FindBy(xpath = "//div/span[text()='Relocation Charges']")
	@CacheLookup
	private WebElement categoryRelocationCharges_xpath_PWC;

	/** The category Travel Insurance */
	@FindBy(xpath = "//div/span[text()='Travel Insurance']")
	@CacheLookup
	private WebElement categoryTravelInsurance_xpath_PWC;

	/** The category Vehicle Expenses (Partners) */
	@FindBy(xpath = "//div/span[text()='Vehicle Expenses (Partners)']")
	@CacheLookup
	private WebElement categoryVehicleExpenses_xpath_PWC;

	/** The category Visa */
	@FindBy(xpath = "//div/span[text()='Visa']")
	@CacheLookup
	private WebElement categoryVisa_xpath_PWC;

	/** Travel booking type under airfare */
	@FindBy(xpath = "//div/input[@name='Travel booking type']")
	@CacheLookup
	private WebElement Travel_bookingType_airfare_xpath_PWC;

	/** Availed drop down option in Travel booking type under airfare */
	@FindBy(xpath = "//div/span[@title='Availed']")
	@CacheLookup
	private WebElement Availed_airfare_xpath_PWC;

	/** Cancellation drop down option in Travel booking type under airfare */
	@FindBy(xpath = "//div/span[@title='Cancellation']")
	@CacheLookup
	private WebElement Cancellation_airfare_xpath_PWC;

	/** Reschedule drop down option in Travel booking type under airfare */
	@FindBy(xpath = "//div/span[@title='Reschedule']")
	@CacheLookup
	private WebElement Reschedule_airfare_xpath_PWC;

	/** class of travel under airfare */
	//@FindBy(xpath = "//div/input[@name='Class of Travel']/..")
	@FindBy(xpath="//input[@name='Class of Travel']")
	@CacheLookup
	private WebElement classofTravel_airfare_xpath_PWC;

	@FindBy(xpath="//div[@class='searchableSelectItemClass']")
	private List<WebElement> DP_list;

	/** Business class in class of travel under airfare */
	@FindBy(xpath = "//div/span[@title='Business']")
	@CacheLookup
	private WebElement Busineessclass_airfare_xpath_PWC;

	/** Economy class in class of travel under airfare */
	@FindBy(xpath = "//div/span[@title='Economy']")
	@CacheLookup
	private WebElement Economyclass_airfare_xpath_PWC;

	/** Business class of travel in class of travel under airfare */
	@FindBy(xpath = "//div/span[@title='Premium Economy']")
	@CacheLookup
	private WebElement PremiumEconomyclass_airfare_xpath_PWC;

	/** Pupose of Travel under airfare category */
	@FindBy(xpath = "//div/input[@name='Purpose of Travel']/..")
	@CacheLookup
	private WebElement PurposeofTravel_xpath_PWC;

	/** Ticket number under airfare */
	@FindBy(xpath = "//div/input[@name='Ticket Number']")
	@CacheLookup
	private WebElement TicketNumber_airfare_xpath_PWC;

	/** Purpose of expenditure under Book and Periodicals */
	@FindBy(xpath = "//div/input[@name='Purpose of expenditure']")
	@CacheLookup
	private WebElement Purposeofexpenditure_Booksandperiodical_xpath_PWC;

	/**
	 * Monthly magazines in Purpose of expenditure under Book and Periodicals
	 */
	@FindBy(xpath = "//div/span[@title='Monthly magazines']")
	@CacheLookup
	private WebElement Monthlymagazines_Booksandperiodical_dropdown_xpath_PWC;

	/**
	 * Tax Books & Periodicals in Purpose of expenditure under Book and
	 * Periodicals
	 */
	@FindBy(xpath = "//div/span[@title='Tax Books & Periodicals']")
	@CacheLookup
	private WebElement TaxBook_Booksandperiodical_dropdown_xpath_PWC;

	/** Others in Purpose of expenditure under Book and Periodicals */
	@FindBy(xpath = "//div/span[@title='Others']")
	@CacheLookup
	private WebElement Others_Booksandperiodical_dropdown_xpath_PWC;

	/**
	 * Specify purpose of expenditure in Purpose of expenditure under Book and
	 * Periodicals
	 */
	@FindBy(xpath = "//div/input[@name='Specify purpose of expenditure']")
	@CacheLookup
	private WebElement SpecifyOthers_Booksandperiodical_text_xpath_PWC;

	/** Mob or Tel or Broadband number under communication category */
	@FindBy(xpath = "//div//input[@name='Mob or Tel or Broadband number']")
	@CacheLookup
	private WebElement MoborTel_Communication_Text_xpath_PWC;

	/** Nature of communication under communication category */
	@FindBy(xpath = "//div//input[@name='Nature of Communication']")
	@CacheLookup
	private WebElement Natureofcommunication_Communication_dropdown_xpath_PWC;

	/** Home Landline in nature of communication under communication category */
	@FindBy(xpath = "//div//span[@title='Home Landline']")
	@CacheLookup
	private WebElement HomeLandline_Communication_dropdown_xpath_PWC;

	/** Internet in nature of communication under communication category */
	@FindBy(xpath = "//div//span[@title='Internet']")
	@CacheLookup
	private WebElement Internet_Communication_dropdown_xpath_PWC;

	/** Mobile in nature of communication under communication category */
	@FindBy(xpath = "//div//span[@title='Mobile']")
	@CacheLookup
	private WebElement Mobile_Communication_dropdown_xpath_PWC;

	/** Location of Expense under communication category */
	@FindBy(xpath = "//div//input[@name='Location of Expense']")
	@CacheLookup
	private WebElement Location_Communication_dropdown_xpath_PWC;

	/** Domestic in Location of Expense under communication category */
	@FindBy(xpath = "//div//span[@title='Domestic']")
	@CacheLookup
	private WebElement DomesticLocation_Communication_dropdown_xpath_PWC;

	/** International in Location of Expense under communication category */
	@FindBy(xpath = "//div//span[@title='International']")
	@CacheLookup
	private WebElement InternationalLocation_Communication_dropdown_xpath_PWC;

	/** purpose of incurring Expense under communication category */
	@FindBy(xpath = "//div//input[@name='Purpose of incurring expense']")
	@CacheLookup
	private WebElement Purposeofexpense_Communication_text_xpath_PWC;

	/** Type Of Continuing Education under Continuing Education category */
	@FindBy(xpath = "//div//input[@name='Type of Continuing Education']")
	@CacheLookup
	private WebElement Type_ContinuingEducation_dropdown_xpath_PWC;

	/**
	 * ArticleTrainee Type Of Continuing Education under Continuing Education
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Article Trainee']")
	@CacheLookup
	private WebElement ArticleTrainee_ContinuingEducation_dropdown_xpath_PWC;

	/**
	 * Other Higher Education Type Of Continuing Education under Continuing
	 * Education category
	 */
	@FindBy(xpath = "//div//span[@title='Other Higher Education']")
	@CacheLookup
	private WebElement OtherHigherEducation_ContinuingEducation_dropdown_xpath_PWC;

	/**
	 * Course Or University Or School Name under Continuing Education category
	 */
	@FindBy(xpath = "//div//input[@name='Course or university or school name']")
	@CacheLookup
	private WebElement University_ContinuingEducation_text_xpath_PWC;

	/** From Date under Continuing Education category */
	@FindBy(xpath = "(//div[text()='Select date range'])[1]")
	@CacheLookup
	private WebElement FromDate_ContinuingEducation_Date_xpath_PWC;

	/** The todate select xapth */
	@FindBy(how = How.XPATH, using = "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	@CacheLookup
	private WebElement Today_Date_xpath_PWC;
	
	/** To Date under Continuing Education category */
	@FindBy(xpath = "(//div[text()='Select date range'])[2]")
	@CacheLookup
	private WebElement ToDate_ContinuingEducation_Date_xpath_PWC;

	/** Type of Conveyance Expense under Conveyance category */
	@FindBy(xpath = "//div//input[@name='Type of Conveyance Expense']")
	@CacheLookup
	private WebElement Typeofconveyance_Conveyance_xpath_dropdown_PWC;

	/** Hired vehicle Type of Conveyance Expense under Conveyance category */
	@FindBy(xpath = "//div//span[@title='Hired Vehicle']")
	@CacheLookup
	private WebElement HiredVehicle_Conveyance_xpath_dropdown_PWC;

	/** Owned vehicle Type of Conveyance Expense under Conveyance category */
	@FindBy(xpath = "//div//span[@title='Owned Vehicle']")
	@CacheLookup
	private WebElement OwnedVehicle_Conveyance_xpath_dropdown_PWC;

	/** parkingtoll Type of Conveyance Expense under Conveyance category */
	@FindBy(xpath = "//div//span[@title='Parking & Toll']")
	@CacheLookup
	private WebElement parkingtoll_Conveyance_xpath_dropdown_PWC;

	/** Please specify purpose of payment under Courier-Postage category */
	@FindBy(xpath = "//div/input[@name='Please  specify  purpose of payment']")
	@CacheLookup
	private WebElement Specifypupose_Courier_xpath_text_PWC;

	/** Number Of Members under Employee Initiatives category */
	@FindBy(xpath = "//div/input[@name='Number of Members']")
	@CacheLookup
	private WebElement NumberofMembers_EmployeeInitiatives_xpath_text_PWC;

	/** Name the Initiative under Employee Initiatives category */
	@FindBy(xpath = "//div/input[@name='Name the Initiatives']")
	@CacheLookup
	private WebElement NameInitiative_EmployeeInitiatives_xpath_text_PWC;

	/** Purpose Of Equipment Hiring under Equipment Hire Charges category */
	@FindBy(xpath = "//div/input[@name='Purpose of equipment hiring']")
	@CacheLookup
	private WebElement PurposeofEquipment_EquipmentHire_xpath_dropdown_PWC;

	/**
	 * others Purpose Of Equipment Hiring under Equipment Hire Charges category
	 */
	@FindBy(xpath = "//div//span[@title='Others']")
	@CacheLookup
	private WebElement otherPurpose_EquipmentHire_xpath_dropdown_PWC;

	/**
	 * Project req Purpose Of Equipment Hiring under Equipment Hire Charges
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Specific project requirement']")
	@CacheLookup
	private WebElement ProjectReqt_EquipmentHire_xpath_dropdown_PWC;

	/**
	 * Specify other Purpose Of Equipment Hiring under Equipment Hire Charges
	 * category
	 */
	@FindBy(xpath = "//div/input[@name='Specify purpose of equipment hiring']")
	@CacheLookup
	private WebElement SpecifyPurposeofEquipment_EquipmentHire_xpath_dropdown_PWC;

	/** Type Of Guests For Event under Event Expenses category */
	@FindBy(xpath = "//div/input[@name='Type of Guests for Event']")
	@CacheLookup
	private WebElement TypeofGuestEvent_EventExpenses_xpath_dropdown_PWC;

	/** Govt official Type Of Guests For Event under Event Expenses category */
	@FindBy(xpath = "//div//span[@title='Government Official']")
	@CacheLookup
	private WebElement Govtofficial_EventExpenses_xpath_dropdown_PWC;

	/**
	 * Non Govt official Type Of Guests For Event under Event Expenses category
	 */
	@FindBy(xpath = "//div//span[@title='Non-government Official']")
	@CacheLookup
	private WebElement NonGovtofficials_EventExpenses_xpath_dropdown_PWC;

	/** Form B attachment under Event Expenses category */
	// @FindBy(xpath="//div[@class='attachment-inner-label']")
	// @FindBy(xpath="//div//span[text()='Form B Attachment']")
	@FindBy(xpath = "(//div/input[@type='file'])[2]")
	@CacheLookup
	private WebElement FormB_EventExpenses_xpath_file_PWC;

	/** Type of Event under Event Expenses category */
	//@FindBy(xpath = "//div/input[@name='Type of event']")
	@FindBy(css="input[name='Type of event']")
	//@FindBy(css="input[id^='Typeofevent']")
	private WebElement TypeofEvent_EventExpenses_xpath_dropdown_PWC;

	/** other type of event under Event Expenses category */
	@FindBy(xpath = "//div//span[@title='Others']")
	@CacheLookup
	private WebElement otherEvent_EventExpenses_xpath_dropdown_PWC;

	/** External event type of event under Event Expenses category */
	@FindBy(xpath = "//div//span[@title='Seminar/Conference/Event/Training - External']")
	@CacheLookup
	private WebElement ExternalEvent_EventExpenses_xpath_dropdown_PWC;

	/** PWC event type of event under Event Expenses category */
	@FindBy(xpath = "//div//span[@title='Seminar/Conference/Event/Training Organised by PwC']")
	@CacheLookup
	private WebElement PWCEvent_EventExpenses_xpath_dropdown_PWC;

	/** Specify event dependent on others under Event Expenses category */
	@FindBy(xpath = "//div/input[@name='Specify event purpose']")
	@CacheLookup
	private WebElement SpecifyEvent_EventExpenses_xpath_text_PWC;

	/**
	 * Event Date_location_name_agenda dependent on
	 * Seminar/Conference/Event/Training - External, under Event Expenses
	 * category
	 */
	@FindBy(xpath = "//div/input[@name='Event date_location_name_agenda']")
	@CacheLookup
	private WebElement DateLocation_EventExpenses_xpath_text_PWC;

	/**
	 * Name the event dependent on Seminar/Conference/Event/Training Organised
	 * by PWC, under Event Expenses category
	 */
	@FindBy(xpath = "//div/input[@name='Name the event']")
	@CacheLookup
	private WebElement NametheEvent_EventExpenses_xpath_text_PWC;

	/** Nature of Payment under Fees/ Rates and Taxes category */
	@FindBy(xpath = "//div/input[@name='Nature of Payment']")
	@CacheLookup
	private WebElement NatureofPayment_FeeTax_xpath_dropdown_PWC;

	/**
	 * Certification expenses Nature of Payment under Fees/ Rates and Taxes
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Certification expenses']")
	@CacheLookup
	private WebElement Certification_FeeTax_xpath_dropdown_PWC;

	/** Registration fee under Fees/ Rates and Taxes category */
	@FindBy(xpath = "//div//span[@title='Registration fee']")
	@CacheLookup
	private WebElement Registrationfee_FeeTax_xpath_dropdown_PWC;

	/** Gift Receiver under Gifts & Presents category */
	@FindBy(xpath = "//div/input[@name='Gift Receiver']")
	@CacheLookup
	private WebElement GiftReceiver_GiftsPresents_xpath_dropdown_PWC;

	/** Govt client under Gifts & Presents category */
	@FindBy(xpath = "//div//span[@title='Government Client']")
	@CacheLookup
	private WebElement Govtclient_GiftsPresents_xpath_dropdown_PWC;

	/** Internal client under Gifts & Presents category */
	@FindBy(xpath = "//div//span[@title='Internal']")
	@CacheLookup
	private WebElement Internal_GiftsPresents_xpath_dropdown_PWC;

	/** Non govt client under Gifts & Presents category */
	@FindBy(xpath = "//div//span[@title='Non-government Client']")
	@CacheLookup
	private WebElement NoGovtClient_GiftsPresents_xpath_dropdown_PWC;

	/** Form A attachment under Gifts and presents category */
	// @FindBy(xpath = "(//div[@class='attachment-inner-label'])[1]")
	@FindBy(xpath = "(//div/input[@type='file'])[2]")
	@CacheLookup
	private WebElement FormA_GiftsPresents_xpath_file_PWC;

	/**
	 * List of parties or receivers attachment under Gifts and presents category
	 */
	// @FindBy(xpath = "(//div[@class='attachment-inner-label'])[2]")
	@FindBy(xpath = "(//div/input[@type='file'])[2]")
	@CacheLookup
	private WebElement ListofParties_GiftsPresents_xpath_file_PWC;

	/** Event When Gifts Given under Gifts & Presents category */
	@FindBy(xpath = "//div/input[@name='Event when gifts given']")
	@CacheLookup
	private WebElement Giftsgiven_GiftsPresents_xpath_dropdown_PWC;

	/** Diwali Event When Gifts Given under Gifts & Presents category */
	@FindBy(xpath = "//div//span[@title='Diwali']")
	@CacheLookup
	private WebElement Diwali_GiftsPresents_xpath_dropdown_PWC;

	/** Type Of Guest House Expense under Guest House Expenses category */
	@FindBy(xpath = "//div/input[@name='Type of Guest House Expense']")
	@CacheLookup
	private WebElement TypeofGuestHouse_GuestHouseExpenses_xpath_dropdown_PWC;

	/**
	 * Food and Beverages Type Of Guest House Expense under Guest House Expenses
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Food & Beverages']")
	@CacheLookup
	private WebElement FoodAndBevereges_GuestHouseExpenses_xpath_dropdown_PWC;

	/** Purpose Of Stay under Guest House Expenses category */
	@FindBy(xpath = "//div/input[@name='Purpose of stay']")
	@CacheLookup
	private WebElement PurposeOfStay_GuestHouseExpenses_xpath_dropdown_PWC;

	/**
	 * Attending Training Programme Purpose Of Stay under Guest House Expenses
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Attending Training Programme']")
	@CacheLookup
	private WebElement AttendingTrainingProgramme_GuestHouseExpenses_xpath_dropdown_PWC;

	/**
	 * Enter name of training dependent on Attending Training Programme Purpose
	 * Of Stay under Guest House Expenses category
	 */
	@FindBy(xpath = "//div/input[@name='Enter name of training']")
	@CacheLookup
	private WebElement EnterNameofTraining_GuestHouseExpenses_xpath_text_PWC;

	/**
	 * Room Tariff Per Day Excluding Tax under Hotel Booking Expense category
	 */
	@FindBy(xpath = "//div/input[@name='Room tariff per day excluding Tax']")
	@CacheLookup
	private WebElement RoomTarrif_HotelBookingExpense_xpath_text_PWC;

	/**
	 * Purpose Of Incurring Hotel Expense under Hotel Booking Expense category
	 */
	@FindBy(xpath = "//div/input[@name='Purpose of incurring hotel expense']")
	@CacheLookup
	private WebElement Purposeofhotelexpense_HotelBookingExpense_xpath_dropdown_PWC;

	/**
	 * Business Development Purpose Of Incurring Hotel Expense under Hotel
	 * Booking Expense category
	 */
	@FindBy(xpath = "//div//span[@title='Business Development']")
	@CacheLookup
	private WebElement BusinessDev_HotelBookingExpense_xpath_text_PWC;

	/** Purpose Of Incidental Expense under Incidental Expenses category */
	@FindBy(xpath = "//div/input[@name='Purpose of incidental expense']")
	@CacheLookup
	private WebElement PurposeofInceident_IncidentalExpenses_xpath_text_PWC;

	/** Nature Of Incidental Expense under Incidental Expenses category */
	@FindBy(xpath = "//div/input[@name='Nature of Incidental Expense']")
	@CacheLookup
	private WebElement NatureofIncident_IncidentalExpenses_xpath_dropdown_PWC;

	/**
	 * Domestic Nature Of Incidental Expense under Incidental Expenses category
	 */
	@FindBy(xpath = "//div//span[@title='Domestic']")
	@CacheLookup
	private WebElement Domestic_IncidentalExpenses_xpath_text_PWC;

	/** Nature of meals under Meals and Refreshments category */
	@FindBy(xpath = "//div/input[@name='Nature of meals and refreshments']")
	@CacheLookup
	private WebElement NatureofMeals_MealsandRefreshments_xpath_dropdown_PWC;

	/** Internal Nature of meals under Meals and Refreshments category */
	@FindBy(xpath = "//div//span[@title='Internal']")
	@CacheLookup
	private WebElement Internal_MealsandRefreshments_xpath_dropdown_PWC;

	/**
	 * Specify purpose of meal expense Internal Nature of meals under Meals and
	 * Refreshments category
	 */
	@FindBy(xpath = "//div/input[@name='Specify purpose of meal expense']")
	@CacheLookup
	private WebElement Specifypurposeofmeal_MealsandRefreshments_xpath_text_PWC;

	/** Name the membership under Membership and Subscription category */
	@FindBy(xpath = "//div/input[@name='Name the membership']")
	@CacheLookup
	private WebElement Namethemembership_MembershipandSubscription_xpath_text_PWC;

	/**
	 * club membership,Name the membership under Membership and Subscription
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Club membership fees']")
	@CacheLookup
	private WebElement clubmembership_MembershipandSubscription_xpath_dropdown_PWC;

	/**
	 * Training fee,Name the membership under Membership and Subscription
	 * category
	 */
	@FindBy(xpath = "//div//span[@title='Training fees']")
	@CacheLookup
	private WebElement TrainingFee_MembershipandSubscription_xpath_dropdown_PWC;

	/**
	 * Specify purpose of membership under club membership,Name the membership
	 * under Membership and Subscription category
	 */
	@FindBy(xpath = "//div/input[@name='Specify purpose of membership']")
	@CacheLookup
	private WebElement Specifypurposeofmembership_MembershipandSubscription_xpath_text_PWC;

	/** Name of participated event under Participation Fees category */
	@FindBy(xpath = "//div/input[@name='Name of participated event']")
	@CacheLookup
	private WebElement Nameofparticipatedevent_ParticipationFees_xpath_text_PWC;

	/**
	 * Please specify purpose of payment under Printing and Stationery category
	 */
	@FindBy(xpath = "//div/input[@name='Please  specify  purpose of payment']")
	@CacheLookup
	private WebElement Purposeofpayment_PrintingandStationery_xpath_text_PWC;

	/** Proposal submitted for which party under Proposal Expenses */
	@FindBy(xpath = "//div/input[@name='Proposal submitted for which party']")
	@CacheLookup
	private WebElement Proposalparty_ProposalExpenses_xpath_text_PWC;

	/** Type of Relocation Charges under Relocation Charges */
	@FindBy(xpath = "//div/input[@name='Type of Relocation Charges']")
	@CacheLookup
	private WebElement TypeofRelocation_RelocationCharges_xpath_dropdown_PWC;

	/** New joinee Type of Relocation Charges under Relocation Charges */
	@FindBy(xpath = "//div//span[@title='New Joinee']")
	@CacheLookup
	private WebElement NewJoinee_RelocationCharges_xpath_dropdown_PWC;

	/** Transfer case Type of Relocation Charges under Relocation Charges */
	@FindBy(xpath = "//div//span[@title='Transfer case']")
	@CacheLookup
	private WebElement Transfercase_RelocationCharges_xpath_dropdown_PWC;

	/** Transfer from under Relocation Charges */
	@FindBy(xpath = "//div/input[@name='Transfer from']")
	@CacheLookup
	private WebElement Transferfrom_RelocationCharges_xpath_text_PWC;

	/** Transfer from under Relocation Charges */
	@FindBy(xpath = "//div/input[@name='Transfer to']")
	@CacheLookup
	private WebElement TransferTo_RelocationCharges_xpath_text_PWC;

	/** Type of travel insurance under Travel Insurance */
	@FindBy(xpath = "//div/input[@name='Type of Travel Insurance']")
	@CacheLookup
	private WebElement TypeofTravelinsurance_TravelInsurance_xpath_dropdown_PWC;

	/** Domestic Type of travel insurance under Travel Insurance */
	@FindBy(xpath = "//div//span[@title='Domestic']")
	@CacheLookup
	private WebElement DomesticTypeofTravelinsurance_TravelInsurance_xpath_dropdown_PWC;

	/** International type of travel insurance under Travel Insurance */
	@FindBy(xpath = "//div//span[@title='International']")
	@CacheLookup
	private WebElement InternationalTypeofTravelinsurance_TravelInsurance_xpath_dropdown_PWC;

	/** Travel purpose under Travel Insurance */
	@FindBy(xpath = "//div/input[@name='Travel purpose']")
	@CacheLookup
	private WebElement TravelPurpose_TravelInsurance_xpath_text_PWC;

	/** purpose of using vehicle under Vehicle Expenses */
	@FindBy(xpath = "//div/input[@name='Purpose of using vehicle']")
	@CacheLookup
	private WebElement Purposeofusingvehicle_VehicleExpenses_xpath_dropdown_PWC;

	/** meeting with client purpose of using vehicle under Vehicle Expenses */
	@FindBy(xpath = "//div//span[@title='Meeting with client']")
	@CacheLookup
	private WebElement Meetingwithclient_VehicleExpenses_xpath_text_PWC;

	/** Purpose of availing visa under Visa */
	@FindBy(xpath = "//div/input[@name='Purpose of availing visa']")
	@CacheLookup
	private WebElement Purposeofavailingvisa_Visa_xpath_dropdown_PWC;

	/** Meeting for Business Development Purpose of availing visa under Visa */
	@FindBy(xpath = "//div//span[@title='Meeting for Business Development']")
	@CacheLookup
	private WebElement MeetingforBusinessDevelopment_Visa_xpath_dropdown_PWC;

	/**
	 * Name Of Person Travelling -Meeting for Business Development Purpose of
	 * availing visa under Visa
	 */
	@FindBy(xpath = "//div/input[@name='Name of person travelling']")
	@CacheLookup
	private WebElement NameOfPersonTravelling_Visa_xpath_text_PWC;

	/** Country of visit under Visa */
	@FindBy(xpath = "//div/input[@name='Country of visit']")
	@CacheLookup
	private WebElement countryofvisit_Visa_xpath_text_PWC;

	/** Country search of visit under Visa */
	@FindBy(xpath = "//div/input[@class='searchableSelectInput searchableFields']")
	@CacheLookup
	private WebElement Searchcountryofvisit_Visa_xpath_text_PWC;

	/** US Country search of visit under Visa */
	@FindBy(xpath = "//div//span[@title='United States']")
	@CacheLookup
	private WebElement US_Visa_xpath_text_PWC;

	/** Open the Expense in quick view PWC */
	@FindBy(xpath = "//td/div[text()=' Pending submission']")
	@CacheLookup
	protected List<WebElement> quickview_PWC;

	/** AMount field in quick view */
	@FindBy(xpath = "//div/div[text()='2.0']")
	private WebElement AmountQuickview_PWC;

	/** Allocate Project And Task Number*/
	@FindBy(xpath="//div/input[@name='Allocate Project and Task Number']")
	@CacheLookup
	private WebElement AllocateProject_task_xpath_PWC;

	/** Allocate Project And Task Number clear value*/
	@FindBy(xpath="//div[contains(text(),'Clear Value')]")
	@CacheLookup
	private WebElement Clearvalue_AllocateProject_task_xpath_PWC;

	/** Allocate Project And Task Number clear value*/
	//@FindBy(xpath="//div[@id='searchableSelectItem']//div[4]//span[1]//div[1]")
	@FindBy(xpath="//div/span[@title='Yes']")
	@CacheLookup
	private WebElement AllocateProject_task_YES_xpath_PWC;

	/** Allocate Project And Task Number clear value*/
	@FindBy(xpath="//div[@id='searchableSelectItem']//div[3]//span[1]//div[1]")
	@CacheLookup
	private WebElement AllocateProject_task_NO_xpath_PWC;


	/** Project Name */
	@FindBy(xpath="//div/input[@name='Project  Name']")
	@CacheLookup
	private WebElement ProjectName_xpath_PWC;

	@FindBy(xpath="(//div[contains(text(),'townhall')])[1]")
	@CacheLookup
	private WebElement SelectProject;

	/** Select project */
	@FindBy(xpath="//tr[2]//td[1]//input[1]")
	@CacheLookup
	private WebElement SelectProject_xpath_PWC;

	/** Add button project */
	@FindBy(xpath="//div/button/span[text()='Add']/..")
	@CacheLookup
	private WebElement AddButton_Project_xpath_PWC;

	/** Add button project */
	@FindBy(xpath="//div/button/span[text()='cancel']/..")
	@CacheLookup
	private WebElement CancelButton_Project_xpath_PWC;

	/** The category select field xpath */
	//@FindBy(xpath = "//input[@value='Select Category']")
	@FindBy(xpath="//input[@placeholder='Select Category']")
	@CacheLookup
	private WebElement category_Select_Xpath_PWC;

	/** The category select search field xpath */
	//@FindBy(id = "searchFilter")
	@FindBy(xpath="//input[@id='searchFilter']")
	@CacheLookup
	private WebElement categorySearch_Text_Xpath_PWC;

	/** Bill Available drop down */
	@FindBy(xpath = "//div/input[@name='Bill  Available']")
	//@FindBy(css="input[name='Bill  Available']")
	@CacheLookup
	private WebElement Billavial_Dropdown_name_PWC;

	/** Bill Available drop down */
	//@FindBy(xpath = "//div/input[@name='Bill  Available']")
	@FindBy(css="input[name='Bill  Available']")
	@CacheLookup
	private WebElement Billavial_Dropdown_name_PWC1;



	/** Bill Available drop down */
	@FindBy(xpath = "//div/input[@name='Bill_Available']")
	@CacheLookup
	private WebElement Billavial_FeeandTax_Dropdown_name_PWC;

	/** Bill Available Yes */
	@FindBy(xpath = "//div/span[@title='Yes']")
	@CacheLookup
	private WebElement BillYes_select_xpath_PWC;

	/** Bill Available No */
	@FindBy(xpath = "//div//span[@title='No']")
	@CacheLookup
	private WebElement BillNo_select_xpath_PWC;

	/** Bill Number */
	@FindBy(xpath = "//div/input[@name='Bill Number']")
	@CacheLookup
	private WebElement BillNumber_text_xpath_PWC;

	/** Bill Number */
	@FindBy(xpath = "//div/input[@name='Bill_Number']")
	@CacheLookup
	private WebElement BillNumber_FeeandTax_text_xpath_PWC;

	/** Bill number in conveynace category */
	@FindBy(xpath = "//div/input[@name='Bill   Number']")
	private WebElement BillNumberConveyance_text_xpath_PWC;

	/** Airfate expense in pending list after expense creation */
	@FindBy(xpath="(//div//div[text()='Airfare Expense'])[1]")
	private WebElement VerifyExpense_pendingList_xpath_PWC;

	/** Airfate expense in pending list after expense creation */
	@FindBy(xpath="(//div/span[text()='CopyExpense'])[1]")
	@CacheLookup
	private WebElement VerifycopyExpense_pendingList_xpath_PWC;

	/** Verify the image uploaded as bill or not in PWC formB */
	@FindBy(xpath = "//div[text()='Files-1']")
	private WebElement FileUpload_verify_xpath_PWC;

	/** Purpose of Train Travel */
	@FindBy(xpath = "//div/input[@name='Purpose of train travel']")
	@CacheLookup
	private WebElement PurposeofTraintravel_TrainandBusfare_dropdown_xpath_PWC;

	/** Training name */
	@FindBy(xpath = "//div//span[@title='Attending Training Programme']")
	@CacheLookup
	private WebElement AttendingTrainingName_TrainandBusfare_text_name_PWC;

	/** training name under attanding training */
	@FindBy(xpath = "//div/input[@name='Training name']")
	@CacheLookup
	private WebElement TrainingName_TrainandBusfare_text_name_PWC;

	/** Bill Available drop down */
	@FindBy(xpath = "//div/input[@name='Bill_Available']")
	private WebElement Billavial_FeeandTax_Dropdown_name;

	/** Bill Number */
	@FindBy(xpath = "//div/input[@name='Bill_Number']")
	private WebElement BillNumber_FeeandTax_text_xpath;

	@FindBy(xpath="//input[@id='currency_amount']")
	@CacheLookup
	private WebElement amount_TextField_ID;

	@FindBy(xpath="//div/input[@id='payee_merchant']")
	@CacheLookup
	private WebElement spentAt_TextField_ID;

	//@FindBy(id = "city")
	@FindBy(xpath="//input[@id='city']")
	private WebElement city_TextField_ID;

	@FindBy(xpath = "//div/div[contains(text(),'Bangalore (KA), India')]")
	private WebElement Bangalorecity_pwc;


    public PWC_ExpenseOrg imageUploadAndAssert_EventCategory_PWC() {
    	SoftAssert softAssert = new SoftAssert();
		((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		ListofParties_GiftsPresents_xpath_file_PWC.sendKeys("./src/test/resources/imgData/2.png");
		isElementDisplayed(FileUpload_verify_xpath_PWC);
		softAssert.assertEquals(FileUpload_verify_xpath_PWC.getText(), "Files-1");
		softAssert.assertAll();
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
    public PWC_ExpenseOrg imageUploadAndAssert_FormA_GiftsCategory_PWC() {
    	SoftAssert softAssert = new SoftAssert();
		((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		ListofParties_GiftsPresents_xpath_file_PWC.sendKeys("./src/test/resources/imgData/2.png");
		isElementDisplayed(FileUpload_verify_xpath_PWC);
		softAssert.assertEquals(FileUpload_verify_xpath_PWC.getText(), "Files-1");
		//softAssert.assertEquals(uploadedImageCheck_button_xpath.getText(), "Files-1");
		softAssert.assertAll();
		return GetInstance(PWC_ExpenseOrg.class);
	}
    
    public PWC_ExpenseOrg imageUploadAndAssert_Listofparties_GiftsCategory_PWC() {
    	SoftAssert softAssert = new SoftAssert();
		((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		ListofParties_GiftsPresents_xpath_file_PWC.sendKeys("./src/test/resources/imgData/2.png");
		isElementDisplayed(FileUpload_verify_xpath_PWC);
		softAssert.assertEquals(FileUpload_verify_xpath_PWC.getText(), "Files-1");
		//softAssert.assertEquals(uploadedImageCheck_button_xpath.getText(), "Files-1");
		softAssert.assertAll();
		return GetInstance(PWC_ExpenseOrg.class);
	}
    
	/** The method to create expense with all native fields 
	 * @throws Exception */
	public void FillTxnNativeFields_PWC(XSSFRow rowData) throws Exception {
		AmountField_PWC(rowData);
		SpentAtField_PWC(rowData);
		CityField_PWC(rowData);
		Category_BooksandPeriodical_PWC(rowData);
		
		  
	}
	
	public PWC_ExpenseOrg VerifyExpense_pending_list_PWC() {
        untilJqueryIsDone();
        isElementDisplayed(VerifyExpense_pendingList_xpath_PWC);
		waitForElementVisible(VerifyExpense_pendingList_xpath_PWC);
		waitForElementToClickable(VerifyExpense_pendingList_xpath_PWC);
		if(VerifyExpense_pendingList_xpath_PWC.isDisplayed())
		{
			String Expense=VerifyExpense_pendingList_xpath_PWC.getText();
			Log.info("Expense is present in pending list");
		}else
		{
			Log.info("Expense is not present in pending list");
		}
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg VerifyCopyExpense_pending_list_PWC() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(VerifycopyExpense_pendingList_xpath_PWC);
		if(VerifycopyExpense_pendingList_xpath_PWC.isDisplayed())
		{
			String expectedMessage = excelUtils.getCellDataWithSheetName(1, 11, "Expense_PWC");
			String Actual=VerifycopyExpense_pendingList_xpath_PWC.getText();
			System.out.println(Actual + " is Present in pending list");
			Reporter.log(Actual);
			softAssert.assertEquals(expectedMessage, Actual);
			softAssert.assertAll();
		}else
		{
			Log.info("Expense is not present in pending list");
		}
		
		return GetInstance(PWC_ExpenseOrg.class);
	}
	

	/** Method to fill Amount, Spent At and City fields in PWC expense */
	@Step("{method}")
	public PWC_ExpenseOrg MandatoryFields_PWC(XSSFRow rowData) throws Exception {

		AmountField_PWC(rowData);
		CityField_PWC(rowData);
		SpentAtField_PWC(rowData);
		return GetInstance(PWC_ExpenseOrg.class);

	}



	public PWC_ExpenseOrg AmountField_PWC(XSSFRow rowData){
		if(isElementDisplayed(amount_TextField_ID))
		{
		waitForElementToClickable(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		}
		else {
			Log.info("Amount field not found");
		}
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg SpentAtField_PWC(XSSFRow rowData){
		if(isElementDisplayed(spentAt_TextField_ID)) {
			waitForElementToClickable(spentAt_TextField_ID);
			writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		}else {
			Log.info("Spant at field not found");
		}
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public  PWC_ExpenseOrg CityField_PWC(XSSFRow rowData) throws Exception {
		if(isElementDisplayed(city_TextField_ID)){
			waitForElementToClickable(city_TextField_ID);
			writeText(city_TextField_ID, rowData.getCell(4).toString());
			isElementDisplayed(Bangalorecity_pwc);
			//waitForElementVisible(Bangalorecity_pwc);
			waitAndClickWebElement(Bangalorecity_pwc);
			String ss=city_TextField_ID.getAttribute("value");
			Log.info("City field is : " + ss);
		}else {
			Log.info("City field not found");

		}

//		waitForElementVisible(city_TextField_ID);
//		//waitForElementToClickable(city_TextField_ID);
//		writeText(city_TextField_ID, rowData.getCell(4).toString());
//		//addTextField(city_TextField_ID, rowData.getCell(4).toString());
//		isElementDisplayed(Bangalorecity_pwc);
//		waitForElementVisible(Bangalorecity_pwc);
//		waitAndClickWebElement(Bangalorecity_pwc);
		//VerifyTextField(city_TextField_ID,"Bangalore (KA), India");
		//writeText(city_TextField_ID," ");
		//writeText(city_TextField_ID, Keys.ARROW_DOWN+"" + Keys.ENTER);

//		if(city_TextField_ID.size()>=1){
//			for(int i=0;i<OptionList.size();i++)
//			{
//				String CurrentOption = OptionList.get(i).getText();
//				if(CurrentOption.equalsIgnoreCase("UDUPI")){
//					System.out.println("Found the city : "+CurrentOption);
//					OptionList.get(i).click();
//				}
//			}
//		}
//		else{
//			System.out.println("OptionList is empty");
//		}
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg CategoryField_PWC(){
		waitAndClickWebElement(category_Select_Xpath_PWC);
		waitForElementVisible(categorySearch_Text_Xpath_PWC);
		waitAndClickWebElement(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Train and Bus");
		waitAndClickWebElement(categoryTrainBusFare_xpath_PWC);
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg BillNo_PWC() throws Exception{
	waitForElementToClickable(Billavial_Dropdown_name_PWC);
	waitAndClickWebElement(Billavial_Dropdown_name_PWC);
	safeJavaScriptClick(BillNo_select_xpath_PWC);
	return GetInstance(PWC_ExpenseOrg.class);
	}
	
	 public PWC_ExpenseOrg AddProject_PWC(XSSFRow rowData) throws Exception {
		   // ScrollToElement(AllocateProject_task_xpath_PWC);
		
			waitAndClickWebElement(AllocateProject_task_xpath_PWC); 
			waitForElementToClickable(AllocateProject_task_YES_xpath_PWC);
			waitAndClickWebElement(AllocateProject_task_YES_xpath_PWC);
			//ScrollToElement(ProjectName_xpath_PWC);
			
			writeText(ProjectName_xpath_PWC, rowData.getCell(10).toString());
		    writeKeyboardText(ProjectName_xpath_PWC, Keys.ENTER);
		    waitForElementVisible(SelectProject);
		    waitAndClickWebElement(SelectProject);

			return GetInstance(PWC_ExpenseOrg.class);
			
		}

	
   public PWC_ExpenseOrg Category_AirFare_PWC(XSSFRow rowData) throws Exception{
	    SoftAssert softAssert= new SoftAssert();
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Airfare");
	    waitAndClickWebElement(categoryAirfareExpense_xpath_PWC);
	   // String category=VerifyCategory_PWC.getAttribute("value");
	    Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(Travel_bookingType_airfare_xpath_PWC);
		waitForElementVisible(Availed_airfare_xpath_PWC);
		waitForElementToClickable(Availed_airfare_xpath_PWC);
	    waitAndClickWebElement(Availed_airfare_xpath_PWC);
		moveToElement_Actions(classofTravel_airfare_xpath_PWC);
		waitForElementToClickable(classofTravel_airfare_xpath_PWC);
	    waitAndClickWebElement(classofTravel_airfare_xpath_PWC);
	    waitForElementVisible(Busineessclass_airfare_xpath_PWC);
	    waitAndClickWebElement(Busineessclass_airfare_xpath_PWC);
	    moveToElement_Actions(PurposeofTravel_xpath_PWC);
	    waitForElementToClickable(PurposeofTravel_xpath_PWC);
		waitAndClickWebElement(PurposeofTravel_xpath_PWC);
		waitAndClickWebElement(BusinessDev_HotelBookingExpense_xpath_text_PWC);
	    moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(BillYes_select_xpath_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(5).toString());
		writeText(TicketNumber_airfare_xpath_PWC, rowData.getCell(4).toString());
		return GetInstance(PWC_ExpenseOrg.class);
	}


	
	public PWC_ExpenseOrg Category_BooksandPeriodical_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitForElementToClickable(category_Select_Xpath_PWC);
		waitAndClickWebElement(category_Select_Xpath_PWC);
		waitAndClickWebElement(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Books");
		waitAndClickWebElement(categoryBooksPeriodicals_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		moveToElement_Actions(Purposeofexpenditure_Booksandperiodical_xpath_PWC);
		waitAndClickWebElement(Purposeofexpenditure_Booksandperiodical_xpath_PWC);
		moveToElement_Actions(Monthlymagazines_Booksandperiodical_dropdown_xpath_PWC);
		waitAndClickWebElement(Monthlymagazines_Booksandperiodical_dropdown_xpath_PWC);
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(1).toString());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_Communication_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Communica");
		waitForElementVisible(categorySearch_Text_Xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		safeJavaScriptClick(categoryCommunication_xpath_PWC);
		waitForElementToClickable(MoborTel_Communication_Text_xpath_PWC);
		writeText(MoborTel_Communication_Text_xpath_PWC,rowData.getCell(1).getRawValue());
		moveToElement_Actions(Natureofcommunication_Communication_dropdown_xpath_PWC);
		waitAndClickWebElement(Natureofcommunication_Communication_dropdown_xpath_PWC);
		waitAndClickWebElement(Mobile_Communication_dropdown_xpath_PWC);
		//ScrollDown(Billavial_Dropdown_name_PWC);
		moveToElement_Actions(Location_Communication_dropdown_xpath_PWC);
		waitAndClickWebElement(Location_Communication_dropdown_xpath_PWC);
		safeJavaScriptClick(DomesticLocation_Communication_dropdown_xpath_PWC);
		waitForElementToClickable(Purposeofexpense_Communication_text_xpath_PWC);
		writeText(Purposeofexpense_Communication_text_xpath_PWC,rowData.getCell(4).toString());
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC); 
		waitForElementVisible(BillYes_select_xpath_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(5).toString());
		return GetInstance(PWC_ExpenseOrg.class);
	}

	/** The todate select xapth */
	@FindBy(xpath= "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	private WebElement Today_Date_xpath;
	
	public PWC_ExpenseOrg Category_ContinuingEducation_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Education");
		waitAndClickWebElement(categoryContinuingEducation_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		moveToElement_Actions(Type_ContinuingEducation_dropdown_xpath_PWC);
		waitAndClickWebElement(Type_ContinuingEducation_dropdown_xpath_PWC);
		waitAndClickWebElement(ArticleTrainee_ContinuingEducation_dropdown_xpath_PWC);
		ScrollDown(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(University_ContinuingEducation_text_xpath_PWC);
		writeText(University_ContinuingEducation_text_xpath_PWC, rowData.getCell(2).toString());
		click_Actions(FromDate_ContinuingEducation_Date_xpath_PWC);
		waitForElementToClickable(Today_Date_xpath);
		safeJavaScriptClick(Today_Date_xpath);
		waitForElementToClickable(ToDate_ContinuingEducation_Date_xpath_PWC);
		click_Actions(ToDate_ContinuingEducation_Date_xpath_PWC);
		waitForElementVisible(Today_Date_xpath);
		safeJavaScriptClick(Today_Date_xpath);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(BillYes_select_xpath_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(5).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_Conveyance_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "conve");
		waitAndClickWebElement(categoryConveyance_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		moveToElement_Actions(Typeofconveyance_Conveyance_xpath_dropdown_PWC);
		waitAndClickWebElement(Typeofconveyance_Conveyance_xpath_dropdown_PWC);
		waitAndClickWebElement(parkingtoll_Conveyance_xpath_dropdown_PWC);
		moveToElement_Actions(PurposeofTravel_xpath_PWC);
		waitForElementToClickable(PurposeofTravel_xpath_PWC);
		waitAndClickWebElement(PurposeofTravel_xpath_PWC);
		waitAndClickWebElement(BusinessDev_HotelBookingExpense_xpath_text_PWC);
		waitForElementToClickable(BillNumberConveyance_text_xpath_PWC);
		writeText(BillNumberConveyance_text_xpath_PWC, rowData.getCell(3).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_Courier_Postage_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "couri");
		waitAndClickWebElement(categoryCourierPostage_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		//moveToElement_Actions(Specifypupose_Courier_xpath_text_PWC);
		waitForElementToClickable(Specifypupose_Courier_xpath_text_PWC);
		waitAndClickWebElement(Specifypupose_Courier_xpath_text_PWC);
		waitForElementToClickable(Specifypupose_Courier_xpath_text_PWC);
		writeText(Specifypupose_Courier_xpath_text_PWC, rowData.getCell(1).toString());
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitForElementToClickable(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		waitForElementVisible(BillYes_select_xpath_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(2).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_Employee_Initiatives_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Employ");
		waitAndClickWebElement(categoryEmployeeInitiatives_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitForElementVisible(NumberofMembers_EmployeeInitiatives_xpath_text_PWC);
		writeText(NumberofMembers_EmployeeInitiatives_xpath_text_PWC,rowData.getCell(1).getRawValue());
		waitForElementVisible(NameInitiative_EmployeeInitiatives_xpath_text_PWC);
		writeText(NameInitiative_EmployeeInitiatives_xpath_text_PWC,rowData.getCell(2).toString());
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		waitForElementVisible(BillYes_select_xpath_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(3).toString());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_EquipmentHireCharges_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		waitAndClickWebElement(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Hire");
		waitAndClickWebElement(categoryEquipmentHireCharges_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(PurposeofEquipment_EquipmentHire_xpath_dropdown_PWC);
		waitAndClickWebElement(ProjectReqt_EquipmentHire_xpath_dropdown_PWC);
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		BillNo_PWC();
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_EventExpenses_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "Event");
		waitAndClickWebElement(categoryEventExpenses_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(TypeofGuestEvent_EventExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(Govtofficial_EventExpenses_xpath_dropdown_PWC);
		ScrollDown(NumberofMembers_EmployeeInitiatives_xpath_text_PWC);
		moveToElement_Actions(TypeofEvent_EventExpenses_xpath_dropdown_PWC);
		waitForElementVisible(TypeofEvent_EventExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(TypeofEvent_EventExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(ExternalEvent_EventExpenses_xpath_dropdown_PWC);
		imageUploadAndAssert_EventCategory_PWC();
		waitForElementVisible(DateLocation_EventExpenses_xpath_text_PWC);
		waitForElementToClickable(DateLocation_EventExpenses_xpath_text_PWC);
		writeText(DateLocation_EventExpenses_xpath_text_PWC,rowData.getCell(4).toString());
		waitForElementVisible(NumberofMembers_EmployeeInitiatives_xpath_text_PWC);
		waitForElementToClickable(NumberofMembers_EmployeeInitiatives_xpath_text_PWC);
		moveToElement_Actions(NumberofMembers_EmployeeInitiatives_xpath_text_PWC);
		writeText(NumberofMembers_EmployeeInitiatives_xpath_text_PWC,rowData.getCell(5).toString());
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		BillNo_PWC();
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_ExecutiveHealthCheckup_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		writeText(categorySearch_Text_Xpath_PWC, "Health");
		waitAndClickWebElement(categoryExecutiveHealthCheckup_xpath_PWC);
		ScrollDown(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(2).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}


	
	public PWC_ExpenseOrg Category_FeesRatesandTaxes_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "rates");
		waitAndClickWebElement(categoryFeeRatesandTaxes_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(NatureofPayment_FeeTax_xpath_dropdown_PWC);
		waitAndClickWebElement(Certification_FeeTax_xpath_dropdown_PWC);
		waitAndClickWebElement(Billavial_FeeandTax_Dropdown_name);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_FeeandTax_text_xpath);
		writeText(BillNumber_FeeandTax_text_xpath, rowData.getCell(2).getRawValue());
	
		return GetInstance(PWC_ExpenseOrg.class);
	}


	
	public PWC_ExpenseOrg Category_GiftsPresents_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "gifts");
		waitAndClickWebElement(categoryGiftsPresents_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(GiftReceiver_GiftsPresents_xpath_dropdown_PWC);
		waitAndClickWebElement(Internal_GiftsPresents_xpath_dropdown_PWC);
		writeText(NumberofMembers_EmployeeInitiatives_xpath_text_PWC, rowData.getCell(4).getRawValue());
		imageUploadAndAssert_Listofparties_GiftsCategory_PWC();
        ScrollToElement(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Giftsgiven_GiftsPresents_xpath_dropdown_PWC);
		waitAndClickWebElement(Diwali_GiftsPresents_xpath_dropdown_PWC);
		moveToElement_Actions(Billavial_Dropdown_name_PWC1);
		waitForElementToClickable(Billavial_Dropdown_name_PWC1);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC1);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(6).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_GuestHouseExpenses_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "house");
		waitAndClickWebElement(categoryGuestHouseExpenses_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(TypeofGuestHouse_GuestHouseExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(FoodAndBevereges_GuestHouseExpenses_xpath_dropdown_PWC);
		writeText(NumberofMembers_EmployeeInitiatives_xpath_text_PWC,rowData.getCell(2).toString());
		waitAndClickWebElement(PurposeOfStay_GuestHouseExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(AttendingTrainingProgramme_GuestHouseExpenses_xpath_dropdown_PWC);
		writeText(EnterNameofTraining_GuestHouseExpenses_xpath_text_PWC,rowData.getCell(4).toString());
		BillNo_PWC();		
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_HotelBookingExpense_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "hotel");
		waitAndClickWebElement(categoryHotelBookingExpense_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitForElementVisible(RoomTarrif_HotelBookingExpense_xpath_text_PWC);
		writeText(RoomTarrif_HotelBookingExpense_xpath_text_PWC,rowData.getCell(1).toString());
		ScrollDown(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Purposeofhotelexpense_HotelBookingExpense_xpath_dropdown_PWC);
		waitAndClickWebElement(BusinessDev_HotelBookingExpense_xpath_text_PWC);
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(3).getRawValue());
		
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	
	public PWC_ExpenseOrg Category_IncidentalExpenses_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "incident");
		waitAndClickWebElement(categoryIncidentalExpenses_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitForElementVisible(PurposeofInceident_IncidentalExpenses_xpath_text_PWC);
		writeText(PurposeofInceident_IncidentalExpenses_xpath_text_PWC,rowData.getCell(1).toString());
		waitAndClickWebElement(NatureofIncident_IncidentalExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(Domestic_IncidentalExpenses_xpath_text_PWC);
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_MealsandRefreshments_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "meals");
		waitAndClickWebElement(categoryMealsandRefreshments_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(NatureofMeals_MealsandRefreshments_xpath_dropdown_PWC);
		waitAndClickWebElement(Internal_MealsandRefreshments_xpath_dropdown_PWC);
		waitForElementVisible(Specifypurposeofmeal_MealsandRefreshments_xpath_text_PWC);
		writeText(Specifypurposeofmeal_MealsandRefreshments_xpath_text_PWC,rowData.getCell(2).toString());
		waitForElementVisible(NumberofMembers_EmployeeInitiatives_xpath_text_PWC);
		writeText(NumberofMembers_EmployeeInitiatives_xpath_text_PWC,rowData.getCell(3).toString());
		BillNo_PWC();
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_MembershipandSubscription_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "member");
		waitAndClickWebElement(categoryMembershipSubscription_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(Namethemembership_MembershipandSubscription_xpath_text_PWC);
		waitAndClickWebElement(TrainingFee_MembershipandSubscription_xpath_dropdown_PWC);
		waitForElementVisible(Specifypurposeofmembership_MembershipandSubscription_xpath_text_PWC);
		writeText(Specifypurposeofmembership_MembershipandSubscription_xpath_text_PWC,rowData.getCell(2).toString());
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(3).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_ParticipationFees_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "parti");
		waitAndClickWebElement(categoryParticipationFees_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitForElementVisible(Nameofparticipatedevent_ParticipationFees_xpath_text_PWC);
		writeText(Nameofparticipatedevent_ParticipationFees_xpath_text_PWC,rowData.getCell(1).toString());
		ScrollDown(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(2).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_PrintingandStationery_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "print");
		waitAndClickWebElement(categoryPrintingandStationery);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitForElementVisible(Purposeofpayment_PrintingandStationery_xpath_text_PWC);
		writeText(Purposeofpayment_PrintingandStationery_xpath_text_PWC,rowData.getCell(1).toString());
	    ScrollDown(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(2).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_ProposalExpenses_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "proposal");
		waitAndClickWebElement(categoryProposalExpenses_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitForElementVisible(Proposalparty_ProposalExpenses_xpath_text_PWC);
		writeText(Proposalparty_ProposalExpenses_xpath_text_PWC,rowData.getCell(1).toString());
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(2).getRawValue());		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_RelocationCharges_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "relocation");
		waitAndClickWebElement(categoryRelocationCharges_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(TypeofRelocation_RelocationCharges_xpath_dropdown_PWC);
		waitAndClickWebElement(NewJoinee_RelocationCharges_xpath_dropdown_PWC);
		waitForElementVisible(Transferfrom_RelocationCharges_xpath_text_PWC);
		writeText(Transferfrom_RelocationCharges_xpath_text_PWC,rowData.getCell(2).toString());
		waitForElementVisible(TransferTo_RelocationCharges_xpath_text_PWC);
		writeText(TransferTo_RelocationCharges_xpath_text_PWC,rowData.getCell(3).toString());
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		BillNo_PWC();		
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_TrainandBusFare_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "train");
		waitAndClickWebElement(categoryTrainBusFare_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(PurposeofTraintravel_TrainandBusfare_dropdown_xpath_PWC);
		waitAndClickWebElement(AttendingTrainingName_TrainandBusfare_text_name_PWC);
		waitForElementVisible(TrainingName_TrainandBusfare_text_name_PWC);
		writeText(TrainingName_TrainandBusfare_text_name_PWC,rowData.getCell(2).toString());
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(3).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_TravelInsurance_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "insuran");
		waitAndClickWebElement(categoryTravelInsurance_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(TypeofTravelinsurance_TravelInsurance_xpath_dropdown_PWC);
		waitAndClickWebElement(InternationalTypeofTravelinsurance_TravelInsurance_xpath_dropdown_PWC);
		waitForElementVisible(TravelPurpose_TravelInsurance_xpath_text_PWC);
		writeText(TravelPurpose_TravelInsurance_xpath_text_PWC,rowData.getCell(2).toString());
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(3).getRawValue());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_VehicleExpenses_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "vehicle");
		waitAndClickWebElement(categoryVehicleExpenses_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(Purposeofusingvehicle_VehicleExpenses_xpath_dropdown_PWC);
		waitAndClickWebElement(Meetingwithclient_VehicleExpenses_xpath_text_PWC);
		isElementDisplayed(Billavial_Dropdown_name_PWC);
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		waitAndClickWebElement(Billavial_Dropdown_name_PWC);
		safeJavaScriptClick(BillYes_select_xpath_PWC);
		waitForElementVisible(BillNumber_text_xpath_PWC);
		writeText(BillNumber_text_xpath_PWC, rowData.getCell(2).toString());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg Category_Visa_PWC(XSSFRow rowData) throws Exception{
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID,rowData.getCell(0).toString());
		waitAndClickWebElement(category_Select_Xpath_PWC);
		safeJavaScriptClick(categorySearch_Text_Xpath_PWC);
		writeText(categorySearch_Text_Xpath_PWC, "visa");
		waitAndClickWebElement(categoryVisa_xpath_PWC);
		Log.info(VerifyCategory_PWC.getAttribute("value"));
		waitAndClickWebElement(Purposeofavailingvisa_Visa_xpath_dropdown_PWC);
		waitAndClickWebElement(MeetingforBusinessDevelopment_Visa_xpath_dropdown_PWC);
		waitForElementVisible(NameOfPersonTravelling_Visa_xpath_text_PWC);
		writeText(NameOfPersonTravelling_Visa_xpath_text_PWC,rowData.getCell(3).toString());
		ScrollToElement(countryofvisit_Visa_xpath_text_PWC);
		moveToElement_Actions(countryofvisit_Visa_xpath_text_PWC);
		waitAndClickWebElement(countryofvisit_Visa_xpath_text_PWC);
		waitAndClickWebElement(Searchcountryofvisit_Visa_xpath_text_PWC);
		writeText(Searchcountryofvisit_Visa_xpath_text_PWC, "united");
		waitAndClickWebElement(US_Visa_xpath_text_PWC);
		moveToElement_Actions(Billavial_Dropdown_name_PWC);
		BillNo_PWC();
		return GetInstance(PWC_ExpenseOrg.class);
	}

	
	public PWC_ExpenseOrg PurposeTrain_PWC(){
	waitForElementVisible(PurposeofTraintravel_TrainandBusfare_dropdown_xpath_PWC);
	waitForElementToClickable(PurposeofTraintravel_TrainandBusfare_dropdown_xpath_PWC);
	waitAndClickWebElement(PurposeofTraintravel_TrainandBusfare_dropdown_xpath_PWC);
	return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg AttendingTraining_PWC(){
		waitForElementVisible(AttendingTrainingName_TrainandBusfare_text_name_PWC);
	waitForElementToClickable(AttendingTrainingName_TrainandBusfare_text_name_PWC);
	waitAndClickWebElement(AttendingTrainingName_TrainandBusfare_text_name_PWC);
	return GetInstance(PWC_ExpenseOrg.class);
	}

	/** The method to create expense with all native fields 
	 * @throws Exception */
	public PWC_ExpenseOrg createTxnWithMissingAmountFields_PWC(XSSFRow rowData) throws Exception {
		SpentAtField_PWC(rowData);
		CityField_PWC(rowData);
		Category_EquipmentHireCharges_PWC(rowData);
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	/** The method to create expense with all native fields */
	public PWC_ExpenseOrg createTxnWithMissingSpentAtField_PWC(XSSFRow rowData) throws Exception {
		AmountField_PWC(rowData);
		CityField_PWC(rowData);
//
//	    CategoryField_PWC();
//	    PurposeTrain_PWC();
//	    AttendingTraining_PWC();
//		waitForElementVisible(AttendingTrainingName_TrainandBusfare_text_name);
//		waitForElementToClickable(AttendingTrainingName_TrainandBusfare_text_name);
//		writeText(AttendingTrainingName_TrainandBusfare_text_name, rowData.getCell(7).toString());
//		ScrollToElement(Billavial_Dropdown_name_PWC);
//		waitForElementToClickable(Billavial_Dropdown_name_PWC);
//		waitAndClickWebElement(Billavial_Dropdown_name_PWC); 
//		waitForElementVisible(BillYes_select_xpath_PWC);
//		waitForElementToClickable(BillYes_select_xpath_PWC);
//		waitAndClickWebElement(BillYes_select_xpath_PWC);
//		waitForElementVisible(BillNumber_text_xpath_PWC);
//		writeText(BillNumber_text_xpath_PWC, rowData.getCell(8).toString());
		return GetInstance(PWC_ExpenseOrg.class);
	}
	
	/** The method to create expense with all native fields 
	 * @throws Exception */
	public PWC_ExpenseOrg createTxnWithMissingCityField_PWC(XSSFRow rowData) throws Exception {
		AmountField_PWC(rowData);
		SpentAtField_PWC(rowData);
		Category_EquipmentHireCharges_PWC(rowData);

		 return GetInstance(PWC_ExpenseOrg.class);
	}
	
	public PWC_ExpenseOrg VerifyExpenseCreateSuccess_PWC(){
		waitForElementVisible(quickview_PWC.get(0));
		waitForElementToClickable(quickview_PWC.get(0));
		waitAndClickWebElement(quickview_PWC.get(0));
		waitForElementVisible(AmountQuickview_PWC);
		isElementDisplayed(AmountQuickview_PWC);
		return GetInstance(PWC_ExpenseOrg.class);
	}


	

}
