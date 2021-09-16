package pageobjects.TravelNew;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonPageElements;

public class LoginPageTravelNew extends TestBotElementsWrapper{
	
	/** The Mobile Number Text field */
	@FindBy (xpath = "//div/input[@id = 'phone-no']")
	private WebElement Login_MobileNumber_xpath;
	
	/** The Next button */
	@FindBy (xpath = "//div/button[text() = 'Next']")
	private WebElement Login_NextButton_xpath;
	
	/** The Password Text field button */
	@FindBy (xpath = "//div/input[@id = 'password-field']")
	private WebElement Login_Password_xpath;
	
	/** The SignIn button */
	@FindBy (xpath = "//div/button[text() = 'Sign In']")
	private WebElement Login_SignInButton_xpath;
	
	/** The Org Selection */
	@FindBy (xpath = "//div/ul/li/div/div[text() = 'Navigatio']")
	private WebElement Login_OrgSelection_xpath;
	
	/**
	 * Login.
	 *
	 * @param rowData the row data
	 * @return the common page elements
	 * @throws Exception 
	 */
	@Step("Login to travel reading data from excel, for method: {method} step...")
	public LandingScreen loginTravel(XSSFRow rowData) throws Exception {
		
		//Enter Mobile Number
//		String mobilenumber = rowData.getCell(1).toString();
		writeText(Login_MobileNumber_xpath, rowData.getCell(1).toString() );
		
		//Click On Next Button
		waitForElementToClickable(Login_NextButton_xpath);
		waitAndClickWebElement(Login_NextButton_xpath);
		
		//Enter Password
		isElementDisplayed(Login_Password_xpath);
		writeText(Login_Password_xpath, rowData.getCell(2).toString());
		
		//Click On SignIn Button
		waitForElementToClickable(Login_SignInButton_xpath);
		waitAndClickWebElement(Login_SignInButton_xpath);
		
		//Org Selection
//		isElementDisplayed(Login_OrgSelection_xpath);
		waitForElementToClickable(Login_OrgSelection_xpath);
		ScrollToElement(Login_OrgSelection_xpath);
		waitAndClickWebElement(Login_OrgSelection_xpath);
		
		//Enter Password
		isElementDisplayed(Login_Password_xpath);
		writeText(Login_Password_xpath, rowData.getCell(2).toString());
				
		//Click On SignIn Button
		waitForElementToClickable(Login_SignInButton_xpath);
		waitAndClickWebElement(Login_SignInButton_xpath);
		
		return GetInstance(LandingScreen.class);
	}
	

}
