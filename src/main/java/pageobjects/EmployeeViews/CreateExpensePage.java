
package pageobjects.EmployeeViews;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.Log;
import io.qameta.allure.Step;
import orgUtils_ExpenseProduct.Automation_ExpenseOrg;
import orgUtils_ExpenseProduct.OUP_ExpenseOrg;
import orgUtils_ExpenseProduct.PWC_ExpenseOrg;
import pageobjects.CommonViews.CommonPageElements;


// TODO: Auto-generated Javadoc
/**
 * The Class HomePageEmployee.
 */
public class CreateExpensePage extends TestBotElementsWrapper {

	/** Create Expense label for isLoaded method */
	@FindBy(xpath = "//div[contains(text(),'Create Expense')]")
	@CacheLookup
	private WebElement CreateExpense_label_xpath;
	/**
	 * The conversion amount text field ID.
	 */
	@FindBy(xpath = "//input[@id='conversion_amount']")
	@CacheLookup
	private WebElement conversionAmount_TextField_ID;

	/** automation expense in pending list after expense creation */
	@FindBy(xpath="//tr[1]//td[2]//div[1]/..")
	private WebElement Unreported_text_xpath;
	
	/** Action Menu inside report  */
	@FindBy(xpath="//td[@class='actionColumnHoverClass']//div//img")
	private WebElement ActionMenuInsideReport_xpath;

	/** Expense Type in Expense screen */
	@FindBy(xpath = "(//div/input[@type='radio'])[1]")
	private WebElement Cash_radio_xpath;

	/**
	 * Expense Type in Expense screen
	 */
	@FindBy(xpath = "(//div/input[@type='radio'])[2]")
	private WebElement CurrencyReturn_radio_xpath;

	/**
	 * Expense Type in Expense screen
	 */
	@FindBy(xpath = "(//div/input[@type='radio'])[3]")
	private WebElement PersonalCard_radio_xpath;

	/**
	 * The amount text field ID.
	 */
	//@FindBy(id = "currency_amount")
	@FindBy(xpath="//input[@id='currency_amount']")
	@CacheLookup
	private WebElement amount_TextField_ID;

	/**
	 * The amount text field in OUP org
	 */
	@FindBy(xpath = "//input[@name='Gross Amount']")
	private WebElement Grossamount_TextField_xpath_oup;

	
	/** The spent at text field ID. */
	@FindBy(xpath="//input[@id='txn_date']")
	private WebElement CurrentDate_Xpath;
	
	/** The spent at text field ID. */
	@FindBy(xpath="//div[@class='customTimepicker  ']")
	private WebElement CurrentTime_Xpath;

	/** The description text field ID. */
	//@FindBy(how = How.ID, using = "description")
	@FindBy(xpath="//div/input[@id='description']")
	private WebElement description_TextField_ID;
	
	/** The invoice field ID in OUP org */
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement Invoicenumber_TextField_xpath_OUP;

	/** The invoice field ID in OUP org */
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement Invoicenumber_TextField_CopyTxn_xpath_OUP;


	/** The city search field xpath. */
	@FindBy(how = How.XPATH, using = "//hr[text()='bangalore']")
	private WebElement citySearch_DropDown_Xpath;

	/** The category select field xpath */
	@FindBy(xpath = "//input[@value='Select Category']")
	private WebElement category_Select_Xpath_PWC;
	
	/** Search category in split screen after clicking on drop down */
	@FindBy(xpath = "//div/input[@id='searchFilter']")
	private WebElement SearchCategory_text_xpath;

	/** Search category select Train and bus fare */
	@FindBy(xpath = "//div/span[@class='breadcrumb-lastvalue']")
	private WebElement SearchCategoryTrainAndBus_dropdown_xpath;

	/** The food category select dropdown xpath */
	@FindBy(how = How.XPATH, using = "//li[@data-name='Food']")
	private WebElement food_Dropdown_Xpath;

	/** The clear category xpath */
	@FindBy(how = How.XPATH, using = "//span[text()='×']")
	private WebElement category_Clear_Xpath;


	/** Multi Day Expense Checkbox */
	@FindBy(xpath = "//div/input[@type='checkbox']")
	private WebElement MultiDay_checkbox_xpath;

	/** Multi Day From Date */
	@FindBy(xpath = "//div/label/span[text()='From date']")
	private WebElement MultiDayFrom_select_xpath;

	/** Multi Day To Date */
	@FindBy(xpath = "//div/label/span[text()='To date']")
	private WebElement MultiDayTo_select_xpath;

	/** The expense date id locator */
	@FindBy(how = How.ID, using = "txn_date")
	private WebElement date_Input_Id;

	/** The save expense button xpath. */
	@FindBy(xpath = "//button[@type= 'button' and text()='Save']")
	private WebElement saveExpense_Button_Xpath;
	
	
	/** AddExpense button xpath. */
	@FindBy(xpath = "//button[@type='button' and text()='Add Expense']")
	private WebElement addExpense_Button_Xpath;
	
	/** Latest TxnID xpath. */
	@FindBy(xpath = "(//div[@data-tip='Copy to clipboard'])[1]")
	private WebElement latestTxn_ID_Xpath;
	
	/** PWC Hamburger icon */
	//@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	@FindBy(xpath="(//td[@class='actionColumnHoverClass'])[1]/div")
	private WebElement PWChamburger_Icon_Xpath;

	/** The Cancel button */
	@FindBy(xpath = "//div/button[@class='secondaryButton']")
	private WebElement Cancel_button_xpath;

	/** The update expense button xpath. */
	@FindBy(how = How.XPATH, using = "//button[text()='Update']")
	private WebElement updateExpense_Button_Xpath;
	
	@FindBy(xpath ="//div[@class='customToast showCustomToast']")
	private WebElement Toast_xpath;


	/** The Message dialog xpath for column management */
	@FindBy(how = How.XPATH, using = "//span[text()='Saved successfully']")
	private WebElement columnSaved_Toast_xpath;

	/** The Message dialog xpath for export */
	@FindBy(how = How.XPATH, using = "//span[text()='The report link will be sent to you shortly']")
	private WebElement export_Toast_Xpath;

	/** The text extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_Text_EF")
	private WebElement text_Input_Name;

	/** The number extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_Number_EF")
 	private WebElement number_Input_Name;

	/** The number extra field name locator */
	@FindBy(how = How.XPATH, using = "//div[div[text()='TXN_Date_EF']]/input")
	private WebElement date_Input_Xpath;


	/** The time extra field xpath */
	@FindBy(how = How.XPATH, using = "//div[label[span[text()='TXN_Time_EF']]]/input")
	private WebElement timeField_Input_Xpath;

	/** The time ok button xpath */
	@FindBy(how = How.XPATH, using = "//button/span[text()='OK']")
	private WebElement timeok_Button_Xpath;


	/** The bank account type extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_BACC_EF")
	private WebElement bankAcc_Input_Name;

	/** The confirm bank account type extra field name locator */
	@FindBy(how = How.NAME, using = "Confirm TXN_BACC_EF")
	private WebElement confirmBankAcc_Input_Name;


	/** The bank name ifsc info name locator */
	@FindBy(how = How.NAME, using = "Bank Name")
	private WebElement ifscBank_Input_Name;

	/** The bank branch name ifsc info name locator */
	@FindBy(how = How.NAME, using = "Branch Name")
	private WebElement ifscBranch_Input_Name;

	/** The date range extra field xpath */
	@FindBy(how = How.XPATH, using = "//div[text()='Select date range']/..//input")
	private List<WebElement> dateRange_Dates_Xpath;

	/** The prefix extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_Prefix_EF")
	private WebElement prefix_Input_Name;

	/** The postfix extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_Postfix_EF")
	private WebElement postfix_Input_Name;

	
	/** The expense edit action xpath */
	// @FindBy(how = How.XPATH, using = "//div[@role='presentation']/div/a")
	@FindBy(xpath = "//span/div/div[text()='Edit']")
	private WebElement edit_Link_Xpath;

	/**
	 * The expense View action xpath
	 */
	@FindBy(xpath = "//span//div//div[text()='View']")
	private WebElement View_Link_Xpath;


	/**
	 * The close expense View action xpath
	 */
	@FindBy(xpath = "//div/span/img[@src='/assets/images/cross.svg']")
	private WebElement CloseView_Link_Xpath;


	/**
	 * Edit option in Quick menu
	 */
	@FindBy(xpath = "//div/button/span[text()='EDIT']/..")
	private WebElement EditExpense_Xpath;


	/**
	 * The delete action xpath
	 */
	// @FindBy(how = How.XPATH, using =
	// "//div[@role='presentation']/div/div[3]")
	@FindBy(xpath = "//div[text()='Delete']/..")
	private WebElement delete_Link_Xpath;

	/**Delete Expense from quick View */
	//@FindBy(xpath = "//div/button/span[text()='Delete']")
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	private WebElement Delete_expense_butotn;

	/** The confirm delete button xpath */
	@FindBy(xpath="(//span[text()='Delete']/..)[2]/..")
	private WebElement deleteConfirmQuick_Button_Xpath;

	/**
	 * The clear test for dropdown ef xpath
	 */
	@FindBy(how = How.XPATH, using = "//div[text()='Clear Value']")
	private WebElement clearText_xpath;

	/**
	 * The split amount name
	 */
	@FindBy(how = How.NAME, using = "randomname")
	private List<WebElement> splitAmount_Input_Name;


	/**
	 * The split category xpath
	 */
	@FindBy(how = How.XPATH, using = "//input[@value='Select Category']")
	private List<WebElement> splitCategory_Input_Xpath;
	// private WebElement splitCategory_Input_Xpath;
	/**
	 * Upload file button
	 */
	//@FindBy(xpath = "//input[@id='myFile']")
	@FindBy(xpath = "(//input[@type='file'])[1]")
	
	private WebElement Uploadfile_id;
	/**
	 * Upload file button
	 */
	//@FindBy(xpath = "//input[@id='myFile']")
	@FindBy(xpath = "//img[@src='/assets/images/uploadInvoice.svg']")
	
	private WebElement image_upload_icon;
	/**
	 * Drag And Drop text EF
	 */
	//@FindBy(xpath = "//input[@id='myFile']")
	@FindBy(xpath = "//div[text()='Drag and drop or click here to upload bills of your Expense']")
	
	private WebElement DragAndDrop_Text_id;

	/**
	 * The column management img xpath
	 */
	@FindBy(how = How.XPATH, using = "//div[div[@class='exportEtl']]/div[4]/span/img")
	private WebElement columnManagement_Img_Xpath;

	/** The city column checkbox id */
	@FindBy(how = How.ID, using = "city_6")
	private WebElement cityColumn_Input_Id;

	/** The city group column checkbox id */
	@FindBy(how = How.ID, using = "city_group_7")
	private WebElement cityGroupColumn_Input_Id;

	/** The export button xpath */
	// @FindBy(how = How.XPATH, using =
	// "//div[@class='exportEtl']/div/span/img")
	@FindBy(xpath = "//div/span/img[@src='./assets/images/export-icon.svg']")
	private WebElement export_Button_Xpath;

	/**
	 * The download button xpath
	 */
	@FindBy(how = How.XPATH, using = "//div[text()='Download']")
	private WebElement download_Button_Xpath;

	/**
	 * The confirm download button class locator
	 */
	@FindBy(how = How.CLASS_NAME, using = "primaryButton")
	private List<WebElement> download_Button_Class;

	/**
	 * Open the Expense in quick view
	 */
	@FindBy(xpath = "//td/div[text()='Unreported']")
	private List<WebElement> quickview;


	/** Verify the image uploaded as bill or not */
	//@FindBy(xpath = "//div/span/span[text()=' Upload More Invoices ']")
	@FindBy(xpath="//span[text()='Upload More Invoices']")
	private WebElement FileUpload_verify_xpath;
	
	//div[text()='Upload More Invoices']
	/** UploadMoreInvoices xpath */
	@FindBy(xpath="//div[text()='Upload More Invoices']")
	private WebElement UploadMoreInvoice_verify_xpath;
	


	/**
	 * Expense type drop down
	 */
	@FindBy(xpath = "//input[@id='dd-field-expesneType']")
	private WebElement ExpenseType_dropdown;
	
	
	/**
	 * Expense type drop down
	 */
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement Expense_search_box;

	/**
	 * Expense type search bar
	 */
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement ExpenseTypeSearchBar_dropdown;

	/**
	 * Expense type drop down
	 */
	@FindBy(xpath = "//div[@class = 'listValue' and text()='Mileage: Base Station']")
	private WebElement MileageExpenseType_xpath;


	/**
	 * Expense type Cab in Automation org
	 */
	@FindBy(xpath = "//span[@class='listValue' and text()='CabExpense']")
	private WebElement CabExpenseType_xpath_Auto;

	/**
	 * Expense type Deposit in Automation org
	 */
	@FindBy(xpath = "//span[@class='listValue' and text()='DepositExpense']")
	private WebElement DepositExpenseType_xpath_Auto;

	/**
	 * Expense type Deposit in Automation org
	 */
	@FindBy(xpath = "//i[@class='hw-icons icon  icon-calendar font-16 rotate-0']")
	private WebElement CalenderIcon_Xpath;
	
	/**
	 * Previous month buttton xpath
	 */
	@FindBy(xpath = "//i[@class='hw-icons icon  icon-dropleft font-20 rotate-0']")
	private WebElement Previous_month_button_Xpath;
	//span[@class='day' and @data-date='1']
	
	/**
	 * Day 1 of month xpath
	 */
	@FindBy(xpath = "//span[@class='day' and @data-date='1']")
	private WebElement firstdayOfMonth_Xpath;

	/**
	 * Expense type BaseStationin OUP org
	 */
	@FindBy(xpath = "//div/span[text()='Non Travel: Out of Pocket']/..")
	private WebElement OutofPocketExpenseType_xpath_OUP;
	
	/**
	 * Expense type BaseStationin OUP org
	 */
	@FindBy(xpath = "//li/div[@class = 'listValue' and text()='Merge Expense']")
	private WebElement MergeExpenseType_xpath_OUP;

	/**
	 * Expense type CompanyPaid in OUP org
	 */
	@FindBy(xpath = "//div/span[text()='Non Travel: Company Paid']/..")
	private WebElement CompanyPaidExpenseType_xpath;


	/**
	 * value per KM
	 */
	@FindBy(xpath = "//input[@placeholder='Select Value Per KM']")
	private WebElement ValuePerKm_xpath_OUP;

	/**
	 * Number of KM
	 */
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement NumberofKM_xpath_OUP;


	/**
	 * Distance per KM
	 */
	@FindBy(xpath = "//div/input[@name='Distance per km']")
	private WebElement Distance_xpath;

	
	/** Txn type Dep field */
	@FindBy(xpath="//div/input[@name='TXN_TxnTypeDepDropdown_EF']")
private WebElement TXN_type_xpath;
	
	/** select 5 */
	@FindBy(xpath="//div/span[text()='5']/..")
private WebElement select5_dropdown;
	
	/** select 6 */
	@FindBy(xpath="//div[@class = 'listValue' and text()='6']")
private WebElement select6_dropdown;
	
	
	/** Distance per KM drop down */
	@FindBy(xpath="//div/input[@name='Txn_TxnTypeDepNumberDistance_EF']")
private WebElement TXNdependent_type_xpath;

	/** The expense UnMerge success message xpath */
	@FindBy(xpath = "//div[contains(text(),'1 transactions successfully unmerged from this tra')]")
private WebElement UnMergeSuccess_Xpath;
	
	/** The expense UnMerge success message xpath */
	@FindBy(xpath = "//div[contains(text(),'2 transactions successfully unmerged from this tra')]")
private WebElement UnMergeSuccessTwo_Xpath;

	/** Allocate Project And Task Number*/
	@FindBy(xpath="//div/input[@name='Allocate Project and Task Number']")
private WebElement AllocateProject_task_xpath_PWC;

	/** Allocate Project And Task Number clear value*/
	//@FindBy(xpath="//div[@id='searchableSelectItem']//div[4]//span[1]//div[1]")
	@FindBy(xpath="//div/span[@title='Yes']")
private WebElement AllocateProject_task_YES_xpath_PWC;
	
	/** The Merge icon in expense list */
	//@FindBy(xpath="(//div//input[@type='file'])[1]")
	@FindBy(xpath="(//div/span[@data-class='tooltipStyleClass'])[5]")
private WebElement ExpenseId_Xpath;

	
	/** Transaction type */
	@FindBy(how = How.XPATH, using = "//input[@type = 'text' and @id = 'dd-field-expesneType']")
	private WebElement Txntype_xpath;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement Txnsearch_xpath;
	
	@FindBy(xpath = "//div[@class = 'listValue' and text()='COPY'] ")
	private WebElement TxnSelect_xpath;
	
	@FindBy(xpath = "//input[@id='searchFilter']")
	private WebElement CategoryType_Xpath;
	
	@FindBy(xpath= "//div[@class='breadcrumb-list']")
	private WebElement category_xpath;
	
	@FindBy(xpath = "//div[@class='flex-container']")
private WebElement Copy_Expense_Text;

	@FindBy(xpath = "//div[@id='expenseType']//span[1]")
	private WebElement Txn_Xpath;

	/** The spent at text field ID. */
	//@FindBy(id = "payee_merchant")
	@FindBy(xpath="//div/input[@id='payee_merchant']")
	@CacheLookup
	private WebElement spentAt_TextField_ID;
	
	/** Merge transaction selection. */
	@FindBy(xpath="//span[@class='listValue' and text()='DepositExpense']")
	@CacheLookup
	private WebElement MergeTxn_selection_Xpath;
	
	@FindBy(xpath="(//div[@class='actionBtnContainer'])[1]")
	private WebElement Copyhamburger_Icon_Xpath;
	
	@FindBy(xpath = "//img[@class='delete-button-icon']")
	private WebElement DeleteBillIcon_xpath;
	
	//span[@class='listValue' and text()='MergeTransaction']
	
	/** The copy expense button xpath. */
	@FindBy(xpath="//button[text()='Copy']")
	@CacheLookup
	private WebElement CopyExpense_Button_Xpath;
	
	@FindBy(xpath="//div[contains(text(),'Please Enter Amount')]")
	private WebElement Amount_ErrorMsg;
	@FindBy(xpath = "//button[@class='primaryButton']//span[contains(text(),'Delete')]")
	private WebElement Delete_button;

	public enum CategoryOptions {
		AIRFARE_EXPENSE, BOOKS_AND_PERIODICALS, COMMUNICATION, CONTINUING_EDUCATION, CONVEYANCE, COURIER_POSTAGE, EMPLOYEE_INITIATIVES, EQUIPMENT_HIRE_CHARGES, EVENT_EXPENSES, EXECUTIVE_HEALTH_CHECKUP, FEES_RATES_AND_TAXES, GIFTS_PRESENTS, GUEST_HOUSE_EXPENSES, HOTEL_BOOKING_EXPENSE, INCIDENTAL_EXPENSES_PER_DIEM, MEALS_AND_REFRESHMENTS, MEMBERSHIP_AND_SUBSCRIPTION, PARTICIPATION_FEES, PRINTING_AND_STATIONERY, PROPOSAL_EXPENSES, RELOCATION_CHARGES, TRAIN_AND_BUS_FARE, TRAVEL_INSURANCE, VEHICLE_EXPENSES_PARTNERS,VISA
	}


	public void logout() throws Exception {
		GetInstance(CommonPageElements.class).logout();

	}


	@Step("{method}")
	 public CreateExpensePage MileageExpense_Automation() throws Exception {
			untilPageLoadComplete();
			waitForElementVisible(ExpenseType_dropdown);
			waitAndClickWebElement(ExpenseType_dropdown);
			waitForElementVisible(MileageExpenseType_xpath);
			waitAndClickWebElement(MileageExpenseType_xpath);
			waitForElementVisible(Distance_xpath);
			writeText(Distance_xpath, "2");
			waitAndClickWebElement(TXN_type_xpath);
			waitForElementVisible(select5_dropdown);
			waitAndClickWebElement(select5_dropdown);
			writeText(TXNdependent_type_xpath, "2");

		 	//return new CreateExpensePage(this.driver);
		 	return GetInstance(CreateExpensePage.class);
		}

	 @Step("{method}")
	 public CreateExpensePage MileageExpense_OUP(XSSFRow rowData) throws Exception {
			untilPageLoadComplete();
			waitForElementVisible(ExpenseType_dropdown);
			waitAndClickWebElement(ExpenseType_dropdown);
			waitForElementVisible(ExpenseTypeSearchBar_dropdown);
			writeText(ExpenseTypeSearchBar_dropdown, "Mileage");
			waitForElementVisible(MileageExpenseType_xpath);
			waitAndClickWebElement(MileageExpenseType_xpath);
			writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());
			waitForElementVisible(ValuePerKm_xpath_OUP);
			waitAndClickWebElement(ValuePerKm_xpath_OUP);
			waitForElementVisible(select6_dropdown);
			waitAndClickWebElement(select6_dropdown);
			waitForElementVisible(NumberofKM_xpath_OUP);
			writeText(NumberofKM_xpath_OUP, rowData.getCell(1).toString());
			waitForElementVisible(spentAt_TextField_ID);
	        writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
	        waitForElementVisible(description_TextField_ID);
	        writeText(description_TextField_ID, rowData.getCell(3).toString());
	        SelectDateInExpense();
	     	//return new CreateExpensePage(this.driver);
		 return GetInstance(CreateExpensePage.class);

		}


	 @Step("{method}")
	public CreateExpensePage fillExpenseDetailsWithCategory(CategoryOptions option) throws Exception {


		GetInstance(PWC_ExpenseOrg.class).MandatoryFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));

		switch (option) {

		case AIRFARE_EXPENSE:

			GetInstance(PWC_ExpenseOrg.class).Category_AirFare_PWC(excelUtils.getRowDataWithSheetName(7, "Expense_PWC"));
			//pwc_ExpenseOrg.AddProject_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));
			break;

		case BOOKS_AND_PERIODICALS:
			GetInstance(PWC_ExpenseOrg.class).Category_BooksandPeriodical_PWC(excelUtils.getRowDataWithSheetName(9, "Expense_PWC"));
			break;

		case COMMUNICATION:
			GetInstance(PWC_ExpenseOrg.class).Category_Communication_PWC(excelUtils.getRowDataWithSheetName(12, "Expense_PWC"));

			break;

		case CONTINUING_EDUCATION:
			GetInstance(PWC_ExpenseOrg.class).Category_ContinuingEducation_PWC(excelUtils.getRowDataWithSheetName(15, "Expense_PWC"));
			break;

		case CONVEYANCE:
			GetInstance(PWC_ExpenseOrg.class).Category_Conveyance_PWC(excelUtils.getRowDataWithSheetName(18, "Expense_PWC"));
			break;

		case COURIER_POSTAGE:
			GetInstance(PWC_ExpenseOrg.class).Category_Courier_Postage_PWC(excelUtils.getRowDataWithSheetName(21, "Expense_PWC"));
			break;

		case EMPLOYEE_INITIATIVES:
			GetInstance(PWC_ExpenseOrg.class).Category_Employee_Initiatives_PWC(excelUtils.getRowDataWithSheetName(24, "Expense_PWC"));
			break;

		case EQUIPMENT_HIRE_CHARGES:
			GetInstance(PWC_ExpenseOrg.class).Category_EquipmentHireCharges_PWC(excelUtils.getRowDataWithSheetName(25, "Expense_PWC"));
			break;

		case EVENT_EXPENSES:
			GetInstance(PWC_ExpenseOrg.class).Category_EventExpenses_PWC(excelUtils.getRowDataWithSheetName(27, "Expense_PWC"));
			break;

		case EXECUTIVE_HEALTH_CHECKUP:
			GetInstance(PWC_ExpenseOrg.class).Category_ExecutiveHealthCheckup_PWC(excelUtils.getRowDataWithSheetName(30, "Expense_PWC"));
			break;

		case FEES_RATES_AND_TAXES:
			GetInstance(PWC_ExpenseOrg.class).Category_FeesRatesandTaxes_PWC(excelUtils.getRowDataWithSheetName(33, "Expense_PWC"));
			break;

		case GIFTS_PRESENTS:
			GetInstance(PWC_ExpenseOrg.class).Category_GiftsPresents_PWC(excelUtils.getRowDataWithSheetName(36, "Expense_PWC"));
			break;

		case GUEST_HOUSE_EXPENSES:
			GetInstance(PWC_ExpenseOrg.class).Category_GuestHouseExpenses_PWC(excelUtils.getRowDataWithSheetName(39, "Expense_PWC"));
			break;

		case HOTEL_BOOKING_EXPENSE:
			GetInstance(PWC_ExpenseOrg.class).Category_HotelBookingExpense_PWC(excelUtils.getRowDataWithSheetName(42, "Expense_PWC"));
			break;

		case INCIDENTAL_EXPENSES_PER_DIEM:
			GetInstance(PWC_ExpenseOrg.class).Category_IncidentalExpenses_PWC(excelUtils.getRowDataWithSheetName(45, "Expense_PWC"));
			break;

		case MEALS_AND_REFRESHMENTS:
			GetInstance(PWC_ExpenseOrg.class).Category_MealsandRefreshments_PWC(excelUtils.getRowDataWithSheetName(48, "Expense_PWC"));
			break;

		case MEMBERSHIP_AND_SUBSCRIPTION:
			GetInstance(PWC_ExpenseOrg.class).Category_MembershipandSubscription_PWC(excelUtils.getRowDataWithSheetName(51, "Expense_PWC"));
			break;

		case PARTICIPATION_FEES:
			GetInstance(PWC_ExpenseOrg.class).Category_ParticipationFees_PWC(excelUtils.getRowDataWithSheetName(54, "Expense_PWC"));
			break;

		case PRINTING_AND_STATIONERY:
			GetInstance(PWC_ExpenseOrg.class).Category_PrintingandStationery_PWC(excelUtils.getRowDataWithSheetName(57, "Expense_PWC"));
			break;

		case PROPOSAL_EXPENSES:
			GetInstance(PWC_ExpenseOrg.class).Category_ProposalExpenses_PWC(excelUtils.getRowDataWithSheetName(60, "Expense_PWC"));
			break;

		case RELOCATION_CHARGES:
			GetInstance(PWC_ExpenseOrg.class).Category_RelocationCharges_PWC(excelUtils.getRowDataWithSheetName(63, "Expense_PWC"));
			break;

		case TRAIN_AND_BUS_FARE:
			GetInstance(PWC_ExpenseOrg.class).Category_TrainandBusFare_PWC(excelUtils.getRowDataWithSheetName(66, "Expense_PWC"));
			break;

		case TRAVEL_INSURANCE:
			GetInstance(PWC_ExpenseOrg.class).Category_TravelInsurance_PWC(excelUtils.getRowDataWithSheetName(69, "Expense_PWC"));
			break;

		case VEHICLE_EXPENSES_PARTNERS:
			GetInstance(PWC_ExpenseOrg.class).Category_VehicleExpenses_PWC(excelUtils.getRowDataWithSheetName(72, "Expense_PWC"));
			break;

		case VISA:
			GetInstance(PWC_ExpenseOrg.class).Category_Visa_PWC(excelUtils.getRowDataWithSheetName(75, "Expense_PWC"));
			break;

		default:
			break;
		}
		return GetInstance(CreateExpensePage.class);
		

	}


	 @Step("{method}")
	public ExpensePage clickSave() throws Exception {
			waitAndClickWebElement(saveExpense_Button_Xpath);
		 	//waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		 //untilPageLoadComplete();
		return GetInstance(ExpensePage.class);
	}
	 @Step("{method}")
		public ExpensePage verifyToastMessage(String toastMessage) throws Exception {
				waitAndClickWebElement(saveExpense_Button_Xpath);
				waitForElementVisible(SuccessMessageEdit_Toast_xpath);
			 	waitForText(SuccessMessageEdit_Toast_xpath,toastMessage);
			 	//waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
			 //untilPageLoadComplete();
			return GetInstance(ExpensePage.class);
		}

	@Step("{method}")
	public ExpensePage clickSaveNew() throws Exception {
		waitForElementVisible(ExpenseType_dropdown);
		System.out.println("Inside the new click save button....");
		waitForElementVisible(saveExpense_Button_Xpath);
		System.out.println("save button got visible");
		waitAndClickWebElement(saveExpense_Button_Xpath);
		System.out.println("Clicked on save button");
		return GetInstance(ExpensePage.class);
	}
	
	
	 @Step("{method}")
		public ExpensePage fetchlatestTxnId() throws Exception {
				waitForElementVisible(addExpense_Button_Xpath);
				untilPageLoadComplete();
				waitForElementVisible(latestTxn_ID_Xpath);
				waitAndClickWebElement(latestTxn_ID_Xpath);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				Transferable contents = clipboard.getContents(null);
				String TxnId = (String) contents.getTransferData(DataFlavor.stringFlavor);
				File myobj = CreateFile("TxnID.txt");
				if (myobj != null)
				{
					writeintoFile("TxnID.txt", TxnId.trim());
					System.out.println(" written into file");
				}
				else
				{
					System.out.println("not written into file");
				}
				
			return GetInstance(ExpensePage.class);
		}

	 @Step("{method}")
		public ExpensePage fetchlatestCopyTypeTxnId() throws Exception {
				waitForElementVisible(addExpense_Button_Xpath);
				untilPageLoadComplete();
				waitForElementVisible(latestTxn_ID_Xpath);
				waitAndClickWebElement(latestTxn_ID_Xpath);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				Transferable contents = clipboard.getContents(null);
				String TxnId = (String) contents.getTransferData(DataFlavor.stringFlavor);
				//writeintoFile("/Users/ltuser/Downloads/CopyTypeTxnID.txt", TxnId.trim());
//				System.out.println(" written into file");
				File myobj = CreateFile("CopyTypeTxnID.txt");
				if (myobj != null)
				{
					//writeintoFile("CopyTypeTxnID.txt", TxnId.trim());
					writeintoFile("/Users/ltuser/Downloads/CopyTypeTxnID.txt", TxnId.trim());
					System.out.println(" written into file");
					System.out.println("Txn written into file is ");
				}
				else
				{
					System.out.println("not written into file");
				}
				
			return GetInstance(ExpensePage.class);
		}

	/** The Message dialog xpath transaction updated successfully. */
	@FindBy(xpath = "//div[@class='customToastContent']")
	private WebElement SuccessMessageEdit_Toast_xpath;

	//@FindBy(xpath = "//div[contains(text(),'Automation')]")
	@FindBy(xpath="//tr[1]//td[7]")
	private WebElement SpentAtInScreen_xpath_pwc;

	@FindBy(xpath = "//div[contains(text(),'2.0')]")
	private WebElement AMountInScreen_xpath_pwc;

	@FindBy(xpath="//input[@name='Merchant']")
	private WebElement Merchant_InFilter;

	@FindBy(xpath="(//div/img[@src='/assets/images/enter-icon.svg'])[1]")
	private WebElement Apply_Merchant_InFilter;

	@FindBy(xpath="//input[@id='fromDate-5']")
	private WebElement FromDate_InFilter;

	@FindBy(xpath="//input[@id='toDate-5']")
	private WebElement ToDate_InFilter;

	/** The todate select xapth */
	@FindBy(xpath= "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	private WebElement Today_Date_xpath;
	
	@FindBy(xpath = "//div[contains(text(),'Edit Exp')]")
	private WebElement SpentAtInScreen_pwc;
	
	@FindBy(xpath = "//div[contains(text(),'12.0')]")
	private WebElement AMountInScreen_pwc;

	
	 @Step("{method}")
		public ExpensePage SaveExpense_VerifyToast(String string) throws Exception {
		 SoftAssert softAssert = new SoftAssert();
		 waitAndClickWebElement(saveExpense_Button_Xpath);
//		 waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		 waitForText(SuccessMessageEdit_Toast_xpath, string);
		 fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		 softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		 waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		 softAssert.assertAll();
		 return GetInstance(ExpensePage.class);
		}

	@Step("{method}")
	public ExpensePage SaveExpense_VerifyFromScreen(String merchant) throws Exception {
		SoftAssert softAssert = new SoftAssert();
			waitAndClickWebElement(saveExpense_Button_Xpath);
			untilPageLoadComplete();
			isElementDisplayed(PWChamburger_Icon_Xpath);

			if(isElementDisplayed(Merchant_InFilter)) {
				writeText(Merchant_InFilter, merchant);
				waitAndClickWebElement(Apply_Merchant_InFilter);
			}else {
				Log.info(" Element not found ");
			}

			if(isElementDisplayed(FromDate_InFilter)){
			waitAndClickWebElement(FromDate_InFilter);
			safeJavaScriptClick(Today_Date_xpath);
			}else {
			Log.info(" From date Element not found ");
			}

			if(isElementDisplayed(ToDate_InFilter)){
				waitForElementToClickable(ToDate_InFilter);
				waitAndClickWebElement(ToDate_InFilter);
				waitForElementToClickable(Today_Date_xpath);
				safeJavaScriptClick(Today_Date_xpath);
			}
			else {
				Log.info(" To date Element not found ");
			}

            waitForElementVisible(PWChamburger_Icon_Xpath);
			isElementDisplayed(PWChamburger_Icon_Xpath);
			ScrollToElement(PWChamburger_Icon_Xpath);
			waitAndClickWebElement(PWChamburger_Icon_Xpath);
			//waitForElementVisible(View_Link_Xpath);
			waitAndClickWebElement(View_Link_Xpath);
			waitForElementVisible(SpentAtInScreen_xpath_pwc);
			isElementDisplayed(SpentAtInScreen_xpath_pwc);
			softAssert.assertEquals(SpentAtInScreen_xpath_pwc.getText(), merchant);
			softAssert.assertAll();

		//delete the expense after view assert
		waitAndClickWebElement(Delete_expense_butotn);
		waitForElementToClickable(deleteConfirmQuick_Button_Xpath);
		safeJavaScriptClick(deleteConfirmQuick_Button_Xpath);
		return GetInstance(ExpensePage.class);
	}


	 @Step("{method}")
	public CreateExpensePage clickSave_PWC() throws Exception {
		waitAndClickWebElement(saveExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		//waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		return this;
	}

	 
	 @Step("{method}")
		public CreateExpensePage SelectDateInExpense() throws Exception {
			waitForElementVisible(CalenderIcon_Xpath);
			waitAndClickWebElement(CalenderIcon_Xpath);
			waitForElementVisible(Previous_month_button_Xpath);
			waitAndClickWebElement(Previous_month_button_Xpath);
			waitForElementVisible(firstdayOfMonth_Xpath);
			waitAndClickWebElement(firstdayOfMonth_Xpath);
			return this;
		}


	 @Step("{method}")
	public ExpensePage clickCancel() throws Exception {
		moveToElement_Actions(Cancel_button_xpath);
		//waitForElementToClickable(Cancel_button_xpath);
		//waitAndClickWebElement(Cancel_button_xpath);
		waitAndClickWebElement(Cancel_button_xpath);

		//return new ExpensePage(this.driver);
		return GetInstance(ExpensePage.class);

	}



//	 @Step("{method}")
//	public CreateExpensePage imageUploadAndAssert(driver) {
//		 driver.setFileDetector(new LocalFileDetector());
//		 WebElement uploadElement = Uploadfile_id;
//		 LocalFileDetector detector = new LocalFileDetector();
//		 File localFile = detector.getLocalFile("./src/test/resources/imgData/1.png");
//
//		// setFileDetector(new LocalFileDetector());
//		//File f = new File("./src/test/resources/imgData/1.png");
//		Uploadfile_id.sendKeys(localFile.getAbsolutePath());
//		isElementDisplayed(FileUpload_verify_xpath);
//		softAssert.assertEquals(FileUpload_verify_xpath.getText(), "Upload More Invoices");
//		//softAssert.assertEquals(uploadedImageCheck_button_xpath.getText(), "Files-1");
//		shortWait();
//		softAssert.assertAll();
//		return this;
//	}



	@Step("{method}")
	public ExpensePage ExpenseWithoutProject() throws Exception {
		//SoftAssert softAssert = new SoftAssert();
		GetInstance(PWC_ExpenseOrg.class).MandatoryFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));
		GetInstance(PWC_ExpenseOrg.class).Category_AirFare_PWC(excelUtils.getRowDataWithSheetName(7, "Expense_PWC"));

		ScrollToElement(AllocateProject_task_xpath_PWC);
		waitAndClickWebElement(AllocateProject_task_xpath_PWC);
		//waitForElementToClickable(AllocateProject_task_YES_xpath_PWC);
		waitAndClickWebElement(AllocateProject_task_YES_xpath_PWC);
		waitAndClickWebElement(saveExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
//		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
//		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
//		softAssert.assertAll();
		//return this;
		return GetInstance(ExpensePage.class);
	}


	 @Step("{method}")
	 public CreateExpensePage mergeexpensecreate() throws Exception{
		 GetInstance(OUP_ExpenseOrg.class).CreateCompanyPaidExpense_OUPOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));
		 return GetInstance(CreateExpensePage.class);

	 }


	 @Step("{method}")
	public CreateExpensePage fillTransactionDetails(ORG org) throws Exception {
		switch (org) {

		case PWC:

						GetInstance(PWC_ExpenseOrg.class).FillTxnNativeFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense"));
			           // boolean test = CategoryData(CategoryOptions.AIRFARE_EXPENSE, excelUtils.getRowDataWithSheetName(1, "Expense"));
						imageUploadAndAssert("1.png");

								break;
		case OUP:
			GetInstance(OUP_ExpenseOrg.class);
							GetInstance(OUP_ExpenseOrg.class).FillTxnWithNativeFields_OUPOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));

								break;

		case AUTO:
							GetInstance(Automation_ExpenseOrg.class).FillTxnWithNativeFields_AutomationOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));


								break;

		case LANDMARK:
								break;

		default: break;
		}

		return GetInstance(CreateExpensePage.class);
	}


	 @Step("{method}")
	public CreateExpensePage fill_Missing_Amount_TransactionDetails(ORG org) throws Exception {
		switch (org) {

		case PWC:

						GetInstance(PWC_ExpenseOrg.class).createTxnWithMissingAmountFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));


								break;
		case OUP:
			//GetInstance(OUP_ExpenseOrg.class);
						 GetInstance(OUP_ExpenseOrg.class).FillTxnMissingAmount_OUPOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));
								break;

		case AUTO:
			GetInstance(Automation_ExpenseOrg.class);
				 			GetInstance(Automation_ExpenseOrg.class).FillTxnMissingAmount_AutomationOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));


								break;

		case LANDMARK:
								break;

		default: break;
		}

		return GetInstance(CreateExpensePage.class);
	}

	 @Step("{method}")
	public CreateExpensePage fill_Missing_SpentAt_TransactionDetails(ORG org) throws Exception {
		switch (org) {

		case PWC:

						GetInstance(PWC_ExpenseOrg.class).createTxnWithMissingSpentAtField_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));


								break;
		case OUP:

								break;

		case AUTO:
							GetInstance(Automation_ExpenseOrg.class).FillTxnWithNativeFields_AutomationOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));


								break;

		case LANDMARK:
								break;

		default: break;
		}

		return GetInstance(CreateExpensePage.class);
	}

	 @Step("{method}")
	public CreateExpensePage fill_Missing_City_TransactionDetails(ORG org) throws Exception {
		switch (org) {

		case PWC:

						GetInstance(PWC_ExpenseOrg.class).createTxnWithMissingCityField_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));


								break;
		case OUP:

								break;

		case AUTO:
							GetInstance(Automation_ExpenseOrg.class).FillTxnWithNativeFields_AutomationOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));


								break;

		case LANDMARK:
								break;

		default: break;
		}
		return GetInstance(CreateExpensePage.class);
	}

	 @Step("{method}")
	public CreateExpensePage fill_Missing_Bill_TransactionDetails(ORG org) throws Exception {
		switch (org) {

		case PWC:

						GetInstance(PWC_ExpenseOrg.class).FillTxnNativeFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));

						
								break;
		case OUP:
			
								break;
								
		case AUTO:
							GetInstance(Automation_ExpenseOrg.class).FillTxnWithNativeFields_AutomationOrg(excelUtils.getRowDataWithSheetName(1, "Expense"));
						

								break;
								
		case LANDMARK:
								break;
			
		default: break;
		}
		
		return GetInstance(CreateExpensePage.class);
	}
	 
	 @Step("{method}")
	public CreateExpensePage createMergeExpense(ORG org, ExpenseType ET, Double amount) throws Exception {

		switch (org) {

		case OUP:
              String orgname ="OUP";
              String mergeExp ="Merge Expense";
			
			switch (ET) {
			
			case NonTravel_CompanyPaid:
				creategenericExpense(excelUtils.getRowDataWithSheetName(3, "Expense"),CompanyPaidExpenseType_xpath, orgname,amount);
				//writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());
				break;
				
			case NonTravel_OutofPocket:
				creategenericExpense(excelUtils.getRowDataWithSheetName(3, "Expense"),OutofPocketExpenseType_xpath_OUP, orgname,amount);
				break;
				
			case Merge_Transaction:
				creategenericExpense(excelUtils.getRowDataWithSheetName(7, "Expense"),MergeExpenseType_xpath_OUP, mergeExp,amount);
				break;
				
				
			default:
				break;
			}
			

		case AUTO:
			String orgname1 ="Auto";
			String ExpenseName;
			switch (ET) {
			case Cab:
				ExpenseName="CabExpense";
				creategenericExpense(excelUtils.getRowDataWithSheetName(4, "Expense"),CabExpenseType_xpath_Auto,ExpenseName,amount );
				break;
				
			case Deposit:
				 ExpenseName="DepositExpense";
				creategenericExpense(excelUtils.getRowDataWithSheetName(4, "Expense"),DepositExpenseType_xpath_Auto,ExpenseName,amount);
				break;
				
			default:
				break;

			}
			
			
		default:
			break;
		}
		return GetInstance(CreateExpensePage.class);
		
	}
	 
	 public CreateExpensePage creategenericExpense(XSSFRow rowData, WebElement type, String name,Double ammount) throws Exception {
		System.out.println("inside the createExpensePage");	
		 untilPageLoadComplete();
			waitForElementVisible(ExpenseType_dropdown);
			waitAndClickWebElement(ExpenseType_dropdown);
			waitForElementVisible(Expense_search_box);
			writeText(Expense_search_box, name);
			waitForElementVisible(type);
			waitAndClickWebElement(type);
			waitForElementVisible(amount_TextField_ID);
		    writeText(amount_TextField_ID,String.valueOf(ammount));
		    waitForElementVisible(description_TextField_ID);
		 	writeText(description_TextField_ID, rowData.getCell(3).toString());
			
		    waitForElementVisible(spentAt_TextField_ID);
		    writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		    if(name!="CabExpense" && name!="DepositExpense")
		    {
		    SelectDateInExpense();
		    }
//		    if(name==ORG.OUP.toString()){
//		    	writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());
//		    }
		
		    return GetInstance(CreateExpensePage.class);
		}


		public CreateExpensePage createTxnWithTxnType(XSSFRow rowData) throws Exception {

			// untilPageLoadComplete();
			 if(isElementDisplayed(Txntype_xpath) && isElementEnabled(Txntype_xpath))
			 {

			waitAndClickWebElement(Txntype_xpath);
			writeText(Txnsearch_xpath, rowData.getCell(10).toString());
			waitAndClickWebElement(TxnSelect_xpath);
			 }

			if (isElementDisplayed(amount_TextField_ID) && isElementEnabled(amount_TextField_ID)) {
				writeText(amount_TextField_ID, rowData.getCell(1).toString());
			}
//			if (isElementDisplayed(conversionAmount_TextField_ID) && isElementEnabled(conversionAmount_TextField_ID)) {
//				writeText(conversionAmount_TextField_ID, rowData.getCell(1).toString());
//			}
			if (isElementDisplayed(spentAt_TextField_ID) && isElementEnabled(spentAt_TextField_ID)) {
				writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
			}
			if (isElementDisplayed(description_TextField_ID) && isElementEnabled(description_TextField_ID)) {
				writeText(description_TextField_ID, rowData.getCell(3).toString());
			}
			untilJqueryIsDone();
			return GetInstance(CreateExpensePage.class);
		}

	 @Step("{method}")
	public CreateExpensePage imageUploadAndAssert(String img) {
		SoftAssert softAssert = new SoftAssert();
		((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		if (Uploadfile_id.isEnabled()) {
			System.out.println("Upload button Element is enabled...: ");
		}
		//File bill = new File("/Users/ramesh.p/Desktop/WebAutomation/happay-webtestbots/HAT-WebFramework/src/test/resources/imgData/1.png");
		//Uploadfile_id.sendKeys("./src/test/resources/imgData/1.png");
		Uploadfile_id.sendKeys("/Users/ltuser/Downloads/1.png");
		waitForElementVisible(UploadMoreInvoice_verify_xpath);
		System.out.println("UploadMoreInvoixe xpath text: "+UploadMoreInvoice_verify_xpath.getText());
		softAssert.assertEquals(UploadMoreInvoice_verify_xpath.getText(), "Upload More Invoices");
		softAssert.assertAll();
		
		return GetInstance(CreateExpensePage.class);
	}
	
	@Step("{method}")
	public CreateExpensePage editTxnNativeField_OUP(XSSFRow rowData) {
		untilPageLoadComplete();
		clearTextField(Grossamount_TextField_xpath_oup);
		writeText(Grossamount_TextField_xpath_oup, rowData.getCell(1).toString());
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		clearTextField(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		return GetInstance(CreateExpensePage.class);
		
	}
	 
	/**
	 * The method to click update
	 * 
	 * @throws Exception
	 */
	@Step("{method}")
	public CreateExpensePage clickUpdate(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitForElementToClickable(updateExpense_Button_Xpath);
		// waitAndClickWebElement(updateExpense_Button_Xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		waitForText(SuccessMessageEdit_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		softAssert.assertAll();
		
		return GetInstance(CreateExpensePage.class);
		
	}
	
	@Step("{method}")
	public ExpensePage createTxnWithCopy(XSSFRow rowData) throws Exception {
 		waitForElementVisible(Txntype_xpath);
 		waitForElementToClickable(Txntype_xpath);
 		waitAndClickWebElement(Txntype_xpath);
 		writeText(Txnsearch_xpath, rowData.getCell(10).toString());
 		waitAndClickWebElement(TxnSelect_xpath);
 		writeText(amount_TextField_ID, rowData.getCell(1).toString());
 		writeText(description_TextField_ID, rowData.getCell(3).toString());
 		waitAndClickWebElement(saveExpense_Button_Xpath);
 		
 		return GetInstance(ExpensePage.class);
 	}	
	
	@Step("{method}")
	public ExpensePage clickCopyButton_VerifyToast() throws Exception {
		//SoftAssert softAssert = new SoftAssert();
	    waitForElementToClickable(CopyExpense_Button_Xpath);
		waitAndClickWebElement(CopyExpense_Button_Xpath);
		specialGETElement(CopyExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		//waitForElementToHaveText(SuccessMessageEdit_Toast_xpath,string);
		//softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		//softAssert.assertAll();
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(ExpensePage.class);
	}
	
	@Step("{method}")
	public ExpensePage clickCopyButton() throws Exception {
		untilPageLoadComplete();
		waitAndClickWebElement(CopyExpense_Button_Xpath);
		return GetInstance(ExpensePage.class);
	}
	
	 @Step("{method}")
		public ExpensePage clickSave_CheckError() throws Exception {
			waitAndClickWebElement(saveExpense_Button_Xpath);
			waitForElementVisible(Amount_ErrorMsg);
			return GetInstance(ExpensePage.class);
		}
	 
	 @Step("{method}")
		public ExpensePage clickUpdateBtn() throws Exception {
			waitForElementToClickable(updateExpense_Button_Xpath);
			waitAndClickWebElement(updateExpense_Button_Xpath);
			waitForElementVisible(SuccessMessageEdit_Toast_xpath);
			return GetInstance(ExpensePage.class);
			
		}
	 
	 @Step("{method}")
		public ExpensePage EditExpense_VerifyFromScreen(String spentat, String amount) throws Exception {
			SoftAssert softAssert = new SoftAssert();
			waitAndClickWebElement(saveExpense_Button_Xpath);
			waitForElementVisible(PWChamburger_Icon_Xpath);
			isElementDisplayed(PWChamburger_Icon_Xpath);
			ScrollToElement(PWChamburger_Icon_Xpath);
			safeJavaScriptClick(PWChamburger_Icon_Xpath);
			waitForElementVisible(View_Link_Xpath);
			safeJavaScriptClick(View_Link_Xpath);
			waitForElementVisible(SpentAtInScreen_pwc);
			isElementDisplayed(SpentAtInScreen_pwc);
			softAssert.assertEquals(SpentAtInScreen_pwc.getText(),spentat);
			isElementDisplayed(AMountInScreen_xpath_pwc);
			softAssert.assertEquals(AMountInScreen_pwc.getText(),amount);
			waitAndClickWebElement(CloseView_Link_Xpath);
			softAssert.assertAll();
			return GetInstance(ExpensePage.class);
		}
	 
	 @Step("{method}")
		public ExpensePage EditExpenseVerifyFromScreen(String amount) throws Exception {
			SoftAssert softAssert = new SoftAssert();
			waitAndClickWebElement(saveExpense_Button_Xpath);
			waitForElementVisible(PWChamburger_Icon_Xpath);
			isElementDisplayed(PWChamburger_Icon_Xpath);
			ScrollToElement(PWChamburger_Icon_Xpath);
			safeJavaScriptClick(PWChamburger_Icon_Xpath);
			waitForElementVisible(View_Link_Xpath);
			safeJavaScriptClick(View_Link_Xpath);			
			isElementDisplayed(AMountInScreen_xpath_pwc);
			softAssert.assertEquals(AMountInScreen_pwc.getText(),amount);
			waitAndClickWebElement(CloseView_Link_Xpath);
			softAssert.assertAll();
			return GetInstance(ExpensePage.class);
		}
	 
	 public CreateExpensePage verifyType(String string) throws Exception {
		 SoftAssert softAssert = new SoftAssert();
		 if(isElementDisplayed(Txntype_xpath) && isElementEnabled(Txntype_xpath))
			 softAssert.assertEquals(getAttributeValue(Txntype_xpath, "value"), string);
		 System.out.println("The value from the txn type: "+getAttributeValue(Txntype_xpath, "value"));
		 softAssert.assertAll();
		 return GetInstance(CreateExpensePage.class); 
	 }
}

