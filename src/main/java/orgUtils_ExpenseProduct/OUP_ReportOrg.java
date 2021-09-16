package orgUtils_ExpenseProduct;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.EmployeeViews.CreateExpensePage;


public class OUP_ReportOrg extends TestBotElementsWrapper{


	@FindBy(xpath="//a[text()='Reports']")
	@CacheLookup
	private WebElement GotoReport_button_xpath;

	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement newReport_Button_xpath;

	/**
	 * @return the newRreport_Button_xpath
	 */
	public WebElement getNewRreport_Button_xpath() {
		return newReport_Button_xpath;
	}


	@FindBy(xpath = "//span[text()='Delete']/..")
	@CacheLookup
	private WebElement delete_button;

	/** Delete Button **/
	@FindBy(xpath = "//div[text()='Delete']")
	@CacheLookup
	private WebElement deleteButton;

	@FindBy(xpath = "//span[text()='Add New Expense']")
	@CacheLookup
	private WebElement  add_new_expenseButton;

	//@FindBy(xpath = "//span[text()='Attach Existing Expense']")
	//@FindBy(xpath="//span[text()='ATTACH EXISTING EXPENSE']")
	@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div[2]/div/div[1]/div/button[2]")
	@CacheLookup
	private WebElement add_Existing_expenseButton;
	
	@FindBy(xpath = "//button//span[text()='Proceed']/..")
//	@FindBy(xpath="//button//span[text()='PROCEED']/..")
	//@FindBy(xpath="/html/body/div[9]/div/div[1]/div/div/div[3]/button[2]")
	@CacheLookup
	private WebElement ProceedRecall_xpath;

	@FindBy(className = "check")
	@CacheLookup
	public static List<WebElement> ExistingExpense_Checkbox;

	//@FindBy(xpath = "//span[contains(text(),'Add')]/..")
	@FindBy(xpath="//button[text()='Add']")
	@CacheLookup
	private WebElement Add_ExistingButton_xpath;
	
	@FindBy(xpath="(//div/label/div[@class='check'])[2]")
	private  WebElement ExistingExpense_Checkbox_OUP;

	@FindBy(xpath = "//span[text()='Submit']/..")
	@CacheLookup
	private WebElement submitButton;

	@FindBy(xpath = "//span[text()='Submit Report Request']")
	@CacheLookup
	private WebElement CheckPolicy_popup;

	@FindBy(xpath = "//span[contains(text(),'Yes')]/..")
	@CacheLookup
	private WebElement CheckPolicy_popup_YES;

	@FindBy(xpath = "//span[text()='Attach Existing Expense']")
	@CacheLookup
	private WebElement attach_existing_expenseButton;

	@FindBy(xpath = "//div[text()='Edit']")
	@CacheLookup
	private WebElement editReport_button_xpath;

	@FindBy(xpath = "//span[text()='Save']")
	@CacheLookup
	private WebElement saveExpense;

	@FindBy(xpath = "//div[text()='Report initiated successfully.']")
	@CacheLookup
	private WebElement reportCreateText;

	@FindBy(xpath = "//button[text()='Save']")
	@CacheLookup
	private WebElement saveReportButton;

	@FindBy(xpath = "//button/span[text()='Save']/..")
	@CacheLookup
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[text()='Add Expense']")
	@CacheLookup
	private WebElement addExpenseButton;

	@FindBy(xpath = "//button/div/span[text()='Cancel']")
	@CacheLookup
	private WebElement cancelButton;

	@FindBy(xpath = "//div[text()='Select a Wallet']")
	@CacheLookup
	private WebElement Wallet_xpath;

	/** Click on Quick view in reports */
	@FindBy(xpath = "(//td/div[text()='Saved'])[1]")
	@CacheLookup
	private WebElement QuickViewReport;
	
	/** Delete report from quick view */
	@FindBy(xpath = "//div/button/span[text()='Delete']")
	//@FindBy(xpath="//*[@id=\"app\"]/div/div[5]/div[1]/div[2]/div/div[1]/div[2]/div/button[2]/span")
	private WebElement Delete_report_butotn;
	
	/** The confirm delete button xpath */
	//@FindBy(xpath = "//span[text()='Delete']/..")
	@FindBy(xpath="(//button/span[text()='Delete']/..)[2]")
	private WebElement deleteConfirm_Button_Xpath;
	
	@FindBy(xpath = "//img[@class='delete-button-icon']")
	@CacheLookup
	private WebElement DeleteBillIcon_xpath;
	
	/** The hamburger menu. */
	@FindBy(xpath = "(//div/img[@src='actions-icon.svg'])[1]")
	@CacheLookup
	private WebElement hamburgerMenu;
	
	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']//div//img")
	private WebElement hamburger_Icon_Xpath;
	////td[@class='actionColumnHoverClass']//div//img
	
	/** The expense edit action xpath */
	//@FindBy(how = How.XPATH, using = "//div[@role='presentation']/div/a")
	@FindBy(xpath="//div[text()='Edit']")
	private WebElement edit_Link_Xpath;
	
	/** The uodate expense button xpath. */
	//@FindBy(how = How.XPATH, using = "//span[text()='Update']")
	@FindBy(xpath="//button[@class='primaryButton']")
	//@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div[3]/div/div/button[2]")
	private WebElement updateExpense_Button_Xpath;
	
	/** The amount text field ID. */
	//@FindBy(id="currency_amount")
	@FindBy(xpath="//input[@id='currency_amount']")
	private WebElement amount_TextField_ID;
		
	/** The spent at text field ID. */
	//@FindBy(id="payee_merchant")
	@FindBy(xpath="//input[@id='payee_merchant']")
	private WebElement spentAt_TextField_ID;

	
	/** Edit Button in hamburger **/
	@FindBy(xpath = "//div[text()='Edit']")
	@CacheLookup
	private WebElement Edit_ButtonHamburger_xpath;
	
	/** Remove Button in hamburger **/
	@FindBy(xpath = "//div[text()='Remove']")
	@CacheLookup
	private WebElement Remove_ButtonHamburger_xpath;
	
	/** Remove confirm Button  **/
	@FindBy(xpath = "//button[text()='Yes']")
	@CacheLookup
	private WebElement RemoveConfirm_Button_xpath;
	
	/** Submit Button in hamburger **/
	@FindBy(xpath = "//div[text()='Submit']")
	@CacheLookup
	private WebElement Submit_ButtonHamburger_xpath;

	@FindBy(xpath = "//div[text()='Not Violated']")
	@CacheLookup
	private WebElement NonViolated_filter_xpath;

	@FindBy(xpath = "//div[text()='Violated']")
	@CacheLookup
	private WebElement Violated_filter_xpath;

	@FindBy(xpath = "//div[text()='Pending for Approval']")
	@CacheLookup
	private WebElement PendingForApproval_filter_xpath;
	
	@FindBy(xpath = "//div[text()='Pending at Manager']")
	@CacheLookup
	private WebElement PendingForApproval_filter_xpath_OUP;
	

	@FindBy(xpath = "//label[text()='Not Violated']/.")
	@CacheLookup
	private WebElement nonviolated_xpath;

	@FindBy(xpath = "//label[text()='Violated']/.")
	@CacheLookup
	private WebElement violated_xpath;


	//@FindBy(xpath = "//div[@class='customToast showCustomToast']")
	@FindBy(xpath = "//div[@class='customToastContent']")
	//@FindBy(xpath = "//div[@class='customToastContent']/..")
	@CacheLookup
	private WebElement SuccessMessage_Toast_xpath;
	
	@FindBy(xpath="//div[@data-tip='Copy to clipboard']")
	private List<WebElement> expenseCount;

	//@FindBy(xpath = "//input[@type='text'][@class='ReactTags__tagInputField']")
	@FindBy(xpath = "//input[@placeholder='Add Mail Id & Press Enter']")
	@CacheLookup
	private WebElement mailid_xpath;
	
	@FindBy(xpath = "(//div/input[@type='text'])[12]")
	//@FindBy(xpath="//span[text()='"+threeDaysBefore()+"']"))
	@CacheLookup
	private WebElement FromDateinPopup_xpath;
	
	@FindBy(xpath = "(//div/input[@type='text'])[13]")
	@CacheLookup
	private WebElement ToDateinPopup_xpath;


	@FindBy(xpath = "//div[text()='Detailed view']")
	@CacheLookup
	private WebElement detailedView;

	@FindBy(xpath = "//button//span[text()='Recall']/..")
	@CacheLookup
	private WebElement recall_btn;

	@FindBy(xpath = "//button[normalize-space()='New Report']")
	@CacheLookup
	private WebElement new_report;


	@FindBy(xpath="//button[text()='Next']")
	@CacheLookup
	private WebElement nextButton;
	

	/** Reports link in Homepage */
	@FindBy(xpath = "//a[@id='REPORT']")
	@CacheLookup
	private WebElement reports_Link_xpath;
	
	@FindBy(xpath="//div/button//span[text()='New Report']/..")
	private WebElement ReportCreation_xpath;
	

	@FindBy(xpath = "//div[@class = 'exportEtl']")
	@CacheLookup
	private WebElement export_link;

	@FindBy(xpath = "(//span[text()='Download'])[2]")
	@CacheLookup
	private WebElement download_report;

	@FindBy(xpath = "//div[text()='Download']")
	@CacheLookup
	private WebElement download;

	@FindBy(xpath = "//div[text()='Policy Exception Report']")
	@CacheLookup
	private WebElement policyexception;

	@FindBy(xpath = "//div[text()='Workflow Comments']")
	@CacheLookup
	private WebElement workflow_comments;

	@FindBy(xpath = "//span[text()='Download']/..")
	@CacheLookup
	private WebElement download_button;

	
	/** Uppload bill button inside report for expense **/
	@FindBy(xpath ="//div/input[@type='file']")
	@CacheLookup
	private WebElement AddBill;
	
	/** Delete bill icon in expense */
	//@FindBy(xpath="//div[@class='delete-button delete-button-edit']")
	//@FindBy(xpath="//*[@id='app']/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div[1]/img")
	@FindBy(xpath="(//div[@class='iconContainer'])[1]")
	@CacheLookup
	private WebElement DeleteExpenseBillIcon_xpath;
	
	//@FindBy(xpath="(//td[@class='tableStatusColumnClass']/..//span[@data-class='tooltipStyleClass'])[1]")
	@FindBy(xpath="//th[normalize-space()='Name']/following::td[7]")
	private WebElement firstReportNameXpath;
	
	@FindBy(xpath="//span[text()='Delete']")
	@CacheLookup
	private WebElement DeleteBillConfirm_xpath;
	
	@FindBy(xpath="//span[text()='Edit Report']")
	private WebElement editReport;

//	public ReportsPage CreateReportWithMandatoryFields_Automation(XSSFRow rowData, String string) {
//		waitAndClickWebElement(new_report);
//		waitAndClickWebElement(extrafield_xpath);
//		writeText(extrafield_xpath, rowData.getCell(3).toString());
//		NextButton();
//		waitForElementVisible(SuccessMessage_Toast_xpath);
//		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
//		return this;
//
//	}

	// public ReportsPage CreateReportWithMandatoryFields_OUP(XSSFRow rowData,
	// String string) throws Exception {
	// waitAndClickWebElement(new_report);
	// AddProject_OUP(excelUtils.getRowDataWithSheetName(1, "Expense_OUP"));
	// 
	// NextButton();
	// waitForElementVisible(SuccessMessage_Toast_xpath);
	// softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
	// return this;
	//
	// }

//	public void NextButton() {
//		ScrollToElement(nextButton);
//		waitAndClickWebElement(nextButton);
//	}
	
	@Step("{method}")
	public OUP_ReportOrg goto_Report_Creation_Page() {
        untilPageLoadComplete();
		waitAndClickWebElement(reports_Link_xpath);
		waitForElementVisible(ReportCreation_xpath);
		waitAndClickWebElement(ReportCreation_xpath);
		return GetInstance(OUP_ReportOrg.class);
	}
	
	
	
	@Step("{method}")
	public CreateExpensePage clickAddExpense() {

		waitAndClickWebElement(add_new_expenseButton);
		return GetInstance(CreateExpensePage.class);

	}

	@FindBy(xpath="//div/label[text()='Saved']")
	@CacheLookup
	private WebElement SavedReport_Filter_xpath_OUP;

	@Step("{method}")
	public OUP_ReportOrg EditReportOUP() throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(GotoReport_button_xpath);
        waitAndClickWebElement(GotoReport_button_xpath);

        //moveToElement_Actions(ReportsPage.SavedReport_Filter_xpath_OUP);
		waitForElementVisible(SavedReport_Filter_xpath_OUP);
		waitAndClickWebElement(SavedReport_Filter_xpath_OUP);
         waitForElementVisible(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
		waitForElementVisible(Edit_ButtonHamburger_xpath);
		//safeJavaScriptClick(Edit_ButtonHamburger_xpath);
		waitAndClickWebElement(Edit_ButtonHamburger_xpath);
		return this;

	}
	
	@Step("{method}")
	public OUP_ReportOrg EditReport_OUP() throws Exception {
		untilPageLoadComplete();
        /*waitForElementVisible(hamburgerMenu);
		waitAndClickWebElement(hamburgerMenu);*/
		//ScrollToElement(hamburger_Icon_Xpath);
		isElementDisplayed(hamburger_Icon_Xpath);
		ScrollToElement(hamburger_Icon_Xpath);
		safeJavaScriptClick(hamburger_Icon_Xpath);

		waitForElementVisible(Edit_ButtonHamburger_xpath);
		//safeJavaScriptClick(Edit_ButtonHamburger_xpath);
		safeJavaScriptClick(Edit_ButtonHamburger_xpath);
		return this;

	}
	
	@Step("{method}")
	public OUP_ReportOrg RemoveExpense() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(hamburger_Icon_Xpath);
		ScrollToElement(hamburger_Icon_Xpath);
		waitForElementToClickable(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);

		waitAndClickWebElement(edit_Link_Xpath);
		isElementDisplayed(hamburger_Icon_Xpath);
		ScrollToElement(hamburger_Icon_Xpath);
		waitForElementToClickable(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
		waitAndClickWebElement(Remove_ButtonHamburger_xpath);

		waitForElementVisible(RemoveConfirm_Button_xpath);
		specialClick(RemoveConfirm_Button_xpath);
		try {
			expenseCount.get(0).getText();
		} catch (Exception e) {
			softAssert.assertTrue(true);
		}
		
		
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return this;
		

	}
	
	
	@Step("{method}")
	public OUP_ReportOrg SubmitReport_Automation(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
        waitForElementVisible(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
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
		return this;

	}
	
	@Step("{method}")
	public OUP_ReportOrg goto_Report_Page() {

		waitAndClickWebElement(reports_Link_xpath);
		if(getThreadSafeDriver().getCurrentUrl().contains("uat"))
			getThreadSafeDriver().navigate().to("https://expense.uat.happay.in/report");
		else if(getThreadSafeDriver().getCurrentUrl().contains("prep"))
			getThreadSafeDriver().navigate().to("https://expense-prep.happay.in/report");
		return this;
	}
	
	@Step("{method}")
	public OUP_ReportOrg SubmitReport_OUP(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
        waitForElementVisible(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
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
	       // moveToElement_Actions(CheckPolicy_popup_YES);
			waitAndClickWebElement(CheckPolicy_popup_YES);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			
		}
		
		softAssert.assertAll();
		
		return this;

	}
	
	@Step("{method}")
	public OUP_ReportOrg FilterSavedReport() {
		untilPageLoadComplete();
		//moveToElement_Actions(SavedReport_Filter_xpath_OUP);
		waitForElementVisible(SavedReport_Filter_xpath_OUP);
		waitAndClickWebElement(SavedReport_Filter_xpath_OUP);
		return this;
	}
	
	/** The method to click edit link of an expense in OUP org 
	 * @throws Exception */
	@Step("{method}")
	public OUP_ReportOrg clickExpenseEdit_OUP() throws Exception {
		//ScrollToElement(hamburger_Icon_Xpath);
		specialClick(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
		waitForElementToClickable(edit_Link_Xpath);
		//safeJavaScriptClick(edit_Link_Xpath);
		waitAndClickWebElement(edit_Link_Xpath);
		return this;
	}
	
	/** The method to edit expense and delete bill of expense inside report */
	@Step("{method}")
	public OUP_ReportOrg DeleteBill_OUP(String string) {
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
		return this;
	}

	// The method to click update
	@Step("{method}")
	public OUP_ReportOrg clickUpdate(String string) {
		SoftAssert softAssert = new SoftAssert();
		//waitForElementToClickable(updateExpense_Button_Xpath);
		//waitAndClickWebElement(updateExpense_Button_Xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForElementToHaveText(SuccessMessage_Toast_xpath, string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return this;
	}

	/** The method to edit expense with native fields */
	@Step("{method}")
	public OUP_ReportOrg editTxnNativeField_OUP(XSSFRow rowData) {
		untilPageLoadComplete();
		//clearText(amount_TextField_ID);
		 String b = Keys.BACK_SPACE.toString();
	       // amount.sendKeys(b + b + b + b + b + b + b + b + b + b);
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, b+b+b+b+b+b+b+b+b);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		writeText(spentAt_TextField_ID, b+b+b+b+b+b+b+b+b);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		
		return this;
	}

	@Step("{method}")
	public OUP_ReportOrg Add_Existing_Expense() {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(add_Existing_expenseButton);
		isElementDisplayed(ExistingExpense_Checkbox_OUP);
		waitForElementVisible(ExistingExpense_Checkbox_OUP);
		waitAndClickWebElement(ExistingExpense_Checkbox_OUP);
		isElementEnabled(Add_ExistingButton_xpath);
		waitAndClickWebElement(Add_ExistingButton_xpath);
		waitForElementVisible(expenseCount.get(0));
		softAssert.assertTrue(expenseCount.size()>0,"the size of the list of expense should be > 0");
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	

	@Step("{method}")
	public OUP_ReportOrg deleteReport_Automation(String string) throws Exception

	{   SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
		waitForElementVisible(deleteButton);
		//safeJavaScriptClick(deleteButton);
		waitAndClickWebElement(deleteButton);
		
		waitAndClickWebElement(delete_button);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return this;

	}

	public OUP_ReportOrg acceptAll() {
		return this;
	}

	@Step("{method}")
	public OUP_ReportOrg selectNonViolatedFilter(String string)
	{SoftAssert softAssert = new SoftAssert();
		//ScrollToElement(nonviolated_xpath);
		waitForElementVisible(nonviolated_xpath);
		//moveToElement_Actions(nonviolated_xpath);
		// waitAndClickWebElement(nonviolated_xpath);
		doubleClick(nonviolated_xpath);
		waitForElementVisible(NonViolated_filter_xpath);
		softAssert.assertEquals(NonViolated_filter_xpath.getText(), string);
		softAssert.assertAll();
		return this;

	}

	@Step("{method}")
	public OUP_ReportOrg selectViolatedFilter(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(violated_xpath);
		//ScrollToElement(violated_xpath);
		ScrollDown(violated_xpath);
		//moveToElement_Actions(violated_xpath);
		//waitAndClickWebElement(nonviolated_xpath);
		doubleClick(violated_xpath);
		waitForElementVisible(Violated_filter_xpath);
		softAssert.assertEquals(Violated_filter_xpath.getText(), string);
		softAssert.assertAll();
		return this;

	}

	@Step("{method}")
	public OUP_ReportOrg selectPendingForApprovalReport_OUP(String string)

	{SoftAssert softAssert = new SoftAssert();

		// waitAndClickWebElement(reports_Link_xpath);
		ScrollToElement(Pendingreport_Filter_xpath);
		waitForElementVisible(Pendingreport_Filter_xpath);
		System.out.println("text visible");
		waitAndClickWebElement(Pendingreport_Filter_xpath);
		// doubleClick(violated_xpath);
		waitForElementVisible(PendingForApproval_filter_xpath);
		softAssert.assertEquals(PendingForApproval_filter_xpath.getText(), string);

		return this;

	}

	@FindBy(xpath = "//div/label[text()='Pending for Approval']")
	@CacheLookup
	private WebElement Pendingreport_Filter_xpath;

	@Step("{method}")
	public OUP_ReportOrg recall_OUP(String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);
		ScrollToElement(Pendingreport_Filter_xpath);
		waitForElementVisible(Pendingreport_Filter_xpath);
		waitAndClickWebElement(Pendingreport_Filter_xpath);
		waitForElementVisible(PendingForApproval_filter_xpath);
		softAssert.assertEquals(PendingForApproval_filter_xpath.getText(), string);

		waitForElementToClickable(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
		selectByVisibleText(detailedView, "Detailed view");
		waitForElementToClickable(recall_btn);
		waitAndClickWebElement(recall_btn);
		waitAndClickWebElement(ProceedRecall_xpath);
		// Alert_click().accept();
		return this;

	}

	@Step("{method}")
	public OUP_ReportOrg exportReport(XSSFRow rowData, String string) {
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
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return this;

	}

	@Step("{method}")
	public OUP_ReportOrg policyExceptionReport(XSSFRow rowData, String string) {
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
		return this;

	}
	
	// The method to click update
		@Step("{method}")
		public OUP_ReportOrg clickUpdate_OUP(String string) throws Exception {
			SoftAssert softAssert = new SoftAssert();
			waitAndClickWebElement(updateExpense_Button_Xpath);
			waitForElementVisible(SuccessMessage_Toast_xpath);
			waitForText(SuccessMessage_Toast_xpath,string);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			softAssert.assertAll();
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			return this;
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
	public OUP_ReportOrg downloadWorkflowComments(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(reports_Link_xpath);
		
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
		return this;
	}

	@Step("{method}")
	public OUP_ReportOrg recall() {
		// waitAndClickWebElement(reports_Link_xpath);
		waitForElementToClickable(hamburger_Icon_Xpath);
		waitAndClickWebElement(hamburger_Icon_Xpath);
		selectByVisibleText(detailedView, "Detailed view");
		waitForElementToClickable(recall_btn);
		waitAndClickWebElement(recall_btn);
		waitAndClickWebElement(ProceedRecall_xpath);
		// Alert_click().accept();
		return this;

	}

	@Step("{method}")
	public OUP_ReportOrg clickSubmit(String string) {
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
		return this;
	}

	@Step("{method}")
	public OUP_ReportOrg clickSaveWithAssertion() {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(saveReportButton);
		waitAndClickWebElement(saveReportButton);
		wait.until(ExpectedConditions.urlContains("https://expense.uat.happay.in/report"));
		untilPageLoadComplete();
		waitForElementVisible(firstReportNameXpath);
		System.out.println("Actual "+firstReportNameXpath.getText());
		System.out.println("Expected "+OUP_ExpenseOrg.getTimestamp());
		softAssert.assertEquals(firstReportNameXpath.getText(), OUP_ExpenseOrg.getTimestamp());
		softAssert.assertAll();
		return this;
	}
	@Step("{method}")
	public OUP_ReportOrg clickSave() {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(saveReportButton);
		waitAndClickWebElement(saveReportButton);
		
		return this;
	}
	
	@Step("{method}")
	public OUP_ReportOrg assertFirstReport()
	{
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(firstReportNameXpath);
		System.out.println("Actual "+firstReportNameXpath.getText());
		System.out.println("Expected "+OUP_ExpenseOrg.getTimestamp());
		softAssert.assertEquals(firstReportNameXpath.getText(), OUP_ExpenseOrg.getTimestamp());
		softAssert.assertAll();
		return this;
	}
	
	


	public OUP_ReportOrg CreateReportWithoutProject_OUP(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(new_report);
		ScrollToElement(nextButton);
		waitAndClickWebElement(nextButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		return this;

	}
	
	@Step("{method}")
	 public OUP_ReportOrg CreateReportWithOutMandatoryFields_OUP(String string) {
		SoftAssert softAssert = new SoftAssert();
		    untilPageLoadComplete();
			waitAndClickWebElement(new_report);
			
			waitAndClickWebElement(nextButton);
			waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			softAssert.assertAll();
			return this;

		}
	
	@Step("{method}")
	 public OUP_ReportOrg imageUploadAndAssert() {
		SoftAssert softAssert = new SoftAssert();
			//File f = new File("./src/test/resources/imgData/1.png");
			((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
			waitForElementVisible(AddBill);
		//	AddBill.sendKeys("./src/test/resources/imgData/2.png");
			AddBill.sendKeys("/Users/ltuser/Downloads/Screenshot 2021-08-25 at 9.50.47 PM.png");
			//AddBill.sendKeys(f.getAbsolutePath());
			waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), "Transaction attachment added successfully.");
			softAssert.assertAll();
			return this;
		}
		
		/** add bill for expense inside report */
	   @Step("{method}")
		public OUP_ReportOrg AddBillInsideReport_OUP() {
			imageUploadAndAssert();
			
			return this;
		}
		
		/** add bill for expense inside report */
	   @Step("{method}")
		public OUP_ReportOrg DeleteBillInsideReport_OUP() {
		   SoftAssert softAssert = new SoftAssert();
			
		    untilPageLoadComplete();
			waitForElementVisible(DeleteExpenseBillIcon_xpath);
			waitAndClickWebElement(DeleteExpenseBillIcon_xpath);
			waitForElementToClickable(DeleteBillConfirm_xpath);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			waitAndClickWebElement(DeleteBillConfirm_xpath);

			waitForElementVisible(SuccessMessage_Toast_xpath);
			waitForElementToHaveText(SuccessMessage_Toast_xpath, "Transaction attachment deleted successfully.");
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), "Transaction attachment deleted successfully.");
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			
			softAssert.assertAll();
			return this;
		}
	 
	public WebElement getText()

	{
		return SuccessMessage_Toast_xpath;

	}

	
	
	@Step("{method}")
	public OUP_ReportOrg CreateReportWithMandatoryFields(ORG org) throws Exception {
		switch (org) {

		case PWC:

			GetInstance(PWC_ReportOrg.class).CreateReportWithMandatoryFields_PWC(excelUtils.getRowDataWithSheetName(1, "Expense"),
				 	"Report created successfully.");

			break;
			
		case OUP:
            GetInstance(OUP_ExpenseOrg.class).CreateReportWithMandatoryFields_OUP("Report created successfully");
			break;

		case AUTO:
			GetInstance(PWC_ReportOrg.class).CreateReportWithMandatoryFields_Automation(excelUtils.getRowDataWithSheetName(1, "Expense"),
					"Report created successfully");

			break;

		case LANDMARK:
			break;

		default:
			break;
		}

		return this;
	}

	@Step("{method}")
	public OUP_ReportOrg DeleteReport(ORG org) throws Exception {
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

		return this;
	}


	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElements.class).logout();
		/*waitAndClickWebElement(CommonPageElements.hamburgerMenu);
	 	waitAndClickWebElement(CommonPageElements.logoutLink);*/
		
	}
}
