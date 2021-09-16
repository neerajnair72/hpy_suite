/*
package testUtils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import frameworkBase.TestBotElementsWrapper;
import frameworkBase.TestBotPageGenerator;
import pageobjects.EmployeeViews.ExpensePage;

public class ExpenseUtils_PWC extends ExpensePage {

	public ExpenseUtils_PWC() {
		//super(driver);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		super.load();
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		super.isLoaded();
	}

	@Override
	public ExpensePage get() {
		// TODO Auto-generated method stub
		return super.get();
	}

	public ExpenseUtils_PWC() {
		super(driver);
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
		
	}

	public ExpensePage clickAddExpense() {
		pageWrapper.waitForElementToClickable(addExpense_Button_Xpath);
		pageWrapper.click_Actions(addExpense_Button_Xpath);
		return this;
	}

	public void fillTxnDetailsForNativeFields_PWC(XSSFRow rowData) {
		// TODO Auto-generated method stub
		pageWrapper.writeText(amount_TextField_ID, rowData.getCell(1).toString());
		pageWrapper.writeText(spentAt_TextField_ID, rowData.getCell(2).toString());
		pageWrapper.writeText(city_TextField_ID, rowData.getCell(4).toString());
		pageWrapper.writeText(city_TextField_ID, Keys.ARROW_DOWN+""+ Keys.ENTER);
		//pageWrapper.writeKeyboardText(city_TextField_ID, Keys.ENTER);
		pageWrapper.shortWait();
		pageWrapper.click_Actions(category_Select_Xpath);
		pageWrapper.waitForElementVisible(categorySearch_Text_Xpath);
		pageWrapper.click_Actions(categorySearch_Text_Xpath);
		pageWrapper.writeText(categorySearch_Text_Xpath, "Train and Bus");
		pageWrapper.click_Actions(categoryTrainBusFare_xpath);
	 	//pageWrapper.click_Actions(PurposeTrain_dropdown_xpath);
		pageWrapper.waitForElementToClickable(PurposeTrain_dropdown_xpath);
		pageWrapper.click_Actions(PurposeTrain_dropdown_xpath);
		pageWrapper.waitForElementToClickable(AttendingTraining_xpath);
		pageWrapper.click_Actions(AttendingTraining_xpath);
		pageWrapper.waitForElementVisible(TrainingName_text_name);
		pageWrapper.waitForElementToClickable(TrainingName_text_name);
		pageWrapper.writeText(TrainingName_text_name, rowData.getCell(7).toString());
		pageWrapper.ScrollToElement(Billavial_Dropdown_name);
		pageWrapper.waitForElementToClickable(Billavial_Dropdown_name);
		pageWrapper.click_Actions(Billavial_Dropdown_name); 
		pageWrapper.waitForElementVisible(BillYes_select_xpath);
		pageWrapper.waitForElementToClickable(BillYes_select_xpath);
		pageWrapper.click_Actions(BillYes_select_xpath);
		pageWrapper.waitForElementVisible(BillNumber_text_xpath);
		pageWrapper.writeText(BillNumber_text_xpath, rowData.getCell(8).toString());
		
	
		
		
	}

}
*/