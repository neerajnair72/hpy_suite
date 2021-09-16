/*package pageobjects.VendorPaymentsView.CommonViews;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import frameworkBase.TestBotElementsWrapper;

public class Filter_VendorPage extends LoadableComponent<Filter_VendorPage>{
	TestBotElementsWrapper pageWrapper;

	*//** The driver. *//*
	private WebDriver driver;
	
	public Filter_VendorPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
	*//**All filter button xpath*//*
	@FindBy(how=How.XPATH, using="//span[@class='action-link all-filter-btn']")
	private WebElement allFilters_Button_Xpath;
	*//**Filter link xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='selection-list']/li[5]")
	private WebElement filter_Link_Xpath;
	*//**MaterialMaster Filter link xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='selection-list']/li[4]")
	private WebElement filterMaterial_Link_Xpath;
	*//**Filter value checkbox xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='multiselect']/li[1]/span[1]")
	private WebElement filter_Value_Checkbox_Xpath;
	*//**Filter value xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='multiselect']/li[1]/span[2]")
	private WebElement filter_Value_Xpath;
	*//**Apply button xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='filters-container']/div[3]/span[1]")
	private WebElement apply_Button_Xpath;
	*//**Cancel button xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='filters-container']/div[3]/span[2]")
	private WebElement cancel_Button_Xpath;
	*//**Column value xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Vendor : Vendor Name']/span")
    private List<WebElement> column_Value_Xpath;
	*//**Column value xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Material Master : Material Name']/span")
    private List<WebElement> columnMaterial_Value_Xpath;
	*//**Column value xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Invoice : Invoice ID']/span")
    private List<WebElement> columnInvoice_Value_Xpath;
	*//**Column value xpath*//*
	@FindBy(how=How.XPATH,using="//div[@data-col='col-header-Delivery Address : Location Name']/span")
    private List<WebElement> columnDelivery_Value_Xpath;
	*//**Next pagination button xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='next']")
	private WebElement next_Pagination_Xpath;
	*//**Filter icon xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='Vendor : Vendor Name-filter-icon']")
	private WebElement filter_Icon_Xpath;
	*//**Material Filter icon xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='Material Master : Material Name-filter-icon']")
	private WebElement filterMaterial_Icon_Xpath;
	*//**Invoice Filter icon xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='Invoice : Invoice ID-filter-icon']")
	private WebElement filterInvoice_Icon_Xpath;
	*//**Delivery Filter icon xpath*//*
	@FindBy(how=How.XPATH,using="//img[@class='Delivery Address : Location Name-filter-icon']")
	private WebElement filterDelivery_Icon_Xpath;
	*//**Filter checkbox table view xpath*//*
	@FindBy(how=How.XPATH,using="//span[@class='listCheckbox']")
	private WebElement filter_Checkbox_Value_Xpath;
	*//**Apply button table view xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='filter-action-links']/span[1]")
	private WebElement apply_Button_TableView_Xpath;
	*//**Cancel button table view xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='filter-action-links']/span[2]")
	private WebElement cancel_Button_TableView_Xpath;
	*//**Reset button xpath*//*
	@FindBy(how=How.XPATH,using="//span[text()='Reset']")
	private WebElement reset_Button_Xpath;
	*//**Filter value  table view *//*
	@FindBy(how=How.XPATH,using="//span[@class='listValue']")
	private WebElement filter_Value_Tableview_Xpath;
	*//**Filet search input field xpath*//*
	@FindBy(how=How.XPATH,using="//div[@class='clearFix']/div[2]/div[1]/div/input")
	private WebElement filterSearch_Input_Xpath;
	*//**Filter search column xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='selection-list']/li")
	private WebElement filterSearch_Column_Xpath;
	*//**Method to select all filters
	 * @throws Exception *//*
	public Filter_VendorPage selectAllFilters() throws Exception {
		pageWrapper.selectAllFilters(allFilters_Button_Xpath,filter_Link_Xpath, filter_Value_Checkbox_Xpath, apply_Button_Xpath);
		return this;
	}
	*//**Method to select all filters
	 * @throws Exception *//*
	public Filter_VendorPage selectAllFiltersMaterial() throws Exception {
		pageWrapper.selectAllFilters(allFilters_Button_Xpath,filterMaterial_Link_Xpath, filter_Value_Checkbox_Xpath, apply_Button_Xpath);
		return this;
	}
	*//**Method to select all filters invoice
	 * @throws Exception *//*
	public Filter_VendorPage selectAllFiltersInvoice(XSSFRow rowData) throws Exception {
		pageWrapper.selectAllFiltersInvoice(allFilters_Button_Xpath,filterSearch_Input_Xpath,rowData.getCell(10).toString(),filterSearch_Column_Xpath, filter_Value_Checkbox_Xpath, apply_Button_Xpath);
		return this;
	}
	*//**Method to capture filter value
	 * @throws Exception *//*
	public String captureFilterValue() throws Exception {
		return pageWrapper.captureFilterValue(allFilters_Button_Xpath,filter_Link_Xpath, filter_Value_Checkbox_Xpath ,filter_Value_Xpath, cancel_Button_Xpath);
		
	}

*//**Method to capture filter value
 * @throws Exception *//*
public String captureFilterValueMaterial() throws Exception {
	return pageWrapper.captureFilterValue(allFilters_Button_Xpath,filterMaterial_Link_Xpath, filter_Value_Checkbox_Xpath ,filter_Value_Xpath, cancel_Button_Xpath);
	
}
	*//**Method to capture filter value of invoice
	 * @throws Exception *//*
	public String captureFilterValue(XSSFRow rorData) throws Exception {
		return pageWrapper.captureFilterValueInvoice(allFilters_Button_Xpath,filterSearch_Input_Xpath,rorData.getCell(10).toString(),filterSearch_Column_Xpath, filter_Value_Checkbox_Xpath ,filter_Value_Xpath, cancel_Button_Xpath);
		
	}
	public Filter_VendorPage clickAll() throws Exception {
		pageWrapper.customClickAction(allFilters_Button_Xpath);
		return this;
	}
	*//**Method to return filter data list*//*
	public List getFilterValue() {
		return column_Value_Xpath;
	}
	*//**Method to return filter data list*//*
	public WebElement getFilterValueInvoice() {
		return columnInvoice_Value_Xpath.get(0);
	}
	*//**Method to return filter data list*//*
	public List getFilterValueMaterial() {
		return columnMaterial_Value_Xpath;
	}
	*//**Method to return filter data list*//*
	public List getFilterValueDelivery() {
		return columnDelivery_Value_Xpath;
	}
	*//**Method to select a filter from table view
	 * @throws Exception *//*
	public Filter_VendorPage selectFilterFromTable() throws Exception {
		pageWrapper.selectFilterFromTable(filter_Icon_Xpath, filter_Checkbox_Value_Xpath, apply_Button_TableView_Xpath);
		return this;
	}
	*//**Method to select a filter from table view
	 * @throws Exception *//*
	public Filter_VendorPage selectFilterFromTableInvoice() throws Exception {
		pageWrapper.selectFilterFromTable(filterInvoice_Icon_Xpath, filter_Checkbox_Value_Xpath, apply_Button_TableView_Xpath);
		return this;
	}
	*//**Method to select a filter from table view
	 * @throws Exception *//*
	public Filter_VendorPage selectFilterFromTableMaterial() throws Exception {
		pageWrapper.selectFilterFromTable(filterMaterial_Icon_Xpath, filter_Checkbox_Value_Xpath, apply_Button_TableView_Xpath);
		return this;
	}*//**Method to select a filter from table view
	 * @throws Exception *//*
	public Filter_VendorPage selectFilterFromTableDelivery() throws Exception {
		pageWrapper.selectFilterFromTable(filterDelivery_Icon_Xpath, filter_Checkbox_Value_Xpath, apply_Button_TableView_Xpath);
		return this;
	}
	*//**Method to capture filter value from table view
	 * @throws Exception *//*
	public String captureFilterValueTableView() throws Exception {
		return pageWrapper.captureFilterValueFromTable(filter_Icon_Xpath, filter_Value_Tableview_Xpath, cancel_Button_TableView_Xpath);
	}
	*//**Method to capture filter value from table view
	 * @throws Exception *//*
	public String captureFilterValueTableViewMaterial() throws Exception {
		return pageWrapper.captureFilterValueFromTable(filterMaterial_Icon_Xpath, filter_Value_Tableview_Xpath, cancel_Button_TableView_Xpath);
	}
	*//**Method to capture filter value from table view
	 * @throws Exception *//*
	public String captureFilterValueTableViewInvoice() throws Exception {
		return pageWrapper.captureFilterValueFromTable(filterInvoice_Icon_Xpath, filter_Value_Tableview_Xpath, cancel_Button_TableView_Xpath);
	}
	*//**Method to capture filter value from table view
	 * @throws Exception *//*
	public String captureFilterValueTableViewDelivery() throws Exception {
		return pageWrapper.captureFilterValueFromTable(filterDelivery_Icon_Xpath, filter_Value_Tableview_Xpath, cancel_Button_TableView_Xpath);
	}
}
*/