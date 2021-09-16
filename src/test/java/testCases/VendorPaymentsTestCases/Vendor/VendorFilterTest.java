/*package testCases.VendorPaymentsTestCases.Vendor;

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
public class VendorFilterTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .gotoAllFilters(ContainerElements_VendorPage.containerOptions.VENDOR);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
}
	@SuppressWarnings("unchecked")
	public void assertFilterValue(String Expected) {
		TestBotElementsWrapper.assertFilterData(pageGenerator.Filter_VendorPage().getFilterValue(), Expected);
	}
	
  @Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select all filter and verify filtered data")
	@Story("Vendor smoke test")
	public void TC_32_Apply_All_Filter_Test() throws Exception {
		String Expected =pageGenerator.Filter_VendorPage().captureFilterValue();
		pageGenerator.Filter_VendorPage().selectAllFilters();
		assertFilterValue(Expected);
		sa.assertAll();
	}
	@Test(priority=2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select individual filter and verify filtered data")
	@Story("Vendor smoke test")
	public void TC_31_Apply_Filter_Test() throws Exception {
		
		String Expected =pageGenerator.Filter_VendorPage().captureFilterValueTableView();
		pageGenerator.Filter_VendorPage().selectFilterFromTable();
		assertFilterValue(Expected);
		sa.assertAll();
	}
}
*/