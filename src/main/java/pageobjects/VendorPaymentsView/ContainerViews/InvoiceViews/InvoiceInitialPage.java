/*package pageobjects.VendorPaymentsView.ContainerViews.InvoiceViews;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.ExcelUtils;
import pageobjects.VendorPaymentsView.CommonViews.ContainerElements_VendorPage;
import pageobjects.VendorPaymentsView.CommonViews.PageElements_VendorPage;
import pageobjects.VendorPaymentsView.ContainerViews.DeliveryAddressViews.DeliveryAddressDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorInitialPage;

public class InvoiceInitialPage extends LoadableComponent<InvoiceInitialPage>{
	TestBotElementsWrapper pageWrapper;

	*//** The driver. *//*
	private WebDriver driver;	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		 if(!pageWrapper.myElementIsClickable(this.driver, attachInvoice_Input_Xpath)) {
	            throw new Error("InvoiceInitialPage was not successfully loaded");
	        }
		 else {
	 if(!pageWrapper.myElementIsClickable(this.driver, invoiceId_Input_Xpath)) {
	            throw new Error("InvoiceInitialPage was not successfully loaded");
	        }
		 }
	}
	public InvoiceInitialPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}
	*//**Attach Invoice file type input field xpath*//*
	@FindBy(how=How.XPATH,using="//input[@id='drop_zone']")
	private WebElement attachInvoice_Input_Xpath;
	*//**Proceed button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Proceed']")
    private WebElement proceed_Button_Xpath;
	*//**Datepicker xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='datepicker']")
	private List<WebElement> datepicker_Date_Xpath;
	*//**Date xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='day']/span")
	private WebElement date_Xpath;
	*//**Invoice Id input field xpath *//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Invoice ID']")
	private WebElement invoiceId_Input_Xpath;
	*//**Description input field xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Description']")
	private WebElement description_Input_Xpath;
	*//**Datepicker xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='datepicker']")
	private List<WebElement> datepicker_Input_Xpath;
	*//**Date xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='datepicker']")
	private List<WebElement> date_Span_Xpath;
	*//**Po Attachment file Type Input field xpath*//*
	@FindBy(how=How.XPATH,using="//input[@id='myfiles']")
	private WebElement poAttachment_File_Xpath;
	*//**Payment type dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Payment Type*']]/div/div/span[1]")
	private WebElement paymentType_Dropdown_Xpath;
	*//**Received the service or goods dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Received the service or goods*']]/div/div/span[1]")
	private WebElement receivedServiceOrGoods_Dropdown_Xpath;
	*//**Tds Applicable dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='TDS Applicable*']]/div/div/span[1]")
	private WebElement tdsApplicable_Dropdown_Xpath;
	*//**Rcm applicable dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='RCM Applicable*']]/div/div/span[1]")
	private WebElement rcmApplicable_Dropdown_Xpath;
	*//**Department dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Department*']]/div/div/span[1]")
	private WebElement department_Dropdown_Xpath;
	*//**Department Poc dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Department POC*']]/div/div/span[1]")
	private WebElement departmentPoc_Dropdown_Xpath;
	*//**Department Poc Email id input xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Department POC EmailID']]/input")
	private WebElement departmentPocEmailId_Input_Xpath;
	*//**IGST Percentage Dropdown value xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-IGST Percentage*']/div/div[2]/ul/li")
	private List<WebElement> igstPercentageDropdown_Value_Xpath;
	*//**CGST and SGST  Percentage Dropdown value xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-CGST and SGST percentage*']/div/div[2]/ul/li")
	private List<WebElement> cgstAndSgstPercentageDropdown_Value_Xpath;
	*//**Dropdown value xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='dropDownList']/li")
	private List<WebElement> dropdown_Value_Xpath;
	*//**Tds Percentage dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='TDS Percentage*']]/div/div/span[1]")
	private WebElement tdsPercentage_Dropdown_Xpath;
	*//**TDS Section dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='TDS Section*']]/div/div/span[1]")
	private WebElement tdsSection_Dropdown_Xpath;
	*//**Select vendor Container link xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[div[h3[text()='Vendor *']]]]/div[2]/div/div[2]")
	private WebElement selectVendor_Link_Xpath;
	*//**Select delivery address Container link xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[div[h3[text()='Delivery Address *']]]]/div[2]/div/div[2]")
	private WebElement selectDeliveryAddress_Link_Xpath;
	*//**Select invoice item Container link xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[div[h3[contains(text(),'Invoice Item')]]]]/div[2]/div/div[1]")
	private WebElement selectInvoiceItem_Link_Xpath;
	*//**Collection Container rct checkbox xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='table-radiobtn']")
	private List<WebElement> collectionRct_Checkbox_Xpath;
	*//**Invoice Item rct checkbox xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='ct-table-body']/div[2]/div[1]/span")
	private WebElement invoiceItemRct_Checkbox_Xpath;
	*//**Done button xpath*//*
	@FindBy(how=How.XPATH,using="//button[div[span[text()='Done']]]")
	private WebElement done_Button_Xpath;
	*//**HSN input field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-HSN or SAC']")
	private WebElement hsn_Input_Xpath;
	*//**Description input field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Description']")
	private WebElement descriptionInvoiceItem_Input_Xpath;
	*//**Type of GST dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Type of GST']/div")
	private WebElement typeOfGst_Dropdown_Xpath;
	*//**Quantity input field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Quantity']/div/div/input")
	private WebElement quantity_Input_Xpath;
	*//**Unit price input field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Unit Price']/div/div/input")
	private WebElement unitPrice_Input_Xpath;
	*//**Amount input field xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Amount']")
	private WebElement amount_Input_Xpath;
	*//**Amount invoice input field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Amount *']/div/div/input")
	private WebElement amountInvoiceItem_Input_Xpath;
	*//**GST applicable dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-GST Applicable']/div")
	private WebElement gstApplicable_Dropdown_Xpath;
	*//**IGST percentage dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-IGST Percentage*']/div/div[1]/span")
	private WebElement igstPercentage_Dropdown_Xpath;
	*//**CGST and SGST percentage dropdown field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-CGST and SGST percentage']/div[1]/span")
	private WebElement cgstAndSgstPercentage_Dropdown_Xpath;
	*//**CGST input field xpath*//*
	@FindBy(how=How.XPATH,using=" ")
	private WebElement cgst_Input_Xpath;
	*//**Save button xpath*//*
	@FindBy(how=How.XPATH,using="//button[@class='primaryCustomButton']")
	private WebElement save_Button_Xpath;
	*//**The Toast Message Xpath*//*
	@FindBy(how=How.XPATH, using="//span[@class='message']")
	private WebElement toastMessage_Xpath;
	*//**Today date xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[div[label[text()='Date of Receipt *']]]]/div[2]/div/div[2]/label")
	private WebElement today_Date_Xpath;
	*//**Vendor details field 1 xpath*//*
	@FindBy(how=How.XPATH,using="//h4[text()='Test Payment Type']")
	private WebElement vendorDetails01_Field_Xpath;
	*//**Vendor details field 1 xpath*//*
	@FindBy(how=How.XPATH,using="//h4[text()='City']")
	private WebElement vendorDetails02_Field_Xpath;
	*//**Date Of Receipt Date xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Date of Receipt *']]/div/input")
	private WebElement dateOfReceipt_Date_Xpath;
	*//**Cross image Xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='header-close-icon']/img")
	private WebElement cross_Img_Xpath;
	*//**Submit button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Submit']")
	private WebElement submit_Button_Xpath;
	*//**Approve  action button xpath*//*
	@FindBy(how=How.XPATH, using="//button/div/span[text()='Approve']")
	private WebElement approve_Button_Xpath;
	*//**Status link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='customStatus']/div[2]")
	private WebElement status_Link_Xpath;
	*//**Decline button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Decline']]]")
	private WebElement decline_Button_Xpath;
	*//**Recall button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Recall']]]")
    private WebElement recall_Button_Xpath;	
	*//**Resubmit button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Resubmit']]]")
    private WebElement resubmit_Button_Xpath;
	*//**Action icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[@class='action-column-btns']]")
	private List<WebElement> action_Icon_Xpath;
	*//**View action button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='View']")
	private List<WebElement> view_Button_Xpath;
	*//**Remove button xpath*//*
	@FindBy(how=How.XPATH,using="//div/span[text()='Remove']")
	private List<WebElement> remove_Button_Xpath;
	*//**The Edit Vendor Button Xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='EditCloseAction']/div[1]/button")
	private WebElement editInvoice_Button_Xpath;
	*//**Attachment icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='attachement--info']")
	private List<WebElement> attachment_Icon_Xpath;
	*//**Attachment delete icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='dropDown--container']/div[2]/img")
	private WebElement delectIcon_Image_Xpath;
	*//**Reset option xpath*//*
	@FindBy(how=How.XPATH,using="//div/span[text()='Reset']")
	private WebElement reset_Option_Xpath;
	*//**Inoice item action button xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='action-btn']")
	private List<WebElement> invoiceItemAction_Button_Xpath;
	*//**Vendor heading xpath*//*
	@FindBy(how=How.XPATH,using="//h3[text()='Delivery Address']")
    private WebElement delivaryAddress_Heading_Xpath;
	*//**Change Attachment button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Change attachments']")
	private WebElement changeAttachmnet_Button_Xpath;
	*//**Delete Icon Xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='uploadedFile--container']/div/div[2]")
	private WebElement delete_Icon_Xpath;
	*//**Canvas xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='pdf-container']/object")
	private WebElement canvas_Frame_Xpath;
	*//**Delete button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Delete']")
	private WebElement delete_Button_Xpath;
	*//**Delete button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Confirm']")
	private WebElement confirm_Button_Xpath;
	*//**Attach mandatory  error div xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='fileUpload--wrapper showError']")
	private WebElement attachment_Mandatory_Error_Xpath;
	*//**The Error icon image xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='error-icon']")
	private List<WebElement> errorIcon_Image_Xpath;
	*//**The mandatory error message xpath*//*
	@FindBy(how=How.XPATH,using="//div[@id='error-message']")
	private List<WebElement> errorMessage_ToolTip_Xpath; 	
	*//**Last action heading xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='workflow-status-box']/h3/span")
	private WebElement lastAction_Heading_Xpath;
	*//**Actor of last action heading xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='workflow-status-box']/p/span[1]")
	private WebElement lastActor_Heading_Xpath;
	*//**Invoice item table xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='ct-table-container']")
	private WebElement invoiceItem_Table_Xpath;
	*//**Summary field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='collection-efs-block']/div/div[2]/div/div[1]/div/label")
	private WebElement summary_Field_Xpath;
	*//**Add new delivery address button xpath*//*
	@FindBy(how=How.XPATH,using="//div/span[text()='Add New Delivery Address']")
	private WebElement addNewDelivaryAddress_Button_Xpath;
	*//**Ok button xpath*//*
	@FindBy(how=How.XPATH,using="//span[text()='Ok']")
    private WebElement ok_Button_Xpath;
	*//**Add new collection button xpath*//*
	@FindBy(how=How.XPATH,using="//button[@class='secondaryCustomButton']")
	private List<WebElement> addNewCollection_Button_Xpath;
	*//**Method to upload invoice 
	 * @throws Exception *//*
	public InvoiceInitialPage uploadInvoice(XSSFRow  rowData) throws Exception {
		pageWrapper.uploadInvoice(rowData.getCell(1).toString(), attachInvoice_Input_Xpath, proceed_Button_Xpath);
		return this;
	}
	*//**Method to add invoice details
	 * @throws Exception *//*
	public InvoiceInitialPage addInvoiceDetails(XSSFRow  rowData) throws Exception {
		pageWrapper.addTextField(invoiceId_Input_Xpath, ExcelUtils.getCellDataWithRandomNumber(1, 2, "Invoice_Vendor"));
		pageWrapper.addTextField(description_Input_Xpath, rowData.getCell(3).toString());
		pageWrapper.uploadFile(rowData.getCell(4).toString(), poAttachment_File_Xpath);
		pageWrapper.ScrollToElement(datepicker_Input_Xpath.get(0));
		pageWrapper.selectValueOfDropdown(receivedServiceOrGoods_Dropdown_Xpath, dropdown_Value_Xpath, 1);	
		pageWrapper.selectValueOfDropdown(tdsApplicable_Dropdown_Xpath, dropdown_Value_Xpath, 1);
		pageWrapper.selectValueOfDropdown(tdsPercentage_Dropdown_Xpath, dropdown_Value_Xpath, 1);
		pageWrapper.selectValueOfDropdown(tdsSection_Dropdown_Xpath, dropdown_Value_Xpath, 1);
		pageWrapper.ScrollToElement(receivedServiceOrGoods_Dropdown_Xpath);
		pageWrapper.selectValueOfDropdown(rcmApplicable_Dropdown_Xpath, dropdown_Value_Xpath, 1);
		pageWrapper.selectValueOfDropdown(department_Dropdown_Xpath, dropdown_Value_Xpath, 2);
		pageWrapper.selectValueOfDropdown(departmentPoc_Dropdown_Xpath, dropdown_Value_Xpath, 1);
		pageWrapper.ScrollToElement(rcmApplicable_Dropdown_Xpath);
		return this;
	}
	*//**Method to attach Vendor
	 * @throws Exception *//*
	public InvoiceInitialPage attachVendor() throws Exception {
	//	pageWrapper.attachContainer(selectVendor_Link_Xpath, collectionRct_Checkbox_Xpath.get(0), done_Button_Xpath);
		//pageWrapper.attachCollection(selectVendor_Link_Xpath, collectionRct_Checkbox_Xpath.get(0), done_Button_Xpath);
		pageWrapper.shortWait();
		pageWrapper.customClickAction(selectVendor_Link_Xpath);
		pageWrapper.customClickAction(collectionRct_Checkbox_Xpath.get(0));
		pageWrapper.mediumWait();
		pageWrapper.waitAndClickWebElement(done_Button_Xpath);
		return this;
	}
	*//**Method to attach Delivery Address
	 * @throws Exception *//*
	public InvoiceInitialPage attachDeliveryAddress() throws Exception {
		pageWrapper.shortWait();
		pageWrapper.customClickAction(selectDeliveryAddress_Link_Xpath);
		pageWrapper.customClickAction(collectionRct_Checkbox_Xpath.get(0));
		pageWrapper.shortWait();
		pageWrapper.waitAndClickWebElement(done_Button_Xpath);
		return this;
	}
	*//**Method to attach Invoice Item
	 * @throws Exception *//*
	public InvoiceInitialPage attachInvoiceItem() throws Exception {
		pageWrapper.shortWait();
		pageWrapper.customClickAction(selectInvoiceItem_Link_Xpath);
		pageWrapper.customClickAction(invoiceItemRct_Checkbox_Xpath);
		pageWrapper.shortWait();
		pageWrapper.waitAndClickWebElement(done_Button_Xpath);
		return this;
	}
	*//**Method to add invoice item details*//*
	public InvoiceInitialPage addInvoiceItemDetails(XSSFRow rowData) {
		pageWrapper.scrollHalflHorizontal(invoiceItem_Table_Xpath);
		pageWrapper.shortWait();
		pageWrapper.selectValueOfDropdown(typeOfGst_Dropdown_Xpath, dropdown_Value_Xpath, 1);
		pageWrapper.addTextField(quantity_Input_Xpath, rowData.getCell(5).toString());
		pageWrapper.addTextField(unitPrice_Input_Xpath, rowData.getCell(6).toString());
		pageWrapper.shortWait();
		//pageWrapper.moveToElement_Actions(amountInvoiceItem_Input_Xpath);
		//pageWrapper.ScrollToElement(amountInvoiceItem_Input_Xpath);
		pageWrapper.scrollFullHorizontal(invoiceItem_Table_Xpath);
		pageWrapper.selectValueOfDropdown(igstPercentage_Dropdown_Xpath, igstPercentageDropdown_Value_Xpath, 1);
		return this;
	}
	*//**Method to edit multiedit not allowed field*//*
    public InvoiceInitialPage multieditField() {
    	pageWrapper.ScrollToElement(datepicker_Input_Xpath.get(0));
    	pageWrapper.resetDropDownValue(receivedServiceOrGoods_Dropdown_Xpath, reset_Option_Xpath);
		pageWrapper.selectValueOfDropdown(paymentType_Dropdown_Xpath, dropdown_Value_Xpath, 2);	
    	return this;
    }
	*//**Method to click save
	 * @throws Exception *//*
	public InvoiceInitialPage clickSave() throws Exception {
		pageWrapper.mediumWait();
		pageWrapper.customClickAction(save_Button_Xpath);
		return this;
	}
	*//**Method to create invoice
	 * @throws Exception *//*
	@SuppressWarnings("static-access")
	public InvoiceInitialPage createInvoice() throws Exception {
		uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		addInvoiceDetails(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		attachVendor();
		pageWrapper.ScrollToElement(vendorDetails01_Field_Xpath);
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachDeliveryAddress();
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachInvoiceItem();
		addInvoiceItemDetails(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		clickSave();
		return this;
	}
	*//**Method to create invoice for more than 1000000
	 * @throws Exception *//*
	@SuppressWarnings("static-access")
	public InvoiceInitialPage createInvoiceMoreThan100000() throws Exception {
		uploadInvoice(ExcelUtils.getRowDataWithSheetName(2, "Invoice_Vendor"));
		addInvoiceDetails(ExcelUtils.getRowDataWithSheetName(2, "Invoice_Vendor"));
		attachVendor();
		pageWrapper.ScrollToElement(vendorDetails01_Field_Xpath);
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachDeliveryAddress();
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachInvoiceItem();
		addInvoiceItemDetails(ExcelUtils.getRowDataWithSheetName(2, "Invoice_Vendor"));
		clickSave();
		return this;
	}
	*//**Method to get taost message*//*
    public String captureToastMessage() {
    	pageWrapper.shortWait();
    	pageWrapper.waitForElementVisible(toastMessage_Xpath);
    	return pageWrapper.getText(toastMessage_Xpath);
    }
    *//**Method to click cross
	 * @throws Exception *//*
    public PageElements_VendorPage clickCross() throws Exception{
    	pageWrapper.customClickAction(cross_Img_Xpath);
    	return new PageElements_VendorPage(driver);
    }
    *//**Method to click submit
     * @throws Exception *//*
    public InvoiceInitialPage clickSubmit() throws Exception {
    	pageWrapper.customClickAction(submit_Button_Xpath);
    	return this;
    }
    *//**Method to click approve action
     * @throws Exception *//*
    public InvoiceInitialPage clickApprove() throws Exception {
    	driver.navigate().refresh();
    pageWrapper.customClickAction(approve_Button_Xpath);
    	return this;
    }
    
    *//**Method to assert status of vendor*//*
    public String captureStatus() {
    	pageWrapper.shortWait();
    	pageWrapper.waitForElementVisible(status_Link_Xpath);
    String status= pageWrapper.getText(status_Link_Xpath);
    	return status;
    }
    *//**Method to click decline action
     * @throws Exception *//*
    public InvoiceInitialPage clickDecline() throws Exception {
    	driver.navigate().refresh();
    	pageWrapper.customClickAction(decline_Button_Xpath);
    	return this;
    }
    *//**Method to click recall button
     * @throws Exception *//*
    public InvoiceInitialPage clickRecall() throws Exception {
    	driver.navigate().refresh();
    	pageWrapper.customClickAction(recall_Button_Xpath);
    	return this;
    }
    *//**Method to click resubmit button
     * @throws Exception *//*
    public InvoiceInitialPage clickResubmit() throws Exception {
    	driver.navigate().refresh();
    	pageWrapper.customClickAction(resubmit_Button_Xpath);
    	return this;
    }
    public InvoiceInitialPage clickView() throws Exception {
 	   pageWrapper.shortWait();
 	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
 	   pageWrapper.waitForElementToClickable(view_Button_Xpath.get(0));
 	   pageWrapper.customClickAction(view_Button_Xpath.get(0));
 	   return this;
    }
    *//**Method to click edit Invoice button
     * @throws Exception *//*
    public InvoiceInitialPage clickEditInvoice() throws Exception {
    	pageWrapper.customClickAction(editInvoice_Button_Xpath);
    	return this;
    }
    *//**Method to delete invoice item rct
     * @throws Exception *//*
    public InvoiceInitialPage deleteInoiceItem() throws Exception {
    	pageWrapper.shortWait();
    	pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
    	pageWrapper.waitForElementToClickable(invoiceItemAction_Button_Xpath.get(1));
    	pageWrapper.click_Actions(invoiceItemAction_Button_Xpath.get(1));
    return this;
    }
    *//**Method to clear value of invoice details page
     * @throws Exception *//*
    public InvoiceInitialPage clearAll() throws Exception {
    	pageWrapper.clearValue(invoiceId_Input_Xpath);
    	pageWrapper.clearValue(description_Input_Xpath);
    	pageWrapper.deleteUploadedFile(attachment_Icon_Xpath.get(0), delectIcon_Image_Xpath);
    	pageWrapper.ScrollToElement(datepicker_Input_Xpath.get(0));
    	pageWrapper.resetDropDownValue(receivedServiceOrGoods_Dropdown_Xpath, reset_Option_Xpath);
    	pageWrapper.resetDropDownValue(tdsApplicable_Dropdown_Xpath, reset_Option_Xpath);
    	pageWrapper.resetDropDownValue(rcmApplicable_Dropdown_Xpath, reset_Option_Xpath);
    	pageWrapper.resetDropDownValue(department_Dropdown_Xpath, reset_Option_Xpath);
    	pageWrapper.ScrollDown(rcmApplicable_Dropdown_Xpath);
    	pageWrapper.customClickAction(remove_Button_Xpath.get(0));
    	pageWrapper.customClickAction(remove_Button_Xpath.get(0));
    pageWrapper.ScrollDown(selectDeliveryAddress_Link_Xpath);
    deleteInoiceItem();
    //pageWrapper.ScrollToElement(selectDeliveryAddress_Link_Xpath);
	//pageWrapper.ScrollToElement(receivedServiceOrGoods_Dropdown_Xpath);
//	pageWrapper.ScrollToElement(attachment_Icon_Xpath.get(0));
    pageWrapper.scrollUp();
    
    	return this;    	
    }
    *//**Method to update invoice
     * @throws Exception *//*
    public InvoiceInitialPage updateInvoice() throws Exception {
    	addInvoiceDetails(ExcelUtils.getRowDataWithSheetName(2, "Invoice_Vendor"));
		attachVendor();
		pageWrapper.ScrollToElement(vendorDetails01_Field_Xpath);
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachDeliveryAddress();
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachInvoiceItem();
		addInvoiceItemDetails(ExcelUtils.getRowDataWithSheetName(2, "Invoice_Vendor"));
		clickSave();
    	return this;
    }
    *//**Method to change attachment
     * @throws Exception pageWrapper*//*
    public InvoiceInitialPage changeAttachment() throws Exception {
    	pageWrapper.shortWait();
    	pageWrapper.customClickAction(changeAttachmnet_Button_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.moveToElement_Actions(delete_Icon_Xpath);
    	pageWrapper.waitAndClickWebElement(delete_Icon_Xpath);
    	uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
    	return this;
    }
    *//**Method to add Invoice Description Name
     * @throws Exception *//*
    public InvoiceInitialPage enterInvoiceDescription(XSSFRow rowData) throws Exception {
    	uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
    	pageWrapper.addTextField(description_Input_Xpath, rowData.getCell(3).toString());
    	pageWrapper.longWait();
	return this;
    }
    *//**Method to check canvas visibility*//*
    public boolean isCanvasDisplayed() {
    	boolean visibility;
    	visibility=	pageWrapper.isElementDisplayed(canvas_Frame_Xpath);
    	return visibility;
    }
    *//**Method to capture value of description  field*//*
    public String captureValue() {
    pageWrapper.shortWait();
    	pageWrapper.waitForElementVisible(description_Input_Xpath);
    	return pageWrapper.getValue(description_Input_Xpath);
    }
    *//**Method to delete invoice draft
     * @throws Exception *//*
    public InvoiceInitialPage deleteInvoiceDraft() throws Exception {
    	pageWrapper.shortWait();
    	pageWrapper.customClickAction(changeAttachmnet_Button_Xpath);
    	pageWrapper.customClickAction(delete_Button_Xpath);
    //	pageWrapper.customClickAction(confirm_Button_Xpath);
    	pageWrapper.waitAndClickWebElement(confirm_Button_Xpath);
    	return this;
    	
    }
    *//**Method to delete invoice*//*
    public InvoiceInitialPage deleteInvoice() throws Exception {
    	pageWrapper.shortWait();
    	pageWrapper.customClickAction(delete_Button_Xpath);
    	pageWrapper.waitAndClickWebElement(confirm_Button_Xpath);
    	return this;
    	
    }
    *//**Method to click proceed button
     * @throws Exception *//*
    public InvoiceInitialPage clickProceed() throws Exception {
    	pageWrapper.shortWait();
    	pageWrapper.customClickAction(proceed_Button_Xpath);
    	return this;
    }
    *//**Method to check mandatory div visibility*//*
    public boolean isMandatoryDivDisplayed() {
    	boolean visibility;
    	visibility=	pageWrapper.isElementDisplayed(attachment_Mandatory_Error_Xpath);
    	return visibility;
    }
    *//**Method to check mandatory validation for invoice details screen*//*
    public boolean mandantotyCheck() {
    pageWrapper.scrollUp();
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(0), errorMessage_ToolTip_Xpath.get(0), "Invoice ID is a mandatory. This field needs to filled before submission");
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(1), errorMessage_ToolTip_Xpath.get(1), "Description a mandatory. This field needs to filled before submission");
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(2), errorMessage_ToolTip_Xpath.get(2), "Invoice Date is a mandatory. This field needs to filled before submission"); 
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(3), errorMessage_ToolTip_Xpath.get(3), "Due Date is a mandatory. This field needs to filled before submission");
    pageWrapper.ScrollToElement(poAttachment_File_Xpath);
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(4), errorMessage_ToolTip_Xpath.get(4), "Received The Service Or Goods is a mandatory. This field needs to filled before submission");
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(5), errorMessage_ToolTip_Xpath.get(5), "Department is a mandatory. This field needs to filled before submission");

    pageWrapper.ScrollDown(rcmApplicable_Dropdown_Xpath);
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(6), errorMessage_ToolTip_Xpath.get(6), "Amount Name is a mandatory. This field needs to filled before submission");
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(7), errorMessage_ToolTip_Xpath.get(7), "Tax Amount Name is a mandatory. This field needs to filled before submission");
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(8), errorMessage_ToolTip_Xpath.get(8), "Gross Amount Name is a mandatory. This field needs to filled before submission");    
    	return true;
    }
    *//**Method to check default value of a field*//*
    public boolean defaultCheck() {
    boolean result=pageWrapper.isDefault(paymentType_Dropdown_Xpath);    
    	return result;
    }
    *//**Method to check dependent field appearance*//*
    public boolean isDependentFieldDisplayed() {
    	pageWrapper.ScrollToElement(datepicker_Input_Xpath.get(0));
    	pageWrapper.shortWait();
    	pageWrapper.selectValueOfDropdown(tdsApplicable_Dropdown_Xpath, dropdown_Value_Xpath, 1);
    return	pageWrapper.isElementDisplayed(tdsPercentage_Dropdown_Xpath);
    }
    *//**Method to evaluate calculated field
	 * @throws Exception *//*
	@SuppressWarnings("static-access")
	public InvoiceInitialPage evaluateCalculatedField() throws Exception {
		uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		addInvoiceDetails(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		attachVendor();
		pageWrapper.ScrollToElement(vendorDetails01_Field_Xpath);
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachDeliveryAddress();
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		attachInvoiceItem();
		addInvoiceItemDetails(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		pageWrapper.ScrollDown(amount_Input_Xpath);
		return this;
	}
	*//**Method to capture value of calculated field*//*
	public String captureCalculatedFieldValue() {
	 pageWrapper.shortWait();
	 pageWrapper.waitForElementVisible(amount_Input_Xpath);
	 return pageWrapper.getValue(amount_Input_Xpath);
	}
	*//**Method to capture create  action*//*
	public String captureLastAction() {
		pageWrapper.mediumWait();
		return pageWrapper.captureLastAction(lastAction_Heading_Xpath, lastActor_Heading_Xpath);
	}
	*//**Method to get summary field*//*
	public String getSummaryField() {
		pageWrapper.ScrollDown(datepicker_Input_Xpath.get(0));
		pageWrapper.ScrollDown(rcmApplicable_Dropdown_Xpath);
		pageWrapper.ScrollDown(selectInvoiceItem_Link_Xpath);
		return pageWrapper.getText(summary_Field_Xpath);
	}
	*//**Method to click ok button
	 * @throws Exception *//*
	public InvoiceInitialPage clickOk() throws Exception {
		pageWrapper.shortWait();
		pageWrapper.waitAndClickWebElement(ok_Button_Xpath);
		return this;
	}
	*//**Method to click add new delivary addres
	 * @throws Exception *//*
	public InvoiceInitialPage clickAddNewDelivaryAddress() throws Exception {
		pageWrapper.shortWait();
		pageWrapper.customClickAction(selectDeliveryAddress_Link_Xpath);
		pageWrapper.shortWait();
		pageWrapper.waitAndClickWebElement(addNewDelivaryAddress_Button_Xpath);
		
		//pageWrapper.customClickAction(addNewDelivaryAddress_Button_Xpath);
		return this;
	}
	*//**Method to add new delivery address
	 * @throws Exception *//*
	public DeliveryAddressDetailsPage addNewDelivaryAddress() throws Exception {
		uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		addInvoiceDetails(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		attachVendor();
		pageWrapper.ScrollToElement(vendorDetails01_Field_Xpath);
		pageWrapper.ScrollToElement(vendorDetails02_Field_Xpath);
		clickAddNewDelivaryAddress();
		clickOk();
		return new DeliveryAddressDetailsPage(driver);
	}
	*//**Method to click attach vendor
	 * @throws Exception *//*
	public InvoiceInitialPage clickAttachVendor() throws Exception {
		uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		addInvoiceDetails(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"));
		pageWrapper.shortWait();
		pageWrapper.customClickAction(selectVendor_Link_Xpath);
		return this;
	}
	*//**Method to assert add new collection for workflow container*//*
	public boolean isAddNewCollectionDisplayed() {
		boolean isVisible=false;
		try {
			pageWrapper.mediumWait();
			pageWrapper.isElementDisplayed(addNewCollection_Button_Xpath.get(2));
			return isVisible=true;
		}catch(Exception e) {
			
		}
		return isVisible;
	}
}
*/