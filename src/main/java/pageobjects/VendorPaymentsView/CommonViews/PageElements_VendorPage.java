/*package pageobjects.VendorPaymentsView.CommonViews;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;
import pageobjects.VendorPaymentsView.ContainerViews.DeliveryAddressViews.DeliveryAddressDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.InvoiceViews.InvoiceInitialPage;
import pageobjects.VendorPaymentsView.ContainerViews.MaterialMasterViews.MaterialMasterDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorInitialPage;

public class PageElements_VendorPage extends LoadableComponent<PageElements_VendorPage>{
	TestBotElementsWrapper pageWrapper;

	*//** The driver. *//*
	private WebDriver driver;	
	
	*//**Reset All filter button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='Reset All']")
	private WebElement resetAll_Button_Xpath;
	
	*//**Saved button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='parent-container']/ul/li[1]")
	private WebElement saved_Button_Xpath;
	*//**Auto Saved button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='parent-container']/ul/li[2]")
	private WebElement autoSave_Button_Xpath;
	*//**Global Search button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='parent-container']/div[1]/input")
	private WebElement globalSearch_Button_Xpath;
	*//**Profile Icon button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='role']")
	private WebElement profileIcon_Button_Xpath;
	*//**Admin Settings button xpath*//*
	@FindBy(how=How.XPATH, using="//li[text()='Admin Settings']")
	private WebElement adminSettings_Button_Xpath;
	*//**Logout button xpath*//*
	@FindBy(how=How.XPATH, using="//li[text()='Logout']")
	private WebElement logout_Button_Xpath;
	*//**Action icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[@class='action-column-btns']]")
	private List<WebElement> action_Icon_Xpath;
	*//**Edit action button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='Edit']")
	private List<WebElement> edit_Button_Xpath;
	
	public PageElements_VendorPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
	public PageElements_VendorPage clickAutoSave() throws Exception {
		pageWrapper.waitForElementToClickable(autoSave_Button_Xpath);
		pageWrapper.customClickAction(autoSave_Button_Xpath);
		return this;
	}
	public PageElements_VendorPage clickSaved() throws Exception {
		pageWrapper.waitForElementToClickable(saved_Button_Xpath);
		pageWrapper.customClickAction(saved_Button_Xpath);
		return this;
	}

	public PageElements_VendorPage clickResetAllFilters() throws Exception {
		pageWrapper.waitForElementToClickable(resetAll_Button_Xpath);
		pageWrapper.customClickAction(resetAll_Button_Xpath);
		return this;
	}
	public PageElements_VendorPage clickGlobalSearch() throws Exception {
		pageWrapper.waitForElementToClickable(globalSearch_Button_Xpath);
		pageWrapper.customClickAction(globalSearch_Button_Xpath);
		return this;
	}
   public PageElements_VendorPage logout() throws Exception {
	   pageWrapper.waitForElementToClickable(profileIcon_Button_Xpath);
	   pageWrapper.customClickAction(profileIcon_Button_Xpath);
	   pageWrapper.waitForElementToClickable(logout_Button_Xpath);
	   pageWrapper.customClickAction(logout_Button_Xpath);
	   return this;
   }
 
   *//**Method to click edit button
 * @throws Exception *//*
   public VendorInitialPage clickEdit() throws Exception {
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(edit_Button_Xpath.get(0));
	   pageWrapper.customClickAction(edit_Button_Xpath.get(0));
	   return new VendorInitialPage(driver);
   }
   *//**Method to click edit button
 * @throws Exception *//*
   public InvoiceInitialPage clickEditInvoice() throws Exception {
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(edit_Button_Xpath.get(0));
	   pageWrapper.customClickAction(edit_Button_Xpath.get(0));
	   return new InvoiceInitialPage(driver);
   }
   *//**Method to click edit button
 * @throws Exception *//*
   public MaterialMasterDetailsPage clickEditMaterialMaster() throws Exception {
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(edit_Button_Xpath.get(0));
	   pageWrapper.customClickAction(edit_Button_Xpath.get(0));
	   return new MaterialMasterDetailsPage(driver);
   }
   *//**Method to click edit button
 * @throws Exception *//*
   public DeliveryAddressDetailsPage clickEditDeliveryAddress() throws Exception {
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(edit_Button_Xpath.get(0));
	   pageWrapper.customClickAction(edit_Button_Xpath.get(0));
	   return new DeliveryAddressDetailsPage(driver);
   }
}
*/