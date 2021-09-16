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
@Epic("Vendor Uodate Tests")
@Feature("Workflow Settings")
public class VendorInitialWorkflowTest extends TestBotBase{
	private SoftAssert sa = new SoftAssert();
	TestBotElementsWrapper pageWrapper;
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                        .clickContainer(ContainerElements_VendorPage.containerOptions.VENDOR);
		pageGenerator.VendorInitialPage()
                                        .createVendor()
                                        .clickSubmit();
		pageGenerator.PageElements_VendorPage().get()
                                        .logout();
	}
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	private void loginAsFLA() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                         .login(ExcelUtils.getRowDataWithSheetName(2, "Login_Vendor"))
                                         .goToPendingForApprovalContainer(ContainerElements_VendorPage.containerOptions.VENDOR);	
	}
	private void loginAsEmployeeForRecall() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_PendingApproval(ContainerElements_VendorPage.containerOptions.VENDOR);	
	}
	private void loginAsEmployeeForResubmitl() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_Rejected(ContainerElements_VendorPage.containerOptions.VENDOR);	
	}
	private void approveVendor() throws Exception {
		pageGenerator.VendorDetailsPage()
                                        .clickApproveAndPay();
        
	}
    private void closeActivePage() throws Exception {
		 pageGenerator.VendorDetailsPage().clickCross();		
	}
	@Test(priority=1)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Declining Vendor from FLA account")
	@Story("Vendor Smoke test")
	public void TC_06_Decline_Vendor_Test() throws Exception {
		loginAsFLA();
		String expectedMessage =super.getProperty("VendorApproveToast");
		String actualMessage = pageGenerator.VendorDetailsPage()
				                            .clickDecline()
				                            .captureToastMessage(); 
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=2)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Declining Vendor from FLA account")
	@Story("Vendor Smoke test")
	public void TC_07_Decline_Vendor_2ndLevel_Test() throws Exception {
		loginAsFLA();
		approveVendor();
		String expectedMessage =super.getProperty("VendorApproveToast");				
		String actualMessage = pageGenerator.VendorDetailsPage()
                                           .clickDecline()
                                           .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=3)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Recalling  Vendor from employee account")
	@Story("Vendor Smoke test")
	public void TC_09_Recall_Vendor_Test() throws Exception {
		loginAsEmployeeForRecall();
		String expectedMessage =super.getProperty("RecallToast");		
		String actualMessage = pageGenerator.VendorDetailsPage()
				                            .clickRecall()
				                            .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=4)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Resubmitting declined  Vendor from employee account")
	@Story("Vendor Smoke test")
	public void TC_10_Resubmit_Vendor_Test() throws Exception {
		loginAsEmployeeForResubmitl();
		String expectedMessage =super.getProperty("VendorApproveToast");
		String actualMessage = pageGenerator.VendorDetailsPage()
				                             .clickResubmit()
				                             .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=5)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Edit vendor details from FLA account")
	@Story("Vendor Smoke test")
	public void TC_08_Edit_Vendor_FLA_Test() throws Exception {
		loginAsFLA();
		String expectedMessage =super.getProperty("VendorUpdateToast");
		String actualMessage = pageGenerator.VendorDetailsPage()
				                            .clickEditVendor()
				                            .clearAll()
				                            .updateVendor()
				                            .captureToastMessage();		
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
		
	}
}
*/