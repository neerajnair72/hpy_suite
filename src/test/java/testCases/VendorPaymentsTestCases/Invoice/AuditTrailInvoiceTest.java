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
@Epic("Invoice Audit Trail Tests")
@Feature("Invoice")
public class AuditTrailInvoiceTest extends TestBotBase{
	 SoftAssert sa = new SoftAssert();
     TestBotElementsWrapper pageWrapper;
     @AfterMethod
 	public void testsetupafter() throws Exception {

 		pageGenerator.PageElements_VendorPage().get()
 		                                    .logout();
 	}
 	 private void closeActivePage() throws Exception {
 		 pageGenerator.InvoiceInitialPage().clickCross();		
 	}
 	 public void loginAsEmployee() throws Exception {
 		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .clickContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	
 	 }
 	 public void loginAsEmployeeForEdit() throws Exception {
 		pageGenerator.Login_VendorPage().get()
                                          .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                          .gotoEditSavedOfMyDraft(ContainerElements_VendorPage.containerOptions.INVOICE); 	
 	 }
 	 public void loginAsEmployeeForDecline() throws Exception {
  		pageGenerator.Login_VendorPage().get()
                                           .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                           .gotoMySubmimmison_Rejected(ContainerElements_VendorPage.containerOptions.INVOICE); 	
  	 }
 	 public void loginAsEmployeeForSubmit() throws Exception {
 		loginAsEmployee();
 		pageGenerator.InvoiceInitialPage()
                                        .createInvoice()	
                                        .clickSubmit();
 		pageGenerator.ContainerElements_VendorPage()
 		                                .gotoMySubmimmison_PendingApprovalForAudit(ContainerElements_VendorPage.containerOptions.INVOICE);
  	 }
 	 public void approveInvoiceByFLA() throws Exception {
 		pageGenerator.Login_VendorPage().get()
                                       .login(ExcelUtils.getRowDataWithSheetName(2, "Login_Vendor"))
                                        .goToPendingForApprovalContainer(ContainerElements_VendorPage.containerOptions.INVOICE);	 
 		 pageGenerator.InvoiceInitialPage()
                                        .clickApprove();
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
 	private void loginAsEmployeeForRecall() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_PendingApproval(ContainerElements_VendorPage.containerOptions.INVOICE);
		pageGenerator.InvoiceInitialPage()
                                        .clickRecall();
			
	}
 	private void ResubmitInvoice() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_Rejected(ContainerElements_VendorPage.containerOptions.INVOICE);	
		pageGenerator.InvoiceInitialPage()
                                         .clickResubmit();
		pageGenerator.PageElements_VendorPage().get()
                                         .logout();
	}
 	public void refresh() {
 		driver.navigate().refresh();
 	}

	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after creating an invoice")
	@Story("Vendor smoke test")
	public void TC_30_AuditTrailAfter_Invoice_Create_Test() throws Exception {
 		loginAsEmployee();
		String expectedMessage = super.getProperty("InvoiceCreateAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
		                                   .createInvoice()	
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
	 @Test(priority=2)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-est to verify audit trail after editing an invoice")
		@Story("Vendor smoke test")
		public void TC_31_AuditTrailAfter_Invoice_Edit_Test() throws Exception {
 		    loginAsEmployeeForEdit();
			String expectedMessage = super.getProperty("InvoiceEditAuditTrail");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .changeAttachment()
			                                   .clearAll()
			                                   .updateInvoice()
					                           .captureLastAction();
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			sa.assertAll();
		}
 	@Test(priority=3)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after submitting an invoice")
	@Story("Vendor smoke test")
	public void TC_33_AuditTrailAfter_Invoice_Submit_Test() throws Exception {
 		loginAsEmployeeForSubmit();
		String expectedMessage = super.getProperty("InvoiceSubmitAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
 	@Test(priority=4)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after approving  an invoice")
	@Story("Vendor smoke test")
	public void TC_34_AuditTrailAfter_Invoice_Approve_Test() throws Exception {
 		approveInvoiceByFLA();
 		loginAsFLA2();
 		String expectedMessage = super.getProperty("InvoiceApproveAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
 	@Test(priority=5)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after recalling  an invoice")
	@Story("Vendor smoke test")
	public void TC_35_AuditTrailAfter_Invoice_Recall_Test() throws Exception {
 		loginAsEmployeeForRecall();
 		refresh();
 		String expectedMessage = super.getProperty("InvoiceRecalltAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
 		@Test(priority=6)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after editing  an invoice from FLA")
	@Story("Vendor smoke test")
	public void TC_36_AuditTrailAfter_Invoice_EditFromFLA_Test() throws Exception {
 		loginAsFLA();
 		String expectedMessage = super.getProperty("InvoiceEditByFLAAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
				                           .clickEditInvoice()
                                           .clearAll()
                                           .updateInvoice()
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
 	@Test(priority=7)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after declining  an invoice from FLA")
	@Story("Vendor smoke test")
	public void TC_37_AuditTrailAfter_Invoice_DeclinedFromFLA_Test() throws Exception {
 		approveInvoiceByFLA();
 		loginAsEmployeeForDecline();
 		String expectedMessage = super.getProperty("InvoiceDeclinedByFLAAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
	@Test(priority=8)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify audit trail after resubmitting declined  an invoice")
	@Story("Vendor smoke test")
	public void TC_38_AuditTrailAfter_Invoice_Resubmit_Test() throws Exception {
		ResubmitInvoice();
 		loginAsFLA();
 		String expectedMessage = super.getProperty("InvoiceResubmitAuditTrail");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
				                           .captureLastAction();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
}
*/