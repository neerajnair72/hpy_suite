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
@Epic("Invoice EF Tests")
@Feature("ef")
public class InvoiceEFTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .clickContainer(ContainerElements_VendorPage.containerOptions.INVOICE);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.InvoiceInitialPage().clickCross();		
	}
	 private void createInvoice() throws Exception {
		 pageGenerator.InvoiceInitialPage()
                                         .createInvoice();
	 }
	 private void clickEditInvoice() throws Exception {
		 pageGenerator.InvoiceInitialPage()
		                                  .clickEditInvoice();
	 }
	 @Test(priority=1)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify mandatory check for extra field")
	   @Story("Vendor Payments sanity test")
	   public void TC_01_MandatoryCheckFor_InvoiceDetails_Test() throws Exception {
		boolean isMandatory = false;
		isMandatory= pageGenerator.InvoiceInitialPage()
				                   .uploadInvoice(ExcelUtils.getRowDataWithSheetName(4, "Invoice_Vendor"))
				                   .clickSave()
				                    .mandantotyCheck();
	     sa.assertTrue(isMandatory);
		 closeActivePage();
		 sa.assertAll();
	   }
	 @Test(priority=2)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify deafult value of an extra field")
	   @Story("Vendor Payments sanity test")
	   public void TC_02_DefaultValueCheck_Test() throws Exception {
		   boolean isDefault=false;
		   isDefault=pageGenerator.InvoiceInitialPage()
				                  .uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"))
				                  .defaultCheck();
		   
		   sa.assertTrue(isDefault);
		   closeActivePage();
		   sa.assertAll();              	  
	   }
	 @Test(priority=3)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Test to verify multiple edit feature of extra field")
		@Story("Vendor Payments smoke test")
		public void TC_03_MultiEdit_Invoice_Test() throws Exception {
		    createInvoice();
		    clickEditInvoice();
			String expectedMessage = super.getProperty("InvoiceUpdateToast");   
			String actualMessage =pageGenerator.InvoiceInitialPage()			                                   
			                                   .clearAll()
			                                   .updateInvoice()
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			sa.assertAll();
		}
	 @Test(priority=4)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Test to verify non multiple edit field behavior")
		@Story("Vendor Payments smoke test")
		public void TC_04_MultiEditNotAllowed_Invoice_Test() throws Exception {
		    createInvoice();
		    clickEditInvoice();
			String expectedMessage = super.getProperty("NonMultiEditToast");   
			String actualMessage =pageGenerator.InvoiceInitialPage()			                                   
			                                   .multieditField()
			                                   .clickSave()
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			sa.assertAll();
		}
	 @Test(priority=5)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify summary field")
	   @Story("Vendor Payments sanity test")
	   public void TC_05_VerifySummaryField_Invoice_Test() throws Exception {
		 String expectedMessage = super.getProperty("SummaryFieldName"); 
		 String actualMessage= pageGenerator.InvoiceInitialPage()
				                   .uploadInvoice(ExcelUtils.getRowDataWithSheetName(4, "Invoice_Vendor"))
				                   .getSummaryField();
		 sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
		 sa.assertAll();
	   }
}
*/