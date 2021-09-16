/*
package pageobjects.TravelProductViews;


import static org.testng.AssertJUnit.assertTrue;

import frameworkBase.TestBotElementsWrapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.mortbay.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import frameworkBase.TestBotPageGenerator;
import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.TravelProductViews.CommonPageElements_TRFtoTravel;

// TODO: Auto-generated Javadoc
*//**
 * The Class LoginPage.
 *//*

public class CommonViewsLoginPage_Travel extends TestBotElementsWrapper {


	
*//** The SignIn1 Button xpath. *//*

	@FindBy(xpath="//div/a[@class='linkButton']")
	private WebElement signIn1_Button_xpath;
    
	
*//** The Mobile number/Email ID text xpath. *//*

	@FindBy(xpath="//div/input[@placeholder='Email id/ Mobile']")
	private WebElement emailID_text_xpath;

	
*//** The Next button*//*

	@FindBy(xpath="//div/span[text()='NEXT']")
	private WebElement next_Button_xpath;
	
	
*//** The Password *//*

	@FindBy(xpath="//div/input[@placeholder='********']")
	private WebElement password_text_xpath;
	
	
*//** The Sign In2 button xpath. *//*

	@FindBy(xpath="//div/span[text()='SIGN IN']")
	private WebElement signIn2_Button_xpath;
	
	@FindBy(xpath="//div[contains(text(),'Navigatio (Navigatio)')]")
	private WebElement org_Selection_xpath;
	
	
	
public void Login(String countryCode, String number, String password) throws InterruptedException
	{
		//Next_Button_CSS.click();
		
		MobileNumber_Text_Xpath.sendKeys(number);
		
		Next_Button_CSS.click();
		
		Password_Text_CSS.sendKeys(password);
		
		Next_Button_CSS.click();
		
}


	
*//**
	 * Login.
	 *
	 * @param rowData the row data
	 * @return the common page elements
	 *//*

	@Step("Login to expense reading data from excel, for method: {method} step...")
	public CommonPageElements_TRFtoTravel login(XSSFRow rowData) {
		// TODO Auto-generated method stub
		
		//Click on SignIn1 button
		waitAndClickWebElement(signIn1_Button_xpath);
		
		//Enter Mobile Number
		writeText(emailID_text_xpath, rowData.getCell(1).getRawValue());

		//Enter Next Button
		//next_Button_xpath.click();
		waitAndClickWebElement(next_Button_xpath);
		
		//Enter Password
		writeText(password_text_xpath, rowData.getCell(2).toString());
		
		//Enter SignIn2 Button
		waitAndClickWebElement(signIn2_Button_xpath);
		
		ScrollToElement(org_Selection_xpath);
		click_Actions(org_Selection_xpath);
		
		//Enter Password
		writeText(password_text_xpath, rowData.getCell(2).toString());
		
		//Enter SignIn2 Button
		waitAndClickWebElement(signIn2_Button_xpath);
		
		//return testBotPageGenerator;
		 return new CommonPageElements_TRFtoTravel();

	}
	


	
*//**
	 * Manager login.
	 *
	 * @param rowData the row data
	 *//*

	public void ManagerLogin(XSSFRow rowData) {
		
	}
	
	
*//**
	 * Finance login.
	 *
	 * @param rowData the row data
	 *//*

	public void FinanceLogin(XSSFRow rowData) {
		
	}
	
	
*//**
	 * Verify login.
	 *
	 * @return the string
	 *//*

	public String verifyLogin() {
		
		return null;
	}

	
	
	
	
}

*/