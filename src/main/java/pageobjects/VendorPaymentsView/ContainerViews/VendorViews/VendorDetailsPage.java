/*package pageobjects.VendorPaymentsView.ContainerViews.VendorViews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;
import pageobjects.VendorPaymentsView.CommonViews.PageElements_VendorPage;

public class VendorDetailsPage extends LoadableComponent<VendorDetailsPage> {
	TestBotElementsWrapper pageWrapper;
	*//** The driver. *//*
	private WebDriver driver;
	*//**The submit button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Submit']]]")
    private WebElement submit_Button_Xpath;	
	*//**The delete button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Delete']]]")
    private WebElement delete_Button_Xpath;	
	*//**The Toast Message Xpath*//*
	@FindBy(how=How.XPATH, using="//span[@class='message']")
	private WebElement toastMessage_Xpath;
	*//**The Edit Vendor Button Xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='EditCloseAction']/div[1]/button")
	private WebElement editVendor_Button_Xpath;
	*//**The Confirm Button Xpath*//*
	@FindBy(how=How.XPATH,using="//button[div[span[text()='Confirm']]]")
	private WebElement confirm_Button_Xpath;
	*//**The Cancel Button Xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Cancel']]]")
	private WebElement cancel_Button_Xpath;
	*//**Cross image Xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='header-close-icon']/img")
	private WebElement cross_Img_Xpath;
	*//**Approve and pay action button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Approve and Pay']]]")
	private WebElement approveAndPay_Button_Xpath;
	*//**Register action button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Register']]]")
	private WebElement register_Button_Xpath;
	*//**Decline button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Decline']]]")
	private WebElement decline_Button_Xpath;
	*//**Status link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='customStatus']/div[2]")
	private WebElement status_Link_Xpath;
	*//**Recall button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Recall']]]")
    private WebElement recall_Button_Xpath;	
	*//**Resubmit button xpath*//*
	@FindBy(how=How.XPATH, using="//button[div[span[text()='Resubmit']]]")
    private WebElement resubmit_Button_Xpath;
	*//**Created on field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='ct-table-body']/div[2]/div[2]")
	private WebElement createdOn_Input_Xpath;
	public VendorDetailsPage(WebDriver driver) {
		this.driver= driver;
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
		if(!pageWrapper.myElementIsClickable(this.driver, submit_Button_Xpath)) {
            throw new Error("InvoiceInitialPage was not successfully loaded");
        }
	}	
	public VendorDetailsPage clickSubmit() throws Exception {
		pageWrapper.customClickAction(submit_Button_Xpath);
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
    *//**Method to click edit vendor button
     * @throws Exception *//*
    public VendorInitialPage clickEditVendor() throws Exception {
    	pageWrapper.customClickAction(editVendor_Button_Xpath);
    	return new VendorInitialPage(driver);
    }
    *//**Method to click approve and pay action
     * @throws Exception *//*
    public VendorDetailsPage clickApproveAndPay() throws Exception {
    pageWrapper.customClickAction(approveAndPay_Button_Xpath);
    	return this;
    }
    *//**Method to click register action
     * @throws Exception *//*
    public VendorDetailsPage clickRegister() throws Exception {
    	driver.navigate().refresh();
    	pageWrapper.customClickAction(register_Button_Xpath);
    	return this;
    }
    *//**Method to click decline action
     * @throws Exception *//*
    public VendorDetailsPage clickDecline() throws Exception {
    	driver.navigate().refresh();
    	pageWrapper.customClickAction(decline_Button_Xpath);
    	return this;
    }
    *//**Method to assert status of vendor*//*
    public String captureStatus() {
    	pageWrapper.shortWait();
    	pageWrapper.waitForElementVisible(status_Link_Xpath);
    String status= pageWrapper.getText(status_Link_Xpath);
    	return status;
    }
    *//**Method to click recall button
     * @throws Exception *//*
    public VendorDetailsPage clickRecall() throws Exception {
    	pageWrapper.customClickAction(recall_Button_Xpath);
    	return this;
    }
    *//**Method to click resubmit button
     * @throws Exception *//*
    public VendorDetailsPage clickResubmit() throws Exception {
    	pageWrapper.customClickAction(resubmit_Button_Xpath);
    	return this;
    }
    *//**Method to capture created on*//*
    public String captureCreatedOn() {
    String createdDate= pageWrapper.getText(createdOn_Input_Xpath);
    return createdDate;
    }
}
*/