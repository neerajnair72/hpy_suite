package pageobjects.PrivilegedViews;

import frameworkBase.TestBotElementsWrapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettlementPage extends TestBotElementsWrapper {


	/** The wallettype field. */
	@FindBy(xpath = "//input[@placeholder='Select a wallet']")
	private WebElement wallet;

	/** The done button. */
     @FindBy(xpath="//button/span[text()='Done']")
	private WebElement done;

	/** The Settlementtab button. */
	@FindBy(xpath = "//div[@value='finance-settlementTabs/settlements']//div[text()='Settlement']")
	private WebElement settlementtab;

	/** The User Selection. */
	@FindBy(xpath = "//table/tbody/tr[1]")
	private WebElement userselection;

	/** The Settlenow button, */
	@FindBy(xpath = "//table/tbody/tr[1]//span[text()='Settle now']")
	private WebElement settlenowbutton;

	/** The Final Settlement PopUp. */
	@FindBy(xpath = "//div/span[text()='Final Settlement']")
	private WebElement finalsettlement;

	/** The Amount Field. */
	@FindBy(xpath = "//input[@placeholder='Amount']")
	private WebElement amount;

	/** The Settle by Field. */
	@FindBy(xpath = "//input[@placeholder='Select Settle By']")
	private WebElement settleby;

	/** The OutofHappay . */
	@FindBy(xpath = "//div/span[@title='Out of happay']")
	private WebElement outofhappay;

	/** Through wallet dropdown option. */
	@FindBy(xpath = "//div/span[@title='Through wallet']")
	private WebElement throughwallet;

	/** The Settlement Type Field. */
	@FindBy(xpath = "//div[text()='Select Settlement Type']/..//input")
	private WebElement settlementtype;

	/** The paid by employee . */
	@FindBy(xpath = "//div/span[@title='To be paid to employee']")
	private WebElement paidbyemployee;

	/** The paid by organization . */
	@FindBy(xpath = "//div/span[@title='To be paid to organization']")
	private WebElement paidbyorg;

	/** The imprest wallet . */
	@FindBy(xpath = "//div/span[@title='Imprest']")
	private WebElement imprest;

	/** The food wallet . */
	@FindBy(xpath = "//div/span[@title='Food']")
	private WebElement food;

	/** The SettlementDate wallet . */
    @FindBy(xpath="//div/label[text()='Settlement Date']")
	private WebElement settlementdate_xpath;

	/** Date Extra Field */
	@FindBy(xpath = "//button/span[contains(@style,'rgb(255, 255, 255)')]")
	private WebElement Today_Date_xpath;

	/** Toast message */
	@FindBy(xpath = "//div[@class='customToastContent']")
	private WebElement SuccessMessage_Toast_xpath;

	/** Company Balance */
	@FindBy(className = "hdr-Wallet-section-privilege-balance")
	private WebElement companybalance;

	/** opening Balance */
	@FindBy(xpath = "//tr[1]/td[3]//div[@class='settle_amt_col_cur']")
	private WebElement openingbalance;

	/** pop up close button */
	@FindBy(xpath = "//span/img[@src='./assets/images/popup-close-button.svg']")
	private WebElement settlementPopupClose;

	/** close display */
	@FindBy(xpath = "react-bs-container-body")
	private WebElement closedisplay;

	public SettlementPage getSettlementPopupClose() {

        waitAndClickWebElement(settlementPopupClose);
        //shortWait();


		return this;
	}

	public double getCompanyBalance() {

		return Double.parseDouble(companybalance.getText().replaceAll("[^0-9\\.]+", ""));
	}

	public double getOpeningBalance(WebDriverWait w) {

		return Double.parseDouble(
				w.until(ExpectedConditions.visibilityOf(openingbalance)).getText().replaceAll("[^0-9\\.]+", ""));
	}

	@SuppressWarnings("static-access")
	public SettlementPage Date() throws Exception {

        waitAndClickWebElement(settlementdate_xpath);
	    waitForElementToClickable(settlementdate_xpath);
        waitAndClickWebElement(settlementdate_xpath);
        //shortWait();
        waitForElementToClickable(Today_Date_xpath);
        waitAndClickWebElement(Today_Date_xpath);
		return this;
	}

	private WebElement getSettlement_initiated_successfully() {
		waitForElementVisible(SuccessMessage_Toast_xpath);
		isElementDisplayed(SuccessMessage_Toast_xpath);
		return SuccessMessage_Toast_xpath;
	}

	@SuppressWarnings("static-access")
	public SettlementPage settleOutOfHappay() throws Exception {

		waitForElementVisible(outofhappay);
		waitAndClickWebElement(outofhappay);
		return this;
		// outofhappay.click();

	}

	@SuppressWarnings("static-access")
	public SettlementPage settleThroughWallet() throws Exception {

		waitForElementVisible(throughwallet);
		waitAndClickWebElement(throughwallet);
		return this;
	}

	@SuppressWarnings("static-access")
	public SettlementPage paidByEmployee() throws Exception {

		waitForElementVisible(paidbyemployee);
        //shortWait();
		waitAndClickWebElement(paidbyemployee);


		return this;

	}

	@SuppressWarnings("static-access")
	public SettlementPage paidByOrg() throws Exception {

		waitForElementVisible(paidbyorg);
        //shortWait();
		waitAndClickWebElement(paidbyorg);
		return this;

	}
	

	@SuppressWarnings("static-access")
	public SettlementPage settleBy() throws Exception {

		waitForElementVisible(settleby);
        //shortWait();
		waitAndClickWebElement(settleby);


		return this;

	}

	public SettlementPage settleNow() {
		waitForElementVisible(settlenowbutton);
        //shortWait();
		waitAndClickWebElement(settlenowbutton);

		return this;
	}


	@SuppressWarnings("static-access")
	public SettlementPage settlementType() throws Exception {
		waitForElementVisible(settlementtype);
        //shortWait();
		waitAndClickWebElement(settlementtype);



		return this;

	}

	@SuppressWarnings("static-access")
	public SettlementPage selectWallet() throws Exception {

		waitForElementVisible(wallet);
        //shortWait();
		waitAndClickWebElement(wallet);
		return this;

	}

	public SettlementPage NavigateToSettlementTab() {
		waitForElementVisible(settlementtab);
		//shortWait();
		waitAndClickWebElement(settlementtab);
		return this;
	}

	public SettlementPage userSelection() {
		waitForElementVisible(userselection);
        //shortWait();
		waitAndClickWebElement(userselection);

		return this;
	}



	@SuppressWarnings("static-access")
	public SettlementPage walletType() throws Exception {
		waitAndClickWebElement(imprest);
        //shortWait();
		return this;

	}

	@SuppressWarnings("static-access")
	public SettlementPage walletTypeFood() throws Exception {
		waitAndClickWebElement(food);
		return this;
	}

	public SettlementPage PerformsingleUserSettlement(XSSFRow rowData) throws Exception {

		userSelection();
		settleNow();
        String b = Keys.BACK_SPACE.toString();
        amount.sendKeys(b + b + b + b + b + b + b + b + b + b);
        //shortWait();
        writeText(amount, rowData.getCell(0).toString());
		selectWallet();
		walletType();
		return this;
	}

	public SettlementPage outOfHappayUserSettlement() throws Exception {


		settleBy();
		settleOutOfHappay();
		settlementType();
		paidByEmployee();
		Date();
		return this;

	}

	public SettlementPage outofHappayPaidbyOrg() throws  Exception{


        settleBy();
        settleOutOfHappay();
        settlementType();
        paidByOrg();
        Date();
	    return this ;

    }

	public SettlementPage throughWalletSettlement() throws Exception {

        settleBy();
        settleThroughWallet();
		settlementType();
		paidByEmployee();

		return this;

	}

	public SettlementPage throughWallettoBePaidByEmployee() throws Exception {

		settleBy();
		settleThroughWallet();
		settlementType();
		paidByEmployee();
        selectWallet();
        walletType();

		return this;

	}

	public SettlementPage throughWalletPaidbyOrg() throws Exception {

		settleBy();
		settleThroughWallet();
		settlementType();
		paidByOrg();
        selectWallet();
        walletType();

		return this;

	}

	
	
	public SettlementPage throughDifferentWallet() throws Exception {

		selectWallet();
		walletTypeFood();
		settleBy();
		settleThroughWallet();
		return this;
		}

	/*
	 * public SettlementPage companyBalance() {
	 * 
	 * double companyBalance_before; double companyBalance_after; double
	 * closingBalance_after; double closingBalance_before; SoftAssert sa = new
	 * SoftAssert(); sa.assertTrue(companyBalance_before<
	 * companyBalance_after,"company balance assertion");
	 * sa.assertTrue(closingBalance_before>closingBalance_after,
	 * "closing balance assertion");
	 * 
	 * 
	 * return this; }
	 */

	@SuppressWarnings("static-access")

	public SettlementPage doneButton() throws Exception {


        moveToElement_Actions(done);
        //shortWait();
		waitAndClickWebElement(done);



		return this;

	}

}
