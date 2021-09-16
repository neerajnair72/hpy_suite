package pageobjects.PrivilegedViews;

import frameworkBase.TestBotElementsWrapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.List;

/**
 * The Class TravelRequestsPage.
 */
public class TRFPagePrivileged extends TestBotElementsWrapper {

	/**
	 * action drop down
	 */
	@FindBy(xpath = "//div/button/span[text()='Accept ALL']/..")
	@CacheLookup
	private WebElement ActionAcceptAll_xpath;

	/**
	 * action drop down
	 */
	@FindBy(xpath = "//div/button/span[text()='Decline ALL']/..")
	@CacheLookup
	private WebElement ActionDeclineAll_xpath;

	
	/** Toggle view */
	@FindBy(xpath = "//div/img[@src='./assets/images/toggle.svg']")
	private WebElement Toggle_Button_xpath;
	
	/** Reports link in Homepage */
	//@FindBy(xpath = "//a[text()='TRAVEL REQUESTS']")
	@FindBy(xpath="//*[@id='app']/div/div[2]/div/header/div/div/div[2]/nav/a[5]")
	private WebElement TRF_Link_xpath;
	
	/** The hamburger menu. */
	@FindBy(xpath = "(//div/img[@src='actions-icon.svg'])[1]")
	@CacheLookup
	private WebElement hamburgerMenu;
	
	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
	public static List<WebElement> hamburger_Icon_Xpath;
	

	@FindBy(xpath = "//div[text()='Detailed view']")
	//@FindBy(xpath="/html/body/div[12]/div/div/div/div/div/a/div/span/div/div")
	@CacheLookup
	private WebElement detailedView;
	
	@FindBy(xpath = "//button//span[text()='Submit']/..")
	@CacheLookup
	private WebElement submitButton;

	@FindBy(xpath = "//div[@class='customToastContent']/..")
	@CacheLookup
	private WebElement SuccessMessage_Toast_xpath;
	
	/** action drop down */
	@FindBy(xpath = "//input[@class='searchableSelectTextInput']")
	@CacheLookup
	private WebElement Action_Dropdown_xpath;

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
	
	public TRFPagePrivileged toggle() {
		waitForElementToClickable(Toggle_Button_xpath);
		waitAndClickWebElement(Toggle_Button_xpath);
		return this;
	}

	public TRFPagePrivileged goto_TRF_Page() {

		waitAndClickWebElement(TRF_Link_xpath);

		return this;
	}
	
	public TRFPagePrivileged SubmitWithoutAccept_Automation(String string) throws Exception

	{SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView);
		//shortWait();
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	public TRFPagePrivileged Accept_Automation(String string) throws Exception

	{SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView	);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionAccept_xpath);
		waitAndClickWebElement(ActionAccept_xpath);
		//moveToElement_Actions(submitButton);
		//shortWait();
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	
	public TRFPagePrivileged Decline_Automation(String string) throws Exception

	{SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionDecline_xpath);
		waitAndClickWebElement(ActionDecline_xpath);
		//moveToElement_Actions(submitButton);
		//shortWait();
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;
	}
	
	public TRFPagePrivileged AcceptAll_Automation(String string) throws Exception

	{SoftAssert softAssert = new SoftAssert();
		untilPageLoadComplete();
		waitForElementVisible(hamburger_Icon_Xpath.get(0));
		waitAndClickWebElement(hamburger_Icon_Xpath.get(0));
		waitForElementVisible(detailedView);
		waitAndClickWebElement(detailedView);
		//shortWait();
		waitForElementVisible(Action_Dropdown_xpath);
		waitAndClickWebElement(Action_Dropdown_xpath);
		waitForElementVisible(ActionAcceptAll_xpath);
		waitAndClickWebElement(ActionAcceptAll_xpath);
		//moveToElement_Actions(submitButton);
		//shortWait();
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	
	public TRFPagePrivileged DeclineAll_Automation(String string) throws Exception

	{SoftAssert softAssert = new SoftAssert();
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
		//shortWait();
		waitAndClickWebElement(submitButton);
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		waitForElementInVisible(SuccessMessage_Toast_xpath);
		softAssert.assertAll();
		return this;

	}
	

}
