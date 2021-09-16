/*
package pageobjects.TravelProductViews;


import frameworkBase.TestBotElementsWrapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.TravelProductViews.CommonPageElements_TRFtoTravel;

// TODO: Auto-generated Javadoc

*//**
 * The Class LoginPage.
 *//*

public class CommonViewsLoginPage_TRF extends TestBotElementsWrapper {

	@FindBy(xpath="//div/input[@placeholder='Enter Mobile Number']")
	private WebElement mobileTRF_text_xpath;
	
	
*//** The Next button *//*

	@FindBy(css="button[type='submit']")
	private WebElement nextTRF_Button_xpath;

	
*//** The Password *//*

	@FindBy(xpath="//div/input[@placeholder='Enter Password']")
	private WebElement passwordTRF_text_xpath;
	
	@FindBy(xpath="//div[contains(text(),'Navigatio (Navigatio)')]")
	private WebElement org_Selection_xpath;
	
	
	
*//**
	 * LoginTRF.
	 *
	 * @param rowData the row data
	 * @return the common page elements
	 *//*

	
	public CommonPageElements_TRFtoTravel loginTRF(XSSFRow rowData) {
		// TODO Auto-generated method stub
		
		//Enter Mobile Number
		pageWrapper.writeText(mobileTRF_text_xpath, rowData.getCell(1).getRawValue());

		//Enter Next Button
		//next_Button_xpath.click();
		pageWrapper.waitAndClickWebElement(nextTRF_Button_xpath);
		
		//Enter Password
		pageWrapper.writeText(passwordTRF_text_xpath, rowData.getCell(2).toString());
		
		//Enter SignIn2 Button
		pageWrapper.waitAndClickWebElement(nextTRF_Button_xpath);
		
		pageWrapper.ScrollToElement(org_Selection_xpath);
		pageWrapper.click_Actions(org_Selection_xpath);
		
		//Enter Password
		pageWrapper.writeText(passwordTRF_text_xpath, rowData.getCell(2).toString());
		
		//Enter SignIn2 Button
		pageWrapper.waitAndClickWebElement(nextTRF_Button_xpath);
		
		//return testBotPageGenerator;
		 return new CommonPageElements_TRFtoTravel(this.driver);

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