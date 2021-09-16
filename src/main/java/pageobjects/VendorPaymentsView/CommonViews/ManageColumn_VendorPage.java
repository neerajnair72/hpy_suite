/*package pageobjects.VendorPaymentsView.CommonViews;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;import pageobjects.VendorPaymentsView.CommonViews.ContainerElements_VendorPage.containerOptions;

public class ManageColumn_VendorPage extends LoadableComponent<ManageColumn_VendorPage>{
	TestBotElementsWrapper pageWrapper;

	*//** The driver. *//*
	private WebDriver driver;
	
	public ManageColumn_VendorPage(WebDriver driver) {

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
	*//**Column checkbox xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[text()='Status']]/div[1]")
	private WebElement column_Checkbox_Xpath;
	*//**Apply button xpath*//*
	@FindBy(how=How.XPATH,using="//span[text()='Apply']")
	private WebElement apply_Button_Xpath;
	*//**Cancel button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='Cancel']")
	private WebElement cancel_Button_Xpath;
	*//**Column header xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='ct-header-content']/span/div/span")
	private List<WebElement> column_Header_Xpath;
	*//**Status Column xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[span[div[span[text()='Status']]]]]")
	private WebElement status_Column_Xpath;
	*//**Selected column xpath*//*
	@FindBy(how=How.XPATH,using="//li[@class='dragabblecolumn-list-item']")
	private List<WebElement> selected_Columns_Xpath;
	*//**Reset to default link xpath*//*
	@FindBy(how=How.XPATH,using="//a[text()='Reset to Default']")
    private WebElement resetToDefault_Button_Xpath;	
	*//**Remove all link xpath*//*
	@FindBy(how=How.XPATH,using="//a[text()='Remove All']")
	private WebElement removeAll_Button_Xpath;
	*//**Selectall checkbox xpath*//*
	@FindBy(how=How.XPATH, using="//div[span[text()='Select all']]/div[1]")
	private WebElement selectAll_Checkbox_Xpath;
	
	*//**Method to click apply
	 * @throws Exception *//*
	public ManageColumn_VendorPage clickApply() throws Exception {
		pageWrapper.customClickAction(apply_Button_Xpath);
         return this;
	}
	public ManageColumn_VendorPage selectColumn() throws Exception {
		pageWrapper.customClickAction(column_Checkbox_Xpath);
		clickApply();
		return this;
	}
	*//**Method to capture column name*//*
	public String captureColumnName() {
		String colName= column_Header_Xpath.get(1).getText();
		return colName;
	}
	*//**Method to check column displayed or not*//*
	    public boolean columnDisplayed() {
	    boolean result=	pageWrapper.isColumnDisplayed(status_Column_Xpath);
	    return result;
	}
	*//**Method to click select all
	 * @throws Exception *//*
	public ManageColumn_VendorPage SelectAll() throws Exception {
		pageWrapper.customClickAction(selectAll_Checkbox_Xpath);
		clickApply();
		return this;
		
	}
	*//**Method to get all column headers*//*
	public List<WebElement> getAllColumns(){
		return column_Header_Xpath;
	}
	*//**Method to click reset to default
	 * @throws Exception *//*
	public ManageColumn_VendorPage clickResetToDefault() throws Exception {
		pageWrapper.customClickAction(resetToDefault_Button_Xpath);
		clickApply();
		return this;
	}
	*//**Method to remove all action
	 * @throws Exception *//*
	public ManageColumn_VendorPage removeAll() throws Exception {
		pageWrapper.customClickAction(removeAll_Button_Xpath);
		clickApply();
		return this;
	}
}

*/