/*package pageobjects.VendorPaymentsView.ContainerViews.VendorViews;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.asserts.SoftAssert;
import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.Step;
import pageobjects.VendorPaymentsView.CommonViews.PageElements_VendorPage;



public class VendorInitialPage extends LoadableComponent<VendorInitialPage>{
	TestBotElementsWrapper pageWrapper;
	
	*//** The driver. *//*
	private WebDriver driver;
	SoftAssert sa= new SoftAssert();
	*//**Vendor Name input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Vendor Name']")
    private WebElement vendorName_Input_Xpath;	
	*//**Description input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Description']")
    private WebElement description_Input_Xpath;	
	*//**Email id input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Email ID']")
    private WebElement emailId_Input_Xpath;	
	*//**Phone Number input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Phone No']")
    private WebElement phoneNo_Input_Xpath;	
	*//**Address input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Address']")
    private WebElement address_Input_Xpath;	
	*//**City input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type City']")
    private WebElement city_Input_Xpath;	
	*//**State dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='State*']]/div/div/span[1]")
    private WebElement state_Dropdown_Xpath;	
	*//**State option list xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='dropDownList']/li")
	private List<WebElement> stateOption_List_Xpath;
	*//**State value xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='selectedValue']")
	private List<WebElement> selectedState_Value_Xpath;
	*//**State Code input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type State Code']")
    private WebElement stateCode_Input_Xpath;	
	*//**Point Of Contact input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Point of Contact']")
    private WebElement poiniOfContact_Input_Xpath;	
	*//**PAN input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type PAN']")
    private WebElement pan_Input_Xpath;	
	*//**s the vendor GST Registered dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Is the vendor GST Registered*']]/div/div/span[1]")
    private WebElement isVendorGstRegisterted_Dropdown_Xpath;;	
	*//**GSTIN input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type GSTIN']")
    private WebElement gstin_Input_Xpath;	
	*//**GST Certificate file xpath*//*
	@FindBy(how=How.XPATH,using="//div[span[text()='GST Certificate *']]/input")
    private WebElement gstCertificate_File_Xpath;	
	*//**Beneficiary Name input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Beneficiary Name']")
    private WebElement beneficiaryName_Input_Xpath;	
	*//**Account Number input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Account Number']")
    private WebElement accountNumber_Input_Xpath;	
	*//**Confirm Account Number input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Confirm Account Number']")
    private WebElement confirmAccountNumber_Input_Xpath;	
	*//**Ifsc input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type IFSC Code']")
    private WebElement ifsc_Ifsc_Xpath;	
	*//**Branch Name input xpath*//*
	@FindBy(how=How.XPATH,using="//div[text()='Branch Name:']/span")
	private WebElement branchName_Input_Xpath;
	*//**Bank Name input xpath*//*
	@FindBy(how=How.XPATH,using="//div[text()='Bank Name:']/span")
	private WebElement bankName_Input_Xpath;
	*//**Cancelled Cheque file xpath*//*
	@FindBy(how=How.XPATH,using="//div[span[text()='Cancelled Cheque *']]/input")
    private WebElement cancelCheque_File_Xpath;	
	*//**Registered under MSMED ACT Dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//div[label[text()='Registered under MSMED ACT*']]/div/div/span[1]")
    private WebElement registeredUnderMsmedAct_Dropdown_Xpath;	
	*//**Msmed options list xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='dropDownList']/li")
	private List<WebElement> msmed_List_Xpath;
	*//**MSMED Act Attachment file xpath*//*
	@FindBy(how=How.XPATH,using="//div[span[text()='MSMED Act Attachment *']]/input")
    private WebElement msmedActAttachment_File_Xpath;	
	*//**Save button Xpath*//*
	@FindBy(how=How.XPATH,using="//button[div[span[text()='Save']]]")
	private WebElement save_Button_Xpath;
	*//**Delete Button Xpath*//*
	@FindBy(how=How.XPATH,using="//button[div[span[text()='Delete']]]")
	private WebElement delete_Button_Xpath;	
	*//**The Error icon image xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='error-icon']")
	private List<WebElement> errorIcon_Image_Xpath;
	*//**The mandatory error message xpath*//*
	@FindBy(how=How.XPATH,using="//div[@id='error-message']")
	private List<WebElement> errorMessage_ToolTip_Xpath; 	
	*//**Reset button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='dropDownListBox']/div[2]")
	private WebElement reset_Button_Xpath;
	*//**Attachment icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='attachement--info']")
	private List<WebElement> attachment_Icon_Xpath;
	*//**Attachment delete icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='dropDown--container']/div[2]/img")
	private WebElement delectIcon_Image_Xpath;
	*//**Fetch button xpath*//*
	@FindBy(how=How.XPATH,using="//button/span[text()='Fetch']")
	private WebElement fetch_Button_Xpath;
	*//**Cross image Xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='header-close-icon']/img")
	private WebElement cross_Img_Xpath;
    public  VendorInitialPage(WebDriver driver) {
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
    	  pageWrapper= new TestBotElementsWrapper(driver);
    }
	@Override
	protected void load() {
		// TODO Auto-generated method stub		
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub	
		if(!pageWrapper.myElementIsClickable(this.driver, vendorName_Input_Xpath)) {
            throw new Error("InvoiceInitialPage was not successfully loaded");
        }
	}
	*//**Method to enter values for each field in  vendor initial screen*//*
    public VendorInitialPage addVendorDetails(XSSFRow rowData) throws Exception {
        pageWrapper.addTextField(vendorName_Input_Xpath, rowData.getCell(1).toString());
    	pageWrapper.addTextField(description_Input_Xpath, rowData.getCell(2).toString());
    	pageWrapper.addTextField(emailId_Input_Xpath, rowData.getCell(3).toString());
    	pageWrapper.addTextField(phoneNo_Input_Xpath, rowData.getCell(4).toString());
    	pageWrapper.addTextField(address_Input_Xpath, rowData.getCell(5).toString());
    	pageWrapper.addTextField(city_Input_Xpath, rowData.getCell(6).toString());
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.selectValueOfDropdown(state_Dropdown_Xpath, stateOption_List_Xpath, 0);
        pageWrapper.addTextField(poiniOfContact_Input_Xpath, rowData.getCell(7).toString());
    	pageWrapper.addTextField(pan_Input_Xpath, rowData.getCell(8).toString());
    	pageWrapper.addTextField(gstin_Input_Xpath, rowData.getCell(9).toString());
    	pageWrapper.shortWait();
    	pageWrapper.uploadFile(rowData.getCell(14).toString(), gstCertificate_File_Xpath);
    	pageWrapper.ScrollToElement(gstin_Input_Xpath);
    pageWrapper.addTextField(beneficiaryName_Input_Xpath, rowData.getCell(10).toString());
    pageWrapper.addTextField(accountNumber_Input_Xpath, rowData.getCell(11).toString());
    pageWrapper.addTextField(confirmAccountNumber_Input_Xpath, rowData.getCell(11).toString());
    pageWrapper.addTextField(ifsc_Ifsc_Xpath, rowData.getCell(13).toString());
    pageWrapper.ScrollToElement(accountNumber_Input_Xpath);
	pageWrapper.uploadFile(rowData.getCell(15).toString(), cancelCheque_File_Xpath);
	pageWrapper.selectValueOfDropdown(registeredUnderMsmedAct_Dropdown_Xpath, msmed_List_Xpath, 1);
    pageWrapper.uploadFile(rowData.getCell(16).toString(), msmedActAttachment_File_Xpath);
    	return this;
    }
    *//**Method to click save button
     * @throws Exception *//*
    public  VendorInitialPage clickSave() throws Exception {
    pageWrapper.customClickAction(save_Button_Xpath);
    	return this;
    }
    *//**Method to create vendor by adding vendor details and hitting save button*//*
    public VendorDetailsPage createVendor() throws Exception {    	
    	addVendorDetails(ExcelUtils.getRowDataWithSheetName(1, "Vendor_Vendor"));
    	pageWrapper.shortWait();
    	clickSave();
    	return new VendorDetailsPage(driver);
    }   
    *//**Method to update vendor by editing vendor details and hitting save button*//*
    public VendorDetailsPage updateVendor() throws Exception {    	
    	addVendorDetails(ExcelUtils.getRowDataWithSheetName(2, "Vendor_Vendor"));
    	pageWrapper.shortWait();
    	clickSave();
    	return new VendorDetailsPage(driver);
    }      
    *//**Method to validate mandatory fields*//*    
    public boolean assertMandatoryCheck() {
   	pageWrapper.shortWait();
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(1), errorMessage_ToolTip_Xpath.get(1), "Phone No is a mandatory. This field needs to filled before submission");
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(2), errorMessage_ToolTip_Xpath.get(2), "Address is a mandatory. This field needs to filled before submission");
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(3), errorMessage_ToolTip_Xpath.get(3), "City is a mandatory. This field needs to filled before submission");
    	pageWrapper.ScrollToElement(city_Input_Xpath);  
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(5), errorMessage_ToolTip_Xpath.get(5), "PAN is a mandatory. This field needs to filled before submission");
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(6), errorMessage_ToolTip_Xpath.get(6), "GSTIN is a mandatory. This field needs to filled before submission");
    pageWrapper.ScrollToElement(gstin_Input_Xpath);
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(7), errorMessage_ToolTip_Xpath.get(7), "Beneficiary Name is a mandatory. This field needs to filled before submission");
    	return true;    	
    }
    *//**Method to add Vendor Name*//*
    public VendorDetailsPage enterVendorName(XSSFRow rowData) {
    	pageWrapper.addTextField(vendorName_Input_Xpath, rowData.getCell(1).toString());
    	pageWrapper.longWait();
	return new VendorDetailsPage(driver);    	
    }
    *//**Method to capture value of vendor name field*//*
    public String captureValue() {
    pageWrapper.shortWait();
    	pageWrapper.waitForElementVisible(vendorName_Input_Xpath);
    	return pageWrapper.getValue(vendorName_Input_Xpath);
    }
    *//**Method to check default value of a field*//*
    public boolean defaultCheck() {
    pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    boolean result=pageWrapper.isDefault(isVendorGstRegisterted_Dropdown_Xpath);    
    	return result;
    }
    *//**Method to check dependent field appearance*//*
    public boolean isDependentFieldDisplayed() {
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.selectValueOfDropdown(state_Dropdown_Xpath, stateOption_List_Xpath, 0);
    return	pageWrapper.isElementDisplayed(stateCode_Input_Xpath);
    }
    *//**Method to add bacc details*//*
    public VendorInitialPage addBACC(XSSFRow rowData) {
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.ScrollToElement(gstin_Input_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.addTextField(accountNumber_Input_Xpath, rowData.getCell(11).toString());
    pageWrapper.addTextField(confirmAccountNumber_Input_Xpath, rowData.getCell(4).toString());
    	return this;
    }
    *//**Method to verify bacc matching*//*
    public boolean assertBACC(String baccValidation) {
    boolean result=	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(0), errorMessage_ToolTip_Xpath.get(0), baccValidation);
    return result;
    }
    *//**Method to add incorrect IFSC*//*
    public VendorInitialPage addIncorrectIFSC(XSSFRow rowData) {
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.ScrollToElement(gstin_Input_Xpath);
    	pageWrapper.addTextField(ifsc_Ifsc_Xpath, rowData.getCell(18).toString());
    	return this;
    }
    *//**Method to add incorrect IFSC and validate error message
     * @throws Exception *//*
    public boolean assertIFSC(String ifscValidation) throws Exception  {
    	boolean result=false;
    	addIncorrectIFSC(ExcelUtils.getRowDataWithSheetName(1, "Vendor_Vendor"));
    result=pageWrapper.assertValidation(errorIcon_Image_Xpath.get(0), errorMessage_ToolTip_Xpath.get(0), ifscValidation);
    return result;
    }
    *//**Method to add correct IFSC*//*
    public VendorInitialPage addCorrectIFSC(XSSFRow rowData) {
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.ScrollToElement(gstin_Input_Xpath);
    	pageWrapper.addTextField(ifsc_Ifsc_Xpath, rowData.getCell(13).toString());
    	return this;
    }
    *//**Method to assert bank details*//*
    public boolean assertBankDetails(String branch,String bank) throws Exception {
    	boolean result=false;
    	addCorrectIFSC(ExcelUtils.getRowDataWithSheetName(1, "Vendor_Vendor"));
    result=	pageWrapper.assertBankDetails(branchName_Input_Xpath, branch,bankName_Input_Xpath , bank);
	return result;
    }
    *//**Method to clear mandatory fields*//*
    public VendorInitialPage clearMandatory() {
    pageWrapper.clearValue(vendorName_Input_Xpath);
    	pageWrapper.clearValue(phoneNo_Input_Xpath);
    	pageWrapper.clearValue(address_Input_Xpath);
    	pageWrapper.clearValue(city_Input_Xpath);
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.resetDropDownValue(state_Dropdown_Xpath, reset_Button_Xpath);
    
    pageWrapper.clearValue(pan_Input_Xpath);
    pageWrapper.clearValue(gstin_Input_Xpath);
	pageWrapper.ScrollToElement(gstin_Input_Xpath);
	pageWrapper.clearValue(beneficiaryName_Input_Xpath);
	pageWrapper.clearValue(accountNumber_Input_Xpath);
	pageWrapper.clearValue(confirmAccountNumber_Input_Xpath);
	pageWrapper.clearValue(ifsc_Ifsc_Xpath);
 	pageWrapper.resetDropDownValue(registeredUnderMsmedAct_Dropdown_Xpath, reset_Button_Xpath);
    	return this;
    }
    *//**Method to clear account no and bacc*//*
    @Step("Method to clear account no and bacc")
    public VendorInitialPage clearBacc() {
    pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.ScrollToElement(gstin_Input_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.clearValue(accountNumber_Input_Xpath);
    	pageWrapper.clearValue(confirmAccountNumber_Input_Xpath);
    	return this;
    }
    *//**Method to clear IFSC Field*//*
    public VendorInitialPage clearIfsc() {
    	 pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
     pageWrapper.ScrollToElement(gstin_Input_Xpath);
     pageWrapper.clearValue(ifsc_Ifsc_Xpath);
    return this;
    }
    *//**Method to clear values for each field in  vendor initial screen*//*
    public VendorInitialPage clearAll() throws Exception {
    	//driver.navigate().refresh();
    pageWrapper.clearValue(vendorName_Input_Xpath);
    	pageWrapper.clearValue(description_Input_Xpath);
    	pageWrapper.clearValue(phoneNo_Input_Xpath);
    	pageWrapper.clearValue(address_Input_Xpath);
    	pageWrapper.clearValue(city_Input_Xpath);
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.resetDropDownValue(state_Dropdown_Xpath, reset_Button_Xpath);
    pageWrapper.clearValue(poiniOfContact_Input_Xpath);
    	pageWrapper.clearValue(pan_Input_Xpath);
    	pageWrapper.clearValue(gstin_Input_Xpath);
    	pageWrapper.shortWait();
    	pageWrapper.deleteUploadedFile(attachment_Icon_Xpath.get(0), delectIcon_Image_Xpath);
    	pageWrapper.ScrollToElement(poiniOfContact_Input_Xpath);
    pageWrapper.clearValue(beneficiaryName_Input_Xpath);
	//pageWrapper.ScrollToElement(accountNumber_Input_Xpath);
    pageWrapper.clearValue(accountNumber_Input_Xpath);
    pageWrapper.clearValue(confirmAccountNumber_Input_Xpath);
    pageWrapper.clearValue(ifsc_Ifsc_Xpath);
    pageWrapper.ScrollToElement(accountNumber_Input_Xpath);
	pageWrapper.deleteUploadedFile(attachment_Icon_Xpath.get(0), delectIcon_Image_Xpath);
	pageWrapper.resetDropDownValue(registeredUnderMsmedAct_Dropdown_Xpath, reset_Button_Xpath);
    pageWrapper.deleteUploadedFile(attachment_Icon_Xpath.get(0), delectIcon_Image_Xpath);
    	return this;
    }
    *//**Method to enter wrong gstin*//*
    public VendorInitialPage enterGstin(XSSFRow rowData) {
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.writeText(gstin_Input_Xpath, rowData.getCell(9).toString());
    	return this;    	
    }
    *//**Method to click fetch
     * @throws Exception *//*
    public VendorInitialPage clickFetch() throws Exception {
    	pageWrapper.customClickAction(fetch_Button_Xpath);
    	return this;
    }
    *//**Method to validate gstin
     * @throws Exception *//*
    public boolean validateGstin() throws Exception {
    	pageWrapper.customClickAction(fetch_Button_Xpath);
    	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(0), errorMessage_ToolTip_Xpath.get(0), "Unable to parse gstin");
    	return true;
    }
    *//**Method to validate fetched data from gstin*//*
    public boolean validateFetchedData(XSSFRow rowData) {
    	pageWrapper.scrollUp();
    	pageWrapper.mediumWait();
    	pageWrapper.assertTextValue(address_Input_Xpath.getAttribute("value").toString(), rowData.getCell(5).toString());
    	pageWrapper.ScrollToElement(description_Input_Xpath);
    	pageWrapper.assertTextValue(selectedState_Value_Xpath.get(0).getText(), rowData.getCell(19).toString());
    	pageWrapper.assertTextValue(stateCode_Input_Xpath.getAttribute("value").toString(), rowData.getCell(20).toString());
        pageWrapper.ScrollDown(gstin_Input_Xpath);
    	pageWrapper.assertTextValue(beneficiaryName_Input_Xpath.getAttribute("value").toString(), rowData.getCell(8).toString());    	   
    	return true;
    }
    *//**Method to chexk fetch is enabled or not*//*
    public boolean isFetchedEnabled() {
    	pageWrapper.ScrollToElement(phoneNo_Input_Xpath);
    	pageWrapper.isElementEnabled(fetch_Button_Xpath);
    	return true;
    }
    
    *//**Method to click cross
	 * @throws Exception *//*
    public PageElements_VendorPage clickCross() throws Exception{
    	pageWrapper.customClickAction(cross_Img_Xpath);
    	return new PageElements_VendorPage(driver);
    }
  
}
*/