package orgUtils_ExpenseProduct;

import frameworkBase.TestBotElementsWrapper;
import frameworkUtils.Log;
import io.qameta.allure.Step;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;
import pageobjects.EmployeeViews.ReportsPage;

import java.util.List;

public class PWC_ReportOrg extends TestBotElementsWrapper {
	@FindBy(xpath = "//span[text()='New Report']")
	@CacheLookup
	private WebElement new_report;

	@FindBy(xpath = "//input[@name='Report_Text_Mandatory_EF']")
	@CacheLookup
	private WebElement extrafield_xpath;

	@FindBy(xpath = "//div[@class='customToast showCustomToast']")
	//@FindBy(xpath = "//div[@class='customToastContent']/..")
	@CacheLookup
	private WebElement SuccessMessage_Toast_xpath;

	@FindBy(xpath = "//button//div//span[text()='Next']/../..")
	//@FindBy(xpath="//button/span[text()='Next']/..")
	private WebElement nextButton;

	@FindBy(xpath="//input[@id='reportDescription']")
	private WebElement Report_Description_PWC;

	@FindBy(xpath="//input[@name='Project Number']")
	private WebElement Project_Number_PWC;

	@FindBy(xpath="//div[contains(text(),'Create report')]")
	private WebElement CreateReport_PWC;

	/** Advance search button in project search**/
	@FindBy(xpath ="//p[@class='advanceSearch']")
	@CacheLookup
	private WebElement AdvanceSearch_button;

	/** Radio button in project search**/
	@FindBy(xpath ="//tr[1]//td[1]//input[1]")
	@CacheLookup
	private WebElement RadioButtoninProjectsearch;

	/** Add button in project list**/
	@FindBy(xpath ="//button//div//span[text()='Add']/../..")
	//@FindBy(xpath ="//button/span[text()='Add']")
	@CacheLookup
	private WebElement AddButton;

	/** Project Name */
	@FindBy(xpath = "//div/input[@name='Project  Name']")
	@CacheLookup
	private WebElement ProjectName_xpath_PWC;

	@FindBy(xpath="(//div[contains(text(),'townhall')])[1]")
	@CacheLookup
	private WebElement SelectProject;

	/** Select project */
	@FindBy(xpath = "//tr[2]//td[1]//input[1]")
	@CacheLookup
	private WebElement SelectProject_xpath_PWC;

	/** Add button project */
	@FindBy(xpath = "//div/button/span[text()='Add']/..")
	@CacheLookup
	private WebElement AddButton_Project_xpath_PWC;

	/** Add button project */
	@FindBy(xpath = "//div/button/span[text()='cancel']/..")
	@CacheLookup
	private WebElement CancelButton_Project_xpath_PWC;

	@FindBy(xpath = "//span[text()='Delete']/..")
	@CacheLookup
	private WebElement delete_button;

	/** Delete Button **/
	@FindBy(xpath = "//div[text()='Delete']")
	@CacheLookup
	private WebElement deleteButton;

	/** The expense action hamburger icon xapth */
	@FindBy(how = How.XPATH, using = "//td[@class='actionColumnHoverClass']")
	private List<WebElement> hamburger_Icon_Xpath;

	/** PWC Hamburger icon */
	@FindBy(xpath = "//td[@class='actionColumnHoverClass']//div//img")
	private WebElement PWChamburger_Icon_Xpath;

	public ReportsPage CreateReportWithMandatoryFields(XSSFRow rowData, String string) {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(new_report);
		waitAndClickWebElement(extrafield_xpath);
		writeText(extrafield_xpath, rowData.getCell(3).toString());
		NextButton_PWC();
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		return GetInstance(ReportsPage.class);

	}

	public void NextButton_PWC() {
		isElementDisplayed(Report_Description_PWC);
		waitForElementVisible(Report_Description_PWC);
		writeText(Report_Description_PWC, " Test Automation");
		//verify the project details are filled or not, if project details are null, fill again
		if(Project_Number_PWC.getAttribute("value")=="")
		{
			AdvanceSearch();
		}
		waitAndClickWebElement(nextButton);
	}

	@Step("{method}")
	public PWC_ReportOrg AdvanceSearch() {
        if(isElementDisplayed(CreateReport_PWC)){
		waitForElementVisible(AdvanceSearch_button);
		waitAndClickWebElement(AdvanceSearch_button);
		waitForElementVisible(RadioButtoninProjectsearch);
		waitAndClickWebElement(RadioButtoninProjectsearch);
		waitAndClickWebElement(AddButton);}
        else {
			Log.info("Create report page is not displayed");
		}
		return GetInstance(PWC_ReportOrg.class);
	}
	
	public PWC_ReportOrg CreateReportWithMandatoryFields_PWC(XSSFRow rowData, String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(new_report);
		AdvanceSearch();
		NextButton_PWC();
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
		softAssert.assertAll();
	 	return GetInstance(PWC_ReportOrg.class);
	}
	
	public PWC_ReportOrg CreateReportWithoutProject_PWC(String string) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		waitAndClickWebElement(new_report);
		NextButton_PWC();
		waitForElementVisible(SuccessMessage_Toast_xpath);
		softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
	 	return GetInstance(PWC_ReportOrg.class);

	}
	
	 public PWC_ReportOrg AddProject_PWC(XSSFRow rowData) throws Exception {
		    untilJqueryIsDone();
		    writeText(ProjectName_xpath_PWC, rowData.getCell(10).toString());
		    writeKeyboardText(ProjectName_xpath_PWC, Keys.ENTER);

		    waitForElementVisible(SelectProject);
		    click_Actions(SelectProject);

			return GetInstance(PWC_ReportOrg.class);
			
		}
	 
	 public PWC_ReportOrg CreateReportWithMandatoryFields_Automation(XSSFRow rowData, String string) {
		 	SoftAssert softAssert = new SoftAssert();
			untilPageLoadComplete();
			waitAndClickWebElement(new_report);
			waitForElementVisible(extrafield_xpath);
			waitAndClickWebElement(extrafield_xpath);
			writeText(extrafield_xpath, rowData.getCell(3).toString());
			 NextButton_PWC();
	 		waitForElementVisible(SuccessMessage_Toast_xpath);
			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			return GetInstance(PWC_ReportOrg.class);

		}
	 
	 public PWC_ReportOrg deleteReport(String string) throws Exception

		{
			SoftAssert softAssert = new SoftAssert();
			isElementDisplayed(PWChamburger_Icon_Xpath);
			ScrollToElement(PWChamburger_Icon_Xpath);
			waitAndClickWebElement(PWChamburger_Icon_Xpath);
			waitForElementVisible(deleteButton);
			safeJavaScriptClick(deleteButton);
			//Delete Confirm button on popup
			waitForElementVisible(delete_button);
			safeJavaScriptClick(delete_button);
			waitForElementVisible(SuccessMessage_Toast_xpath);
			waitForText(SuccessMessage_Toast_xpath,string);
 			softAssert.assertEquals(SuccessMessage_Toast_xpath.getText(), string);
			waitForElementInVisible(SuccessMessage_Toast_xpath);
			softAssert.assertAll();
			return GetInstance(PWC_ReportOrg.class);

		}
}
