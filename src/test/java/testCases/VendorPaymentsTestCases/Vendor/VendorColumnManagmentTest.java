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
@Epic("Vendor Mamage Column Tests")
@Feature("Manage Column")
public class VendorColumnManagmentTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .gotoManageColumn(ContainerElements_VendorPage.containerOptions.VENDOR);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
}
	public void assertAllColumns() throws Exception {
		
		TestBotElementsWrapper
		                    .assertAllColumns(pageGenerator.ManageColumn_VendorPage().getAllColumns(), ExcelUtils.getRowDataWithSheetName(0, "Vendor_ManageColumn"));
	}
   public void assertDefaultColumns() throws Exception {
		
		TestBotElementsWrapper
		                    .assertDefaultColumns(pageGenerator.ManageColumn_VendorPage().getAllColumns(), ExcelUtils.getRowDataWithSheetName(1, "Vendor_ManageColumn"));
	}  
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Deseelect a column and verify it in table view")
	@Story("Vendor Payments smoke test")
	public void TC_27_Remove_Column_Vendor_Test() throws Exception {
		
		boolean isColumnDisplayed=true;
		isColumnDisplayed =pageGenerator.ManageColumn_VendorPage()
		                                   .selectColumn()
		                                   .columnDisplayed();
		sa.assertFalse(isColumnDisplayed);
		sa.assertAll();
	}
	@Test(priority=2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select a column and verify it in table view")
	@Story("Vendor Payments smoke test")
	public void TC_26_Add_Column_Vendor_Test() throws Exception {
		
		boolean isColumnDisplayed=true;
		isColumnDisplayed =pageGenerator.ManageColumn_VendorPage()
		                                   .selectColumn()
		                                   .columnDisplayed();
		sa.assertTrue(isColumnDisplayed);
		sa.assertAll();
	}
	@Test(priority=3)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select all column and verify it in table view")
	@Story("Vendor sanity test")
	public void TC_28_SelectAll_Column_Vendor_Test() throws Exception {
		
		
		pageGenerator.ManageColumn_VendorPage()
		                                   .SelectAll();
		assertAllColumns();
		sa.assertAll();
	}
	@Test(priority=4)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select reset to default  and verify it in table view")
	@Story("Vendor sanity test")
	public void TC_29_ResetToDefault_Column_Vendor_Test() throws Exception {
		
		
		pageGenerator.ManageColumn_VendorPage()
		                                   .clickResetToDefault();
		assertDefaultColumns();
		sa.assertAll();
	}
}
*/