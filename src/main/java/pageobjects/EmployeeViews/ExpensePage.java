package pageobjects.EmployeeViews;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonPageElements;

/**
 * The Class ExpensePagePWC.
 */


public class ExpensePage extends CreateExpensePage{

	/** The add expense button xpath. */
	@FindBy(xpath="//button[text()='Add Expense']")
	private WebElement addExpense_Button_Xpath;

	@FindBy(xpath="//div[contains(text(),'Create Expense')]")
	private WebElement CreateExpense_Text;

	/** The Message dialog xpath transaction updated successfully. */
	 @FindBy(xpath = "//div[@class='customToastContent']")
	private WebElement SuccessMessageEdit_Toast_xpath;
	 
	 /** Txn success toast Message icon.. */
		@FindBy(xpath = "//img[@src='/assets/images/toast-success.svg']")
		@CacheLookup
		private WebElement Expense_Success_ToastMessage_Icon_xpath;
		
		 /** Txn failure toast Message icon.. */
		@FindBy(xpath = "//img[@src='/assets/images/toast-error.svg']")
		@CacheLookup
		private WebElement Expense_Failure_ToastMessage_Icon_xpath;

	/** The Message dialog xpath transaction deleted successfully. */
	@FindBy(how = How.XPATH, using = "//span[text()='Transaction deleted successfully.']")
	private WebElement SuccessMessageDeleted_Toast_xpath;

	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
	private List<WebElement> hamburger_Icon_Xpath;
	
	@FindBy(xpath="(//div[@class='actionBtnContainer'])[1]")
	private WebElement Copyhamburger_Icon_Xpath;
	
	//input[@type='text' and @placeholder= 'Search'])[3]
	@FindBy(xpath="(//input[@type='text' and @placeholder= 'Search'])[3]")
	private WebElement TxnType_Filter_SearchBox_Xpath;
	//span[text()='Domestic Travel: Com...']
	
	@FindBy(xpath="//span[text()='Domestic Travel: Com...']")
	private WebElement DomesticTravel_value_Xpath_TxnTypeFilter;
	
	
	@FindBy(xpath="//th[@class = 'sort-column' and text()='Creation Date (IST)']")
	private WebElement CreationDate_ColumnSort_Xpath;
	
	
	@FindBy(xpath="//input[@type='text' and @placeholder='e.g. -Transaction ID']")
	private WebElement TxnIdFilter_SearchBox_Xpath;

	/** The split action xpath */
	// @FindBy(how = How.XPATH, using = "//div[@role='presentation']/div/div[2]")
	@FindBy(xpath = "//div/div/div[text()='Split']")
	private WebElement split_Link_Xpath;

	@FindBy(xpath="//div[contains(text(),'Edit Expense')]")
	private WebElement EditExpenseScreen;

	/** Delete Expense from quick view */
	//@FindBy(xpath = "//div/button/span[text()='DELETE']")
	@FindBy(xpath="//span[text()='Delete']")
	private WebElement Delete_expense_button;

	/**Delete Expense from quick View */
	//@FindBy(xpath = "//div/button/span[text()='Delete']")
	@FindBy(xpath = "(//button/div/span[text()='Delete'])[1]")
	private WebElement Delete_expense_butotn;
	
	//button[@type='button' and text()='Delete']
	/**Delete Expense from quick View */
	//@FindBy(xpath = "//div/button/span[text()='Delete']")
	@FindBy(xpath = "//button[@type='button' and text()='Delete']")
	private WebElement Delete__expense_conformation_butotn;
	
	@FindBy(xpath = "//button[@class='primaryButton']//span[contains(text(),'Delete')]")
	private WebElement Delete_button;
	
	
	@FindBy(xpath = "//button[@type='button' and text()='Delete']")
	private WebElement DeleteConfirmation_Xpath_button;

	/** Delete Expense from quick view */
	//@FindBy(xpath = "//div/span/div/div[text()='Delete']")
	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	private WebElement DeleteHamburger_expense_butotn;

	/** The split amount name */
	//@FindBy(how = How.NAME, using = "randomname")
	@FindBy(xpath="(//input[@placeholder='Enter Amount'])[1]")
	private WebElement splitAmount_Input_Name;
	
	/** The split category */
	@FindBy(xpath="(//input[@placeholder='Select Category'])[1]")
	private WebElement initialCategory_Input_Field;
	
	/** The split category search box */
	@FindBy(xpath="//input[@placeholder='Enter minimum three characters']")
	private WebElement category_search_box_xpath;
	
	/** The split primary category */
	@FindBy(xpath="(//li[@role='menuitem'])[1]")
	private WebElement primary_category_xpath;
	
	/** The secondary category  */
	@FindBy(xpath="(//li[@role='menuitem'])[2]")
	private WebElement secondary_category_xpath;
	
	/** The split category */
	@FindBy(xpath="(//input[@placeholder='Select Category'])[2]")
	private WebElement finalCategory_Input_Field;

	/** The amount text field ID. */
	// @FindBy(id = "currency_amount")
	@FindBy(xpath = "//input[@id='currency_amount']")
	private WebElement amount_TextField_ID;

	/** The spent at text field ID. */
	@FindBy(xpath="//input[@id='payee_merchant']")
	private WebElement spentAt_TextField_Xpath;

	/** The done button xpath */
	@FindBy(how = How.XPATH, using = "//button[@type='button' and text()='Done']")
	private WebElement done_Button_Xpath;

	/** The confirm delete button xpath */
	 @FindBy(xpath="//button[@type='button' and text()='Delete']")
	private WebElement deleteConfirmQuick_Button_Xpath;

	 /** The confirm delete button xpath */
	 @FindBy(xpath="//span[text()='Delete']/..")
	//@FindBy(xpath = "//span[text()='Delete']/..")
	private WebElement deleteConfirmHamburger_Button_Xpath;

	 /*Hamburger Delete Button */
	// @FindBy(xpath = "//div[text()='Delete']")
	 @FindBy(xpath = "//div[text()='Delete']")
	 private WebElement deleteHamburger_button;

	/** The column management img xpath */
	@FindBy(how = How.XPATH, using = "//div[div[@class='exportEtl']]/div[4]/span/img")
	private WebElement columnManagement_Img_Xpath;

	/** The city column checkbox id */
	@FindBy(how = How.ID, using = "city_6")
	private WebElement cityColumn_Input_Id;

	/** The city group column checkbox id */
	@FindBy(how = How.ID, using = "city_group_7")
	private WebElement cityGroupColumn_Input_Id;

	/** The export button xpath */
	// @FindBy(how = How.XPATH, using = "//div[@class='exportEtl']/div/span/img")
	@FindBy(xpath = "//span[@data-tip='Export']")
	private WebElement export_Button_Xpath;

	/** The download button xpath */
	@FindBy(how = How.XPATH, using = "//button[@type='button' and text()='Download']")
	private WebElement download_Button_Xpath;

	/** The confirm download button class locator */
	@FindBy(how = How.CLASS_NAME, using = "primaryButton")
	private  List<WebElement> download_Button_Class;

	@FindBy(xpath = "(//span[text()='Download'])[2]")
	private WebElement download_expense_xpath;

	/** Open the Expense in quick view */
	@FindBy(xpath = "//*[@id='bootstrapTable']/div/div[1]/div[2]/table/tbody/tr[1]/td[8]/div")
	private WebElement quickview;
	
	@FindBy(xpath = "//td/div[text()='Unreported']")
	private List<WebElement> quickviewlist;

	@FindBy(xpath="//tr/td[@tabindex='1']")
	private WebElement Quickview;
	
	@FindBy(xpath="//span[@data-tooltip= 'Delete']")
	private WebElement DeleteIconOnQuickView_Xpath;

	/** Open the Expense in quick view PWC */
	@FindBy(xpath = "//td/div[text()=' Pending submission']")
	private WebElement quickview_PWC;

	/** Finance in Homepage */
	@FindBy(xpath = "//a[text()='ExpenseS']")
	private WebElement GotoExpense_button_xpath;

	/** The expense edit action xpath */
	//@FindBy(xpath = "//span/div/div[text()='Edit']")
	@FindBy(xpath = "//div[text()='Edit']")
	private WebElement edit_Link_Xpath;
	
	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	private WebElement edit_Xpath;

	/** PWC Hamburger icon */
	@FindBy(xpath = "(//div[@class='actionBtnContainer'])[1]")
	private WebElement PWChamburger_Icon_Xpath;
	//th[@class='sort-column' and text()='Creation Date (IST)']
	
	/** Creatoin Date Sort COlumn Xpath */
	@FindBy(xpath = "//th[@class='sort-column' and text()='Creation Date (IST)']")
	private WebElement Creation_Date_Column_Xpath;
	
	/*
	 * Close icon in expense creation page Xpath
	 */
	@FindBy(xpath = "(//img[@class='crossdisplay' and @src='/cross.svg'])[1]")
	private WebElement CrossIcon_xpath;

	@FindBy(xpath = "//img[@class='delete-button-icon']")
	private WebElement DeleteBillIcon_xpath;

/** Transaction type */

	@FindBy(how = How.NAME, using = "randomname")
	private WebElement Txntype_xpath;

	@FindBy(xpath = "//input[@id='nonPaperSearch']")
	private WebElement Txnsearch_xpath;

	@FindBy(xpath = "//span[@role='menuitem']//div ")
	private WebElement TxnSelect_xpath;

	@FindBy(xpath = "//tr[1]//td[9]//div[1]//span[1]")
	private WebElement VerifycopyExpense_pendingList_xpath;

	@FindBy(xpath = "//div[@class='flex-container']")
	private WebElement Copy_Expense_Text;

	@FindBy(xpath = "(//div[@data-tip='Copy to clipboard'])[1]")
	private WebElement Copy_Expense_TxnId;

	@FindBy(xpath = "(//div[@data-tip='Copy to clipboard'])[2]")
	private WebElement Expense_TxnId;

	/** Click on Home menu */
	@FindBy(xpath="//div[text()='HOME']")
	private WebElement Home_Button_xpath;

	@FindBy(xpath = "//span/div/div[text()='Edit']")
	private WebElement edit_Link_Xpath1;

	@FindBy(how = How.XPATH, using = "//button[@type='button' and text()='Update']")
	private WebElement updateExpense_Button_Xpath;

	@FindBy(xpath="//div/input[@id='payee_merchant']")
	private WebElement spentAt_TextField_ID;

	@FindBy(xpath="//div/input[@id='description']")
	private WebElement description_TextField_ID;

	//@FindBy(xpath = "//span/div/div[text()='View']")
	@FindBy(xpath = "(//div/div/div[text()='View'])[1]")
	private WebElement View_Link_Xpath;
	
	@FindBy(xpath = "//div[contains(text(),'View')]")
	private WebElement View_Xpath;

	/** The close expense View action xpath */
	@FindBy(xpath = "//span[@data-tooltip = 'Close']")
	private WebElement CloseView_Link_Xpath;

	/** The category select field xpath */
	@FindBy(xpath = "//input[@value='Select Category']")
	private WebElement category_Select_Xpath_PWC;

	/** The travel category select dropdown xpath */
	@FindBy(how = How.XPATH, using = "//li[@data-name='Travel']")
	private WebElement travel_Dropdown_Xpath;

	/** The save expense button xpath. */
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveExpense_Button_Xpath;

	/** Verify the image uploaded as bill or not */
	//@FindBy(xpath = "//div/span/span[text()=' Upload More Invoices ']")
	@FindBy(xpath="//span[text()='Upload More Invoices']")
	private WebElement FileUpload_verify_xpath;

	/** Upload file button */
	@FindBy(xpath = "//div/input[@id='myFile']")
	private WebElement Uploadfile_id;

	/** The Message dialog xpath for column management */
	@FindBy(how = How.XPATH, using = "//span[text()='Saved successfully']")
	private WebElement columnSaved_Toast_xpath;

	/** The Message dialog xpath for export */
	@FindBy(how = How.XPATH, using = "//span[text()='The report link will be sent to you shortly']")
	private WebElement export_Toast_Xpath;

	@FindBy(xpath ="//div[@class='customToast showCustomToast']")
	private WebElement Toast_xpath;

	/** The multiselect extras field name locator */
	@FindBy(how = How.NAME, using = "TXN_Multiselect_EF")
	private WebElement multiselect_Input_Name;

	/** The multiselect option 1 xpath */
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	private List<WebElement> multiselect_Options_Xpath;

	/** The ifsc extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_IFSC_EF")
	private WebElement ifsc_Input_Name;

	/** Amount field error message */
	@FindBy(xpath = "//div[text()='Please Enter Amount']")
	private WebElement Amount_error_xpath;

	/** The expense type name locator */
	@FindBy(how = How.NAME, using = "randomname")
	private WebElement expenseType_Input_Name;

	/** The mileage type xpath */
	@FindBy(how = How.XPATH, using = "//div[@id='searchableSelectItem']/div/div[4]")
	private WebElement mileageType_Option_Xpath;

	/** The transaction type dependent dropdown ef name locator */
	@FindBy(how = How.NAME, using = "TXN_TxnTypeDepDropdown_EF")
	private WebElement txnTypeDepDropdown_Input_Name;


	/** The transaction type dependent dropdown ef option xpath */
	@FindBy(how = How.XPATH, using = "//div[@id='searchableSelectItem']/div/div[3]")
	private WebElement txnTypeDepDropdown_Option_Xapth;

	/** The transaction type dependent number ef name locator */
	@FindBy(how = How.NAME, using = "Txn_TxnTypeDepNumberDistance_EF")
	private WebElement txnTypeDepNumber_Input_Name;


	/** The dropdown extra field name locator */
	@FindBy(how = How.NAME, using = "TXN_Dropdown_EF")
	private WebElement dropdown_Input_Name;

	/** The dropdown value field xpath */
	@FindBy(how = How.XPATH, using = "//div/span[text()='1']")
	private WebElement DropdownValue_Input_Xpath;

	/** The file type extra field xpath */
	@FindBy(how = How.XPATH, using = "//div[text()='TXN_File_EF']/input")
	private WebElement File_UploadButton_Xpath;

	/** The attached file xpath */
	@FindBy(how = How.XPATH, using = "//div[@class='attachmentsLayout']/div[2]/div/div[1]/span/div")
	private WebElement uploadedImageCheck_Button_Xpath;

	/** The expense edit action xpath */
	@FindBy(xpath = "//div/img[@class='icon-list-item']")
	private List<WebElement> ListofBills_Xpath;
	
	@FindBy(xpath="//input[@id='Amount-EnterAmount-undefined-32762']")
	private WebElement secondAmount_xpath;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div")
	private WebElement AmountLeft_xpath;
	
	@FindBy(xpath = "//div[contains(text(),'All Expenses')]")
	private WebElement AllExpenses_xpath;

	@FindBy(xpath="//div[text()='Upload More Invoices']")
	private WebElement Uploadmoreinvoice_Auto;

	/** The Transaction ID Field in Filter side in expense screen*/
	@FindBy(xpath = "//input[@placeholder='e.g. -Transaction ID']")
	private WebElement TransactionID_Xpath ;
	
	@FindBy(xpath = "//tr[1]//td[8]//div[1]//span[1]")
	private WebElement Description_xpath;
	
	@FindBy(xpath = "//div[@class='scrollablePortion']//div//div//div[contains(text(),'SPLIT')]")
	private WebElement TxnType_xpath;
	
	@FindBy(xpath = "//div[@class='flex-container']")
	private WebElement PageTitle;
	
	@FindBy(xpath = "//div[contains(text(),'Automation')]")
	private WebElement SpentAtInScreen_xpath_pwc;
	
	@FindBy(xpath = "//div[contains(text(),'1.0')]")
	private WebElement Amount_xpath_pwc;
	
	@FindBy(xpath = "//div[contains(text(),'12.0')]")
	private WebElement Amount_xpath;
	

	@Step("{method}")
	public ExpensePage gotoExpense() throws Exception {
		waitForElementToClickable(GotoExpense_button_xpath);
		//
		// waitAndClickWebElement(GotoExpense_button_xpath);
		waitAndClickWebElement(GotoExpense_button_xpath);
		//return this;
		return GetInstance(ExpensePage.class);

	}


	@Step("{method}")
	public CreateExpensePage clickAddExpens() throws Exception {
		waitForElementVisible(addExpense_Button_Xpath);
		waitAndClickWebElement(addExpense_Button_Xpath);
		waitForText(CreateExpense_Text,"CREATE EXPENSE");
		return GetInstance(CreateExpensePage.class);

	}

	@Step("{method}")
	public ExpensePage SaveExpense_VerifyToast(String string) throws Exception {
	 SoftAssert softAssert = new SoftAssert();
	 waitForElementVisible(Expense_Success_ToastMessage_Icon_xpath);
	 softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
	 System.out.println("ToastMessage is:  "+SuccessMessageEdit_Toast_xpath.getText());
	 waitForElementInVisible(Expense_Success_ToastMessage_Icon_xpath);
	
	 softAssert.assertAll();
	 return GetInstance(ExpensePage.class);
	}
	
	
	@Step("{method}")
	public ExpensePage createTxnWithNativeFields(XSSFRow rowData) throws Exception {
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		waitForElementVisible(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		//moveToElement_Actions(category_Select_Xpath);
		waitAndClickWebElement(category_Select_Xpath_PWC);
		waitForElementVisible(travel_Dropdown_Xpath);
		waitAndClickWebElement(travel_Dropdown_Xpath);
		return GetInstance(ExpensePage.class);
	}




	/** The method to click save */
	@Step("{method}")
	public ExpensePage clickSave() {
		waitAndClickWebElement(saveExpense_Button_Xpath);
		return GetInstance(ExpensePage.class);
	}

	/*
	 * public ExpensePage createTxnWithNativeFields(Organisation org) {
	 *
	 *
	 * Case is PWC : createTxnWithMissingAmountFields_PWC Case is OUP:
	 * createTxnWithMissingAmountFields_PWC }
	 *
	 *
	 */

	/*
	 * public ExpensePage fillTransactionDetailsWithCategory(CategoryOptions
	 * categoryData) throws Exception {
	 *
	 * //fillmandatorydata //selectCate //filldependentcategoryfields return null;
	 *
	 *
	 * }
	 */

	// Bangalore (KA), India
	// public ExpensePage_PWC city(String textToSelect) {
	// try {
	// WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
	// wait.until(ExpectedConditions.visibilityOf(autoOptions));
	//
	// List<WebElement> optionsToSelect =
	// autoOptions.findElements(By.tagName("li"));
	// for(WebElement option : optionsToSelect){
	// if(option.getText().equals(textToSelect)) {
	// System.out.println("Trying to select: "+textToSelect);
	// option.click();
	// break;
	// }
	// }
	//
	// } catch (NoSuchElementException e) {
	// System.out.println(e.getStackTrace());
	// }
	// catch (Exception e) {
	// System.out.println(e.getStackTrace());
	// }
	// }
	//
//	@Step("{method}")
//	public ExpensePage imageUploadAndAssert() {
//		SoftAssert softAssert = new SoftAssert();
//		File f = new File("./src/test/resources/imgData/1.png");
//		Uploadfile_id.sendKeys(f.getAbsolutePath());
//		waitForText(FileUpload_verify_xpath,"Upload More Invoices");
//		softAssert.assertEquals(FileUpload_verify_xpath.getText(), "Upload More Invoices");
//		// softAssert.assertEquals(uploadedImageCheck_button_xpath.getText(),
//		// "Files-1");
//		softAssert.assertAll();
//		//return this;
//		return GetInstance(ExpensePage.class);
//	}


	public ExpensePage HomeMenu() {
		waitAndClickWebElement(Home_Button_xpath);
		return GetInstance(ExpensePage.class);

	}


	@Step("{method}")
	public ExpensePage clickUpdate_PWC(String string) throws Exception {
		 SoftAssert softAssert = new SoftAssert();
		waitForElementToClickable(updateExpense_Button_Xpath);
		// waitAndClickWebElement(updateExpense_Button_Xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		//waitForText(SuccessMessageEdit_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	/** The method to return Amount error message */
	@Step("{method}")
	public WebElement Amount_error_message() {
		isElementDisplayed(Amount_error_xpath);
		return Amount_error_xpath;
	}

	/** Spent at error message */
	@Step("{method}")
	public WebElement SpentAt_error_message() {
		isElementDisplayed(SuccessMessageEdit_Toast_xpath);
		return SuccessMessageEdit_Toast_xpath;
	}

	/** The method to return success toast message */
	@Step("{method}")
	public WebElement getExpense_initiated_successfully() {
		wait.until(ExpectedConditions.visibilityOf(SuccessMessageEdit_Toast_xpath));
		isElementDisplayed(SuccessMessageEdit_Toast_xpath);
		return SuccessMessageEdit_Toast_xpath;
	}


	/** The method to return success toast message */
	@Step("{method}")
	public WebElement VehicleExpense_initiated_successfully() {
		waitForElementVisible(Toast_xpath);
		isElementDisplayed(Toast_xpath);
		return Toast_xpath;
	}

	/** The method to return success toast message for edit */
	@Step("{method}")
	public WebElement getExpense_updated_successfully() {
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		isElementDisplayed(SuccessMessageEdit_Toast_xpath);
		return SuccessMessageEdit_Toast_xpath;
	}

	/** The method to return success toast message for deletet */
	@Step("{method}")
	public WebElement getExpense_deleted_successfully() {
		waitForElementVisible(SuccessMessageDeleted_Toast_xpath);
		isElementDisplayed(SuccessMessageDeleted_Toast_xpath);
		return SuccessMessageDeleted_Toast_xpath;
	}



	/** The method to return success toast message for deletet */
	@Step("{method}")
	public WebElement getColumnSavedMessage() {
		waitForElementVisible(columnSaved_Toast_xpath);
		isElementDisplayed(columnSaved_Toast_xpath);
		return columnSaved_Toast_xpath;
	}

	@Step("{method}")
	public WebElement getExportdMessage() {
		waitForElementVisible(export_Toast_Xpath);
		isElementDisplayed(export_Toast_Xpath);
		return export_Toast_Xpath;
	}

	/** The method to create expense with only required native fields */
	@Step("{method}")
	public ExpensePage createTxnWithReqNativeFields(XSSFRow rowData) {
		writeText(amount_TextField_ID, rowData.getCell(0).toString());
		return GetInstance(ExpensePage.class);
	}

	// /** The method for text extra field */
	// public ExpensePagePWC Extrafield_text(String s) {
	// ScrollToElement(date_Input_Id);
	// ScrollToElement(text_Input_Name);
	// clearText(text_Input_Name);
	// writeText(text_Input_Name, s);
	// return this;
	//
	// }
	//
	// public ExpensePagePWC Extrafield_BankAcc(String acc) {
	//
	// ScrollToElement(bankAcc_Input_Name);
	// waitAndClickWebElement(bankAcc_Input_Name);
	// clearText(bankAcc_Input_Name);
	// writeText(bankAcc_Input_Name, acc);
	// return this;
	//
	// }
	//
	// public ExpensePagePWC Extrafield_ConfirmBankAcc(String acc) {
	// ScrollToElement(confirmBankAcc_Input_Name);
	// waitAndClickWebElement(confirmBankAcc_Input_Name);
	// clearText(confirmBankAcc_Input_Name);
	// writeText(confirmBankAcc_Input_Name, acc);
	// return this;
	//
	// }
	//
	// public ExpensePagePWC Extrafield_Date() {
	// ScrollToElement(number_Input_Name);
	// ScrollToElement(date_Input_Xpath);
	// waitForElementToClickable(date_Input_Xpath);
	// clearText(date_Input_Xpath);
	// waitAndClickWebElement(date_Input_Xpath);
	// waitForElementToClickable(Today_Date_xpath);
	// waitAndClickWebElement(Today_Date_xpath);
	//
	// return this;
	// }



	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElements.class).logout();

	}


	@Step("{method}")
	public ExpensePage clearMultiselectDD() {
		ScrollToElement(multiselect_Input_Name);
		waitAndClickWebElement(multiselect_Input_Name);
		waitAndClickWebElement(multiselect_Options_Xpath.get(1));
		waitAndClickWebElement(multiselect_Options_Xpath.get(2));
		doubleClick(multiselect_Input_Name);
		return GetInstance(ExpensePage.class);
	}

	@Step("{method}")
	public ExpensePage multiselectDD() {
		ScrollToElement(multiselect_Input_Name);
		waitAndClickWebElement(multiselect_Input_Name);
		waitAndClickWebElement(multiselect_Options_Xpath.get(1));
		waitAndClickWebElement(multiselect_Options_Xpath.get(2));
		doubleClick(multiselect_Input_Name);
		return GetInstance(ExpensePage.class);
	}

	// public ExpensePagePWC dateRange() throws InterruptedException {
	// ScrollToElement(dateRange_Dates_Xpath.get(0));
	// TestBotElementsWrapper.threadWait(dateRange_Dates_Xpath.get(0), 2000);
	// clearText(dateRange_Dates_Xpath.get(0));
	// waitAndClickWebElement(dateRange_Dates_Xpath.get(0));
	// waitAndClickWebElement(Today_Date_xpath);
	// clearText(dateRange_Dates_Xpath.get(0));
	// TestBotElementsWrapper.threadWait(dateRange_Dates_Xpath.get(1), 2000);
	// waitAndClickWebElement(dateRange_Dates_Xpath.get(1));
	// waitAndClickWebElement(Today_Date_xpath);
	//
	// return this;
	// }

	// public ExpensePagePWC ifsc(String ifsc, SoftAssert softAssert) throws
	// InterruptedException {
	// ScrollToElement(ifsc_Input_Name);
	// clearText(ifsc_Input_Name);
	// writeText(ifsc_Input_Name, ifsc);
	// waitForElementVisible(ifscBank_Input_Name);
	// waitForElementVisible(ifscBranch_Input_Name);
	// TestBotElementsWrapper.threadWait(ifscBank_Input_Name, 2000);
	// TestBotElementsWrapper.threadWait(ifscBranch_Input_Name, 2000);
	// softAssert.assertEquals(ifscBranch_Input_Name.getAttribute("value").toString(),
	// "BANGALORE",
	// "branch name assertion for IFSC EF");
	// softAssert.assertEquals(ifscBank_Input_Name.getAttribute("value").toString(),
	// "CITI BANK",
	// "bank name assertion for IFSC EF");
	// softAssert.assertAll();
	// return this;
	// }

	// public ExpensePagePWC NumberEF(String numberEFData) {
	// ScrollToElement(number_Input_Name);
	// clearText(number_Input_Name);
	// writeText(number_Input_Name, numberEFData);
	// return this;
	// }
	//
	// public ExpensePagePWC TimeEF() throws InterruptedException {
	// ScrollToElement(timeField_Input_Xpath);
	// TestBotElementsWrapper.threadWait(timeField_Input_Xpath, 2000);
	// clearText(timeField_Input_Xpath);
	// waitAndClickWebElement(timeField_Input_Xpath);
	// waitAndClickWebElement(timeok_Button_Xpath);
	// return this;
	//
	// }
	//
	// public ExpensePagePWC prefix(String prefix) {
	// ScrollToElement(prefix_Input_Name);
	// clearText(prefix_Input_Name);
	// writeText(prefix_Input_Name, prefix);
	// return this;
	// }
	//
	// public ExpensePagePWC postfix(String prefix) {
	// ScrollToElement(postfix_Input_Name);
	// clearText(postfix_Input_Name);
	// writeText(postfix_Input_Name, prefix);
	// return this;
	// }

	@Step("{method}")
	public ExpensePage FileAttachment(SoftAssert softAssert) {
		File f = new File("./src/test/resources/imgData/1.png");
		ScrollToElement(ifsc_Input_Name);
		ScrollToElement(File_UploadButton_Xpath);
		//moveToElement_Actions(File_UploadButton_Xpath);
		// File_UploadButton_xpath.click();
		File_UploadButton_Xpath.sendKeys(f.getAbsolutePath());
		softAssert.assertEquals(uploadedImageCheck_Button_Xpath.getText(), "Files-1");
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	@Step("{method}")
	public ExpensePage Dropdown() {
		ScrollToElement(dropdown_Input_Name);
		waitAndClickWebElement(dropdown_Input_Name);
		// waitForElementToClickable(clearText_xpath);
		// clearText(clearText_xpath);
		// waitForElementToClickable(dropdown_Input_Name);
		// waitAndClickWebElement(dropdown_Input_Name);
		waitForElementToClickable(DropdownValue_Input_Xpath);
		waitAndClickWebElement(DropdownValue_Input_Xpath);
		return GetInstance(ExpensePage.class);

	}

	// /** The method to create expense with all extra fields */
	// public ExpensePagePWC createTxnWithAllTypesOfEf(SoftAssert softAssert, Map
	// efData) throws InterruptedException {
	//
	// this.Extrafield_text(efData.get(EFType.TEXT).toString());
	// this.NumberEF(efData.get(EFType.NUMBER).toString());
	// this.Extrafield_Date();
	// this.TimeEF();
	// this.Dropdown();
	// this.Extrafield_BankAcc(efData.get(EFType.ACCOUNT).toString());
	// this.Extrafield_ConfirmBankAcc(efData.get(EFType.ACCOUNT).toString());
	// this.ifsc(efData.get(EFType.IFSC).toString(), softAssert);
	// this.FileAttachment(softAssert);
	// this.multiselectDD();
	// this.dateRange();
	// this.prefix(efData.get(EFType.PREFIX).toString());
	// this.postfix(efData.get(EFType.POSTFIX).toString());
	// return this;
	//
	// }


	/** The method to select transaction type */
	@Step("{method}")
	public ExpensePage selectTxnType() {
		waitAndClickWebElement(expenseType_Input_Name);
		waitAndClickWebElement(mileageType_Option_Xpath);
		return GetInstance(ExpensePage.class);
	}


	/** The category select field xpath */
	@FindBy(xpath = "//input[@value='Select Category']")
	private WebElement category_Select_Xpath;
	/** The method to create expense with settings */
	@Step("{method}")
	public ExpensePage createTxnWithTxnTypeDepEf(XSSFRow rowData) {
		waitAndClickWebElement(txnTypeDepDropdown_Input_Name);
		waitAndClickWebElement(txnTypeDepDropdown_Option_Xapth);
		writeText(txnTypeDepNumber_Input_Name, rowData.getCell(5).toString());
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		waitAndClickWebElement(category_Select_Xpath);
		waitAndClickWebElement(travel_Dropdown_Xpath);
		return GetInstance(ExpensePage.class);
	}

	/**
	 * The method to click edit link of an expense
	 *
	 * @throws Exception
	 */
	@Step("{method}")
	public ExpensePage clickExpenseEdit() throws Exception {
		untilPageLoadComplete();
		isElementDisplayed(Copyhamburger_Icon_Xpath);
		//ScrollToElement(Copyhamburger_Icon_Xpath);
		waitAndClickWebElement(Copyhamburger_Icon_Xpath);
		waitForElementVisible(edit_Link_Xpath);
		safeJavaScriptClick(edit_Link_Xpath);
		waitAndClickWebElement(edit_Link_Xpath);
		return GetInstance(ExpensePage.class);
	}
	
	@Step("{method}")
	public ExpensePage SearchForlatestCreatedTxn(String TxnType) throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(TxnType_Filter_SearchBox_Xpath);
		writeText(TxnType_Filter_SearchBox_Xpath, TxnType);
		if (TxnType.contentEquals("Domestic Travel: Company Paid")) {
			waitForElementVisible(DomesticTravel_value_Xpath_TxnTypeFilter);
			waitAndClickWebElement(DomesticTravel_value_Xpath_TxnTypeFilter);
		}
		
		waitAndClickWebElement(CreationDate_ColumnSort_Xpath);

		return GetInstance(ExpensePage.class);
	}
	
	/**
	 * The method to click edit link of an expense
	 *
	 * @throws Exception
	 */
	@Step("{method}")
	public ExpensePage openRecentlyCreatedTxn() throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(TxnIdFilter_SearchBox_Xpath);
		TestBotElementsWrapper testBotElementsWrapper = new TestBotElementsWrapper();
		 String TxnID = testBotElementsWrapper.readFile("TxnID.txt");
		 System.out.println("TxnID fetched from the file is: "+TxnID);
		 writeText(TxnIdFilter_SearchBox_Xpath, TxnID);
		 TxnIdFilter_SearchBox_Xpath.sendKeys(Keys.ENTER);
		 
		return GetInstance(ExpensePage.class);
	}
	//
	@Step("{method}")
	public ExpensePage openRecentlyCreatedCopyTypeTxn() throws Exception {
		untilPageLoadComplete();
		waitForElementVisible(TxnIdFilter_SearchBox_Xpath);
		TestBotElementsWrapper testBotElementsWrapper = new TestBotElementsWrapper();
		 //String TxnID = testBotElementsWrapper.readFile("CopyTypeTxnID.txt");
		String TxnID = testBotElementsWrapper.readFile("/Users/ltuser/Downloads/CopyTypeTxnID.txt");
		 System.out.println("TxnID fetched from the file is: "+TxnID);
		 writeText(TxnIdFilter_SearchBox_Xpath, TxnID);
		 TxnIdFilter_SearchBox_Xpath.sendKeys(Keys.ENTER);
		 
		return GetInstance(ExpensePage.class);
	}


	/**
	 * The method to click edit link of an expense in PWC org
	 *
	 * @throws Exception
	 */
	@Step("{method}")
	public ExpensePage clickExpenseEdit_PWC() throws Exception {
        untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		safeJavaScriptClick(PWChamburger_Icon_Xpath);
		waitForElementVisible(edit_Link_Xpath);
		safeJavaScriptClick(edit_Link_Xpath);
		return GetInstance(ExpensePage.class);
	}

	/**
	 * The method to copy expense without filling amount field
	 *
	 * @throws Exception
	 */
	@Step("{method}")
	public ExpensePage CopyExpenseWithoutAmount_PWC(XSSFRow rowData) throws Exception {
		//SoftAssert softAssert = new SoftAssert();
		//String b = Keys.BACK_SPACE.toString();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(Copy_Link_Xpath);
		safeJavaScriptClick(Copy_Link_Xpath);
		waitForElementToClickable(spentAt_TextField_ID);
		clearTextField(spentAt_TextField_ID);
		waitForElementToClickable(amount_TextField_ID);
		clearTextField(amount_TextField_ID);
		//writeText(spentAt_TextField_ID, b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b);
		writeText(spentAt_TextField_ID, rowData.getCell(11).toString());
		waitAndClickWebElement(CopyExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
//		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
//		softAssert.assertAll();
//		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(ExpensePage.class);
	}


//	/**
//	 * The method to copy expense without filling amount field
//	 *
//	 * @throws Exception
//	 */
//	public ExpensePage CopyExpenseDateCheck_PWC(XSSFRow rowData,String string) throws Exception {
//		Date date=new Date();
//		DateFormat dateformat= new SimpleDateFormat("yyyy-mm-dd H:mm ");
//
//	    String currentdate= dateformat.format(date);
//			System.out.println("Current Date is : " + currentdate);
//
//		untilPageLoadComplete();
//		ScrollToElement(hamburger_Icon_Xpath.get(0));
//		waitForElementToClickable(hamburger_Icon_Xpath.get(0));
//		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
//		waitForElementToClickable(Copy_Link_Xpath);
//		waitAndClickWebElement(Copy_Link_Xpath);
//
//		waitForElementVisible(CurrentDate_Xpath);
//		//String actual=getText(CurrentDate_Xpath);
//		String actual=getAttributeValue(CurrentDate_Xpath, "value");
//
//
//		CurrentTime_Xpath
//
//		System.out.println("Date in copy expense is : " + actual);
//
//		sa.assertEquals(actual, currentdate);
//		sa.assertAll();
//
//		return this;
//	}
//

	/** The expense edit action xpath */
	// @FindBy(how = How.XPATH, using = "//div[@role='presentation']/div/a")
	//@FindBy(xpath = "//span/div/div[text()='Copy']")
	@FindBy(xpath = "//div[contains(text(),'Copy')]")
	private WebElement Copy_Link_Xpath;

	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement copy_button;
	
	/** The copy expense button xpath. */
	@FindBy(xpath="//span[text()='Copy']/..")
	private WebElement CopyExpense_Button_Xpath;

	/**
	 * The method to view expense
	 *
	 * @throws Exception
	 */
	@Step("{method}")
	public ExpensePage CopyExpense_PWC(XSSFRow rowData) throws Exception {
		//SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		safeJavaScriptClick(PWChamburger_Icon_Xpath);
		waitForElementToClickable(Copy_Link_Xpath);
		waitAndClickWebElement(Copy_Link_Xpath);
		isElementDisplayed(amount_TextField_ID);
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		VerifyTextField(amount_TextField_ID,rowData.getCell(1).toString());
		waitForElementToClickable(spentAt_TextField_ID);
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(11).toString());
		safeJavaScriptClick(CopyExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
//		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
//		softAssert.assertAll();
//		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(ExpensePage.class);
	}




	@Step("{method}")
	public ExpensePage ViewExpense_PWC() throws Exception {
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		safeJavaScriptClick(PWChamburger_Icon_Xpath);
		waitForElementToClickable(View_Link_Xpath);
		safeJavaScriptClick(View_Link_Xpath);
		waitForElementToClickable(CloseView_Link_Xpath);
		waitAndClickWebElement(CloseView_Link_Xpath);
		return GetInstance(ExpensePage.class);
	}



	/** The method to edit expense with native fields */
	@Step("{method}")
	public CreateExpensePage editTxnNativeField(XSSFRow rowData) {
		untilJqueryIsDone();
		clearTextField(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		clearTextField(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		// waitAndClickWebElement(category_Clear_Xpath);
		// waitAndClickWebElement(category_Select_Xpath);
		// waitAndClickWebElement(food_Dropdown_Xpath);
		
		return GetInstance(CreateExpensePage.class);
	}

	/** The amount text field in OUP org */
	@FindBy(xpath="//input[@name='Gross Amount']")
	private WebElement Grossamount_TextField_xpath_oup;
	
	@FindBy(xpath="//input[@id='currency_amount']")
	private WebElement amountfield;

	/** The method to edit expense with native fields */
	@Step("{method}")
	public CreateExpensePage editTxnNativeField_OUP(XSSFRow rowData) {
		//GetInstance(CreateExpensePage.class);
		untilPageLoadComplete();
		isElementDisplayed(amountfield);
		clearTextField(amountfield);
		writeText(amountfield, rowData.getCell(1).toString());
		waitAndClickWebElement(spentAt_TextField_ID);
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		clearTextField(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		// waitAndClickWebElement(category_Clear_Xpath);
		// waitAndClickWebElement(category_Select_Xpath);
		// waitAndClickWebElement(food_Dropdown_Xpath);
		//return this;
		return GetInstance(CreateExpensePage.class);
	}

	/** The method to edit expense with native fields
	 * @throws Exception */
	@Step("{method}")
	public ExpensePage EditExpenseWithoutSpentAt_OUP(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		String b = Keys.BACK_SPACE.toString();
		//untilPageLoadComplete();
		isElementDisplayed(spentAt_TextField_ID);
		waitForElementVisible(spentAt_TextField_ID);
		clearTextField(spentAt_TextField_ID);
		//writeText(spentAt_TextField_ID, b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b);
		//waitForElementToClickable(updateExpense_Button_Xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(Expense_Failure_ToastMessage_Icon_xpath);
		//waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		waitForText(SuccessMessageEdit_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		softAssert.assertAll();
		//return this;
		return GetInstance(ExpensePage.class);

	}



	@Step("{method}")
	public ExpensePage EditExpenseWithoutSpentAt_PWC(String string) throws Exception {
		//SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementToClickable(spentAt_TextField_ID);
		specialGETElement(spentAt_TextField_ID);
		clearTextField(spentAt_TextField_ID);
		waitForElementTextInVisible(spentAt_TextField_ID,"Exp");
		clearTextField(spentAt_TextField_ID);
		waitForElementVisible(updateExpense_Button_Xpath);
		waitForElementToClickable(updateExpense_Button_Xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
//		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		//softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		//waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		//softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** The city text field ID. */
	@FindBy(id = "city")
	private WebElement city_TextField_ID;

	/** The method to edit expense with native fields
	 * @throws Exception */
	@Step("{method}")
	public ExpensePage EditExpenseWithoutCity_PWC(String string) throws Exception {
		//SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(city_TextField_ID);
		waitForElementToClickable(city_TextField_ID);
		clearTextField(city_TextField_ID);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		waitForText(SuccessMessageEdit_Toast_xpath,string);
		//softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		//softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** Bill Number */
	@FindBy(xpath = "//div/input[@name='Bill Number']")
	private WebElement BillNumber_text_xpath;

	/** The method to edit expense with native fields
	 * @throws Exception */
	@Step("{method}")
	public ExpensePage EditExpenseWithoutBillNumber_PWC(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementToClickable(BillNumber_text_xpath);
		clearTextField(BillNumber_text_xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		waitForText(SuccessMessageEdit_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** The method to edit expense with native fields
	 * @throws Exception */
	@Step("{method}")
	public ExpensePage EditExpenseWithoutDescription_OUP(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		String b = Keys.BACK_SPACE.toString();
		untilPageLoadComplete();
		//isElementDisplayed(description_TextField_ID);
		waitForElementToClickable(description_TextField_ID);
		clearTextField(description_TextField_ID);
		//writeText(description_TextField_ID, b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b + b);
		//waitForElementToClickable(updateExpense_Button_Xpath);
		waitAndClickWebElement(updateExpense_Button_Xpath);
		waitForElementVisible(Expense_Failure_ToastMessage_Icon_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** The method to edit expense with native fields */
	@Step("{method}")
	public ExpensePage DeleteBill(String string) {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(DeleteBillIcon_xpath);
		waitAndClickWebElement(DeleteBillIcon_xpath);
		waitAndClickWebElement(Delete_expense_butotn);
//		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(ExpensePage.class);
	}



	/** The method to edit expense with native fields */
	@Step("{method}")
	public ExpensePage editTxnNativeField_PWC(XSSFRow rowData) {
		// clearText(amount_TextField_ID);
		String b = Keys.BACK_SPACE.toString();
        clearTextField(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		waitForElementToClickable(spentAt_TextField_Xpath);
		clearTextField(spentAt_TextField_Xpath);
		writeText(spentAt_TextField_Xpath, rowData.getCell(2).toString());
		clearTextField(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		// clearText(description_TextField_ID);
		// writeText(description_TextField_ID,
		// rowData.getCell(3).toString());
		// waitAndClickWebElement(category_Clear_Xpath);
		// waitAndClickWebElement(category_Select_Xpath);
		// waitAndClickWebElement(food_Dropdown_Xpath);
		//return this;
		return GetInstance(ExpensePage.class);
	}

	/**
	 * @throws InterruptedException
	 */
	// public ExpensePagePWC editTxnExtraField(SoftAssert softAssert, Map efData)
	// throws InterruptedException {
	// this.Extrafield_text(efData.get(EFType.TEXT).toString());
	// this.NumberEF(efData.get(EFType.NUMBER).toString());
	// this.Extrafield_Date();
	// this.TimeEF();
	// this.Dropdown();
	// this.Extrafield_BankAcc(efData.get(EFType.ACCOUNT).toString());
	// this.Extrafield_ConfirmBankAcc(efData.get(EFType.ACCOUNT).toString());
	// this.ifsc(efData.get(EFType.IFSC).toString(), softAssert);
	// //this.clearMultiselectDD();
	// //this.multiselectDD();
	// //this.dateRange();
	// this.prefix(efData.get(EFType.PREFIX).toString());
	// this.postfix(efData.get(EFType.POSTFIX).toString());
	// return this;
	//
	// }

	/**
	 * The method to split expense page
	 *
	 * @throws Exception
	 */
	@Step("{method}")
	public ExpensePage clickTxnSplit() throws Exception {
		untilPageLoadComplete();
		//waitForText(AllExpenses_xpath,"All Expenses");
		waitForElementVisible(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(split_Link_Xpath);
		safeJavaScriptClick(split_Link_Xpath);
		return GetInstance(ExpensePage.class);
	}

	/** The method to split expense for PWC org */
	@Step("{method}")
	public ExpensePage splitTxn_PWC(XSSFRow rowData, String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		String b=Keys.BACK_SPACE.toString();
		isElementEnabled(done_Button_Xpath);
		waitForElementVisible(splitAmount_Input_Name);
		isElementEnabled(splitAmount_Input_Name);
		writeText(splitAmount_Input_Name, rowData.getCell(6).toString());
		writeText(splitAmount_Input_Name, b+b+b+b);
		writeText(splitAmount_Input_Name,rowData.getCell(6).toString());
		//waitForText(AmountLeft_xpath,"₹ 0");
		waitAndClickWebElement(done_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** The method to split expense for PWC org */
	@Step("{method}")
	public ExpensePage splitTxn_OUP(XSSFRow rowData) {
		SoftAssert softAssert = new SoftAssert();
		String b = Keys.BACK_SPACE.toString();
		waitForElementVisible(finalCategory_Input_Field);
		waitForElementVisible(splitAmount_Input_Name);
		//clearText(splitAmount_Input_Name);
		//writeText(splitAmount_Input_Name, rowData.getCell(6).toString());
		//waitForElementVisible(initialCategory_Input_Field);
		waitAndClickWebElement(initialCategory_Input_Field);
		waitForElementVisible(primary_category_xpath);
		waitAndClickWebElement(primary_category_xpath);
		//waitForElementVisible(finalCategory_Input_Field);
		waitAndClickWebElement(finalCategory_Input_Field);
		waitAndClickWebElement(secondary_category_xpath);
//		if (finalCategory_Input_Field.getText() == null) {
//			System.out.println("FinalCategory is empty...");
//			waitAndClickWebElement(finalCategory_Input_Field);
//			waitAndClickWebElement(secondary_category_xpath);
//		}
		waitAndClickWebElement(done_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), rowData.getCell(12).toString());
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertAll();
		// return this;
		return GetInstance(ExpensePage.class);
	}

	/** The method to split expense for PWC org */
	@Step("{method}")
	public ExpensePage splitTxn_Automation(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(splitAmount_Input_Name);
		waitForElementToClickable(splitAmount_Input_Name);
		writeText(splitAmount_Input_Name, rowData.getCell(6).toString());
		waitAndClickWebElement(done_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertAll();
		//return this;
		return GetInstance(ExpensePage.class);
	}



	/** The method to delete expense */
	@Step("{method}")
	public ExpensePage deleteExpense(String string) {
		SoftAssert softAssert = new SoftAssert();
		// waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath,"All Expenses");
		untilPageLoadComplete();
		waitAndClickWebElement(Quickview);
		waitAndClickWebElement(DeleteIconOnQuickView_Xpath);
		//waitAndClickWebElement(Delete_expense_butotn);
		waitAndClickWebElement(deleteConfirmQuick_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		waitForText(SuccessMessageEdit_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** The method to delete expensein PWC org */
	@Step("{method}")
	public CommonPageElements deleteExpenseQuickview_PWC(String string) {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(quickview_PWC);
		waitAndClickWebElement(quickview_PWC);
		waitAndClickWebElement(Delete_expense_butotn);
		waitAndClickWebElement(deleteConfirmQuick_Button_Xpath);
//		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertAll();
		return GetInstance(CommonPageElements.class);
	}

	/** The method to delete expensein PWC org */
	@Step("{method}")
	public CommonPageElements deleteExpenseHamburger_PWC(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		try{
			waitForElementToClickable(DeleteHamburger_expense_butotn);
			waitAndClickWebElement(DeleteHamburger_expense_butotn); }
			catch ( Exception e ){
				isElementDisplayed(DeleteHamburger_expense_butotn);
				safeJavaScriptClick(DeleteHamburger_expense_butotn);
			}
			try{
				waitForElementToClickable(deleteConfirmHamburger_Button_Xpath);
				waitAndClickWebElement(deleteConfirmHamburger_Button_Xpath);
			}
			catch (Exception e) {
				waitAndClickWebElement(deleteConfirmHamburger_Button_Xpath);
			}
//		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
//		waitForText(SuccessMessageEdit_Toast_xpath,string);
		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(),string);
		softAssert.assertAll();
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(CommonPageElements.class);
	}

    /**
     * The method to delete expensein Automation org
     *
     * @throws Exception
     */
    @Step("{method}")
    public ExpensePage deleteExpenseHamburger_Automation(String string) throws Exception {
        SoftAssert softAssert = new SoftAssert();
        untilPageLoadComplete();
//        isElementDisplayed(PWChamburger_Icon_Xpath);
//        ScrollToElement(PWChamburger_Icon_Xpath);
//        safeJavaScriptClick(PWChamburger_Icon_Xpath);
        waitAndClickWebElement(PWChamburger_Icon_Xpath);
        try{
            waitForElementToClickable(deleteHamburger_button);
            waitAndClickWebElement(deleteHamburger_button); }
        catch ( Exception e ){
            isElementDisplayed(deleteHamburger_button);
            safeJavaScriptClick(deleteHamburger_button);
        }
        try{
            waitForElementToClickable(Delete__expense_conformation_butotn);
            waitAndClickWebElement(Delete__expense_conformation_butotn);
        }
        catch (Exception e) {
            waitAndClickWebElement(Delete_expense_button);
        }
        fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
        softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
        waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
        softAssert.assertAll();
        return GetInstance(ExpensePage.class);
    }

	/** The method to go to column management */
	@Step("{method}")
	public ExpensePage clickColumnManagement() {
		waitAndClickWebElement(columnManagement_Img_Xpath);
		//return this;
		return GetInstance(ExpensePage.class);
	}

	/** The meyhod for column management */
	@Step("{method}")
	public ExpensePage SelectcolumnName() {
		waitAndClickWebElement(cityColumn_Input_Id);
		waitAndClickWebElement(cityGroupColumn_Input_Id);
		//return this;
		return GetInstance(ExpensePage.class);
	}

	/** The method for downloading the excel */
	@Step("{method}")
	public ExpensePage DownloadExpenseExcel(String string) {
		SoftAssert softAssert = new SoftAssert();
		//waitForElementVisible(export_Button_Xpath);
		waitAndClickWebElement(export_Button_Xpath);
		waitAndClickWebElement(download_Button_Xpath);
		//waitAndClickWebElement(download_expense_xpath);
		fluentWaitForElementVisible(SuccessMessageEdit_Toast_xpath);
		String response =SuccessMessageEdit_Toast_xpath.getText();
		softAssert.assertTrue(response.equals(string)||response.equals("The report link will be sent to you shortly"), "Successful response");
		//waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		//softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	/**
	 * The method to Merge expense
	 *
	 * @throws Exception
	 */
	@Step("Click on Hamburger,click Merge Expense, select mergable transaction, click on merge expense and verify the success message, {method}")
	public ExpensePage MergeExpense(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(MergeExpense_Xpath);
		waitAndClickWebElement(MergeExpense_Xpath);
		waitForElementToClickable(MergableExpense_Xpath);
		waitAndClickWebElement(MergableExpense_Xpath);
		waitForElementToClickable(MergeExpenseButton_Xpath);
		waitAndClickWebElement(MergeExpenseButton_Xpath);
		waitForElementVisible(MergeSuccess_Xpath);
		String msg= getText(MergeSuccess_Xpath);
		softAssert.assertEquals(msg, containsString(string));
		softAssert.assertAll();
		
		return GetInstance(ExpensePage.class);
	}

	/** The expense Merge success message xpath for 1 txn */
	@FindBy(xpath = "//div[contains(text(),'1 transactions successfully merged to this transac')]")
	private WebElement MergeSuccess_Xpath;

	/** The expense Merge action xpath */
	@FindBy(xpath = "//span//div[text()='Merge']")
	private WebElement MergeExpense_Xpath;

	/** Select mergable expense */
	//@FindBy(xpath = "//table[@class='table']//tbody//tr//td//input")
	@FindBy(xpath = "//tr/td/input[@type='checkbox']")
	private WebElement MergableExpense_Xpath;

	/** Merge expense button in popup */
	@FindBy(xpath = "//button[text()='Merge']")
	private WebElement MergeExpenseButton_Xpath;

	/** The expense Merge success message xpath for 2 txn */
	@FindBy(xpath = "//div[contains(text(),'2 transactions successfully merged to this transac')]")
	private WebElement MergeSuccessTwo_Xpath;

	@FindBy(xpath="//div[contains(text(),'Ok got it')]")
	private WebElement OkayGotit;

	/** Add button project */
	@FindBy(xpath="//div/button/span[text()='Cancel']/..")
	private WebElement CancelButtonPopup_xpath;

	/** The Cancel button */
	@FindBy(xpath = "//div/button[@class='secondaryButton']")
	private WebElement Cancel_button_xpath;

	public ExpensePage VerifyMergeSuccess(){
		waitForElementVisible(MergeSuccess_Xpath);
		System.out.println(MergeSuccess_Xpath.getText());
		boolean b= isElementDisplayed(OkayGotit);
		System.out.println("Success messages appeared " + b);
		//waitForElementInVisible(MergeSuccess_Xpath);
     waitForElementVisible(MergeSuccess_Xpath);
     System.out.println(MergeSuccess_Xpath.getText());
		if (isElementDisplayed(OkayGotit)) b = true;
		else b = false;
     System.out.println("Success messages appeared " + b);
     //waitForElementInVisible(MergeSuccess_Xpath);
     return GetInstance(ExpensePage.class);
	}

	@Step("Click on Hamburger,click Merge Expense, select mergable transaction, click on merge expense and verify the success message, {method}")
	public ExpensePage MergeMorethanTwoExpense(String string) throws Exception {

		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(MergeExpense_Xpath);
		waitAndClickWebElement(MergeExpense_Xpath);
		waitForElementToClickable(MergableExpense_Xpath);
		waitAndClickWebElement(MergableExpense_Xpath);
		waitForElementToClickable(MergeExpenseButton_Xpath);
		waitAndClickWebElement(MergeExpenseButton_Xpath);
		waitForElementVisible(MergeSuccessTwo_Xpath);
		String msg= getText(MergeSuccessTwo_Xpath);
		softAssert.assertEquals(msg, string);
		softAssert.assertAll();
		
		return GetInstance(ExpensePage.class);
	}



	@Step("Click on Hamburger,click View Expense, Verfiy Details, {method}")
	public ExpensePage MergeExpenseDetails(double amount) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitAndClickWebElement(Creation_Date_Column_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		isElementDisplayed(edit_Link_Xpath);
		waitAndClickWebElement(edit_Link_Xpath);
		untilPageLoadComplete();
		isElementDisplayed(updateExpense_Button_Xpath);
		isElementEnabled(updateExpense_Button_Xpath);
		waitForText(EditExpenseScreen,"EDIT EXPENSE");
		isElementDisplayed(spentAt_TextField_Xpath);
		isElementEnabled(spentAt_TextField_Xpath);
		waitForElementToClickable(spentAt_TextField_Xpath);
		String SpentAt=getAttributeValue(spentAt_TextField_Xpath, "value");
		isElementDisplayed(amount_TextField_ID);
		waitForElementVisible(amount_TextField_ID);
		waitForElementToClickable(amount_TextField_ID);
		untilPageLoadComplete();
		String Amount=getAttributeValue(amount_TextField_ID, "value");
		double Amountfromscreen=Double.parseDouble(Amount);
		System.out.println("Amount is " + Amountfromscreen);
		softAssert.assertEquals(Amountfromscreen, amount);
		assertThat(SpentAt,anyOf(
				containsString("Exp"),containsString("Merge Expense")));
		//GO back to expense list page
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	/**
	 * The method to verify the Merge expense details like bills 
	 * 
	 * @throws Exception
	 */
	@Step("Click on Hamburger,click View Expense, Verfiy Details, {method}")
	public ExpensePage MergeExpenseDetailsBills(int count) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		//waitAndClickWebElement(Creation_Date_Column_Xpath);
		isElementDisplayed(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(edit_Link_Xpath);
		waitAndClickWebElement(edit_Link_Xpath);
		//waitForElementVisible(Uploadmoreinvoice_Auto);
		//waitForText(Uploadmoreinvoice_Auto,"Upload More Invoices");
		int bills= getWebElementsCount(ListofBills_Xpath);
		System.out.println("Number of bills in the expense : " + bills);
		softAssert.assertEquals(bills, count);
		//GO back to expense list page
		waitAndClickWebElement(Cancel_button_xpath);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	
	
	

	@Step("Click on Hamburger,click Edit Expense, Verfiy Details, {method}")
	public CreateExpensePage  editMergeExpense(XSSFRow rowData) throws Exception {
		untilPageLoadComplete();
        isElementDisplayed(PWChamburger_Icon_Xpath);
        ScrollToElement(PWChamburger_Icon_Xpath);
        waitAndClickWebElement(PWChamburger_Icon_Xpath);
		waitForElementToClickable(edit_Link_Xpath);
		waitAndClickWebElement(edit_Link_Xpath);
	    untilPageLoadComplete();
		clearTextField(amount_TextField_ID);
		isElementEnabled(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(5).toString());
		clearTextField(spentAt_TextField_ID);
		writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		waitForElementVisible(description_TextField_ID);
		clearTextField(description_TextField_ID);
		writeText(description_TextField_ID, rowData.getCell(3).toString());
		return GetInstance(CreateExpensePage.class);
	}


	/**
	 * The method to Merge expense
	 *
	 * @throws Exception
	 */
	@Step("Click on Hamburger,click Merge Expense,  Dont select mergable transaction, click on merge expense and verify the error message, {method}")
	public ExpensePage MergeExpensewithoutSelectingExpense(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete(Long.valueOf(1000));
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
      	//untilPageLoadComplete(Long.valueOf(1000));
		waitForElementVisible(MergeExpense_Xpath);
		waitForElementToClickable(MergeExpense_Xpath);
		waitAndClickWebElement(MergeExpense_Xpath);
		isElementDisplayed(MergeExpenseButton_Xpath);
		waitForElementToClickable(MergeExpenseButton_Xpath);
		waitAndClickWebElement(MergeExpenseButton_Xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitAndClickWebElement(CancelButtonPopup_xpath);
		softAssert.assertAll();
		
		return GetInstance(ExpensePage.class);
	}


	@Step("Click on Hamburger and verify the merge option is present in action menu, {method}")
	public ExpensePage MergeExpenseinhamburger() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitAndClickWebElement(PWChamburger_Icon_Xpath);
		boolean value= isElementDisplayed(MergeExpense_Xpath);
		softAssert.assertTrue(value);
		waitAndClickWebElement(GotoExpense_button_xpath);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	@Step("Verify the presence of merge option in expense list, {method}")
	public ExpensePage MergeExpenseIconinExpenseList(String string) throws Exception {

		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete(Long.valueOf(1000));
		waitForElementVisible(MergeExpenseIconinExpenseList_Xpath);
		isElementDisplayed(MergeExpenseIconinExpenseList_Xpath);
		//moveToElement_Actions(MergeExpenseIconinExpenseList_Xpath);
		String s=getAttributeValue(MergeExpenseIconinExpenseList_Xpath,"data-tip");
		System.out.println(MergeExpenseIconinExpenseList_Xpath.getAttribute("data-tip"));
		System.out.println("From text method: "+MergeExpenseIconinExpenseList_Xpath.getText());
		System.out.println("tool tip message: "+s);
		String toolTipmessage=  s.replaceAll("\\<.*?\\>", "");
		toolTipmessage= toolTipmessage.replaceAll("\\s{2,}", " ").trim();
		Reporter.log(toolTipmessage);
		System.out.println("Tool Tip Message " + toolTipmessage);
		System.out.println("String Message" +string);
		softAssert.assertEquals(toolTipmessage.contains("merged to this transaction"), string.contains("merged to this transaction"));
		softAssert.assertAll();
	
		return GetInstance(ExpensePage.class);
	}



	/** The Merchant field in Filter side in expense screen */
	@FindBy(xpath="//input[@placeholder='e.g. cafe coffee day']")
	private WebElement MerchantField_Xpath;

	@Step("Get Transaction Id from Expense List")
	public ExpensePage getExpenseId(String string) throws Exception {
		// Click on the txn id field to copy to clipboard
		SoftAssert softAssert = new SoftAssert();
		gotoExpense();
		untilPageLoadComplete();
		isElementDisplayed(CopyTxnID_Xpath);
		waitAndClickWebElement(CopyTxnID_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		//waitForElementInVisible(SuccessMessageEdit_Toast_xpath);

		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		
		System.out.println("copied from clipboard is :" + myText);
		File myobj = CreateFile("ExpenseID.txt");
		if (myobj != null)
			writeintoFile("ExpenseID.txt", myText);

		ScrollToElement(TransactionID_Xpath);
		TransactionID_Xpath.sendKeys(myText);
		TransactionID_Xpath.sendKeys(Keys.ENTER);
		untilPageLoadComplete();
		return GetInstance(ExpensePage.class);
	}


	@Step("Get Expense Id from Expense List")
	public ExpensePage getMergeExpenseID(String string) throws Exception {
		untilPageLoadComplete(Long.valueOf(10000));
		waitForElementVisible(TransactionID_Xpath);
		if(!TransactionID_Xpath.isDisplayed()){
			gotoExpense();
		}
		isElementDisplayed(TransactionID_Xpath);
		ScrollToElement(TransactionID_Xpath);
		TransactionID_Xpath.sendKeys(string);
		TransactionID_Xpath.sendKeys(Keys.ENTER);
		return GetInstance(ExpensePage.class);
	}

	/** The transaction id icon in expense list */
	@FindBy(xpath="(//span[@data-class='tooltipStyleClass'])[4]")
	private WebElement TxnID_ExpenseList_Xpath;

	@Step("Get the transaction id from screen {method}")
	public String GetTransactionID(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		//untilPageLoadComplete();
		//GetInstance(CreateExpensePage.class);
		waitForElementVisible(TxnID_ExpenseList_Xpath);
		isElementDisplayed(TxnID_ExpenseList_Xpath);
		System.out.println("Txn Id is Displayed");
		//moveToElement_Actions(TxnID_ExpenseList_Xpath);
		String s=getAttributeValue(TxnID_ExpenseList_Xpath,"data-tip");
		String toolTipmessage=  s.replaceAll("\\<.*?\\>", "");
		toolTipmessage= toolTipmessage.replaceAll("\\s{2,}", " ").trim();
		Reporter.log(toolTipmessage);
		System.out.println("Text is " + toolTipmessage);
		softAssert.assertEquals(toolTipmessage, string);
		softAssert.assertAll();
		return toolTipmessage;
		//return GetInstance(ExpensePage.class);
	}


	/** The Merge icon in expense list */
	@FindBy(xpath="(//img[@src='/assets/images/merged_expense.svg']/parent::span)[1]")
	private WebElement MergeExpenseIconinExpenseList_Xpath;

	@Step("Verify the auto merge of expense,{method}")
	public ExpensePage AutoMergeVerify(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete(Long.valueOf(10000));
		waitForElementVisible(MergeExpenseIconinExpenseList_Xpath);
		isElementDisplayed(MergeExpenseIconinExpenseList_Xpath);
		String s=getAttributeValue(MergeExpenseIconinExpenseList_Xpath,"data-tip");
		System.out.println("tool tip data: "+s);
		String toolTipmessage=  s.replaceAll("\\<.*?\\>", "");
		toolTipmessage= toolTipmessage.replaceAll("\\s{2,}", " ").trim();
		softAssert.assertEquals(toolTipmessage,string);
		System.out.println("tooltip message  is : "+toolTipmessage);
		softAssert.assertEquals(toolTipmessage.contains("transactions can be merged to this transaction"),string.contains("transactions can be merged to this transaction"));
		return GetInstance(ExpensePage.class);
	}

	/** Click on the txn id field in expense screen */
	@FindBy(xpath="(//span/div[@data-tip='Copy to clipboard'])[1]")
	private WebElement CopyTxnID_Xpath;

	@Step("Compare Txn Id after merge")
	public ExpensePage compareTxnID(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();

		//Click on the txn id field to copy to clipboard
		waitAndClickWebElement(CopyTxnID_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);

		String myText1 = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		//Retained Txn ID
		System.out.println("Expense ID of retained Txn is :" + myText1);

		String data=readFile("ExpenseID.txt");

		// compare with txn id of retained transaction
		softAssert.assertEquals(data, myText1);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	/** The expense unMerge action in hamburger xpath */
	@FindBy(xpath = "//div[text()='Unmerge']")
	private WebElement UnMergeExpenseHamburger_Xpath;

	/** The expense unMerge action confirm xpath */
	@FindBy(xpath = "//button[text()='Unmerge']")
	private WebElement UnMergeExpenseConfirm_Xpath;

	/** The expense UnMerge success message xpath */
	@FindBy(xpath = "//div[contains(text(),'1 transactions successfully unmerged from this tra')]")
	private WebElement UnMergeSuccess_Xpath;
	

    @Step("{method}")
    public ExpensePage Unmergeexpense(String string) throws Exception {
        SoftAssert softAssert = new SoftAssert();
        untilPageLoadComplete(Long.valueOf(100000));
        //waitAndClickWebElement(Creation_Date_Column_Xpath);
        waitAndClickWebElement(PWChamburger_Icon_Xpath);
        waitForElementToClickable(UnMergeExpenseHamburger_Xpath);
        waitAndClickWebElement(UnMergeExpenseHamburger_Xpath);
        waitForElementToClickable(UnMergeExpenseConfirm_Xpath);
        waitAndClickWebElement(UnMergeExpenseConfirm_Xpath);
//        isElementDisplayed(UnMergeSuccess_Xpath);
//        waitForElementVisible(UnMergeSuccess_Xpath);
//        String msg= getText(UnMergeSuccess_Xpath);
//        softAssert.assertEquals(msg.contains("transactions successfully unmerged from this transaction :"),string.contains("transactions successfully unmerged from this transaction :"));
        waitForElementVisible(addExpense_Button_Xpath);
        softAssert.assertAll();
        return GetInstance(ExpensePage.class);
    }

	/** Copy Txn Methods */

	@Step("{method}")
	public ExpensePage ClickCopy_VerifyTitle(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath, "All Expenses");
		waitForElementVisible(Copyhamburger_Icon_Xpath);
		//ScrollToElement(hamburger_Icon_Xpath.get(0));
		waitForElementToClickable(Copyhamburger_Icon_Xpath);
		waitAndClickWebElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(copy_button);
		waitAndClickWebElement(copy_button);
		waitForElementVisible(Copy_Expense_Text);
		softAssert.assertEquals(Copy_Expense_Text.getText(), string);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);}


	@FindBy(xpath = "//input[@id='dd-field-wallet']")
	//@FindBy(xpath = "//input[@id='']")
	private WebElement Wallet_Xpath;

	@Step("{method}")
	public ExpensePage copyExpenseChangeWallet_VerifyWalletReadonly(XSSFRow rowData) throws Exception {
		//GetInstance(CreateExpensePage.class);
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath, "All Expenses");
		waitForElementVisible(Copyhamburger_Icon_Xpath);
		ScrollToElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(Copyhamburger_Icon_Xpath);
		waitAndClickWebElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(copy_button);
		waitAndClickWebElement(copy_button);
		waitForElementVisible(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		waitForElementVisible(Wallet_Xpath);
		//WebElement Wallet = getThreadSafeDriver().findElement(By.name("Wallet"));
	    String readonly = Wallet_Xpath.getAttribute("readonly");
	    softAssert.assertEquals("true", readonly);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}

	@Step("{method}")
	public CreateExpensePage copyExpense(XSSFRow rowData) throws Exception {
		//GetInstance(CreateExpensePage.class);
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath, "All Expenses");
		waitForElementVisible(Copyhamburger_Icon_Xpath);
		ScrollToElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(Copyhamburger_Icon_Xpath);
		waitAndClickWebElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(copy_button);
		waitAndClickWebElement(copy_button);
		untilPageLoadComplete();
		waitAndClickWebElement(amount_TextField_ID);
		//waitForElementVisible(amount_TextField_ID);
		//fluentWaitForElementClickable(amount_TextField_ID);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
		return GetInstance(CreateExpensePage.class);
	}

	public ExpensePage copyExpenseEditExpType_VerifyTypeReadonly() throws Exception {
		//GetInstance(TestBotElementsWrapper.class);
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath, "All Expenses");
		waitForElementVisible(Copyhamburger_Icon_Xpath);
		ScrollToElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(Copyhamburger_Icon_Xpath);
		waitAndClickWebElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(copy_button);
		waitAndClickWebElement(copy_button);
		WebElement Wallet = getThreadSafeDriver().findElement(By.id("expenseType"));
	    String readonly = Wallet.getAttribute("readonly");
	    softAssert.assertNull(readonly);
		return GetInstance(ExpensePage.class);

	}

	public ExpensePage createTxnWithTxnType(XSSFRow rowData , String string) throws Exception {
		
		waitAndClickWebElement(Txntype_xpath);
		writeText(Txnsearch_xpath, rowData.getCell(10).toString());
		waitAndClickWebElement(TxnSelect_xpath);
		writeText(amount_TextField_ID, rowData.getCell(1).toString());
        waitForElementToClickable(CopyExpense_Button_Xpath);
		waitAndClickWebElement(CopyExpense_Button_Xpath);
		return GetInstance(ExpensePage.class);
			}

			@Step("{method}")
			public ExpensePage VerifyCopyExpense_TxnId() throws Exception {
				SoftAssert softAssert = new SoftAssert();
				waitForText(AllExpenses_xpath, "All Expenses");
				waitForElementVisible(Copy_Expense_TxnId);
				Boolean actual = true;
				if (Copy_Expense_TxnId != Expense_TxnId) {
					Boolean expected = true;
					softAssert.assertEquals(expected, actual);
				} else {
					Boolean expected = false;
					Log.info("Expense not copied");
					softAssert.assertEquals(expected, actual);
				}
				softAssert.assertAll();
				return GetInstance(ExpensePage.class);
			}

	@Step("{method}")
	public CreateExpensePage copyExpenseWithoutAmount() throws Exception {
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath,"All Expenses");
		waitAndClickWebElement(Copyhamburger_Icon_Xpath);
		waitForElementToClickable(copy_button);
		waitAndClickWebElement(copy_button);
		return GetInstance(CreateExpensePage.class);
	}

	public ExpensePage CreateAndMergeExpense(double amount) throws Exception {
		clickAddExpens()
				.createMergeExpense(ORG.AUTO, ExpenseType.Deposit,amount)
				.imageUploadAndAssert("2.png")
				.clickSave()
				.clickAddExpens()
				.createMergeExpense(ORG.AUTO, ExpenseType.Cab,amount)
				.imageUploadAndAssert("1.png")
				.clickSave();
		return GetInstance(ExpensePage.class);
	}

	public ExpensePage CreateAndMergeExpenseOUP(double amount) throws Exception{
		         clickAddExpens()
				.createMergeExpense(ORG.OUP, ExpenseType.Merge_Transaction, amount)
				.imageUploadAndAssert("3.png")
				.clickSave()
				.clickAddExpens()
				.createMergeExpense(ORG.OUP, ExpenseType.Merge_Transaction, amount)
				.imageUploadAndAssert("2.png")
				.clickSave();
		
		return GetInstance(ExpensePage.class);

	}
	
	public ExpensePage saveExpense_VerifyDescription(String Description) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath,"All Expenses");
		waitForElementVisible(Description_xpath);
		isElementDisplayed(Description_xpath);
		String response = Description_xpath.getText();
		Log.info(response);
		softAssert.assertTrue(response.equals(Description)||response.equals("Testing Purpose"), "Successful response");
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
}
	
	public ExpensePage saveExpense_VerifyFromScreen(String TxnType) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(PWChamburger_Icon_Xpath);
 		ScrollToElement(PWChamburger_Icon_Xpath);
 		safeJavaScriptClick(PWChamburger_Icon_Xpath);
 		waitForElementVisible(View_Xpath);
 		waitAndClickWebElement(View_Xpath);
 		safeJavaScriptClick(View_Xpath);
 		waitForElementVisible(TxnType_xpath);
 		isElementDisplayed(TxnType_xpath);
 		Log.info(TxnType_xpath.getText());
 		softAssert.assertEquals(TxnType_xpath.getText(),TxnType);
 		waitAndClickWebElement(CloseView_Link_Xpath);
 		softAssert.assertAll();
 		//delete the expense after view assert
 		waitAndClickWebElement(Delete_expense_butotn);
 		waitForElementToClickable(deleteConfirmQuick_Button_Xpath);
 		safeJavaScriptClick(deleteConfirmQuick_Button_Xpath);
 		waitAndClickWebElement(Delete_expense_butotn);
		return GetInstance(ExpensePage.class);
	}
	
	public ExpensePage saveExpense_VerifyHomePage() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		boolean flag=false;
		waitForElementVisible(Home_Button_xpath);
		flag = isElementDisplayed(Home_Button_xpath);
		if(flag == true)
		{
			Log.info("Expense created from Homepage");
			
		}
		else
			Log.info("Expense not created");
			
		softAssert.assertEquals(flag,true);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	
	public CreateExpensePage verifyPageTitle(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		if(isElementDisplayed(PageTitle))
		{
		waitForElementVisible(PageTitle);
		String title=PageTitle.getText();
		System.out.println("Page title is : " +PageTitle.getText());
		softAssert.assertEquals(title,string);
		}
		else
		{
			Log.info("String not found");
		}
		softAssert.assertAll();
		return GetInstance(CreateExpensePage.class);
		
	}
	
	/** The method to split expense for PWC org */
	@Step("{method}")
	public ExpensePage splitTxn_PwC(XSSFRow rowData) throws Exception {
		String b=Keys.BACK_SPACE.toString();
		waitForElementVisible(splitAmount_Input_Name);
		writeText(splitAmount_Input_Name, rowData.getCell(6).toString());
		writeText(splitAmount_Input_Name, b);
		writeText(splitAmount_Input_Name, "0");
		waitForText(AmountLeft_xpath,"₹ 0");
		waitAndClickWebElement(done_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		return GetInstance(ExpensePage.class);
	}
	
	@Step("{method}")
	public ExpensePage SplitExpense_VerifyFromScreen(String spentat, String amount) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(PWChamburger_Icon_Xpath);
		isElementDisplayed(PWChamburger_Icon_Xpath);
		waitAndClickWebElement(View_Link_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		safeJavaScriptClick(PWChamburger_Icon_Xpath);
		waitForElementVisible(View_Link_Xpath);
		safeJavaScriptClick(View_Link_Xpath);
		waitForElementVisible(SpentAtInScreen_xpath_pwc);
		isElementDisplayed(SpentAtInScreen_xpath_pwc);
		softAssert.assertEquals(SpentAtInScreen_xpath_pwc.getText(),spentat);
		isElementDisplayed(Amount_xpath_pwc);
		softAssert.assertEquals(Amount_xpath_pwc.getText(),amount);
		waitAndClickWebElement(CloseView_Link_Xpath);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	
	public ExpensePage saveExpense_VerifyAmount(String amount) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForText(AllExpenses_xpath,"All Expenses");
		waitForElementVisible(PWChamburger_Icon_Xpath);
		isElementDisplayed(PWChamburger_Icon_Xpath);
		ScrollToElement(PWChamburger_Icon_Xpath);
		safeJavaScriptClick(PWChamburger_Icon_Xpath);
		waitForElementVisible(View_Xpath);
		safeJavaScriptClick(View_Xpath);
		waitAndClickWebElement(View_Xpath);
		isElementDisplayed(Amount_xpath);
		softAssert.assertEquals(Amount_xpath.getText(),amount);
		waitAndClickWebElement(CloseView_Link_Xpath);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	
	@Step("{method}")
	public ExpensePage DeleteBillOUP() {
		SoftAssert softAssert = new SoftAssert();
		boolean flag= true;
		//waitForElementVisible(DeleteBillIcon_xpath);
		waitAndClickWebElement(DeleteBillIcon_xpath);
		//waitForElementVisible(DeleteConfirmation_Xpath_button);
		waitAndClickWebElement(DeleteConfirmation_Xpath_button);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);	
		waitForElementInVisible(SuccessMessageEdit_Toast_xpath);
		flag = isElementDisplayed(DeleteBillIcon_xpath);
		if(flag==false)
		{
			Log.info("Bill Deleted");
		}
		else {
			Log.info("Bill is present");
		}
		softAssert.assertEquals(flag, false);
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	
	public ExpensePage verifyExpenseButton()
	{	SoftAssert softAssert = new SoftAssert();
		boolean flag= true;
		untilPageLoadComplete();
		if(isElementDisplayed(addExpense_Button_Xpath) && isElementEnabled(addExpense_Button_Xpath))
	 	{
			flag=true;
			softAssert.assertEquals(flag, true);
			Log.info("Expense Updated");
	 	}
		else
		{
			flag=false;
			softAssert.assertEquals(flag, true);
			Log.info("Expense not updated");
		}
		softAssert.assertAll();
		return GetInstance(ExpensePage.class);
	}
	
		@Step("{method}")
		public ExpensePage DeleteBill() {
			SoftAssert softAssert = new SoftAssert();
			boolean flag= true;
			untilPageLoadComplete();
			waitForElementVisible(DeleteBillIcon_xpath);
			waitForElementToClickable(DeleteBillIcon_xpath);
			waitAndClickWebElement(DeleteBillIcon_xpath);
			waitForElementVisible(Delete_expense_butotn);
			waitForElementToClickable(Delete_expense_butotn);
			waitAndClickWebElement(Delete_expense_butotn);
			waitForElementVisible(SuccessMessageEdit_Toast_xpath);		
			flag = isElementDisplayed(DeleteBillIcon_xpath);
			if(flag==false)
			{
				Log.info("Bill Deleted");
				softAssert.assertEquals(flag, false);
				
			}
			else {
				Log.info("Bill is present");
				softAssert.assertEquals(flag, false);
				
			}
			softAssert.assertAll();
			return GetInstance(ExpensePage.class);
		}
	
		
		
}
