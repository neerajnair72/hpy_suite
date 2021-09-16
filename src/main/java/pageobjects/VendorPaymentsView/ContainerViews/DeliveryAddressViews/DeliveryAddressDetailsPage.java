/*package pageobjects.VendorPaymentsView.ContainerViews.DeliveryAddressViews;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.ExcelUtils;
import pageobjects.VendorPaymentsView.CommonViews.PageElements_VendorPage;
import pageobjects.VendorPaymentsView.ContainerViews.DeliveryAddressViews.DeliveryAddressDetailsPage;

public class DeliveryAddressDetailsPage extends LoadableComponent<DeliveryAddressDetailsPage>{
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
		if(!pageWrapper.myElementIsClickable(this.driver, locationlName_Input_Xpath)) {
            throw new Error("DeliveryAddressDetailsPage was not successfully loaded");
        }
		
	}
	public DeliveryAddressDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}
	*//**Location Name input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Location Name']")
	private WebElement locationlName_Input_Xpath;
	*//**Address input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type Address']")
	private WebElement address_Input_Xpath;
	*//**City input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type City']")
	private WebElement city_Input_Xpath;
	*//**State Dropdown xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='selectedValue']")
	private WebElement state_Dropdown_Xpath;
	*//**State Dropdown  Option xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='dropDownList']/li[2]")
	private List<WebElement> state_Option_Xpath;
	*//**GSTIN input xpath*//*
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type GSTIN']")
	private WebElement gstin_Input_Xpath;
	*//**Save button Xpath*//*
	@FindBy(how=How.XPATH,using="//button[div[span[text()='Save']]]")
	private WebElement save_Button_Xpath;
	*//**Cross image Xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='header-close-icon']/img")
	private WebElement cross_Img_Xpath;
	*//**The Toast Message Xpath*//*
	@FindBy(how=How.XPATH, using="//span[@class='message']")
	private WebElement toastMessage_Xpath;
	*//**The Error icon image xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='error-icon']")
	private List<WebElement> errorIcon_Image_Xpath;
	*//**The mandatory error message xpath*//*
	@FindBy(how=How.XPATH,using="//div[@id='error-message']")
	private List<WebElement> errorMessage_ToolTip_Xpath; 	
	*//**Reset button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='dropDownListBox']/div[2]")
	private WebElement reset_Button_Xpath;
	*//**Delete button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Delete']")
	private WebElement delete_Button_Xpath;
	*//**Delete button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Confirm']")
	private WebElement confirm_Button_Xpath;
	*//**Container name textbox xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='conName']")
	private WebElement containerName_Input_Xpath;
	*//**Invoice Item title xpath*//*
	@FindBy(how=How.XPATH,using="//h3[@class='title']")
	private List<WebElement> title_xpath; 
	*//**Method to click save button
	 * @throws Exception *//*
	public  DeliveryAddressDetailsPage clickSave() throws Exception {
	pageWrapper.customClickAction(save_Button_Xpath);
		return this;
	}
	*//**Method to add delivery address details*//*
	public DeliveryAddressDetailsPage addDeliveryAddressDetails(XSSFRow rowData) {
		pageWrapper.writeText(locationlName_Input_Xpath, rowData.getCell(1).toString());
		pageWrapper.writeText(address_Input_Xpath, rowData.getCell(2).toString());
		pageWrapper.writeText(city_Input_Xpath, rowData.getCell(3).toString());
		pageWrapper.selectValueOfDropdown(state_Dropdown_Xpath, state_Option_Xpath, 0);
		pageWrapper.writeText(gstin_Input_Xpath, rowData.getCell(4).toString());
		return this;	
	}
	*//**Method to create delivery address
	 * @throws Exception *//*
	public DeliveryAddressDetailsPage createDeliveryAddress() throws Exception {
		addDeliveryAddressDetails(ExcelUtils.getRowDataWithSheetName(1, "DelivertAddress_Vendor"));
		clickSave();	
		return this;
	}
	*//**Method to edit delivery address
	 * @throws Exception *//*
	public DeliveryAddressDetailsPage editDeliveryAddress() throws Exception {
		addDeliveryAddressDetails(ExcelUtils.getRowDataWithSheetName(2, "DelivertAddress_Vendor"));
		clickSave();	
		return this;
	}
	*//**Method to click cross
	 * @throws Exception *//*
	public PageElements_VendorPage clickCross() throws Exception{
		pageWrapper.customClickAction(cross_Img_Xpath);
		return new PageElements_VendorPage(driver);
	}
	*//**Method to get taost message*//*
	public String captureToastMessage() {
		pageWrapper.shortWait();
		pageWrapper.waitForElementVisible(toastMessage_Xpath);
		return pageWrapper.getText(toastMessage_Xpath);
	}
	*//**Method to check mandatory validation for delivery address details screen*//*
	public boolean mandantotyCheck() {
		pageWrapper.scrollUp();
	    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(0), errorMessage_ToolTip_Xpath.get(0), "Location Name is a mandatory. This field needs to filled before submission");
		pageWrapper.assertValidation(errorIcon_Image_Xpath.get(1), errorMessage_ToolTip_Xpath.get(1), "Address a mandatory. This field needs to filled before submission");
		pageWrapper.assertValidation(errorIcon_Image_Xpath.get(2), errorMessage_ToolTip_Xpath.get(2), "City is a mandatory. This field needs to filled before submission"); 
		pageWrapper.assertValidation(errorIcon_Image_Xpath.get(3), errorMessage_ToolTip_Xpath.get(3), "State is a mandatory. This field needs to filled before submission");	
		pageWrapper.assertValidation(errorIcon_Image_Xpath.get(4), errorMessage_ToolTip_Xpath.get(4), "GSTIN is a mandatory. This field needs to filled before submission");	
		return true;
	}
	*//**Method to add location Name*//*
	public DeliveryAddressDetailsPage enterLocationName(XSSFRow rowData) {
		pageWrapper.addTextField(locationlName_Input_Xpath, rowData.getCell(1).toString());
		pageWrapper.longWait();
	    return this;  	
	}
	*//**Method to capture value of location name  field*//*
	public String captureValue() {
	pageWrapper.shortWait();
		pageWrapper.waitForElementVisible(locationlName_Input_Xpath);
		return pageWrapper.getValue(locationlName_Input_Xpath);
	}
	*//**Method to clear mandatory fields*//*
	public DeliveryAddressDetailsPage clearMandatory() {
	pageWrapper.clearValue(locationlName_Input_Xpath);
		pageWrapper.clearValue(address_Input_Xpath);
		pageWrapper.clearValue(city_Input_Xpath);
	 	pageWrapper.resetDropDownValue(state_Dropdown_Xpath, reset_Button_Xpath);
		pageWrapper.clearValue(gstin_Input_Xpath);	
		return this;
	}
	*//**Method to delete delivery Addressr*//*
	public DeliveryAddressDetailsPage deleteDeliveryAddress() throws Exception {
		pageWrapper.shortWait();
		pageWrapper.customClickAction(delete_Button_Xpath);		
		pageWrapper.waitAndClickWebElement(confirm_Button_Xpath);
		return this;		
	}
	*//**Method to get title after adding new delivary address from invoice*//*
	public String getTitle() {
		return pageWrapper.getText(title_xpath.get(3));
	}
}
*/