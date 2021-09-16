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
@Epic("Invoice Update Tests")
@Feature("Update")
public class EditInvoiceTest extends TestBotBase{
	SoftAssert sa ;
    TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .gotoEditSavedOfMyDraft(ContainerElements_VendorPage.containerOptions.INVOICE);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.InvoiceInitialPage()
		                                 .clickCross();		
	}
	@Test(priority=1)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Update Invoice after saving it from employee account")
		@Story("Vendor Payments smoke test")
		public void TC_14_Edit_Invoice_Test() throws Exception {
			
			String expectedMessage = super.getProperty("InvoiceUpdateToast");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .changeAttachment()
			                                   .clearAll()
			                                   .updateInvoice()
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			sa.assertAll();
		}
	  @Test(priority=2)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify mandatory check for invoice details screen")
	   @Story("Vendor Payments sanity test")
	   public void TC_27_MandatoryCheckFor_InvoiceDetails_Test() throws Exception {
		boolean isMandatory = false;
		isMandatory= pageGenerator.InvoiceInitialPage()
				                    .clearAll()
				                    .clickSave()
				                    .mandantotyCheck();
	     sa.assertTrue(isMandatory);
		 closeActivePage();
		 sa.assertAll();
	   }
	 @Test(priority=3)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify deafult value of a field of invoice creation")
	   @Story("Vendor Payments sanity test")
	   public void TC_28_DefaultValueCheck_Test() throws Exception {
		   boolean isDefault=false;
		   isDefault=pageGenerator.InvoiceInitialPage()
				                  .defaultCheck();
		   
		   sa.assertTrue(isDefault);
		   closeActivePage();
		   sa.assertAll();              	  
	   }
	 @Test(priority=4)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify dependent value of a field of invoice creation")
	   @Story("Vendor Payments sanity test")
	   public void TC_29_DependentFieldCheck_Test() throws Exception {
		   boolean isDependent=false;
		   isDependent=pageGenerator.InvoiceInitialPage()
				                    .isDependentFieldDisplayed();
		   sa.assertTrue(isDependent);
		   closeActivePage();
		   sa.assertAll();              	   
	   }
}
*/