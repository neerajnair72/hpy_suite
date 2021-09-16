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
@Epic("Invoice Mamage Column Tests")
@Feature("Manage Column")
public class InvoiceColumnManagementTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .gotoManageColumn(ContainerElements_VendorPage.containerOptions.INVOICE);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
}
	public void assertAllColumns() throws Exception {
		
		TestBotElementsWrapper
		                    .assertAllColumns(pageGenerator.ManageColumn_VendorPage().getAllColumns(), ExcelUtils.getRowDataWithSheetName(2, "Vendor_ManageColumn"));
	}
   public void assertDefaultColumns() throws Exception {
		
		TestBotElementsWrapper
		                    .assertDefaultColumns(pageGenerator.ManageColumn_VendorPage().getAllColumns(), ExcelUtils.getRowDataWithSheetName(3, "Vendor_ManageColumn"));
	}  
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Deseelect a column and verify it in table view")
	@Story("Vendor Payments smoke test")
	public void TC_40_Remove_Column_Invoice_Test() throws Exception {
		
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
	public void TC_39_Add_Column_Invoice_Test() throws Exception {		
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
	@Story("Vendor Payments sanity test")
	public void TC_42_SelectAll_Column_Vendor_Test() throws Exception {				
		pageGenerator.ManageColumn_VendorPage()
		                                   .SelectAll();
		assertAllColumns();
		sa.assertAll();
	}
	@Test(priority=4)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select reset to default  and verify it in table view")
	@Story("Vendor Payments sanity test")
	public void TC_43_RemoveAll_Column_Invoice_Test() throws Exception {				
		pageGenerator.ManageColumn_VendorPage()
		                                    .removeAll();		                                   
		sa.assertAll();
	}
	@Test(priority=5)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Select reset to default  and verify it in table view")
	@Story("Vendor Payments sanity test")
	public void TC_41_ResetToDefault_Column_Invoice_Test() throws Exception {				
		pageGenerator.ManageColumn_VendorPage()
		                                   .clickResetToDefault();
		assertDefaultColumns();
		sa.assertAll();
	}
}
*/