package pageobjects.CommonViews;

import frameworkBase.TestBotElementsWrapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonContainerElementsPage extends TestBotElementsWrapper {


	/** New Report Button */
	@FindBy(xpath = "//span[text()='New Report']")
	private WebElement newReport_Button_xpath;

	/** New Expense Button */
	@FindBy(xpath = "//span[text()='Add Expense']")
	private WebElement NewExpense_button_xpath;

	/** New Money Request Button */
	@FindBy(xpath = "//span[text()='New Advance Request']")
	private WebElement NewAdvanceRequest_button_xpath;

	/** New TRF Button */
	@FindBy(xpath = "//span[text()='Request New Travel']")
	private WebElement NewTRF_button_xpath;

	public CommonContainerElementsPage CreateAction(WebElement element) throws Exception {

		waitForElementVisible(element);
		waitForElementToClickable(element);
		waitAndClickWebElement(element);
		return this;

	}

	public enum CreateOptions {
		EXPENSE, REPORT, ADVANCEREQUEST, TRF;
	}

	public boolean CreateActions(CreateOptions action) throws Exception {
		switch (action) {
		case EXPENSE:
			CreateAction(NewExpense_button_xpath);
			break;

		case REPORT:
			CreateAction(newReport_Button_xpath);
			break;

		case ADVANCEREQUEST:
			CreateAction(NewAdvanceRequest_button_xpath);
			break;

		case TRF:
			CreateAction(NewTRF_button_xpath);
			break;

		default:
			break;
		}
		return true;
	}

}
