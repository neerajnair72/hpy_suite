/*package pageobjects.VendorPaymentsView.ContainerViews.MaterialMasterViews;

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
import pageobjects.VendorPaymentsView.ContainerViews.InvoiceViews.InvoiceInitialPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorInitialPage;


public class MaterialMasterDetailsPage extends LoadableComponent<MaterialMasterDetailsPage>{
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
		if(!pageWrapper.myElementIsClickable(this.driver, materialName_Input_Xpath)) {
            throw new Error("InvoiceInitialPage was not successfully loaded");
        }
	}
	public MaterialMasterDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}
*//**Material Name input xpath*//*
@FindBy(how=How.XPATH,using="//input[@placeholder='Type Material Name']")
private WebElement materialName_Input_Xpath;
*//**Description input xpath*//*
@FindBy(how=How.XPATH,using="//input[@placeholder='Type Description']")
private WebElement description_Input_Xpath;
*//**Category Dropdown xpath*//*
@FindBy(how=How.XPATH,using="//span[@class='selectedValue']")
private WebElement category_Dropdown_Xpath;
*//**Category Dropdown  Option xpath*//*
@FindBy(how=How.XPATH,using="//ul[@class='dropDownList']/li[2]")
private List<WebElement> category_Option_Xpath;
*//**HSN input xpath*//*
@FindBy(how=How.XPATH,using="//input[@placeholder='Type HSN or SAC']")
private WebElement hsn_Input_Xpath;
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
*//**Method to click save button
 * @throws Exception *//*
public  MaterialMasterDetailsPage clickSave() throws Exception {
pageWrapper.customClickAction(save_Button_Xpath);
	return this;
}
*//**Method to add material master details*//*
public MaterialMasterDetailsPage addMaterialMasterDetails(XSSFRow rowData) {
	pageWrapper.writeText(materialName_Input_Xpath, rowData.getCell(1).toString());
	pageWrapper.writeText(description_Input_Xpath, rowData.getCell(2).toString());
	pageWrapper.selectValueOfDropdown(category_Dropdown_Xpath, category_Option_Xpath, 0);
	pageWrapper.writeText(hsn_Input_Xpath, rowData.getCell(3).toString());
	return this;	
}
*//**Method to create material master
 * @throws Exception *//*
public MaterialMasterDetailsPage createMaterialMaster() throws Exception {
	addMaterialMasterDetails(ExcelUtils.getRowDataWithSheetName(1, "MaterialMaster_Vendor"));
	clickSave();	
	return this;
}
*//**Method to edit material master
 * @throws Exception *//*
public MaterialMasterDetailsPage editMaterialMaster() throws Exception {
	addMaterialMasterDetails(ExcelUtils.getRowDataWithSheetName(2, "MaterialMaster_Vendor"));
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
*//**Method to check mandatory validation for material master details screen*//*
public boolean mandantotyCheck() {
	pageWrapper.scrollUp();
    pageWrapper.assertValidation(errorIcon_Image_Xpath.get(0), errorMessage_ToolTip_Xpath.get(0), "Material Name is a mandatory. This field needs to filled before submission");
	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(1), errorMessage_ToolTip_Xpath.get(1), "Description a mandatory. This field needs to filled before submission");
	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(2), errorMessage_ToolTip_Xpath.get(2), "Category is a mandatory. This field needs to filled before submission"); 
	pageWrapper.assertValidation(errorIcon_Image_Xpath.get(3), errorMessage_ToolTip_Xpath.get(3), "HSN Or SAC is a mandatory. This field needs to filled before submission");	
	return true;
}

*//**Method to add material Name*//*
public MaterialMasterDetailsPage enterMaterialName(XSSFRow rowData) {
	pageWrapper.addTextField(materialName_Input_Xpath, rowData.getCell(1).toString());
	pageWrapper.longWait();
    return this;  	
}
*//**Method to capture value of materia name  field*//*
public String captureValue() {
pageWrapper.shortWait();
	pageWrapper.waitForElementVisible(materialName_Input_Xpath);
	return pageWrapper.getValue(materialName_Input_Xpath);
}
*//**Method to clear mandatory fields*//*
public MaterialMasterDetailsPage clearMandatory() {
pageWrapper.clearValue(materialName_Input_Xpath);
	pageWrapper.clearValue(description_Input_Xpath);
 	pageWrapper.resetDropDownValue(category_Dropdown_Xpath, reset_Button_Xpath);
	pageWrapper.clearValue(hsn_Input_Xpath);	
	return this;
}
*//**Method to delete material master*//*
public MaterialMasterDetailsPage deleteMaterialMaster() throws Exception {
	pageWrapper.shortWait();
	pageWrapper.customClickAction(delete_Button_Xpath);
	//pageWrapper.customClickAction(confirm_Button_Xpath);
	pageWrapper.waitAndClickWebElement(confirm_Button_Xpath);
	return this;
	
}
}
*/