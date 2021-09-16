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
@Epic("Invoice Creation Tests")
@Feature("Workflow")
public class InvoiceWorflowTest extends TestBotBase{
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
	private void loginAsEmployeeForVerification() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                        .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .gotoMySubmimmison_Approved(ContainerElements_VendorPage.containerOptions.INVOICE);	
	}
	private void loginAsEmployee() throws Exception {
		pageGenerator.Login_VendorPage().get()
                                         .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
                                         .clickContainer(ContainerElements_VendorPage.containerOptions.INVOICE);		
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.InvoiceInitialPage().clickCross();		
	}
	@Test()
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Submit  Invoice after creation")
		@Story("Vendor Payments Smoke test")
		public void Submit_Invoice_Test() throws Exception {
		    loginAsEmployee();
			String expectedMessage = super.getProperty("InvoiceSubmissionToast");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .createInvoice()
			                                   .clickSubmit()
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			sa.assertAll();
		}
	 @Test(dependsOnMethods="Submit_Invoice_Test")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Approving Invoice from FLA")
		@Story("Vendor Payments Smoke test")
		public void TC_03_Approve_InvoicefromFLA_lessThan100000_Test() throws Exception {
			loginAsFLA();
			String expectedMessage =super.getProperty("InvoiceApproveToast");		
			String actualMessage = pageGenerator.InvoiceInitialPage()
					                            .clickApprove()
					                            .captureToastMessage(); 
			sa.assertEquals(actualMessage, expectedMessage);
		 	sa.assertAll();
		}
	    @Test(dependsOnMethods="TC_03_Approve_InvoicefromFLA_lessThan100000_Test")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Approving Invoice from FLA2")
		@Story("Vendor Payments Smoke test")
		public void TC_04_Approve_InvoiceFromFLA2_lessThan100000_Test() throws Exception {
			loginAsFLA2();
			String expectedMessage =super.getProperty("InvoiceApproveToast");		
			String actualMessage = pageGenerator.InvoiceInitialPage()
					                            .clickApprove()
					                            .captureToastMessage(); 
			sa.assertEquals(actualMessage, expectedMessage);
		 	sa.assertAll();
		}
	 @Test(dependsOnMethods="TC_04_Approve_InvoiceFromFLA2_lessThan100000_Test")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Verify Verified Invoice from employee")
		@Story("Vendor Payments Smoke test")
		public void TC_07_Verify_Verified_Invoice_Test() throws Exception {
			loginAsEmployeeForVerification();
			String expectedMessage =super.getProperty("InvoiceStatus");
			String actualMessage = pageGenerator.InvoiceInitialPage()
					                            .captureStatus();				                           
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
		 	sa.assertAll();
		}
	 @Test(dependsOnMethods="TC_07_Verify_Verified_Invoice_Test")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Submit  Invoice after creation")
		@Story("Vendor Payments Smoke test")
		public void Submit_Invoice_MoreThan1000000_Test() throws Exception {
		    loginAsEmployee();
			String expectedMessage = super.getProperty("InvoiceSubmissionToast");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .createInvoiceMoreThan100000()
			                                   .clickSubmit()
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			sa.assertAll();
		}
	 @Test(dependsOnMethods="Submit_Invoice_MoreThan1000000_Test")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Approving Invoice from FLA")
		@Story("Vendor Payments Smoke test")
		public void TC_05_Approve_InvoicefromFLA_MoreThan100000_Test() throws Exception {
			loginAsFLA();
			String expectedMessage =super.getProperty("InvoiceApproveToast");		
			String actualMessage = pageGenerator.InvoiceInitialPage()
					                            .clickApprove()
					                            .captureToastMessage(); 
			sa.assertEquals(actualMessage, expectedMessage);
		 	sa.assertAll();
		}
	 @Test(dependsOnMethods="TC_05_Approve_InvoicefromFLA_MoreThan100000_Test")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Approving Invoice from SLA")
		@Story("Vendor Payments Smoke test")
		public void TC_06_Approve_InvoicefromSLA_Test() throws Exception {
			loginAsSLA();
			String expectedMessage =super.getProperty("InvoiceApproveToast");		
			String actualMessage = pageGenerator.InvoiceInitialPage()
					                            .clickApprove()
					                            .captureToastMessage(); 
			sa.assertEquals(actualMessage, expectedMessage);
		 	sa.assertAll();
		}
	 @Test(dependsOnMethods="TC_06_Approve_InvoicefromSLA_Test")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Verify Verified Invoice from employee")
		@Story("Vendor Payments Smoke test")
		public void TC_066_Verify_Verified_Invoice_Test() throws Exception {
			loginAsEmployeeForVerification();
			String expectedMessage =super.getProperty("InvoiceStatus");
			String actualMessage = pageGenerator.InvoiceInitialPage()
					                            .captureStatus();				                           
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
		 	sa.assertAll();
		}
}
*/