package pageobjects.CommonViews;

import frameworkBase.TestBotElementsWrapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonTableElementsPage extends TestBotElementsWrapper {

	////// ******* Export Menu Start *******//////

	/** Click on Export button */
	@FindBy(xpath = "//div/span/img[@src='./assets/images/export-icon.svg']")
	private WebElement Export_button_xpath;

	/** Download button in export */
	@FindBy(xpath = "//div/div[text()='Download']")
	private WebElement DownloadExport_button_xpath;

	/** Download workflow comments */
	@FindBy(xpath = "//div/div[text()='Workflow Comments']")
	private WebElement Downloadworkflowcomments_button_xpath;

	/** Download workflow comments */
	@FindBy(xpath = "//div/div[text()='Policy Exception Report']")
	private WebElement Downloadpolicycomments_button_xpath;

	/** Cancel button in popup */
	@FindBy(xpath = "//div/button/span[text()='Cancel']")
	private WebElement Cancel_button_xpath;

	public CommonTableElementsPage ExportAs(WebElement element) throws Exception {
		Export();
		waitForElementVisible(element);
		waitForElementToClickable(element);
		click_Actions(element);
		return this;

	}

	public CommonTableElementsPage Export() {
		waitForElementVisible(Export_button_xpath);
		waitForElementToClickable(Export_button_xpath);
		click_Actions(Export_button_xpath);
		return this;
	}

	public enum ExportOptions {
		DOWNLOADEXCEL, DOWNLOADPOLICY, DOWNLOADWORKFLOW;
	}

	public CommonTableElementsPage Cancel() {
		isElementEnabled(Cancel_button_xpath);
		waitForElementVisible(Cancel_button_xpath);
		waitForElementToClickable(Cancel_button_xpath);
		click_Actions(Cancel_button_xpath);
		return this;
	}

	////// ******* Export Menu End *******//////

	////// ******* Hamburger Menu Start *******//////
	/** Hamburger Menu */
	@FindBy(xpath = "(//div/img[@src='actions-icon.svg'])[1]")
	private WebElement Hamburger_button_xpath;

	/** Hamburger View button */
	@FindBy(xpath = "//span/div/div[text()='View']")
	private WebElement HamburgerView_button_xpath;

	/** Hamburger Delete button */
	@FindBy(xpath = "//span/div/div[text()='Delete']")
	private WebElement HamburgerDelete_button_xpath;

	/** Hamburger Edit button */
	@FindBy(xpath = "//span/div/div[text()='Edit']")
	private WebElement HamburgerEdit_button_xpath;

	/** Hamburger Split button */
	@FindBy(xpath = "//span/div/div[text()='Split']")
	private WebElement HamburgerSplit_button_xpath;

	/** Hamburger Quick View button */
	@FindBy(xpath = "//span/div/div[text()='Quick View']")
	private WebElement HamburgerQuickView_button_xpath;

	/** Hamburger Detailed View button */
	@FindBy(xpath = "//span/div/div[text()='Detailed view']")
	private WebElement HamburgerDetailedView_button_xpath;

	/** Close QUick view */
	@FindBy(xpath = "//span/img[@src='./assets/images/cross.svg']")
	private WebElement QucikviewClose_button_xpath;

	public enum HamburgerOptions {
		VIEW, EDIT, DELETE, SPLIT, QUICKVIEW, DETAILEDVIEW;
	}

	public enum CategoryOptions {
		AIRFARE_EXPENSE, BOOKS_AND_PERIODICALS, COMMUNICATION, CONTINUING_EDUCATION, CONVEYANCE, COURIER_POSTAGE, EMPLOYEE_INITIATIVES, EQUIPMENT_HIRE_CHARGES, EVENT_EXPENSES, EXECUTIVE_HEALTH_CHECKUP, FEES_RATES_AND_TAXES, GIFTS_PRESENTS, GUEST_HOUSE_EXPENSES, HOTEL_BOOKING_EXPENSE, INCIDENTAL_EXPENSES_PER_DIEM, MEALS_AND_REFRESHMENTS, MEMBERSHIP_AND_SUBSCRIPTION, PARTICIPATION_FEES, PRINTING_AND_STATIONERY, PROPOSAL_EXPENSES, RELOCATION_CHARGES, TRAIN_AND_BUS_FARE, TRAVEL_INSURANCE, VEHICLE_EXPENSES_PARTNERS;
	}

	


	public CommonTableElementsPage Hamburger() {
		ScrollToElement(Hamburger_button_xpath);
		waitForElementVisible(Hamburger_button_xpath);
		waitForElementToClickable(Hamburger_button_xpath);

		waitAndClickWebElement(Hamburger_button_xpath);
		return this;

	}

	public CommonTableElementsPage QucikView_close() {
		waitForElementVisible(QucikviewClose_button_xpath);
		waitForElementToClickable(QucikviewClose_button_xpath);
		click_Actions(QucikviewClose_button_xpath);
		return this;

	}

	public CommonTableElementsPage HamburgerWith(WebElement element) {
		Hamburger();
		waitForElementVisible(element);
		waitForElementToClickable(element);
		click_Actions(element);
		return this;
	}

	
	public boolean HamburgerActions(HamburgerOptions action) throws Exception {
		switch (action) {
		case VIEW:
			HamburgerWith(HamburgerView_button_xpath);
			break;

		case DELETE:
			HamburgerWith(HamburgerDelete_button_xpath);
			break;

		case EDIT:
			HamburgerWith(HamburgerEdit_button_xpath);
			break;

		case SPLIT:
			HamburgerWith(HamburgerSplit_button_xpath);
			break;

		case QUICKVIEW:
			HamburgerWith(HamburgerQuickView_button_xpath);
			break;

		case DETAILEDVIEW:
			HamburgerWith(HamburgerDetailedView_button_xpath);
			break;

		default:
			break;
		}
		return true;
	}

	////// ******* Hamburger Menu End *******//////


	// public boolean dataExport(String action)
	public boolean dataExport(ExportOptions action) throws Exception {

		switch (action)

		{

		case DOWNLOADEXCEL:

			ExportAs(DownloadExport_button_xpath);
			break;

		case DOWNLOADWORKFLOW:

			ExportAs(Downloadworkflowcomments_button_xpath);
			break;

		case DOWNLOADPOLICY:

			ExportAs(Downloadpolicycomments_button_xpath);
			break;

		default:
			break;

		}
		return true;

	}

}
