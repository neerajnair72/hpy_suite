/*package testCases.VendorPaymentsTestCases.Invoice;

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
@Epic("Invoice Workflow Tests")
@Feature("Workflow Settings")
public class InvoiceInitialWorkflowTest extends TestBotBase{
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
                                         .goToPendingForApprovalContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	
	}
	private void loginAsFLA2() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                         .login(ExcelUtils.getRowDataWithSheetName(3, "Login_Vendor"))
                                         .goToPendingForApprovalContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	
	}
	private void loginAsSLA() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                         .login(ExcelUtils.getRowDataWithSheetName(4, "Login_Vendor"))
                                         .goToPendingForApprovalContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	
	}
	private void loginAsEmployee() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                         .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoSavedOfMyDraft(ContainerElements_VendorPage.containerOptions.INVOICE);		
	}
	private void loginAsEmployeeForRecall() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_PendingApproval(ContainerElements_VendorPage.containerOptions.INVOICE);
	}
	private void loginAsEmployeeForResubmitl() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_Rejected(ContainerElements_VendorPage.containerOptions.INVOICE);	
	}
	public void submitInvoiceLessThan100000() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .clickContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	
		pageGenerator.InvoiceInitialPage()
                                         .createInvoice()
                                         .clickSubmit();
		pageGenerator.PageElements_VendorPage().get()
                                         .logout();
	}
	public void submitInvoiceMoreThan100000() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .clickContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	
		pageGenerator.InvoiceInitialPage()
                                         .createInvoiceMoreThan100000()
                                         .clickSubmit();
		pageGenerator.PageElements_VendorPage().get()
                                        .logout();
	}
	public void approveInvoiceFromFLA() throws Exception {
		loginAsFLA();
	    pageGenerator.InvoiceInitialPage()
				                         .clickApprove();
	    pageGenerator.PageElements_VendorPage().get()
                                         .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.InvoiceInitialPage()
		                                .clickCross();		
	}
	
	@Test(priority=1)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Declining Invoice from FLA account")
	@Story("Vendor Payments Smoke test")
	public void TC_08_Decline_Invoice_FromFla_Test() throws Exception {
		submitInvoiceLessThan100000();
		loginAsFLA();
		String expectedMessage =super.getProperty("InvoiceApproveToast");
		String actualMessage = pageGenerator.InvoiceInitialPage()
				                            .clickDecline()
				                            .captureToastMessage(); 
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=2)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Declining Invoice from SLA account")
	@Story("Vendor Payments Smoke test")
	public void TC_09_Decline_Invoice_FromFla2_Test() throws Exception {
		submitInvoiceMoreThan100000();
		approveInvoiceFromFLA();
		loginAsSLA();
		String expectedMessage =super.getProperty("InvoiceApproveToast");
		String actualMessage = pageGenerator.InvoiceInitialPage()
				                            .clickDecline()
				                            .captureToastMessage(); 
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=3 )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Declining Invoice from FLA2 account")
	@Story("Vendor Payments Smoke test")
	public void TC_10_Decline_Invoice_FromSLA_Test() throws Exception {
		submitInvoiceLessThan100000();// test case 
		approveInvoiceFromFLA();
		loginAsFLA2();
		String expectedMessage =super.getProperty("InvoiceApproveToast");
		String actualMessage = pageGenerator.InvoiceInitialPage()
				                            .clickDecline()
				                            .captureToastMessage(); 
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=4)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Recalling  Invoice from employee account")
	@Story("Vendor Payments Smoke test")
	public void TC_11_Recall_Invoice_Test() throws Exception {
		submitInvoiceLessThan100000();
		loginAsEmployeeForRecall();
		String expectedMessage =super.getProperty("RecallToast");		
		String actualMessage = pageGenerator.InvoiceInitialPage()
				                            .clickRecall()
				                            .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=5)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Resubmitting recalled invoice from employee account")
	@Story("Vendor Payments Smoke test")
	public void TC_12_Resubmit_Recall_Invoice_Test() throws Exception {
		loginAsEmployee();
		String expectedMessage =super.getProperty("InvoiceSubmissionToast");
		String actualMessage = pageGenerator.InvoiceInitialPage()				           
				                             .clickSubmit()
				                             .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=6)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Resubmitting declined  Vendor from employee account")
	@Story("Vendor Payments Smoke test")
	public void TC_13_Resubmit_Declined_Invoice_Test() throws Exception {
		submitInvoiceLessThan100000();
		loginAsEmployeeForResubmitl();
		String expectedMessage =super.getProperty("InvoiceApproveToast");
		String actualMessage = pageGenerator.InvoiceInitialPage()
				                             .clickResubmit()
				                             .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
	@Test(priority=7)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Edit vendor details from FLA account")
	@Story("Vendor Payments Smoke test")
	public void TC_16_Edit_Vendor_FLA_Test() throws Exception {
	    submitInvoiceLessThan100000();
		loginAsFLA();
		String expectedMessage =super.getProperty("InvoiceUpdateToast");
		String actualMessage = pageGenerator.InvoiceInitialPage()
				                            .clickEditInvoice()
				                            .clearAll()
				                            .updateInvoice()
				                            .captureToastMessage();		
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
		
	}
}
*/