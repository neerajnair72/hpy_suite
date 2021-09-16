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
@Epic("Invoice Creation Tests")
@Feature("Create")
public class CreateInvoiceTest extends TestBotBase{
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
	public void saveInvoice() throws Exception {
	    pageGenerator.InvoiceInitialPage()
                                        .createInvoice();
	    closeActivePage();
	}
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Create Invoice by entering all fields")
	@Story("Vendor Payments smoke test")
	public void TC_01_Create_Invoice_Test() throws Exception {
		
		String expectedMessage = super.getProperty("InvoiceCreationToast");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
		                                   .createInvoice()	
				                           .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
	@Test(priority=2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Submit  Invoice after creation")
	@Story("Vendor Payments smoke test")
	public void TC_02_Submit_Invoice_Test() throws Exception {
		String expectedMessage = super.getProperty("InvoiceSubmissionToast");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
		                                   .createInvoice()
		                                   .clickSubmit()
				                           .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
		sa.assertAll();
	}
	@Test(priority=3)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify auto save feature of invoice creation")
	   @Story("Vendor Payments sanity test")
	   public void TC_17_AutoSaveCheck_Test() throws Exception {
		String expectedMessage = ExcelUtils.getCellDataWithSheetName(4, 3, "Invoice_Vendor");
		String actualMessage= pageGenerator.InvoiceInitialPage()
				                               .enterInvoiceDescription(ExcelUtils.getRowDataWithSheetName(4, "Invoice_Vendor"))
				                               .clickCross()
				                               .clickAutoSave()
				                               .clickEditInvoice()
				                               .clickProceed()
				                               .captureValue();		
		   sa.assertEquals(actualMessage, expectedMessage);
		   closeActivePage();
		   sa.assertAll();
	   }
	@Test(priority=4)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify change attachment of invoice attachment")
	   @Story("Vendor Payments sanity test")
	   public void TC_18_ChangeAttachment_Test() throws Exception {
		boolean isAttachmentChanged = false;
		isAttachmentChanged= pageGenerator.InvoiceInitialPage()
				                               .uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"))
				                               .changeAttachment()
				                               .isCanvasDisplayed();
		   sa.assertTrue(isAttachmentChanged);
		   closeActivePage();
		   sa.assertAll();
	   }
	@Test(priority=5)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify delete invoice draft at change attachment screen")
	   @Story("Vendor Payments sanity test")
	   public void TC_19_DeleteDraft_Test() throws Exception {
		String expectedMessage = super.getProperty("InvoiceDeleteToast"); 
		String actualMessage= pageGenerator.InvoiceInitialPage()
				                               .uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"))
				                               .deleteInvoiceDraft()				                              
				                               .captureToastMessage();	
		   sa.assertEquals(actualMessage, expectedMessage);
		   sa.assertAll();
	   }
	@Test(priority=6)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify delete invoice draft at invoice details screen")
	   @Story("Vendor Payments sanity test")
	   public void TC_20_DeleteDraft_InvoiceDetailsScreen_Test() throws Exception {
		String expectedMessage = super.getProperty("InvoiceDeleteToast"); 
		String actualMessage= pageGenerator.InvoiceInitialPage()
				                               .uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"))
				                               .deleteInvoice()				                              
				                               .captureToastMessage();	
		   sa.assertEquals(actualMessage, expectedMessage);
		   sa.assertAll();
	   }
	@Test(priority=7)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Test to verify delete invoice draft at saved state")
	@Story("Vendor Payments smoke test")
	public void TC_21_Delete_Saved_Invoice_Test() throws Exception {
		saveInvoice();
		String expectedMessage = super.getProperty("InvoiceWithCollectionDeleteToast");   
		String actualMessage =pageGenerator.InvoiceInitialPage()
		                                   .clickView()	
		                                   .deleteInvoice()
				                           .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
		//closeActivePage();
		sa.assertAll();
	}
	@Test(priority=8)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify mandatory check for invoice attachment")
	   @Story("Vendor Payments sanity test")
	   public void TC_22_MandatoryCheckFor_InvoiceAttachment_Test() throws Exception {
		boolean isMandatoryDisplayd = false;
		isMandatoryDisplayd= pageGenerator.InvoiceInitialPage()
				                           .clickProceed()
				                           .isMandatoryDivDisplayed();
		sa.assertTrue(isMandatoryDisplayd);
		closeActivePage();
		sa.assertAll();
	   }
	@Test(priority=9)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify mandatory check for invoice details screen")
	   @Story("Vendor Payments sanity test")
	   public void TC_23_MandatoryCheckFor_InvoiceDetails_Test() throws Exception {
		boolean isMandatory = false;
		isMandatory= pageGenerator.InvoiceInitialPage()
				                   .uploadInvoice(ExcelUtils.getRowDataWithSheetName(4, "Invoice_Vendor"))
				                   .clickSave()
				                    .mandantotyCheck();
	     sa.assertTrue(isMandatory);
		 closeActivePage();
		 sa.assertAll();
	   }
	 @Test(priority=10)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify deafult value of a field of invoice creation")
	   @Story("Vendor Payments sanity test")
	   public void TC_24_DefaultValueCheck_Test() throws Exception {
		   boolean isDefault=false;
		   isDefault=pageGenerator.InvoiceInitialPage()
				                  .uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"))
				                  .defaultCheck();
		   
		   sa.assertTrue(isDefault);
		   closeActivePage();
		   sa.assertAll();              	  
	   }
	 @Test(priority=11)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify dependent value of a field of invoice creation")
	   @Story("Vendor Payments sanity test")
	   public void TC_25_DependentFieldCheck_Test() throws Exception {
		   boolean isDependent=false;
		   isDependent=pageGenerator.InvoiceInitialPage()
	                                 .uploadInvoice(ExcelUtils.getRowDataWithSheetName(1, "Invoice_Vendor"))
				                    .isDependentFieldDisplayed();
		   sa.assertTrue(isDependent);
		   closeActivePage();
		   sa.assertAll();              	   
	   }
	 @Test(priority=12)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Test to verify calculated field of invoice creation")
		@Story("Vendor Payments smoke test")
		public void TC_26_CalculatedFieldCheck_Invoice_Test() throws Exception {
			
			String expectedMessage = super.getProperty("CalculatedFieldValue");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .evaluateCalculatedField()	
					                           .captureCalculatedFieldValue();
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			sa.assertAll();
		}
}
*/