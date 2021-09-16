/*package testCases.VendorPaymentsTestCases.Vendor;

import org.testng.annotations.AfterMethod;
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
@Feature("Workflow")
public class VendorWorkflowTest extends TestBotBase{
	private SoftAssert sa = new SoftAssert();
	TestBotElementsWrapper pageWrapper;
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
	private void loginAsEmployeeForVerification() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_Approved(ContainerElements_VendorPage.containerOptions.VENDOR);	
	}
	private void loginAsEmployee() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                         .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         //.clickContainer(ContainerElements_VendorPage.containerOptions.VENDOR);		
                                         .gotoSavedOfMyDraft(ContainerElements_VendorPage.containerOptions.VENDOR);
	}
	private void closeActivePage() throws Exception {
		 pageGenerator.VendorDetailsPage().clickCross();		
	}
	@Test()
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Submiting vendor from employee account")
	@Story("Vendor Payments Smoke test")
	public void SubmitVendor_Test() throws Exception {
		loginAsEmployee();
		String expectedMessage =super.getProperty("VendorSubmissionToast");
		String actualMessage = 	pageGenerator.VendorDetailsPage()
                                             // .createVendor()
                                              .clickSubmit()
                                              .captureToastMessage();         
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(dependsOnMethods="SubmitVendor_Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Approving vendor from FLA")
	@Story("Vendor Smoke test")
	public void TC_03_ApproveAndPay_Vendor_Test() throws Exception {
		loginAsFLA();
		String expectedMessage =super.getProperty("VendorApproveToast");		
		String actualMessage = pageGenerator.VendorDetailsPage()
				                            .clickApproveAndPay()
				                            .captureToastMessage(); 
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(dependsOnMethods="TC_03_ApproveAndPay_Vendor_Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Register vendor from FLA")
	@Story("Vendor Payments Smoke test")
	public void TC_04_Register_Vendor_Test() throws Exception {
		loginAsFLA();
		String expectedMessage =super.getProperty("VendorApproveToast");		
		String actualMessage = pageGenerator.VendorDetailsPage()
				                            .clickRegister()
				                            .captureToastMessage(); 
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(dependsOnMethods="TC_04_Register_Vendor_Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Verify Register vendor from employee")
	@Story("Vendor Payments Smoke test")
	public void TC_05_Verify_Registered_Vendor_Test() throws Exception {
		loginAsEmployeeForVerification();
		String expectedMessage =super.getProperty("VendorStatus");
		String actualMessage = pageGenerator.VendorDetailsPage()
				                            .captureStatus();				                           
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
	 	sa.assertAll();
	}
}
*/