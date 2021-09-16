package pageobjects.PrivilegedViews;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;
import pageobjects.CommonViews.CommonPageElements;

import java.util.List;

/**
 * The Class ReportsPage.
 */
public class ReportsPagePrivileged extends TestBotElementsWrapper {

	/**
	 * action drop down
	 */
	@FindBy(xpath = "//div/button/span[text()='Accept ALL']/..")
	@CacheLookup
	private WebElement ActionAcceptAll_xpath;

	
	/** Reports link in Homepage */
	@FindBy(xpath = "//a[text()='REPORTS']")
	private WebElement reports_Link_xpath;
	
	/** The hamburger menu. */
	@FindBy(xpath = "(//div/img[@src='actions-icon.svg'])[1]")
	@CacheLookup
	private WebElement hamburgerMenu;
	
	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
	public static List<WebElement> hamburger_Icon_Xpath;

	/** PWC Hamburger icon */
	@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	private WebElement hamburger_Icon;
	

	//@FindBy(xpath = "//div[text()='Detailed View']")
	@FindBy(xpath="//div[text()='Detailed view']")
	@CacheLookup
	private WebElement detailedView;
	
	@FindBy(xpath = "//button//span[text()='Submit']/..")
	@CacheLookup
	private WebElement submitButton;

	@FindBy(xpath = "//div[@class='customToast showCustomToast']")
	@CacheLookup
	private WebElement SuccessMessage_Toast_xpath;
	
	/** action drop down */
	@FindBy(xpath = "//input[@class='searchableSelectTextInput']")
	@CacheLookup
	private WebElement Action_Dropdown_xpath;
	
	/** Approve all in OUP report manager*/
	@FindBy(xpath = "//div/span[@title='Approve ALL']/..")
	@CacheLookup
	private WebElement ApproveAll_Dropdown_xpath_OUP;
	
	/** Decline all in OUP report manager*/
	@FindBy(xpath = "//div/span[@title='Decline ALL']/..")
	@CacheLookup
	private WebElement DeclineAll_Dropdown_xpath_OUP;
	
	/** Hold all in OUP report manager*/
	@FindBy(xpath = "//div/span[@title='Hold ALL']/..")
	@CacheLookup
	private WebElement HoldAll_Dropdown_xpath_OUP;
	
	/** Approve all in OUP report manager*/
	@FindBy(xpath = "//div/span[@title='Verify ALL']/..")
	@CacheLookup
	private WebElement VerifyAll_Dropdown_xpath_OUP;
	
	/** Hardcopy Received all in finance side OUP org*/
	@FindBy(xpath = "	//button/span[text()='Hard Copy Received ALL']/..")
	@CacheLookup
	private WebElement HardCopyReceivedAll_xpath_OUP;

	/** Toggle view */
	@FindBy(xpath = "//div/img[@src='/assets/images/toggle.svg']")
	private WebElement Toggle_Button_xpath;


	/**
	 * action drop down
	 */
	@FindBy(xpath = "//div/span[text()='Accept']/..")
	@CacheLookup
	private WebElement ActionAccept_xpath;

	/**
	 * action drop down
	 */
	@FindBy(xpath = "//div/span[text()='Decline']/..")
	@CacheLookup
	private WebElement ActionDecline_xpath;
	/**
	 * action drop down
	 */
	@FindBy(xpath = "//div/button/span[text()='Decline ALL']/..")
	@CacheLookup
	private WebElement ActionDeclineAll_xpath;


	public ReportsPagePrivileged toggle() {
		waitForElementToClickable(Toggle_Button_xpath);
		waitAndClickWebElement(Toggle_Button_xpath);
		return this;
	}

	public ReportsPagePrivileged goto_Report_Page() {

		waitAndClickWebElement(reports_Link_xpath);

		return this;
	}
	
	public ReportsPagePrivileged SubmitWithoutAccept_Automation(String string) throws Exception

	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(hamburger_Icon);
		//ScrollToElement(hamburger_Icon);
		waitForElementVisible(hamburger_Icon);
		waitAndClickWebElement(hamburger_Icon);
		waitForElementVisible(detailedView);
		safeJavaScriptClick(detailedView);
		isElementDisplayed(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	
	
	
	public ReportsPagePrivileged Accept_Automation(String string) throws Exception
	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburgerMenu);
		waitAndClickWebElement(hamburgerMenu);
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView	);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionAccept_xpath);
		waitAndClickWebElement(ActionAccept_xpath);
		//moveToElement_Actions(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	public ReportsPagePrivileged AcceptAllManager_OUP(String string) throws Exception
	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(hamburger_Icon);
		waitForElementVisible(hamburger_Icon);
		waitAndClickWebElement(hamburger_Icon);
		waitForElementVisible(detailedView);
		safeJavaScriptClick(detailedView);
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ApproveAll_Dropdown_xpath_OUP);
		waitAndClickWebElement(ApproveAll_Dropdown_xpath_OUP);
		//moveToElement_Actions(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	public ReportsPagePrivileged AcceptAllFinance_OUP(String string) throws Exception
	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(hamburger_Icon);
		waitForElementVisible(hamburger_Icon);
		waitAndClickWebElement(hamburger_Icon);
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(VerifyAll_Dropdown_xpath_OUP);
		waitAndClickWebElement(VerifyAll_Dropdown_xpath_OUP);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	public ReportsPagePrivileged HardCopyReceivedALlFinance_OUP(String string) throws Exception
	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		isElementDisplayed(hamburger_Icon);
		waitForElementVisible(hamburger_Icon);
		waitAndClickWebElement(hamburger_Icon);
		waitForElementVisible(detailedView);
		safeJavaScriptClick(detailedView);
		waitForElementVisible(HardCopyReceivedAll_xpath_OUP);
		waitAndClickWebElement(HardCopyReceivedAll_xpath_OUP);
		isElementDisplayed(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		waitForText(SuccessMessage_Toast_xpath,string);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	public ReportsPagePrivileged Decline_Automation(String string) throws Exception

	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView	);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionDecline_xpath);
		waitAndClickWebElement(ActionDecline_xpath);
		//moveToElement_Actions(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	public ReportsPagePrivileged AcceptAll_Automation(String string) throws Exception
  
	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView	);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionAcceptAll_xpath);
		waitAndClickWebElement(ActionAcceptAll_xpath);
		//moveToElement_Actions(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	
	public ReportsPagePrivileged DeclineAll_Automation(String string) throws Exception

	{   SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView	);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionDeclineAll_xpath);
		waitAndClickWebElement(ActionDeclineAll_xpath);
		//moveToElement_Actions(submitButton);
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElements.class).logout();
		/*waitAndClickWebElement(CommonPageElements.hamburgerMenu);
	 	waitAndClickWebElement(CommonPageElements.logoutLink);*/
		
	}
}
