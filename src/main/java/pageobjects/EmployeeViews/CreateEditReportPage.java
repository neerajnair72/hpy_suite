package pageobjects.EmployeeViews;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.util.List;

public class CreateEditReportPage extends TestBotElementsWrapper {

	@FindBy(xpath = "//span[text()='EDIT report']")
	private WebElement reportAssertion_text_xpath;

	@FindBy(xpath = "//div[text()='Edit Report']")
	private WebElement reportEdit_button_xpath;

	/**
	 * @return the reportEdit_button_xpath
	 */
	public WebElement getReportEdit_button_xpath() {
		return reportEdit_button_xpath;
	}

	/**
	 * @return the reportAssertion_text_xpath
	 */
	public WebElement getReportAssertion_text_xpath() {
		return reportAssertion_text_xpath;
	}

	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement new_reportsButton_xpath;

	@FindBy(xpath = "(//a[text()='View '])[1]")
	private WebElement viewButton;

	@FindBy(xpath = "//span[text()='next']")
	private WebElement next_Button_xpath;

	@FindBy(xpath = "//span[text()='update']/..")
	private WebElement update_button_xpath;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement save_button_xpath;

	/**
	 * @return the update_button_xpath
	 * @throws InterruptedException
	 */
	@Step("{method}")
	public CreateEditReportPage clickUpdate_button_xpath() throws InterruptedException {
		waitAndClickWebElement(update_SubmitButton_xpath);
		waitForElementVisible(save_button_xpath);

		return this;
	}

	@FindBy(xpath = "//button/div/span[text()='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//button/div/span[text()='Edit']")
	private WebElement editButton;

	@FindBy(xpath = "//button/div/span[contains(text(),'Attach a TRF')]")
	private WebElement attach_a_trfButton;

	@FindBy(xpath = "//span[text()='Add New Expense']")
	private WebElement add_new_expenseButton;

	@FindBy(id = "currency_amount")
	private WebElement enterAmount;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveExpense;

	@FindBy(xpath = "//span[text()='Attach Existing Expense']")
	private WebElement attach_existing_expenseButton;

	@FindBy(xpath = "//button/span[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//span[text()='Submit']/..")
	private WebElement submitButton;

	@FindBy(xpath = "//span/i[text()='file_download']")
	private WebElement report_downloadIcon;

	@FindBy(xpath = "//div[@class='mdl-layout__header-row']/div[3]/img")
	private WebElement crossButton;

	@FindBy(xpath = "//div[contains(text(),'ID')]")
	private WebElement reportID;

	@FindBy(xpath = "//div[contains(text(),'Role')]")
	private WebElement reciever;

	@FindBy(xpath = "(//a[text()='Edit '])[1]")
	private WebElement editFirstReport;

	@FindBy(xpath = "(//span[text()='Submit'])[1]")
	private WebElement submitFirstReport;

	@FindBy(xpath = "//div[text()='CREATE REPORT']")
	private WebElement createReport;

	@FindBy(xpath = "//div[text()='Report created successfully.']")
	// @FindBy(xpath="//div[@class='customToastContent']")
	private WebElement reportCreateText;

	@FindBy(xpath = "//div[text()='Transaction added successfully.']")
	private WebElement TxnAddText;

	@FindBy(xpath = "//span[text()='Transaction updated successfully.']")
	private WebElement TxnUpdateText;

	@FindBy(xpath = "//div[text()='Successfully Submitted']")
	private WebElement submitText;

	@FindBy(xpath = "//span[text()='YES']")
	private WebElement Yes;

	public WebElement getYes() {
		return Yes;
	}

	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	private WebElement latestreportView;

	public WebElement getLatestreportView() {
		return latestreportView;
	}

	@FindBy(xpath = "//span[text()='file_download']")
	private WebElement filedownlaodicon;

	@FindBy(xpath = "//div[contains(text(),'PDF With Invoices')]")
	private WebElement pdfwithinvoice;

	@FindBy(xpath = "//div[contains(text(),'PDF Without Invoices')]")
	private WebElement pdfwithoutinvoice;

	@FindBy(xpath = "//div[contains(text(),'Excel')]")
	private WebElement downloadexcel;

	@FindBy(xpath = "html/body/div[1]/div/div[1]/div/div/span")
	private WebElement displayedmsgforpdfwithinvoice;

	public WebElement getDisplayedmsgforpdfwithinvoice() {
		return displayedmsgforpdfwithinvoice;
	}

	@FindBy(xpath = "(//span[contains(text(),' Info')])[1]")
	private WebElement Reportinfo;

	@FindBy(xpath = "//h3[contains(text(),'Report Details')]")
	private WebElement InfoDetailspopup;

	public WebElement getInfoDetailspopup() {
		return InfoDetailspopup;
	}

	@FindBy(xpath = "//span[text()='Close']")
	private WebElement Closepopup;

	@FindBy(xpath = "//input[@value='Status']")
	private WebElement StatusNamesDropdown;

	public WebElement getStatusNamesDropdown() {
		return StatusNamesDropdown;
	}

	@FindBy(xpath = "(//input[@ placeholder='search'])")
	private WebElement statusSearchfield;

	@FindBy(xpath = "//span[text()='10.00']/../../../../..//img[@src='actions-icon.svg']")
	private WebElement selectedExpenseOptionsbutton;

	@FindBy(xpath = "(//span[text()='Submit'])[1]")
	private WebElement latestreport;

	@FindBy(xpath = "html/body/div[10]/div/div[2]//span[text()='Saved Report']")
	private WebElement filterallsavedreports;

	@FindBy(xpath = "(//td[@tabindex='2'])[1]")
	private WebElement reportid;

	@FindBy(xpath = "//span[text()='Attach a TRF']")
	private WebElement addTRFButton;

	@FindBy(xpath = "//div[text()='Split']")
	private WebElement splitOption;

	@FindBy(name = "randomname")
	private List<WebElement> amountField;

	@FindBy(xpath = "//input[@value='Select Category']")
	private List<WebElement> categoryDropdowns;

	@FindBy(xpath = "//li[text()='Food']")
	private WebElement foodCategoryOption;

	@FindBy(xpath = "//img[@src='actions-icon.svg']")
	private List<WebElement> expenseCountInsideReport;

	@FindBy(xpath = "//span[text()='Done']")
	private WebElement doneButton;

	@FindBy(xpath = "//div[text()='Split Expense']")
	private WebElement splitFailureValidation;

	// Extra field locators

	@FindBy(xpath = "//div[@class='attachment-inner-label']/input")
	private WebElement bill_UploadButton_xpath;

	@FindBy(xpath = "//span[text()='update']")
	private WebElement update_SubmitButton_xpath;

	@FindBy(xpath = "//div[@class='customToastContent']")
	private WebElement imageLimit_toastMessage_xpath;

	@FindBy(xpath = "//div[@class='chipClass']")
	private WebElement uploadedImageCheck_button_xpath;

	@FindBy(name = "Report_TextField_EF")
	private WebElement report_text_name;

	@FindBy(name = "Report_Number_EF")
	private WebElement report_number_name;

	@FindBy(xpath = "//button[@tabindex='0']/span[contains(@style,'rgb(255, 255, 255)')]")
	private WebElement calendarDate_button_xpath;

	@FindBy(xpath = "//input[contains(@id,'undefined-ReportDateEF')]")
	private WebElement calendarField_input_xpath;

	@FindBy(xpath = "//input[contains(@id,'undefined-Selecttime')]")
	private WebElement timeField_input_xpath;

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement timeOK_button_xpath;

	@FindBy(name = "Report_AccountNumber_EF")
	private WebElement accNum_input_name;

	@FindBy(name = "Confirm Report_AccountNumber_EF")
	private WebElement confirmAccNum_input_name;

	@FindBy(name = "Report_IFSC_EF")
	private WebElement ifsc_input_name;

	@FindBy(xpath = "//input[@name = 'Branch Name']")
	private WebElement ifscBranch_text_name;

	@FindBy(xpath = "//input[@name = 'Bank Name']")
	private WebElement ifscBank_text_name;

	@FindBy(name = "Report_PREFIX_EF")
	private WebElement prefix_input_name;

	@FindBy(name = "Report_POSTFIX_EF")
	private WebElement postfix_input_name;

	@FindBy(name = "Report_MultiselectDropDown_EF")
	private WebElement multiselect_input_name;

	@FindBy(xpath = "//input[@type='checkbox']/..")
	private List<WebElement> multicheck_options_xpath;

	@FindBy(xpath = "//div[text()='Select date range']/..//input")
	private List<WebElement> dateRange_dates_xpath;

	@FindBy(xpath = "//div[@class='customToastContent']")
	private WebElement toastMessage;

	@FindBy(name = "Report_DropDown_EF")
	private WebElement dropdown_input_name;

	@FindBy(name = "Report_Text_Mandatory_EF")
	private WebElement mandatory_text_name;

	@FindBy(name = "Report_Text_Readonly_EF")
	private WebElement readonly_text_name;

	@FindBy(name = "Report_Number_Dependent_EF")
	private WebElement dependent_number_name;

	@FindBy(name = "Report_Text_Dependent_NonStatic_EF")
	private WebElement nonStaticDependent_text_name;

	@FindBy(xpath = "//span[text()='International Travel Expense']")
	private WebElement dropdownOption_option_xpath;

	@FindBy(xpath = "//span[text()='Mobile Reimbursement']")
	private WebElement mobileReimbursement_option_xpath;

	/** The expense URL. */
	private static String expenseURL = TestBotBase.getProperty("Expense_URL");


	/*@Step("{method}")
	public void createReport() {

		waitAndClickWebElement(GetInstance(CommonPageElements.class).getReports_Link_xpath());
		waitAndClickWebElement(GetInstance(ReportsPage.class).getNewRreport_Button_xpath());
		mandatory_text_name.sendKeys("text");
		waitAndClickWebElement(next_Button_xpath);

	}*/

	@Step("{method}")
	public CreateEditReportPage imageUploadAndAssert(SoftAssert softAssert) {
		File f = new File("./src/test/resources/imgData/1.png");
		bill_UploadButton_xpath.sendKeys(f.getAbsolutePath());
		softAssert.assertEquals(uploadedImageCheck_button_xpath.getText(), "Files-1");
		softAssert.assertAll();
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage fillTextEF(String textEFData) {
		report_text_name.sendKeys(textEFData);
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage textMandatorytest(String textEFData, SoftAssert softAssert) throws InterruptedException {

		doubleClick(mandatory_text_name);
		mandatory_text_name.sendKeys(Keys.DELETE);
		waitAndClickWebElement(update_button_xpath);
		waitForElementVisible(toastMessage);
		softAssert.assertEquals(toastMessage.getText(), "Please fill the field - Report_TextField_EF");
		mandatory_text_name.sendKeys(textEFData);

		// this.clickUpdate_button_xpath();
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage fillNumberEF(String numberEFData) {
		report_number_name.sendKeys(numberEFData);
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage fillDateEF() {
		waitAndClickWebElement(calendarField_input_xpath);
		waitAndClickWebElement(calendarDate_button_xpath);

		return this;
	}

	@Step("{method}")
	public CreateEditReportPage fillTimeEF() throws InterruptedException {
		waitAndClickWebElement(timeField_input_xpath);
		waitAndClickWebElement(timeOK_button_xpath);
		return this;

	}

	@Step("{method}")
	public CreateEditReportPage fillAccEF(String accNum) {
		ScrollToElement(accNum_input_name);
		accNum_input_name.sendKeys(accNum);

		return this;
	}

	@Step("{method}")
	public CreateEditReportPage confirmAccEF(String accNum) {
		ScrollToElement(confirmAccNum_input_name);
		confirmAccNum_input_name.sendKeys(accNum);

		return this;
	}

	@Step("{method}")
	public CreateEditReportPage ifsc(String ifsc, SoftAssert softAssert) throws InterruptedException {
		ScrollToElement(ifsc_input_name);
		ifsc_input_name.sendKeys(ifsc);
		waitForElementVisible(ifscBank_text_name);
		waitForElementVisible(ifscBranch_text_name);
		softAssert.assertEquals(ifscBranch_text_name.getAttribute("value").toString(), "BANGALORE",
				"branch name assertion for IFSC EF");
		softAssert.assertEquals(ifscBank_text_name.getAttribute("value").toString(), "CITI BANK",
				"bank name assertion for IFSC EF");
		softAssert.assertAll();
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage prefix(String prefix) {
		ScrollToElement(prefix_input_name);
		prefix_input_name.sendKeys(prefix);
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage dropdown() {
		ScrollToElement(dropdown_input_name);
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage postfix(String postfix) {
		ScrollToElement(postfix_input_name);
		postfix_input_name.sendKeys(postfix);
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage multiselectDD() {
		ScrollToElement(multiselect_input_name);
		waitAndClickWebElement(multiselect_input_name);
		waitAndClickWebElement(multicheck_options_xpath.get(2));
		waitAndClickWebElement(multicheck_options_xpath.get(3));
		waitAndClickWebElement(multiselect_input_name);
		waitForElementToClickable(multiselect_input_name);
		waitAndClickWebElement(multiselect_input_name);

		return this;
	}

	// dateRange_dates_xpath
	@Step("{method}")
	public CreateEditReportPage dateRange() throws InterruptedException {
		ScrollToElement(dateRange_dates_xpath.get(0));
		waitAndClickWebElement(dateRange_dates_xpath.get(0));
		waitAndClickWebElement(calendarDate_button_xpath);
		waitAndClickWebElement(dateRange_dates_xpath.get(1));
		waitAndClickWebElement(calendarDate_button_xpath);

		return this;
	}

	@Step("{method}")
	public CreateEditReportPage checkReadonlyTextField(SoftAssert softAssert) {

		ScrollToElement(readonly_text_name);
		waitForElementVisible(readonly_text_name);
		softAssert.assertNotEquals(readonly_text_name.getAttribute("disabled"), null);
		// this.clickUpdate_button_xpath();
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage dependentFieldTest(SoftAssert softAssert, String numberInput) {
		ScrollToElement(dropdown_input_name);
		try {
			dependent_number_name.isDisplayed();
			softAssert.assertTrue(false,
					"dependent field should not be displayed without the parent field being filled");
		} catch (Exception e) {
			// TODO: handle exception
			softAssert.assertTrue(true,
					"dependent field should not be displayed without the parent field being filled");
		}
		waitAndClickWebElement(dropdown_input_name);
		waitAndClickWebElement(dropdownOption_option_xpath);
		try {
			dependent_number_name.isDisplayed();
			softAssert.assertEquals(dependent_number_name.getText(), "420");
			softAssert.assertTrue(true,
					"dependent field should not be displayed without the parent field being filled");
		} catch (Exception e) {
			// TODO: handle exception
			softAssert.assertTrue(false,
					"dependent field should not be displayed without the parent field being filled");
		}

		// this.clickUpdate_button_xpath();
		return this;
	}

	@Step("{method}")
	public CreateEditReportPage dependentNonStaticFieldTest(SoftAssert softAssert, String textInput) {
		ScrollToElement(dropdown_input_name);
		try {
			nonStaticDependent_text_name.isDisplayed();
			softAssert.assertTrue(false,
					"dependent field should not be displayed without the parent field being filled");
		} catch (Exception e) {
			// TODO: handle exception
			softAssert.assertTrue(true,
					"dependent field should not be displayed without the parent field being filled");
		}
		waitAndClickWebElement(dropdown_input_name);
		waitAndClickWebElement(mobileReimbursement_option_xpath);
		try {
			nonStaticDependent_text_name.isDisplayed();
			writeText(nonStaticDependent_text_name, textInput);
			softAssert.assertTrue(true,
					"dependent field should not be displayed without the parent field being filled");
		} catch (Exception e) {
			// TODO: handle exception
			softAssert.assertTrue(false,
					"dependent field should not be displayed without the parent field being filled");
		}

		
		return this;
	}

//	public void reportActions(SoftAssert softAssert, EFType efType, Map efData,
//			EFSetting efSetting) throws InterruptedException {
//
//		if (efType.equals(EFType.NONE) && efSetting.equals(EFSetting.NONE))// Create txn with all native fields
//		{
//			this.createReport();
//		} 
//		else if (efType.equals(EFType.ALL) && efSetting.equals(EFSetting.NONE))// Create txn with all native field +
//		// extra field
//		{
//
//			this.fillTextEF(efData.get(EFType.TEXT).toString());
//			this.imageUploadAndAssert(softAssert);
//			this.fillNumberEF(efData.get(EFType.NUMBER).toString());
//			this.fillDateEF();
//			this.fillTimeEF();
//			this.fillAccEF(efData.get(EFType.ACCOUNT).toString());
//			this.confirmAccEF(efData.get(EFType.ACCOUNT).toString());
//			this.ifsc(efData.get(EFType.IFSC).toString(), softAssert);
//			this.prefix(efData.get(EFType.PREFIX).toString());
//			this.postfix(efData.get(EFType.POSTFIX).toString());
//			this.multiselectDD();
//			this.dateRange();
//			this.clickUpdate_button_xpath();
//		}
//		else if (efSetting.equals(EFSetting.READONLYPERMISSION) && efType.equals(EFType.TEXT)) {
//			this.checkReadonlyTextField(softAssert).clickUpdate_button_xpath();
//		}
//		else if (efSetting.equals(EFSetting.MANDATORY) && efType.equals(EFType.TEXT)) {
//			this.textMandatorytest(efData.get(efType).toString(), softAssert, pageGenerator).clickUpdate_button_xpath();
//		}
//		else if (efSetting.equals(EFSetting.DEPENDENT) && efType.equals(EFType.NUMBER)) {
//			this.dependentFieldTest(softAssert, efData.get(EFType.NUMBER).toString()).clickUpdate_button_xpath();
//		} 
//		else if (efSetting.equals(EFSetting.DEPENDENT) && efType.equals(EFType.TEXT)) {
//			this.dependentNonStaticFieldTest(softAssert, efData.get(EFType.TEXT).toString()).clickUpdate_button_xpath();
//		}
//
//		
//	}

	/*@Override
	protected void load() {
		// TODO Auto-generated method stub
		this.driver.get(expenseURL);
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		try {
			assertTrue("LoginPage is not loaded!", driver.getCurrentUrl().contains(expenseURL));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}



/*
 * switch (efType) { case None : this.createReport(pageGenerator); break; case
 * All: this.fillTextEF(efData.get(efType).toString());
 * this.imageUploadAndAssert(softAssert);
 * this.fillNumberEF(efData.get(efType).toString()); this.fillDateEF();
 * this.fillTimeEF(); this.fillAccEF(efData.get(efType).toString());
 * this.confirmAccEF(efData.get(efType).toString());
 * this.ifsc(efData.get(efType).toString(), softAssert);
 * this.prefix(efData.get(efType).toString());
 * this.postfix(efData.get(efType).toString()); this.multiselectDD();
 * this.dateRange(); break;
 * 
 * default: break; }
 */
