package orgUtils_ExpenseProduct;

import frameworkBase.TestBotElementsWrapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;
import pageobjects.CommonViews.CommonPageElements;

import java.util.List;

public class Automation_ExpenseOrg extends TestBotElementsWrapper {
	 
	SoftAssert softAssert= new SoftAssert();

    /** The expense action hamburger icon xapth */
    @FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
    private List<WebElement> hamburger_Icon_Xpath;

    /** The expense action hamburger icon xapth */
    @FindBy(xpath="//tr[1]//td[17]//div[1]//img[1]")
    @CacheLookup
    private WebElement hamburger_Icon_Xpath1;

    /** Delete Expense from quick view */
    @FindBy(xpath = "//div/span/div/div[text()='Delete']")
    @CacheLookup
    private WebElement DeleteHamburger_expense_butotn;

    /** The confirm delete button xpath */
    // @FindBy(how = How.XPATH, using = "//span[text()='Delete']")
    // @FindBy(xpath="(//div/button[@class='primaryButton'])[2]")
    @FindBy(xpath = "//span[text()='Delete']/..")
    @CacheLookup
    private WebElement deleteConfirm_Button_Xpath;

    /** The Message dialog xpath transaction added successfully. */
    @FindBy(how = How.XPATH, using = "//span[text()='Transaction added successfully.']")
    @CacheLookup
    private WebElement SuccessMessage_Toast_xpath;

    /** The Message dialog xpath transaction updated successfully. */
    //@FindBy(xpath = "//div[@class='customToastContent']")
    @FindBy(xpath = "//div[@class='customToast showCustomToast']")
    @CacheLookup
    private WebElement SuccessMessageEdit_Toast_xpath;


    /** The spent at text field ID. */
    //@FindBy(id = "payee_merchant")
    @FindBy(xpath="//div/input[@id='payee_merchant']")
    @CacheLookup
    private WebElement spentAt_TextField_ID;

    /** The amount text field ID. */
    //@FindBy(id = "currency_amount")
    @FindBy(xpath="//input[@id='currency_amount']")
    @CacheLookup
    private WebElement amount_TextField_ID;

    /** The category select field xpath */
    @FindBy(xpath = "//input[@value='Select Category']")
    @CacheLookup
    private WebElement category_Select_Xpath;

    /** The description text field ID. */
    //@FindBy(how = How.ID, using = "description")
    @FindBy(xpath="//div/input[@id='description']")
    @CacheLookup
    private WebElement description_TextField_ID;


    /** The travel category select dropdown xpath */
    @FindBy(how = How.XPATH, using = "//li[@data-name='Travel']")
    @CacheLookup
    private WebElement travel_Dropdown_Xpath;

    /** automation expense in pending list after expense creation */
    @FindBy(xpath="(//div[contains(text(),'Cash')])[1]")
    @CacheLookup
    private WebElement VerifyExpense_pendingList_xpath_Automation;


//	/** The Message dialog xpath transaction deleted successfully. */
//	@FindBy(how = How.XPATH, using = "//span[text()='Transaction deleted successfully.']")
//	@CacheLookup
//	private WebElement SuccessMessageDeleted_Toast_xpath;

    /** The method to delete expensein PWC org */
	public Automation_ExpenseOrg deleteExpenseHamburger_Automation(String string) {
	    untilPageLoadComplete();
		ScrollToElement(hamburger_Icon_Xpath.get(0));
		click_Actions(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(DeleteHamburger_expense_butotn);
		waitForElementToClickable(DeleteHamburger_expense_butotn);
		click_Actions(DeleteHamburger_expense_butotn);
		////shortWait();
		waitAndClickWebElement(deleteConfirm_Button_Xpath);
		waitForElementVisible(SuccessMessageEdit_Toast_xpath);
		softAssert.assertEquals(SuccessMessageEdit_Toast_xpath.getText(), string);
		return this;
	}

    /* The method to create expense with all native fields */
    public Automation_ExpenseOrg FillTxnWithNativeFields_AutomationOrg(XSSFRow rowData) {
	    untilPageLoadComplete();
        waitForElementVisible(amount_TextField_ID);
        writeText(amount_TextField_ID, rowData.getCell(1).toString());
        waitForElementVisible(spentAt_TextField_ID);
        writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
        waitForElementVisible(description_TextField_ID);
        writeText(description_TextField_ID, rowData.getCell(3).toString());
        moveToElement_Actions(category_Select_Xpath);
        waitAndClickWebElement(category_Select_Xpath);
        ////shortWait();
        waitForElementVisible(travel_Dropdown_Xpath);
        click_Actions(travel_Dropdown_Xpath);
        return this;
    }
    
    /* The method to create expense missing amount field */
    public Automation_ExpenseOrg FillTxnMissingAmount_AutomationOrg(XSSFRow rowData) {    
    	    untilPageLoadComplete();
        waitForElementVisible(spentAt_TextField_ID);
        writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
        ////shortWait();
        writeText(description_TextField_ID, rowData.getCell(3).toString());
        moveToElement_Actions(category_Select_Xpath);
        waitAndClickWebElement(category_Select_Xpath);
        ////shortWait();
        waitForElementVisible(travel_Dropdown_Xpath);
        click_Actions(travel_Dropdown_Xpath);
        return this;
    }

    
    public CommonPageElements VerifyExpense_pending_list_Automation() {

		waitForElementVisible(VerifyExpense_pendingList_xpath_Automation);
		if(VerifyExpense_pendingList_xpath_Automation.isDisplayed())
		{
			String Expense=VerifyExpense_pendingList_xpath_Automation.getText();
			System.out.println(Expense + " is Present in pending list");
		}else
		{
			System.out.println("Not present in pending list trying again to find");
			
		}
		return GetInstance(CommonPageElements.class);
	}
    
   


//	 public Automation_ExpenseOrg createCab_AutoOrg(XSSFRow rowData) throws Exception {    
//			untilPageLoadComplete();
//			waitForElementVisible(ExpenseType_dropdown);
//			waitAndClickWebElement(ExpenseType_dropdown);
//			waitForElementVisible(CabExpenseType_xpath_Auto);
//			safeJavaScriptClick(CabExpenseType_xpath_Auto);
//			////shortWait();
//			waitForElementVisible(amount_TextField_ID);
//		    writeText(amount_TextField_ID, rowData.getCell(1).toString());
//		    waitForElementVisible(spentAt_TextField_ID);
//		    writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
//		    ////shortWait();
//		    writeText(description_TextField_ID, rowData.getCell(3).toString());
//		    return this;
//		}
//	 
//	 public Automation_ExpenseOrg createDeposit_AutoOrg(XSSFRow rowData) throws Exception {    
//			untilPageLoadComplete();
//			waitForElementVisible(ExpenseType_dropdown);
//			waitAndClickWebElement(ExpenseType_dropdown);
//			waitForElementVisible(DepositExpenseType_xpath_Auto);
//			safeJavaScriptClick(DepositExpenseType_xpath_Auto);
//			////shortWait();
//			waitForElementVisible(amount_TextField_ID);
//		    writeText(amount_TextField_ID, rowData.getCell(1).toString());
//		    waitForElementVisible(spentAt_TextField_ID);
//		    writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
//		    ////shortWait();
//		    writeText(description_TextField_ID, rowData.getCell(3).toString());
//		    return this;
//		}
  
}
