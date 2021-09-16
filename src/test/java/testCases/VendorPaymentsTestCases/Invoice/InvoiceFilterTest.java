/*package testCases.VendorPaymentsTestCases.Invoice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.VendorPaymentsView.CommonViews.ContainerElements_VendorPage;

*//**
 * The Class VendorModuleTests.
 *//*
@Listeners(TestListeners.class)
@Epic("Vendor Filter Tests")
@Feature("Filter")
public class InvoiceFilterTest extends TestBotBase{
	SoftAssert sa ;
    TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .gotoAllFilters(ContainerElements_VendorPage.containerOptions.INVOICE);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
}
	@SuppressWarnings("unchecked")
	public void assertFilterValue(String Expected) {
		TestBotElementsWrapper.assertFilterDataInvoice(pageGenerator.Filter_VendorPage().getFilterValueInvoice(), Expected);
	}
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select all filter and verify filtered data")
	@Story("Vendor Paymnets smoke test")
	public void TC_44_Apply_All_Filter_Test() throws Exception {
		String Expected =pageGenerator.Filter_VendorPage().captureFilterValue(ExcelUtils.getRowDataWithSheetName(3, "Vendor_ManageColumn"));
		pageGenerator.Filter_VendorPage().selectAllFiltersInvoice(ExcelUtils.getRowDataWithSheetName(3, "Vendor_ManageColumn"));
		assertFilterValue(Expected);
		sa.assertAll();
	}
	@Test(priority=2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select individual filter and verify filtered data")
	@Story("Vendor Paymnets smoke test")
	public void TC_45_Apply_Filter_Test() throws Exception {
		
		String Expected =pageGenerator.Filter_VendorPage().captureFilterValueTableViewInvoice();
		pageGenerator.Filter_VendorPage().selectFilterFromTableInvoice();
		assertFilterValue(Expected);
		sa.assertAll();
	}
}
*/