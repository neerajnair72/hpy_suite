package pageobjects.EmployeeViews;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.Log;
import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonContainerElementsPage;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.CommonViews.CommonTableElementsPage;


public class LoadRequestsPage extends TestBotElementsWrapper {


	public XSSFRow PartialAmount;
	public XSSFRow PartialAmountfin;
	public CommonTableElementsPage commonTableElementsPage;
	public CommonContainerElementsPage commonContainerElementsPage;



	/**
	 * The New Advance Request button
	 */
	@FindBy(how = How.XPATH, using = "//button[@type='button' and @class='hw-btn hw-btn-primary hw-btn-normal false undefined']")
	@CacheLookup
	private WebElement New_Advancerequest_button_xpath;
	/**
	 * The New Advance Request button from home page
	 */

	@CacheLookup
	//@FindBy(xpath="//button//span[text()='New Advance Request']/..")
	@FindBy(xpath = "//button[@class='secondaryButton']/div/span/span/span[text()='New Advance Request']")
	private WebElement NewAdvanceButtonHome_button_xpath;
	
	/** Amount field in MR screen */
	@FindBy(xpath = "(//input[@type='text' and @placeholder='e.g. 100'])[1]")
	@CacheLookup
	private WebElement Amount_Text_Name;
	
	/** Reason field in MR Screen */
//@FindBy(name="Reason")
	@FindBy(xpath="//input[@placeholder='e.g. Advance for client expenses']")
	@CacheLookup
	private WebElement Reason_Text_Name;
	/** Reason field in MR extra field 'MR_TextMandatory_EF' */
	@FindBy(name = "MR_TextMandatory_EF")
	@CacheLookup
//@FindBy(xpath="//div/input[@name='MR_TextMandatory_EF']")
	private WebElement TextMandatory_EF_Name;
	/** Click on Submit button */
//@FindBy(className = "primaryButton")
	@FindBy(xpath="//button[@type='button' and text()='Submit']")
	@CacheLookup
	private WebElement Submit_button_ClassName;
	
	@FindBy(xpath="(//i[@class='hw-icons icon-circle padding-10  icon-cross font-20 rotate-0'])[1]")
	@CacheLookup
	private WebElement CrossIconButtonInMRCreationPage;
	/** Cancel button in MR screen */
	@FindBy(xpath = "//div/button/span[text()='Cancel']")
	@CacheLookup
	private WebElement Cancel_button_xpath;
	/** Success toast Message */
	@FindBy(xpath = "//div[@class='customToast showCustomToast']")
//@FindBy(xpath = "//div[@class='customToastContent']")
	@CacheLookup
	private WebElement SuccessMessage_Toast_xpath;
	
	/** MR toast Message */
	@FindBy(xpath = "//div[@class='customToastContent']")
	@CacheLookup
	private WebElement MR_SuccessMessage_Toast_xpath;
	
	
	/** MR toast Message icon.. */
	@FindBy(xpath = "//img[@src='/assets/images/toast-error.svg']")
	@CacheLookup
	private WebElement MR_Fail_ToastMessage_Icon_xpath;
	
	
	/** Exrea field in MR create page text field */
	@FindBy(xpath = "//div/input[@name='MR_Text_EF']")
	@CacheLookup
	private WebElement MRExtrafield_Text_xpath;
	/** Date Field in MR screen */
	@FindBy(xpath = "//div/div[text()='MR_Date_EF']")
	@CacheLookup
	private WebElement DateExtrafiled_Date_Xpath;
	/** Date Extra Field */
// @FindBy(xpath="//span [@style='color: rgb(255, 255, 255); font-weight:
// 400; position: relative;']")
	@FindBy(xpath = "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	@CacheLookup
	private WebElement Today_Date_xpath;
	/** Bank Account Number field */
// @FindBy(xpath="//div/div[text()='MR_BankAcc_EF']")
	@FindBy(xpath = "//div/input[@name='MR_BankAcc_EF']")
	@CacheLookup
	private WebElement BankAcc_input_xpath;
	/** Confirm Bank Acc */
// @FindBy(xpath="//div/div[text()='Confirm MR_BankAcc_EF']")
	@FindBy(xpath = "//div/input[@name='Confirm MR_BankAcc_EF']")
	@CacheLookup
	private WebElement ConfirmBankAcc_input_xpath;
	/** Date Range */
	@FindBy(xpath = "//div[text()='Select date range']/..//input")
	@CacheLookup
	private List<WebElement> dateRange_dates_xpath;
	/** Drop Down */
// @FindBy(name="MR_Dropdown_EF")
// @FindBy(xpath="//div/input[@name='MR_Dropdown_EF']")
	@FindBy(xpath = "(//div/input[@value='Please select'])[1]")
	@CacheLookup
	private WebElement DropDown_input_name;
	/** Drop down value */
	@FindBy(xpath = "//div/span[@title='MR1']")
	@CacheLookup
	private WebElement DropDownvalue_input_xpath;
	/** MultiSelect Drop Down */
	@FindBy(name = "MR_MultiSelectDropDown_EF")
	@CacheLookup
	private WebElement multiselect_input_name;
	/** Mukti checkbox */
	@FindBy(xpath = "//input[@type='checkbox']/..")
	@CacheLookup
	private List<WebElement> multicheck_options_xpath;
	/** IFSC */
	@FindBy(name = "MR_IFSC_EF")
	@CacheLookup
	private WebElement ifsc_input_name;
	/** IFSC Branch Name */
	@FindBy(xpath = "//input[@name = 'Branch Name']")
	private WebElement ifscBranch_text_xpath;
	/** IFSC Bank Name */
	@FindBy(xpath = "//input[@name = 'Bank Name']")
	private WebElement ifscBank_text_xpath;
	/** Number extra field */
	@FindBy(name = "MR_Number_EF")
	private WebElement Number_input_name;
	/** Time Field */
	@FindBy(xpath = "//input[contains(@id,'undefined-Selecttime')]")
	private WebElement timeField_input_xpath;
	/** Time OK Button */
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement timeOK_button_xpath;
	/** FILE Attachment */
// @FindBy(xpath = "//div[@class='attachment-inner-label']/input")
	@FindBy(xpath = "//div[text()='MR_FileAttachment_EF']/input")
	private WebElement File_UploadButton_xpath;
	/** Assert for attached File */
	@FindBy(xpath="//div[text()='Upload More Invoices']")
	//@FindBy(xpath = "//div/img[@class='icon-list-item']")
	//@FindBy(xpath="//img[@alt='Upload More Invoices']")
	@CacheLookup
	private WebElement uploadedImageCheck_button_xpath;

	/** Prefix */
	@FindBy(name = "MR_Prefix_EF")
	private WebElement Prefix_name;
	/** PostFix */
	@FindBy(name = "MR_Postfix_EF")
	private WebElement Postfix_name;
	/** New UI latest pending MR */
	@FindBy(xpath="(//td/div[text()='MR Automation Test'])[1]")
//@FindBy(xpath="(//td/div[text()=' Pending at Manager'])[1]")
	private WebElement LatestEmployeePendingMR;
	/** Get MR Id for manager in employee view */
	@FindBy(xpath="//div[text()='Request ID']")
	private WebElement MRID;
	/** click close button on pending MR */
	@FindBy(xpath = "//span[@data-tooltip='Close']")
	private WebElement closePMR;
	/** open first/latest pending MR to get MR id */
	@FindBy(xpath="(//div[text()=' Pending'])[1]")
	private WebElement openPMR_xpath;
	/** open first/latest pending MR to get MR id in OUP ORG */
	@FindBy(xpath="(//div[text()=' Pending at Manager'])[1]")
	private WebElement openPMR_xpath_OUP;
	/** Open Latest approved MR to get MR id in finance side */
	@FindBy(xpath="(//div[text()=' Approved MR'])[1]")
	private WebElement OpenPMR_xpath;
	/** Open Latest approved MR to get MR id in finance side */
	@FindBy(xpath="(//div[text()=' Pending at Finance'])[1]")
	private WebElement OpenPMR_xpath_OUP;
	/** Toggle view */
	@FindBy(xpath="//div/img[@src='/assets/images/toggle.svg']")
	private WebElement Toggle_Button_xpath;

	/** The expense action hamburger icon xapth */
	//@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	@FindBy(xpath = "(//td[@class='actionColumnHoverClass'])[1]/div")
	public static WebElement View_button_xpath;


	/** The expense action hamburger icon xapth */
	//@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	@FindBy(xpath = "//td[@class='tableStatusColumnClass']/div[text()='Verified']/../following-sibling::td[17]/div/img")
	public static WebElement modified;




	/** The expense action hamburger icon xapth */
	//@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	@FindBy(xpath = "//td[@class='tableStatusColumnClass']/div[contains(text(),'Pending at Finance')]/../following-sibling::td[17]/div/img")
	public static WebElement modified2;




	/** The expense action hamburger icon xapth */
	//@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	@FindBy(xpath = "//td[@class='tableStatusColumnClass']/div[contains(text(),'Declined')]/../following-sibling::td[17]/div/img")
	public static WebElement modified3;


	/** Click on detailed view of pending MR in privileged view */
//@FindBy(xpath = "//div/div[text()='Detailed View']")
	@FindBy(xpath="//div[text()='Detailed view']")
	private WebElement Detailed_view_button_xpath;
	/** Decline button in manager side */
	@FindBy(xpath = "//button[@type='button' and text()='Decline']")
	private WebElement Decline_button_xpath;
	/** Allow button in manager side */
	@FindBy(xpath = "//button[@type='button' and text()='Accept']")
	private WebElement ManagerAllow_Button_xpath;
	/** History tab in manager side */
	@FindBy(xpath = "//div[contains(text(),'History')]")
	private WebElement HistoryTab_Button_xpath;
	/** manager Decline state o */
	@FindBy(xpath = "//div[@class='audit-trail-status-name' and text()='DeclinedByManager']")
	private WebElement DeclineState_xpath;
	/** manager Decline state o */
	@FindBy(xpath = "//div[@class='audit-trail-status-name' and text()='DeclinedByFinance']")
	private WebElement Finance_DeclineState_xpath;
	/** Pending at Finance state in manager */
	@FindBy(xpath = "//div[@class='audit-trail-status-name' and text()='Approved']")
	private WebElement ApprovedState_xpath;
	/** Verfied state */
	@FindBy(xpath = "//div[text()='Verified']")
	private WebElement VerifiedState_xpath;
	/** Allow button in manager side IN OUP */
	//@FindBy(xpath = "//span[text()='Decline']/..")
	@FindBy(xpath = "//button[@class='primaryButton']/div/span[text()='Decline']")
	private WebElement ManagerDecline_Button_xpath_OUP;

	/** Load Request menu in privileged side */
	@FindBy(xpath = "//a[text()='LOAD REQUESTS']")
	private WebElement LOADREQUEST_Button_xpath;
	
	/** Load Request menu in privileged side */
	@FindBy(xpath = "//a[@id='MONEY_REQUEST']")
	private WebElement LOADREQUEST_Button_PrivilegedView_xpath;

	/**Total Money Request Count */
	@FindBy(xpath = "(//span[@style=\"font-family: Roboto-Medium;\"])[2]")
	private  WebElement MoneyRequestTotalCount;

	/** Click on Home menu */
	@FindBy(xpath="//div[text()='HOME']")
	private WebElement Home_Button_xpath;

	/** partial amount approval field */
	@FindBy(xpath = "(//input[@type='text' and @class=' searchFilterTextInput'])[1]")
	private WebElement partial_amount_xpath;
	/** Decline in Manager/finance side */
	@FindBy(xpath = "//span[text()='Decline']")
	private WebElement decline_button_xpath;
	/** Upload file button */
	@FindBy(xpath = "//div/input[@id='myFile']")
	@CacheLookup
	private WebElement Uploadfile_id;
	
	
	
	/** Upload file button */
	@FindBy(xpath = "//input[@type='file' and @id='myFile']")
	@CacheLookup
	private WebElement UploadMoreInvoices_id;
	
	/** Company balance */
	@FindBy(xpath = "//div[@class='hdr-Wallet-section-privilege-balance']")
	private WebElement CompanyBalance;
	/** User wallet Amount */
	@FindBy(xpath = "//tr/td/a[contains(text(),'Ajeet Gour')]//ancestor::tr/td[4]")
	private WebElement UserWalletAmount;
	/**
	 * User Page link
	 */
	@FindBy(xpath = "//a[text()='USERS']")
	private WebElement UserPageLink_button_xpath;
	/**
	 * Click on Export button
	 */
	@FindBy(xpath = "//span[@data-tip='Export']")
	private WebElement Export_button_xpath;
	
	/**
	 * More button on MR detailed view
	 */
	@FindBy(xpath = "//button[@type='button' and text()='More']")
	private WebElement More_button_xpath;
	
	
	/**
	 * Edit button on MR detailed view
	 */
	@FindBy(xpath = "//div[text()='Edit']")
	private WebElement EditMR_Button_Xpath;
	
	/**
	 * MR amount field
	 */
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement MRAmountField_Xpath;
	
	
	/**
	 * MR Wallet field
	 */
	@FindBy(xpath = "//input[@placeholder='Wallet']")
	private WebElement MRWallet_Xpath;
	
	/**
	 * More button on MR detailed view
	 */
	@FindBy(xpath = "//button[@type='button' and text()='Submit']")
	private WebElement SubmitMR_Button_Xpath;;
	
	/**
	 * PDF with invoices button
	 */
	@FindBy(xpath = "//div[text()='PDF With Invoices']")
	private WebElement PDFWithInvoices_option_xpath;
	
	/**
	 * PDF without invoices button
	 */
	@FindBy(xpath = "//div[text()='PDF Without Invoices']")
	private WebElement PDFWithoutInvoices_option_xpath;
	/**
	 * Download button in export
	 */
	@FindBy(xpath = "//div/div[text()='Download']")
	private WebElement DownloadExport_button_xpath;
	/**
	 * Download button in export
	 */
	@FindBy(xpath = "//div/div[text()='Workflow Comments']")
	private WebElement DownloadWorkflow_button_xpath;
	/**
	 * The Money Request Tab
	 */
	@FindBy(how = How.XPATH, using = "//div/nav/a[text()='LOAD REQUESTS']")
	@CacheLookup
	private WebElement MoneyRequest_Button_xpath;
	/**
	 * Email field in Export
	 */
	@FindBy(xpath = "(//div/input[@type='text'])[6]")
	private WebElement EmailExport_text_xpath;
	/**
	 * Email field in Export workflow
	 */
	@FindBy(xpath = "//input[@type='text' and @placeholder='Add Mail Id & Press Enter']")
	private WebElement EmailExportWorkflow_text_xpath;
	/**
	 * Download button in export after entering email
	 */
	@FindBy(xpath = "//button[@type='button' and text()='Download']")
	private WebElement Downloadbutton_button_xpath;

	@FindBy(xpath="(//td//div[contains(text(),'MR Automation Test')])[1]")
	private WebElement VerifyMR_pendingList_xpath_OUP;

	@FindBy(xpath = "//tr[1]/td[@tabindex='2']/div")
	private  WebElement MRCreationDate;
	
	/*
	 * Resumit button on declined MR
	 */
	@FindBy(xpath = "//button[text()='Resubmit']")
	private  WebElement resubmitButton_Xpath;
	
	/*
	 * Recall button on declined MR
	 */
	@FindBy(xpath = "//button[text()='Recall']")
	private  WebElement recallButton_Xpath;
	
	/*
	 * proceed button on declined MR
	 */
	@FindBy(xpath = "//button[text()='Proceed']")
	private  WebElement proceedButton_Xpath;

	public boolean isStale(WebElement e){
		try{
			e.isDisplayed();
			return false;
		}catch(StaleElementReferenceException ex){
			return true;
		}
	}

	public WebElement getUserPageLink() {
		waitForElementVisible(UserPageLink_button_xpath);
		waitForElementToClickable(UserPageLink_button_xpath);
		waitAndClickWebElement(UserPageLink_button_xpath);
		return UserPageLink_button_xpath;
	}

	public WebElement getCompanyBalance() {
		return CompanyBalance;
	}


	public LoadRequestsPage imageUploadAndAssert(SoftAssert softassert){
		SoftAssert softAssert = new SoftAssert();
		//isStale(Uploadfile_id);
		((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		//RetryingFind(Uploadfile_id,"./src/test/resources/imgData/2.png");
		//Uploadfile_id.sendKeys("./src/test/resources/imgData/2.png");
//		Uploadfile_id.sendKeys("/Users/ltuser/Downloads/Screenshot 2021-08-25 at 9.50.47 PM.png");
		//For mac OS use below line
		Uploadfile_id.sendKeys("/Users/ltuser/Downloads/1.png");
		
		//For windows OS use below line
		//Uploadfile_id.sendKeys("C:\\Users\\ltuser\\Downloads\\1.png");
		
		//Uploadfile_id.sendKeys("./src/test/resources/imgData/3.png");
		
		isElementDisplayed(uploadedImageCheck_button_xpath);
		//waitForText(uploadedImageCheck_button_xpath,"Upload More Invoices");
		softAssert.assertAll();
		return  GetInstance(LoadRequestsPage.class);
	}
	
	public LoadRequestsPage uploadMaxBills() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		// isStale(Uploadfile_id);
		//((RemoteWebDriver) getThreadSafeDriver()).setFileDetector(new LocalFileDetector());
		// RetryingFind(Uploadfile_id,"./src/test/resources/imgData/2.png");
		
//		For mac OS use below line
		Uploadfile_id.sendKeys("/Users/ltuser/Downloads/1.png");

		// For windows OS use below line
		//Uploadfile_id.sendKeys("C:\\Users\\ltuser\\Downloads\\1.png");
		isElementDisplayed(uploadedImageCheck_button_xpath);
		softAssert.assertAll();
		return GetInstance(LoadRequestsPage.class);
	}

	public Boolean RetryingFind(WebElement webElement,String s)
	{
		Boolean result = false;
		int attempts = 0;
		while (attempts < 2)
		{
			try
			{
				webElement.isDisplayed();
				webElement.sendKeys(s);
				result = true;
				break;
			}
			catch (StaleElementReferenceException e)
			{
				System.out.println(e.getMessage());
			}
			attempts++;
		}
		return result;
	}


	public void LoadRequestPrivileged() throws Exception{
		toggle();
		waitForElementVisible(LOADREQUEST_Button_PrivilegedView_xpath);
		waitForElementToClickable(LOADREQUEST_Button_PrivilegedView_xpath);
		waitAndClickWebElement(LOADREQUEST_Button_PrivilegedView_xpath);

	}


	public void allow_action() {

			isElementDisplayed(ManagerAllow_Button_xpath);
			waitForElementVisible(ManagerAllow_Button_xpath);
			waitAndClickWebElement(ManagerAllow_Button_xpath);

	}

	public void Decline_action(){
		isElementDisplayed(Decline_button_xpath);
		waitForElementVisible(Decline_button_xpath);
		waitAndClickWebElement(Decline_button_xpath);

	}


	public WebElement getMRID() {
		return MRID;

	}

	public LoadRequestsPage Export(XSSFRow rowData) {


		isElementDisplayed(Export_button_xpath);
		waitAndClickWebElement(Export_button_xpath);

		waitForElementVisible(DownloadExport_button_xpath);
		//isElementDisplayed(DownloadExport_button_xpath);
		waitAndClickWebElement(DownloadExport_button_xpath);
		//isElementDisplayed(EmailExport_text_xpath);
		waitForElementToClickable(EmailExport_text_xpath);
		writeText(EmailExport_text_xpath, rowData.getCell(3).toString());
		writeKeyboardText(EmailExport_text_xpath, Keys.ENTER);
		//isElementDisplayed(Downloadbutton_button_xpath);
		waitForElementVisible(Downloadbutton_button_xpath);
		waitForElementToClickable(Downloadbutton_button_xpath);
		waitAndClickWebElement(Downloadbutton_button_xpath);
		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage downloadWorkflowComments(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		isElementDisplayed(Export_button_xpath);
		waitForElementVisible(Export_button_xpath);
		waitAndClickWebElement(Export_button_xpath);
		isElementDisplayed(DownloadWorkflow_button_xpath);
		waitForElementVisible(DownloadWorkflow_button_xpath);
		waitAndClickWebElement(DownloadWorkflow_button_xpath);
		isElementDisplayed(EmailExportWorkflow_text_xpath);
		waitForElementVisible(EmailExportWorkflow_text_xpath);
		writeText(EmailExportWorkflow_text_xpath, rowData.getCell(3).toString());
		writeKeyboardText(EmailExportWorkflow_text_xpath, Keys.ENTER);
		isElementDisplayed(Downloadbutton_button_xpath);
		waitForElementVisible(Downloadbutton_button_xpath);
		waitAndClickWebElement(Downloadbutton_button_xpath);
		isElementDisplayed(MR_SuccessMessage_Toast_xpath);
		waitForElementVisible(MR_SuccessMessage_Toast_xpath);
		System.out.println("toast messaeg content: "+MR_SuccessMessage_Toast_xpath.getText());
		softAssert.assertEquals(MR_SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage downloadPDFWithInnvoices(XSSFRow rowData, String option) {
		SoftAssert softAssert = new SoftAssert();
		//click more button
		waitAndClickWebElement(More_button_xpath);
		//Select option called pdf with invoices
		if(option.contentEquals("PDF With Invoices"))
		{
			waitAndClickWebElement(PDFWithInvoices_option_xpath);
		}
		else if(option.contentEquals("PDF Without Invoices"))
		{
			waitAndClickWebElement(PDFWithoutInvoices_option_xpath);
		}
		
		isElementDisplayed(EmailExportWorkflow_text_xpath);
		waitForElementVisible(EmailExportWorkflow_text_xpath);
		writeText(EmailExportWorkflow_text_xpath, rowData.getCell(3).toString());
		writeKeyboardText(EmailExportWorkflow_text_xpath, Keys.ENTER);
		isElementDisplayed(Downloadbutton_button_xpath);
		waitForElementVisible(Downloadbutton_button_xpath);
		waitAndClickWebElement(Downloadbutton_button_xpath);
		waitForElementVisible(MR_SuccessMessage_Toast_xpath);
		System.out.println("toast messaeg content: "+MR_SuccessMessage_Toast_xpath.getText());
		softAssert.assertEquals(MR_SuccessMessage_Toast_xpath.getText(), rowData.getCell(4).toString().trim());
		softAssert.assertAll();
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage moreButtonVisibilityCheck()
	{
		boolean present = false;
		SoftAssert softAssert = new SoftAssert();
		try
		{
			if(More_button_xpath.isDisplayed())
			{
				present =true;
			}
		}
		catch(NoSuchElementException e)
		{
			present=false;
		}
		System.out.println("More button found: "+present);
		softAssert.assertEquals(false, present);
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage resubmitButtonVisibilityCheck()
	{
		boolean present = false;
		SoftAssert softAssert = new SoftAssert();
		try
		{
			if(resubmitButton_Xpath.isDisplayed())
			{
				present =true;
			}
		}
		catch(NoSuchElementException e)
		{
			present=false;
		}
		System.out.println("resubmit button found: "+present);
		softAssert.assertEquals(false, present);
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage recallButtonVisibilityCheck()
	{
		boolean present = false;
		SoftAssert softAssert = new SoftAssert();
		try
		{
			if(recallButton_Xpath.isDisplayed())
			{
				present =true;
			}
		}
		catch(NoSuchElementException e)
		{
			present=false;
		}
		System.out.println("recall button found: "+present);
		softAssert.assertEquals(false, present);
		return GetInstance(LoadRequestsPage.class);
	}
	
	@Step("{method}")
	public LoadRequestsPage viewMR()
	{

		waitForElementVisible(View_button_xpath);
		if(isElementDisplayed(View_button_xpath)==true){
			waitAndClickWebElement(View_button_xpath);
			waitForElementVisible(Detailed_view_button_xpath);
			isElementDisplayed(Detailed_view_button_xpath);
			waitAndClickWebElement(Detailed_view_button_xpath);
		}
		else {
			hardPageRefresh();
			waitAndClickWebElement(View_button_xpath);
			waitForElementVisible(Detailed_view_button_xpath);
			isElementDisplayed(Detailed_view_button_xpath);
			waitAndClickWebElement(Detailed_view_button_xpath);
		}
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage resubmitMR()
	{
		editMrForResubmission();
		waitForElementVisible(resubmitButton_Xpath);
		System.out.println("resubmit button is visible now: ");
		waitAndClickWebElement(resubmitButton_Xpath);
		//Assert.assertEquals(MR_SuccessMessage_Toast_xpath.getText().trim(), message);
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage resubmitRecalledMR(String string)
	{
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(View_button_xpath);
		waitAndClickWebElement(EditMR_Button_Xpath);
		waitAndClickWebElement(SubmitMR_Button_Xpath);
		softAssert.assertEquals(MR_SuccessMessage_Toast_xpath.getText(), string);
		return GetInstance(LoadRequestsPage.class);
	}
	@Step("{method}")
	public LoadRequestsPage recallMR()
	{
		
		waitForElementVisible(recallButton_Xpath);
		waitAndClickWebElement(recallButton_Xpath);
		waitForElementVisible(proceedButton_Xpath);
		waitAndClickWebElement(proceedButton_Xpath);
		//Assert.assertEquals(MR_SuccessMessage_Toast_xpath.getText().trim(), message);
		return GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	private void editMrForResubmission() {
		
      waitAndClickWebElement(More_button_xpath);
      waitAndClickWebElement(EditMR_Button_Xpath);
      isElementEnabled(MRAmountField_Xpath);
      waitForElementInVisible(MRAmountField_Xpath);
      writeText(MRAmountField_Xpath, "1");
      waitAndClickWebElement(SubmitMR_Button_Xpath);
      waitForElementInVisible(MR_SuccessMessage_Toast_xpath);
		
	}

	public LoadRequestsPage HomeMenu() {

		isElementDisplayed(Home_Button_xpath);
		waitForElementVisible(Home_Button_xpath);
		waitAndClickWebElement(Home_Button_xpath);
		return  GetInstance(LoadRequestsPage.class);

	}

	public LoadRequestsPage VerifyMR_pendingList_OUP() {

		waitForElementVisible(VerifyMR_pendingList_xpath_OUP);
		if(VerifyMR_pendingList_xpath_OUP.isDisplayed())
		{
			String Expense=VerifyMR_pendingList_xpath_OUP.getText();
			System.out.println(Expense + " is Present in pending list");
		}else
		{
			System.out.println("Not present in pending list trying again to find");

		}
		return  GetInstance(LoadRequestsPage.class);
	}

	public WebElement getUserWalletAmount() {
		//js.executeScript("arguments[0].scrollIntoView()", UserWalletAmount);
		ScrollToElement(UserWalletAmount);
		return UserWalletAmount;
	}

	/**
	 * Latest pending MR from manager side
	 *
	 * @throws Exception
	 */
	public void openPMRManager_OUP() throws Exception {
		waitForElementVisible(openPMR_xpath_OUP);
		waitForElementToClickable(openPMR_xpath_OUP);
		waitAndClickWebElement(openPMR_xpath_OUP);
	}


	/* click close on pending MR */
	public LoadRequestsPage closeQuickView() {
		isElementDisplayed(closePMR);
		waitForElementVisible(closePMR);
		waitForElementToClickable(closePMR);
		waitAndClickWebElement(closePMR);
		return  GetInstance(LoadRequestsPage.class);

	}





	public LoadRequestsPage Extrafield_text(String s) {
		ScrollToElement(MRExtrafield_Text_xpath);
		MRExtrafield_Text_xpath.clear();
		writeText(MRExtrafield_Text_xpath, s);
		return  GetInstance(LoadRequestsPage.class);

	}

	public LoadRequestsPage Extrafield_BankAcc(String acc) {

		ScrollToElement(BankAcc_input_xpath);
		waitAndClickWebElement(BankAcc_input_xpath);
		writeText(BankAcc_input_xpath, acc);
		return  GetInstance(LoadRequestsPage.class);

	}

	public LoadRequestsPage Extrafield_ConfirmBankAcc(String acc) {
		ScrollToElement(ConfirmBankAcc_input_xpath);
		waitAndClickWebElement(ConfirmBankAcc_input_xpath);
		writeText(ConfirmBankAcc_input_xpath, acc);
		return  GetInstance(LoadRequestsPage.class);

	}

	public LoadRequestsPage Extrafield_Date() {
		ScrollToElement(DateExtrafiled_Date_Xpath);
		waitForElementToClickable(DateExtrafiled_Date_Xpath);
		waitAndClickWebElement(DateExtrafiled_Date_Xpath);
		waitForElementToClickable(Today_Date_xpath);
		waitAndClickWebElement(Today_Date_xpath);
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage multiselectDD() {
		ScrollToElement(multiselect_input_name);
		waitAndClickWebElement(multiselect_input_name);
		waitAndClickWebElement(multicheck_options_xpath.get(1));
		waitAndClickWebElement(multicheck_options_xpath.get(2));
		doubleClick(multiselect_input_name);
		return  GetInstance(LoadRequestsPage.class);
	}

	public WebElement getMR_initiated_successfully() {
		waitForElementVisible(SuccessMessage_Toast_xpath);
		isElementDisplayed(SuccessMessage_Toast_xpath);
		return SuccessMessage_Toast_xpath;
	}

	public LoadRequestsPage createMoneyrequestcommon(XSSFRow rowData) throws Exception {
		// waitForElementToClickable(MoneyRequest_Button_xpath);
		// waitAndClickWebElement(MoneyRequest_Button_xpath);
		waitForElementToClickable(New_Advancerequest_button_xpath);
		waitAndClickWebElement(New_Advancerequest_button_xpath);
		writeText(Amount_Text_Name, rowData.getCell(1).toString());
		waitForElementVisible(Reason_Text_Name);
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		ScrollToElement(TextMandatory_EF_Name);
		waitForElementToClickable(TextMandatory_EF_Name);
		writeText(TextMandatory_EF_Name, rowData.getCell(3).toString());

		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage createMoneyrequestcommon_OUP(XSSFRow rowData) throws Exception {
		SoftAssert softassert =new SoftAssert();
		isElementDisplayed(New_Advancerequest_button_xpath);
		waitForElementVisible(New_Advancerequest_button_xpath);
		waitForElementToClickable(New_Advancerequest_button_xpath);
		waitAndClickWebElement(New_Advancerequest_button_xpath);
		imageUploadAndAssert(softassert);
		writeText(Amount_Text_Name, rowData.getCell(1).toString());
		uploadMaxBills();
		isElementDisplayed(Reason_Text_Name);
		waitForElementVisible(Reason_Text_Name);
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		uploadMaxBills();
		return  GetInstance(LoadRequestsPage.class);
	}
	public LoadRequestsPage createMoneyrequestcommon_OUPWithoutBill(XSSFRow rowData) throws Exception {
		SoftAssert softassert =new SoftAssert();
		isElementDisplayed(New_Advancerequest_button_xpath);
		waitForElementVisible(New_Advancerequest_button_xpath);
		waitForElementToClickable(New_Advancerequest_button_xpath);
		waitAndClickWebElement(New_Advancerequest_button_xpath);
		writeText(Amount_Text_Name, rowData.getCell(1).toString());
		isElementDisplayed(Reason_Text_Name);
		waitForElementVisible(Reason_Text_Name);
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage fillMoneyRequestDetails_OUP(XSSFRow rowData) throws Exception {	
		System.out.println("Inside FillMR details button....");
		writeText(Amount_Text_Name, rowData.getCell(1).toString());
		isElementDisplayed(Reason_Text_Name);
		waitForElementVisible(Reason_Text_Name);
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		return  GetInstance(LoadRequestsPage.class);
	}
	public LoadRequestsPage MoneyrequestWithoutMandatoryFields(XSSFRow rowData) throws Exception {
		waitForElementVisible(New_Advancerequest_button_xpath);
		waitForElementToClickable(New_Advancerequest_button_xpath);
		waitAndClickWebElement(New_Advancerequest_button_xpath);
		writeText(Amount_Text_Name, rowData.getCell(1).toString());
		waitForElementVisible(Reason_Text_Name);
		waitForElementToClickable(Reason_Text_Name);
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage MoneyrequestWithoutMandatoryFields_OUP(XSSFRow rowData) throws Exception {
		waitForElementVisible(New_Advancerequest_button_xpath);
		waitForElementToClickable(New_Advancerequest_button_xpath);
		waitAndClickWebElement(New_Advancerequest_button_xpath);
		waitForElementVisible(Reason_Text_Name);
		waitForElementToClickable(Reason_Text_Name);
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage GotoMR() throws Exception {
		waitForElementVisible(MoneyRequest_Button_xpath);
		waitForElementToClickable(MoneyRequest_Button_xpath);
		waitAndClickWebElement(MoneyRequest_Button_xpath);
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage createMoneyrequest(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon(rowData);
		waitAndClickWebElement(Submit_button_ClassName);

		return  GetInstance(LoadRequestsPage.class);

	}

	public LoadRequestsPage createMoneyrequest_OUP(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon_OUP(rowData);
		return  GetInstance(LoadRequestsPage.class);

	}
	public LoadRequestsPage createMoneyrequest_OUPWithoutBill(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon_OUPWithoutBill(rowData);
		return  GetInstance(LoadRequestsPage.class);

	}

	/**
	 * Latest approved MR from finance side
	 */
	public void openPMRFinance_OUP() {
		waitForElementVisible(OpenPMR_xpath_OUP);
		waitForElementToClickable(OpenPMR_xpath_OUP);
		OpenPMR_xpath_OUP.click();
	}

	public LoadRequestsPage toggle() {
		isElementDisplayed(Toggle_Button_xpath);
		waitForElementVisible(Toggle_Button_xpath);
		waitAndClickWebElement(Toggle_Button_xpath);

		return  GetInstance(LoadRequestsPage.class);
	}

	// dateRange_dates_xpath
	public LoadRequestsPage dateRange() throws InterruptedException {
		ScrollToElement(dateRange_dates_xpath.get(0));
		waitAndClickWebElement(dateRange_dates_xpath.get(0));
		waitAndClickWebElement(Today_Date_xpath);
		waitAndClickWebElement(dateRange_dates_xpath.get(1));
		waitAndClickWebElement(Today_Date_xpath);

		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage ifsc(String ifsc, SoftAssert softAssert) throws InterruptedException {
		ScrollToElement(ifsc_input_name);
		ifsc_input_name.sendKeys(ifsc);
		waitForElementVisible(ifscBank_text_xpath);
		waitForElementVisible(ifscBranch_text_xpath);
		softAssert.assertEquals(ifscBranch_text_xpath.getAttribute("value").toString(), "BANGALORE",
				"branch name assertion for IFSC EF");
		softAssert.assertEquals(ifscBank_text_xpath.getAttribute("value").toString(), "CITI BANK",
				"bank name assertion for IFSC EF");
		softAssert.assertAll();
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage NumberEF(String numberEFData) {
		ScrollToElement(Number_input_name);
		writeText(Number_input_name, numberEFData);
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage TimeEF() throws InterruptedException {
		ScrollToElement(timeField_input_xpath);
		waitAndClickWebElement(timeField_input_xpath);
		waitAndClickWebElement(timeOK_button_xpath);
		return  GetInstance(LoadRequestsPage.class);

	}

	@Step("{method}")
	public LoadRequestsPage prefix(String prefix) {
		ScrollToElement(Prefix_name);
		Prefix_name.sendKeys(prefix);
		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage postfix(String prefix) {
		ScrollToElement(Postfix_name);
		Postfix_name.sendKeys(prefix);
		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage FileAttachment(SoftAssert softAssert) {
		File f = new File("./src/test/resources/imgData/1.png");
		ScrollToElement(File_UploadButton_xpath);
		moveToElement_Actions(File_UploadButton_xpath);
		// File_UploadButton_xpath.click();
		File_UploadButton_xpath.sendKeys(f.getAbsolutePath());
		softAssert.assertEquals(uploadedImageCheck_button_xpath.getText(), "Files-1");
		softAssert.assertAll();
		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage Dropdown() {
		// getDropDownItemTextByIndex(DropDown_input_name, 0);
		ScrollToElement(DropDown_input_name);
		waitAndClickWebElement(DropDown_input_name);
		waitAndClickWebElement(DropDownvalue_input_xpath);
		return  GetInstance(LoadRequestsPage.class);

	}


	@Step("{method}")
	public LoadRequestsPage createMoneyrequest_ExtraField_Text(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon(rowData);
		Extrafield_text(rowData.getCell(3).toString());
		waitForElementVisible(Submit_button_ClassName);
		waitAndClickWebElement(Submit_button_ClassName);
		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage createMoneyrequest_ExtraField_Date(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon(rowData);
		ScrollToElement(DateExtrafiled_Date_Xpath);
		waitForElementToClickable(DateExtrafiled_Date_Xpath);
		waitAndClickWebElement(DateExtrafiled_Date_Xpath);
		waitForElementToClickable(Today_Date_xpath);
		waitAndClickWebElement(Today_Date_xpath);
		waitForElementVisible(Submit_button_ClassName);
		waitAndClickWebElement(Submit_button_ClassName);

		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage createMoneyrequest_ExtraField_DateRange(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon(rowData);
		dateRange();
		waitForElementVisible(Submit_button_ClassName);
		waitAndClickWebElement(Submit_button_ClassName);

		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage createMoneyrequest_ExtraField_DropDown(XSSFRow rowData) throws Exception {
		createMoneyrequestcommon(rowData);
		ScrollToElement(DropDown_input_name);
		waitAndClickWebElement(DropDown_input_name);
		waitAndClickWebElement(DropDownvalue_input_xpath);
		waitForElementVisible(Submit_button_ClassName);
		waitAndClickWebElement(Submit_button_ClassName);


		return  GetInstance(LoadRequestsPage.class);
	}



	@Step("{method}")
	public LoadRequestsPage Click_Cancel() {
		waitAndClickWebElement(Cancel_button_xpath);
		return  GetInstance(LoadRequestsPage.class);
	}


	public LoadRequestsPage createMoneyrequestHome_OUP(XSSFRow rowData) throws Exception {

		HomeMenu();
		if(isElementDisplayed(NewAdvanceButtonHome_button_xpath)==true){
			waitAndClickWebElement(NewAdvanceButtonHome_button_xpath);
		}else {
			getThreadSafeDriver().navigate().refresh();
			waitAndClickWebElement(NewAdvanceButtonHome_button_xpath);
		}
		isElementDisplayed(Amount_Text_Name);
		waitForElementVisible(Amount_Text_Name);
		writeText(Amount_Text_Name, rowData.getCell(1).toString());
		writeText(Reason_Text_Name, rowData.getCell(2).toString());
		return  GetInstance(LoadRequestsPage.class);
	}


	@Step("{method}")
	public LoadRequestsPage Click_Submit(String string) {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(Submit_button_ClassName);
		waitForElementToClickable(Submit_button_ClassName);
		waitAndClickWebElement(Submit_button_ClassName);
//		waitForElementVisible(MR_SuccessMessage_Toast_xpath);
//		System.out.println("Toast message: "+MR_SuccessMessage_Toast_xpath.getText());
//	    String toastMessage = MR_SuccessMessage_Toast_xpath.getText().toString();
//	    System.out.println("ToastMessage is: "+toastMessage);
//		softAssert.assertEquals(toastMessage, string);
		return  GetInstance(LoadRequestsPage.class);
	}
	
	@Step("{method}")
	public LoadRequestsPage captureMRSuccessToastMessage(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(MR_SuccessMessage_Toast_xpath);
		System.out.println("Toast message: "+MR_SuccessMessage_Toast_xpath.getText());
	    String toastMessage = MR_SuccessMessage_Toast_xpath.getText().toString();
	    System.out.println("ToastMessage is: "+toastMessage);
		softAssert.assertEquals(toastMessage, string);
		return  GetInstance(LoadRequestsPage.class);
	}
	
	
	@Step("{method}")
	public LoadRequestsPage captureMRFailToastMessage(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(MR_Fail_ToastMessage_Icon_xpath);
		System.out.println("Toast message: "+MR_SuccessMessage_Toast_xpath.getText());
	    String toastMessage = MR_SuccessMessage_Toast_xpath.getText().toString();
	    System.out.println("ToastMessage is: "+toastMessage);
		softAssert.assertEquals(toastMessage, string);
		return  GetInstance(LoadRequestsPage.class);
	}
	
	@Step("{method}")
	public LoadRequestsPage CloseMRPage(String string) {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(CrossIconButtonInMRCreationPage);
		return  GetInstance(LoadRequestsPage.class);
	}

	@Step("{method}")
	public LoadRequestsPage Click_SubmitMR(String string) {
		SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(Submit_button_ClassName);
		if(isElementDisplayed(Submit_button_ClassName)==true) {
			waitForElementToClickable(Submit_button_ClassName);
			waitAndClickWebElement(Submit_button_ClassName);

			waitForElementVisible(MR_SuccessMessage_Toast_xpath);
			isElementDisplayed(MR_SuccessMessage_Toast_xpath);
			softAssert.assertEquals(MR_SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(MR_SuccessMessage_Toast_xpath);
			softAssert.assertAll();
		}
		else{
			Log.info("submit button not found");
			softAssert.assertEquals(true,false);
			softAssert.assertAll();
		}

		return  GetInstance(LoadRequestsPage.class);
	}



	@Step("Get MR Id from Expense List")
	public LoadRequestsPage getMoneyRequestId() throws Exception {
		// Click on the latest MR quick view to get MR id
		waitAndClickWebElement(LatestEmployeePendingMR);
		waitForElementVisible(MRID);
		String MRID = getMRID().getText();

		MRID=MRID.replaceAll("Request ID: " ," ");
		System.out.println("MRID"+MRID);
		File myobj = CreateFile("MRID.txt");
		if (myobj != null)
		{
			writeintoFile("MRID.txt", MRID);
			System.out.println(" written into file");
		}
		else
		{
			System.out.println("not written into file");
		}
		

		return  GetInstance(LoadRequestsPage.class);
	}


	@Step("{method}")
	public void click_viewMGR() throws Exception {

			hardPageRefresh();

			waitForElementVisible(View_button_xpath);
			if(isElementDisplayed(View_button_xpath)==true){
				waitAndClickWebElement(View_button_xpath);
				waitForElementVisible(Detailed_view_button_xpath);
				isElementDisplayed(Detailed_view_button_xpath);
				waitAndClickWebElement(Detailed_view_button_xpath);
			}
			else {
				hardPageRefresh();
				waitAndClickWebElement(View_button_xpath);
				waitForElementVisible(Detailed_view_button_xpath);
				isElementDisplayed(Detailed_view_button_xpath);
				waitAndClickWebElement(Detailed_view_button_xpath);
			}

	}

	@Step("{method}")
	public void partial_Amount(XSSFRow rowData) {

			waitForElementVisible(partial_amount_xpath);
			if(isElementDisplayed(partial_amount_xpath)==true){
				waitAndClickWebElement(partial_amount_xpath);
				partial_amount_xpath.clear();
				writeText(partial_amount_xpath, rowData.getCell(1).toString());

			}else{
				hardPageRefresh();
				waitAndClickWebElement(partial_amount_xpath);
				partial_amount_xpath.clear();
				writeText(partial_amount_xpath, rowData.getCell(1).toString());
			}


	}

	@Step("{method}")
	public void Allow_MR_Manager_OUP() throws Exception {

		click_viewMGR();
		isElementDisplayed(ManagerAllow_Button_xpath);
		waitForElementVisible(ManagerAllow_Button_xpath);
		waitAndClickWebElement(ManagerAllow_Button_xpath);

	}

	@Step("{method}")
	public void PartialApprove_manager(XSSFRow rowData) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		click_viewMGR();
		//waitForElementVisible(DetailedViewPage);
		PartialAmount = excelUtils.getRowDataWithSheetName(2, "MR");

		// partial approval amount retrive from Excel
		partial_Amount(PartialAmount);

		// Select allow button from the drop down
		allow_action();

	}

	@Step("{method}")
	public void PartialApprove_Finance(XSSFRow rowData) throws Exception {

		click_viewMGR();
		// checking for button enable or not
		PartialAmountfin = excelUtils.getRowDataWithSheetName(3, "MR");
		// partial approval amount retrive from Excel
		partial_Amount(PartialAmountfin);
		// Select allow button from the drop down
		allow_action();

	}

	@Step("{method}")
	public void Decline_Manager() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		click_viewMGR();

		// Select Decline button from the drop down
		Decline_action();
		isElementDisplayed(MR_SuccessMessage_Toast_xpath);
		waitForElementVisible(MR_SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,"Updated successfully");


	}

	@Step("{method}")
	public void MRVerify_Finance() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		click_viewMGR();
		// checking for button enable or not
		if (Decline_button_xpath.isEnabled()) {
			System.out.println("The cancel button is enabled");
		} else {
			System.out.println("Cancel button not enable");
		}

		if (ManagerAllow_Button_xpath.isEnabled()) {
			System.out.println("The Allow button is enabled");

		} else {
			System.out.println("Allow button not enable");
		}
		Reporter.log("Both cancel and Allow buttons are enable");

		// Select allow button from the drop down
		allow_action();

		// Asserting that the request was approved or Not !!!!!
		try {
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), "Updated successfully");
			Reporter.log("Allow action was taken by Manager");
		} catch (Error e) {
			Reporter.log("the wrong message was displayed" + e.getLocalizedMessage());

		}
	}


	public void MRVerify_FinanceOUP() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		click_viewMGR();
		waitForElementVisible(ManagerAllow_Button_xpath);
		waitAndClickWebElement(ManagerAllow_Button_xpath);
		waitForText(MR_SuccessMessage_Toast_xpath,"Updated successfully");
		softAssert.assertEquals(MR_SuccessMessage_Toast_xpath.getText(), "Updated successfully");
		waitForElementInVisible(ManagerAllow_Button_xpath);
		softAssert.assertAll();
	}

	/*
	 * 1. CLick on History tab
	 * 2. Click on Action menu of First record
	 * 3. Click on Detailed view
	 * 4. get the status from workflow
	 * */
	public LoadRequestsPage Verfiyactionstate_manager(String s) throws Exception {
		SoftAssert softAssert = new SoftAssert();
	    waitForElementVisible(HistoryTab_Button_xpath);
	    isElementDisplayed(HistoryTab_Button_xpath);
	    if(isElementDisplayed(HistoryTab_Button_xpath)==true){
            waitAndClickWebElement(HistoryTab_Button_xpath);
        }
	    else{
			hardPageRefreshAndClick(HistoryTab_Button_xpath);


        }
	    untilPageLoadComplete();

        waitForElementVisible(View_button_xpath);
        if(isElementDisplayed(View_button_xpath)==true){
            waitAndClickWebElement(View_button_xpath);
        }
        else{
			hardPageRefreshAndClick(modified2);

        }

		untilPageLoadComplete();
        if(isElementDisplayed(Detailed_view_button_xpath)==true){
            waitAndClickWebElement(Detailed_view_button_xpath);
        }
        else{
			hardPageRefreshAndClick(Detailed_view_button_xpath);

        }

        untilPageLoadComplete();
        if(isElementDisplayed(ApprovedState_xpath)==true){
			waitForElementVisible(ApprovedState_xpath);
			softAssert.assertEquals(ApprovedState_xpath.getText().trim(), s);
			softAssert.assertAll();
        }
        else{
			hardPageRefresh();
			waitForElementVisible(ApprovedState_xpath);
			softAssert.assertEquals(ApprovedState_xpath.getText().trim(), s);
			softAssert.assertAll();
		}

		return  GetInstance(LoadRequestsPage.class);
	}

	/*
	 * 1. CLick on History tab
	 * 2. Click on Action menu of First record
	 * 3. Click on Detailed view
	 * 4. get the status from workflow
	 * */
	public LoadRequestsPage Verfiyactionstate_manager_Approve(String s) throws Exception {


		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(HistoryTab_Button_xpath);
		if(isElementDisplayed(HistoryTab_Button_xpath)==true){
			waitAndClickWebElement(HistoryTab_Button_xpath);
		}
		else{
			hardPageRefreshAndClick(HistoryTab_Button_xpath);

		}

		untilPageLoadComplete();
		waitForElementVisible(View_button_xpath);
		if(isElementDisplayed(View_button_xpath)==true){
			waitForElementVisible(View_button_xpath);
			waitAndClickWebElement(View_button_xpath);
		}
		else{
			hardPageRefreshAndClick(View_button_xpath);

		}

		untilPageLoadComplete();
		if(isElementDisplayed(Detailed_view_button_xpath)==true){
			waitAndClickWebElement(Detailed_view_button_xpath);
		}
		else{
			hardPageRefreshAndClick(Detailed_view_button_xpath);

		}

		untilPageLoadComplete();
		if(isElementDisplayed(ApprovedState_xpath)==true){
			waitForElementVisible(ApprovedState_xpath);
			softAssert.assertEquals(ApprovedState_xpath.getText().trim(), s);
			softAssert.assertAll();
		}
		else{
			hardPageRefresh();
			waitForElementVisible(ApprovedState_xpath);
			softAssert.assertEquals(ApprovedState_xpath.getText().trim(), s);
			softAssert.assertAll();
		}

		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage Verfiyactionstate_manager_Decline(String s) throws Exception {

		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(HistoryTab_Button_xpath);
		//isElementDisplayed(HistoryTab_Button_xpath);
		if(isElementDisplayed(HistoryTab_Button_xpath)==true){
			waitAndClickWebElement(HistoryTab_Button_xpath);
		}
		else{
			hardPageRefreshAndClick(HistoryTab_Button_xpath);


		}

		untilPageLoadComplete();
		waitAndClickWebElement(View_button_xpath);
		if(isElementDisplayed(View_button_xpath)==true){
			waitAndClickWebElement(View_button_xpath);
		}
		else{
			hardPageRefreshAndClick(View_button_xpath);

		}

		untilPageLoadComplete();
		if(isElementDisplayed(Detailed_view_button_xpath)==true){
			waitAndClickWebElement(Detailed_view_button_xpath);
		}
		else{
			hardPageRefreshAndClick(Detailed_view_button_xpath);

		}

		untilPageLoadComplete();
		if(isElementDisplayed(DeclineState_xpath)==true){
			waitForElementVisible(DeclineState_xpath);
			softAssert.assertEquals(DeclineState_xpath.getText().trim(), s);
			softAssert.assertAll();
		}
		else{
			hardPageRefresh();
			waitForElementVisible(DeclineState_xpath);
			softAssert.assertEquals(DeclineState_xpath.getText().trim(),s);
			softAssert.assertAll();
		}


		return  GetInstance(LoadRequestsPage.class);
	}
	public LoadRequestsPage Verfiyactionstate_finance_Decline(String s) throws Exception {

		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(HistoryTab_Button_xpath);
		//isElementDisplayed(HistoryTab_Button_xpath);
		if(isElementDisplayed(HistoryTab_Button_xpath)==true){
			waitAndClickWebElement(HistoryTab_Button_xpath);
		}
		else{
			hardPageRefreshAndClick(HistoryTab_Button_xpath);


		}

		untilPageLoadComplete();
		waitAndClickWebElement(View_button_xpath);
		if(isElementDisplayed(View_button_xpath)==true){
			waitAndClickWebElement(View_button_xpath);
		}
		else{
			hardPageRefreshAndClick(View_button_xpath);

		}

		untilPageLoadComplete();
		if(isElementDisplayed(Detailed_view_button_xpath)==true){
			waitAndClickWebElement(Detailed_view_button_xpath);
		}
		else{
			hardPageRefreshAndClick(Detailed_view_button_xpath);

		}

		untilPageLoadComplete();
		if(isElementDisplayed(Finance_DeclineState_xpath)==true){
			waitForElementVisible(Finance_DeclineState_xpath);
			softAssert.assertEquals(Finance_DeclineState_xpath.getText().trim(), s);
			softAssert.assertAll();
		}
		else{
			hardPageRefresh();
			waitForElementVisible(Finance_DeclineState_xpath);
			softAssert.assertEquals(Finance_DeclineState_xpath.getText().trim(),s);
			softAssert.assertAll();
		}


		return  GetInstance(LoadRequestsPage.class);
	}
	// **********************************//


	public LoadRequestsPage Approve_manager_OUP() throws Exception {

		Allow_MR_Manager_OUP();
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage PartApprove_manager() throws Exception {

		PartialApprove_manager(PartialAmount);
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage PartApprove_finance() throws Exception {

		PartialApprove_Finance(PartialAmount);
		return  GetInstance(LoadRequestsPage.class);
	}

	public LoadRequestsPage Decline_manager() throws Exception {
		//LoadRequestPrivileged();
		Decline_Manager();
		return  GetInstance(LoadRequestsPage.class);
	}


	public LoadRequestsPage Verify_Finance_OUP() throws Exception {
		//LoadRequestPrivileged();
		click_viewMGR();
		MRVerify_FinanceOUP();
		return  GetInstance(LoadRequestsPage.class);

	}

	public void CompanyBal() {
		String beforefinalizing = getCompanyBalance().getText();
		String amountA = beforefinalizing.replaceAll("[^0-9.]", "");
		System.out.println(amountA);
		double adminamount = (Double.parseDouble(amountA));

		System.out.println("Before finalizing the company balance   "+adminamount);
		Reporter.log("company current balance captured"+beforefinalizing);

	}

	public LoadRequestsPage UserWalletBal() {
		getUserPageLink();
		String a = getUserWalletAmount().getText();
		System.out.println("see"+a);
		String numberOnly = a.replaceAll("[^0-9.]", "");
		System.out.println("here"+numberOnly);
		double useramount = (Double.parseDouble(numberOnly));
		DecimalFormat df = new DecimalFormat("#.##");
		Double TXT = Double.valueOf(df.format(useramount));
		System.out.println(TXT);

		// double useramount = Double.parseDouble(TXT);
		Reporter.log("User current wallet amount is: " + TXT);
		return  GetInstance(LoadRequestsPage.class);

	}

	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElements.class).logout();

	}

	public LoadRequestsPage Verfiyactionstate_manager_partVerify(String Verified) throws Exception {

		SoftAssert softAssert = new SoftAssert();
		waitForElementVisible(HistoryTab_Button_xpath);
		isElementDisplayed(HistoryTab_Button_xpath);
		if(isElementDisplayed(HistoryTab_Button_xpath)==true){
			waitAndClickWebElement(HistoryTab_Button_xpath);
		}
		else{
			getThreadSafeDriver().navigate().refresh();
			untilPageLoadComplete();
			waitAndClickWebElement(HistoryTab_Button_xpath);

		}


		if(isElementDisplayed(modified)==true){
			waitAndClickWebElement(modified);
		}
		else{
			getThreadSafeDriver().navigate().refresh();
			untilPageLoadComplete();
			waitAndClickWebElement(modified);
		}


		if(isElementDisplayed(Detailed_view_button_xpath)==true){
			waitAndClickWebElement(Detailed_view_button_xpath);
		}
		else{
			getThreadSafeDriver().navigate().refresh();
			untilPageLoadComplete();
			waitAndClickWebElement(Detailed_view_button_xpath);
		}

		if(isElementDisplayed(VerifiedState_xpath)==true){
			waitForElementVisible(VerifiedState_xpath);
			softAssert.assertEquals(VerifiedState_xpath.getText().trim(), Verified);
			softAssert.assertAll();
		}
		else{
			hardPageRefresh();
			waitForElementVisible(VerifiedState_xpath);
			softAssert.assertEquals(VerifiedState_xpath.getText().trim(),Verified);
			softAssert.assertAll();
		}

		return  GetInstance(LoadRequestsPage.class);
	}

	public String getTotalMoneyRequestCount() throws Exception {
			isElementDisplayed(MoneyRequestTotalCount);
			waitForElementVisible(MoneyRequestTotalCount);
			String moneyRequestcount = MoneyRequestTotalCount.getText();
			Log.info("moneyRequestcount"+ moneyRequestcount);
			return  moneyRequestcount;
	}

	public LoadRequestsPage checkRequestedAmountEnabled() {
		SoftAssert softAssert = new SoftAssert();
		boolean enabled = false;
		waitAndClickWebElement(More_button_xpath);
	      waitAndClickWebElement(EditMR_Button_Xpath);
	     if( MRAmountField_Xpath.isEnabled())
	     {
	         enabled = true;	 
	     }
	     else
	     {
	    	 enabled = false;
	     }
	     waitAndClickWebElement(Cancel_button_xpath);
	     softAssert.assertEquals(false, enabled);
		return GetInstance(LoadRequestsPage.class);
	}




}
