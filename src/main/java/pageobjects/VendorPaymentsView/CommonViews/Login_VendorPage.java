/*package pageobjects.VendorPaymentsView.CommonViews;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;
import frameworkBase.TestBotPageGenerator;
import io.qameta.allure.Step;
import pageobjects.CommonViews.CommonPageElements;

public class Login_VendorPage extends LoadableComponent<Login_VendorPage>{
	*//** The driver. *//*
	private WebDriver driver;
	
	*//** The page wrapper. *//*
	private TestBotElementsWrapper pageWrapper;
	TestBotPageGenerator testBotPageGenerator;
	
	*//**
	 * Instantiates a new login page.
	 *
	 * @param driver the driver
	 *//*
	public Login_VendorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(this.driver);
		testBotPageGenerator = new TestBotPageGenerator(driver);
	}
	

	 (non-Javadoc)
	 * @see org.openqa.selenium.support.ui.LoadableComponent#load()
	 
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		//this.driver.get(expenseURL);
		
	}


	 (non-Javadoc)
	 * @see org.openqa.selenium.support.ui.LoadableComponent#isLoaded()
	 
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		try {
			//assertTrue("LoginPage is not loaded!", driver.getCurrentUrl().contains(expenseURL));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	*//** The Mobile number text xpath. *//*
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Mobile Number']")
	private WebElement MobileNumber_Text_Xpath;

	*//** The Next button CSS. *//*
	@FindBy(how = How.XPATH, using = "//button[div[span[text()='SIGN IN']]]")
	private WebElement Next_Button_CSS;

	*//** The Password text CSS. *//*
	@FindBy(how = How.XPATH, using ="//input[@placeholder='Enter Password']")
	private WebElement Password_Text_CSS;
	
	*//** The org select page. *//*
	@FindBy(xpath="//h4[text()='GA Automation (GA Automation)']")
	private WebElement organisation_link_xpath;
	*//**The product select div*//*
	@FindBy(how=How.XPATH, using="//div[label[text()='Vendor Payments']]")
	private WebElement productSelect_Link_Xpath;

	*//**
	
	 * Login.
	 *
	 * @param rowData the row data
	 * @return the common page elements
	 *//*
	@Step("Login to expense reading data from excel, for method: {method} step...")
	public ContainerElements_VendorPage login(XSSFRow rowData) {
		// TODO Auto-generated method stub
		
		//Enter Mobile Number
		pageWrapper.writeText(MobileNumber_Text_Xpath, rowData.getCell(1).toString() );

		//Enter Next Button
		//Next_Button_CSS.click();
		pageWrapper.waitAndClickWebElement(Next_Button_CSS);
		
		//Enter Password
		pageWrapper.writeText(Password_Text_CSS, rowData.getCell(2).toString());
		
		//Enter Next Button
		//Next_Button_CSS.click();
		pageWrapper.waitAndClickWebElement(Next_Button_CSS);
		
		//Checking for multiple organizations
		pageWrapper.shortWait();
		if(driver.getCurrentUrl().contains("multiprofilepage"))
		{		
			pageWrapper.waitAndClickWebElement(organisation_link_xpath);
			pageWrapper.writeText(Password_Text_CSS, rowData.getCell(2).toString());
			pageWrapper.waitAndClickWebElement(Next_Button_CSS);
			//pageWrapper.waitAndClickWebElement(productSelect_Link_Xpath);
			
		}
		
		
		//return testBotPageGenerator;
		 return new ContainerElements_VendorPage(this.driver);

	}
	
}
*/