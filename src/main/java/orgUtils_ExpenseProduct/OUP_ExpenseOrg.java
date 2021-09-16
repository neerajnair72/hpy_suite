package orgUtils_ExpenseProduct;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.EmployeeViews.CreateExpensePage;
import pageobjects.EmployeeViews.ExpensePage;

public class OUP_ExpenseOrg extends CreateExpensePage {

	/** Expense type drop down */
	@FindBy(xpath="//div/input[@placeholder='Expense Type']")
	@CacheLookup
	private WebElement ExpenseType_dropdown;

	/** Expense type BaseStationin OUP org */
	@FindBy(xpath="//span[@class='listValue' and text()='Mileage: Base Station']")
	@CacheLookup
	private WebElement BaseStationExpenseType_xpath_OUP;

	/** Expense type Domestic Travel: Company Paidin OUP org */
	@FindBy(xpath="//div[@class='listValue' and text()='Domestic Travel: Company Paid']")
	@CacheLookup
	private WebElement Domestic_Travel_Company_PaidExpenseType_xpath_OUP;

    /** The invoice field ID in OUP org */
	@FindBy(xpath="(//input[@type='text'])[13]")
	@CacheLookup
	private WebElement Invoicenumber_TextField_xpath_OUP;

	/** The TAX field in OUP org */
	@FindBy(xpath="(//input[@type='text'])[3]")
	@CacheLookup
	private WebElement Tax_TextField_xpath_OUP;

	/** Expense type SPLIT in OUP org */
	@FindBy(xpath="//div[@class = 'listValue' and text()='Split']")
	@CacheLookup
	private WebElement SplitExpenseType_xpath_OUP;

	/** Expense type CompanyPaid in OUP org */
	@FindBy(xpath="//div/span[text()='Non Travel: Company Paid']/..")
	@CacheLookup
	private WebElement CompanyPaidExpenseType_xpath_OUP;
	
	
	@FindBy(xpath="//span[text()='Non-Travel Expenses']")
	@CacheLookup
	private WebElement NonTravelExpensesOption;

	/** automation expense in pending list after expense creation */
	@FindBy(xpath="(//div[contains(text(),'Cash')])[1]")
	@CacheLookup
	private WebElement VerifyExpense_pendingList_xpath_Automation;

	/** The save expense button xpath. */
	@FindBy(xpath = "//button[text()='Save']")
	@CacheLookup
	private WebElement saveExpense_Button_Xpath;

	/** The Message dialog xpath transaction updated successfully. */
	//@FindBy(xpath = "//div[@class='customToastContent']")
	@FindBy(xpath = "//div[@class='customToast showCustomToast']")
	@CacheLookup
	private WebElement SuccessMessageEdit_Toast_xpath;

	/** The split amount name */
	//@FindBy(xpath="(//div/input[@name='randomname'])[1]")
	@FindBy(xpath="(//div/input[@name='Amount'])[1]")
	@CacheLookup
	private WebElement splitAmount_Input_xpath_oup;

	/** Type of report in OUP org report */
	@FindBy(xpath = "//input[@placeholder='Select Type of Report']/..")
	@CacheLookup
	private WebElement TypeofReport_xpath_OUP;

	@FindBy(xpath = "//input[@id='reportName']")
	private WebElement reportNameXpath;

	/** Type of report in OUP org report */
	@FindBy(xpath = "//span[normalize-space()='Domestic Travel Expense']")
	@CacheLookup
	private WebElement DomesticReport_xpath_OUP;

	/** OUP expense in pending list after expense creation */
	//@FindBy(xpath="(//div//span[contains(text(),'Test Automation')])[1]")
	@FindBy(how=How.XPATH, using="(//div[text()='Testing purpose'])[1]")
	@CacheLookup
	private WebElement VerifyExpense_pendingList_xpath_OUP;

	/** The done button xpath */
	@FindBy(how = How.XPATH, using = "//span[text()='Done']")
	@CacheLookup
	private WebElement done_Button_Xpath;

	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
	private List<WebElement> hamburger_Icon_Xpath;

	/** The expense action hamburger icon xapth */
	@FindBy(xpath="//tr[1]//td[17]//div[1]//img[1]")
	@CacheLookup
	private WebElement hamburger_Icon_Xpath1;

	/** The category select field xpath */
	@FindBy(xpath = "//input[@placeholder='Select Category']")
	@CacheLookup
	private WebElement category_Select_Xpath_OUP;

	@FindBy(xpath="//input[@class='form-input']")
	@CacheLookup
	private WebElement category_Xpath_OUP;

	/** The split action xpath */
	// @FindBy(how = How.XPATH, using =
	// "//div[@role='presentation']/div/div[2]")
	@FindBy(xpath = "//div[text()='Split']")
	@CacheLookup
	private WebElement split_Link_Xpath;

	/** The amount text field ID. */
	//@FindBy(id = "currency_amount")
	@FindBy(xpath="//input[@id='currency_amount']")
	@CacheLookup
	private WebElement amount_TextField_ID;

	@FindBy(xpath="//input[@id='dd-field-expesneType']")
	private WebElement Expense_type_dropdown;

	/** The amount text field ID. */
	// @FindBy(id = "currency_amount")
	@FindBy(xpath = "//input[@id='conversion_amount']")
	@CacheLookup
	private WebElement conversion_amount_TextField_ID;
	
	/** Expense type search bar */
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	private WebElement ExpenseTypeSearchBar_dropdown;

	/** The spent at text field ID. */
	//@FindBy(id = "payee_merchant")
	@FindBy(xpath="//input[@type='text' and @id='payee_merchant']")
	@CacheLookup
	private WebElement spentAt_TextField_ID;

	/** The description text field ID. */
	@FindBy(xpath="//input[@type='text' and @id='description']")
	@CacheLookup
	private WebElement description_TextField_ID;

	/** The amount text field in OUP org */
	@FindBy(xpath="//label[text()='Gross Amount']")
	@CacheLookup
	private WebElement Grossamount_label_xpath_oup;

	/** The amount text field in OUP org */
	@FindBy(xpath="(//input[@type='text'])[2]")
	@CacheLookup
	private WebElement Grossamount_TextField_xpath_oup;

	/** Airport transfer category in Expense OUP*/
	@FindBy(xpath="	//li[@data-name='Airport transfer- Domestic']")
	@CacheLookup
	private WebElement AirportCategory_Dropdown_Xpath_OUP;

	@FindBy(xpath="//li[contains(text(),'Airport transfer- Domestic')]")
	@CacheLookup
	private WebElement Reportcategory_xpath;

	/** Nature of txn dropdown in company paid expense type */
	@FindBy(xpath="//div//input[@name='Nature of Transaction']")
	@CacheLookup
	private WebElement Natureoftxn_xpath_OUP;

	/** Dommestic Nature of txn dropdown in company paid expense type */
	@FindBy(xpath="//div//span[text()='Domestic']/..")
	@CacheLookup
	private WebElement Domestic_Natureoftxn_xpath_OUP;

	@FindBy(xpath = "//div/label[text()='Pending for Approval']")
	@CacheLookup
	private WebElement Pendingreport_Filter_xpath;

	@FindBy(xpath = "//div/label[text()='Pending at Manager']")
	@CacheLookup
	private WebElement Pendingreport_Filter_xpath_OUP;

	@FindBy(xpath="//div/label[text()='Saved']")
	@CacheLookup
	private WebElement SavedReport_Filter_xpath_OUP;

	/** The hamburger menu. */
	@FindBy(xpath = "(//div/img[@src='actions-icon.svg'])[1]")
	@CacheLookup
	private WebElement hamburgerMenu;


	@FindBy(xpath = "//div[text()='Detailed view']")
	@CacheLookup
	private WebElement detailedView;

	/** status search in filter report */
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	private WebElement Statusearch_xpath_OUP;

	/** Saved report */
	@FindBy(xpath = "//div/label[text()='Saved']")
	@CacheLookup
	private WebElement SavedReport_xpath_OUP;

	/** Delete Button **/
	@FindBy(xpath = "//div[text()='Delete']")
	@CacheLookup
	private WebElement deleteButton;

	@FindBy(xpath = "//span[text()='Delete']/..")
	@CacheLookup
	private WebElement delete_button;

	@FindBy(xpath = "//span[text()='Recall']")
	@CacheLookup
	private WebElement recall_btn;

	@FindBy(xpath = "//button//span[text()='Proceed']/..")
	@CacheLookup
	private WebElement ProceedRecall_xpath;

	@FindBy(xpath = "//div[@class='customToast showCustomToast']")
	//@FindBy(xpath = "//div[@class='customToastContent']/..")
	@CacheLookup
	private WebElement SuccessMessage_Toast_xpath;

	/** Click on Quick view in reports */
	@FindBy(xpath = "(//td/div[text()='Saved'])[1]")
	@CacheLookup
	private WebElement QuickViewReport;

	/** Delete report from quick view */
	@FindBy(xpath = "//span[text()='Delete']")
	//@FindBy(xpath="//*[@id=\"app\"]/div/div[5]/div[1]/div[2]/div/div[1]/div[2]/div/button[2]/span")
	private WebElement Delete_report_butotn;

	/** The confirm delete button xpath */
	//@FindBy(xpath = "//span[text()='Delete']/..")
	@FindBy(xpath="(//span[text()='Delete'])[2]")
	private WebElement deleteConfirm_Button_Xpath;

	@FindBy(xpath = "//button[text()='Save']")
	@CacheLookup
	private WebElement saveReportButton;

	@FindBy(xpath = "//button[normalize-space()='New Report']")
	@CacheLookup
	private WebElement new_report;

	//@FindBy(xpath = "//span[text()='next']/..")
	@FindBy(xpath="//button[normalize-space()='Next']")
	@CacheLookup
	private WebElement nextButton;

	@FindBy(xpath="//span[text()='Edit Report']")
	private WebElement editReport;

	@FindBy(xpath="(//div[@data-tip='Copy to clipboard'])[1]")
	private WebElement firstReportID;

	public static  String timestamp = "";


	public static String getTimestamp() {
		return timestamp;
	}

	public static void setTimestamp(String timestamp) {
		OUP_ExpenseOrg.timestamp = timestamp;
	}

	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElements.class).logout();

	}

	public OUP_ExpenseOrg FillTxnMissingAmount_OUPOrg(XSSFRow rowData) throws Exception {
		//GetInstance(CreateExpensePage.class);
		untilPageLoadComplete();
		waitForElementVisible(ExpenseType_dropdown);
		waitAndClickWebElement(ExpenseType_dropdown);
		writeText(ExpenseTypeSearchBar_dropdown, "Domestic Travel: Company Paid");
		waitForElementVisible(Domestic_Travel_Company_PaidExpenseType_xpath_OUP);
		waitAndClickWebElement(Domestic_Travel_Company_PaidExpenseType_xpath_OUP);
		waitForElementVisible(Tax_TextField_xpath_OUP);
		writeText(Tax_TextField_xpath_OUP, rowData.getCell(1).toString());
		waitForElementVisible(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		ScrollToElementNew(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		ScrollToElementNew(Invoicenumber_TextField_xpath_OUP);
		writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());

		return GetInstance(OUP_ExpenseOrg.class);
	}


	/* The method to create expense with all native fields */
	public OUP_ExpenseOrg FillTxnWithNativeFields_OUPOrg(XSSFRow rowData) throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(ExpenseType_dropdown);
		waitAndClickWebElement(ExpenseType_dropdown);
		writeText(ExpenseTypeSearchBar_dropdown, "Domestic Travel: Company Paid");
		waitForElementVisible(Domestic_Travel_Company_PaidExpenseType_xpath_OUP);
		waitAndClickWebElement(Domestic_Travel_Company_PaidExpenseType_xpath_OUP);
		waitForElementVisible(Grossamount_TextField_xpath_oup);
		writeText(Grossamount_TextField_xpath_oup, rowData.getCell(1).toString());
		waitForElementVisible(Tax_TextField_xpath_OUP);
		writeText(Tax_TextField_xpath_OUP, rowData.getCell(1).toString());
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		waitForElementVisible(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		waitForElementVisible(Invoicenumber_TextField_xpath_OUP);
		writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());

		return GetInstance(OUP_ExpenseOrg.class);

	}


	/* The method to create expense with all native fields */
	public OUP_ExpenseOrg CreateCompanyPaidExpense_OUPOrg(XSSFRow rowData) throws Exception {
		//GetInstance(CreateExpensePage.class);
		untilPageLoadComplete();
		waitForElementVisible(ExpenseType_dropdown);
		waitAndClickWebElement(ExpenseType_dropdown);
		waitForElementVisible(CompanyPaidExpenseType_xpath_OUP);
		waitAndClickWebElement(CompanyPaidExpenseType_xpath_OUP);

		writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());
		waitForElementVisible(Natureoftxn_xpath_OUP);
		waitAndClickWebElement(Natureoftxn_xpath_OUP);
		waitForElementVisible(Domestic_Natureoftxn_xpath_OUP);
		waitAndClickWebElement(Domestic_Natureoftxn_xpath_OUP);
		waitForElementVisible(Tax_TextField_xpath_OUP);
		writeText(Tax_TextField_xpath_OUP, rowData.getCell(1).toString());
		waitForElementVisible(Grossamount_TextField_xpath_oup);
		writeText(Grossamount_TextField_xpath_oup, rowData.getCell(1).toString());
		waitForElementVisible(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());

		return this;
	}


	public OUP_ExpenseOrg SplitExpenseType(XSSFRow rowData, String string) throws Exception {
		//GetInstance(CreateExpensePage.class);
		untilPageLoadComplete();
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(ExpenseType_dropdown);
		waitAndClickWebElement(ExpenseType_dropdown);
		waitForElementVisible(ExpenseTypeSearchBar_dropdown);
		writeText(ExpenseTypeSearchBar_dropdown, "Split");
		waitForElementVisible(SplitExpenseType_xpath_OUP);
		waitAndClickWebElement(SplitExpenseType_xpath_OUP);
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());

		waitForElementVisible(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		fluentWaitForElementClickable(category_Xpath_OUP);
		waitAndClickWebElement(category_Xpath_OUP);
		writeText(category_Xpath_OUP, "Airport transfer- Domestic");
		waitForElementVisible(AirportCategory_Dropdown_Xpath_OUP);
		waitAndClickWebElement(AirportCategory_Dropdown_Xpath_OUP);
		ScrollToElement(saveExpense_Button_Xpath);
		moveToElement_Actions(saveExpense_Button_Xpath);
		waitAndClickWebElement(saveExpense_Button_Xpath);

		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertAll();
		// return this;
		return GetInstance(OUP_ExpenseOrg.class);
	}


	public OUP_ExpenseOrg ReportExpenseType(XSSFRow rowData) throws Exception {
		//GetInstance(CreateExpensePage.class);
		untilPageLoadComplete();

		//waitForElementToClickable(Expense_type_dropdown);
		waitAndClickWebElement(Expense_type_dropdown);
		//getDropDownList(Expense_type_dropdown);
		//selectByVisibleText(Expense_type_dropdown,"Currency Return");
		//waitForElementToClickable(NonTravelExpensesOption);
		waitAndClickWebElement(NonTravelExpensesOption);
		//selectValueOfDropdownwithWaitAndClock(Expense_type_dropdown,,)


		writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());

		waitForElementVisible(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		//ScrollToElement(category_Select_Xpath_OUP);
	/*	waitAndClickWebElement(category_Select_Xpath_OUP);
		waitForElementVisible(Reportcategory_xpath);
		waitAndClickWebElement(Reportcategory_xpath);*/
		//ScrollToElement(saveExpense_Button_Xpath);
		moveToElement_Actions(saveExpense_Button_Xpath);
		waitAndClickWebElement(saveExpense_Button_Xpath);


		//return this;
		return GetInstance(OUP_ExpenseOrg.class);
	}


	public OUP_ExpenseOrg clickTxnSplit() throws Exception {
		//GetInstance(CreateExpensePage.class);

		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(split_Link_Xpath);
		waitForElementToClickable(split_Link_Xpath);
		waitAndClickWebElement(split_Link_Xpath);

		//return this;
		return GetInstance(OUP_ExpenseOrg.class);
	}



	/** The method to split expense for PWC org */
	public OUP_ExpenseOrg splitTxn_OUP(XSSFRow rowData, String string) {
		//GetInstance(CreateExpensePage.class);
		// GetInstance(CreateExpensePage.class);
				SoftAssert softAssert = new SoftAssert();

				waitForElementVisible(splitAmount_Input_xpath_oup);
				waitForElementToClickable(splitAmount_Input_xpath_oup);
				writeText(splitAmount_Input_xpath_oup, rowData.getCell(6).toString());
				waitAndClickWebElement(done_Button_Xpath);
				fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
				// waitForElementVisible(SuccessMessageEdit_Toast_xpath);
				softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
				waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
				softAssert.assertAll();
				// return this;
				return GetInstance(OUP_ExpenseOrg.class);
	}

	public OUP_ExpenseOrg VerifyExpense_pending_list_OUP() {
		SoftAssert softAssert = new SoftAssert();
		boolean flag=false;
		waitForElementVisible(VerifyExpense_pendingList_xpath_OUP);
		if(VerifyExpense_pendingList_xpath_OUP.isDisplayed())
		{
			flag=true;
			String Expense=VerifyExpense_pendingList_xpath_OUP.getText();
			System.out.println(Expense + " is Present in pending list");
		}else
		{
			System.out.println("Not present in pending list trying again to find");

		}
		softAssert.assertEquals(flag, true);
		softAssert.assertAll();
		return GetInstance(OUP_ExpenseOrg.class);
	}


	public OUP_ExpenseOrg CreateReportWithMandatoryFields_OUP(String string) {
		//GetInstance(CreateExpensePage.class);
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();

		waitAndClickWebElement(new_report);
		waitForElementVisible(reportNameXpath);

		for(int i=0;i<7;i++) {
			doubleClick(reportNameXpath);
			reportNameXpath.sendKeys(Keys.DELETE);}

		clearTextField(reportNameXpath);

		reportNameXpath.sendKeys(OUP_ExpenseOrg.getTimestamp());
		waitForElementToClickable(TypeofReport_xpath_OUP);
		waitAndClickWebElement(TypeofReport_xpath_OUP);
		waitForElementToClickable(DomesticReport_xpath_OUP);
		waitAndClickWebElement(DomesticReport_xpath_OUP);

		moveToElement_Actions(nextButton);
		specialClick(nextButton);
		untilPageLoadComplete();
		softAssert.assertEquals(editReport.getText(), "EDIT REPORT");
		softAssert.assertAll();
		//return this;
		return GetInstance(OUP_ExpenseOrg.class);

	}



	public OUP_ExpenseOrg deleteReport_OUP(String string) throws Exception

	{
		//GetInstance(CreateExpensePage.class);
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(Statusearch_xpath_OUP);
		//ScrollToElement(SavedReport_xpath_OUP);
		waitForElementToClickable(Statusearch_xpath_OUP);
		writeText(Statusearch_xpath_OUP, "Saved");


		//moveToElement_Actions(SavedReport_xpath_OUP);
		waitForElementToClickable(SavedReport_xpath_OUP);
		click_Actions(SavedReport_xpath_OUP);

		waitForElementVisible(hamburger_Icon_Xpath.get(0 ));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(deleteButton);
		waitAndClickWebElement(deleteButton);


		waitAndClickWebElement(delete_button);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		//waitForText(SuccessMessage_Toast_xpath, string);
		waitForElementToHaveText(SuccessMessage_Toast_xpath, string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		//return this;
		return GetInstance(OUP_ExpenseOrg.class);

	}


	/** The method to delete expense */
	public OUP_ExpenseOrg DeleteReportQucikView(String string) {
		//GetInstance(ReportsPage.class);
		SoftAssert softAssert = new SoftAssert();
		// click_Actions(hamburger_Icon_Xpath.get(0));
		untilPageLoadComplete();
		waitForElementVisible(QuickViewReport);
		waitForElementToClickable(QuickViewReport);
		waitAndClickWebElement(QuickViewReport);
		waitForElementVisible(Delete_report_butotn);
		waitForElementToClickable(Delete_report_butotn);
		waitAndClickWebElement(Delete_report_butotn);

		specialClick(deleteConfirm_Button_Xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		//return this;
		return GetInstance(OUP_ExpenseOrg.class);
	}


	public OUP_ExpenseOrg RecallReport(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		moveToElement_Actions(Pendingreport_Filter_xpath_OUP);
		waitForElementVisible(Pendingreport_Filter_xpath_OUP);
		click_Actions(Pendingreport_Filter_xpath_OUP);

		//waitForElementVisible(PendingForApproval_filter_xpath_OUP);
		//softassert.assertEquals(PendingForApproval_filter_xpath_OUP.getText(), string);

		waitForElementToClickable(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView);
		waitForElementToClickable(recall_btn);
		waitAndClickWebElement(recall_btn);
		waitAndClickWebElement(ProceedRecall_xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForElementToHaveText(SuccessMessage_Toast_xpath, string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);

		//return this;
		return GetInstance(OUP_ExpenseOrg.class);

	}


	public OUP_ExpenseOrg VerifyExpense_pending_list_Automation() {
		//GetInstance(CreateExpensePage.class);
		waitForElementVisible(VerifyExpense_pendingList_xpath_Automation);
		if(VerifyExpense_pendingList_xpath_Automation.isDisplayed())
		{
			String Expense=VerifyExpense_pendingList_xpath_Automation.getText();
			System.out.println(Expense + " is Present in pending list");
		}else
		{
			System.out.println("Not present in pending list trying again to find");

		}
		return this;
	}

	@Step("{method}")
	public OUP_ReportOrg expenseSave() {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementToClickable(saveReportButton);
		click_Actions(saveReportButton);
		
//		softAssert.assertEquals(editReport.getText(), "EDIT REPORT");


		softAssert.assertAll();
		return GetInstance(OUP_ReportOrg.class);
	}

	public ExpensePage SplitExpenseType(XSSFRow rowData) throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(ExpenseType_dropdown);
		waitAndClickWebElement(ExpenseType_dropdown);
		if(isElementDisplayed(ExpenseTypeSearchBar_dropdown) && isElementEnabled(ExpenseTypeSearchBar_dropdown))
		{
			writeText(ExpenseTypeSearchBar_dropdown, "Split");
		}
		if(isElementDisplayed(SplitExpenseType_xpath_OUP) && isElementEnabled(SplitExpenseType_xpath_OUP))
		{
			waitForElementVisible(SplitExpenseType_xpath_OUP);

			waitAndClickWebElement(SplitExpenseType_xpath_OUP);
		}
		if(isElementDisplayed(amount_TextField_ID) && isElementEnabled(amount_TextField_ID))
		{
			waitForElementVisible(amount_TextField_ID);
			writeText(amount_TextField_ID, rowData.getCell(1).toString());
		}
		if(isElementDisplayed(spentAt_TextField_ID) && isElementEnabled(spentAt_TextField_ID))
		{
			waitForElementVisible(spentAt_TextField_ID);
			writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		}
		if(isElementDisplayed(description_TextField_ID) && isElementEnabled(description_TextField_ID))
		{
			waitForElementVisible(description_TextField_ID);
			writeText(description_TextField_ID, rowData.getCell(3).toString());
		}
		fluentWaitForElementClickable(category_Xpath_OUP);
		waitAndClickWebElement(category_Xpath_OUP);
		writeText(category_Xpath_OUP, "Airport transfer- Domestic");
		if(isElementDisplayed(AirportCategory_Dropdown_Xpath_OUP) && isElementEnabled(AirportCategory_Dropdown_Xpath_OUP))
		{
			waitForElementVisible(AirportCategory_Dropdown_Xpath_OUP);
			waitAndClickWebElement(AirportCategory_Dropdown_Xpath_OUP);
		}
		ScrollToElement(saveExpense_Button_Xpath);
		waitAndClickWebElement(saveExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(ExpensePage.class);
	}

	public ExpensePage SplitExpenseTypeOUP(XSSFRow rowData) throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(ExpenseType_dropdown);
		waitAndClickWebElement(ExpenseType_dropdown);
		if(isElementDisplayed(ExpenseTypeSearchBar_dropdown) && isElementEnabled(ExpenseTypeSearchBar_dropdown))
		{
			writeText(ExpenseTypeSearchBar_dropdown, "Split");
		}
		if(isElementDisplayed(SplitExpenseType_xpath_OUP) && isElementEnabled(SplitExpenseType_xpath_OUP))
		{
			waitForElementVisible(SplitExpenseType_xpath_OUP);

			waitAndClickWebElement(SplitExpenseType_xpath_OUP);
		}
		if(isElementDisplayed(amount_TextField_ID) && isElementEnabled(amount_TextField_ID))
		{
			waitForElementVisible(amount_TextField_ID);
			writeText(amount_TextField_ID, rowData.getCell(1).toString());
		}
//		if (isElementDisplayed(conversion_amount_TextField_ID) && isElementEnabled(conversion_amount_TextField_ID)) {
//			waitForElementVisible(conversion_amount_TextField_ID);
//			writeText(conversion_amount_TextField_ID, rowData.getCell(1).toString());
//		}
		if(isElementDisplayed(spentAt_TextField_ID) && isElementEnabled(spentAt_TextField_ID))
		{
			waitForElementVisible(spentAt_TextField_ID);
			writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		}
		if(isElementDisplayed(description_TextField_ID) && isElementEnabled(description_TextField_ID))
		{
			waitForElementVisible(description_TextField_ID);
			writeText(description_TextField_ID, rowData.getCell(3).toString());
		}
		//writeText(Invoicenumber_TextField_xpath_OUP, rowData.getCell(8).toString());

		return GetInstance(ExpensePage.class);
	}
}
