package pageobjects.CommonViews;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginPage.
 */
public class LoginPage extends TestBotElementsWrapper {

	/** The org select page. */
	@FindBy(how = How.XPATH, using = "//div[text()='WebAutomation']")
	private WebElement OUP_organisation_link_xpath;
	
	/** The Back button on OrgSelection page */
	@FindBy(how = How.XPATH, using = "//button[@type='button' and text()='Back']")
	private WebElement  back_button_on_OrgSelection_page;
	
	/** Choose profile Text Xpath */
	@FindBy(how = How.XPATH, using = "//div[text()='Choose a Profile']")
	private WebElement  ChooseProfile_Text_Xpath;
	
	/** TSignInWithOTP button */
	@FindBy(how = How.XPATH, using = "//div[text()='Sign in with OTP']")
	private WebElement  signInWithOTP_button;
	
	/** The org select page. */
	@FindBy(xpath = "//div[text()='Automation (Automation)']")
	private WebElement Automation_organisation_link_xpath;
	
	/** The WebAutomationOrgSelection. */
	@FindBy(xpath = "//div[text()='WebAutomation']")
	private WebElement Web_Automation_link_xpath;

	/** The org select page. */
	@FindBy(xpath = "//div[text()='SDET(QA)']")
	// @FindBy(xpath="//div[contains(text(),'OUP_COPY (OUP_COPY)')]")
	private WebElement SDET_organisation_link_xpath;

	/** The org select page. */
	@FindBy(xpath = "//div[text()='WebAutomation']")
	// @FindBy(xpath="//div[contains(text(),'OUP_COPY (OUP_COPY)')]")
	private WebElement WebAutomation_organisation_link_xpath;

	/** The Mobile number text xpath. */
	@FindBy(how = How.XPATH, using = "//input[@id='phone-no']")
	private WebElement MobileNumber_Text_Xpath;

	/** The Next button CSS. */
	//@FindBy(xpath="//button//span[text()='NEXT']")
	//@FindBy(xpath="button[type='submit']")
	@FindBy(how = How.XPATH, using = "//button[@type='submit' and text()='Next']")
	//private WebElement Next_Button_CSS;
	private WebElement PhoneNumber_Next_Button_CSS;

	/** The Password text CSS. */
	@FindBy(how = How.XPATH, using ="//input[@id='password-field']")
	private WebElement Password_Text_CSS;
	
	/** Sigin after password entry */
	@FindBy(xpath="//button[@type='submit' and text()='Sign In']")
    private WebElement Password_Sigin_button_xpath;

	/** The Org profile link xpath. */
	@FindBy(how = How.XPATH, using = "//div[text()='WebAutomation']")
	private WebElement OrgProfile_Link_Xpath;

	/** The home link image. */
	@FindBy(how = How.XPATH, using =".//*[@id='app']/div/div[2]/div/header/div/div/div[2]/nav/a[1]")
	private WebElement homeLinkImage;

	@FindBy(xpath="//div[contains(text(),'HOME')]")
	private WebElement HOMEPAGE;

	@FindBy(xpath="//div[text()='Choose Profile']")
	private WebElement ChooseProfile;
	
	@FindBy(xpath="//div[text()='Choose a Profile']")
	private WebElement chooseProfile;
	
	/*public void Login(String countryCode, String number, String password) throws InterruptedException
	{
		//Next_Button_CSS.click();
		
		MobileNumber_Text_Xpath.sendKeys(number);
		
		Next_Button_CSS.click();
		
		Password_Text_CSS.sendKeys(password);
		
		Next_Button_CSS.click();
		
}
*/
	/**
	 * Login.
	 *
	 * @param rowData the row data
	 * @return the common page elements
	 * @throws Exception 
	 */
	@Step("Login to expense reading data from excel, for method: {method} step...")
	public CommonPageElements loginAuto(XSSFRow rowData) throws Exception {		
		//Enter Mobile Number
		isElementDisplayed(MobileNumber_Text_Xpath);
		waitForElementToClickable(MobileNumber_Text_Xpath);
		String mobilenumebr = rowData.getCell(1).toString();
		writeText(MobileNumber_Text_Xpath, rowData.getCell(1).toString() );

		//Enter Next Button
		waitForElementToClickable(PhoneNumber_Next_Button_CSS);
		waitAndClickWebElement(PhoneNumber_Next_Button_CSS);
		
		//Enter Password
		waitForElementVisible(Password_Text_CSS);
		writeText(Password_Text_CSS, rowData.getCell(2).toString());
		
		//Enter Next Button
		waitForElementToClickable(Password_Sigin_button_xpath);
		waitAndClickWebElement(Password_Sigin_button_xpath);
		waitForElementVisible(ChooseProfile_Text_Xpath);
		untilPageLoadComplete();
		
		
		if(getThreadSafeDriver().getCurrentUrl().contains("multiprofilepage"))
		{		
			waitAndClickWebElement(Web_Automation_link_xpath);
			writeText(Password_Text_CSS, rowData.getCell(2).toString());
			waitAndClickWebElement(Password_Sigin_button_xpath);
			
		}
		
		 //return new CommonPageElements(this.driver);
		 return  GetInstance(CommonPageElements.class);

	}
	
	
	
	
	@Step("Login to expense reading data from excel, for method: {method} step...")
	public CommonPageElements loginOUP(XSSFRow rowData) throws Exception {		
		//Enter Mobile Number
				waitForElementVisible(MobileNumber_Text_Xpath);
				writeText(MobileNumber_Text_Xpath, rowData.getCell(1).toString());

				//Enter Next Button
				//waitForElementToClickable(PhoneNumber_Next_Button_CSS);
				//waitAndClickWebElement(PhoneNumber_Next_Button_CSS);
				waitAndClickWebElement(PhoneNumber_Next_Button_CSS);
				
				//Enter Password
				//shortWait();
				waitForElementToClickable(Password_Text_CSS);
				writeText(Password_Text_CSS, rowData.getCell(2).toString());
				
				//Enter Next Button
				//shortWait();
				waitForElementToClickable(Password_Sigin_button_xpath);
				//waitAndClickWebElement(Password_Sigin_button_xpath);
				//Multiprofile page
				waitAndClickWebElement(Password_Sigin_button_xpath);
				waitAndClickWebElement(Password_Sigin_button_xpath);
				
				waitAndClickWebElement(WebAutomation_organisation_link_xpath);
				writeText(Password_Text_CSS, rowData.getCell(2).toString());
				waitAndClickWebElement(Password_Sigin_button_xpath);
				
//				Thread.sleep(4000);
//				if(getThreadSafeDriver().getCurrentUrl().contains("multiprofilepage"))
//				{
//				waitForElementVisible(chooseProfile);
//				if(chooseProfile.isDisplayed())
//				{
//					ScrollToElementNew(OUP_organisation_link_xpath);
//					waitAndClickWebElement(OUP_organisation_link_xpath);
//					writeText(Password_Text_CSS, rowData.getCell(2).toString());
//					waitAndClickWebElement(Password_Sigin_button_xpath);
//				}}
				System.out.println("After the login page: ");
				
				return GetInstance(CommonPageElements.class);
	}
	
	@Step("Login to expense reading data from excel, for method: {method} step...")
	public CommonPageElements loginPWC(XSSFRow rowData) throws Exception {		
		//Enter Mobile Number
		isElementDisplayed(MobileNumber_Text_Xpath);
		waitForElementToClickable(MobileNumber_Text_Xpath);
		writeText(MobileNumber_Text_Xpath, rowData.getCell(1).toString() );

		//Enter Next Button
		waitForElementToClickable(PhoneNumber_Next_Button_CSS);
		waitAndClickWebElement(PhoneNumber_Next_Button_CSS);
		
		//Enter Password
		waitForElementVisible(Password_Text_CSS);
		writeText(Password_Text_CSS, rowData.getCell(2).toString());
		
		//Enter Next Button
		waitForElementToClickable(Password_Sigin_button_xpath);
		waitAndClickWebElement(Password_Sigin_button_xpath);
		isElementDisplayed(HOMEPAGE);
		Assert.assertEquals(getThreadSafeDriver().getCurrentUrl().contains("dashboard"), true);

		return  GetInstance(CommonPageElements.class);

	}

	/**
	 * Manager login.
	 *
	 * @param rowData the row data
	 */
	public void ManagerLogin(XSSFRow rowData) {
		
	}
	
	/**
	 * Finance login.
	 *
	 * @param rowData the row data
	 */
	public void FinanceLogin(XSSFRow rowData) {
		
	}
	
	/**
	 * Verify login.
	 *
	 * @return the string
	 */
	public String verifyLogin() {
		
		return null;
	}


	
	
}
