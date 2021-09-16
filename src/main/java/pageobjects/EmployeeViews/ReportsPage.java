package pageobjects.EmployeeViews;

import frameworkBase.TestBotElementsWrapper;
import frameworkBase.TestBotBase.ORG;
import io.qameta.allure.Step;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;
import orgUtils_ExpenseProduct.OUP_ExpenseOrg;
import orgUtils_ExpenseProduct.PWC_ReportOrg;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ReportsPage extends TestBotElementsWrapper {





	@FindBy(xpath="//a[text()='REPORTS']")
	@CacheLookup
	private WebElement GotoReport_button_xpath;

	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement newReport_Button_xpath;

	/**
	 * @return the newRreport_Button_xpath
	 */
	private WebElement getNewRreport_Button_xpath() {
		return newReport_Button_xpath;
	}

	//@FindBy(xpath = "//span[text()='next']/..")
	@FindBy(xpath="//button/span[text()='Next']/..")
	private WebElement nextButton;

	@FindBy(xpath = "//button[text()='Add New Expense']")
	private WebElement add_new_expenseButton;

	//@FindBy(xpath = "//span[text()='Attach Existing Expense']")
	//@FindBy(xpath="//span[text()='ATTACH EXISTING EXPENSE']")
	@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div[2]/div/div[1]/div/button[2]")
	private WebElement add_Existing_expenseButton;

	@FindBy(xpath = "//button//span[text()='Proceed']/..")
//	@FindBy(xpath="//button//span[text()='PROCEED']/..")
	//@FindBy(xpath="/html/body/div[9]/div/div[1]/div/div/div[3]/button[2]")
	private WebElement ProceedRecall_xpath;

	@FindBy(xpath = "//div/label/div[@class='check']")
	public List<WebElement> ExistingExpense_CheckboxList_PWC;

	@FindBy(xpath="(//div/label/div[@class='check'])[2]")
	private  WebElement ExistingExpense_Checkbox_PWC;

	@FindBy(xpath = "//div//button//span[contains(text(),'ADD')]/../..")
	//@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div[3]/div/button[2]/span")
	private WebElement Add_ExistingButton_xpath;

	@FindBy(xpath = "//span[text()='Submit']/..")
	private WebElement submitButton;

	@FindBy(xpath = "//span[text()='Submit Report Request']")
	private WebElement CheckPolicy_popup;

	@FindBy(xpath = "//button/span[contains(text(),'Yes')]/..")
	private WebElement CheckPolicy_popup_YES;

	@FindBy(xpath = "//span[text()='Attach Existing Expense']")
	private WebElement attach_existing_expenseButton;

	@FindBy(xpath = "//div[text()='Edit']")
	private WebElement editReport_button_xpath;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveExpense;

	@FindBy(xpath = "//div[text()='Report initiated successfully.']")
	private WebElement reportCreateText;

	@FindBy(xpath = "//button//span[text()='Save']/..")
	private WebElement saveButton;

	@FindBy(xpath = "//span[text()='Add Expense']")
	private WebElement addExpenseButton;

	@FindBy(xpath = "//button/div/span[text()='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//div[text()='Select a Wallet']")
	private WebElement Wallet_xpath;

	@FindBy(xpath = "//input[@name='Report_Text_Mandatory_EF']")
	private WebElement extrafield_xpath;

	/** Type of report in OUP org report */
	@FindBy(xpath = "//input[@name='Type of Report']/..")
	private WebElement TypeofReport_xpath_OUP;

	/** Type of report in OUP org report */
	@FindBy(xpath = "//div/span[@title='Domestic Travel Expenses']/..")
	private WebElement DomesticReport_xpath_OUP;

	 @FindBy(xpath = "//div[@class='customToast showCustomToast']")
	 @CacheLookup
	private WebElement SuccessMessage_Toast_xpath;


	/** Click on Quick view in reports */
	@FindBy(xpath = "(//td/div[text()='Saved'])[1]")
	private WebElement QuickViewReport;

	/** Delete report from quick view */
	@FindBy(xpath = "//div/button/span[text()='Delete']")
	//@FindBy(xpath="//*[@id=\"app\"]/div/div[5]/div[1]/div[2]/div/div[1]/div[2]/div/button[2]/span")
	public  WebElement Delete_report_butotn;

	/** The confirm delete button xpath */
	//@FindBy(xpath = "//span[text()='Delete']/..")
	@FindBy(xpath="(//button/span[text()='Delete']/..)[2]")
	public  WebElement deleteConfirm_Button_Xpath;

	@FindBy(xpath = "//img[@class='delete-button-icon']")
	private WebElement DeleteBillIcon_xpath;

	/** The hamburger menu. */
	@FindBy(xpath = "(//div/img[@src='actions-icon.svg'])[1]")
	private WebElement hamburgerMenu;

	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
	public  List<WebElement> hamburger_Icon_Xpath;

	/** PWC Hamburger icon */
	@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	private WebElement PWChamburger_Icon_Xpath;

	/** The expense edit action xpath */
	@FindBy(xpath="//span//div/div[text()='Edit']")
	public  WebElement edit_Link_Xpath;

	/** The uodate expense button xpath. */
	//@FindBy(how = How.XPATH, using = "//span[text()='Update']")
	@FindBy(xpath="//button[@class='primaryButton']")
	public  WebElement updateExpense_Button_Xpath;

	/** The amount text field ID. */
	//@FindBy(id="currency_amount")
	@FindBy(xpath="//input[@id='currency_amount']")
	public  WebElement amount_TextField_ID;

	/** The spent at text field ID. */
	//@FindBy(id="payee_merchant")
	@FindBy(xpath="//input[@id='payee_merchant']")
	public  WebElement spentAt_TextField_ID;
	
	@FindBy(xpath="//input[@id='dd-field-expesneType']")
	public  WebElement expenseTypeDD;

	/** Delete Button **/
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement deleteButton;

	/** Edit Button in hamburger **/
	@FindBy(xpath = "//div[text()='Edit']")
	private WebElement Edit_ButtonHamburger_xpath;

	/** Remove Button in hamburger **/
	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement Remove_ButtonHamburger_xpath;

	/** Remove confirm Button  **/
	@FindBy(xpath = "//button/span[text()='Yes']")
	private WebElement RemoveConfirm_Button_xpath;

	/** Submit Button in hamburger **/
	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement Submit_ButtonHamburger_xpath;

	@FindBy(xpath = "//div[text()='Not Violated']")
	private WebElement NonViolated_filter_xpath;

	@FindBy(xpath = "//div[text()='Violated']")
	private WebElement Violated_filter_xpath;

	@FindBy(xpath = "//div[text()='Pending for Approval']")
	private WebElement PendingForApproval_filter_xpath;

	@FindBy(xpath = "//div[text()='Pending at Manager']")
	private WebElement PendingForApproval_filter_xpath_OUP;


	@FindBy(xpath = "//label[text()='Not Violated']/.")
	private WebElement nonviolated_xpath;

	@FindBy(xpath = "//label[text()='Violated']/.")
	private WebElement violated_xpath;

	@FindBy(xpath = "//div/label[text()='Pending for Approval']")
	private WebElement Pendingreport_Filter_xpath;

	@FindBy(xpath = "//div/label[text()='Pending at Manager']")
	private WebElement Pendingreport_Filter_xpath_OUP;

	@FindBy(xpath="//div/label[text()='Saved']")
	private WebElement SavedReport_Filter_xpath_OUP;


	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement new_report;

	//@FindBy(xpath = "//input[@type='text'][@class='ReactTags__tagInputField']")
	@FindBy(xpath = "//input[@placeholder='Add Mail Id & Press Enter']")
	private WebElement mailid_xpath;

	@FindBy(xpath = "(//div/input[@type='text'])[12]")
	//@FindBy(xpath="//span[text()='"+threeDaysBefore()+"']"))
	private WebElement FromDateinPopup_xpath;

	@FindBy(xpath = "(//div/input[@type='text'])[13]")
	private WebElement ToDateinPopup_xpath;


	@FindBy(xpath = "//div[text()='Detailed view']")
	private WebElement detailedView;

	//View expense inside report
	@FindBy(xpath = "//div[text()='View']")
	private WebElement View_Expense_InsideReport;

	/**
	 * The close expense View action xpath
	 */
	@FindBy(xpath = "//div/span/img[@src='/assets/images/cross.svg']")
	private WebElement CloseView_Link_Xpath;

	@FindBy(xpath = "//button//span[text()='Recall']/..")
	private WebElement recall_btn;



	/** Reports link in Homepage */
	@FindBy(xpath = "//a[text()='REPORTS']")
	private WebElement reports_Link_xpath;

	@FindBy(xpath="//div/button//span[text()='New Report']/..")
	private WebElement ReportCreation_xpath;


	@FindBy(xpath = "//div[@class = 'exportEtl']")
	private WebElement export_link;

	@FindBy(xpath = "(//span[text()='Download'])[2]")
	private WebElement download_report;

	@FindBy(xpath = "//div[text()='Download']")
	private WebElement download;

	@FindBy(xpath = "//div[text()='Policy Exception Report']")
	private WebElement policyexception;

	@FindBy(xpath = "//div[text()='Workflow Comments']")
	private WebElement workflow_comments;

	@FindBy(xpath = "//span[text()='Download']/..")
	private WebElement download_button;

	@FindBy(xpath = "//span[text()='Delete']/..")
	private WebElement delete_button;

	 /** Saved report */
	@FindBy(xpath = "//div/label[text()='Saved']")
	private WebElement SavedReport_xpath_OUP;

	 /** status search in filter report */
		@FindBy(xpath = "//input[@placeholder='Search']")
		private WebElement Statusearch_xpath_OUP;

		@FindBy(xpath="(//td[@class='tableStatusColumnClass']/..//span[@data-class='tooltipStyleClass'])[1]")
		private WebElement firstReportNameXpath;

	/** Project Name */
	@FindBy(xpath = "//div/input[@name='Project  Name']")
	private WebElement ProjectName_xpath_PWC;

	@FindBy(xpath="(//div[contains(text(),'townhall')])[1]")
	private WebElement SelectProject;

	/** Select project */
	@FindBy(xpath = "//tr[2]//td[1]//input[1]")
	private WebElement SelectProject_xpath_PWC;

	/** Add button project */
	@FindBy(xpath = "//div/button/span[text()='Add']/..")
	private WebElement AddButton_Project_xpath_PWC;

	/** Add button project */
	@FindBy(xpath = "//div/button/span[text()='cancel']/..")
	private WebElement CancelButton_Project_xpath_PWC;

	/** Uppload bill button inside report for expense **/
	@FindBy(xpath ="//div/input[@type='file']")
	private WebElement AddBill;

	/** Advance search button in project search**/
	@FindBy(xpath ="//p[@class='advanceSearch']")
	private WebElement AdvanceSearch_button;


	/** Radio button in project search**/
	@FindBy(xpath ="//tr[1]//td[1]//input[1]")
	private WebElement RadioButtoninProjectsearch;


	/** Add button in project list**/
	@FindBy(xpath ="//button/span[text()='Add']")
	private WebElement AddButton;

	/** Delete bill icon in expense */
	//@FindBy(xpath="//div[@class='delete-button delete-button-edit']")
	//@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div[1]/img")
	@FindBy(xpath="(//div[@class='iconContainer'])[1]")
	private WebElement DeleteExpenseBillIcon_xpath;


	@FindBy(xpath="//div/button/span[text()='Delete']/..")
	private WebElement DeleteBillConfirm_xpath;

	/** The logout link. */
	//@FindBy(xpath = "//div[text()='Sign Out']")
	@FindBy(xpath="//div[text()='Sign Out']/../..")
	private WebElement logoutLink;

	/** The hamburger menu. */
	@FindBy(xpath = "//div[@class='side-menu']")
	private WebElement hamburgerMenu_logout;

	@FindBy(xpath = "//label/span[text()='Cash']")
	private WebElement Cash_radio_buttonxpath;
	
	@FindBy(xpath = "//div[text()='per page']/..//span[2]")
	private WebElement reportCount;




	@Step("{method}")
	public ReportsPage goto_Report_Creation_Page() {
        untilPageLoadComplete();
		waitAndClickWebElement(reports_Link_xpath);
		waitForElementVisible(ReportCreation_xpath);
		waitAndClickWebElement(ReportCreation_xpath);
		return GetInstance(ReportsPage.class);
	}



	@Step("{method}")
	public CreateExpensePage clickAddExpense() {

		waitAndClickWebElement(add_new_expenseButton);
		waitForText(Cash_radio_buttonxpath, "Cash");
		return GetInstance(CreateExpensePage.class);

	}
	

	
	@Step("{method}")
	public ReportsPage EditReport() throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(GotoReport_button_xpath);
        waitAndClickWebElement(GotoReport_button_xpath);
        waitForElementVisible(SavedReport_Filter_xpath_OUP);
		waitAndClickWebElement(SavedReport_Filter_xpath_OUP);
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(Edit_ButtonHamburger_xpath);
		waitAndClickWebElement(Edit_ButtonHamburger_xpath);

		return GetInstance(ReportsPage.class);

	}
	
	@Step("{method}")
	public ReportsPage EditReport_PWC() throws Exception {
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		safeJavaScriptClick(PWChamburger_Icon_Xpath);
		waitForElementVisible(edit_Link_Xpath);
		safeJavaScriptClick(edit_Link_Xpath);

//		waitForElementVisible(hamburger_Icon_Xpath.get(0));
//		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
//		waitForElementVisible(Edit_ButtonHamburger_xpath);
//		safeJavaScriptClick(Edit_ButtonHamburger_xpath);
//		//waitAndClickWebElement(Edit_ButtonHamburger_xpath);

		return GetInstance(ReportsPage.class);

	}
	
	@Step("{method}")
	public ReportsPage RemoveExpense(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		ScrollToElement(hamburger_Icon_Xpath.get(0));
		waitForElementToClickable(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));

		//safeJavaScriptClick(Remove_ButtonHamburger_xpath);
		waitAndClickWebElement(Remove_ButtonHamburger_xpath);

		waitForElementVisible(RemoveConfirm_Button_xpath);
		waitAndClickWebElement(RemoveConfirm_Button_xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return GetInstance(ReportsPage.class);
		

	}
	
	
	@Step("{method}")
	public ReportsPage SubmitReport_Automation(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		//ScrollToElement(PWChamburger_Icon_Xpath);
        waitForElementVisible(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementVisible(Submit_ButtonHamburger_xpath);
		//safeJavaScriptClick(Submit_ButtonHamburger_xpath);
		waitAndClickWebElement(Submit_ButtonHamburger_xpath);
		if(isElementDisplayed(SuccessMessage_Toast_xpath)){
			//waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
		}
		
		else if (isElementDisplayed(CheckPolicy_popup)) {
			
	       //
	        waitForElementVisible(CheckPolicy_popup_YES);
	        //moveToElement_Actions(CheckPolicy_popup_YES);
			waitAndClickWebElement(CheckPolicy_popup_YES);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			
		}
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage goto_Report_Page() {

		waitAndClickWebElement(reports_Link_xpath);

		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage SubmitReport_PWC(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
        waitForElementVisible(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		//safeJavaScriptClick(Submit_ButtonHamburger_xpath);
		waitAndClickWebElement(Submit_ButtonHamburger_xpath);
		if(isElementDisplayed(SuccessMessage_Toast_xpath)){
			//waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
		}
		
		else if (isElementDisplayed(CheckPolicy_popup)) {
	        waitForElementVisible(CheckPolicy_popup_YES);
			waitAndClickWebElement(CheckPolicy_popup_YES);
			waitForElementVisible(SuccessMessage_Toast_xpath);
			waitForText(SuccessMessage_Toast_xpath,string);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
		}
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage FilterSavedReport() {
		untilPageLoadComplete();
		//moveToElement_Actions(SavedReport_Filter_xpath_OUP);
		waitForElementVisible(SavedReport_Filter_xpath_OUP);
		waitAndClickWebElement(SavedReport_Filter_xpath_OUP);
		return GetInstance(ReportsPage.class);
	}

	/** The method to click edit link of an expense in PWC org
	 * @throws Exception */
	@Step("{method}")
	public ReportsPage clickExpenseEdit_PWC() throws Exception {

		//ScrollToElement(hamburger_Icon_Xpath.get(0));
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		//ScrollToElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(edit_Link_Xpath);
		safeJavaScriptClick(edit_Link_Xpath);
		return GetInstance(ReportsPage.class);
	}

	/** The method to edit expense and delete bill of expense inside report */
	@Step("{method}")
	public ReportsPage DeleteBill_PWC(String string) {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(DeleteBillIcon_xpath);
		waitAndClickWebElement(DeleteBillIcon_xpath);
		waitForElementVisible(deleteConfirm_Button_Xpath);
		waitAndClickWebElement(deleteConfirm_Button_Xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return GetInstance(ReportsPage.class);
	}

	// The method to click update
	@Step("{method}")
	public ReportsPage clickUpdate_PWC(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return GetInstance(ReportsPage.class);
	}

	// The method to click update
	@Step("{method}")
	public ReportsPage clickUpdate(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return GetInstance(ReportsPage.class);
	}

	/** The method to edit expense with native fields */
	@Step("{method}")
	public ReportsPage editTxnNativeField_PWC(XSSFRow rowData) {
		untilPageLoadComplete();

		//clearText(amount_TextField_ID);
		 String b = Keys.BACK_SPACE.toString();
	       // amount.sendKeys(b + b + b + b + b + b + b + b + b + b);
		isElementDisplayed(amount_TextField_ID);
		waitForElementVisible(amount_TextField_ID);
		clearTextField(amount_TextField_ID);
		//writeText(amount_TextField_ID, b+b+b+b+b+b+b+b+b);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		clearTextField(spentAt_TextField_ID);
		//writeText(spentAt_TextField_ID, b+b+b+b+b+b+b+b+b);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());

		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage Add_Existing_Expense(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(add_Existing_expenseButton);
		isElementDisplayed(ExistingExpense_Checkbox_PWC);
		waitForElementVisible(ExistingExpense_Checkbox_PWC);
		waitAndClickWebElement(ExistingExpense_Checkbox_PWC);
		isElementEnabled(Add_ExistingButton_xpath);
		waitAndClickWebElement(Add_ExistingButton_xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);
	}
	
	

	@Step("{method}")
	public ReportsPage deleteReport_Automation(String string) throws Exception

	{   SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(deleteButton);
		//safeJavaScriptClick(deleteButton);
		waitAndClickWebElement(deleteButton);
		

		waitAndClickWebElement(delete_button);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return GetInstance(ReportsPage.class);

	}

	public ReportsPage acceptAll() {
		return this;
	}

	@Step("{method}")
	public ReportsPage selectNonViolatedFilter(String string)
	{SoftAssert softAssert = new SoftAssert();

		//ScrollToElement(nonviolated_xpath);
		waitForElementVisible(nonviolated_xpath);
		//moveToElement_Actions(nonviolated_xpath);
		// waitAndClickWebElement(nonviolated_xpath);
		doubleClick(nonviolated_xpath);

		waitForElementVisible(NonViolated_filter_xpath);
		softAssert.assertEquals(NonViolated_filter_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage selectViolatedFilter(String string) {
		SoftAssert softAssert = new SoftAssert();

		waitForElementVisible(violated_xpath);
		//ScrollToElement(violated_xpath);
		//ScrollDown(violated_xpath);
		//moveToElement_Actions(violated_xpath);
		//waitAndClickWebElement(nonviolated_xpath);
		doubleClick(violated_xpath);

		waitForElementVisible(Violated_filter_xpath);
		softAssert.assertEquals(Violated_filter_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage selectPendingForApprovalReport_PWC(String string)

	{SoftAssert softAssert = new SoftAssert();


		// waitAndClickWebElement(reports_Link_xpath);
		ScrollToElement(Pendingreport_Filter_xpath);
		waitForElementVisible(Pendingreport_Filter_xpath);
		System.out.println("text visible");
		waitAndClickWebElement(Pendingreport_Filter_xpath);
		// doubleClick(violated_xpath);

		waitForElementVisible(PendingForApproval_filter_xpath);
		softAssert.assertEquals(PendingForApproval_filter_xpath.getText(), string);

		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage recall_PWC(String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);
		ScrollToElement(Pendingreport_Filter_xpath);
		waitForElementVisible(Pendingreport_Filter_xpath);
		waitAndClickWebElement(Pendingreport_Filter_xpath);
		waitForElementVisible(PendingForApproval_filter_xpath);
		softAssert.assertEquals(PendingForApproval_filter_xpath.getText(), string);

		waitForElementToClickable(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		selectByVisibleText(detailedView, "Detailed view");
		waitForElementToClickable(recall_btn);
		waitAndClickWebElement(recall_btn);
		waitAndClickWebElement(ProceedRecall_xpath);
		// Alert_click().accept();
		return GetInstance(ReportsPage.class);

	}
	@Step("{method}")
	public ReportsPage exportReport(XSSFRow rowData, String exp) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);

		waitAndClickWebElement(export_link);

		waitAndClickWebElement(download);

		waitForElementVisible(mailid_xpath);
		waitAndClickWebElement(mailid_xpath);

		writeText(mailid_xpath, rowData.getCell(1).toString());
		//moveToElement_Actions(download_report);
		waitAndClickWebElement(download_report);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(),exp);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage exportReportOUP(XSSFRow rowData) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);

		waitAndClickWebElement(export_link);

		waitAndClickWebElement(download);

		waitForElementVisible(mailid_xpath);
		waitAndClickWebElement(mailid_xpath);

		writeText(mailid_xpath, rowData.getCell(1).toString());
		//moveToElement_Actions(download_report);
		waitAndClickWebElement(download_report);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		String result = SuccessMessage_Toast_xpath.getText();
		softAssert.assertTrue(result.equals("File generated successfully")||result.equals("The report link will be sent to you shortly"),"if the response is either of thse messages, then the test is failed");
		
		
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage policyExceptionReport(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);

		waitAndClickWebElement(export_link);

		waitAndClickWebElement(policyexception);
		waitForElementVisible(mailid_xpath);
		//waitAndClickWebElement(mailid_xpath);
		//
		//waitForElementVisible(FromDateinPopup_xpath);
		//FromDateinPopup_xpath.click();
		//writeText(FromDateinPopup_xpath, threeDaysBefore());

		writeText(mailid_xpath, rowData.getCell(1).toString());
		//moveToElement_Actions(download_button);
		waitAndClickWebElement(download_button);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);

	}

	public String threeDaysBefore(){
	    String threeDaysBefore = "";
	    Date date = new Date();
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);

	    cal.add(Calendar.DAY_OF_YEAR, -3);
	    Date before = cal.getTime();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
	    threeDaysBefore = formatter.format(before);
	    return threeDaysBefore;
	}

	@Step("{method}")
	public ReportsPage downloadWorkflowComments(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);
		//waitForElementInVisible(SuccessMessage_Toast_xpath);
		waitAndClickWebElement(export_link);

		waitAndClickWebElement(workflow_comments);
		waitForElementVisible(mailid_xpath);
		//waitAndClickWebElement(mailid_xpath);
		//
		writeText(mailid_xpath, rowData.getCell(1).toString());
		waitAndClickWebElement(download_button);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage recall() {
		// waitAndClickWebElement(reports_Link_xpath);
		waitForElementToClickable(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		selectByVisibleText(detailedView, "Detailed view");
		waitForElementToClickable(recall_btn);
		waitAndClickWebElement(recall_btn);
		waitAndClickWebElement(ProceedRecall_xpath);
		// Alert_click().accept();
		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public ReportsPage clickSubmit(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(submitButton);
		waitAndClickWebElement(submitButton);
		if (isElementDisplayed(CheckPolicy_popup)) {
			//moveToElement_Actions(CheckPolicy_popup_YES);

			waitAndClickWebElement(CheckPolicy_popup_YES);
		}
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage clickSave(String string) {
		SoftAssert softAssert = new SoftAssert();
		isElementDisplayed(saveButton);
		waitAndClickWebElement(saveButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		//waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage ViewExpenseInsideReport() throws Exception {
		untilPageLoadComplete();
		//isElementDisplayed(PWChamburger_Icon_Xpath);
		waitForElementVisible(PWChamburger_Icon_Xpath);
		//waitForElementToClickable(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(PWChamburger_Icon_Xpath);

		isElementDisplayed(View_Expense_InsideReport);
		safeJavaScriptClick(View_Expense_InsideReport);

		isElementDisplayed(CloseView_Link_Xpath);
		waitAndClickWebElement(CloseView_Link_Xpath);

		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage saveAssertReportOUP() throws Exception {
		untilPageLoadComplete();
		/*waitForElementVisible(reportCount);
		int beforeReportCount = Integer.parseInt(reportCount.getText());
		System.out.println("before : "+beforeReportCount);*/
		CreateReportWithMandatoryFields(ORG.OUP);
		SoftAssert softAssert = new SoftAssert();
		isElementDisplayed(saveButton);	
		waitAndClickWebElement(saveButton);
	
		untilPageLoadComplete();
		/*waitForElementVisible(reportCount);
		int afterReportCount = Integer.parseInt(reportCount.getText());
		System.out.println("after : "+afterReportCount);*/
		
		waitForElementVisible(firstReportNameXpath);
		softAssert.assertEquals(firstReportNameXpath.getText(),OUP_ExpenseOrg.timestamp);
		softAssert.assertAll();
		return GetInstance(ReportsPage.class);
	}
	
	@Step("{method}")
	public ReportsPage clickSaveReport() {
		waitAndClickWebElement(saveButton);
		return GetInstance(ReportsPage.class);
	}

	public ReportsPage CreateReportWithoutProject_PWC(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		isElementDisplayed(new_report);
		click_Actions(new_report);
		//ScrollToElement(nextButton);
		waitAndClickWebElement(nextButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return GetInstance(ReportsPage.class);

	}
	
	@Step("{method}")
	 public ReportsPage CreateReportWithOutMandatoryFields_OUP(String string) {
		SoftAssert softAssert = new SoftAssert();
		    untilPageLoadComplete();
			waitAndClickWebElement(new_report);
			
			waitAndClickWebElement(nextButton);
			waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			softAssert.assertAll();
		return GetInstance(ReportsPage.class);

		}
	
	@Step("{method}")
	 public ReportsPage imageUploadAndAssert() {
		SoftAssert softAssert = new SoftAssert();
			//File f = new File("./src/test/resources/imgData/1.png");
			((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		
			AddBill.sendKeys("./src/test/resources/imgData/2.png");
			//AddBill.sendKeys(f.getAbsolutePath());
			waitForElementVisible(SuccessMessage_Toast_xpath);
			waitForText(SuccessMessage_Toast_xpath,"Transaction attachment added successfully.");
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), "Transaction attachment added successfully.");
			softAssert.assertAll();
		return GetInstance(ReportsPage.class);
		}
		
		/** add bill for expense inside report */
	   @Step("{method}")
		public ReportsPage AddBillInsideReport_OUP() {
			imageUploadAndAssert();
		   return GetInstance(ReportsPage.class);
		}
		
		/** add bill for expense inside report */
	   @Step("{method}")
		public ReportsPage DeleteBillInsideReport_OUP() {
		   SoftAssert softAssert = new SoftAssert();
			untilPageLoadComplete();
			waitForElementVisible(DeleteExpenseBillIcon_xpath);
			waitAndClickWebElement(DeleteExpenseBillIcon_xpath);
			waitForElementToClickable(DeleteBillConfirm_xpath);
			waitAndClickWebElement(DeleteBillConfirm_xpath);
			waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), "Transaction attachment deleted successfully.");
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			softAssert.assertAll();
		   return GetInstance(ReportsPage.class);
		}

	public WebElement getText()

	{
		return SuccessMessage_Toast_xpath;

	}



	@Step("{method}")
	public ReportsPage CreateReportWithMandatoryFields(ORG org) throws Exception {
		switch (org) {

		case PWC:

			GetInstance(PWC_ReportOrg.class).CreateReportWithMandatoryFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense"),
				 	"Report created successfully.");

			break;
			
		case OUP:
			GetInstance(OUP_ExpenseOrg.class).CreateReportWithMandatoryFields_OUP("Report created successfully");
			break;

		case AUTO:


			break;

		case LANDMARK:
			break;

		default:
			break;
		}

		return GetInstance(ReportsPage.class);
	}

	@Step("{method}")
	public ReportsPage DeleteReport(ORG org) throws Exception {
		switch (org) {

		case PWC:
			GetInstance(PWC_ReportOrg.class).deleteReport("Report deleted Successfully.");
			break;
		case OUP:
			GetInstance(OUP_ExpenseOrg.class).deleteReport_OUP("Report deleted Successfully.");
			break;

		case AUTO:
			deleteReport_Automation("Report deleted Successfully.");
			break;

		case LANDMARK:
			break;

		default:
			break;
		}

		return GetInstance(ReportsPage.class);
	}


	@Step("{method}")
	public void logout() throws Exception {
		waitAndClickWebElement(hamburgerMenu_logout);
	 	waitAndClickWebElement(logoutLink);
	}
}
