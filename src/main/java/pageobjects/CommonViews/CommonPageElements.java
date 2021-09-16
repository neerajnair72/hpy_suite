package pageobjects.CommonViews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import orgUtils_ExpenseProduct.OUP_ReportOrg;
import pageobjects.EmployeeViews.ExpensePage;
import pageobjects.EmployeeViews.LoadRequestsPage;
import pageobjects.EmployeeViews.ReportsPage;
import pageobjects.PrivilegedViews.ReportsPagePrivileged;
import pageobjects.PrivilegedViews.ReportsPagePrivilegedOUP;

/**
 * The Class CommonPageElements.
 */
public class CommonPageElements extends TestBotElementsWrapper {

	
	/** Finance in Homepage */
	@FindBy(xpath = "//div/nav/a[text()='FINANCES']")
	private WebElement finance;
	
	/** toggle Section */
	@FindBy(xpath = "//div[@class='toggle-section']")
	private WebElement toggleSection;
	
	//div/img[@src='/assets/images/search.svg']
	/** toggle Section */
	@FindBy(xpath = "//div/img[@src='/assets/images/search.svg']")
	private WebElement Search_icon;

	/** Finance in Homepage */
	@FindBy(xpath = "//a[text()='ExpenseS']")
	private WebElement GotoExpense_button_xpath;

	@FindBy(xpath = "//div/img[@src='./assets/images/toggle.svg']")
	private WebElement newUIToggleView;
	
	/** The Money Request Tab */
       @FindBy(how = How.XPATH, using = "//img[@alt='loader']")
       private WebElement HappayIcon_Loader_xpath;

	/** The logout link. */
	//@FindBy(xpath = "//div[text()='Sign Out']")
	@FindBy(xpath="//div[@class='right-menu-text' and text()='Sign Out']")
	private WebElement logoutLink;

	/** The home link image. */
	// @FindBy(xpath="//img[@src='logo_black.png']")
	@FindBy(xpath = ".//*[@id='app']/div/div[2]/div/header/div/div/div[2]/nav/a[1]")
	private WebElement homeLinkImage;
	
	/** The home dashboard link. */
	// @FindBy(xpath="//img[@src='logo_black.png']")
	@FindBy(xpath = "//a[@href='/dashboard' and @class='mdl-navigation__link booking-tab booking-activeTab']")
	private WebElement homeDashboard_Xpath;
	
	//a[@href='/dashboard' and @class='mdl-navigation__link booking-tab booking-activeTab']

	/** The hamburger menu. */
	@FindBy(xpath = "//div[@class='side-menu']")
	//@FindBy(xpath="//div[@id='hamburger']")
	private WebElement hamburgerMenu;

	/** Reports link in Homepage */
	@FindBy(xpath = "//a[contains(text(),'ReportS')]")
	private WebElement reports_Link_xpath;
	
	@FindBy(xpath="//div/button//span[text()='New Report']/..")
	private WebElement ReportCreation_xpath;
	
	/** The Money Request Tab */
	@FindBy(how = How.XPATH, using = "//a[@id='MONEY_REQUEST']")
	private WebElement MoneyRequest_Button_xpath;
	
	/** The Money Request button in home dashboard */
	@FindBy(how = How.XPATH, using = "(//button[@class='hw-btn hw-btn-secondary hw-btn-normal false undefined'])[3]")
	private WebElement MoneyRequest_Button_Home_xpath;
	
	/** The Money Request button in home dashboard */
	@FindBy(how = How.XPATH, using = "//button[text()='Request for Advance']")
	private WebElement RequestForAdvance_Button_Home_xpath;
	
	/** The Money Request Tab */
	@FindBy(how = How.XPATH, using = "//div/nav/a[text()='TRAVEL REQUESTS']")
	private WebElement TRF_Button_xpath;

	// @FindBy(xpath="//button[@type='button'][contains('New Report')]")
	// WebElement new_report;

	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement new_report;

	// @FindBy(xpath="//a[text()='New Report']")
	// private WebElement new_report;

	@FindBy(xpath = "//input[@type='checkbox'][position()=1][contains('Non Violated')]")
	WebElement nonviolated_xpath;

	@FindBy(xpath = "//div[@class = 'chipClass']")
	private WebElement filter_xpath;

	@FindBy(xpath = "//input[@type='text'][@class='ReactTags__tagInputField']")
	WebElement mailid_xpath;

	@FindBy(xpath = "//div[@class='customToastContent']")
	private WebElement SuccessMessage_Toast_xpath;

	@FindBy(xpath = "//img[@src=\"/assets/images/toggle.svg\"]/..//span")
	private WebElement userInfo;
	/** The add expense button xpath. */
	@FindBy(xpath="//button[text()='Add Expense']")
	private WebElement addExpense_Button_Xpath;

	/**
	 * Logout.
	 *
	 * @return the common page elements
	 * @throws Exception 
	 */
	@Step("{method}")
	public CommonPageElements logout() throws Exception {

		waitAndClickWebElement(hamburgerMenu);
	 	waitAndClickWebElement(logoutLink);
		return this;
	}

	public WebElement getReports_Link_xpath() {
		 return reports_Link_xpath;
	}

	@Step("{method}")
	public CommonPageElements toggleView() {
 
		waitForElementToClickable(newUIToggleView);
		click_Actions(newUIToggleView);
		return this;
	}

	@Step("{method}")
	public CommonPageElements gotoFinance() {
		toggleView();
		waitForElementToClickable(finance);

		click_Actions(finance);

		return this;

	}

	@Step("{method}")
	public ExpensePage gotoExpense() throws Exception {
		untilPageLoadComplete();

		waitForElementVisible(addExpense_Button_Xpath);
		waitForElementToClickable(GotoExpense_button_xpath);
		waitAndClickWebElement(GotoExpense_button_xpath);

		return GetInstance(ExpensePage.class);

	}

	@Step("{method}")
	public ReportsPage goto_Report_Page() {
		waitForElementToClickable(reports_Link_xpath);
		waitAndClickWebElement(reports_Link_xpath);

		return GetInstance(ReportsPage.class);

	}

	@Step("{method}")
	public CommonPageElements goto_Reports_Page() {

		
		 waitAndClickWebElement(reports_Link_xpath);
		return GetInstance(CommonPageElements.class);
	}
	
	@Step("{method}")
	public ReportsPagePrivilegedOUP goto_Report_PrivilegePageOUP() {
		
		//waitAndClickWebElement(reports_Link_xpath);
		if(userInfo.getText().equals("Employee"))
		{
 		waitForElementVisible(Toggle_Button_xpath);
 		waitAndClickWebElement(Toggle_Button_xpath);
		}
		
		waitAndClickWebElement(reports_Link_xpath);
		untilPageLoadComplete();
 		return GetInstance(ReportsPagePrivilegedOUP.class);	}
	
	@Step("{method}")
	public OUP_ReportOrg goto_OUPReports_Page() {

		
		 waitAndClickWebElement(reports_Link_xpath);
		return GetInstance(OUP_ReportOrg.class);
	}
	
	@Step("{method}")
	public ReportsPage goto_Report_Creation_Page() {
        untilPageLoadComplete();
		waitAndClickWebElement(reports_Link_xpath);
		waitForElementVisible(ReportCreation_xpath);
		waitAndClickWebElement(ReportCreation_xpath);

		//return new ReportsPage(this.driver);
		return GetInstance(ReportsPage.class);

	}
	
	@Step("{method}")
	public LoadRequestsPage goto_MR() {
		waitForElementVisible(MoneyRequest_Button_Home_xpath);
		waitForElementVisible(MoneyRequest_Button_xpath);
		waitAndClickWebElement(MoneyRequest_Button_xpath);
		//return new LoadRequestsPage(this.driver);
		return GetInstance(LoadRequestsPage.class);


	}
	
	@Step("{method}")
	public LoadRequestsPage ClickOnNewMRFromHome() {
		System.out.println("inside the MRFormHome method");
		//waitForElementVisible(addExpense_Button_Xpath);
		waitAndClickWebElement(homeDashboard_Xpath);
		waitForElementVisible(addExpense_Button_Xpath);
		waitAndClickWebElement(RequestForAdvance_Button_Home_xpath);
		System.out.println("after clicked on moneyRequest button");
		//return new LoadRequestsPage(this.driver);
		return GetInstance(LoadRequestsPage.class);


	}

	@Step("{method}")
	public LoadRequestsPage goto_MR_PrivillageView() {
		
          waitForElementVisible(addExpense_Button_Xpath);
		if(isElementDisplayed(Toggle_Button_xpath)==true){
			untilPageLoadComplete();
			waitAndClickWebElement(Toggle_Button_xpath);
		}
		else{
			untilPageLoadComplete();
			waitAndClickWebElement(Toggle_Button_xpath);
		}


		isElementDisplayed(MoneyRequest_Button_xpath);
		waitForElementVisible(MoneyRequest_Button_xpath);
		waitAndClickWebElement(MoneyRequest_Button_xpath);

		return GetInstance(LoadRequestsPage.class);


	}



	/** Finance in Homepage */
	@FindBy(xpath = "//div/nav/a[text()='EXPENSES']")
	private WebElement Expense_button_Visible;

	public CommonPageElements verifyExpenseButton(String expenses_button_available) {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(isElementDisplayed(Expense_button_Visible));

		//return new PageFactory().initElements(getThreadSafeDriver(), CommonPage.class);
		return this;
	}

	public CommonPageElements verifyExpenseButtonAgain(String expenses_button_available) {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(isElementDisplayed(Expense_button_Visible));

		//return new PageFactory().initElements(getThreadSafeDriver(), CommonPage.class);
		return this;
	}
	/** Toggle view */
	@FindBy(xpath = "//img[@src='/assets/images/toggle.svg']")
	private WebElement Toggle_Button_xpath;

	@Step("{method}")
	public ReportsPagePrivileged goto_Report_PrivilegePage() {
		
		//waitAndClickWebElement(reports_Link_xpath);
		waitForElementVisible(Toggle_Button_xpath);
		waitAndClickWebElement(Toggle_Button_xpath);
		return GetInstance(ReportsPagePrivileged.class);
	}

	/*@Step("{method}")
	public ReportsPageOUP reportCreation(XSSFRow xssfRow) throws Exception {
		TestBotBaseNew n = new TestBotBaseNew();
		ExcelUtils eUtils = new ExcelUtils();

		RestAssured.baseURI = "https://v2-prep-api.happay.in/";
		RestAssured.basePath = "report/v1/report/";
		HashMap<String, String> reportMap = new HashMap<>();
		HashMap<String, String> expenseMap = new HashMap<>();

		if(xssfRow.getSheet().equals("LoginPWC"))
		{
			*//*reportMap = reportMAP();
			expenseMap = expenseMAP();*//*
		}
		else
		{
			reportMap = APIUtils.reportMAPOUP();
			expenseMap = APIUtils.expenseMAPOUP();
		}
		Response response = given()
				.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
				.headers(APIUtils.loginMethod(xssfRow.getCell(1).toString(),
						xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString())).formParams(reportMap).request().post();

		System.out.println(response.asString());
		String report = response.jsonPath().getString("res_data.report_id");


		expenseMap.put("report", report);
		expenseMap.put("resource_id", report);
		RestAssured.baseURI = "https://v2-prep-api.happay.in/";
		RestAssured.basePath = "transaction/v1/transaction/";
		Response response1 = given()
				.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
				.headers(APIUtils.loginMethod(xssfRow.getCell(1).toString(),
						xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString())).formParams(expenseMap).request().post();

		getThreadSafeDriver().navigate().refresh();
		System.out.println(response1.asString());
		return GetInstance(ReportsPageOUP.class);
	}
*/
}
